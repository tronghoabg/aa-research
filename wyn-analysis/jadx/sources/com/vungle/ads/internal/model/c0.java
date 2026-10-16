package com.vungle.ads.internal.model;

import A7.AbstractC0279p0;
import Wf.C1244d0;
import Wf.C1247f;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f33137a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33138b;

    public /* synthetic */ c0(int i5, Boolean bool, String str) {
        if ((i5 & 1) == 0) {
            this.f33137a = null;
        } else {
            this.f33137a = bool;
        }
        if ((i5 & 2) == 0) {
            this.f33138b = null;
        } else {
            this.f33138b = str;
        }
    }

    public static final void a(c0 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33137a != null) {
            output.i(serialDesc, 0, C1247f.f15596a, self.f33137a);
        }
        if (!output.A(serialDesc, 1) && self.f33138b == null) {
            return;
        }
        output.i(serialDesc, 1, Wf.q0.f15625a, self.f33138b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return AbstractC3340k.a(this.f33137a, c0Var.f33137a) && AbstractC3340k.a(this.f33138b, c0Var.f33138b);
    }

    public final int hashCode() {
        Boolean bool = this.f33137a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f33138b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("ViewAbilityInfo(isEnabled=");
        sbA.append(this.f33137a);
        sbA.append(", extraVast=");
        return AbstractC0279p0.n(sbA, this.f33138b, ')');
    }
}
