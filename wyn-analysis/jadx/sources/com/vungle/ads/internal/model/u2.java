package com.vungle.ads.internal.model;

import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class u2 {

    @NotNull
    public static final t2 Companion = new t2();

    /* renamed from: a, reason: collision with root package name */
    public final k2 f33329a;

    /* renamed from: b, reason: collision with root package name */
    public final o2 f33330b;

    public /* synthetic */ u2(int i5, k2 k2Var, o2 o2Var) {
        if ((i5 & 1) == 0) {
            this.f33329a = null;
        } else {
            this.f33329a = k2Var;
        }
        if ((i5 & 2) == 0) {
            this.f33330b = null;
        } else {
            this.f33330b = o2Var;
        }
    }

    public static final void a(u2 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33329a != null) {
            output.i(serialDesc, 0, i2.f33225a, self.f33329a);
        }
        if (!output.A(serialDesc, 1) && self.f33330b == null) {
            return;
        }
        output.i(serialDesc, 1, l2.f33251a, self.f33330b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return AbstractC3340k.a(this.f33329a, u2Var.f33329a) && AbstractC3340k.a(this.f33330b, u2Var.f33330b);
    }

    public final int hashCode() {
        k2 k2Var = this.f33329a;
        int iHashCode = (k2Var == null ? 0 : k2Var.hashCode()) * 31;
        o2 o2Var = this.f33330b;
        return iHashCode + (o2Var != null ? o2Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("UserPrivacy(gdpr=");
        sbA.append(this.f33329a);
        sbA.append(", iab=");
        sbA.append(this.f33330b);
        sbA.append(')');
        return sbA.toString();
    }
}
