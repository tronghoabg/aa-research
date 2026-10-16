package defpackage;

import android.util.Range;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class tgx {
    public static final yph a = yph.c("GH.StrListParamParser");

    public static yfq a(Function function, abru abruVar) {
        Stream streamD = d(function, abruVar);
        int i = yfq.d;
        return (yfq) streamD.collect(ycm.a);
    }

    public static yfy b(Function function, abru abruVar) {
        return (yfy) d(function, abruVar).collect(ycm.b(new kqm(17), new kqm(18), new ycf(1)));
    }

    public static ygr c(Function function, abru abruVar) {
        return (ygr) d(function, abruVar).collect(ycm.b);
    }

    public static Stream d(Function function, abru abruVar) {
        return Collection.EL.stream(abruVar.b).map(function).filter(new iup(8));
    }

    public static Map.Entry e(String str) {
        Optional optionalOf;
        String[] strArrSplit = str.split(":", 2);
        String str2 = strArrSplit[0];
        if (strArrSplit.length < 2) {
            optionalOf = Optional.empty();
        } else {
            try {
                optionalOf = Optional.of(Long.valueOf(Long.parseLong(strArrSplit[1])));
                if (((Long) optionalOf.get()).longValue() <= 0) {
                    ((ype) a.l().ai((char) 9029)).M("Ignoring non-positive versionCode %s for package %s.", optionalOf.get(), str2);
                    return null;
                }
            } catch (NumberFormatException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai(9030)).y("Expected a long versionCode in colon-delimited string, got %s!", strArrSplit[1]);
                return null;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(str2, optionalOf);
    }

    public static Map.Entry f(String str) {
        List listI = new xxx(new xxr(new xwi(':'))).i(str);
        if (listI.size() < 2) {
            ((ype) ((ype) a.g()).ai((char) 9033)).y("Flag entry is missing required min and max versions: %s", str);
            return null;
        }
        String str2 = (String) yrm.an(listI);
        String str3 = (String) listI.get(listI.size() - 2);
        String strSubstring = listI.size() > 2 ? str.substring(0, str.length() - ((str2.length() + str3.length()) + 2)) : "";
        long jG = xyb.a(str3) ? 0L : g(str3);
        long jG2 = xyb.a(str2) ? Long.MAX_VALUE : g(str2);
        Range range = (jG == null || jG2 == null) ? null : new Range(jG, jG2);
        if (range != null) {
            return new AbstractMap.SimpleImmutableEntry(strSubstring, range);
        }
        ((ype) ((ype) a.g()).ai((char) 9032)).y("Invalid versions when parsing flag: %s", str);
        return null;
    }

    private static Long g(String str) throws NumberFormatException {
        try {
            long j = Long.parseLong(str);
            Long lValueOf = Long.valueOf(j);
            lValueOf.getClass();
            if (j >= 0) {
                return lValueOf;
            }
            ((ype) ((ype) a.g()).ai(9027)).y("Negative version: %s, when parsing flag", lValueOf);
            return null;
        } catch (NumberFormatException unused) {
            ((ype) ((ype) a.g()).ai((char) 9028)).y("Non numeric version: %s, when parsing flag", str);
            return null;
        }
    }
}
