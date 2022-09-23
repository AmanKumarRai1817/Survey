package com.example.survey;

public class User {
    private String name, profession, email, password;

    public User(String name, String profession, String email, String password) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class Dashbordmodel {

        int postimage,userimage;
        String username,userabout,like,comment,unlike;

        public Dashbordmodel(int postimage, int userimage, String username, String userabout, String like, String comment, String unlike) {
            this.postimage = postimage;
            this.userimage = userimage;
            this.username = username;
            this.userabout = userabout;
            this.like = like;
            this.comment = comment;
            this.unlike = unlike;
        }

        public int getPostimage() {
            return postimage;
        }

        public void setPostimage(int postimage) {
            this.postimage = postimage;
        }

        public int getUserimage() {
            return userimage;
        }

        public void setUserimage(int userimage) {
            this.userimage = userimage;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getUserabout() {
            return userabout;
        }

        public void setUserabout(String userabout) {
            this.userabout = userabout;
        }

        public String getLike() {
            return like;
        }

        public void setLike(String like) {
            this.like = like;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getUnlike() {
            return unlike;
        }

        public void setUnlike(String unlike) {
            this.unlike = unlike;
        }
    }
}
