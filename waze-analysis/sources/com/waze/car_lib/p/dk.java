package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dk extends com.waze.car_lib.r.cq {

    /* renamed from: a, reason: collision with root package name */
    private final String f20797a;

    public dk(String str) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f20797a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dk) && h.g.b.x.n(this.f20797a, ((dk) obj).f20797a);
    }

    public final int hashCode() {
        return this.f20797a.hashCode();
    }

    @Override // com.waze.car_lib.r.cq
    public final String m() {
        return this.f20797a;
    }

    public final String toString() {
        return "Loading(title=" + this.f20797a + ")";
    }
}
