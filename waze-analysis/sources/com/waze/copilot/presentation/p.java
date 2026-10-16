package com.waze.copilot.presentation;

import com.waze.ui.g.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final x f23144a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f23145b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f23146c;

    public p(x xVar, h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(xVar, "dialogType");
        h.g.b.x.f(aVar, "onActionClicked");
        h.g.b.x.f(aVar2, "onDialogDismissed");
        this.f23144a = xVar;
        this.f23145b = aVar;
        this.f23146c = aVar2;
    }

    public final x a() {
        return this.f23144a;
    }

    public final h.g.a.a b() {
        return this.f23145b;
    }

    public final h.g.a.a c() {
        return this.f23146c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f23144a == pVar.f23144a && h.g.b.x.n(this.f23145b, pVar.f23145b) && h.g.b.x.n(this.f23146c, pVar.f23146c);
    }

    public final int hashCode() {
        return (((this.f23144a.hashCode() * 31) + this.f23145b.hashCode()) * 31) + this.f23146c.hashCode();
    }

    public final String toString() {
        return "MarketplaceDialogData(dialogType=" + this.f23144a + ", onActionClicked=" + this.f23145b + ", onDialogDismissed=" + this.f23146c + ")";
    }
}
