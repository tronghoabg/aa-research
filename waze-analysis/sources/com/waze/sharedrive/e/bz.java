package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bz implements cb {

    /* renamed from: a, reason: collision with root package name */
    private final r f38472a;

    public bz(r rVar) {
        h.g.b.x.f(rVar, "stateHolder");
        this.f38472a = rVar;
    }

    public final r a() {
        return this.f38472a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz) && h.g.b.x.n(this.f38472a, ((bz) obj).f38472a);
    }

    public final int hashCode() {
        return this.f38472a.hashCode();
    }

    public final String toString() {
        return "Join(stateHolder=" + this.f38472a + ")";
    }
}
