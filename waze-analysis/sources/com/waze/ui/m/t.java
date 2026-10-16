package com.waze.ui.m;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final List f43035a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43036b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43037c;

    public t(List list, String str, String str2) {
        h.g.b.x.f(list, "prices");
        h.g.b.x.f(str2, "currency");
        this.f43035a = list;
        this.f43036b = str;
        this.f43037c = str2;
    }

    public final String a() {
        return this.f43037c;
    }

    public final String b() {
        return this.f43036b;
    }

    public final List c() {
        return this.f43035a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return h.g.b.x.n(this.f43035a, tVar.f43035a) && h.g.b.x.n(this.f43036b, tVar.f43036b) && h.g.b.x.n(this.f43037c, tVar.f43037c);
    }

    public final int hashCode() {
        int iHashCode = this.f43035a.hashCode() * 31;
        String str = this.f43036b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f43037c.hashCode();
    }

    public final String toString() {
        return "GasPricesModel(prices=" + this.f43035a + ", updated=" + this.f43036b + ", currency=" + this.f43037c + ")";
    }
}
