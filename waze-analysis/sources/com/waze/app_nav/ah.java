package com.waze.app_nav;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private static final ah f15182a = new ah(false, null, 0 == true ? 1 : 0, 7);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15183b;

    /* renamed from: c, reason: collision with root package name */
    private final c f15184c;

    /* renamed from: d, reason: collision with root package name */
    private final f f15185d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ah(boolean z, c cVar, f fVar, int i2) {
        fVar = (i2 & 4) != 0 ? new f(g.f15207c) : fVar;
        int i3 = i2 & 2;
        int i4 = i2 & 1;
        this(1 == ((z ? 1 : 0) | i4), i3 != 0 ? null : cVar, fVar);
    }

    public static final ah d() {
        return f15182a;
    }

    public final c a() {
        return this.f15184c;
    }

    public final f b() {
        return this.f15185d;
    }

    public final boolean e() {
        return this.f15183b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return this.f15183b == ahVar.f15183b && this.f15184c == ahVar.f15184c && h.g.b.x.n(this.f15185d, ahVar.f15185d);
    }

    public final int hashCode() {
        c cVar = this.f15184c;
        return (((a.a.a(this.f15183b) * 31) + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f15185d.hashCode();
    }

    public final String toString() {
        return "WazeMainScreenFlowOptions(clearBackStack=" + this.f15183b + ", orientation=" + this.f15184c + ", mapBehavior=" + this.f15185d + ")";
    }

    public ah(boolean z, c cVar, f fVar) {
        h.g.b.x.f(fVar, "mapBehavior");
        this.f15183b = z;
        this.f15184c = cVar;
        this.f15185d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ah() {
        this(false, null, 0 == true ? 1 : 0, 7);
    }
}
