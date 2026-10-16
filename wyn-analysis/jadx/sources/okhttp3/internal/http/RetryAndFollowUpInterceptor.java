package okhttp3.internal.http;

import com.google.android.gms.common.api.f;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f42656a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;", "", "()V", "MAX_FOLLOW_UPS", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public RetryAndFollowUpInterceptor(OkHttpClient client) {
        AbstractC3340k.e(client, "client");
        this.f42656a = client;
    }

    public static int c(Response response, int i5) throws NumberFormatException {
        String strB = Response.b(CommonGatewayClient.HEADER_RETRY_AFTER, response);
        if (strB == null) {
            return i5;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC3340k.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strB).matches()) {
            return f.API_PRIORITY_OTHER;
        }
        Integer numValueOf = Integer.valueOf(strB);
        AbstractC3340k.d(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Request a(okhttp3.Response r11, okhttp3.internal.connection.Exchange r12) throws java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.a(okhttp3.Response, okhttp3.internal.connection.Exchange):okhttp3.Request");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.io.IOException r4, okhttp3.internal.connection.RealCall r5, okhttp3.Request r6, boolean r7) {
        /*
            r3 = this;
            okhttp3.OkHttpClient r0 = r3.f42656a
            boolean r0 = r0.f42321f
            r1 = 0
            if (r0 != 0) goto L9
            goto La6
        L9:
            if (r7 == 0) goto L1a
            okhttp3.RequestBody r6 = r6.f42379d
            if (r6 == 0) goto L15
            boolean r6 = r6.isOneShot()
            if (r6 != 0) goto La6
        L15:
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L1a
            return r1
        L1a:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L1f
            return r1
        L1f:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L2a
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto La6
            if (r7 != 0) goto La6
            goto L3d
        L2a:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L38
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L38
            goto La6
        L38:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L3d
            return r1
        L3d:
            okhttp3.internal.connection.ExchangeFinder r4 = r5.f42584h
            kotlin.jvm.internal.AbstractC3340k.b(r4)
            int r5 = r4.f42573g
            r6 = 1
            if (r5 != 0) goto L51
            int r7 = r4.f42574h
            if (r7 != 0) goto L51
            int r7 = r4.f42575i
            if (r7 != 0) goto L51
            r4 = r1
            goto La4
        L51:
            okhttp3.Route r7 = r4.f42576j
            if (r7 == 0) goto L56
            goto L9f
        L56:
            r7 = 0
            if (r5 > r6) goto L89
            int r5 = r4.f42574h
            if (r5 > r6) goto L89
            int r5 = r4.f42575i
            if (r5 <= 0) goto L62
            goto L89
        L62:
            okhttp3.internal.connection.RealCall r5 = r4.f42569c
            okhttp3.internal.connection.RealConnection r5 = r5.f42585i
            if (r5 != 0) goto L69
            goto L89
        L69:
            monitor-enter(r5)
            int r0 = r5.f42607l     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L70
            monitor-exit(r5)
            goto L89
        L70:
            okhttp3.Route r0 = r5.f42598b     // Catch: java.lang.Throwable -> L86
            okhttp3.Address r0 = r0.f42427a     // Catch: java.lang.Throwable -> L86
            okhttp3.HttpUrl r0 = r0.f42144h     // Catch: java.lang.Throwable -> L86
            okhttp3.Address r2 = r4.f42568b     // Catch: java.lang.Throwable -> L86
            okhttp3.HttpUrl r2 = r2.f42144h     // Catch: java.lang.Throwable -> L86
            boolean r0 = okhttp3.internal.Util.a(r0, r2)     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L82
            monitor-exit(r5)
            goto L89
        L82:
            okhttp3.Route r7 = r5.f42598b     // Catch: java.lang.Throwable -> L86
            monitor-exit(r5)
            goto L89
        L86:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L89:
            if (r7 == 0) goto L8f
            r4.f42576j = r7
        L8d:
            r4 = r6
            goto La4
        L8f:
            okhttp3.internal.connection.RouteSelector$Selection r5 = r4.f42571e
            if (r5 != 0) goto L94
            goto L9b
        L94:
            boolean r5 = r5.a()
            if (r5 != r6) goto L9b
            goto L9f
        L9b:
            okhttp3.internal.connection.RouteSelector r4 = r4.f42572f
            if (r4 != 0) goto La0
        L9f:
            goto L8d
        La0:
            boolean r4 = r4.a()
        La4:
            if (r4 != 0) goto La7
        La6:
            return r1
        La7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.b(java.io.IOException, okhttp3.internal.connection.RealCall, okhttp3.Request, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r9 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        r0 = r0.h();
        r4 = r9.h();
        r4.f42414g = null;
        r4 = r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (r4.f42401g != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        r0.f42417j = r4;
        r0 = r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        throw new java.lang.IllegalArgumentException("priorResponse.body != null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        r0 = r3.k;
        r4 = a(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (r4 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        if (r0.f42554e == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        if (r3.f42586j != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        r3.f42586j = true;
        r3.f42581e.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        r3.c(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        r0 = r4.f42379d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        if (r0.isOneShot() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
    
        r3.c(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
    
        r0 = r9.f42401g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
    
        if (r0 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e9, code lost:
    
        okhttp3.internal.Util.c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f0, code lost:
    
        if (r10 > 20) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0107, code lost:
    
        throw new java.net.ProtocolException(kotlin.jvm.internal.AbstractC3340k.k(java.lang.Integer.valueOf(r10), "Too many follow-up requests: "));
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r25) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
