package com.minfrank.ai_luna_spring.dto.res;

import java.util.List;

public class RES_T001 {
    private String type;
    private List<RES_DATA_T001> list;

    // Constructors
    public RES_T001(String type, List<RES_DATA_T001> list) {
        this.type = type;
        this.list = list;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<RES_DATA_T001> getList() {
        return list;
    }

    public void setList(List<RES_DATA_T001> list) {
        this.list = list;
    }

    //list data
    public static class RES_DATA_T001 {
        private String title;
        private String star;
        private String view;
        private String imageUrl;

        // Constructors
        public RES_DATA_T001(String title, String star, String view, String imageUrl) {
            this.title = title;
            this.star = star;
            this.view = view;
            this.imageUrl = imageUrl;
        }

        // Getters and Setters
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getStar() {
            return star;
        }

        public void setStar(String star) {
            this.star = star;
        }

        public String getView() {
            return view;
        }

        public void setView(String view) {
            this.view = view;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    }

}
