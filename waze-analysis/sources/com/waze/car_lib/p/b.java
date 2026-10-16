package com.waze.car_lib.p;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List f20604a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20605b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20606c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20607d;

    public b(List list, String str, String str2, String str3) {
        h.g.b.x.f(list, "connectors");
        this.f20604a = list;
        this.f20605b = str;
        this.f20606c = str2;
        this.f20607d = str3;
    }

    public final String a() {
        return this.f20605b;
    }

    public final String b() {
        return this.f20607d;
    }

    public final String c() {
        return this.f20606c;
    }

    public final List d() {
        return this.f20604a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.g.b.x.n(this.f20604a, bVar.f20604a) && h.g.b.x.n(this.f20605b, bVar.f20605b) && h.g.b.x.n(this.f20606c, bVar.f20606c) && h.g.b.x.n(this.f20607d, bVar.f20607d);
    }

    public final int hashCode() {
        int iHashCode = this.f20604a.hashCode() * 31;
        String str = this.f20605b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20606c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20607d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "EVData(connectors=" + this.f20604a + ", directions=" + this.f20605b + ", paymentMethods=" + this.f20606c + ", noMatchingPlugsWarning=" + this.f20607d + ")";
    }
}
