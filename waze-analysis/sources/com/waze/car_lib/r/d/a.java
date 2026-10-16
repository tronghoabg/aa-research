package com.waze.car_lib.r.d;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f21266a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21267b;

    public a(String str, String str2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "message");
        this.f21266a = str;
        this.f21267b = str2;
    }

    public final String a() {
        return this.f21267b;
    }

    public final String b() {
        return this.f21266a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f21266a, aVar.f21266a) && h.g.b.x.n(this.f21267b, aVar.f21267b);
    }

    public final int hashCode() {
        return (this.f21266a.hashCode() * 31) + this.f21267b.hashCode();
    }

    public final String toString() {
        return "InfoContent(title=" + this.f21266a + ", message=" + this.f21267b + ")";
    }
}
