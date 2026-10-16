package defpackage;

import android.net.http.Proxy$HttpConnectCallback;
import android.util.Pair;
import java.util.List;
import org.chromium.net.AndroidProxyOptions;
import org.chromium.net.Proxy;

/* loaded from: classes2.dex */
final class akbl extends Proxy.HttpConnectCallback.Request {
    private final Proxy$HttpConnectCallback.Request a;

    public akbl(Proxy$HttpConnectCallback.Request request) {
        if (!AndroidProxyOptions.areProxyApisEnabled()) {
            throw new AssertionError("AndroidProxy requires the proxy APIs to be enabled");
        }
        this.a = request;
    }

    @Override // org.chromium.net.Proxy.HttpConnectCallback.Request, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // org.chromium.net.Proxy.HttpConnectCallback.Request
    public final void proceed(List<Pair<String, String>> list) {
        this.a.proceed(list);
    }
}
