package com.vungle.ads.internal.model;

import Wf.C1241c;
import Wf.C1244d0;
import Wf.O;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class p1 {

    @NotNull
    public static final o1 Companion = new o1();

    /* renamed from: a, reason: collision with root package name */
    public final List f33283a;

    /* renamed from: b, reason: collision with root package name */
    public t0 f33284b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f33285c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33286d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33287e;

    /* renamed from: f, reason: collision with root package name */
    public final String f33288f;

    /* renamed from: g, reason: collision with root package name */
    public final c1 f33289g;

    public /* synthetic */ p1(int i5, List list, t0 t0Var, Long l10, String str, String str2, String str3, c1 c1Var) {
        if ((i5 & 1) == 0) {
            this.f33283a = null;
        } else {
            this.f33283a = list;
        }
        if ((i5 & 2) == 0) {
            this.f33284b = null;
        } else {
            this.f33284b = t0Var;
        }
        if ((i5 & 4) == 0) {
            this.f33285c = null;
        } else {
            this.f33285c = l10;
        }
        if ((i5 & 8) == 0) {
            this.f33286d = null;
        } else {
            this.f33286d = str;
        }
        if ((i5 & 16) == 0) {
            this.f33287e = null;
        } else {
            this.f33287e = str2;
        }
        if ((i5 & 32) == 0) {
            this.f33288f = null;
        } else {
            this.f33288f = str3;
        }
        if ((i5 & 64) == 0) {
            this.f33289g = null;
        } else {
            this.f33289g = c1Var;
        }
    }

    public static final void a(p1 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33283a != null) {
            output.i(serialDesc, 0, new C1241c(Wf.q0.f15625a, 0), self.f33283a);
        }
        if (output.A(serialDesc, 1) || self.f33284b != null) {
            output.i(serialDesc, 1, r0.f33300a, self.f33284b);
        }
        if (output.A(serialDesc, 2) || self.f33285c != null) {
            output.i(serialDesc, 2, O.f15556a, self.f33285c);
        }
        if (output.A(serialDesc, 3) || self.f33286d != null) {
            output.i(serialDesc, 3, Wf.q0.f15625a, self.f33286d);
        }
        if (output.A(serialDesc, 4) || self.f33287e != null) {
            output.i(serialDesc, 4, Wf.q0.f15625a, self.f33287e);
        }
        if (output.A(serialDesc, 5) || self.f33288f != null) {
            output.i(serialDesc, 5, Wf.q0.f15625a, self.f33288f);
        }
        if (!output.A(serialDesc, 6) && self.f33289g == null) {
            return;
        }
        output.i(serialDesc, 6, a1.f33087a, self.f33289g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return AbstractC3340k.a(this.f33283a, p1Var.f33283a) && AbstractC3340k.a(this.f33284b, p1Var.f33284b) && AbstractC3340k.a(this.f33285c, p1Var.f33285c) && AbstractC3340k.a(this.f33286d, p1Var.f33286d) && AbstractC3340k.a(this.f33287e, p1Var.f33287e) && AbstractC3340k.a(this.f33288f, p1Var.f33288f) && AbstractC3340k.a(this.f33289g, p1Var.f33289g);
    }

    public final int hashCode() {
        List list = this.f33283a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        t0 t0Var = this.f33284b;
        int iHashCode2 = (iHashCode + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        Long l10 = this.f33285c;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.f33286d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f33287e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f33288f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        c1 c1Var = this.f33289g;
        return iHashCode6 + (c1Var != null ? c1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("RequestParam(placements=");
        sbA.append(this.f33283a);
        sbA.append(", adSize=");
        sbA.append(this.f33284b);
        sbA.append(", adStartTime=");
        sbA.append(this.f33285c);
        sbA.append(", advAppId=");
        sbA.append(this.f33286d);
        sbA.append(", placementReferenceId=");
        sbA.append(this.f33287e);
        sbA.append(", user=");
        sbA.append(this.f33288f);
        sbA.append(", csb=");
        sbA.append(this.f33289g);
        sbA.append(')');
        return sbA.toString();
    }

    public p1(List list, t0 t0Var, Long l10, String str, String str2, String str3, c1 c1Var) {
        this.f33283a = list;
        this.f33284b = t0Var;
        this.f33285c = l10;
        this.f33286d = str;
        this.f33287e = str2;
        this.f33288f = str3;
        this.f33289g = c1Var;
    }

    public final List a() {
        return this.f33283a;
    }

    public final void a(t0 t0Var) {
        this.f33284b = t0Var;
    }

    public /* synthetic */ p1(List list, Long l10, String str, String str2, String str3, c1 c1Var, int i5) {
        this((i5 & 1) != 0 ? null : list, (t0) null, (i5 & 4) != 0 ? null : l10, (i5 & 8) != 0 ? null : str, (i5 & 16) != 0 ? null : str2, (i5 & 32) != 0 ? null : str3, (i5 & 64) != 0 ? null : c1Var);
    }
}
