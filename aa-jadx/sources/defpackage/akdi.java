package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akdi {
    public static volatile java.util.Map a;
    public static volatile org.jni_zero.CommonApis b;
    private static final org.jni_zero.CommonApis c;

    static {
        org.jni_zero.CommonApis commonApis = new org.jni_zero.CommonApis();
        c = commonApis;
        b = commonApis;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("UT", defpackage.akdl.a);
        linkedHashMap.put("UTC", defpackage.akdl.a);
        linkedHashMap.put("GMT", defpackage.akdl.a);
        c(linkedHashMap, "EST", "America/New_York");
        c(linkedHashMap, "EDT", "America/New_York");
        c(linkedHashMap, "CST", "America/Chicago");
        c(linkedHashMap, "CDT", "America/Chicago");
        c(linkedHashMap, "MST", "America/Denver");
        c(linkedHashMap, "MDT", "America/Denver");
        c(linkedHashMap, "PST", "America/Los_Angeles");
        c(linkedHashMap, "PDT", "America/Los_Angeles");
        a = j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static final java.text.DateFormatSymbols a(java.util.Locale locale) {
        try {
            return (java.text.DateFormatSymbols) java.text.DateFormatSymbols.class.getMethod("getInstance", java.util.Locale.class).invoke(null, locale);
        } catch (java.lang.Exception unused) {
            return new java.text.DateFormatSymbols(locale);
        }
    }

    public static final defpackage.akdd b(defpackage.akdd akddVar) {
        return akddVar == null ? defpackage.aker.N() : akddVar;
    }

    private static void c(java.util.Map map, java.lang.String str, java.lang.String str2) {
        try {
            map.put(str, defpackage.akdl.i(str2));
        } catch (java.lang.RuntimeException unused) {
        }
    }
}
