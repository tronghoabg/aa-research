package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lbm {
    public static void a() {
    }

    public static defpackage.tex b(com.google.android.gms.car.CarInfo carInfo) {
        if (carInfo == null) {
            return null;
        }
        java.lang.String str = carInfo.a;
        if (str == null) {
            throw new java.lang.NullPointerException("Null carManufacturer");
        }
        java.lang.String str2 = carInfo.b;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null carModel");
        }
        java.lang.String str3 = carInfo.c;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null carModelYear");
        }
        java.lang.String str4 = carInfo.i;
        if (str4 == null) {
            throw new java.lang.NullPointerException("Null headUnitMake");
        }
        java.lang.String str5 = carInfo.j;
        if (str5 != null) {
            return new defpackage.tex(str, str2, str3, str4, str5);
        }
        throw new java.lang.NullPointerException("Null headUnitModel");
    }
}
