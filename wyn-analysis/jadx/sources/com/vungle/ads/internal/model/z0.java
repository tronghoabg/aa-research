package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.C1247f;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f33367a;

    public /* synthetic */ z0(int i5, Boolean bool) {
        if (1 == (i5 & 1)) {
            this.f33367a = bool;
        } else {
            AbstractC1240b0.k(i5, 1, x0.f33358a.getDescriptor());
            throw null;
        }
    }

    public static final void a(z0 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        output.i(serialDesc, 0, C1247f.f15596a, self.f33367a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && AbstractC3340k.a(this.f33367a, ((z0) obj).f33367a);
    }

    public final int hashCode() {
        Boolean bool = this.f33367a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("COPPA(isCoppa=");
        sbA.append(this.f33367a);
        sbA.append(')');
        return sbA.toString();
    }

    public z0(Boolean bool) {
        this.f33367a = bool;
    }
}
