package com.waze.ui.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    private final h f43016a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar) {
        super(null);
        h.g.b.x.f(hVar, "primary");
        this.f43016a = hVar;
    }

    public final h a() {
        return this.f43016a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && h.g.b.x.n(this.f43016a, ((j) obj).f43016a);
    }

    public final int hashCode() {
        return this.f43016a.hashCode();
    }

    public final String toString() {
        return "Single(primary=" + this.f43016a + ")";
    }
}
