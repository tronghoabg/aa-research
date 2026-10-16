package com.vungle.ads.internal.signals;

import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.v2;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* loaded from: classes5.dex */
public final class f extends com.vungle.ads.internal.util.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f33653a;

    public f(j jVar) {
        this.f33653a = jVar;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void a() {
        boolean z2 = u.f33874a;
        t.a("SignalManager", "SignalManager#onBackground()");
        this.f33653a.f33659c = System.currentTimeMillis();
        j jVar = this.f33653a;
        jVar.f33661e = (jVar.f33659c - jVar.f33660d) + jVar.f33661e;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void b() {
        Integer num;
        boolean z2 = u.f33874a;
        t.a("SignalManager", "SignalManager#onForeground()");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j8 = jCurrentTimeMillis - this.f33653a.f33659c;
        ConfigManager.INSTANCE.getClass();
        v2 v2Var = ConfigManager.f32903a;
        if (j8 > ((v2Var == null || (num = v2Var.f33345l) == null) ? 1800 : num.intValue()) * 1000) {
            j jVar = this.f33653a;
            jVar.f();
            jVar.f33664h = new c(jVar.f33662f);
        }
        j jVar2 = this.f33653a;
        jVar2.f33660d = jCurrentTimeMillis;
        jVar2.f33659c = 0L;
    }
}
