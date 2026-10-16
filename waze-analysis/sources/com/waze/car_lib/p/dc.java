package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    private final String f20769a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20770b;

    public dc(String str, boolean z) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f20769a = str;
        this.f20770b = z;
    }

    public final String a() {
        return this.f20769a;
    }

    public final boolean b() {
        return this.f20770b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj;
        return h.g.b.x.n(this.f20769a, dcVar.f20769a) && this.f20770b == dcVar.f20770b;
    }

    public final int hashCode() {
        return (this.f20769a.hashCode() * 31) + a.a.a(this.f20770b);
    }

    public final String toString() {
        return "ActionUiState(title=" + this.f20769a + ", isPrimary=" + this.f20770b + ")";
    }
}
