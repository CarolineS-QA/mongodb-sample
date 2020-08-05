package com.qa.mongodb.service;

import com.qa.mongodb.collections.Note;
import com.qa.mongodb.repo.NotesRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesService {

    private final NotesRepo notesRepo;
    
    public NotesService(NotesRepo notesRepo) {
        this.notesRepo = notesRepo;
    }

    public Note createNote(Note note) {
    return this.notesRepo.save(note);
    }

    public List<Note> readAllNotes() {
    return this.notesRepo.findAll();
    }

//    public Note findNoteById(){}
//    public Note updateNote(){}
//    public boolean deleteNote(){}


}
