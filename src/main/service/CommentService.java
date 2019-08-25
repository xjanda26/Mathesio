package main.service;

import main.database.Database;
import main.entities.Comment;
import main.server.Context;

import java.util.ArrayList;
import java.util.List;

public class CommentService {

    public CommentService(Database database){
        Context context = new Context();
    }

    public void save(Comment newComment){
        /**
         * Metoda by pouzila metody z triedy Database a ulozila by do nej novy komentar.
         */
    }

    public void delete(Comment comment){
        /**
         * Metoda by pouzila metody z triedy Database a vymazala by komentar
         */
    }

    public List<Comment> getAll(){
        /**
         * Metoda by pouzila metody z triedy Database a vratila by list vsetkzch komentarov y DB.
         *
         */

        return new ArrayList<Comment>();
    }

    public Comment get(long id){
        /**
         * Metoda by pouzila metody z triedy Database a vyhladala by konkretny komentar z DB.
         * Metoda by vratila object Comment.
         */

        String tmpAuthor = "nickname";
        String tmpText = "comment";
        return new Comment(tmpAuthor,tmpText);
    }
}
