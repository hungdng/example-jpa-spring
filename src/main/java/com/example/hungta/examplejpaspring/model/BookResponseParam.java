package com.example.hungta.examplejpaspring.model;

public class BookResponseParam {
    private String id;
    private String name;
    private String authorName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    public static final class BookResponseParamBuilder {
        private String id;
        private String name;
        private String authorName;

        private BookResponseParamBuilder() {
        }

        public static BookResponseParamBuilder aBookResponseParam() {
            return new BookResponseParamBuilder();
        }

        public BookResponseParamBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public BookResponseParamBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public BookResponseParamBuilder withAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public BookResponseParam build() {
            BookResponseParam bookResponseParam = new BookResponseParam();
            bookResponseParam.setId(id);
            bookResponseParam.setName(name);
            bookResponseParam.setAuthorName(authorName);
            return bookResponseParam;
        }
    }
}
