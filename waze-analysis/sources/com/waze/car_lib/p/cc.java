package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cc {

    /* renamed from: a, reason: collision with root package name */
    private final String f20706a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20707b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f20708c;

    public cc(String str, String str2, Integer num) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f20706a = str;
        this.f20707b = str2;
        this.f20708c = num;
    }

    public final Integer a() {
        return this.f20708c;
    }

    public final String b() {
        return this.f20707b;
    }

    public final String c() {
        return this.f20706a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj;
        return h.g.b.x.n(this.f20706a, ccVar.f20706a) && h.g.b.x.n(this.f20707b, ccVar.f20707b) && h.g.b.x.n(this.f20708c, ccVar.f20708c);
    }

    public final int hashCode() {
        int iHashCode = this.f20706a.hashCode() * 31;
        String str = this.f20707b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f20708c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Option(title=" + this.f20706a + ", subtitle=" + this.f20707b + ", iconResId=" + this.f20708c + ")";
    }
}
