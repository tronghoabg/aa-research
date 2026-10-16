package com.waze.bw.a.c;

import com.waze.bw.c.d.v;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final d f17641a;

    /* renamed from: b, reason: collision with root package name */
    private final n f17642b;

    /* renamed from: c, reason: collision with root package name */
    private final v f17643c;

    public e(d dVar, v vVar, n nVar) {
        x.f(dVar, "destination");
        x.f(vVar, "driveType");
        this.f17641a = dVar;
        this.f17643c = vVar;
        this.f17642b = nVar;
    }

    public final d a() {
        return this.f17641a;
    }

    public final n b() {
        return this.f17642b;
    }

    public final v c() {
        return this.f17643c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return x.n(this.f17641a, eVar.f17641a) && x.n(this.f17643c, eVar.f17643c) && this.f17642b == eVar.f17642b;
    }

    public final int hashCode() {
        int iHashCode = (this.f17641a.hashCode() * 31) + this.f17643c.hashCode();
        n nVar = this.f17642b;
        return (iHashCode * 31) + (nVar == null ? 0 : nVar.hashCode());
    }

    public final String toString() {
        return "StartStateCarUIDrive(destination=" + this.f17641a + ", driveType=" + this.f17643c + ", trafficInfo=" + this.f17642b + ")";
    }
}
