public class Member {
 
    private String memberName;
    private int joinYear;
    private String membershipType;

    public Member(String desiredName, int dateJoined, String memberType){
        memberName = desiredName;
        joinYear = dateJoined;
        membershipType = memberType;
    }
    

    public String getMemberName() {
        return memberName; 
    }
    public int getJoinYear() {
        return joinYear; 
    }
    public String getMembershipType() {
        return membershipType;
    }

    public static void main(String[] args)
    {
        Member member1 = new Member("Lyle", 2004, "Normal");
        member1.setStudent();
        member1.changeName();
        System.out.println(
            "Name: " + member1.getMemberName() +
            " Year Joined: " + member1.getJoinYear() +
            " Membership Type: " + member1.getMembershipType()
            );
    }

    public void setStudent() {
        this.membershipType = "Student";
        
        }
    
    public void changeName() {
        this.memberName = "Ben";
        
    }

    }