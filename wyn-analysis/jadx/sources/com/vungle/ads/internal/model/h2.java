package com.vungle.ads.internal.model;

import A7.AbstractC0279p0;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h2 {

    @NotNull
    public static final g2 Companion = new g2();

    /* renamed from: a, reason: collision with root package name */
    public final String f33189a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33190b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33191c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33192d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33193e;

    public /* synthetic */ h2(int i5, String str, String str2, String str3, String str4, String str5) {
        if ((i5 & 1) == 0) {
            this.f33189a = null;
        } else {
            this.f33189a = str;
        }
        if ((i5 & 2) == 0) {
            this.f33190b = null;
        } else {
            this.f33190b = str2;
        }
        if ((i5 & 4) == 0) {
            this.f33191c = null;
        } else {
            this.f33191c = str3;
        }
        if ((i5 & 8) == 0) {
            this.f33192d = null;
        } else {
            this.f33192d = str4;
        }
        if ((i5 & 16) == 0) {
            this.f33193e = null;
        } else {
            this.f33193e = str5;
        }
    }

    public static final void a(h2 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33189a != null) {
            output.i(serialDesc, 0, Wf.q0.f15625a, self.f33189a);
        }
        if (output.A(serialDesc, 1) || self.f33190b != null) {
            output.i(serialDesc, 1, Wf.q0.f15625a, self.f33190b);
        }
        if (output.A(serialDesc, 2) || self.f33191c != null) {
            output.i(serialDesc, 2, Wf.q0.f15625a, self.f33191c);
        }
        if (output.A(serialDesc, 3) || self.f33192d != null) {
            output.i(serialDesc, 3, Wf.q0.f15625a, self.f33192d);
        }
        if (!output.A(serialDesc, 4) && self.f33193e == null) {
            return;
        }
        output.i(serialDesc, 4, Wf.q0.f15625a, self.f33193e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return AbstractC3340k.a(this.f33189a, h2Var.f33189a) && AbstractC3340k.a(this.f33190b, h2Var.f33190b) && AbstractC3340k.a(this.f33191c, h2Var.f33191c) && AbstractC3340k.a(this.f33192d, h2Var.f33192d) && AbstractC3340k.a(this.f33193e, h2Var.f33193e);
    }

    public final int hashCode() {
        String str = this.f33189a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f33190b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f33191c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f33192d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f33193e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Endpoints(adsEndpoint=");
        sbA.append(this.f33189a);
        sbA.append(", riEndpoint=");
        sbA.append(this.f33190b);
        sbA.append(", errorLogsEndpoint=");
        sbA.append(this.f33191c);
        sbA.append(", metricsEndpoint=");
        sbA.append(this.f33192d);
        sbA.append(", csbEndpoint=");
        return AbstractC0279p0.n(sbA, this.f33193e, ')');
    }
}
