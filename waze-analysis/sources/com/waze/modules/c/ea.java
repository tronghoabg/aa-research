package com.waze.modules.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ea {

    /* renamed from: a, reason: collision with root package name */
    private final List f30136a;

    /* renamed from: b, reason: collision with root package name */
    private final List f30137b;

    /* renamed from: c, reason: collision with root package name */
    private final List f30138c;

    /* renamed from: d, reason: collision with root package name */
    private final List f30139d;

    public ea(List list, List list2, List list3, List list4) {
        h.g.b.x.f(list, "closurePolylines");
        h.g.b.x.f(list2, "closurePins");
        h.g.b.x.f(list3, "turnClosurePins");
        h.g.b.x.f(list4, "visualMte");
        this.f30136a = list;
        this.f30137b = list2;
        this.f30138c = list3;
        this.f30139d = list4;
    }

    public final List a() {
        return this.f30137b;
    }

    public final List b() {
        return this.f30136a;
    }

    public final List c() {
        return this.f30138c;
    }

    public final List d() {
        return this.f30139d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        return h.g.b.x.n(this.f30136a, eaVar.f30136a) && h.g.b.x.n(this.f30137b, eaVar.f30137b) && h.g.b.x.n(this.f30138c, eaVar.f30138c) && h.g.b.x.n(this.f30139d, eaVar.f30139d);
    }

    public final int hashCode() {
        return (((((this.f30136a.hashCode() * 31) + this.f30137b.hashCode()) * 31) + this.f30138c.hashCode()) * 31) + this.f30139d.hashCode();
    }

    public final String toString() {
        return "VisualImpactInfo(closurePolylines=" + this.f30136a + ", closurePins=" + this.f30137b + ", turnClosurePins=" + this.f30138c + ", visualMte=" + this.f30139d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ea() {
        List list = null;
        this(list, list, list, 15);
    }

    public /* synthetic */ ea(List list, List list2, List list3, int i2) {
        this((i2 & 1) != 0 ? h.a.i.h() : list, (i2 & 2) != 0 ? h.a.i.h() : list2, (i2 & 4) != 0 ? h.a.i.h() : list3, h.a.i.h());
    }
}
