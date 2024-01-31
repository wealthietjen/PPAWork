public class EventPost extends Post {
    
    protected String desc;

    /**
     * Constructor for objects of class EventPost.
     * 
     * @param author    The username of the author of this post.
     * @param desc      The description of this event.
     */
    public EventPost(String author, String desc)
    {
        super(author);
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void display()
    {
        System.out.println(username + " " + getDesc());
        System.out.print("   " + timeString(timestamp));
        
        if(likes > 0) {
            System.out.println("  -  " + likes + " people like this.");
        }
        else {
            System.out.println();
        }
        
        if(comments.isEmpty()) {
            System.out.println("   No comments.");
        }
        else {
            System.out.println("   " + comments.size() + " comment(s). Click here to view.");
        }
    }

    public static void main(String[] args) {
        EventPost evPost = new EventPost("Carlyle", "changed their profile picture");
        evPost.display();
    }

}


