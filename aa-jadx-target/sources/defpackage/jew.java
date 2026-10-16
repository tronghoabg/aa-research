package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jew {
    public static final defpackage.yhx a = defpackage.yhx.t(2, 10, 17, 1, 14, 18, 3, 12, 13, 4);

    public static java.lang.String a(int i) {
        if (i == 2) {
            return "com.google.android.gms.permission.CAR_SPEED";
        }
        if (i == 10) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (i == 4) {
            return "com.google.android.gms.permission.CAR_MILEAGE";
        }
        if (i != 5) {
            return null;
        }
        return "com.google.android.gms.permission.CAR_FUEL";
    }

    public static boolean b(int i) {
        return i == 1 || i == 6 || i == 9 || i == 11;
    }
}
