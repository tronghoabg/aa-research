package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes3.dex */
public final class vkh extends UrlRequest.Callback {
    public final zhc a;
    final /* synthetic */ vki b;
    public final sm c = new sm((char[]) null, (byte[]) null, (byte[]) null);
    private int d = 32;

    public vkh(vki vkiVar, zhc zhcVar) {
        this.b = vkiVar;
        this.a = zhcVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.b.a.execute(new upk(this, 5));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.b.a.execute(new unj(this, cronetException, 9));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            urlRequest.read(byteBuffer);
            return;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.d);
        this.c.x(byteBufferAllocateDirect);
        urlRequest.read(byteBufferAllocateDirect);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        this.b.a.execute(new upk(this, 4));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        try {
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (httpStatusCode != 200) {
                this.a.p(new pwv(pwu.b(httpStatusCode)));
                return;
            }
            Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
            if (allHeaders.containsKey("Content-Length")) {
                this.d = Integer.parseInt(allHeaders.get("Content-Length").get(0));
            }
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.d);
            this.c.x(byteBufferAllocateDirect);
            urlRequest.read(byteBufferAllocateDirect);
        } catch (RuntimeException e) {
            this.a.p(e);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.b.a.execute(new upk(this, 6));
    }
}
