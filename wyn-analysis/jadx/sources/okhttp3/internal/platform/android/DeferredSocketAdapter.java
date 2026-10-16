package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Factory", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeferredSocketAdapter implements SocketAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Factory f42913a;

    /* renamed from: b, reason: collision with root package name */
    public SocketAdapter f42914b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Factory {
        SocketAdapter create(SSLSocket sSLSocket);

        boolean matchesSocket(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory socketAdapterFactory) {
        AbstractC3340k.e(socketAdapterFactory, "socketAdapterFactory");
        this.f42913a = socketAdapterFactory;
    }

    public final synchronized SocketAdapter a(SSLSocket sSLSocket) {
        try {
            if (this.f42914b == null && this.f42913a.matchesSocket(sSLSocket)) {
                this.f42914b = this.f42913a.create(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f42914b;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC3340k.e(protocols, "protocols");
        SocketAdapter socketAdapterA = a(sSLSocket);
        if (socketAdapterA == null) {
            return;
        }
        socketAdapterA.configureTlsExtensions(sSLSocket, str, protocols);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        SocketAdapter socketAdapterA = a(sSLSocket);
        if (socketAdapterA == null) {
            return null;
        }
        return socketAdapterA.getSelectedProtocol(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return this.f42913a.matchesSocket(sSLSocket);
    }
}
