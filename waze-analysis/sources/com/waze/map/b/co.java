package com.waze.map.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class co extends com.waze.destination_cell.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final List f28154a;

    /* renamed from: b, reason: collision with root package name */
    private final ct f28155b;

    /* renamed from: c, reason: collision with root package name */
    private final float f28156c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(List list, ct ctVar, float f2) {
        super(null);
        h.g.b.x.f(list, "coordinates");
        h.g.b.x.f(ctVar, "displayState");
        this.f28154a = list;
        this.f28155b = ctVar;
        this.f28156c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co)) {
            return false;
        }
        co coVar = (co) obj;
        return h.g.b.x.n(this.f28154a, coVar.f28154a) && this.f28155b == coVar.f28155b && Float.compare(this.f28156c, coVar.f28156c) == 0;
    }

    public final float h() {
        return this.f28156c;
    }

    public final int hashCode() {
        return (((this.f28154a.hashCode() * 31) + this.f28155b.hashCode()) * 31) + Float.floatToIntBits(this.f28156c);
    }

    public final ct i() {
        return this.f28155b;
    }

    public final List j() {
        return this.f28154a;
    }

    public final String toString() {
        return "FitToArea(coordinates=" + this.f28154a + ", displayState=" + this.f28155b + ", boundsFactor=" + this.f28156c + ")";
    }

    public /* synthetic */ co(List list, ct ctVar, float f2, int i2) {
        this(list, (i2 & 2) != 0 ? ct.f28166b : ctVar, (i2 & 4) != 0 ? 1.1f : f2);
    }
}
