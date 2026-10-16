package com.waze.main_screen.p;

import com.waze.jni.protos.navigate.NavigationItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class bq implements com.waze.main_screen.l.b.g, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bs f27221a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27222b;

    bq(bs bsVar, int i2) {
        this.f27222b = i2;
        this.f27221a = bsVar;
    }

    @Override // com.waze.main_screen.l.b.g
    public final void a(NavigationItem navigationItem) {
        if (this.f27222b != 0) {
            h.g.b.x.f(navigationItem, "p0");
            bs.w(this.f27221a, navigationItem);
        } else {
            h.g.b.x.f(navigationItem, "p0");
            bs.w(this.f27221a, navigationItem);
        }
    }

    public final boolean equals(Object obj) {
        if (this.f27222b != 0) {
            if ((obj instanceof com.waze.main_screen.l.b.g) && (obj instanceof h.g.b.r)) {
                return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
            }
            return false;
        }
        if ((obj instanceof com.waze.main_screen.l.b.g) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c getFunctionDelegate() {
        int i2 = this.f27222b;
        bs bsVar = this.f27221a;
        return i2 != 0 ? new h.g.b.u(1, bsVar, bs.class, "handleNavInstructionItemClicked", "handleNavInstructionItemClicked(Lcom/waze/jni/protos/navigate/NavigationItem;)V", 0) : new h.g.b.u(1, bsVar, bs.class, "handleNavInstructionItemClicked", "handleNavInstructionItemClicked(Lcom/waze/jni/protos/navigate/NavigationItem;)V", 0);
    }

    public final int hashCode() {
        return this.f27222b != 0 ? getFunctionDelegate().hashCode() : getFunctionDelegate().hashCode();
    }
}
