package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    private final ac f42716a;

    public p(ac acVar) {
        h.g.b.x.f(acVar, "timeout");
        this.f42716a = acVar;
    }

    @Override // com.waze.ui.l.q
    public final ac a() {
        return this.f42716a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && h.g.b.x.n(this.f42716a, ((p) obj).f42716a);
    }

    public final int hashCode() {
        return this.f42716a.hashCode();
    }

    public final String toString() {
        return "Timer(timeout=" + this.f42716a + ")";
    }
}
