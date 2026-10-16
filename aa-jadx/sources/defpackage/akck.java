package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akck implements android.net.http.Proxy$HttpConnectCallback {
    private final org.chromium.net.Proxy.HttpConnectCallback a;

    public akck(org.chromium.net.Proxy.HttpConnectCallback httpConnectCallback) {
        if (!org.chromium.net.AndroidProxyOptions.areProxyApisEnabled()) {
            throw new java.lang.AssertionError("AndroidProxy requires the proxy APIs to be enabled");
        }
        this.a = httpConnectCallback;
    }

    public final void onBeforeRequest(android.net.http.Proxy$HttpConnectCallback.Request request) {
        this.a.onBeforeRequest(new defpackage.akcl(request));
    }

    public final int onResponseReceived(java.util.List list, int i) {
        int iOnResponseReceived = this.a.onResponseReceived(list, i);
        if (iOnResponseReceived == 0) {
            return 0;
        }
        if (iOnResponseReceived == 1) {
            return 1;
        }
        throw new java.lang.AssertionError(java.lang.String.format("Unknown OnResponseReceivedAction: %d", java.lang.Integer.valueOf(iOnResponseReceived)));
    }
}
