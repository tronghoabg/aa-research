package com.waze.ui.z;

import com.waze.map.b.bi;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final e f43948a;

    /* renamed from: b, reason: collision with root package name */
    private final bi f43949b;

    public f(e eVar, bi biVar) {
        this.f43948a = eVar;
        this.f43949b = biVar;
    }

    public final bi a() {
        return this.f43949b;
    }

    public final e b() {
        return this.f43948a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.g.b.x.n(this.f43948a, fVar.f43948a) && h.g.b.x.n(this.f43949b, fVar.f43949b);
    }

    public final int hashCode() {
        e eVar = this.f43948a;
        int iHashCode = eVar == null ? 0 : eVar.hashCode();
        bi biVar = this.f43949b;
        return (iHashCode * 31) + (biVar != null ? biVar.hashCode() : 0);
    }

    public final String toString() {
        return "LiveShareDriveMapContent(area=" + this.f43948a + ", mapContentRequest=" + this.f43949b + ")";
    }
}
