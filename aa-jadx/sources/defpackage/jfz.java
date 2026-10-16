package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jfz {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;

    public jfz(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static defpackage.jfz a(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split("-", 5);
        int length = strArrSplit.length;
        if (length == 0) {
            return null;
        }
        java.lang.String str2 = strArrSplit[0];
        defpackage.ysr.bc(!android.text.TextUtils.isEmpty(str2), "CarInfoSpecs must have a valid non empty make. Got %s", str);
        defpackage.jfy jfyVar = new defpackage.jfy();
        jfyVar.b(str2);
        if (length > 1 && !android.text.TextUtils.isEmpty(strArrSplit[1].trim())) {
            jfyVar.a = strArrSplit[1];
        }
        if (length > 2 && !android.text.TextUtils.isEmpty(strArrSplit[2].trim())) {
            jfyVar.b = strArrSplit[2];
        }
        if (length > 3 && !android.text.TextUtils.isEmpty(strArrSplit[3].trim())) {
            jfyVar.c = strArrSplit[3];
        }
        if (length > 4 && !android.text.TextUtils.isEmpty(strArrSplit[4].trim())) {
            jfyVar.d = strArrSplit[4];
        }
        return jfyVar.a();
    }

    public static defpackage.yhx b(java.util.List list) {
        return (defpackage.yhx) j$.util.Collection.EL.stream(list).map(new defpackage.ikc(15)).collect(defpackage.yds.b);
    }

    public static java.lang.String c(java.lang.String str) {
        return defpackage.ysr.bB(str).replace(' ', '_').replace('-', '_');
    }

    public static boolean d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Set set) {
        java.lang.String str6;
        java.lang.String strC = c(str);
        defpackage.jfy jfyVar = new defpackage.jfy();
        jfyVar.b(strC);
        if (str2 != null) {
            jfyVar.a = c(str2);
        }
        if (str3 != null) {
            jfyVar.b = str3;
        }
        if (str4 != null) {
            jfyVar.c = c(str4);
        }
        if (str5 != null) {
            jfyVar.d = c(str5);
        }
        defpackage.jfz jfzVarA = jfyVar.a();
        if (set.contains(jfzVarA)) {
            return true;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            defpackage.jfz jfzVar = (defpackage.jfz) it.next();
            if (jfzVar.a.equals(jfzVarA.a) && ((str6 = jfzVar.b) == null || str6.equals(jfzVarA.b))) {
                java.lang.String str7 = jfzVar.c;
                if (str7 == null || str7.equals(jfzVarA.c)) {
                    java.lang.String str8 = jfzVar.d;
                    if (str8 == null || str8.equals(jfzVarA.d)) {
                        java.lang.String str9 = jfzVar.e;
                        if (str9 == null || str9.equals(jfzVarA.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean e(java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.absx absxVar) {
        return d(str, str2, str3, null, null, (defpackage.yhx) defpackage.tht.d(new defpackage.ilz(14), absxVar).collect(defpackage.yds.b));
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.jfz) {
            defpackage.jfz jfzVar = (defpackage.jfz) obj;
            if (this.a.equals(jfzVar.a) && ((str = this.b) != null ? str.equals(jfzVar.b) : jfzVar.b == null) && ((str2 = this.c) != null ? str2.equals(jfzVar.c) : jfzVar.c == null) && ((str3 = this.d) != null ? str3.equals(jfzVar.d) : jfzVar.d == null) && ((str4 = this.e) != null ? str4.equals(jfzVar.e) : jfzVar.e == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.String str = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        java.lang.String str4 = this.e;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CarInfoSpec{make=" + this.a + ", model=" + this.b + ", year=" + this.c + ", headUnitMake=" + this.d + ", headUnitModel=" + this.e + "}";
    }

    public jfz() {
        throw null;
    }
}
