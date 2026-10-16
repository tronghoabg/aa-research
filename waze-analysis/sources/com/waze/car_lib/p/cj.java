package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cj extends com.waze.o.d.b.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f20727a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20728b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f20729c;

    public cj(String str, String str2, h.g.a.a aVar) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "subtitle");
        h.g.b.x.f(aVar, "clickListener");
        this.f20727a = str;
        this.f20728b = str2;
        this.f20729c = aVar;
    }

    public final String a() {
        return this.f20728b;
    }

    public final String b() {
        return this.f20727a;
    }

    public final h.g.a.a c() {
        return this.f20729c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj)) {
            return false;
        }
        cj cjVar = (cj) obj;
        return h.g.b.x.n(this.f20727a, cjVar.f20727a) && h.g.b.x.n(this.f20728b, cjVar.f20728b) && h.g.b.x.n(this.f20729c, cjVar.f20729c);
    }

    public final int hashCode() {
        return (((this.f20727a.hashCode() * 31) + this.f20728b.hashCode()) * 31) + this.f20729c.hashCode();
    }

    public final String toString() {
        return "PageUiState(title=" + this.f20727a + ", subtitle=" + this.f20728b + ", clickListener=" + this.f20729c + ")";
    }
}
