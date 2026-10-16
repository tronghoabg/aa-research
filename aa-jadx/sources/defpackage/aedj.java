package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aedj {
    public static final defpackage.ajob a;
    public static final defpackage.aedg[] b;
    public static final java.util.Map c;

    static {
        defpackage.ajob ajobVar = defpackage.ajob.a;
        a = defpackage.airb.b(":");
        int i = 0;
        b = new defpackage.aedg[]{new defpackage.aedg(defpackage.aedg.e, ""), new defpackage.aedg(defpackage.aedg.b, "GET"), new defpackage.aedg(defpackage.aedg.b, "POST"), new defpackage.aedg(defpackage.aedg.c, "/"), new defpackage.aedg(defpackage.aedg.c, "/index.html"), new defpackage.aedg(defpackage.aedg.d, "http"), new defpackage.aedg(defpackage.aedg.d, "https"), new defpackage.aedg(defpackage.aedg.a, "200"), new defpackage.aedg(defpackage.aedg.a, "204"), new defpackage.aedg(defpackage.aedg.a, "206"), new defpackage.aedg(defpackage.aedg.a, "304"), new defpackage.aedg(defpackage.aedg.a, "400"), new defpackage.aedg(defpackage.aedg.a, "404"), new defpackage.aedg(defpackage.aedg.a, "500"), new defpackage.aedg("accept-charset", ""), new defpackage.aedg("accept-encoding", "gzip, deflate"), new defpackage.aedg("accept-language", ""), new defpackage.aedg("accept-ranges", ""), new defpackage.aedg("accept", ""), new defpackage.aedg("access-control-allow-origin", ""), new defpackage.aedg("age", ""), new defpackage.aedg("allow", ""), new defpackage.aedg("authorization", ""), new defpackage.aedg("cache-control", ""), new defpackage.aedg("content-disposition", ""), new defpackage.aedg("content-encoding", ""), new defpackage.aedg("content-language", ""), new defpackage.aedg("content-length", ""), new defpackage.aedg("content-location", ""), new defpackage.aedg("content-range", ""), new defpackage.aedg("content-type", ""), new defpackage.aedg("cookie", ""), new defpackage.aedg("date", ""), new defpackage.aedg("etag", ""), new defpackage.aedg("expect", ""), new defpackage.aedg("expires", ""), new defpackage.aedg("from", ""), new defpackage.aedg("host", ""), new defpackage.aedg("if-match", ""), new defpackage.aedg("if-modified-since", ""), new defpackage.aedg("if-none-match", ""), new defpackage.aedg("if-range", ""), new defpackage.aedg("if-unmodified-since", ""), new defpackage.aedg("last-modified", ""), new defpackage.aedg("link", ""), new defpackage.aedg("location", ""), new defpackage.aedg("max-forwards", ""), new defpackage.aedg("proxy-authenticate", ""), new defpackage.aedg("proxy-authorization", ""), new defpackage.aedg("range", ""), new defpackage.aedg("referer", ""), new defpackage.aedg("refresh", ""), new defpackage.aedg("retry-after", ""), new defpackage.aedg("server", ""), new defpackage.aedg("set-cookie", ""), new defpackage.aedg("strict-transport-security", ""), new defpackage.aedg("transfer-encoding", ""), new defpackage.aedg("user-agent", ""), new defpackage.aedg("vary", ""), new defpackage.aedg("via", ""), new defpackage.aedg("www-authenticate", "")};
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(61);
        while (true) {
            defpackage.aedg[] aedgVarArr = b;
            int length = aedgVarArr.length;
            if (i >= 61) {
                c = j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(aedgVarArr[i].f)) {
                    linkedHashMap.put(aedgVarArr[i].f, java.lang.Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public static void a(defpackage.ajob ajobVar) throws java.io.IOException {
        int iC = ajobVar.c();
        for (int i = 0; i < iC; i++) {
            byte bA = ajobVar.a(i);
            if (bA >= 65 && bA <= 90) {
                throw new java.io.IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(ajobVar.i()));
            }
        }
    }
}
