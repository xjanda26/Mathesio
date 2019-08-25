package main.server;

import main.entities.Comment;
import main.service.CommentService;
import main.service.ServiceFactory;

public class API {

    private CommentService commentService;
    private Comment commentToChange;

    public API(Context context){
        this.commentService = new ServiceFactory().createCommentService(context.getDb());
    }

    public void createComment(String author, String text){

        Comment newComment = new Comment(author, text);
        commentService.save(newComment);
    }

    public void edit(long id, String text){
        commentToChange = commentService.get(id);
        commentToChange.setText(text);
        commentService.save(commentToChange);
    }

    public void doUpVote (long id){
        commentToChange = commentService.get(id);
        commentToChange.increaseUpVote();
        commentService.save(commentToChange);
    }

    public void doDownVote (long id) {
        commentToChange = commentService.get(id);
        commentToChange.increaseDownVote();
        commentService.save(commentToChange);
    }

    public void doReply (long id, String author, String text) {
        Comment commentReply = new Comment(author, text);
        commentToChange = commentService.get(id);
        commentReply.setLinkTo(commentToChange);
        commentService.save(commentReply);
    }

    public void doReport (long id) {
        Comment commentToDelete = commentService.get(id);
        commentService.delete(commentToDelete);
    }



}
