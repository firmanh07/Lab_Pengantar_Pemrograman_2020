public class Role {

    public static void main(String[] args) {
        int menuIndex = 0;
        int subMenuIndex = 0;
        boolean isValidRole = false;
    
        if (args.length == 0) {
          System.out.println("What role you want to see ?");
          System.out.println("For example, try 'Admin'.");
        } else if (args.length == 1) {
          isValidRole = true;
          subMenuIndex = 1;
          if(args[0].equals("Super Admin")) {
            menuIndex = 1;
            //subMenuIndex = 1;
          }else if (args[0].equals("Admin")) {
            menuIndex = 2;
          } else if (args[0].equals("User")) {
            menuIndex = 3;
          } else {
            System.out.println("Invalid Role");
            System.out.println("Valid Role : Super Admin, Admin, User");
          }
       
          switch(subMenuIndex) {
            case 1:
            switch(menuIndex){
              case 1:
                   System.out.printf("%d. Super Admin\n", menuIndex);
                   System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex, subMenuIndex);
                   System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, ++subMenuIndex);
                   System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, ++subMenuIndex);
             case 2:
                 subMenuIndex = 1;
                 menuIndex = menuIndex == 2 ? 1 : 2;
                 System.out.printf("%d. Admin\n", menuIndex);
                 System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                 System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, ++subMenuIndex);
            case 3:
                subMenuIndex = 1;
                menuIndex = menuIndex == 2 ? 3 : menuIndex == 3 ? 1 : 2;
                 System.out.printf("%d. User\n", menuIndex); 
                 System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
                 System.out.printf("%2d.%d. Edit\n", menuIndex, ++subMenuIndex);
            }
          }
        } else {
          System.out.println("Too many argument");
        }
      }
    
    }
    

