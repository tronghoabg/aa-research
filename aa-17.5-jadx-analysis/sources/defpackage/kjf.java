package defpackage;

import android.util.Pair;
import com.google.android.gms.car.CarInfo;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class kjf {
    public static final yph a = yph.c("CAR.SERVICE");

    public static long a(List list, CarInfo carInfo, long j) {
        if (carInfo == null) {
            ((ype) ((ype) a.h()).ai((char) 3185)).u("Null car info");
            return j;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (k((String[]) pair.first, carInfo)) {
                return ((Long) pair.second).longValue();
            }
        }
        return j;
    }

    public static Pair b(String str) throws NumberFormatException {
        int iIndexOf = str.indexOf("=");
        if (iIndexOf == -1) {
            return null;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        try {
            return Pair.create(j(strSubstring), Long.valueOf(Long.parseLong(strSubstring2)));
        } catch (NumberFormatException unused) {
            ((ype) ((ype) a.h()).ai((char) 3190)).y("Unable to parse long value for car info: %s", strSubstring2);
            return null;
        }
    }

    @Deprecated
    public static boolean c(String str, CarInfo carInfo) {
        String[] strArrJ = j(str);
        if (strArrJ == null) {
            return false;
        }
        return k(strArrJ, carInfo);
    }

    public static boolean d(xyc xycVar, abra abraVar) {
        int iAs = a.as(abraVar.c);
        if (iAs == 0) {
            iAs = 1;
        }
        int i = iAs - 1;
        if (i != 1) {
            if (i == 4) {
                return true;
            }
            if (i == 5) {
                return g((CarInfo) xycVar.gu(), abraVar.b);
            }
            if (i != 6) {
                ((ype) ((ype) a.g()).ai((char) 3187)).w("Undefined filter mode %d", i);
                return false;
            }
            if (!g((CarInfo) xycVar.gu(), abraVar.b)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(CarInfo carInfo, abqz abqzVar) {
        return g(carInfo, abqzVar.b);
    }

    @Deprecated
    public static boolean f(CarInfo carInfo, abru abruVar) {
        Stream streamD = tgx.d(new ilq(17), abruVar);
        int i = yfq.d;
        return h(carInfo, (yfq) streamD.collect(ycm.a));
    }

    public static boolean g(CarInfo carInfo, List list) {
        if (carInfo == null) {
            ((ype) ((ype) a.h()).ai((char) 3188)).u("Null car info");
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            abqy abqyVar = (abqy) it.next();
            if ((abqyVar.b & 1) != 0) {
                String str = abqyVar.c;
                String str2 = carInfo.a;
                if (str2 != null && woy.at(str, str2)) {
                }
            }
            if ((abqyVar.b & 2) != 0) {
                String str3 = abqyVar.d;
                String str4 = carInfo.b;
                if (str4 != null && woy.at(str3, str4)) {
                }
            }
            if ((abqyVar.b & 4) != 0) {
                String str5 = abqyVar.e;
                String str6 = carInfo.c;
                if (str6 != null && woy.at(str5, str6)) {
                }
            }
            if ((abqyVar.b & 8) != 0) {
                String str7 = abqyVar.f;
                String str8 = carInfo.i;
                if (str8 != null && woy.at(str7, str8)) {
                }
            }
            if ((abqyVar.b & 16) != 0) {
                String str9 = abqyVar.g;
                String str10 = carInfo.j;
                if (str10 != null && woy.at(str9, str10)) {
                }
            }
            if ((abqyVar.b & 32) != 0) {
                String str11 = abqyVar.h;
                String str12 = carInfo.k;
                if (str12 != null && woy.at(str11, str12)) {
                }
            }
            if ((abqyVar.b & 64) != 0) {
                String str13 = abqyVar.i;
                String str14 = carInfo.l;
                if (str14 != null && woy.at(str13, str14)) {
                }
            }
            if ((abqyVar.b & 128) != 0) {
                if (!woy.at(abqyVar.j, carInfo.e + "." + carInfo.f)) {
                }
            }
            return true;
        }
        return false;
    }

    @Deprecated
    public static boolean h(CarInfo carInfo, List list) {
        if (carInfo == null) {
            ((ype) ((ype) a.h()).ai((char) 3189)).u("Null car info");
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (k((String[]) it.next(), carInfo)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(CarInfo carInfo, List list) {
        Stream streamFilter = Collection.EL.stream(list).map(new ilq(17)).filter(new hmd(20));
        int i = yfq.d;
        return h(carInfo, (yfq) streamFilter.collect(ycm.a));
    }

    public static String[] j(String str) {
        if (str.isEmpty()) {
            return null;
        }
        Iterable iterableG = new xxx(new xxr(new xwi(','))).a(9).g(str);
        return (String[]) yrm.aq(iterableG).toArray((Object[]) Array.newInstance((Class<?>) String.class, 0));
    }

    private static boolean k(String[] strArr, CarInfo carInfo) {
        String str;
        String str2;
        String str3;
        String str4;
        int length = strArr.length;
        if (length == 0) {
            return true;
        }
        if (!strArr[0].isEmpty() && ((str4 = carInfo.a) == null || !woy.at(strArr[0], str4))) {
            return false;
        }
        if (length < 2) {
            return true;
        }
        if (!strArr[1].isEmpty() && ((str3 = carInfo.b) == null || !woy.at(strArr[1], str3))) {
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
        if (!strArr[4].isEmpty() && ((str2 = carInfo.i) == null || !woy.at(strArr[4], str2))) {
            return false;
        }
        if (length < 6) {
            return true;
        }
        if (!strArr[5].isEmpty() && ((str = carInfo.j) == null || !woy.at(strArr[5], str))) {
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
            Matcher matcher = Pattern.compile(strArr[8]).matcher(carInfo.l);
            if (!matcher.matches()) {
                return false;
            }
            if (!strArr[7].isEmpty()) {
                String strGroup = matcher.group(matcher.groupCount());
                strGroup.getClass();
                return strGroup.compareTo(strArr[7]) <= 0;
            }
        }
        return true;
    }
}
