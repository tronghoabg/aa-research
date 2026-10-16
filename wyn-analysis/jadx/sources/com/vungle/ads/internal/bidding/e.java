package com.vungle.ads.internal.bidding;

import android.content.Context;
import com.iab.omid.library.vungle.internal.l;
import com.moloco.sdk.internal.publisher.H;
import com.vungle.ads.GzipEncodeError;
import com.vungle.ads.JsonEncodeError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.l3;
import com.vungle.ads.internal.model.o3;
import com.vungle.ads.internal.model.t1;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.d0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import ef.EnumC2526j;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32929a;

    /* renamed from: b, reason: collision with root package name */
    public m2 f32930b;

    /* renamed from: c, reason: collision with root package name */
    public int f32931c;

    /* renamed from: d, reason: collision with root package name */
    public final Xf.c f32932d;

    /* renamed from: e, reason: collision with root package name */
    public long f32933e;

    public e(Context context) {
        AbstractC3340k.e(context, "context");
        this.f32929a = context;
        this.f32930b = new m2(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUESTED);
        this.f32932d = Fe.e.a(d.f32928a);
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f33838f;
        com.vungle.ads.internal.util.a.a(new a(this));
    }

    public final String a() {
        VungleApiClient vungleApiClient = (VungleApiClient) Fe.c.y(EnumC2526j.f34667a, new c(this.f32929a)).getValue();
        ConfigManager.INSTANCE.getClass();
        t1 t1VarA = vungleApiClient.a(!ConfigManager.r(), ConfigManager.b());
        o3 o3Var = new o3(t1VarA.a(), t1VarA.d(), t1VarA.b(), new l3(d0.d()), this.f32931c);
        Xf.c cVar = this.f32932d;
        return cVar.b(H.n0(cVar.f16253b, kotlin.jvm.internal.H.b(o3.class)), o3Var);
    }

    public final b b() throws Throwable {
        this.f32931c++;
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.f32930b, (s) null, 6);
        try {
            String strA = a();
            boolean z2 = u.f33874a;
            t.a("BidTokenEncoder", "BidToken: " + strA);
            try {
                String str = "6:" + q.a(strA);
                t.a("BidTokenEncoder", "After conversion: " + str);
                return new b(str, "");
            } catch (Throwable th) {
                StringBuilder sbA = l.a("Fail to gzip token data. ");
                sbA.append(th.getLocalizedMessage());
                String string = sbA.toString();
                new GzipEncodeError(string).logErrorNoReturnValue$vungle_ads_release();
                return new b("", string);
            }
        } catch (Throwable th2) {
            StringBuilder sbA2 = l.a("Failed to encode TokenParameters. ");
            sbA2.append(th2.getLocalizedMessage());
            String string2 = sbA2.toString();
            new JsonEncodeError(string2).logErrorNoReturnValue$vungle_ads_release();
            return new b("", string2);
        }
    }
}
