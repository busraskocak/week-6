class Customer {
    //Nitelikler veya özellikler
    // Ad, soyad,telefon,eposta,yaşı,bakiyesi

    public String name;
    public String idno;
    public String surname;
    public String phone;
    public String mail;
    public int age;
    public double balance;

    public Customer(String name, String surname, String idno, double balance) {
        this.name = name;
        this.surname = surname;
        this.idno = idno;
        this.balance = balance;

    }

    //deposit
    public void deposit(double price) {
        if (price < 0) {
            System.out.println("Lütfen Geçerli bir para miktarı giriniz");
        } else {
            this.balance += price;
            System.out.println("Para Yatırma İşleminiz Baaşrıyla Gerçekleşti.");
        }

    }

    //withdram(para çekme)
    public void withdram(double price) {
        if (price<0){
            System.out.println("Lütfen geçerli bir para miktarı giriniz.");
        } else {
            double newBalance = this.balance-price;
            if (newBalance < 0) {
                System.out.println("Hesabınızda o kadar para bulunmamaktadır."); //Bakiyeden fazla para çekileceği zaman
            }else{
                this.balance = newBalance;
                System.out.println("Para Çekme İşleminiz Başarıyla Gerçekleşti.");
            }






        }
    }


}
