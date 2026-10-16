package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ba extends com.waze.ui.k.q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.x.u f43632a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.j.h f43633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(com.waze.ui.x.u uVar, com.waze.ui.j.h hVar) {
        super(null);
        h.g.b.x.f(uVar, "menuState");
        h.g.b.x.f(hVar, "conversationalMode");
        this.f43632a = uVar;
        this.f43633b = hVar;
    }

    public static /* synthetic */ ba n(ba baVar, com.waze.ui.j.h hVar) {
        com.waze.ui.x.u uVar = baVar.f43632a;
        h.g.b.x.f(uVar, "menuState");
        h.g.b.x.f(hVar, "conversationalMode");
        return new ba(uVar, hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return h.g.b.x.n(this.f43632a, baVar.f43632a) && h.g.b.x.n(this.f43633b, baVar.f43633b);
    }

    public final int hashCode() {
        return (this.f43632a.hashCode() * 31) + this.f43633b.hashCode();
    }

    public final com.waze.ui.x.u l() {
        return this.f43632a;
    }

    public final com.waze.ui.j.h m() {
        return this.f43633b;
    }

    public final String toString() {
        return "Loaded(menuState=" + this.f43632a + ", conversationalMode=" + this.f43633b + ")";
    }
}
