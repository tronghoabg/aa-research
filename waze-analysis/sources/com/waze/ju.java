package com.waze;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ju extends ka {

    /* renamed from: a, reason: collision with root package name */
    private final int f24981a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24982b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24983c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24984d;

    public ju(int i2, String str, String str2, int i3) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "description");
        this.f24981a = i2;
        this.f24982b = str;
        this.f24983c = str2;
        this.f24984d = i3;
    }

    public final int a() {
        return this.f24984d;
    }

    public final int b() {
        return this.f24981a;
    }

    public final String c() {
        return this.f24983c;
    }

    public final String d() {
        return this.f24982b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju)) {
            return false;
        }
        ju juVar = (ju) obj;
        return this.f24981a == juVar.f24981a && h.g.b.x.n(this.f24982b, juVar.f24982b) && h.g.b.x.n(this.f24983c, juVar.f24983c) && this.f24984d == juVar.f24984d;
    }

    public final int hashCode() {
        return (((((this.f24981a * 31) + this.f24982b.hashCode()) * 31) + this.f24983c.hashCode()) * 31) + this.f24984d;
    }

    public final String toString() {
        return "RoutingResponseError(serverResponseCode=" + this.f24981a + ", title=" + this.f24982b + ", description=" + this.f24983c + ", seconds=" + this.f24984d + ")";
    }
}
