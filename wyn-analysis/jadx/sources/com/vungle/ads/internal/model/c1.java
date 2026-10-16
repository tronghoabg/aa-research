package com.vungle.ads.internal.model;

import A7.AbstractC0279p0;
import Wf.AbstractC1240b0;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c1 {

    @NotNull
    public static final b1 Companion = new b1();

    /* renamed from: a, reason: collision with root package name */
    public final double f33139a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33140b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33141c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33142d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33143e;

    /* renamed from: f, reason: collision with root package name */
    public final String f33144f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33145g;

    public c1(double d3, int i5, boolean z2, String parentAuctionId, String creativeId, String adUnitId, String str) {
        AbstractC3340k.e(parentAuctionId, "parentAuctionId");
        AbstractC3340k.e(creativeId, "creativeId");
        AbstractC3340k.e(adUnitId, "adUnitId");
        this.f33139a = d3;
        this.f33140b = i5;
        this.f33141c = z2;
        this.f33142d = parentAuctionId;
        this.f33143e = creativeId;
        this.f33144f = adUnitId;
        this.f33145g = str;
    }

    public static final void a(c1 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        output.D(serialDesc, 0, self.f33139a);
        output.t(1, self.f33140b, serialDesc);
        output.x(serialDesc, 2, self.f33141c);
        output.y(serialDesc, 3, self.f33142d);
        output.y(serialDesc, 4, self.f33143e);
        output.y(serialDesc, 5, self.f33144f);
        if (!output.A(serialDesc, 6) && self.f33145g == null) {
            return;
        }
        output.i(serialDesc, 6, Wf.q0.f15625a, self.f33145g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Double.valueOf(this.f33139a).equals(Double.valueOf(c1Var.f33139a)) && this.f33140b == c1Var.f33140b && this.f33141c == c1Var.f33141c && AbstractC3340k.a(this.f33142d, c1Var.f33142d) && AbstractC3340k.a(this.f33143e, c1Var.f33143e) && AbstractC3340k.a(this.f33144f, c1Var.f33144f) && AbstractC3340k.a(this.f33145g, c1Var.f33145g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f33139a);
        int i5 = (this.f33140b + (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31)) * 31;
        boolean z2 = this.f33141c;
        int i10 = z2;
        if (z2 != 0) {
            i10 = 1;
        }
        int iC = N0.a.c(N0.a.c(N0.a.c((i5 + i10) * 31, 31, this.f33142d), 31, this.f33143e), 31, this.f33144f);
        String str = this.f33145g;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("CSBParam(bidfloor=");
        sbA.append(this.f33139a);
        sbA.append(", phase=");
        sbA.append(this.f33140b);
        sbA.append(", isVXWinner=");
        sbA.append(this.f33141c);
        sbA.append(", parentAuctionId=");
        sbA.append(this.f33142d);
        sbA.append(", creativeId=");
        sbA.append(this.f33143e);
        sbA.append(", adUnitId=");
        sbA.append(this.f33144f);
        sbA.append(", ext=");
        return AbstractC0279p0.n(sbA, this.f33145g, ')');
    }

    public /* synthetic */ c1(int i5, double d3, int i10, boolean z2, String str, String str2, String str3, String str4) {
        if (63 != (i5 & 63)) {
            AbstractC1240b0.k(i5, 63, a1.f33087a.getDescriptor());
            throw null;
        }
        this.f33139a = d3;
        this.f33140b = i10;
        this.f33141c = z2;
        this.f33142d = str;
        this.f33143e = str2;
        this.f33144f = str3;
        if ((i5 & 64) == 0) {
            this.f33145g = null;
        } else {
            this.f33145g = str4;
        }
    }
}
