package org.chromium.net.impl;

import defpackage.ahkw;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes2.dex */
class AndroidRequestFinishedInfoWrapper extends RequestFinishedInfoImpl {
    private static final String b = "RequestFinishedInfoImpl";
    private static boolean c;

    private AndroidRequestFinishedInfoWrapper(String str, Collection<Object> collection, RequestFinishedInfo.Metrics metrics, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        super(str, collection, metrics, i, urlResponseInfo, cronetException);
    }

    static void a(AndroidHttpEngineWrapper androidHttpEngineWrapper, String str, Collection collection, VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        androidHttpEngineWrapper.a(new AndroidRequestFinishedInfoWrapper(str, collection, new CronetMetrics(-1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, 0L, 0L), i, urlResponseInfo, cronetException), requestFinishedInfoListener);
    }

    @Override // org.chromium.net.impl.RequestFinishedInfoImpl, org.chromium.net.RequestFinishedInfo
    public final RequestFinishedInfo.Metrics getMetrics() {
        if (!c) {
            ahkw.e(b, "RequestFinishedInfo.getMetrics() is unsupported when HttpEngineNativeProvider is used. The Metrics object will return null values.");
            c = true;
        }
        return this.a;
    }
}
