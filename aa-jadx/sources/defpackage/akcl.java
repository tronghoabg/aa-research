package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akcl extends org.chromium.net.Proxy.HttpConnectCallback.Request {
    private final android.net.http.Proxy$HttpConnectCallback.Request a;

    public akcl(android.net.http.Proxy$HttpConnectCallback.Request request) {
        if (!org.chromium.net.AndroidProxyOptions.areProxyApisEnabled()) {
            throw new java.lang.AssertionError("AndroidProxy requires the proxy APIs to be enabled");
        }
        this.a = request;
    }

    @Override // org.chromium.net.Proxy.HttpConnectCallback.Request, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // org.chromium.net.Proxy.HttpConnectCallback.Request
    public final void proceed(java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) {
        this.a.proceed(list);
    }
}
