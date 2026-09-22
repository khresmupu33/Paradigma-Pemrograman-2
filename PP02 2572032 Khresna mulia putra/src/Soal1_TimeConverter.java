public class Soal1_TimeConverter {
    private Integer int1;

    public Soal1_TimeConverter(int int1) {
        this.int1 = int1;
    }

    public Soal1_TimeConverter() {}

    public int getInt1() {
        return int1;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public String showTime(){
         int jam = (this.int1/3600);
         int  menit =((this.int1%3600)/60);
         int detik= (this.int1%60);
         if (jam<0){
             jam*=-1;
         }
        if (menit<0){
            menit*=-1;
        }
        if (detik<0){
            detik*=-1;
        }
        String hasil = String.format("Converter time: %02d:%02d:%02d",jam,menit,detik);
         return hasil;
    }
}
