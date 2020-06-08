package oop;

import com.google.gson.Gson;

public class Content {
    private int content_id;
    private String content_name;
    private String content_type;

    public Content() {
    }

    public Content(int content_id, String content_name, String content_type) {
        this.content_id = content_id;
        this.content_name = content_name;
        this.content_type = content_type;
    }

    public int getContent_id() {
        return content_id;
    }

    public void setContent_id(int content_id) {
        this.content_id = content_id;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public String getContent_name() {
        return content_name;
    }

    public void setContent_name(String content_name) {
        this.content_name = content_name;
    }

//    public static void main(String[] args) {
//        Content content= new Content(1,"AA","B");
//        Gson json= new Gson();
//        String kq=json.toJson(content);
//        System.out.println(kq);
//    }
}
