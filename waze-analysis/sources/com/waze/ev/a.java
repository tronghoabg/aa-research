package com.waze.ev;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final List f23672a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23673b;

    /* renamed from: c, reason: collision with root package name */
    private final List f23674c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23675d;

    public a(List list, boolean z, List list2, String str) {
        x.f(list, "connectorOverviews");
        x.f(list2, "paymentMethods");
        this.f23672a = list;
        this.f23673b = z;
        this.f23674c = list2;
        this.f23675d = str;
    }

    public final String a() {
        return this.f23675d;
    }

    public final List b() {
        return this.f23672a;
    }

    public final List c() {
        return this.f23674c;
    }

    public final boolean d() {
        return this.f23673b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f23672a, aVar.f23672a) && this.f23673b == aVar.f23673b && x.n(this.f23674c, aVar.f23674c) && x.n(this.f23675d, aVar.f23675d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f23672a.hashCode() * 31) + a.a.a(this.f23673b)) * 31) + this.f23674c.hashCode();
        String str = this.f23675d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "EVChargingVenue(connectorOverviews=" + this.f23672a + ", restrictedAccess=" + this.f23673b + ", paymentMethods=" + this.f23674c + ", directions=" + this.f23675d + ")";
    }
}
