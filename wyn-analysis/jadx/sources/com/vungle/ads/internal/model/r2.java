package com.vungle.ads.internal.model;

import Wf.C1244d0;
import Wf.C1247f;
import Wf.J;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class r2 {

    @NotNull
    public static final q2 Companion = new q2();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f33302a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f33303b;

    public /* synthetic */ r2(int i5, Integer num, Boolean bool) {
        if ((i5 & 1) == 0) {
            this.f33302a = null;
        } else {
            this.f33302a = num;
        }
        if ((i5 & 2) == 0) {
            this.f33303b = null;
        } else {
            this.f33303b = bool;
        }
    }

    public static final void a(r2 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33302a != null) {
            output.i(serialDesc, 0, J.f15549a, self.f33302a);
        }
        if (!output.A(serialDesc, 1) && self.f33303b == null) {
            return;
        }
        output.i(serialDesc, 1, C1247f.f15596a, self.f33303b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return AbstractC3340k.a(this.f33302a, r2Var.f33302a) && AbstractC3340k.a(this.f33303b, r2Var.f33303b);
    }

    public final int hashCode() {
        Integer num = this.f33302a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.f33303b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("LogMetricsSettings(errorLogLevel=");
        sbA.append(this.f33302a);
        sbA.append(", metricsEnabled=");
        sbA.append(this.f33303b);
        sbA.append(')');
        return sbA.toString();
    }
}
