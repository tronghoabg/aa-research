package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class df extends com.waze.car_lib.r.cq {

    /* renamed from: a, reason: collision with root package name */
    private final String f20782a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20783b;

    public df(String str, String str2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "message");
        this.f20782a = str;
        this.f20783b = str2;
    }

    public final String a() {
        return this.f20783b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df)) {
            return false;
        }
        df dfVar = (df) obj;
        return h.g.b.x.n(this.f20782a, dfVar.f20782a) && h.g.b.x.n(this.f20783b, dfVar.f20783b);
    }

    public final int hashCode() {
        return (this.f20782a.hashCode() * 31) + this.f20783b.hashCode();
    }

    @Override // com.waze.car_lib.r.cq
    public final String m() {
        return this.f20782a;
    }

    public final String toString() {
        return "Loading(title=" + this.f20782a + ", message=" + this.f20783b + ")";
    }
}
