package org.chromium.net.impl;

import android.net.http.UrlRequest;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes2.dex */
class AndroidUrlRequestWrapper extends ExperimentalUrlRequest {
    private final UrlRequest a;
    private final AndroidHttpEngineWrapper b;
    private final String c;
    private final Collection d;
    private final VersionSafeCallbacks.RequestFinishedInfoListener e;

    public AndroidUrlRequestWrapper(UrlRequest urlRequest, AndroidHttpEngineWrapper androidHttpEngineWrapper, String str, Collection<Object> collection, RequestFinishedInfo.Listener listener) {
        this.a = urlRequest;
        this.b = androidHttpEngineWrapper;
        this.c = str;
        this.d = collection;
        this.e = listener == null ? null : new VersionSafeCallbacks.RequestFinishedInfoListener(listener);
    }

    final void a(int i, AndroidUrlResponseInfoWrapper androidUrlResponseInfoWrapper, CronetException cronetException) {
        AndroidRequestFinishedInfoWrapper.a(this.b, this.c, this.d, this.e, i, androidUrlResponseInfoWrapper, cronetException);
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        this.a.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        this.a.getStatus(new AndroidUrlRequestStatusListenerWrapper(statusListener));
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.a.start();
    }
}
