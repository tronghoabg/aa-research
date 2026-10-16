package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mhj {
    private static final defpackage.yhx a;

    static {
        defpackage.yhv yhvVar = new defpackage.yhv();
        yhvVar.c("aidefu001");
        yhvVar.c("au");
        yhvVar.c("by");
        yhvVar.c("cu");
        yhvVar.c("ddx");
        yhvVar.c("j90aeu");
        yhvVar.c("mn");
        yhvVar.c("mtc+");
        yhvVar.c("nissan_da22j");
        yhvVar.c("po");
        yhvVar.c("se");
        yhvVar.c("smartscreen");
        yhvVar.c("tm");
        yhvVar.c("uconnect");
        yhvVar.c("vn");
        a = yhvVar.g();
    }

    public static java.lang.String a(com.google.android.gms.car.CarInfo carInfo) {
        java.lang.String str;
        if (carInfo == null || (str = carInfo.a) == null || str.isEmpty()) {
            return "";
        }
        defpackage.abpj abpjVar = defpackage.acwj.g().b;
        java.lang.String strC = defpackage.jfz.c(str);
        return (a.contains(strC) || abpjVar.contains(strC)) ? "" : str;
    }
}
