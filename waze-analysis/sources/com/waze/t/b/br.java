package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class br extends bs {

    /* renamed from: a, reason: collision with root package name */
    private final Float f40759a;

    public br(Float f2) {
        super(null);
        this.f40759a = f2;
    }

    public final Float a() {
        return this.f40759a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof br) && h.g.b.x.n(this.f40759a, ((br) obj).f40759a);
    }

    public final int hashCode() {
        Float f2 = this.f40759a;
        if (f2 == null) {
            return 0;
        }
        return f2.hashCode();
    }

    public final String toString() {
        return "Recording(amplitude=" + this.f40759a + ")";
    }
}
