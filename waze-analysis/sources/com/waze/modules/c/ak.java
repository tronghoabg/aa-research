package com.waze.modules.c;

import com.waze.jni.protos.navigate.DriveTo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f29845a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29846b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f29847c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f29848d;

    /* renamed from: e, reason: collision with root package name */
    private final DriveTo.DangerZoneType f29849e;

    /* renamed from: f, reason: collision with root package name */
    private final DriveTo.DangerZoneType f29850f;

    /* renamed from: g, reason: collision with root package name */
    private final String f29851g;

    public ak(Boolean bool, String str, Boolean bool2, Boolean bool3, DriveTo.DangerZoneType dangerZoneType, DriveTo.DangerZoneType dangerZoneType2, String str2) {
        this.f29845a = bool;
        this.f29846b = str;
        this.f29847c = bool2;
        this.f29848d = bool3;
        this.f29849e = dangerZoneType;
        this.f29850f = dangerZoneType2;
        this.f29851g = str2;
    }

    public final DriveTo.DangerZoneType a() {
        return this.f29850f;
    }

    public final DriveTo.DangerZoneType b() {
        return this.f29849e;
    }

    public final Boolean c() {
        return this.f29847c;
    }

    public final Boolean d() {
        return this.f29845a;
    }

    public final Boolean e() {
        return this.f29848d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return h.g.b.x.n(this.f29845a, akVar.f29845a) && h.g.b.x.n(this.f29846b, akVar.f29846b) && h.g.b.x.n(this.f29847c, akVar.f29847c) && h.g.b.x.n(this.f29848d, akVar.f29848d) && this.f29849e == akVar.f29849e && this.f29850f == akVar.f29850f && h.g.b.x.n(this.f29851g, akVar.f29851g);
    }

    public final String f() {
        return this.f29846b;
    }

    public final String g() {
        return this.f29851g;
    }

    public final int hashCode() {
        Boolean bool = this.f29845a;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.f29846b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i2 = iHashCode * 31;
        Boolean bool2 = this.f29847c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f29848d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        DriveTo.DangerZoneType dangerZoneType = this.f29849e;
        int iHashCode5 = (iHashCode4 + (dangerZoneType == null ? 0 : dangerZoneType.hashCode())) * 31;
        DriveTo.DangerZoneType dangerZoneType2 = this.f29850f;
        int iHashCode6 = (iHashCode5 + (dangerZoneType2 == null ? 0 : dangerZoneType2.hashCode())) * 31;
        String str2 = this.f29851g;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverrideValues(isAvoidPrimaries=" + this.f29845a + ", avoidTrails=" + this.f29846b + ", isAvoidFerries=" + this.f29847c + ", isAvoidTollRoads=" + this.f29848d + ", originDangerZoneType=" + this.f29849e + ", destinationDangerZoneType=" + this.f29850f + ", vehicleType=" + this.f29851g + ")";
    }
}
