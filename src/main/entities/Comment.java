package main.entities;

/*
 *
 * @author Adam Janda <janda.adam023@gmail.com>
 * */

import java.util.Date;

public class Comment {
    private long id;
    private String author;
    private Date date;
    private String text;

    private int countUpVote;
    private int countDownVote;

    private Comment linkTo;

    private long createId(){
        /*
         * vytvori jedinecne oznacenie komentaru
         * */

        long idecko = 123456;
        return idecko;
    }

    public Comment(String author, String text) {
        this.author = author;
        this.text = text;

        this.countDownVote = 0;
        this.countUpVote = 0;
        this.linkTo = null;
        this.id = createId();
    }

    public void setText (String commenText){
        this.text = commenText;
    }

    public String getText() {
        return this.text;
    }

    public void increaseUpVote(){
        this.countUpVote++;
    }

    public void increaseDownVote(){
        this.countDownVote++;
    }

    public void setLinkTo(Comment oldComment){
        this.linkTo = oldComment;
    }
}
