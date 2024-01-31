import java.util.ArrayList;

/**
 * The NewsFeed class stores news posts for the news feed in a
 * social network application.
 * 
 * Display of the posts is currently simulated by printing the
 * details to the terminal. (Later, this should display in a browser.)
 * 
 * This version does not save the data to disk, and it does not
 * provide any search or ordering functions.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.2
 */
public class NewsFeed
{
    private ArrayList<Post> posts;

    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
        posts = new ArrayList<>();
    }

    /**
     * Add a post to the news feed.
     * 
     * @param post  The post to be added.
     */
    public void addPost(Post post)
    {
        posts.add(post);
    }

    /**
     * Show the news feed. Currently: print the news feed details
     * to the terminal. (To do: replace this later with display
     * in web browser.)
     */
    public void show()
    {
        // display all posts
        System.out.println();
        for(Post post : posts) {
            post.display();
            System.out.println();   // empty line between posts
        }
    }

    public static void main(String[] args) {
        Post msgPost1 = new MessagePost("Jordan", "I'm officially a student at KCL");
        Post phPost1 = new PhotoPost("Arthur", "schoolYard.png", "this is where i play tag withh my friends");
        Post evPost1 = new EventPost("Lyle", "started following 3 people");
        NewsFeed newsFeed = new NewsFeed();
        
        newsFeed.addPost(msgPost1);
        newsFeed.addPost(phPost1);
        newsFeed.addPost(evPost1);

        newsFeed.show();
    }
}
