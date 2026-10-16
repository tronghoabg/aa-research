package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
public final class pxo extends UrlRequest.Callback {
    public final zhc a;
    public final pxp b;
    public final /* synthetic */ pxr c;
    public final sm d = new sm((char[]) null, (byte[]) null, (byte[]) null);
    private int e = 1;

    public pxo(pxr pxrVar, zhc zhcVar, pxp pxpVar) {
        this.c = pxrVar;
        this.a = zhcVar;
        this.b = pxpVar;
    }

    public final void a(UrlResponseInfo urlResponseInfo) {
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        String str = pxr.b;
        if (allHeaders.containsKey(str)) {
            Iterator<String> it = allHeaders.get(str).iterator();
            while (it.hasNext()) {
                String strTrim = woy.al(it.next()).trim();
                if (!strTrim.isEmpty()) {
                    try {
                        byte[] bArrJ = ytq.d.j(strTrim);
                        this.c.h.d((zbi) abnv.B(zbi.a, bArrJ, abnj.a));
                    } catch (Exception e) {
                        ((ynz) ((ynz) ((ynz) pxr.a.h()).p(e)).ai((char) 6934)).u("Unable to parse a ServerVersionMetadata proto ");
                    }
                }
            }
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.c.g.execute(new pfq((UrlRequest.Callback) this, cronetException, 16));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
        try {
            if (byteBuffer.hasRemaining()) {
                urlRequest.read(byteBuffer);
                return;
            }
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(131072);
            this.d.x(byteBufferAllocateDirect);
            urlRequest.read(byteBufferAllocateDirect);
        } catch (Exception e) {
            this.a.p(e);
            throw e;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception {
        int i = this.e;
        this.e = i - 1;
        if (i > 0) {
            urlRequest.followRedirect();
            return;
        }
        urlRequest.cancel();
        this.c.g.execute(new pru(this, 14, null));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws Exception {
        String str;
        try {
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (httpStatusCode != 200) {
                urlRequest.cancel();
                this.a.p(new pwv(pwu.b(httpStatusCode)));
                return;
            }
            Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
            if (allHeaders.containsKey("Server-Timing")) {
                Map mapA = pwt.a(allHeaders.get("Server-Timing"));
                if (mapA.containsKey("gfet4t7") && (str = (String) ((Map) mapA.get("gfet4t7")).get("dur")) != null) {
                    pxr pxrVar = this.c;
                    qbv qbvVarA = pvr.a(pxrVar.c.getClass());
                    if (qbvVarA != null) {
                        Math.round(Double.parseDouble(str));
                    }
                }
            }
            Map<String, List<String>> allHeaders2 = urlResponseInfo.getAllHeaders();
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(allHeaders2.containsKey("Content-Length") ? Integer.parseInt(allHeaders2.get("Content-Length").get(0)) + 1 : 131072);
            this.d.x(byteBufferAllocateDirect);
            urlRequest.read(byteBufferAllocateDirect);
        } catch (Exception e) {
            this.a.p(e);
            throw e;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.c.g.execute(new pfq(this, urlResponseInfo, 15, null));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
    }
}
