package com.waze.main_screen.p.b.a.b;

import com.waze.navigate.ee;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ee f27104a;

    /* renamed from: b, reason: collision with root package name */
    public final h f27105b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27106c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27107d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27108e;

    /* renamed from: f, reason: collision with root package name */
    public final h.g.a.p f27109f;

    public g(ee eeVar, h hVar, String str, String str2, boolean z, h.g.a.p pVar) {
        x.f(pVar, "onRoadSignSpecialGuidanceShown");
        this.f27104a = eeVar;
        this.f27105b = hVar;
        this.f27106c = str;
        this.f27107d = str2;
        this.f27108e = z;
        this.f27109f = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return x.n(this.f27104a, gVar.f27104a) && x.n(this.f27105b, gVar.f27105b) && x.n(this.f27106c, gVar.f27106c) && x.n(this.f27107d, gVar.f27107d) && this.f27108e == gVar.f27108e && x.n(this.f27109f, gVar.f27109f);
    }

    public final int hashCode() {
        ee eeVar = this.f27104a;
        int iHashCode = eeVar == null ? 0 : eeVar.hashCode();
        h hVar = this.f27105b;
        int iHashCode2 = hVar == null ? 0 : hVar.hashCode();
        int i2 = iHashCode * 31;
        String str = this.f27106c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27107d;
        return ((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + a.a.a(this.f27108e)) * 31) + this.f27109f.hashCode();
    }

    public final String toString() {
        return "CurrentInstruction(roadSign=" + this.f27104a + ", icon=" + this.f27105b + ", distanceText=" + this.f27106c + ", streetName=" + this.f27107d + ", hovIndicator=" + this.f27108e + ", onRoadSignSpecialGuidanceShown=" + this.f27109f + ")";
    }
}
