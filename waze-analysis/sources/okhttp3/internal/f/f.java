package okhttp3.internal.f;

import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.webkit.ProxyConfig;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56175a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final c[] f56176b = {new c(c.f56156f, ""), new c(c.f56153c, ShareTarget.METHOD_GET), new c(c.f56153c, ShareTarget.METHOD_POST), new c(c.f56154d, DomExceptionUtils.SEPARATOR), new c(c.f56154d, "/index.html"), new c(c.f56155e, ProxyConfig.MATCH_HTTP), new c(c.f56155e, ProxyConfig.MATCH_HTTPS), new c(c.f56152b, "200"), new c(c.f56152b, "204"), new c(c.f56152b, "206"), new c(c.f56152b, "304"), new c(c.f56152b, "400"), new c(c.f56152b, "404"), new c(c.f56152b, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c(TypedValues.TransitionType.S_FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};

    /* renamed from: c, reason: collision with root package name */
    private static final Map f56177c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i2 = 0; i2 < 61; i2++) {
            c[] cVarArr = f56176b;
            if (!linkedHashMap.containsKey(cVarArr[i2].f56157g)) {
                linkedHashMap.put(cVarArr[i2].f56157g, Integer.valueOf(i2));
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        h.g.b.x.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        f56177c = mapUnmodifiableMap;
    }

    public static final void a(k.k kVar) throws IOException {
        h.g.b.x.f(kVar, HintConstants.AUTOFILL_HINT_NAME);
        int iD = kVar.d();
        for (int i2 = 0; i2 < iD; i2++) {
            byte bA = kVar.a(i2);
            if (bA >= 65 && bA < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(kVar.i()));
            }
        }
    }

    public static final Map b() {
        return f56177c;
    }

    public static final c[] c() {
        return f56176b;
    }
}
