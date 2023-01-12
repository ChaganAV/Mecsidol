public class Kiz{
    String s01;
    String gtin;
    String s21;
    String code;
    String crypto;
    String kiz;
    public Kiz()
    {}
    public Kiz(String s01,String gtin, String s21, String crypto)
    {
        this.s01 = s01;
        this.gtin = gtin;
        this.s21 = s21;
        this.crypto = crypto;
    }
    public void Set01(String str)
    {
        s01 = str;
    }
    public  void SetGtin(String gtin)
    {
        this.gtin = gtin;
    }
    public  void SetCrypto(String crypto)
    {
        this.crypto = crypto;
    }
    public String GetKiz(String code)
    {
        this.code = code;
        this.kiz = s01 + gtin + s21 + code + crypto;
        return kiz;
    }
    public void ShowKiz()
    {
        System.out.println(kiz);
    }
}