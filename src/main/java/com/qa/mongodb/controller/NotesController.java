package com.qa.mongodb.controller;

import com.qa.mongodb.collections.Note;
import com.qa.mongodb.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NotesController {

    private final NotesService service;

    @Autowired
    public NotesController(NotesService service) {
        this.service = service;
    }

    @PostMapping("/addNote")
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
        return new ResponseEntity<>(this.service.createNote(note), HttpStatus.CREATED);
    }

    @GetMapping("/findAllNotes")
    public ResponseEntity<List<Note>> getAllNotes() {
        return ResponseEntity.ok(this.service.readAllNotes());
    }

//    @GetMapping("/findNote/{id}")
//    public ResponseEntity<Note> getNoteById(@PathVariable Long id) {
//        return ResponseEntity.ok(this.service.findNoteById(id));
//    }
//
//    @PutMapping("/updateNote/{id}")
//    public ResponseEntity<Note> updateWiki(@PathVariable Long id, @RequestBody Wiki wiki) {
//        return ResponseEntity.ok(this.service.updateNote(id, wiki));
//    }
//
//    @DeleteMapping("/deleteNote/{id}")
//    public ResponseEntity<?> deleteCharacter(@PathVariable Long id) {
//        return this.service.deleteNote(id)
//                ? ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
//                : ResponseEntity.noContent().build();
//    }
}
