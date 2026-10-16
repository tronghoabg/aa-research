package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/ConnectInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConnectInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final ConnectInterceptor f42545a = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        RealCall realCall = realInterceptorChain.f42643a;
        realCall.getClass();
        synchronized (realCall) {
            try {
                if (!realCall.f42589n) {
                    throw new IllegalStateException("released");
                }
                if (realCall.f42588m) {
                    throw new IllegalStateException("Check failed.");
                }
                if (realCall.f42587l) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ExchangeFinder exchangeFinder = realCall.f42584h;
        AbstractC3340k.b(exchangeFinder);
        OkHttpClient client = realCall.f42577a;
        AbstractC3340k.e(client, "client");
        try {
            Exchange exchange = new Exchange(realCall, realCall.f42580d, exchangeFinder, exchangeFinder.a(realInterceptorChain.f42648f, realInterceptorChain.f42649g, realInterceptorChain.f42650h, client.f42321f, !AbstractC3340k.a(realInterceptorChain.f42647e.f42377b, "GET")).k(client, realInterceptorChain));
            realCall.k = exchange;
            realCall.f42591p = exchange;
            synchronized (realCall) {
                realCall.f42587l = true;
                realCall.f42588m = true;
            }
            if (realCall.f42590o) {
                throw new IOException("Canceled");
            }
            return RealInterceptorChain.b(realInterceptorChain, 0, exchange, null, 61).a(realInterceptorChain.f42647e);
        } catch (IOException e7) {
            exchangeFinder.c(e7);
            throw new RouteException(e7);
        } catch (RouteException e10) {
            exchangeFinder.c(e10.f42624b);
            throw e10;
        }
    }
}
