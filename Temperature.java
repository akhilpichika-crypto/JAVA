class Temperature{
    static int Fahrenheit;
    static int convert(){
        int Celsius = (int)((Fahrenheit-32)*(5.0/9));
        System.out.println(Celsius);
        return Celsius;
    }
    public static void main(String[] args){
        Temperature t1 = new Temperature();
        t1.Fahrenheit = 212;
        convert();
    }
}
