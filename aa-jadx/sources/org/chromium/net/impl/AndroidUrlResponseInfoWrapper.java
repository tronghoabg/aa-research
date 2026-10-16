package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
class AndroidUrlResponseInfoWrapper extends org.chromium.net.UrlResponseInfo {
    private final android.net.http.UrlResponseInfo a;
    private final java.lang.String b;

    private AndroidUrlResponseInfoWrapper(android.net.http.UrlResponseInfo urlResponseInfo, java.lang.String str) {
        this.a = urlResponseInfo;
        this.b = str;
    }

    public static org.chromium.net.impl.AndroidUrlResponseInfoWrapper a(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (c(urlResponseInfo)) {
            return null;
        }
        return new org.chromium.net.impl.AndroidUrlResponseInfoWrapper(urlResponseInfo, null);
    }

    public static org.chromium.net.impl.AndroidUrlResponseInfoWrapper b(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (c(urlResponseInfo)) {
            return null;
        }
        return new org.chromium.net.impl.AndroidUrlResponseInfoWrapper(urlResponseInfo, ":0");
    }

    private static boolean c(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo == null) {
            return true;
        }
        try {
            urlResponseInfo.getUrl();
            return false;
        } catch (java.lang.NullPointerException unused) {
            return true;
        }
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getAllHeaders() {
        return this.a.getHeaders().getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> getAllHeadersAsList() {
        return this.a.getHeaders().getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.a.getHttpStatusCode();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.lang.String getHttpStatusText() {
        return this.a.getHttpStatusText();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.lang.String getNegotiatedProtocol() {
        return this.a.getNegotiatedProtocol();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.lang.String getProxyServer() {
        return this.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.a.getReceivedByteCount();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.lang.String getUrl() {
        return this.a.getUrl();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final java.util.List<java.lang.String> getUrlChain() {
        return this.a.getUrlChain();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return this.a.wasCached();
    }
}
