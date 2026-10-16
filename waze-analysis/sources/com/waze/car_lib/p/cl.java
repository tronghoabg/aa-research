package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cl extends com.waze.o.d.b.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f20730a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20731b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20732c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.l f20733d;

    public cl(String str, String str2, boolean z, h.g.a.l lVar) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "subtitle");
        h.g.b.x.f(lVar, "checkedChangedListener");
        this.f20730a = str;
        this.f20731b = str2;
        this.f20732c = z;
        this.f20733d = lVar;
    }

    public final String a() {
        return this.f20731b;
    }

    public final String b() {
        return this.f20730a;
    }

    public final h.g.a.l c() {
        return this.f20733d;
    }

    public final boolean d() {
        return this.f20732c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl)) {
            return false;
        }
        cl clVar = (cl) obj;
        return h.g.b.x.n(this.f20730a, clVar.f20730a) && h.g.b.x.n(this.f20731b, clVar.f20731b) && this.f20732c == clVar.f20732c && h.g.b.x.n(this.f20733d, clVar.f20733d);
    }

    public final int hashCode() {
        return (((((this.f20730a.hashCode() * 31) + this.f20731b.hashCode()) * 31) + a.a.a(this.f20732c)) * 31) + this.f20733d.hashCode();
    }

    public final String toString() {
        return "ToggleUiState(title=" + this.f20730a + ", subtitle=" + this.f20731b + ", isChecked=" + this.f20732c + ", checkedChangedListener=" + this.f20733d + ")";
    }
}
