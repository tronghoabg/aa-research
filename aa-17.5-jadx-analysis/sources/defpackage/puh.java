package defpackage;

import j$.time.Duration;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
public final class puh extends UrlRequest.Callback {
    public final zhc a;
    public final pui b;
    public final /* synthetic */ puj c;
    public rjg d;

    public puh(puj pujVar, zhc zhcVar, pui puiVar) {
        this.c = pujVar;
        this.a = zhcVar;
        this.b = puiVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.c.l.execute(new pfq((UrlRequest.Callback) this, cronetException, 14));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
        byteBuffer.flip();
        try {
            rjg rjgVar = this.d;
            Object obj = rjgVar.a;
            if (obj != null) {
                ((ByteBuffer) obj).put(byteBuffer);
            } else {
                Object obj2 = rjgVar.b;
                if (obj2 == null) {
                    throw new NullPointerException("Neither the ByteBuffer nor the ByteArrayOutputStream is non-null!");
                }
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = new byte[iRemaining];
                byteBuffer.get(bArr);
                ((ByteArrayOutputStream) obj2).write(bArr, 0, iRemaining);
            }
        } catch (Exception e) {
            this.a.p(e);
        }
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception {
        ((ynz) ((ynz) ((ynz) puj.a.g()).p(new RuntimeException("Unexpected redirect received from GMM Server for request: ".concat(String.valueOf(this.c.b.getClass().getName()))))).ai((char) 6894)).u("AsyncGmmServerProtocolRpc");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        qbv qbvVarA;
        try {
            pui puiVar = this.b;
            vaq.d();
            pwz pwzVar = puiVar.a;
            puj pujVar = puiVar.b;
            pwzVar.b(Duration.ofMillis(pujVar.g.a()));
            Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
            if (!pujVar.k.isEmpty()) {
                erb erbVar = pujVar.n;
                Class<?> cls = pujVar.b.getClass();
                ygr ygrVar = pujVar.k;
                Map map = pvj.a;
                erbVar.getClass();
                cls.getClass();
                ygrVar.getClass();
                if (((accb) pvj.a.get(cls.getName())) != null) {
                    qbu qbuVar = pyd.a;
                    qbuVar.getClass();
                    abnp abnpVarN = zbu.a.n();
                    abnp abnpVarN2 = zbt.a.n();
                    abnpVarN2.t();
                    zbt zbtVar = (zbt) abnpVarN2.b;
                    abod abodVar = zbtVar.b;
                    if (!abodVar.c()) {
                        zbtVar.b = abnv.G(abodVar);
                    }
                    abmc.i(ygrVar, zbtVar.b);
                    zbt zbtVar2 = (zbt) abnpVarN2.q();
                    abnpVarN.t();
                    zbu zbuVar = (zbu) abnpVarN.b;
                    zbtVar2.getClass();
                    zbuVar.v = zbtVar2;
                    zbuVar.f |= 128;
                }
            }
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (httpStatusCode != 200) {
                throw new pwv(pwu.b(httpStatusCode));
            }
            if (allHeaders.containsKey("Server-Timing")) {
                Map mapA = pwt.a(allHeaders.get("Server-Timing"));
                if (mapA.containsKey("gfet4t7")) {
                    Map map2 = (Map) mapA.get("gfet4t7");
                    if (map2.containsKey("dur") && (qbvVarA = pvr.a(pujVar.b.getClass())) != null) {
                        Math.round(Double.parseDouble((String) map2.get("dur")));
                    }
                }
            }
            if (!allHeaders.containsKey("Content-Type") || !woy.al(allHeaders.get("Content-Type").get(0)).equals("application/binary")) {
                throw new pwv(pwu.e);
            }
            this.d = allHeaders.containsKey("Content-Length") ? new rjg(Integer.parseInt(allHeaders.get("Content-Length").get(0))) : new rjg();
            urlRequest.read(ByteBuffer.allocateDirect(131072));
        } catch (Exception e) {
            this.a.p(e);
            urlRequest.cancel();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.c.l.execute(new pru(this, 8, null));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
    }
}
