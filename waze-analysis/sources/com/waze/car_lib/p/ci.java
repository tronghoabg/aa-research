package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ci extends com.waze.o.d.b.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f20725a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20726b;

    public ci(String str, String str2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "subtitle");
        this.f20725a = str;
        this.f20726b = str2;
    }

    public final String a() {
        return this.f20726b;
    }

    public final String b() {
        return this.f20725a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        return h.g.b.x.n(this.f20725a, ciVar.f20725a) && h.g.b.x.n(this.f20726b, ciVar.f20726b);
    }

    public final int hashCode() {
        return (this.f20725a.hashCode() * 31) + this.f20726b.hashCode();
    }

    public final String toString() {
        return "DataUiState(title=" + this.f20725a + ", subtitle=" + this.f20726b + ")";
    }
}
