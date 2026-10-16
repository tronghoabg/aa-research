package com.vungle.ads.internal.model;

import Wf.C1244d0;
import Wf.C1247f;
import Wf.O;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class x1 {

    @NotNull
    public static final w1 Companion = new w1();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f33360a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f33361b;

    public /* synthetic */ x1(int i5, Boolean bool, Long l10) {
        this.f33360a = (i5 & 1) == 0 ? Boolean.FALSE : bool;
        if ((i5 & 2) == 0) {
            this.f33361b = Long.MAX_VALUE;
        } else {
            this.f33361b = l10;
        }
    }

    public static final void a(x1 self, Vf.b output, C1244d0 serialDesc) {
        Long l10;
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || !AbstractC3340k.a(self.f33360a, Boolean.FALSE)) {
            output.i(serialDesc, 0, C1247f.f15596a, self.f33360a);
        }
        if (output.A(serialDesc, 1) || (l10 = self.f33361b) == null || l10.longValue() != Long.MAX_VALUE) {
            output.i(serialDesc, 1, O.f15556a, self.f33361b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return AbstractC3340k.a(this.f33360a, x1Var.f33360a) && AbstractC3340k.a(this.f33361b, x1Var.f33361b);
    }

    public final int hashCode() {
        Boolean bool = this.f33360a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l10 = this.f33361b;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("AutoRedirect(allowAutoRedirect=");
        sbA.append(this.f33360a);
        sbA.append(", afterClickDuration=");
        sbA.append(this.f33361b);
        sbA.append(')');
        return sbA.toString();
    }
}
