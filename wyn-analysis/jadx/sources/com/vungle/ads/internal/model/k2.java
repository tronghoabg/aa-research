package com.vungle.ads.internal.model;

import A7.AbstractC0279p0;
import Wf.C1244d0;
import Wf.C1247f;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class k2 {

    @NotNull
    public static final j2 Companion = new j2();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f33239a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33240b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33241c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33242d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33243e;

    /* renamed from: f, reason: collision with root package name */
    public final String f33244f;

    public /* synthetic */ k2(int i5, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        if ((i5 & 1) == 0) {
            this.f33239a = null;
        } else {
            this.f33239a = bool;
        }
        if ((i5 & 2) == 0) {
            this.f33240b = null;
        } else {
            this.f33240b = str;
        }
        if ((i5 & 4) == 0) {
            this.f33241c = null;
        } else {
            this.f33241c = str2;
        }
        if ((i5 & 8) == 0) {
            this.f33242d = null;
        } else {
            this.f33242d = str3;
        }
        if ((i5 & 16) == 0) {
            this.f33243e = null;
        } else {
            this.f33243e = str4;
        }
        if ((i5 & 32) == 0) {
            this.f33244f = null;
        } else {
            this.f33244f = str5;
        }
    }

    public static final void a(k2 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33239a != null) {
            output.i(serialDesc, 0, C1247f.f15596a, self.f33239a);
        }
        if (output.A(serialDesc, 1) || self.f33240b != null) {
            output.i(serialDesc, 1, Wf.q0.f15625a, self.f33240b);
        }
        if (output.A(serialDesc, 2) || self.f33241c != null) {
            output.i(serialDesc, 2, Wf.q0.f15625a, self.f33241c);
        }
        if (output.A(serialDesc, 3) || self.f33242d != null) {
            output.i(serialDesc, 3, Wf.q0.f15625a, self.f33242d);
        }
        if (output.A(serialDesc, 4) || self.f33243e != null) {
            output.i(serialDesc, 4, Wf.q0.f15625a, self.f33243e);
        }
        if (!output.A(serialDesc, 5) && self.f33244f == null) {
            return;
        }
        output.i(serialDesc, 5, Wf.q0.f15625a, self.f33244f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return AbstractC3340k.a(this.f33239a, k2Var.f33239a) && AbstractC3340k.a(this.f33240b, k2Var.f33240b) && AbstractC3340k.a(this.f33241c, k2Var.f33241c) && AbstractC3340k.a(this.f33242d, k2Var.f33242d) && AbstractC3340k.a(this.f33243e, k2Var.f33243e) && AbstractC3340k.a(this.f33244f, k2Var.f33244f);
    }

    public final int hashCode() {
        Boolean bool = this.f33239a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f33240b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f33241c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f33242d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f33243e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f33244f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("GDPRSettings(isCountryDataProtected=");
        sbA.append(this.f33239a);
        sbA.append(", consentTitle=");
        sbA.append(this.f33240b);
        sbA.append(", consentMessage=");
        sbA.append(this.f33241c);
        sbA.append(", consentMessageVersion=");
        sbA.append(this.f33242d);
        sbA.append(", buttonAccept=");
        sbA.append(this.f33243e);
        sbA.append(", buttonDeny=");
        return AbstractC0279p0.n(sbA, this.f33244f, ')');
    }
}
