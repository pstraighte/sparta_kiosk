import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                "\n" +
                "[ SHAKESHACK MENU ]\n" +
                "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                "2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                "3. Drinks          | 매장에서 직접 만드는 음료\n" +
                "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n" +
                "\n" +
                "[ ORDER MENU ]\n" +
                "5. Order       | 장바구니를 확인 후 주문합니다.\n" +
                "6. Cancel      | 진행중인 주문을 취소합니다." +
                "----------------------------------------------------------");
        ArrayList<Menu> menuList = getMenuList();

        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();

        String menu = "";
        switch (select) {
            case 1 -> menu = menuArrayList;
            case 2 -> menu = "아이스크림";
            case 3 -> menu = "음료";
            case 4 -> menu = "주류";
            case 5 -> menu = "오더";
            case 6 -> menu = "주문취소";
        }


    }

    public static ArrayList<Menu> getMenuList(){
        ArrayList<Menu> menuArrayList = new ArrayList<>();
        menuArrayList.add(new Menu("Burgers         ","앵거스 비프 통살을 다져만든 버거"));
        menuArrayList.add(new Menu("Forzen Custard  ","매장에서 신선하게 만드는 아이스크림"));
        menuArrayList.add(new Menu("Drinks          ","매장에서 직접 만드는 음료"));
        menuArrayList.add(new Menu("Beer            ","뉴욕 브루클린 브루어리에서 양조한 맥주"));
        return menuArrayList;
    }
    public static ArrayList<Product> getProductList(){
        ArrayList<Menu> ProductArrayList = new ArrayList<>();
        ProductArrayList.add(new Product("ShackBurger   ", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        ProductArrayList.add(new Product("SmokeShack    ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        ProductArrayList.add(new Product("Shroom Burger ", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"));
        ProductArrayList.add(new Product("Cheeseburger  ", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        ProductArrayList.add(new Product("Hamburger     ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        return ProductArrayList;
    }




        }
