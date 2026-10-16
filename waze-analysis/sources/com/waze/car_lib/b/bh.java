package com.waze.car_lib.b;

import com.waze.reports_v2.c.cb;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bh extends com.waze.alerters.a.k {

    /* renamed from: a, reason: collision with root package name */
    private final cb f19029a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(cb cbVar) {
        super(null);
        h.g.b.x.f(cbVar, "variant");
        this.f19029a = cbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh) && this.f19029a == ((bh) obj).f19029a;
    }

    public final cb f() {
        return this.f19029a;
    }

    public final int hashCode() {
        return this.f19029a.hashCode();
    }

    public final String toString() {
        return "FteHint(variant=" + this.f19029a + ")";
    }
}
