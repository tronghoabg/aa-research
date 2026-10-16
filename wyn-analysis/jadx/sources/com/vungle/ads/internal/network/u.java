package com.vungle.ads.internal.network;

import cg.AbstractC1613b;
import cg.C1609A;
import cg.C1618g;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.tika.metadata.HttpHeaders;

/* loaded from: classes5.dex */
public final class u implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Throwable {
        AbstractC3340k.e(chain, "chain");
        Request f42647e = chain.getF42647e();
        RequestBody requestBody = f42647e.f42379d;
        if (requestBody == null || f42647e.f42378c.a(HttpHeaders.CONTENT_ENCODING) != null) {
            return chain.a(f42647e);
        }
        Request.Builder builderB = f42647e.b();
        builderB.d(HttpHeaders.CONTENT_ENCODING, "gzip");
        C1618g c1618g = new C1618g();
        C1609A c1609aC = AbstractC1613b.c(new cg.q(c1618g));
        requestBody.writeTo(c1609aC);
        c1609aC.close();
        builderB.f(f42647e.f42377b, new t(requestBody, c1618g));
        return chain.a(builderB.b());
    }
}
