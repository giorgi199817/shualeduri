package currency.service.impl;

public class Main {


    public static void main(String[] args) {
        CurrencyService currencyService = new CurrencyServiceImpl();
        currencyService.convert();
        currencyService.setExchangeRate();

       // currencyService = () -> System.out.println("ლარის კურსი ევროსთან მიმართებაში არის 3.5");
        //ვცდილობდი ლამბდა გამოსახულებით დამეწერა მაგრამ არ მუშაობს :/

    }
}