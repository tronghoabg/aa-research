package com.waze.car_lib.r;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f21661a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21662b;

    public g(String str, String str2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "qrCodeUrl");
        this.f21661a = str;
        this.f21662b = str2;
    }

    public final String a() {
        return this.f21662b;
    }

    public final String b() {
        return this.f21661a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return h.g.b.x.n(this.f21661a, gVar.f21661a) && h.g.b.x.n(this.f21662b, gVar.f21662b);
    }

    public final int hashCode() {
        return (this.f21661a.hashCode() * 31) + this.f21662b.hashCode();
    }

    public final String toString() {
        return "UiState(title=" + this.f21661a + ", qrCodeUrl=" + this.f21662b + ")";
    }
}
