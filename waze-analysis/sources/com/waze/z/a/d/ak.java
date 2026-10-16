package com.waze.z.a.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak implements an {

    /* renamed from: a, reason: collision with root package name */
    private final String f45925a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f45926b;

    /* renamed from: c, reason: collision with root package name */
    private final aj f45927c;

    public /* synthetic */ ak(aj ajVar, int i2) {
        this(1 != (i2 & 1) ? null : "", false, (i2 & 4) != 0 ? null : ajVar);
    }

    public static /* synthetic */ ak d(ak akVar, String str, aj ajVar, int i2) {
        if ((i2 & 1) != 0) {
            str = akVar.f45925a;
        }
        boolean z = (i2 & 2) != 0 ? akVar.f45926b : false;
        if ((i2 & 4) != 0) {
            ajVar = akVar.f45927c;
        }
        h.g.b.x.f(str, "text");
        return new ak(str, z, ajVar);
    }

    public final aj a() {
        return this.f45927c;
    }

    public final String b() {
        return this.f45925a;
    }

    public final boolean c() {
        return this.f45926b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return h.g.b.x.n(this.f45925a, akVar.f45925a) && this.f45926b == akVar.f45926b && this.f45927c == akVar.f45927c;
    }

    public final int hashCode() {
        int iHashCode = this.f45925a.hashCode() * 31;
        aj ajVar = this.f45927c;
        return ((iHashCode + a.a.a(this.f45926b)) * 31) + (ajVar == null ? 0 : ajVar.hashCode());
    }

    public final String toString() {
        return "Regular(text=" + this.f45925a + ", isReadOnly=" + this.f45926b + ", action=" + this.f45927c + ")";
    }

    public ak(String str, boolean z, aj ajVar) {
        h.g.b.x.f(str, "text");
        this.f45925a = str;
        this.f45926b = z;
        this.f45927c = ajVar;
    }

    public ak() {
        this(null, 7);
    }
}
