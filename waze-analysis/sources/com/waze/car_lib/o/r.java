package com.waze.car_lib.o;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f20486a;

    public r(h.g.a.a aVar) {
        this.f20486a = aVar;
    }

    public final h.g.a.a a() {
        return this.f20486a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && h.g.b.x.n(this.f20486a, ((r) obj).f20486a);
    }

    public final int hashCode() {
        h.g.a.a aVar = this.f20486a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "SaveAction(doSave=" + this.f20486a + ")";
    }

    public r() {
        this(null);
    }
}
