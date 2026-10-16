package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tht {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.StrListParamParser");

    public static defpackage.ygw a(java.util.function.Function function, defpackage.absx absxVar) {
        j$.util.stream.Stream streamD = d(function, absxVar);
        int i = defpackage.ygw.d;
        return (defpackage.ygw) streamD.collect(defpackage.yds.a);
    }

    public static defpackage.yhe b(java.util.function.Function function, defpackage.absx absxVar) {
        return (defpackage.yhe) d(function, absxVar).collect(defpackage.yds.b(new defpackage.mmf(18), new defpackage.mmf(19), new defpackage.ydl(1)));
    }

    public static defpackage.yhx c(java.util.function.Function function, defpackage.absx absxVar) {
        return (defpackage.yhx) d(function, absxVar).collect(defpackage.yds.b);
    }

    public static j$.util.stream.Stream d(java.util.function.Function function, defpackage.absx absxVar) {
        return j$.util.Collection.-EL.stream(absxVar.b).map(function).filter(new defpackage.iux(7));
    }

    public static java.util.Map.Entry e(java.lang.String str) {
        j$.util.Optional optionalOf;
        java.lang.String[] strArrSplit = str.split(":", 2);
        java.lang.String str2 = strArrSplit[0];
        if (strArrSplit.length < 2) {
            optionalOf = j$.util.Optional.empty();
        } else {
            try {
                optionalOf = j$.util.Optional.of(java.lang.Long.valueOf(java.lang.Long.parseLong(strArrSplit[1])));
                if (((java.lang.Long) optionalOf.get()).longValue() <= 0) {
                    ((defpackage.yqj) a.l().ai((char) 9054)).M("Ignoring non-positive versionCode %s for package %s.", optionalOf.get(), str2);
                    return null;
                }
            } catch (java.lang.NumberFormatException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(9055)).y("Expected a long versionCode in colon-delimited string, got %s!", strArrSplit[1]);
                return null;
            }
        }
        return new java.util.AbstractMap.SimpleImmutableEntry(str2, optionalOf);
    }

    public static java.util.Map.Entry f(java.lang.String str) {
        java.lang.String strSubstring;
        java.util.List listI = new defpackage.xzd(new defpackage.xyx(new defpackage.xxo(':'))).i(str);
        if (listI.size() < 2) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 9058)).y("Flag entry is missing required min and max versions: %s", str);
            return null;
        }
        java.lang.String str2 = (java.lang.String) defpackage.ysr.an(listI);
        java.lang.String str3 = (java.lang.String) listI.get(listI.size() - 2);
        if (listI.size() > 2) {
            strSubstring = str.substring(0, str.length() - ((str2.length() + str3.length()) + 2));
        } else {
            strSubstring = "";
        }
        long jG = defpackage.xzh.a(str3) ? 0L : g(str3);
        long jG2 = defpackage.xzh.a(str2) ? Long.MAX_VALUE : g(str2);
        android.util.Range range = (jG == null || jG2 == null) ? null : new android.util.Range(jG, jG2);
        if (range != null) {
            return new java.util.AbstractMap.SimpleImmutableEntry(strSubstring, range);
        }
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 9057)).y("Invalid versions when parsing flag: %s", str);
        return null;
    }

    private static java.lang.Long g(java.lang.String str) {
        try {
            long j = java.lang.Long.parseLong(str);
            java.lang.Long lValueOf = java.lang.Long.valueOf(j);
            lValueOf.getClass();
            if (j >= 0) {
                return lValueOf;
            }
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(9052)).y("Negative version: %s, when parsing flag", lValueOf);
            return null;
        } catch (java.lang.NumberFormatException unused) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 9053)).y("Non numeric version: %s, when parsing flag", str);
            return null;
        }
    }
}
