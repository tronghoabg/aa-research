package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import cb.AbstractC1593a;
import com.applovin.impl.AbstractC1626b;
import com.applovin.impl.C1629c;
import com.applovin.impl.c3;
import com.applovin.impl.o7;

/* loaded from: classes.dex */
public class a extends AbstractC1626b {

    /* renamed from: a, reason: collision with root package name */
    private final C1629c f21993a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21994b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21995c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC0013a f21996d;

    /* renamed from: e, reason: collision with root package name */
    private c3 f21997e;

    /* renamed from: f, reason: collision with root package name */
    private String f21998f;

    /* renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0013a {
        void b(c3 c3Var);
    }

    public a(com.applovin.impl.sdk.k kVar) {
        this.f21994b = kVar.O();
        this.f21993a = kVar.e();
        this.f21995c = o7.a(com.applovin.impl.sdk.k.o(), "AdActivityObserver", kVar);
    }

    public void a(c3 c3Var, InterfaceC0013a interfaceC0013a) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21994b.a("AdActivityObserver", "Starting for ad " + c3Var.getAdUnitId() + "...");
        }
        a();
        this.f21996d = interfaceC0013a;
        this.f21997e = c3Var;
        this.f21993a.a(this);
    }

    @Override // com.applovin.impl.AbstractC1626b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f21995c) && this.f21997e.r0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21994b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f21996d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21994b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f21996d.b(this.f21997e);
            }
            a();
            return;
        }
        if (this.f21998f == null) {
            this.f21998f = activity.getClass().getName();
            if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.w(new StringBuilder("Started tracking ad Activity: "), this.f21998f, this.f21994b, "AdActivityObserver");
            }
        }
    }

    @Override // com.applovin.impl.AbstractC1626b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f21998f)) {
            if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.w(new StringBuilder("Ad Activity destroyed: "), this.f21998f, this.f21994b, "AdActivityObserver");
            }
            if (this.f21996d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21994b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f21996d.b(this.f21997e);
            }
            a();
        }
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21994b.a("AdActivityObserver", "Cancelling...");
        }
        this.f21993a.b(this);
        this.f21996d = null;
        this.f21997e = null;
        this.f21998f = null;
    }
}
