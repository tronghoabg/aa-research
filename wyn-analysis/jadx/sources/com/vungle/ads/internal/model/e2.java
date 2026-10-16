package com.vungle.ads.internal.model;

import Wf.C1244d0;
import Wf.O;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e2 {

    @NotNull
    public static final d2 Companion = new d2();

    /* renamed from: a, reason: collision with root package name */
    public final Long f33159a;

    public /* synthetic */ e2(int i5, Long l10) {
        if ((i5 & 1) == 0) {
            this.f33159a = null;
        } else {
            this.f33159a = l10;
        }
    }

    public static final void a(e2 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (!output.A(serialDesc, 0) && self.f33159a == null) {
            return;
        }
        output.i(serialDesc, 0, O.f15556a, self.f33159a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && AbstractC3340k.a(this.f33159a, ((e2) obj).f33159a);
    }

    public final int hashCode() {
        Long l10 = this.f33159a;
        if (l10 == null) {
            return 0;
        }
        return l10.hashCode();
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("ConfigSettings(refreshTime=");
        sbA.append(this.f33159a);
        sbA.append(')');
        return sbA.toString();
    }

    public final Long a() {
        return this.f33159a;
    }
}
