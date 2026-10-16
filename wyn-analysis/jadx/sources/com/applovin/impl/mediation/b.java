package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.t2;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class b implements a.InterfaceC0013a, c.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f22099a;

    /* renamed from: b, reason: collision with root package name */
    private final a f22100b;

    /* renamed from: c, reason: collision with root package name */
    private final c f22101c;

    public b(com.applovin.impl.sdk.k kVar) {
        this.f22099a = kVar;
        this.f22100b = new a(kVar);
        this.f22101c = new c(kVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(c3 c3Var) {
        h hVarA;
        if (c3Var == null || (hVarA = c3Var.A()) == null || !c3Var.w().compareAndSet(false, true)) {
            return;
        }
        t2.e(hVarA.c(), c3Var);
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0013a
    public void b(c3 c3Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new q(2, this, c3Var), c3Var.f0());
    }

    public void e(c3 c3Var) {
        long jG0 = c3Var.g0();
        if (jG0 >= 0) {
            this.f22101c.a(c3Var, jG0);
        }
        if (c3Var.q0() || c3Var.r0()) {
            this.f22100b.a(c3Var, this);
        }
    }

    public void a() {
        this.f22101c.a();
        this.f22100b.a();
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(c3 c3Var) {
        c(c3Var);
    }
}
