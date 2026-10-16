package com.vungle.ads.internal.model;

import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class z {

    @NotNull
    public static final y Companion = new y();

    /* renamed from: a, reason: collision with root package name */
    public final c0 f33366a;

    public /* synthetic */ z(int i5, c0 c0Var) {
        if ((i5 & 1) == 0) {
            this.f33366a = null;
        } else {
            this.f33366a = c0Var;
        }
    }

    public static final void a(z self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (!output.A(serialDesc, 0) && self.f33366a == null) {
            return;
        }
        output.i(serialDesc, 0, a0.f33085a, self.f33366a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && AbstractC3340k.a(this.f33366a, ((z) obj).f33366a);
    }

    public final int hashCode() {
        c0 c0Var = this.f33366a;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.hashCode();
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("ViewAbility(om=");
        sbA.append(this.f33366a);
        sbA.append(')');
        return sbA.toString();
    }
}
