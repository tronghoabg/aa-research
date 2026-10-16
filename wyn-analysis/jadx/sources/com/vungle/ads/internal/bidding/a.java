package com.vungle.ads.internal.bidding;

import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.v2;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* loaded from: classes5.dex */
public final class a extends com.vungle.ads.internal.util.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f32924a;

    public a(e eVar) {
        this.f32924a = eVar;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void a() {
        e eVar = this.f32924a;
        eVar.getClass();
        boolean z2 = u.f33874a;
        t.a("BidTokenEncoder", "BidTokenEncoder#onBackground()");
        eVar.f32933e = System.currentTimeMillis();
    }

    @Override // com.vungle.ads.internal.util.b
    public final void b() {
        Integer num;
        e eVar = this.f32924a;
        eVar.getClass();
        boolean z2 = u.f33874a;
        t.a("BidTokenEncoder", "BidTokenEncoder#onForeground()");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConfigManager.INSTANCE.getClass();
        v2 v2Var = ConfigManager.f32903a;
        if (jCurrentTimeMillis > eVar.f32933e + (((v2Var == null || (num = v2Var.f33344j) == null) ? 900 : num.intValue()) * 1000)) {
            eVar.f32931c = 0;
            eVar.f32933e = 0L;
        }
    }
}
