package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
public class RequestFinishedInfoImpl extends org.chromium.net.RequestFinishedInfo {
    public final org.chromium.net.RequestFinishedInfo.Metrics a;
    private final java.lang.String b;
    private final java.util.Collection c;
    private final int d;
    private final org.chromium.net.UrlResponseInfo e;
    private final org.chromium.net.CronetException f;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FinishedReason {
    }

    public RequestFinishedInfoImpl(java.lang.String str, java.util.Collection<java.lang.Object> collection, org.chromium.net.RequestFinishedInfo.Metrics metrics, int i, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        this.b = str;
        this.c = collection;
        this.a = metrics;
        this.d = i;
        this.e = urlResponseInfo;
        this.f = cronetException;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final java.util.Collection<java.lang.Object> getAnnotations() {
        java.util.Collection<java.lang.Object> collection = this.c;
        return collection == null ? java.util.Collections.EMPTY_LIST : collection;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final org.chromium.net.CronetException getException() {
        return this.f;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final int getFinishedReason() {
        return this.d;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public org.chromium.net.RequestFinishedInfo.Metrics getMetrics() {
        return this.a;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final org.chromium.net.UrlResponseInfo getResponseInfo() {
        return this.e;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final java.lang.String getUrl() {
        return this.b;
    }
}
