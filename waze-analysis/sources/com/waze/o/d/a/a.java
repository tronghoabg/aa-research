package com.waze.o.d.a;

import com.waze.gas.GasNativeManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f32841a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32842b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32843c;

    public a(String str, String str2, int i2) {
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f32841a = str;
        this.f32842b = str2;
        this.f32843c = i2;
    }

    public final int a() {
        return this.f32843c;
    }

    public final String b() {
        return this.f32842b;
    }

    public final String c() {
        return this.f32841a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f32841a, aVar.f32841a) && x.n(this.f32842b, aVar.f32842b) && this.f32843c == aVar.f32843c;
    }

    public final int hashCode() {
        int iHashCode = this.f32841a.hashCode() * 31;
        String str = this.f32842b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f32843c;
    }

    public final String toString() {
        return "CompaninioListItemModel(title=" + this.f32841a + ", subtitle=" + this.f32842b + ", iconResId=" + this.f32843c + ")";
    }
}
