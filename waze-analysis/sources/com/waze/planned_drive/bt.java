package com.waze.planned_drive;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bt {

    /* renamed from: a, reason: collision with root package name */
    private final Object f33276a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33277b;

    public bt(Object obj, int i2) {
        this.f33276a = obj;
        this.f33277b = i2;
    }

    public final bt a(Object obj) {
        return new bt(obj, this.f33277b + 1);
    }

    public final bt b(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "updater");
        Object obj = this.f33276a;
        lVar.invoke(obj);
        return new bt(obj, this.f33277b + 1);
    }

    public final Object c() {
        return this.f33276a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt)) {
            return false;
        }
        bt btVar = (bt) obj;
        return h.g.b.x.n(this.f33276a, btVar.f33276a) && this.f33277b == btVar.f33277b;
    }

    public final int hashCode() {
        Object obj = this.f33276a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f33277b;
    }

    public final String toString() {
        return "MutableObjectWrapper(reference=" + this.f33276a + ", changesCounter=" + this.f33277b + ")";
    }
}
