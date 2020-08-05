package com.qa.mongodb.repo;

import com.qa.mongodb.collections.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepo extends MongoRepository<Note, String> {

    List<Note> findNotesByTitle(String title);
    List<Note> findNotesByBodyContaining(String body);
}
