package com.waze.ads.c;

import com.waze.navigate.AddressItem;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ads.a.f f13955a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f13956b;

    /* renamed from: c, reason: collision with root package name */
    private final h.o.a f13957c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.av.d.k f13958d;

    /* renamed from: e, reason: collision with root package name */
    private final AddressItem f13959e;

    private f(com.waze.ads.a.f fVar, boolean z, h.o.a aVar, com.waze.av.d.k kVar, AddressItem addressItem) {
        x.f(addressItem, "addressItem");
        this.f13955a = fVar;
        this.f13956b = z;
        this.f13957c = aVar;
        this.f13958d = kVar;
        this.f13959e = addressItem;
    }

    public static final f f(com.waze.ads.a.f fVar, boolean z, h.o.a aVar, com.waze.av.d.k kVar, AddressItem addressItem) {
        x.f(addressItem, "addressItem");
        return new f(fVar, z, aVar, kVar, addressItem);
    }

    public static /* synthetic */ f g(f fVar, boolean z, h.o.a aVar, com.waze.av.d.k kVar, AddressItem addressItem, int i2) {
        com.waze.ads.a.f fVar2 = (i2 & 1) != 0 ? fVar.f13955a : null;
        if ((i2 & 2) != 0) {
            z = fVar.f13956b;
        }
        if ((i2 & 4) != 0) {
            aVar = fVar.f13957c;
        }
        if ((i2 & 8) != 0) {
            kVar = fVar.f13958d;
        }
        if ((i2 & 16) != 0) {
            addressItem = fVar.f13959e;
        }
        return f(fVar2, z, aVar, kVar, addressItem);
    }

    public final com.waze.ads.a.f a() {
        return this.f13955a;
    }

    public final com.waze.av.d.k b() {
        return this.f13958d;
    }

    public final AddressItem c() {
        return this.f13959e;
    }

    public final h.o.a d() {
        return this.f13957c;
    }

    public final boolean e() {
        return this.f13956b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f13955a, fVar.f13955a) && this.f13956b == fVar.f13956b && x.n(this.f13957c, fVar.f13957c) && x.n(this.f13958d, fVar.f13958d) && x.n(this.f13959e, fVar.f13959e);
    }

    public final int hashCode() {
        com.waze.ads.a.f fVar = this.f13955a;
        int iHashCode = fVar == null ? 0 : fVar.hashCode();
        boolean z = this.f13956b;
        h.o.a aVar = this.f13957c;
        int iB = aVar == null ? 0 : a.a.b(aVar.w());
        int iA = a.a.a(z);
        int i2 = iHashCode * 31;
        com.waze.av.d.k kVar = this.f13958d;
        return ((((((i2 + iA) * 31) + iB) * 31) + (kVar != null ? kVar.hashCode() : 0)) * 31) + this.f13959e.hashCode();
    }

    public final String toString() {
        return "InternalState(adData=" + this.f13955a + ", adInfoVisible=" + this.f13956b + ", detourDuration=" + this.f13957c + ", venueData=" + this.f13958d + ", addressItem=" + this.f13959e + ")";
    }

    public /* synthetic */ f(AddressItem addressItem) {
        this(null, false, null, null, addressItem);
    }
}
