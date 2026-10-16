package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bx implements cb {

    /* renamed from: a, reason: collision with root package name */
    private final f f38470a;

    public bx(f fVar) {
        h.g.b.x.f(fVar, "stateHolder");
        this.f38470a = fVar;
    }

    public final f a() {
        return this.f38470a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bx) && h.g.b.x.n(this.f38470a, ((bx) obj).f38470a);
    }

    public final int hashCode() {
        return this.f38470a.hashCode();
    }

    public final String toString() {
        return "Create(stateHolder=" + this.f38470a + ")";
    }
}
