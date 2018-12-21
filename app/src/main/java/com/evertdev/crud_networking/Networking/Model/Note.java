package com.evertdev.crud_networking.Networking.Model;

import com.evertdev.crud_networking.Networking.Model.BaseResponse;

public class Note extends BaseResponse {
    int id;
    String note;
    String timestamp;

    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
