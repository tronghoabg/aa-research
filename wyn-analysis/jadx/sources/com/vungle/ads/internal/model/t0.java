package com.vungle.ads.internal.model;

import Va.M6;
import Wf.AbstractC1240b0;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();

    /* renamed from: a, reason: collision with root package name */
    public final int f33318a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33319b;

    public t0(int i5, int i10) {
        this.f33318a = i5;
        this.f33319b = i10;
    }

    public static final void a(t0 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        output.t(0, self.f33318a, serialDesc);
        output.t(1, self.f33319b, serialDesc);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f33318a == t0Var.f33318a && this.f33319b == t0Var.f33319b;
    }

    public final int hashCode() {
        return this.f33319b + (this.f33318a * 31);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("AdSizeParam(width=");
        sbA.append(this.f33318a);
        sbA.append(", height=");
        return M6.r(sbA, this.f33319b, ')');
    }

    public /* synthetic */ t0(int i5, int i10, int i11) {
        if (3 != (i5 & 3)) {
            AbstractC1240b0.k(i5, 3, r0.f33300a.getDescriptor());
            throw null;
        }
        this.f33318a = i10;
        this.f33319b = i11;
    }
}
