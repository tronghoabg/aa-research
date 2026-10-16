package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dj extends com.waze.car_lib.r.cq {

    /* renamed from: a, reason: collision with root package name */
    private final String f20793a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20794b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20795c;

    /* renamed from: d, reason: collision with root package name */
    private final List f20796d;

    public dj(String str, String str2, String str3, List list) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "sectionTitle");
        h.g.b.x.f(str3, "noItemMessage");
        h.g.b.x.f(list, "list");
        this.f20793a = str;
        this.f20794b = str2;
        this.f20795c = str3;
        this.f20796d = list;
    }

    public final String a() {
        return this.f20795c;
    }

    public final String c() {
        return this.f20794b;
    }

    public final List d() {
        return this.f20796d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj)) {
            return false;
        }
        dj djVar = (dj) obj;
        return h.g.b.x.n(this.f20793a, djVar.f20793a) && h.g.b.x.n(this.f20794b, djVar.f20794b) && h.g.b.x.n(this.f20795c, djVar.f20795c) && h.g.b.x.n(this.f20796d, djVar.f20796d);
    }

    public final int hashCode() {
        return (((((this.f20793a.hashCode() * 31) + this.f20794b.hashCode()) * 31) + this.f20795c.hashCode()) * 31) + this.f20796d.hashCode();
    }

    @Override // com.waze.car_lib.r.cq
    public final String m() {
        return this.f20793a;
    }

    public final String toString() {
        return "List(title=" + this.f20793a + ", sectionTitle=" + this.f20794b + ", noItemMessage=" + this.f20795c + ", list=" + this.f20796d + ")";
    }
}
