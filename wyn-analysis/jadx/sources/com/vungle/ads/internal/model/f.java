package com.vungle.ads.internal.model;

import Wf.C1244d0;
import Wf.J;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f33160a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f33161b;

    public /* synthetic */ f(int i5, Integer num, Integer num2) {
        this.f33160a = (i5 & 1) == 0 ? 0 : num;
        if ((i5 & 2) == 0) {
            this.f33161b = 0;
        } else {
            this.f33161b = num2;
        }
    }

    public static final void a(f self, Vf.b output, C1244d0 serialDesc) {
        Integer num;
        Integer num2;
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || (num2 = self.f33160a) == null || num2.intValue() != 0) {
            output.i(serialDesc, 0, J.f15549a, self.f33160a);
        }
        if (output.A(serialDesc, 1) || (num = self.f33161b) == null || num.intValue() != 0) {
            output.i(serialDesc, 1, J.f15549a, self.f33161b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC3340k.a(this.f33160a, fVar.f33160a) && AbstractC3340k.a(this.f33161b, fVar.f33161b);
    }

    public final int hashCode() {
        Integer num = this.f33160a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f33161b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("AdSizeInfo(width=");
        sbA.append(this.f33160a);
        sbA.append(", height=");
        sbA.append(this.f33161b);
        sbA.append(')');
        return sbA.toString();
    }
}
