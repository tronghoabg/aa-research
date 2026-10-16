package defpackage;

import com.google.android.gms.car.CarInfo;

/* loaded from: classes.dex */
public final class lbh {
    public static void a() {
    }

    public static tea b(CarInfo carInfo) {
        if (carInfo == null) {
            return null;
        }
        String str = carInfo.a;
        if (str == null) {
            throw new NullPointerException("Null carManufacturer");
        }
        String str2 = carInfo.b;
        if (str2 == null) {
            throw new NullPointerException("Null carModel");
        }
        String str3 = carInfo.c;
        if (str3 == null) {
            throw new NullPointerException("Null carModelYear");
        }
        String str4 = carInfo.i;
        if (str4 == null) {
            throw new NullPointerException("Null headUnitMake");
        }
        String str5 = carInfo.j;
        if (str5 != null) {
            return new tea(str, str2, str3, str4, str5);
        }
        throw new NullPointerException("Null headUnitModel");
    }

    public static liu c() {
        return (liu) mki.a.i(liu.class);
    }

    public static lhm d() {
        return (lhm) mki.a.i(lhm.class);
    }
}
