package com.waze.navigate;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final List f31817a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31818b;

    public u(List list, String str) {
        h.g.b.x.f(list, "prices");
        this.f31817a = list;
        this.f31818b = str;
    }

    public final String a() {
        return this.f31818b;
    }

    public final List b() {
        return this.f31817a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return h.g.b.x.n(this.f31817a, uVar.f31817a) && h.g.b.x.n(this.f31818b, uVar.f31818b);
    }

    public final int hashCode() {
        int iHashCode = this.f31817a.hashCode() * 31;
        String str = this.f31818b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ProductPrices(prices=" + this.f31817a + ", lastUpdatedString=" + this.f31818b + ")";
    }

    public u() {
        this(null);
    }

    public /* synthetic */ u(byte[] bArr) {
        this(h.a.i.h(), null);
    }
}
