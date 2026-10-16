package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bz extends com.waze.car_lib.r.bq {

    /* renamed from: a, reason: collision with root package name */
    private final String f20685a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20686b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz(String str, boolean z) {
        super(null);
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f20685a = str;
        this.f20686b = z;
    }

    public static /* synthetic */ bz a(bz bzVar, boolean z) {
        String str = bzVar.f20685a;
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        return new bz(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj;
        return h.g.b.x.n(this.f20685a, bzVar.f20685a) && this.f20686b == bzVar.f20686b;
    }

    @Override // com.waze.car_lib.r.bq
    public final boolean f() {
        return this.f20686b;
    }

    public final int hashCode() {
        return (this.f20685a.hashCode() * 31) + a.a.a(this.f20686b);
    }

    public final String toString() {
        return "Loading(title=" + this.f20685a + ", isInPanMode=" + this.f20686b + ")";
    }
}
