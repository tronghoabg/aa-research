package com.vungle.ads.internal.model;

import Wf.C1244d0;
import Wf.J;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class o2 {

    @NotNull
    public static final m2 Companion = new m2();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f33272a;

    public /* synthetic */ o2(int i5, Integer num) {
        if ((i5 & 1) == 0) {
            this.f33272a = null;
        } else {
            this.f33272a = num;
        }
    }

    public static final void a(o2 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (!output.A(serialDesc, 0) && self.f33272a == null) {
            return;
        }
        output.i(serialDesc, 0, J.f15549a, self.f33272a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2) && AbstractC3340k.a(this.f33272a, ((o2) obj).f33272a);
    }

    public final int hashCode() {
        Integer num = this.f33272a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("IABSettings(tcfStatus=");
        sbA.append(this.f33272a);
        sbA.append(')');
        return sbA.toString();
    }
}
