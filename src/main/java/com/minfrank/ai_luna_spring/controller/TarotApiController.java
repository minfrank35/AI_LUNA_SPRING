package com.minfrank.ai_luna_spring.controller;


import com.minfrank.ai_luna_spring.dto.res.RES_T001;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tarot")
public class TarotApiController {

    @GetMapping("/list/{type}")
    public ResponseEntity<RES_T001> getTarotList(@PathVariable String type) {
        List<RES_T001.RES_DATA_T001> tarotList = new ArrayList<>();

        // Example data for each type
        if (type.equals("popular")) {
            tarotList.add(new RES_T001.RES_DATA_T001("2025년 신년 인기운", "4.8", "15000", "popular1.png"));
            tarotList.add(new RES_T001.RES_DATA_T001("2025년 인기 사랑운", "4.7", "12000", "popular2.png"));
        } else if (type.equals("money")) {
            tarotList.add(new RES_T001.RES_DATA_T001("2025년 신년 재물운", "4.6", "10000", "money1.png"));
            tarotList.add(new RES_T001.RES_DATA_T001("2025년 부자되기 운", "4.5", "8000", "money2.png"));
        } else if (type.equals("couple")) {
            tarotList.add(new RES_T001.RES_DATA_T001("2025년 커플 사랑운", "4.9", "20000", "couple1.png"));
            tarotList.add(new RES_T001.RES_DATA_T001("2025년 커플 금전운", "4.3", "9000", "couple2.png"));
        } else {
            // Return a 400 Bad Request if the type is invalid
            return ResponseEntity.badRequest().build();
        }

        // Create response DTO
        RES_T001 response = new RES_T001(type, tarotList);

        // Return response with 200 OK status
        return ResponseEntity.ok(response);
    }
}
