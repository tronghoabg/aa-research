package com.vungle.ads.internal.load;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f33044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f33045b;

    public e(g gVar, h0 h0Var) {
        this.f33044a = gVar;
        this.f33045b = h0Var;
    }

    public final void a() throws Throwable {
        this.f33044a.f33068w.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        g gVar = this.f33044a;
        AnalyticsClient.a(analyticsClient, gVar.f33068w, gVar.f33069x, 4);
        boolean z2 = u.f33874a;
        t.b("BaseAdLoader", "fail to load ad");
        this.f33044a.i();
        a aVar = this.f33044a.f33056j;
        if (aVar != null) {
            aVar.onSuccess(this.f33045b);
        }
    }

    public final void b() throws Throwable {
        this.f33044a.f33068w.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        g gVar = this.f33044a;
        AnalyticsClient.a(analyticsClient, gVar.f33068w, gVar.f33069x, 4);
        this.f33044a.i();
        a aVar = this.f33044a.f33056j;
        if (aVar != null) {
            aVar.onSuccess(this.f33045b);
        }
    }
}
