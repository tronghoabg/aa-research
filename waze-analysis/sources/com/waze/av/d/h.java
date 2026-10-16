package com.waze.av.d;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final List f16069a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16070b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16071c;

    public h(List list, String str, String str2) {
        x.f(list, "prices");
        x.f(str2, "currency");
        this.f16069a = list;
        this.f16070b = str;
        this.f16071c = str2;
    }

    public final String a() {
        return this.f16071c;
    }

    public final String b() {
        return this.f16070b;
    }

    public final List c() {
        return this.f16069a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return x.n(this.f16069a, hVar.f16069a) && x.n(this.f16070b, hVar.f16070b) && x.n(this.f16071c, hVar.f16071c);
    }

    public final int hashCode() {
        int iHashCode = this.f16069a.hashCode() * 31;
        String str = this.f16070b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f16071c.hashCode();
    }

    public final String toString() {
        return "FormattedGasPrices(prices=" + this.f16069a + ", updated=" + this.f16070b + ", currency=" + this.f16071c + ")";
    }
}
