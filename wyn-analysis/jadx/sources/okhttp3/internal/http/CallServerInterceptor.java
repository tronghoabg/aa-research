package okhttp3.internal.http;

import cg.AbstractC1613b;
import cg.C1609A;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import pd.f;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CallServerInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Throwable {
        Response.Builder builderC;
        boolean z2;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.f42646d;
        AbstractC3340k.b(exchange);
        EventListener eventListener = exchange.f42551b;
        RealCall call = exchange.f42550a;
        ExchangeCodec exchangeCodec = exchange.f42553d;
        Request request = realInterceptorChain.f42647e;
        RequestBody requestBody = request.f42379d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            eventListener.getClass();
            AbstractC3340k.e(call, "call");
            exchangeCodec.d(request);
            boolean zB = HttpMethod.b(request.f42377b);
            boolean z10 = true;
            RealConnection realConnection = exchange.f42555f;
            if (!zB || requestBody == null) {
                call.e(exchange, true, false, null);
                builderC = null;
            } else {
                if ("100-continue".equalsIgnoreCase(request.f42378c.a("Expect"))) {
                    try {
                        exchangeCodec.flushRequest();
                        builderC = exchange.c(true);
                        eventListener.getClass();
                        AbstractC3340k.e(call, "call");
                        z2 = false;
                    } catch (IOException e7) {
                        eventListener.getClass();
                        AbstractC3340k.e(call, "call");
                        exchange.d(e7);
                        throw e7;
                    }
                } else {
                    builderC = null;
                    z2 = true;
                }
                if (builderC != null) {
                    call.e(exchange, true, false, null);
                    if (realConnection.f42603g == null) {
                        exchangeCodec.getF42796a().l();
                    }
                } else if (requestBody.isDuplex()) {
                    try {
                        exchangeCodec.flushRequest();
                        requestBody.writeTo(AbstractC1613b.c(exchange.b(request, true)));
                    } catch (IOException e10) {
                        eventListener.getClass();
                        AbstractC3340k.e(call, "call");
                        exchange.d(e10);
                        throw e10;
                    }
                } else {
                    C1609A c1609aC = AbstractC1613b.c(exchange.b(request, false));
                    requestBody.writeTo(c1609aC);
                    c1609aC.close();
                }
                z10 = z2;
            }
            if (requestBody == null || !requestBody.isDuplex()) {
                try {
                    exchangeCodec.finishRequest();
                } catch (IOException e11) {
                    exchange.d(e11);
                    throw e11;
                }
            }
            if (builderC == null) {
                builderC = exchange.c(false);
                AbstractC3340k.b(builderC);
                if (z10) {
                    eventListener.getClass();
                    AbstractC3340k.e(call, "call");
                    z10 = false;
                }
            }
            builderC.f42408a = request;
            builderC.f42412e = realConnection.f42601e;
            builderC.k = jCurrentTimeMillis;
            builderC.f42418l = System.currentTimeMillis();
            Response responseA = builderC.a();
            int i5 = responseA.f42398d;
            if (i5 == 100) {
                Response.Builder builderC2 = exchange.c(false);
                AbstractC3340k.b(builderC2);
                if (z10) {
                    eventListener.getClass();
                    AbstractC3340k.e(call, "call");
                }
                builderC2.f42408a = request;
                builderC2.f42412e = realConnection.f42601e;
                builderC2.k = jCurrentTimeMillis;
                builderC2.f42418l = System.currentTimeMillis();
                responseA = builderC2.a();
                i5 = responseA.f42398d;
            }
            Response.Builder builderH = responseA.h();
            try {
                String strB = Response.b("Content-Type", responseA);
                long jB = exchangeCodec.b(responseA);
                builderH.f42414g = new RealResponseBody(strB, jB, AbstractC1613b.d(new Exchange.ResponseBodySource(exchange, exchangeCodec.a(responseA), jB)));
                Response responseA2 = builderH.a();
                if ("close".equalsIgnoreCase(responseA2.f42395a.f42378c.a("Connection")) || "close".equalsIgnoreCase(Response.b("Connection", responseA2))) {
                    exchangeCodec.getF42796a().l();
                }
                if (i5 == 204 || i5 == 205) {
                    ResponseBody responseBody = responseA2.f42401g;
                    if ((responseBody == null ? -1L : responseBody.getF42653e()) > 0) {
                        StringBuilder sbL = f.l(i5, "HTTP ", " had non-zero Content-Length: ");
                        sbL.append(responseBody != null ? Long.valueOf(responseBody.getF42653e()) : null);
                        throw new ProtocolException(sbL.toString());
                    }
                }
                return responseA2;
            } catch (IOException e12) {
                exchange.d(e12);
                throw e12;
            }
        } catch (IOException e13) {
            eventListener.getClass();
            AbstractC3340k.e(call, "call");
            exchange.d(e13);
            throw e13;
        }
    }
}
