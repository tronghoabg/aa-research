package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class by extends com.waze.car_lib.r.bq {

    /* renamed from: a, reason: collision with root package name */
    private final String f20679a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20680b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20681c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20682d;

    /* renamed from: e, reason: collision with root package name */
    private final List f20683e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f20684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by(String str, boolean z, int i2, int i3, List list, boolean z2) {
        super(null);
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "items");
        this.f20679a = str;
        this.f20680b = z;
        this.f20681c = i2;
        this.f20682d = i3;
        this.f20683e = list;
        this.f20684f = z2;
    }

    public static /* synthetic */ by g(by byVar, String str, boolean z, List list, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            str = byVar.f20679a;
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            z = byVar.f20680b;
        }
        boolean z3 = z;
        int i3 = (i2 & 4) != 0 ? byVar.f20681c : 0;
        int i4 = (i2 & 8) != 0 ? byVar.f20682d : 0;
        if ((i2 & 16) != 0) {
            list = byVar.f20683e;
        }
        List list2 = list;
        h.g.b.x.f(str2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list2, "items");
        return new by(str2, z3, i3, i4, list2, z2);
    }

    public final int a() {
        return this.f20682d;
    }

    public final int b() {
        return this.f20681c;
    }

    public final String c() {
        return this.f20679a;
    }

    public final List d() {
        return this.f20683e;
    }

    public final boolean e() {
        return this.f20680b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by)) {
            return false;
        }
        by byVar = (by) obj;
        return h.g.b.x.n(this.f20679a, byVar.f20679a) && this.f20680b == byVar.f20680b && this.f20681c == byVar.f20681c && this.f20682d == byVar.f20682d && h.g.b.x.n(this.f20683e, byVar.f20683e) && this.f20684f == byVar.f20684f;
    }

    @Override // com.waze.car_lib.r.bq
    public final boolean f() {
        return this.f20684f;
    }

    public final int hashCode() {
        return (((((((((this.f20679a.hashCode() * 31) + a.a.a(this.f20680b)) * 31) + this.f20681c) * 31) + this.f20682d) * 31) + this.f20683e.hashCode()) * 31) + a.a.a(this.f20684f);
    }

    public final String toString() {
        return "Loaded(title=" + this.f20679a + ", showInfoButton=" + this.f20680b + ", infoIcon=" + this.f20681c + ", closeIcon=" + this.f20682d + ", items=" + this.f20683e + ", isInPanMode=" + this.f20684f + ")";
    }
}
