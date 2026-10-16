package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class an extends ap {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f42011a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(h.g.a.a aVar) {
        super(null);
        h.g.b.x.f(aVar, "onClick");
        this.f42011a = aVar;
    }

    public final h.g.a.a a() {
        return this.f42011a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof an) && h.g.b.x.n(this.f42011a, ((an) obj).f42011a);
    }

    public final int hashCode() {
        return this.f42011a.hashCode();
    }

    public final String toString() {
        return "NoPrice(onClick=" + this.f42011a + ")";
    }
}
