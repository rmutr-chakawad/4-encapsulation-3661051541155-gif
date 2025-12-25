public class testpizza {
    public static void main(String[] args) {
        pizza pizza = new pizza();
        pizza.addToppings("Cheese");
        pizza.addToppings("Bacon");
        pizza.addToppings("Mushroom");

        pizza.printAllTopping();
        System.out.println("จำนวนเครื่องปรุง : "+ pizza.gettotalToppings());
        System.out.println("ราคารวม : " + pizza.getPrice() + " บาท");
    }
}
