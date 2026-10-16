package com.vungle.ads.internal.model;

import Wf.C1244d0;
import Wf.O;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class m1 {

    @NotNull
    public static final l1 Companion = new l1();

    /* renamed from: a, reason: collision with root package name */
    public final String f33258a;

    /* renamed from: b, reason: collision with root package name */
    public String f33259b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f33260c;

    public /* synthetic */ m1(int i5, String str, String str2, Long l10) {
        if ((i5 & 1) == 0) {
            this.f33258a = null;
        } else {
            this.f33258a = str;
        }
        if ((i5 & 2) == 0) {
            this.f33259b = null;
        } else {
            this.f33259b = str2;
        }
        if ((i5 & 4) == 0) {
            this.f33260c = null;
        } else {
            this.f33260c = l10;
        }
    }

    public static final void a(m1 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33258a != null) {
            output.i(serialDesc, 0, Wf.q0.f15625a, self.f33258a);
        }
        if (output.A(serialDesc, 1) || self.f33259b != null) {
            output.i(serialDesc, 1, Wf.q0.f15625a, self.f33259b);
        }
        if (!output.A(serialDesc, 2) && self.f33260c == null) {
            return;
        }
        output.i(serialDesc, 2, O.f15556a, self.f33260c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return AbstractC3340k.a(this.f33258a, m1Var.f33258a) && AbstractC3340k.a(this.f33259b, m1Var.f33259b) && AbstractC3340k.a(this.f33260c, m1Var.f33260c);
    }

    public final int hashCode() {
        String str = this.f33258a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f33259b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.f33260c;
        return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("RequestExt(configExtension=");
        sbA.append(this.f33258a);
        sbA.append(", signals=");
        sbA.append(this.f33259b);
        sbA.append(", configLastValidatedTimestamp=");
        sbA.append(this.f33260c);
        sbA.append(')');
        return sbA.toString();
    }

    public m1(String str, String str2, Long l10) {
        this.f33258a = str;
        this.f33259b = str2;
        this.f33260c = l10;
    }
}
