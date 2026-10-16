package okhttp3.internal.http;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a, reason: collision with root package name */
    public final RealCall f42643a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f42644b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42645c;

    /* renamed from: d, reason: collision with root package name */
    public final Exchange f42646d;

    /* renamed from: e, reason: collision with root package name */
    public final Request f42647e;

    /* renamed from: f, reason: collision with root package name */
    public final int f42648f;

    /* renamed from: g, reason: collision with root package name */
    public final int f42649g;

    /* renamed from: h, reason: collision with root package name */
    public final int f42650h;

    /* renamed from: i, reason: collision with root package name */
    public int f42651i;

    public RealInterceptorChain(RealCall call, ArrayList arrayList, int i5, Exchange exchange, Request request, int i10, int i11, int i12) {
        AbstractC3340k.e(call, "call");
        AbstractC3340k.e(request, "request");
        this.f42643a = call;
        this.f42644b = arrayList;
        this.f42645c = i5;
        this.f42646d = exchange;
        this.f42647e = request;
        this.f42648f = i10;
        this.f42649g = i11;
        this.f42650h = i12;
    }

    public static RealInterceptorChain b(RealInterceptorChain realInterceptorChain, int i5, Exchange exchange, Request request, int i10) {
        if ((i10 & 1) != 0) {
            i5 = realInterceptorChain.f42645c;
        }
        int i11 = i5;
        if ((i10 & 2) != 0) {
            exchange = realInterceptorChain.f42646d;
        }
        Exchange exchange2 = exchange;
        if ((i10 & 4) != 0) {
            request = realInterceptorChain.f42647e;
        }
        Request request2 = request;
        AbstractC3340k.e(request2, "request");
        return new RealInterceptorChain(realInterceptorChain.f42643a, realInterceptorChain.f42644b, i11, exchange2, request2, realInterceptorChain.f42648f, realInterceptorChain.f42649g, realInterceptorChain.f42650h);
    }

    @Override // okhttp3.Interceptor.Chain
    public final Response a(Request request) {
        AbstractC3340k.e(request, "request");
        ArrayList arrayList = this.f42644b;
        int size = arrayList.size();
        int i5 = this.f42645c;
        if (i5 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f42651i++;
        Exchange exchange = this.f42646d;
        if (exchange != null) {
            if (!exchange.f42552c.b(request.f42376a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i5 - 1) + " must retain the same host and port").toString());
            }
            if (this.f42651i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i5 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i10 = i5 + 1;
        RealInterceptorChain realInterceptorChainB = b(this, i10, null, request, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i5);
        Response responseIntercept = interceptor.intercept(realInterceptorChainB);
        if (responseIntercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (exchange != null && i10 < arrayList.size() && realInterceptorChainB.f42651i != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (responseIntercept.f42401g != null) {
            return responseIntercept;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    /* renamed from: request, reason: from getter */
    public final Request getF42647e() {
        return this.f42647e;
    }
}
