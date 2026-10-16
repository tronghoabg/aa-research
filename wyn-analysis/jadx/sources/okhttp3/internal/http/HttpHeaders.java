package okhttp3.internal.http;

import Bf.a;
import ab.b;
import cg.C1618g;
import cg.C1621j;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Response;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HttpHeaders {

    /* renamed from: a, reason: collision with root package name */
    public static final C1621j f42640a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1621j f42641b;

    static {
        C1621j c1621j = C1621j.f19903d;
        f42640a = b.c("\"\\");
        f42641b = b.c("\t ,=");
    }

    public static final boolean a(Response response) {
        if (AbstractC3340k.a(response.f42395a.f42377b, "HEAD")) {
            return false;
        }
        int i5 = response.f42398d;
        return (((i5 >= 100 && i5 < 200) || i5 == 204 || i5 == 304) && Util.j(response) == -1 && !"chunked".equalsIgnoreCase(Response.b("Transfer-Encoding", response))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x007c, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(cg.C1618g r17, java.util.ArrayList r18) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.b(cg.g, java.util.ArrayList):void");
    }

    public static final String c(C1618g c1618g) {
        long jM = c1618g.m(f42641b);
        if (jM == -1) {
            jM = c1618g.f19902b;
        }
        if (jM != 0) {
            return c1618g.readString(jM, a.f1670a);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(okhttp3.CookieJar r36, okhttp3.HttpUrl r37, okhttp3.Headers r38) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.d(okhttp3.CookieJar, okhttp3.HttpUrl, okhttp3.Headers):void");
    }

    public static final boolean e(C1618g c1618g) throws EOFException {
        boolean z2 = false;
        while (!c1618g.exhausted()) {
            byte bO = c1618g.o(0L);
            if (bO == 44) {
                c1618g.readByte();
                z2 = true;
            } else {
                if (bO != 32 && bO != 9) {
                    break;
                }
                c1618g.readByte();
            }
        }
        return z2;
    }
}
