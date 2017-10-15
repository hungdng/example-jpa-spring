package com.example.hungta.examplejpaspring.model;

public class BookRequestParam {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static final class BookRequestParamBuilder {
        private Long id;
        private String name;

        private BookRequestParamBuilder() {
        }

        public static BookRequestParamBuilder aBookRequestParam() {
            return new BookRequestParamBuilder();
        }

        public BookRequestParamBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public BookRequestParamBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public BookRequestParam build() {
            BookRequestParam bookRequestParam = new BookRequestParam();
            bookRequestParam.setId(id);
            bookRequestParam.setName(name);
            return bookRequestParam;
        }
    }
}
