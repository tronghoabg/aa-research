package com.waze.ao.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f14908a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14909b;

    public g(int i2, int i3) {
        this.f14908a = i2;
        this.f14909b = i3;
    }

    public final int a() {
        return this.f14908a;
    }

    public final int b() {
        return this.f14909b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f14908a == gVar.f14908a && this.f14909b == gVar.f14909b;
    }

    public final int hashCode() {
        return (this.f14908a * 31) + this.f14909b;
    }

    public final String toString() {
        return "UiData(title=" + this.f14908a + ", iconResId=" + this.f14909b + ")";
    }
}
