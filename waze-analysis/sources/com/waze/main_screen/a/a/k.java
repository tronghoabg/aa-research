package com.waze.main_screen.a.a;

import com.waze.jni.protos.navigate.NavigationItem;
import h.g.b.r;
import h.g.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class k implements com.waze.main_screen.l.b.g, r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f25551a;

    k(n nVar) {
        this.f25551a = nVar;
    }

    @Override // com.waze.main_screen.l.b.g
    public final void a(NavigationItem navigationItem) {
        x.f(navigationItem, "p0");
        n.j(this.f25551a, navigationItem);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof com.waze.main_screen.l.b.g) && (obj instanceof r)) {
            return x.n(getFunctionDelegate(), ((r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c<?> getFunctionDelegate() {
        return new u(1, this.f25551a, n.class, "handleNavInstructionItemClicked", "handleNavInstructionItemClicked(Lcom/waze/jni/protos/navigate/NavigationItem;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
