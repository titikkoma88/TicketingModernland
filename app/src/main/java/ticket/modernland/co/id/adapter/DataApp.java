package ticket.modernland.co.id.adapter;

public class DataApp {

    String app;
    String namaapp;

    public DataApp (String app, String namaapp){
        this.app = app;
        this.namaapp = namaapp;
    }

    public String getApp() {
        return this.app;
    }

    public String getNamaapp() {
        return this.namaapp;
    }

    public String toString(){
        return this.namaapp;
    }
}
