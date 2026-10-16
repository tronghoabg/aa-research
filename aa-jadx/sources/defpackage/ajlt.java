package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajlt {
    public static final defpackage.ajlq[] a = {new defpackage.ajlq(defpackage.ajlq.f, ""), new defpackage.ajlq(defpackage.ajlq.c, "GET"), new defpackage.ajlq(defpackage.ajlq.c, "POST"), new defpackage.ajlq(defpackage.ajlq.d, "/"), new defpackage.ajlq(defpackage.ajlq.d, "/index.html"), new defpackage.ajlq(defpackage.ajlq.e, "http"), new defpackage.ajlq(defpackage.ajlq.e, "https"), new defpackage.ajlq(defpackage.ajlq.b, "200"), new defpackage.ajlq(defpackage.ajlq.b, "204"), new defpackage.ajlq(defpackage.ajlq.b, "206"), new defpackage.ajlq(defpackage.ajlq.b, "304"), new defpackage.ajlq(defpackage.ajlq.b, "400"), new defpackage.ajlq(defpackage.ajlq.b, "404"), new defpackage.ajlq(defpackage.ajlq.b, "500"), new defpackage.ajlq("accept-charset", ""), new defpackage.ajlq("accept-encoding", "gzip, deflate"), new defpackage.ajlq("accept-language", ""), new defpackage.ajlq("accept-ranges", ""), new defpackage.ajlq("accept", ""), new defpackage.ajlq("access-control-allow-origin", ""), new defpackage.ajlq("age", ""), new defpackage.ajlq("allow", ""), new defpackage.ajlq("authorization", ""), new defpackage.ajlq("cache-control", ""), new defpackage.ajlq("content-disposition", ""), new defpackage.ajlq("content-encoding", ""), new defpackage.ajlq("content-language", ""), new defpackage.ajlq("content-length", ""), new defpackage.ajlq("content-location", ""), new defpackage.ajlq("content-range", ""), new defpackage.ajlq("content-type", ""), new defpackage.ajlq("cookie", ""), new defpackage.ajlq("date", ""), new defpackage.ajlq("etag", ""), new defpackage.ajlq("expect", ""), new defpackage.ajlq("expires", ""), new defpackage.ajlq("from", ""), new defpackage.ajlq("host", ""), new defpackage.ajlq("if-match", ""), new defpackage.ajlq("if-modified-since", ""), new defpackage.ajlq("if-none-match", ""), new defpackage.ajlq("if-range", ""), new defpackage.ajlq("if-unmodified-since", ""), new defpackage.ajlq("last-modified", ""), new defpackage.ajlq("link", ""), new defpackage.ajlq("location", ""), new defpackage.ajlq("max-forwards", ""), new defpackage.ajlq("proxy-authenticate", ""), new defpackage.ajlq("proxy-authorization", ""), new defpackage.ajlq("range", ""), new defpackage.ajlq("referer", ""), new defpackage.ajlq("refresh", ""), new defpackage.ajlq("retry-after", ""), new defpackage.ajlq("server", ""), new defpackage.ajlq("set-cookie", ""), new defpackage.ajlq("strict-transport-security", ""), new defpackage.ajlq("transfer-encoding", ""), new defpackage.ajlq("user-agent", ""), new defpackage.ajlq("vary", ""), new defpackage.ajlq("via", ""), new defpackage.ajlq("www-authenticate", "")};
    public static final java.util.Map b;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            defpackage.ajlq[] ajlqVarArr = a;
            if (!linkedHashMap.containsKey(ajlqVarArr[i].g)) {
                linkedHashMap.put(ajlqVarArr[i].g, java.lang.Integer.valueOf(i));
            }
        }
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static final void a(defpackage.ajob ajobVar) throws java.io.IOException {
        int iC = ajobVar.c();
        for (int i = 0; i < iC; i++) {
            byte bA = ajobVar.a(i);
            if (bA >= 65 && bA < 91) {
                throw new java.io.IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(ajobVar.i()));
            }
        }
    }
}
