package com.vungle.ads.internal.model;

import Wf.C1244d0;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class s1 {

    @NotNull
    public static final r1 Companion = new r1();

    /* renamed from: a, reason: collision with root package name */
    public g1 f33309a;

    /* renamed from: b, reason: collision with root package name */
    public w0 f33310b;

    /* renamed from: c, reason: collision with root package name */
    public z0 f33311c;

    /* renamed from: d, reason: collision with root package name */
    public FirstPartyData f33312d;

    /* renamed from: e, reason: collision with root package name */
    public j1 f33313e;

    public /* synthetic */ s1(int i5, g1 g1Var, w0 w0Var, z0 z0Var, FirstPartyData firstPartyData, j1 j1Var) {
        if ((i5 & 1) == 0) {
            this.f33309a = null;
        } else {
            this.f33309a = g1Var;
        }
        if ((i5 & 2) == 0) {
            this.f33310b = null;
        } else {
            this.f33310b = w0Var;
        }
        if ((i5 & 4) == 0) {
            this.f33311c = null;
        } else {
            this.f33311c = z0Var;
        }
        if ((i5 & 8) == 0) {
            this.f33312d = null;
        } else {
            this.f33312d = firstPartyData;
        }
        if ((i5 & 16) == 0) {
            this.f33313e = null;
        } else {
            this.f33313e = j1Var;
        }
    }

    public static final void a(s1 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33309a != null) {
            output.i(serialDesc, 0, e1.f33157a, self.f33309a);
        }
        if (output.A(serialDesc, 1) || self.f33310b != null) {
            output.i(serialDesc, 1, u0.f33325a, self.f33310b);
        }
        if (output.A(serialDesc, 2) || self.f33311c != null) {
            output.i(serialDesc, 2, x0.f33358a, self.f33311c);
        }
        if (output.A(serialDesc, 3) || self.f33312d != null) {
            output.i(serialDesc, 3, FirstPartyData$$serializer.INSTANCE, self.f33312d);
        }
        if (!output.A(serialDesc, 4) && self.f33313e == null) {
            return;
        }
        output.i(serialDesc, 4, h1.f33187a, self.f33313e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return AbstractC3340k.a(this.f33309a, s1Var.f33309a) && AbstractC3340k.a(this.f33310b, s1Var.f33310b) && AbstractC3340k.a(this.f33311c, s1Var.f33311c) && AbstractC3340k.a(this.f33312d, s1Var.f33312d) && AbstractC3340k.a(this.f33313e, s1Var.f33313e);
    }

    public final int hashCode() {
        g1 g1Var = this.f33309a;
        int iHashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        w0 w0Var = this.f33310b;
        int iHashCode2 = (iHashCode + (w0Var == null ? 0 : w0Var.f33353a.hashCode())) * 31;
        z0 z0Var = this.f33311c;
        int iHashCode3 = (iHashCode2 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        FirstPartyData firstPartyData = this.f33312d;
        int iHashCode4 = (iHashCode3 + (firstPartyData == null ? 0 : firstPartyData.hashCode())) * 31;
        j1 j1Var = this.f33313e;
        return iHashCode4 + (j1Var != null ? j1Var.f33234a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("User(gdpr=");
        sbA.append(this.f33309a);
        sbA.append(", ccpa=");
        sbA.append(this.f33310b);
        sbA.append(", coppa=");
        sbA.append(this.f33311c);
        sbA.append(", fpd=");
        sbA.append(this.f33312d);
        sbA.append(", iab=");
        sbA.append(this.f33313e);
        sbA.append(')');
        return sbA.toString();
    }

    public s1(g1 g1Var, w0 w0Var, z0 z0Var, FirstPartyData firstPartyData, j1 j1Var) {
        this.f33309a = g1Var;
        this.f33310b = w0Var;
        this.f33311c = z0Var;
        this.f33312d = firstPartyData;
        this.f33313e = j1Var;
    }
}
