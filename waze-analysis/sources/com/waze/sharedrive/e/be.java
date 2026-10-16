package com.waze.sharedrive.e;

import com.waze.modules.c.eb;
import com.waze.navigate.em;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class be {

    /* renamed from: a, reason: collision with root package name */
    private final em f38412a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.navigate.ci f38413b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38414c;

    /* renamed from: d, reason: collision with root package name */
    private final eb f38415d;

    public be(em emVar, eb ebVar, com.waze.navigate.ci ciVar, boolean z) {
        h.g.b.x.f(emVar, "navigationState");
        this.f38412a = emVar;
        this.f38415d = ebVar;
        this.f38413b = ciVar;
        this.f38414c = z;
    }

    public final com.waze.navigate.ci a() {
        return this.f38413b;
    }

    public final em b() {
        return this.f38412a;
    }

    public final boolean c() {
        return this.f38414c;
    }

    public final eb d() {
        return this.f38415d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        return h.g.b.x.n(this.f38412a, beVar.f38412a) && h.g.b.x.n(this.f38415d, beVar.f38415d) && h.g.b.x.n(this.f38413b, beVar.f38413b) && this.f38414c == beVar.f38414c;
    }

    public final int hashCode() {
        int iHashCode = this.f38412a.hashCode() * 31;
        eb ebVar = this.f38415d;
        int iHashCode2 = (iHashCode + (ebVar == null ? 0 : ebVar.hashCode())) * 31;
        com.waze.navigate.ci ciVar = this.f38413b;
        return ((iHashCode2 + (ciVar != null ? ciVar.hashCode() : 0)) * 31) + a.a.a(this.f38414c);
    }

    public final String toString() {
        return "AwaitNavigationData(navigationState=" + this.f38412a + ", activeRoute=" + this.f38415d + ", etaState=" + this.f38413b + ", isLive=" + this.f38414c + ")";
    }
}
