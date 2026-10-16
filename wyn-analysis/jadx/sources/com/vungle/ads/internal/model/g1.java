package com.vungle.ads.internal.model;

import A7.AbstractC0279p0;
import Wf.AbstractC1240b0;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();

    /* renamed from: a, reason: collision with root package name */
    public final String f33171a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33172b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33173c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33174d;

    public /* synthetic */ g1(int i5, String str, String str2, long j8, String str3) {
        if (15 != (i5 & 15)) {
            AbstractC1240b0.k(i5, 15, e1.f33157a.getDescriptor());
            throw null;
        }
        this.f33171a = str;
        this.f33172b = str2;
        this.f33173c = j8;
        this.f33174d = str3;
    }

    public static final void a(g1 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.f33171a);
        output.y(serialDesc, 1, self.f33172b);
        output.E(serialDesc, 2, self.f33173c);
        output.y(serialDesc, 3, self.f33174d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return AbstractC3340k.a(this.f33171a, g1Var.f33171a) && AbstractC3340k.a(this.f33172b, g1Var.f33172b) && this.f33173c == g1Var.f33173c && AbstractC3340k.a(this.f33174d, g1Var.f33174d);
    }

    public final int hashCode() {
        int iC = N0.a.c(this.f33171a.hashCode() * 31, 31, this.f33172b);
        long j8 = this.f33173c;
        return this.f33174d.hashCode() + ((((int) (j8 ^ (j8 >>> 32))) + iC) * 31);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("GDPR(consentStatus=");
        sbA.append(this.f33171a);
        sbA.append(", consentSource=");
        sbA.append(this.f33172b);
        sbA.append(", consentTimestamp=");
        sbA.append(this.f33173c);
        sbA.append(", consentMessageVersion=");
        return AbstractC0279p0.n(sbA, this.f33174d, ')');
    }

    public g1(long j8, String consentStatus, String consentSource, String consentMessageVersion) {
        AbstractC3340k.e(consentStatus, "consentStatus");
        AbstractC3340k.e(consentSource, "consentSource");
        AbstractC3340k.e(consentMessageVersion, "consentMessageVersion");
        this.f33171a = consentStatus;
        this.f33172b = consentSource;
        this.f33173c = j8;
        this.f33174d = consentMessageVersion;
    }
}
