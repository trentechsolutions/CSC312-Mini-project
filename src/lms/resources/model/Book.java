package lms.resources.model;

import java.util.Date;

public class Book{

    int bookID;
    String bookName;
    boolean bookStatus;             //  ** ask to make boolean
    Date dateAccessed;

    public Book( int bkid, String name ){       //  purposefully left out bookStatus, as

        bookID = bkid;
        bookName = name;
        bookStatus = true;
        dateAccessed = null;
    }

    ///////////////////////////////////////////////

    public int getBookID(){
        return bookID;
    }

    public String getBookName(){
        return bookName;
    }

    public boolean getBookStatus(){
        return bookStatus;
    }

    public Date getDateAccessed(){
        return dateAccessed;
    }

    //////////////////////////////////////////////

    public void setBookID(int a){
        bookID = a;
    }

    public void setBookName(String a){
        bookName = a;
    }

    public void setBookStatus(boolean a){
        bookStatus = a;
    }

    public void setDateAccessed(Date a){
        dateAccessed = a;
    }

    //////////////////////////////////////////////

    public String toStringBook(){

        String stat = null;
        if(bookStatus == true){
            stat = "available, accessed on: "+dateAccessed;
        }else{
            stat = "unavailable";
        }

        String alles = bookID+": "+bookName+" | "+ stat;
        return alles;
    }

}
