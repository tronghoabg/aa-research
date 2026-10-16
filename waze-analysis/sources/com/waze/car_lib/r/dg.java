package com.waze.car_lib.r;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dg extends com.waze.o.ad {

    /* renamed from: a, reason: collision with root package name */
    private final String f21379a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(String str) {
        super(null, null);
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f21379a = str;
    }

    public final String a() {
        return this.f21379a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dg) && h.g.b.x.n(this.f21379a, ((dg) obj).f21379a);
    }

    public final int hashCode() {
        return this.f21379a.hashCode();
    }

    public final String toString() {
        return "Loading(title=" + this.f21379a + ")";
    }
}
