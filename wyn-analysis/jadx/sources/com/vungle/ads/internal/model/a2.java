package com.vungle.ads.internal.model;

import Wf.C1244d0;
import Wf.J;
import Wf.O;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a2 {

    @NotNull
    public static final z1 Companion = new z1();

    /* renamed from: a, reason: collision with root package name */
    public final Long f33089a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f33090b;

    public /* synthetic */ a2(int i5, Long l10, Integer num) {
        this.f33089a = (i5 & 1) == 0 ? 1000L : l10;
        if ((i5 & 2) == 0) {
            this.f33090b = 3;
        } else {
            this.f33090b = num;
        }
    }

    public static final void a(a2 self, Vf.b output, C1244d0 serialDesc) {
        Integer num;
        Long l10;
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || (l10 = self.f33089a) == null || l10.longValue() != 1000) {
            output.i(serialDesc, 0, O.f15556a, self.f33089a);
        }
        if (output.A(serialDesc, 1) || (num = self.f33090b) == null || num.intValue() != 3) {
            output.i(serialDesc, 1, J.f15549a, self.f33090b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return AbstractC3340k.a(this.f33089a, a2Var.f33089a) && AbstractC3340k.a(this.f33090b, a2Var.f33090b);
    }

    public final int hashCode() {
        Long l10 = this.f33089a;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Integer num = this.f33090b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("CleverCache(diskSize=");
        sbA.append(this.f33089a);
        sbA.append(", diskPercentage=");
        sbA.append(this.f33090b);
        sbA.append(')');
        return sbA.toString();
    }
}
