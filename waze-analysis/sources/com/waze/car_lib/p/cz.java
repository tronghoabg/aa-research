package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cz extends com.waze.o.d.b.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f20762a;

    public cz(String str) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f20762a = str;
    }

    public final String a() {
        return this.f20762a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cz) && h.g.b.x.n(this.f20762a, ((cz) obj).f20762a);
    }

    public final int hashCode() {
        return this.f20762a.hashCode();
    }

    public final String toString() {
        return "Loading(title=" + this.f20762a + ")";
    }

    public cz() {
        this((byte[]) null);
    }

    public /* synthetic */ cz(byte[] bArr) {
        this("");
    }
}
