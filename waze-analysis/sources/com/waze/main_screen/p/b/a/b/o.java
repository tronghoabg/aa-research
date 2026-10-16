package com.waze.main_screen.p.b.a.b;

import com.waze.navigate.bv;
import com.waze.navigate.cq;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private final bv f27142a;

    /* renamed from: b, reason: collision with root package name */
    private final cq f27143b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27144c;

    public o(bv bvVar, cq cqVar, String str) {
        x.f(bvVar, "drivingSide");
        this.f27142a = bvVar;
        this.f27143b = cqVar;
        this.f27144c = str;
    }

    public final bv a() {
        return this.f27142a;
    }

    public final cq b() {
        return this.f27143b;
    }

    public final String c() {
        return this.f27144c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f27142a == oVar.f27142a && x.n(this.f27143b, oVar.f27143b) && x.n(this.f27144c, oVar.f27144c);
    }

    public final int hashCode() {
        int iHashCode = this.f27142a.hashCode() * 31;
        cq cqVar = this.f27143b;
        int iHashCode2 = (iHashCode + (cqVar == null ? 0 : cqVar.hashCode())) * 31;
        String str = this.f27144c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "NavigationState(drivingSide=" + this.f27142a + ", instrcution=" + this.f27143b + ", hovText=" + this.f27144c + ")";
    }
}
