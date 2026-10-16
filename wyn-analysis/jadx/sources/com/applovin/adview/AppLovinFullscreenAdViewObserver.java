package com.applovin.adview;

import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC1456u;
import com.applovin.impl.n2;
import com.applovin.impl.w1;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements InterfaceC1456u {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1451o f20720a;

    /* renamed from: b, reason: collision with root package name */
    private n2 f20721b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f20722c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private w1 f20723d;

    public AppLovinFullscreenAdViewObserver(AbstractC1451o abstractC1451o, n2 n2Var) {
        this.f20720a = abstractC1451o;
        this.f20721b = n2Var;
        abstractC1451o.a(this);
    }

    @G(EnumC1449m.ON_DESTROY)
    public void onDestroy() {
        this.f20720a.c(this);
        n2 n2Var = this.f20721b;
        if (n2Var != null) {
            n2Var.a();
            this.f20721b = null;
        }
        w1 w1Var = this.f20723d;
        if (w1Var != null) {
            w1Var.a("lifecycle_on_destroy");
            this.f20723d.r();
            this.f20723d = null;
        }
    }

    @G(EnumC1449m.ON_PAUSE)
    public void onPause() {
        w1 w1Var = this.f20723d;
        if (w1Var != null) {
            w1Var.s();
            this.f20723d.v();
        }
    }

    @G(EnumC1449m.ON_RESUME)
    public void onResume() {
        w1 w1Var;
        if (this.f20722c.getAndSet(false) || (w1Var = this.f20723d) == null) {
            return;
        }
        w1Var.t();
        this.f20723d.b(0L);
    }

    @G(EnumC1449m.ON_STOP)
    public void onStop() {
        w1 w1Var = this.f20723d;
        if (w1Var != null) {
            w1Var.u();
        }
    }

    public void setPresenter(w1 w1Var) {
        this.f20723d = w1Var;
    }
}
