package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class aecj {
    public static final ajnb a;
    public static final aecg[] b;
    public static final Map c;

    static {
        ajnb ajnbVar = ajnb.a;
        a = ahfd.b(":");
        int i = 0;
        b = new aecg[]{new aecg(aecg.e, ""), new aecg(aecg.b, "GET"), new aecg(aecg.b, "POST"), new aecg(aecg.c, "/"), new aecg(aecg.c, "/index.html"), new aecg(aecg.d, "http"), new aecg(aecg.d, "https"), new aecg(aecg.a, "200"), new aecg(aecg.a, "204"), new aecg(aecg.a, "206"), new aecg(aecg.a, "304"), new aecg(aecg.a, "400"), new aecg(aecg.a, "404"), new aecg(aecg.a, "500"), new aecg("accept-charset", ""), new aecg("accept-encoding", "gzip, deflate"), new aecg("accept-language", ""), new aecg("accept-ranges", ""), new aecg("accept", ""), new aecg("access-control-allow-origin", ""), new aecg("age", ""), new aecg("allow", ""), new aecg("authorization", ""), new aecg("cache-control", ""), new aecg("content-disposition", ""), new aecg("content-encoding", ""), new aecg("content-language", ""), new aecg("content-length", ""), new aecg("content-location", ""), new aecg("content-range", ""), new aecg("content-type", ""), new aecg("cookie", ""), new aecg("date", ""), new aecg("etag", ""), new aecg("expect", ""), new aecg("expires", ""), new aecg("from", ""), new aecg("host", ""), new aecg("if-match", ""), new aecg("if-modified-since", ""), new aecg("if-none-match", ""), new aecg("if-range", ""), new aecg("if-unmodified-since", ""), new aecg("last-modified", ""), new aecg("link", ""), new aecg("location", ""), new aecg("max-forwards", ""), new aecg("proxy-authenticate", ""), new aecg("proxy-authorization", ""), new aecg("range", ""), new aecg("referer", ""), new aecg("refresh", ""), new aecg("retry-after", ""), new aecg("server", ""), new aecg("set-cookie", ""), new aecg("strict-transport-security", ""), new aecg("transfer-encoding", ""), new aecg("user-agent", ""), new aecg("vary", ""), new aecg("via", ""), new aecg("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            aecg[] aecgVarArr = b;
            int length = aecgVarArr.length;
            if (i >= 61) {
                c = DesugarCollections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(aecgVarArr[i].f)) {
                    linkedHashMap.put(aecgVarArr[i].f, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public static void a(ajnb ajnbVar) throws IOException {
        int iC = ajnbVar.c();
        for (int i = 0; i < iC; i++) {
            byte bA = ajnbVar.a(i);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(ajnbVar.i()));
            }
        }
    }
}
