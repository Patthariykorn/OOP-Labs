public class ClubTest {
    public static void main(String[] args) {

        SportsClub sports = new SportsClub("Sports Club", 10);

        sports.addMember(5);
        System.out.println(sports.getName());
        System.out.println(sports.determineBudget());

        sports.changeName("New Name");
        System.out.println(sports.getName());

        sports.advertise();


        MarketingClub marketing =
                new MarketingClub("Marketing Club", 5, 1500);

        System.out.println(marketing.determineBudget());

        System.out.println(marketing.useBudget(500));
        System.out.println(marketing.useBudget(1200));
        System.out.println(marketing.determineBudget());
    }
}