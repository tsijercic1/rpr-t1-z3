package ba.unsa.etf.rpr;

public class Sat {
    int sati;
    int minute;
    int sekunde;

    public Sat(int sati, int minute, int sekunde){
        postavi(sati,minute,sekunde);
    }

    public int getSekunde() {
        return sekunde;
    }

    public void setSekunde(int sekunde) {
        this.sekunde = sekunde;
    }

    public int getSati() {
        return sati;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void postavi(int sati, int minute, int sekunde){
        setSati(sati);
        setMinute(minute);
        setSekunde(sekunde);
    }

    public void sljedeci() {
        this.sekunde++;
        if (this.sekunde==60) { this.sekunde=0; this.minute++; }
        if (this.minute==60) { this.minute=0; this.sati++; }
        if (this.sati==24) this.sati=0;
    }

    public void prethodni() {
        this.sekunde--;
        if (this.sekunde==-1) { this.sekunde=59; this.minute--; }
        if (this.minute==-1) { this.minute=59; this.sati--; }
        if (this.sati==-1) this.sati=23;
    }

    public void pomjeriZa(int pomak) {
        if (pomak>0) for (int i = 0; i<pomak; i++) this.sljedeci();
        else for (int i = 0; i<-pomak; i++) this.prethodni();
    }

    public void ispisi(){
        System.out.println(this.getSati() + ":" + this.getMinute() + ":" + this.getSekunde());
    }

}
/*
* #include <iostream>

using namespace std;

class Sat {
    int sati,minute,sekunde;
public:
    Sat(int sati, int minute, int sekunde) { Postavi(sati,minute,sekunde); }
    void Postavi(int sati, int minute, int sekunde) { Sat::sati=sati; Sat::minute=minute; Sat::sekunde=sekunde; }
    void Sljedeci() {
        sekunde++;
        if (sekunde==60) { sekunde=0; minute++; }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;
    }
    void Prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
    void PomjeriZa(int pomak) {
        if (pomak>0) for (int i(0); i<pomak; i++) Sljedeci();
        else for (int i(0); i<-pomak; i++) Prethodni();
    }
    int DajSate() const { return sati; }
    int DajMinute() const { return minute; }
    int DajSekunde() const { return sekunde; }
    void Ispisi() const { cout<<sati<<":"<<minute<<":"<<sekunde<<endl; }
};

int main() {
    Sat s(15,30,45);
    s.Ispisi();
    s.Sljedeci();
    s.Ispisi();
    s.PomjeriZa(-48);
    s.Ispisi();
    s.Postavi(0,0,0);
    s.Ispisi();
    return 0;
}

* */