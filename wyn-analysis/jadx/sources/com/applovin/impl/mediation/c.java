package com.applovin.impl.mediation;

import cb.AbstractC1593a;
import com.applovin.impl.C1638g0;
import com.applovin.impl.c3;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f22102a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f22103b;

    /* renamed from: c, reason: collision with root package name */
    private final a f22104c;

    /* renamed from: d, reason: collision with root package name */
    private C1638g0 f22105d;

    public interface a {
        void a(c3 c3Var);
    }

    public c(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f22102a = kVar;
        this.f22103b = kVar.O();
        this.f22104c = aVar;
    }

    public void a(c3 c3Var, long j8) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f22103b.a("AdHiddenCallbackTimeoutManager", AbstractC1593a.h(j8, "Scheduling in ", "ms..."));
        }
        this.f22105d = C1638g0.a(j8, this.f22102a, new q(3, this, c3Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f22103b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f22104c.a(c3Var);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f22103b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        C1638g0 c1638g0 = this.f22105d;
        if (c1638g0 != null) {
            c1638g0.a();
            this.f22105d = null;
        }
    }
}
