package com.waze.main_screen.p.a.b.b;

import com.waze.navigate.NavResultData;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final NavResultData f26989a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26990b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26991c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26992d;

    /* renamed from: e, reason: collision with root package name */
    public final com.waze.sharedrive.e.n f26993e;

    public s(NavResultData navResultData, boolean z, boolean z2, boolean z3, com.waze.sharedrive.e.n nVar) {
        this.f26989a = navResultData;
        this.f26990b = z;
        this.f26991c = z2;
        this.f26992d = z3;
        this.f26993e = nVar;
    }

    public static /* synthetic */ s a(s sVar, NavResultData navResultData, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            navResultData = sVar.f26989a;
        }
        NavResultData navResultData2 = navResultData;
        if ((i2 & 2) != 0) {
            z = sVar.f26990b;
        }
        boolean z3 = z;
        if ((i2 & 4) != 0) {
            z2 = sVar.f26991c;
        }
        return new s(navResultData2, z3, z2, sVar.f26992d, sVar.f26993e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return h.g.b.x.n(this.f26989a, sVar.f26989a) && this.f26990b == sVar.f26990b && this.f26991c == sVar.f26991c && this.f26992d == sVar.f26992d && h.g.b.x.n(this.f26993e, sVar.f26993e);
    }

    public final int hashCode() {
        NavResultData navResultData = this.f26989a;
        int iHashCode = navResultData == null ? 0 : navResultData.hashCode();
        boolean z = this.f26990b;
        boolean z2 = this.f26991c;
        int iA = a.a.a(this.f26992d);
        com.waze.sharedrive.e.n nVar = this.f26993e;
        return (((((((iHashCode * 31) + a.a.a(z)) * 31) + a.a.a(z2)) * 31) + iA) * 31) + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "State(navResultData=" + this.f26989a + ", isCalculating=" + this.f26990b + ", isSharingDrive=" + this.f26991c + ", wasCalculationDisplayed=" + this.f26992d + ", shareButtonStateHolder=" + this.f26993e + ")";
    }
}
