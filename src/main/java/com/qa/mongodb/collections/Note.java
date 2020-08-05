package com.qa.mongodb.collections;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Notes")
public class Note {

    private Long noteId;
    private String title;
    private String body;

    public Note() {
    }

    public Note(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Note(Long noteId, String title, String body) {
        this.noteId = noteId;
        this.title = title;
        this.body = body;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
