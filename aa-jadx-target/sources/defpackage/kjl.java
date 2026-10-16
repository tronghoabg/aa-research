package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kjl {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.SERVICE");

    public static long a(java.util.List list, com.google.android.gms.car.CarInfo carInfo, long j) {
        if (carInfo == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3189)).u("Null car info");
            return j;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            if (k((java.lang.String[]) pair.first, carInfo)) {
                return ((java.lang.Long) pair.second).longValue();
            }
        }
        return j;
    }

    public static android.util.Pair b(java.lang.String str) {
        int iIndexOf = str.indexOf("=");
        if (iIndexOf == -1) {
            return null;
        }
        java.lang.String strSubstring = str.substring(0, iIndexOf);
        java.lang.String strSubstring2 = str.substring(iIndexOf + 1);
        try {
            return android.util.Pair.create(j(strSubstring), java.lang.Long.valueOf(java.lang.Long.parseLong(strSubstring2)));
        } catch (java.lang.NumberFormatException unused) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3194)).y("Unable to parse long value for car info: %s", strSubstring2);
            return null;
        }
    }

    @java.lang.Deprecated
    public static boolean c(java.lang.String str, com.google.android.gms.car.CarInfo carInfo) {
        java.lang.String[] strArrJ = j(str);
        if (strArrJ == null) {
            return false;
        }
        return k(strArrJ, carInfo);
    }

    public static boolean d(defpackage.xzi xziVar, absd absdVar) {
        int iAr = defpackage.a.ar(absdVar.c);
        if (iAr == 0) {
            iAr = 1;
        }
        int i = iAr - 1;
        if (i != 1) {
            if (i == 4) {
                return true;
            }
            if (i == 5) {
                return g((com.google.android.gms.car.CarInfo) xziVar.fF(), absdVar.b);
            }
            if (i != 6) {
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 3191)).w("Undefined filter mode %d", i);
                return false;
            }
            if (!g((com.google.android.gms.car.CarInfo) xziVar.fF(), absdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(com.google.android.gms.car.CarInfo carInfo, defpackage.absc abscVar) {
        return g(carInfo, abscVar.b);
    }

    @java.lang.Deprecated
    public static boolean f(com.google.android.gms.car.CarInfo carInfo, defpackage.absx absxVar) {
        j$.util.stream.Stream streamD = defpackage.tht.d(new defpackage.ilz(16), absxVar);
        int i = defpackage.ygw.d;
        return h(carInfo, (defpackage.ygw) streamD.collect(defpackage.yds.a));
    }

    public static boolean g(com.google.android.gms.car.CarInfo carInfo, java.util.List list) {
        if (carInfo == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3192)).u("Null car info");
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.absb absbVar = (defpackage.absb) it.next();
            if ((absbVar.b & 1) != 0) {
                java.lang.String str = absbVar.c;
                java.lang.String str2 = carInfo.a;
                if (str2 != null && defpackage.ysr.bD(str, str2)) {
                }
            }
            if ((absbVar.b & 2) != 0) {
                java.lang.String str3 = absbVar.d;
                java.lang.String str4 = carInfo.b;
                if (str4 != null && defpackage.ysr.bD(str3, str4)) {
                }
            }
            if ((absbVar.b & 4) != 0) {
                java.lang.String str5 = absbVar.e;
                java.lang.String str6 = carInfo.c;
                if (str6 != null && defpackage.ysr.bD(str5, str6)) {
                }
            }
            if ((absbVar.b & 8) != 0) {
                java.lang.String str7 = absbVar.f;
                java.lang.String str8 = carInfo.i;
                if (str8 != null && defpackage.ysr.bD(str7, str8)) {
                }
            }
            if ((absbVar.b & 16) != 0) {
                java.lang.String str9 = absbVar.g;
                java.lang.String str10 = carInfo.j;
                if (str10 != null && defpackage.ysr.bD(str9, str10)) {
                }
            }
            if ((absbVar.b & 32) != 0) {
                java.lang.String str11 = absbVar.h;
                java.lang.String str12 = carInfo.k;
                if (str12 != null && defpackage.ysr.bD(str11, str12)) {
                }
            }
            if ((absbVar.b & 64) != 0) {
                java.lang.String str13 = absbVar.i;
                java.lang.String str14 = carInfo.l;
                if (str14 != null && defpackage.ysr.bD(str13, str14)) {
                }
            }
            if ((absbVar.b & 128) != 0) {
                if (!defpackage.ysr.bD(absbVar.j, carInfo.e + "." + carInfo.f)) {
                }
            }
            return true;
        }
        return false;
    }

    @java.lang.Deprecated
    public static boolean h(com.google.android.gms.car.CarInfo carInfo, java.util.List list) {
        if (carInfo == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3193)).u("Null car info");
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (k((java.lang.String[]) it.next(), carInfo)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(com.google.android.gms.car.CarInfo carInfo, java.util.List list) {
        j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(list).map(new defpackage.ilz(16)).filter(new defpackage.kqi(1));
        int i = defpackage.ygw.d;
        return h(carInfo, (defpackage.ygw) streamFilter.collect(defpackage.yds.a));
    }

    public static java.lang.String[] j(java.lang.String str) {
        if (str.isEmpty()) {
            return null;
        }
        java.lang.Iterable iterableG = new defpackage.xzd(new defpackage.xyx(new defpackage.xxo(','))).a(9).g(str);
        return (java.lang.String[]) defpackage.ysr.aq(iterableG).toArray((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.String.class, 0));
    }

    private static boolean k(java.lang.String[] strArr, com.google.android.gms.car.CarInfo carInfo) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int length = strArr.length;
        if (length == 0) {
            return true;
        }
        if (!strArr[0].isEmpty() && ((str4 = carInfo.a) == null || !defpackage.ysr.bD(strArr[0], str4))) {
            return false;
        }
        if (length < 2) {
            return true;
        }
        if (!strArr[1].isEmpty() && ((str3 = carInfo.b) == null || !defpackage.ysr.bD(strArr[1], str3))) {
            return false;
        }
        if (length < 3) {
            return true;
        }
        if (!strArr[2].isEmpty()) {
            if (!strArr[2].equals(carInfo.e + "." + carInfo.f)) {
                return false;
            }
        }
        if (length < 4) {
            return true;
        }
        if (!strArr[3].isEmpty() && !strArr[3].equals(carInfo.c)) {
            return false;
        }
        if (length < 5) {
            return true;
        }
        if (!strArr[4].isEmpty() && ((str2 = carInfo.i) == null || !defpackage.ysr.bD(strArr[4], str2))) {
            return false;
        }
        if (length < 6) {
            return true;
        }
        if (!strArr[5].isEmpty() && ((str = carInfo.j) == null || !defpackage.ysr.bD(strArr[5], str))) {
            return false;
        }
        if (length < 7) {
            return true;
        }
        if (!strArr[6].isEmpty() && !strArr[6].equals(carInfo.k)) {
            return false;
        }
        if (length >= 9 && !strArr[8].isEmpty()) {
            if (carInfo.l == null) {
                return false;
            }
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(strArr[8]).matcher(carInfo.l);
            if (!matcher.matches()) {
                return false;
            }
            if (!strArr[7].isEmpty()) {
                java.lang.String strGroup = matcher.group(matcher.groupCount());
                strGroup.getClass();
                return strGroup.compareTo(strArr[7]) <= 0;
            }
        }
        return true;
    }
}
