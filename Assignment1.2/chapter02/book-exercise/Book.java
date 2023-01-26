/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Eric Wallace
 * @version 1/25/2023
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        this.courseText = courseText;
    }
    
    /**
     * Return the author field.
     *
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Return the title field.
     *
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the number of pages.
     * 
     */
    public int getPages()
    {
        return pages;
    }
    
    
    /**
     * Printing out the book details to the terminal.
     * 
     */
    public void printDetails()
    {
        if(refNumber.length() > 0){
            System.out.println("Title: " + title + ", Author: " + author + 
            ", Pages: " + pages + ", Reference #" + refNumber);    
        }
        else {
            System.out.println("Title: " + title + ", Author: " + author + 
            ", Pages: " + pages + ", Reference: " + "zzz");
        }
        System.out.println("This book has been borrowed: " + borrowed +
        " times");
    }
    
    /**
     * Set the reference number to the book.
     * 
     */
    public void setRefNumber(String ref)
    {
       if(ref.length() >= 3){
           refNumber = ref; 
       }
       else {
        System.out.println("You must enter at least 3 characters");
       }
    }
    
    /**
     * Return the reference number for the book.
     * 
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Track the number of times the book is borrowed.
     */
    public void borrow()
    {
        borrowed++;
    }
    
    /**
     * Return the amount of times borrowed.
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * Return whether the book is part of a course.
     */
    public boolean isCourseText()
    {
        return courseText;
    }
}
