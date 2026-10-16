package com.waze.location;

import android.location.Location;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final Map f25417a;

    /* renamed from: b, reason: collision with root package name */
    private final Location f25418b;

    /* renamed from: c, reason: collision with root package name */
    private final bf f25419c;

    /* renamed from: d, reason: collision with root package name */
    private final long f25420d;

    public t(Map map, Location location, bf bfVar, long j2) {
        h.g.b.x.f(map, "lastLocationBySource");
        h.g.b.x.f(bfVar, "activeLocationSource");
        this.f25417a = map;
        this.f25418b = location;
        this.f25419c = bfVar;
        this.f25420d = j2;
    }

    public static /* synthetic */ t f(t tVar, Map map, Location location, bf bfVar, long j2, int i2) {
        if ((i2 & 1) != 0) {
            map = tVar.f25417a;
        }
        Map map2 = map;
        if ((i2 & 2) != 0) {
            location = tVar.f25418b;
        }
        Location location2 = location;
        if ((i2 & 4) != 0) {
            bfVar = tVar.f25419c;
        }
        bf bfVar2 = bfVar;
        if ((i2 & 8) != 0) {
            j2 = tVar.f25420d;
        }
        h.g.b.x.f(map2, "lastLocationBySource");
        h.g.b.x.f(bfVar2, "activeLocationSource");
        return new t(map2, location2, bfVar2, j2);
    }

    public final long a() {
        return this.f25420d;
    }

    public final Location b() {
        return this.f25418b;
    }

    public final t c(bf bfVar, Location location) {
        h.g.b.x.f(bfVar, "source");
        h.g.b.x.f(location, "location");
        return f(this, h.a.r.p(this.f25417a, new h.k(bfVar, new Location(location))), (bfVar == bf.f25345c && location.hasSpeed()) ? new Location(location) : this.f25418b, null, 0L, 12);
    }

    public final bf d() {
        return this.f25419c;
    }

    public final Map e() {
        return this.f25417a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return h.g.b.x.n(this.f25417a, tVar.f25417a) && h.g.b.x.n(this.f25418b, tVar.f25418b) && this.f25419c == tVar.f25419c && this.f25420d == tVar.f25420d;
    }

    public final int hashCode() {
        int iHashCode = this.f25417a.hashCode() * 31;
        Location location = this.f25418b;
        return ((((iHashCode + (location == null ? 0 : location.hashCode())) * 31) + this.f25419c.hashCode()) * 31) + a.a.b(this.f25420d);
    }

    public final String toString() {
        return "LocationState(lastLocationBySource=" + this.f25417a + ", lastDeviceLocationWithSpeed=" + this.f25418b + ", activeLocationSource=" + this.f25419c + ", lastLocationTime=" + this.f25420d + ")";
    }

    public t() {
        this(null);
    }

    public /* synthetic */ t(byte[] bArr) {
        this(h.a.r.j(), null, bf.f25343a, 0L);
    }
}
