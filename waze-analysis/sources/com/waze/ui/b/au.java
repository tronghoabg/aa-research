package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au extends av {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f42023a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(h.g.a.l lVar) {
        super(null);
        h.g.b.x.f(lVar, "onClick");
        this.f42023a = lVar;
    }

    @Override // com.waze.ui.b.av
    public final h.g.a.l a() {
        return this.f42023a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au) && h.g.b.x.n(this.f42023a, ((au) obj).f42023a);
    }

    public final int hashCode() {
        return this.f42023a.hashCode();
    }

    public final String toString() {
        return "Resume(onClick=" + this.f42023a + ")";
    }
}
