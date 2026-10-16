package com.waze.car_lib.p;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bt extends com.waze.car_lib.r.bq {

    /* renamed from: a, reason: collision with root package name */
    private final List f20657a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20658b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt(List list, String str) {
        super(null);
        h.g.b.x.f(list, "plugs");
        this.f20657a = list;
        this.f20658b = str;
    }

    public final String a() {
        return this.f20658b;
    }

    public final List b() {
        return this.f20657a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt)) {
            return false;
        }
        bt btVar = (bt) obj;
        return h.g.b.x.n(this.f20657a, btVar.f20657a) && h.g.b.x.n(this.f20658b, btVar.f20658b);
    }

    public final int hashCode() {
        int iHashCode = this.f20657a.hashCode() * 31;
        String str = this.f20658b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PlugData(plugs=" + this.f20657a + ", speed=" + this.f20658b + ")";
    }
}
