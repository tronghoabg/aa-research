package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ch extends com.waze.o.d.b.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f20721a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20722b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20723c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f20724d;

    public ch(String str, String str2, boolean z, h.g.a.a aVar) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "subtitle");
        h.g.b.x.f(aVar, "clickListener");
        this.f20721a = str;
        this.f20722b = str2;
        this.f20723c = z;
        this.f20724d = aVar;
    }

    public final String a() {
        return this.f20722b;
    }

    public final String b() {
        return this.f20721a;
    }

    public final h.g.a.a c() {
        return this.f20724d;
    }

    public final boolean d() {
        return this.f20723c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch)) {
            return false;
        }
        ch chVar = (ch) obj;
        return h.g.b.x.n(this.f20721a, chVar.f20721a) && h.g.b.x.n(this.f20722b, chVar.f20722b) && this.f20723c == chVar.f20723c && h.g.b.x.n(this.f20724d, chVar.f20724d);
    }

    public final int hashCode() {
        return (((((this.f20721a.hashCode() * 31) + this.f20722b.hashCode()) * 31) + a.a.a(this.f20723c)) * 31) + this.f20724d.hashCode();
    }

    public final String toString() {
        return "ButtonUiState(title=" + this.f20721a + ", subtitle=" + this.f20722b + ", isBrowsable=" + this.f20723c + ", clickListener=" + this.f20724d + ")";
    }
}
