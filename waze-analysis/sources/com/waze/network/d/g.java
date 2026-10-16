package com.waze.network.d;

import e.a.cm;
import e.a.cq;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final cq f32192a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a.h f32193b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a.i f32194c;

    /* renamed from: d, reason: collision with root package name */
    private final cm f32195d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f32196e;

    /* renamed from: f, reason: collision with root package name */
    private final int f32197f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f32198g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f32199h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.uid.f f32200i;

    public g(cq cqVar, e.a.h hVar, e.a.i iVar, cm cmVar, com.waze.uid.f fVar, boolean z, int i2, Object obj) {
        x.f(cqVar, "method");
        x.f(iVar, "channel");
        x.f(cmVar, "headers");
        this.f32192a = cqVar;
        this.f32193b = hVar;
        this.f32194c = iVar;
        this.f32195d = cmVar;
        this.f32200i = fVar;
        this.f32196e = z;
        this.f32197f = i2;
        this.f32198g = obj;
        this.f32199h = false;
    }

    public static /* synthetic */ g g(g gVar, com.waze.uid.f fVar, boolean z, int i2, Object obj, int i3) {
        cq cqVar = (i3 & 1) != 0 ? gVar.f32192a : null;
        e.a.h hVar = (i3 & 2) != 0 ? gVar.f32193b : null;
        e.a.i iVar = (i3 & 4) != 0 ? gVar.f32194c : null;
        cm cmVar = (i3 & 8) != 0 ? gVar.f32195d : null;
        if ((i3 & 16) != 0) {
            fVar = gVar.f32200i;
        }
        com.waze.uid.f fVar2 = fVar;
        if ((i3 & 32) != 0) {
            z = gVar.f32196e;
        }
        boolean z2 = z;
        int i4 = (i3 & 64) != 0 ? gVar.f32197f : i2;
        Object obj2 = (i3 & 128) != 0 ? gVar.f32198g : obj;
        boolean z3 = gVar.f32199h;
        x.f(cqVar, "method");
        x.f(iVar, "channel");
        x.f(cmVar, "headers");
        return new g(cqVar, hVar, iVar, cmVar, fVar2, z2, i4, obj2);
    }

    public final e.a.h a() {
        return this.f32193b;
    }

    public final e.a.i b() {
        return this.f32194c;
    }

    public final cm c() {
        return this.f32195d;
    }

    public final cq d() {
        return this.f32192a;
    }

    public final Object e() {
        return this.f32198g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!x.n(this.f32192a, gVar.f32192a) || !x.n(this.f32193b, gVar.f32193b) || !x.n(this.f32194c, gVar.f32194c) || !x.n(this.f32195d, gVar.f32195d) || !x.n(this.f32200i, gVar.f32200i) || this.f32196e != gVar.f32196e || this.f32197f != gVar.f32197f || !x.n(this.f32198g, gVar.f32198g)) {
            return false;
        }
        boolean z = gVar.f32199h;
        return true;
    }

    public final boolean f() {
        return this.f32196e;
    }

    public final int hashCode() {
        int iHashCode = this.f32192a.hashCode() * 31;
        e.a.h hVar = this.f32193b;
        int iHashCode2 = (((((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.f32194c.hashCode()) * 31) + this.f32195d.hashCode()) * 31;
        com.waze.uid.f fVar = this.f32200i;
        int iHashCode3 = (((((iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + a.a.a(this.f32196e)) * 31) + this.f32197f) * 31;
        Object obj = this.f32198g;
        return ((iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31) + a.a.a(false);
    }

    public final String toString() {
        return "CallProbe(method=" + this.f32192a + ", callOptions=" + this.f32193b + ", channel=" + this.f32194c + ", headers=" + this.f32195d + ", callListener=" + this.f32200i + ", cancelled=" + this.f32196e + ", numMessages=" + this.f32197f + ", requestMessage=" + this.f32198g + ", messageCompression=false)";
    }
}
