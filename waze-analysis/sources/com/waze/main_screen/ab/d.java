package com.waze.main_screen.ab;

import com.waze.jni.protos.VenueData;
import com.waze.modules.navigation.ah;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f25654a;

    /* renamed from: b, reason: collision with root package name */
    private final ah f25655b;

    /* renamed from: c, reason: collision with root package name */
    private final VenueData f25656c;

    public d(Integer num, ah ahVar, VenueData venueData) {
        this.f25654a = num;
        this.f25655b = ahVar;
        this.f25656c = venueData;
    }

    public final VenueData a() {
        return this.f25656c;
    }

    public final ah b() {
        return this.f25655b;
    }

    public final Integer c() {
        return this.f25654a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return x.n(this.f25654a, dVar.f25654a) && this.f25655b == dVar.f25655b && x.n(this.f25656c, dVar.f25656c);
    }

    public final int hashCode() {
        Integer num = this.f25654a;
        int iHashCode = num == null ? 0 : num.hashCode();
        ah ahVar = this.f25655b;
        int iHashCode2 = ahVar == null ? 0 : ahVar.hashCode();
        int i2 = iHashCode * 31;
        VenueData venueData = this.f25656c;
        return ((i2 + iHashCode2) * 31) + (venueData != null ? venueData.hashCode() : 0);
    }

    public final String toString() {
        return "CrisisResponsePopup(timeoutSeconds=" + this.f25654a + ", caller=" + this.f25655b + ", venueDataProto=" + this.f25656c + ")";
    }
}
