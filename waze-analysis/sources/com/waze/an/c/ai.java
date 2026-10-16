package com.waze.an.c;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private final int f14757a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14758b;

    /* renamed from: c, reason: collision with root package name */
    private final ah f14759c;

    /* renamed from: d, reason: collision with root package name */
    private final aj f14760d;

    public ai(int i2, String str, ah ahVar, aj ajVar) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(ajVar, "userPositionRelativeToSegment");
        this.f14757a = i2;
        this.f14758b = str;
        this.f14759c = ahVar;
        this.f14760d = ajVar;
    }

    public final int a() {
        return this.f14757a;
    }

    public final ah b() {
        return this.f14759c;
    }

    public final aj c() {
        return this.f14760d;
    }

    public final String d() {
        return this.f14758b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return this.f14757a == aiVar.f14757a && h.g.b.x.n(this.f14758b, aiVar.f14758b) && h.g.b.x.n(this.f14759c, aiVar.f14759c) && this.f14760d == aiVar.f14760d;
    }

    public final int hashCode() {
        int iHashCode = (this.f14757a * 31) + this.f14758b.hashCode();
        ah ahVar = this.f14759c;
        return (((iHashCode * 31) + (ahVar == null ? 0 : ahVar.hashCode())) * 31) + this.f14760d.hashCode();
    }

    public final String toString() {
        return "Spec(iconResId=" + this.f14757a + ", title=" + this.f14758b + ", richContent=" + this.f14759c + ", userPositionRelativeToSegment=" + this.f14760d + ")";
    }
}
