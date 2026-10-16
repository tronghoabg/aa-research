package com.vungle.ads.internal.model;

import A7.AbstractC0279p0;
import Wf.AbstractC1240b0;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class i3 {

    @NotNull
    public static final h3 Companion = new h3();

    /* renamed from: a, reason: collision with root package name */
    public final String f33227a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33228b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33229c;

    public /* synthetic */ i3(int i5, String str, boolean z2, String str2) {
        if (1 != (i5 & 1)) {
            AbstractC1240b0.k(i5, 1, g3.f33175a.getDescriptor());
            throw null;
        }
        this.f33227a = str;
        if ((i5 & 2) == 0) {
            this.f33228b = false;
        } else {
            this.f33228b = z2;
        }
        if ((i5 & 4) == 0) {
            this.f33229c = null;
        } else {
            this.f33229c = str2;
        }
    }

    public static final void a(i3 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.f33227a);
        if (output.A(serialDesc, 1) || self.f33228b) {
            output.x(serialDesc, 1, self.f33228b);
        }
        if (!output.A(serialDesc, 2) && self.f33229c == null) {
            return;
        }
        output.i(serialDesc, 2, Wf.q0.f15625a, self.f33229c);
    }

    public final String b() {
        return this.f33227a;
    }

    public final String c() {
        return this.f33229c;
    }

    public final boolean d() {
        return AbstractC3340k.a(this.f33229c, "appopen");
    }

    public final boolean e() {
        return AbstractC3340k.a(this.f33229c, "banner");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return AbstractC3340k.a(this.f33227a, i3Var.f33227a) && this.f33228b == i3Var.f33228b && AbstractC3340k.a(this.f33229c, i3Var.f33229c);
    }

    public final boolean f() {
        return AbstractC3340k.a(this.f33229c, "in_line");
    }

    public final boolean g() {
        return AbstractC3340k.a(this.f33229c, "interstitial");
    }

    public final boolean h() {
        return AbstractC3340k.a(this.f33229c, "mrec");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f33227a.hashCode() * 31;
        boolean z2 = this.f33228b;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i10 = (iHashCode + i5) * 31;
        String str = this.f33229c;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final boolean i() {
        return AbstractC3340k.a(this.f33229c, "native");
    }

    public final boolean j() {
        return AbstractC3340k.a(this.f33229c, "rewarded");
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Placement(referenceId=");
        sbA.append(this.f33227a);
        sbA.append(", headerBidding=");
        sbA.append(this.f33228b);
        sbA.append(", type=");
        return AbstractC0279p0.n(sbA, this.f33229c, ')');
    }

    public i3(String referenceId, String str, boolean z2) {
        AbstractC3340k.e(referenceId, "referenceId");
        this.f33227a = referenceId;
        this.f33228b = z2;
        this.f33229c = str;
    }

    public final boolean a() {
        return this.f33228b;
    }

    public /* synthetic */ i3(String str) {
        this(str, null, false);
    }
}
