package defpackage;

import com.google.android.gms.car.CarInfo;

/* loaded from: classes.dex */
public final class mhc {
    private static final ygr a;

    static {
        ygp ygpVar = new ygp();
        ygpVar.c("aidefu001");
        ygpVar.c("au");
        ygpVar.c("by");
        ygpVar.c("cu");
        ygpVar.c("ddx");
        ygpVar.c("j90aeu");
        ygpVar.c("mn");
        ygpVar.c("mtc+");
        ygpVar.c("nissan_da22j");
        ygpVar.c("po");
        ygpVar.c("se");
        ygpVar.c("smartscreen");
        ygpVar.c("tm");
        ygpVar.c("uconnect");
        ygpVar.c("vn");
        a = ygpVar.g();
    }

    public static String a(CarInfo carInfo) {
        String str;
        if (carInfo == null || (str = carInfo.a) == null || str.isEmpty()) {
            return "";
        }
        aboh abohVar = acvh.a.gu().f().b;
        String strC = jfr.c(str);
        return (a.contains(strC) || abohVar.contains(strC)) ? "" : str;
    }
}
