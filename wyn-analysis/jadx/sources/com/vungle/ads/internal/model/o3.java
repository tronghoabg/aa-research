package com.vungle.ads.internal.model;

import Va.M6;
import Wf.AbstractC1240b0;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class o3 {

    @NotNull
    public static final n3 Companion = new n3();

    /* renamed from: a, reason: collision with root package name */
    public final b3 f33273a;

    /* renamed from: b, reason: collision with root package name */
    public final s1 f33274b;

    /* renamed from: c, reason: collision with root package name */
    public final m1 f33275c;

    /* renamed from: d, reason: collision with root package name */
    public final l3 f33276d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33277e;

    public /* synthetic */ o3(int i5, b3 b3Var, s1 s1Var, m1 m1Var, l3 l3Var, int i10) {
        if (17 != (i5 & 17)) {
            AbstractC1240b0.k(i5, 17, m3.f33261a.getDescriptor());
            throw null;
        }
        this.f33273a = b3Var;
        if ((i5 & 2) == 0) {
            this.f33274b = null;
        } else {
            this.f33274b = s1Var;
        }
        if ((i5 & 4) == 0) {
            this.f33275c = null;
        } else {
            this.f33275c = m1Var;
        }
        if ((i5 & 8) == 0) {
            this.f33276d = null;
        } else {
            this.f33276d = l3Var;
        }
        this.f33277e = i10;
    }

    public static final void a(o3 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        output.f(serialDesc, 0, w2.f33354a, self.f33273a);
        if (output.A(serialDesc, 1) || self.f33274b != null) {
            output.i(serialDesc, 1, q1.f33298a, self.f33274b);
        }
        if (output.A(serialDesc, 2) || self.f33275c != null) {
            output.i(serialDesc, 2, k1.f33237a, self.f33275c);
        }
        if (output.A(serialDesc, 3) || self.f33276d != null) {
            output.i(serialDesc, 3, j3.f33235a, self.f33276d);
        }
        output.t(4, self.f33277e, serialDesc);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return AbstractC3340k.a(this.f33273a, o3Var.f33273a) && AbstractC3340k.a(this.f33274b, o3Var.f33274b) && AbstractC3340k.a(this.f33275c, o3Var.f33275c) && AbstractC3340k.a(this.f33276d, o3Var.f33276d) && this.f33277e == o3Var.f33277e;
    }

    public final int hashCode() {
        int iHashCode = this.f33273a.hashCode() * 31;
        s1 s1Var = this.f33274b;
        int iHashCode2 = (iHashCode + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        m1 m1Var = this.f33275c;
        int iHashCode3 = (iHashCode2 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        l3 l3Var = this.f33276d;
        return this.f33277e + ((iHashCode3 + (l3Var != null ? l3Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("RtbToken(device=");
        sbA.append(this.f33273a);
        sbA.append(", user=");
        sbA.append(this.f33274b);
        sbA.append(", ext=");
        sbA.append(this.f33275c);
        sbA.append(", request=");
        sbA.append(this.f33276d);
        sbA.append(", ordinalView=");
        return M6.r(sbA, this.f33277e, ')');
    }

    public o3(b3 device, s1 s1Var, m1 m1Var, l3 l3Var, int i5) {
        AbstractC3340k.e(device, "device");
        this.f33273a = device;
        this.f33274b = s1Var;
        this.f33275c = m1Var;
        this.f33276d = l3Var;
        this.f33277e = i5;
    }
}
