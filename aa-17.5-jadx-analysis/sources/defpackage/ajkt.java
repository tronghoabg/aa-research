package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ajkt {
    public static final ajkq[] a = {new ajkq(ajkq.f, ""), new ajkq(ajkq.c, "GET"), new ajkq(ajkq.c, "POST"), new ajkq(ajkq.d, "/"), new ajkq(ajkq.d, "/index.html"), new ajkq(ajkq.e, "http"), new ajkq(ajkq.e, "https"), new ajkq(ajkq.b, "200"), new ajkq(ajkq.b, "204"), new ajkq(ajkq.b, "206"), new ajkq(ajkq.b, "304"), new ajkq(ajkq.b, "400"), new ajkq(ajkq.b, "404"), new ajkq(ajkq.b, "500"), new ajkq("accept-charset", ""), new ajkq("accept-encoding", "gzip, deflate"), new ajkq("accept-language", ""), new ajkq("accept-ranges", ""), new ajkq("accept", ""), new ajkq("access-control-allow-origin", ""), new ajkq("age", ""), new ajkq("allow", ""), new ajkq("authorization", ""), new ajkq("cache-control", ""), new ajkq("content-disposition", ""), new ajkq("content-encoding", ""), new ajkq("content-language", ""), new ajkq("content-length", ""), new ajkq("content-location", ""), new ajkq("content-range", ""), new ajkq("content-type", ""), new ajkq("cookie", ""), new ajkq("date", ""), new ajkq("etag", ""), new ajkq("expect", ""), new ajkq("expires", ""), new ajkq("from", ""), new ajkq("host", ""), new ajkq("if-match", ""), new ajkq("if-modified-since", ""), new ajkq("if-none-match", ""), new ajkq("if-range", ""), new ajkq("if-unmodified-since", ""), new ajkq("last-modified", ""), new ajkq("link", ""), new ajkq("location", ""), new ajkq("max-forwards", ""), new ajkq("proxy-authenticate", ""), new ajkq("proxy-authorization", ""), new ajkq("range", ""), new ajkq("referer", ""), new ajkq("refresh", ""), new ajkq("retry-after", ""), new ajkq("server", ""), new ajkq("set-cookie", ""), new ajkq("strict-transport-security", ""), new ajkq("transfer-encoding", ""), new ajkq("user-agent", ""), new ajkq("vary", ""), new ajkq("via", ""), new ajkq("www-authenticate", "")};
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            ajkq[] ajkqVarArr = a;
            if (!linkedHashMap.containsKey(ajkqVarArr[i].g)) {
                linkedHashMap.put(ajkqVarArr[i].g, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static final void a(ajnb ajnbVar) throws IOException {
        int iC = ajnbVar.c();
        for (int i = 0; i < iC; i++) {
            byte bA = ajnbVar.a(i);
            if (bA >= 65 && bA < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(ajnbVar.i()));
            }
        }
    }
}
