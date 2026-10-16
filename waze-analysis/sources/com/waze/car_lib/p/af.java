package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    private final String f20539a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20540b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20541c;

    public af(String str, boolean z, boolean z2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f20539a = str;
        this.f20540b = z;
        this.f20541c = z2;
    }

    public final String a() {
        return this.f20539a;
    }

    public final boolean b() {
        return this.f20541c;
    }

    public final boolean c() {
        return this.f20540b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return h.g.b.x.n(this.f20539a, afVar.f20539a) && this.f20540b == afVar.f20540b && this.f20541c == afVar.f20541c;
    }

    public final int hashCode() {
        return (((this.f20539a.hashCode() * 31) + a.a.a(this.f20540b)) * 31) + a.a.a(this.f20541c);
    }

    public final String toString() {
        return "ActionUiState(title=" + this.f20539a + ", isPrimary=" + this.f20540b + ", withTimer=" + this.f20541c + ")";
    }
}
