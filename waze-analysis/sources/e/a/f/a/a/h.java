package e.a.f.a.a;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.webkit.ProxyConfig;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final k.k f47511a;

    /* renamed from: b, reason: collision with root package name */
    private static final e[] f47512b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f47513c;

    static {
        k.k kVar = k.k.f50843a;
        f47511a = okhttp3.internal.publicsuffix.a.d(":");
        int i2 = 0;
        f47512b = new e[]{new e(e.f47494e, ""), new e(e.f47491b, ShareTarget.METHOD_GET), new e(e.f47491b, ShareTarget.METHOD_POST), new e(e.f47492c, DomExceptionUtils.SEPARATOR), new e(e.f47492c, "/index.html"), new e(e.f47493d, ProxyConfig.MATCH_HTTP), new e(e.f47493d, ProxyConfig.MATCH_HTTPS), new e(e.f47490a, "200"), new e(e.f47490a, "204"), new e(e.f47490a, "206"), new e(e.f47490a, "304"), new e(e.f47490a, "400"), new e(e.f47490a, "404"), new e(e.f47490a, "500"), new e("accept-charset", ""), new e("accept-encoding", "gzip, deflate"), new e("accept-language", ""), new e("accept-ranges", ""), new e("accept", ""), new e("access-control-allow-origin", ""), new e("age", ""), new e("allow", ""), new e("authorization", ""), new e("cache-control", ""), new e("content-disposition", ""), new e("content-encoding", ""), new e("content-language", ""), new e("content-length", ""), new e("content-location", ""), new e("content-range", ""), new e("content-type", ""), new e("cookie", ""), new e("date", ""), new e("etag", ""), new e("expect", ""), new e("expires", ""), new e(TypedValues.TransitionType.S_FROM, ""), new e("host", ""), new e("if-match", ""), new e("if-modified-since", ""), new e("if-none-match", ""), new e("if-range", ""), new e("if-unmodified-since", ""), new e("last-modified", ""), new e("link", ""), new e("location", ""), new e("max-forwards", ""), new e("proxy-authenticate", ""), new e("proxy-authorization", ""), new e("range", ""), new e("referer", ""), new e("refresh", ""), new e("retry-after", ""), new e("server", ""), new e("set-cookie", ""), new e("strict-transport-security", ""), new e("transfer-encoding", ""), new e("user-agent", ""), new e("vary", ""), new e("via", ""), new e("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            e[] eVarArr = f47512b;
            int length = eVarArr.length;
            if (i2 >= 61) {
                f47513c = DesugarCollections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(eVarArr[i2].f47495f)) {
                    linkedHashMap.put(eVarArr[i2].f47495f, Integer.valueOf(i2));
                }
                i2++;
            }
        }
    }

    static /* bridge */ /* synthetic */ void d(k.k kVar) throws IOException {
        int iD = kVar.d();
        for (int i2 = 0; i2 < iD; i2++) {
            byte bA = kVar.a(i2);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(kVar.i()));
            }
        }
    }
}
