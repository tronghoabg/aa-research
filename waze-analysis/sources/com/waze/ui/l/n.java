package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n implements q {

    /* renamed from: a, reason: collision with root package name */
    private final ac f42713a;

    public n(ac acVar) {
        h.g.b.x.f(acVar, "timeout");
        this.f42713a = acVar;
    }

    @Override // com.waze.ui.l.q
    public final ac a() {
        return this.f42713a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && h.g.b.x.n(this.f42713a, ((n) obj).f42713a);
    }

    public final int hashCode() {
        return this.f42713a.hashCode();
    }

    public final String toString() {
        return "BackgroundTimer(timeout=" + this.f42713a + ")";
    }
}
