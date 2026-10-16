package com.vungle.ads.internal.network;

import E5.Q;
import com.moloco.sdk.internal.publisher.H;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.p1;
import com.vungle.ads.internal.model.t1;
import com.vungle.ads.internal.model.v2;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Xf.c f33391c = Fe.e.a(b0.f33390a);

    /* renamed from: a, reason: collision with root package name */
    public final Call.Factory f33392a;

    /* renamed from: b, reason: collision with root package name */
    public final com.vungle.ads.internal.network.converters.b f33393b;

    public c0(OkHttpClient okHttpClient) {
        AbstractC3340k.e(okHttpClient, "okHttpClient");
        this.f33392a = okHttpClient;
        this.f33393b = new com.vungle.ads.internal.network.converters.b();
    }

    public static Request.Builder a(c0 c0Var, String str, String str2, String str3, Map map, int i5) {
        if ((i5 & 4) != 0) {
            str3 = null;
        }
        if ((i5 & 8) != 0) {
            map = null;
        }
        c0Var.getClass();
        Request.Builder builder = new Request.Builder();
        builder.h(str2);
        builder.a("User-Agent", str);
        builder.a("Vungle-Version", "7.1.0");
        builder.a("Content-Type", "application/json");
        if (map != null) {
            Headers.f42269b.getClass();
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                String str5 = (String) entry.getValue();
                String string = Bf.k.V0(str4).toString();
                String string2 = Bf.k.V0(str5).toString();
                Headers.Companion.a(string);
                Headers.Companion.b(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            builder.e(new Headers(strArr));
        }
        if (str3 != null) {
            builder.a("X-Vungle-Placement-Ref-Id", str3);
        }
        String strC = d0.c();
        if (strC != null) {
            builder.a("X-VUNGLE-APP-VERSION", strC);
        }
        String strB = d0.b();
        if (strB != null) {
            builder.a("X-Vungle-App-Id", strB);
        }
        return builder;
    }

    public final m b(String ua2, String path, t1 body) {
        AbstractC3340k.e(ua2, "ua");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(body, "body");
        try {
            Xf.c cVar = f33391c;
            String strB = cVar.b(H.n0(cVar.f16253b, kotlin.jvm.internal.H.b(t1.class)), body);
            try {
                Request.Builder builderA = a(this, ua2, path, null, null, 12);
                RequestBody.INSTANCE.getClass();
                builderA.f("POST", RequestBody.Companion.a(strB, null));
                return new m(this.f33392a.a(builderA.b()), new com.vungle.ads.internal.network.converters.d(kotlin.jvm.internal.H.b(v2.class)));
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    public final m c(String ua2, String path, t1 body) {
        AbstractC3340k.e(ua2, "ua");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(body, "body");
        try {
            Xf.c cVar = f33391c;
            String strB = cVar.b(H.n0(cVar.f16253b, kotlin.jvm.internal.H.b(t1.class)), body);
            try {
                Request.Builder builderA = a(this, ua2, path, null, null, 12);
                RequestBody.INSTANCE.getClass();
                builderA.f("POST", RequestBody.Companion.a(strB, null));
                return new m(this.f33392a.a(builderA.b()), this.f33393b);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    public final m b(String ua2, String path, RequestBody requestBody) {
        AbstractC3340k.e(ua2, "ua");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(requestBody, "requestBody");
        HttpUrl.k.getClass();
        HttpUrl httpUrlA = HttpUrl.Companion.c(path).f().a();
        Request.Builder builder = new Request.Builder();
        builder.f42382a = httpUrlA;
        builder.a("User-Agent", ua2);
        builder.a("Vungle-Version", "7.1.0");
        builder.a("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        String strB = d0.b();
        if (strB != null) {
            builder.a("X-Vungle-App-Id", strB);
        }
        String strC = d0.c();
        if (strC != null) {
            builder.a("X-VUNGLE-APP-VERSION", strC);
        }
        builder.f("POST", requestBody);
        return new m(this.f33392a.a(builder.b()), this.f33393b);
    }

    public final m a(String ua2, String path, t1 body) {
        List listA;
        AbstractC3340k.e(ua2, "ua");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(body, "body");
        try {
            Xf.c cVar = f33391c;
            String strB = cVar.b(H.n0(cVar.f16253b, kotlin.jvm.internal.H.b(t1.class)), body);
            p1 p1VarC = body.c();
            try {
                Request.Builder builderA = a(this, ua2, path, (p1VarC == null || (listA = p1VarC.a()) == null) ? null : (String) ff.o.s0(listA), null, 8);
                RequestBody.INSTANCE.getClass();
                builderA.f("POST", RequestBody.Companion.a(strB, null));
                return new m(this.f33392a.a(builderA.b()), new com.vungle.ads.internal.network.converters.d(kotlin.jvm.internal.H.b(h0.class)));
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
        }
    }

    public final m a(String ua2, String url, g requestType, Map map, RequestBody requestBody) {
        Request requestB;
        AbstractC3340k.e(ua2, "ua");
        AbstractC3340k.e(url, "url");
        AbstractC3340k.e(requestType, "requestType");
        Request.Builder builderA = a(this, ua2, url, null, map, 4);
        int iOrdinal = requestType.ordinal();
        if (iOrdinal == 0) {
            builderA.f("GET", null);
            requestB = builderA.b();
        } else if (iOrdinal == 1) {
            if (requestBody == null) {
                requestBody = RequestBody.Companion.d(RequestBody.INSTANCE, new byte[0], null, 0, 6);
            }
            builderA.f("POST", requestBody);
            requestB = builderA.b();
        } else {
            throw new Q((byte) 0, 9);
        }
        return new m(this.f33392a.a(requestB), this.f33393b);
    }

    public final m a(String ua2, String path, RequestBody requestBody) {
        AbstractC3340k.e(ua2, "ua");
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(requestBody, "requestBody");
        HttpUrl.k.getClass();
        HttpUrl httpUrlA = HttpUrl.Companion.c(path).f().a();
        Request.Builder builder = new Request.Builder();
        builder.f42382a = httpUrlA;
        builder.a("User-Agent", ua2);
        builder.a("Vungle-Version", "7.1.0");
        builder.a("Content-Type", CommonGatewayClient.HEADER_PROTOBUF);
        String strB = d0.b();
        if (strB != null) {
            builder.a("X-Vungle-App-Id", strB);
        }
        String strC = d0.c();
        if (strC != null) {
            builder.a("X-VUNGLE-APP-VERSION", strC);
        }
        builder.f("POST", requestBody);
        return new m(this.f33392a.a(builder.b()), this.f33393b);
    }

    public final m a(RequestBody requestBody) {
        AbstractC3340k.e(requestBody, "requestBody");
        HttpUrl.k.getClass();
        Request.Builder builderA = a(this, "debug", HttpUrl.Companion.c("https://events.ads.vungle.com/rtadebugging").f().a().f42281i, null, null, 12);
        builderA.f("POST", requestBody);
        return new m(this.f33392a.a(builderA.b()), this.f33393b);
    }
}
