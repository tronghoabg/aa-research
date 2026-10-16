package rd;

import cg.C1621j;
import com.unity3d.services.core.network.model.HttpRequest;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: rd.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3970e {

    /* renamed from: a, reason: collision with root package name */
    public static final C1621j f44775a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3967b[] f44776b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f44777c;

    static {
        C1621j c1621j = C1621j.f19903d;
        f44775a = ab.b.c(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        C3967b c3967b = new C3967b(C3967b.f44758h, "");
        C1621j c1621j2 = C3967b.f44755e;
        C3967b c3967b2 = new C3967b(c1621j2, "GET");
        C3967b c3967b3 = new C3967b(c1621j2, "POST");
        C1621j c1621j3 = C3967b.f44756f;
        C3967b c3967b4 = new C3967b(c1621j3, "/");
        C3967b c3967b5 = new C3967b(c1621j3, "/index.html");
        C1621j c1621j4 = C3967b.f44757g;
        C3967b c3967b6 = new C3967b(c1621j4, "http");
        C3967b c3967b7 = new C3967b(c1621j4, HttpRequest.DEFAULT_SCHEME);
        C1621j c1621j5 = C3967b.f44754d;
        C3967b[] c3967bArr = {c3967b, c3967b2, c3967b3, c3967b4, c3967b5, c3967b6, c3967b7, new C3967b(c1621j5, "200"), new C3967b(c1621j5, "204"), new C3967b(c1621j5, "206"), new C3967b(c1621j5, "304"), new C3967b(c1621j5, "400"), new C3967b(c1621j5, "404"), new C3967b(c1621j5, "500"), new C3967b("accept-charset", ""), new C3967b("accept-encoding", "gzip, deflate"), new C3967b("accept-language", ""), new C3967b("accept-ranges", ""), new C3967b("accept", ""), new C3967b("access-control-allow-origin", ""), new C3967b("age", ""), new C3967b("allow", ""), new C3967b("authorization", ""), new C3967b("cache-control", ""), new C3967b("content-disposition", ""), new C3967b("content-encoding", ""), new C3967b("content-language", ""), new C3967b("content-length", ""), new C3967b("content-location", ""), new C3967b("content-range", ""), new C3967b("content-type", ""), new C3967b("cookie", ""), new C3967b("date", ""), new C3967b("etag", ""), new C3967b("expect", ""), new C3967b("expires", ""), new C3967b("from", ""), new C3967b("host", ""), new C3967b("if-match", ""), new C3967b("if-modified-since", ""), new C3967b("if-none-match", ""), new C3967b("if-range", ""), new C3967b("if-unmodified-since", ""), new C3967b("last-modified", ""), new C3967b("link", ""), new C3967b("location", ""), new C3967b("max-forwards", ""), new C3967b("proxy-authenticate", ""), new C3967b("proxy-authorization", ""), new C3967b("range", ""), new C3967b("referer", ""), new C3967b("refresh", ""), new C3967b("retry-after", ""), new C3967b("server", ""), new C3967b("set-cookie", ""), new C3967b("strict-transport-security", ""), new C3967b("transfer-encoding", ""), new C3967b("user-agent", ""), new C3967b("vary", ""), new C3967b("via", ""), new C3967b("www-authenticate", "")};
        f44776b = c3967bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i5 = 0; i5 < 61; i5++) {
            if (!linkedHashMap.containsKey(c3967bArr[i5].f44759a)) {
                linkedHashMap.put(c3967bArr[i5].f44759a, Integer.valueOf(i5));
            }
        }
        f44777c = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static void a(C1621j c1621j) throws IOException {
        int iD = c1621j.d();
        for (int i5 = 0; i5 < iD; i5++) {
            byte bI = c1621j.i(i5);
            if (bI >= 65 && bI <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c1621j.t()));
            }
        }
    }
}
