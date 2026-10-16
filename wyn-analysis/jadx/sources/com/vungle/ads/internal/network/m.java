package com.vungle.ads.internal.network;

import cg.C1618g;
import ef.C2529m;
import ef.C2530n;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Call f33419a;

    /* renamed from: b, reason: collision with root package name */
    public final com.vungle.ads.internal.network.converters.a f33420b;

    static {
        new h();
    }

    public m(Call rawCall, com.vungle.ads.internal.network.converters.a responseConverter) {
        AbstractC3340k.e(rawCall, "rawCall");
        AbstractC3340k.e(responseConverter, "responseConverter");
        this.f33419a = rawCall;
        this.f33420b = responseConverter;
    }

    public final void a(a callback) {
        Call call;
        AbstractC3340k.e(callback, "callback");
        synchronized (this) {
            call = this.f33419a;
        }
        call.B(new l(this, callback));
    }

    public final o a() {
        Call call;
        Object objZ;
        synchronized (this) {
            call = this.f33419a;
        }
        try {
            objZ = a(call.execute());
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("[execute] Failed to parse response:  ");
            sbA.append(thA.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("OkHttpCall", sbA.toString());
        }
        if (objZ instanceof C2529m) {
            objZ = null;
        }
        return (o) objZ;
    }

    public final o a(Response response) throws IOException {
        ResponseBody responseBody = response.f42401g;
        if (responseBody == null) {
            return null;
        }
        Response.Builder builderH = response.h();
        builderH.f42414g = new k(responseBody.getF42424d(), responseBody.getF42653e());
        Response responseA = builderH.a();
        int i5 = responseA.f42398d;
        if (i5 >= 200 && i5 < 300) {
            if (i5 != 204 && i5 != 205) {
                j jVar = new j(responseBody);
                try {
                    return n.a(this.f33420b.a(jVar), responseA);
                } catch (Throwable th) {
                    jVar.a();
                    throw th;
                }
            }
            responseBody.close();
            return n.a(null, responseA);
        }
        try {
            C1618g c1618g = new C1618g();
            responseBody.getF42426f().F(c1618g);
            ResponseBody.Companion companion = ResponseBody.INSTANCE;
            MediaType f42424d = responseBody.getF42424d();
            long f42653e = responseBody.getF42653e();
            companion.getClass();
            ResponseBody.Companion.a(c1618g, f42424d, f42653e);
            o oVarA = n.a(responseA);
            responseBody.close();
            return oVarA;
        } finally {
        }
    }
}
