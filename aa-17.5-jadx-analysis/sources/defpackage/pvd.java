package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
final class pvd extends UrlRequest.Callback {
    final /* synthetic */ pve a;
    private final zhc b;
    private final ByteArrayOutputStream c = new ByteArrayOutputStream(8192);
    private int d;

    public pvd(pve pveVar, zhc zhcVar) {
        this.a = pveVar;
        this.b = zhcVar;
        this.d = pveVar.b.e.e;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.b.p(lws.G(cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        this.c.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit());
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (this.d > 0) {
            if (!this.a.b.b.c || pve.b(str)) {
                this.d--;
                urlRequest.followRedirect();
                return;
            } else {
                urlRequest.cancel();
                this.b.p(new pwv(pwu.h.e("Don't send authentication credentials to non-Google redirects.")));
                return;
            }
        }
        urlRequest.cancel();
        zhc zhcVar = this.b;
        pve pveVar = this.a;
        zhcVar.p(new pwv(pwu.h.e("More redirects than allowed: " + pveVar.b.e.e)));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (pve.a.contains(Integer.valueOf(urlResponseInfo.getHttpStatusCode()))) {
            urlRequest.read(ByteBuffer.allocateDirect(8192));
            return;
        }
        urlRequest.cancel();
        this.b.p(new pwv(pwu.h.e("Expected HTTP status code 200, but got " + urlResponseInfo.getHttpStatusCode())));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        try {
            abnp abnpVarN = pvi.a.n();
            abms abmsVarV = abms.v(this.c.toByteArray());
            abnpVarN.t();
            pvi pviVar = (pvi) abnpVarN.b;
            abmsVarV.getClass();
            pviVar.b |= 1;
            pviVar.c = abmsVarV;
            if (urlResponseInfo.getAllHeaders().containsKey("content-type") && !urlResponseInfo.getAllHeaders().get("content-type").isEmpty()) {
                String str = urlResponseInfo.getAllHeaders().get("content-type").get(0);
                abnpVarN.t();
                pvi pviVar2 = (pvi) abnpVarN.b;
                str.getClass();
                pviVar2.b |= 2;
                pviVar2.d = str;
            }
            this.b.o(abnpVarN.q());
        } catch (ClassCastException unused) {
            this.b.p(new pwv(pwu.l.e("Expected type HttpResponse")));
        }
    }
}
