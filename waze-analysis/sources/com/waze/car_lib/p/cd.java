package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cd {

    /* renamed from: a, reason: collision with root package name */
    private final String f20709a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20710b;

    /* renamed from: c, reason: collision with root package name */
    private final List f20711c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.l f20712d;

    public cd(String str, int i2, List list, h.g.a.l lVar) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "options");
        h.g.b.x.f(lVar, "selectedListener");
        this.f20709a = str;
        this.f20710b = i2;
        this.f20711c = list;
        this.f20712d = lVar;
    }

    public final int a() {
        return this.f20710b;
    }

    public final String b() {
        return this.f20709a;
    }

    public final List c() {
        return this.f20711c;
    }

    public final h.g.a.l d() {
        return this.f20712d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd)) {
            return false;
        }
        cd cdVar = (cd) obj;
        return h.g.b.x.n(this.f20709a, cdVar.f20709a) && this.f20710b == cdVar.f20710b && h.g.b.x.n(this.f20711c, cdVar.f20711c) && h.g.b.x.n(this.f20712d, cdVar.f20712d);
    }

    public final int hashCode() {
        return (((((this.f20709a.hashCode() * 31) + this.f20710b) * 31) + this.f20711c.hashCode()) * 31) + this.f20712d.hashCode();
    }

    public final String toString() {
        return "OptionsListUiState(title=" + this.f20709a + ", selectedIndex=" + this.f20710b + ", options=" + this.f20711c + ", selectedListener=" + this.f20712d + ")";
    }
}
