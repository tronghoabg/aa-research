package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class jfr {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public jfr(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static jfr a(String str) {
        String[] strArrSplit = str.split("-", 5);
        int length = strArrSplit.length;
        if (length == 0) {
            return null;
        }
        String str2 = strArrSplit[0];
        woy.S(!TextUtils.isEmpty(str2), "CarInfoSpecs must have a valid non empty make. Got %s", str);
        jfq jfqVar = new jfq();
        jfqVar.b(str2);
        if (length > 1 && !TextUtils.isEmpty(strArrSplit[1].trim())) {
            jfqVar.a = strArrSplit[1];
        }
        if (length > 2 && !TextUtils.isEmpty(strArrSplit[2].trim())) {
            jfqVar.b = strArrSplit[2];
        }
        if (length > 3 && !TextUtils.isEmpty(strArrSplit[3].trim())) {
            jfqVar.c = strArrSplit[3];
        }
        if (length > 4 && !TextUtils.isEmpty(strArrSplit[4].trim())) {
            jfqVar.d = strArrSplit[4];
        }
        return jfqVar.a();
    }

    public static ygr b(List list) {
        return (ygr) Collection.EL.stream(list).map(new ijt(14)).collect(ycm.b);
    }

    public static String c(String str) {
        return woy.ar(str).replace(' ', '_').replace('-', '_');
    }

    public static boolean d(String str, String str2, String str3, String str4, String str5, Set set) {
        String str6;
        String strC = c(str);
        jfq jfqVar = new jfq();
        jfqVar.b(strC);
        if (str2 != null) {
            jfqVar.a = c(str2);
        }
        if (str3 != null) {
            jfqVar.b = str3;
        }
        if (str4 != null) {
            jfqVar.c = c(str4);
        }
        if (str5 != null) {
            jfqVar.d = c(str5);
        }
        jfr jfrVarA = jfqVar.a();
        if (set.contains(jfrVarA)) {
            return true;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jfr jfrVar = (jfr) it.next();
            if (jfrVar.a.equals(jfrVarA.a) && ((str6 = jfrVar.b) == null || str6.equals(jfrVarA.b))) {
                String str7 = jfrVar.c;
                if (str7 == null || str7.equals(jfrVarA.c)) {
                    String str8 = jfrVar.d;
                    if (str8 == null || str8.equals(jfrVarA.d)) {
                        String str9 = jfrVar.e;
                        if (str9 == null || str9.equals(jfrVarA.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean e(String str, String str2, String str3, abru abruVar) {
        return d(str, str2, str3, null, null, (ygr) tgx.d(new ilq(15), abruVar).collect(ycm.b));
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jfr) {
            jfr jfrVar = (jfr) obj;
            if (this.a.equals(jfrVar.a) && ((str = this.b) != null ? str.equals(jfrVar.b) : jfrVar.b == null) && ((str2 = this.c) != null ? str2.equals(jfrVar.c) : jfrVar.c == null) && ((str3 = this.d) != null ? str3.equals(jfrVar.d) : jfrVar.d == null) && ((str4 = this.e) != null ? str4.equals(jfrVar.e) : jfrVar.e == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "CarInfoSpec{make=" + this.a + ", model=" + this.b + ", year=" + this.c + ", headUnitMake=" + this.d + ", headUnitModel=" + this.e + "}";
    }

    public jfr() {
        throw null;
    }
}
