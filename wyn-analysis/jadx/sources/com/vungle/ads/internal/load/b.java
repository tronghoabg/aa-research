package com.vungle.ads.internal.load;

import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.p0;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final i3 f33037a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f33038b;

    /* renamed from: c, reason: collision with root package name */
    public final VungleAdSize f33039c;

    /* renamed from: d, reason: collision with root package name */
    public final VungleCSBData f33040d;

    public b(i3 placement, p0 p0Var, VungleAdSize vungleAdSize, VungleCSBData vungleCSBData) {
        AbstractC3340k.e(placement, "placement");
        this.f33037a = placement;
        this.f33038b = p0Var;
        this.f33039c = vungleAdSize;
        this.f33040d = vungleCSBData;
    }

    public final p0 a() {
        return this.f33038b;
    }

    public final VungleCSBData b() {
        return this.f33040d;
    }

    public final i3 c() {
        return this.f33037a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class.equals(obj.getClass())) {
            b bVar = (b) obj;
            if (!AbstractC3340k.a(this.f33037a.b(), bVar.f33037a.b()) || !AbstractC3340k.a(this.f33039c, bVar.f33039c)) {
                return false;
            }
            p0 p0Var = this.f33038b;
            if (p0Var != null) {
                if (!p0Var.equals(bVar.f33038b)) {
                    return false;
                }
            } else if (bVar.f33038b != null) {
                return false;
            }
            VungleCSBData vungleCSBData = this.f33040d;
            VungleCSBData vungleCSBData2 = bVar.f33040d;
            if (vungleCSBData != null) {
                return vungleCSBData.equals(vungleCSBData2);
            }
            if (vungleCSBData2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f33037a.f33227a.hashCode() * 31;
        VungleAdSize vungleAdSize = this.f33039c;
        int iHashCode2 = (iHashCode + (vungleAdSize != null ? vungleAdSize.hashCode() : 0)) * 31;
        p0 p0Var = this.f33038b;
        int iHashCode3 = (iHashCode2 + (p0Var != null ? p0Var.hashCode() : 0)) * 31;
        VungleCSBData vungleCSBData = this.f33040d;
        return iHashCode3 + (vungleCSBData != null ? vungleCSBData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("AdRequest{placementId='");
        sbA.append(this.f33037a.f33227a);
        sbA.append("', adMarkup=");
        sbA.append(this.f33038b);
        sbA.append(", requestAdSize=");
        sbA.append(this.f33039c);
        sbA.append(", csbData=");
        sbA.append(this.f33040d);
        sbA.append('}');
        return sbA.toString();
    }
}
