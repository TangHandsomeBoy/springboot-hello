package com.itcast.pojo;

public class Demo {
    private Integer id;
    private String sex;
    private String like;

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", sex='" + sex + '\'' +
                ", like='" + like + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
