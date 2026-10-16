package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cy extends com.waze.o.d.b.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f20758a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20759b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20760c;

    /* renamed from: d, reason: collision with root package name */
    private final List f20761d;

    public cy(String str, boolean z, boolean z2, List list) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "items");
        this.f20758a = str;
        this.f20759b = z;
        this.f20760c = z2;
        this.f20761d = list;
    }

    public final String a() {
        return this.f20758a;
    }

    public final List b() {
        return this.f20761d;
    }

    public final boolean c() {
        return this.f20760c;
    }

    public final boolean d() {
        return this.f20759b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy)) {
            return false;
        }
        cy cyVar = (cy) obj;
        return h.g.b.x.n(this.f20758a, cyVar.f20758a) && this.f20759b == cyVar.f20759b && this.f20760c == cyVar.f20760c && h.g.b.x.n(this.f20761d, cyVar.f20761d);
    }

    public final int hashCode() {
        int iHashCode = this.f20758a.hashCode() * 31;
        List list = this.f20761d;
        return ((((iHashCode + a.a.a(this.f20759b)) * 31) + a.a.a(this.f20760c)) * 31) + list.hashCode();
    }

    public final String toString() {
        return "Loaded(title=" + this.f20758a + ", shouldShowXIcon=" + this.f20759b + ", shouldShowBackButton=" + this.f20760c + ", items=" + this.f20761d + ")";
    }

    public /* synthetic */ cy(String str, boolean z, List list) {
        this(str, z, true, list);
    }
}
