package defpackage;

import j$.util.DesugarCollections;
import java.text.DateFormatSymbols;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.jni_zero.CommonApis;

/* loaded from: classes2.dex */
public final class akci {
    public static volatile Map a;
    public static volatile CommonApis b;
    private static final CommonApis c;

    static {
        CommonApis commonApis = new CommonApis();
        c = commonApis;
        b = commonApis;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", akcl.a);
        linkedHashMap.put("UTC", akcl.a);
        linkedHashMap.put("GMT", akcl.a);
        c(linkedHashMap, "EST", "America/New_York");
        c(linkedHashMap, "EDT", "America/New_York");
        c(linkedHashMap, "CST", "America/Chicago");
        c(linkedHashMap, "CDT", "America/Chicago");
        c(linkedHashMap, "MST", "America/Denver");
        c(linkedHashMap, "MDT", "America/Denver");
        c(linkedHashMap, "PST", "America/Los_Angeles");
        c(linkedHashMap, "PDT", "America/Los_Angeles");
        a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static final DateFormatSymbols a(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final akcd b(akcd akcdVar) {
        return akcdVar == null ? akdr.N() : akcdVar;
    }

    private static void c(Map map, String str, String str2) {
        try {
            map.put(str, akcl.i(str2));
        } catch (RuntimeException unused) {
        }
    }
}
