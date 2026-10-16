package com.vungle.ads.internal.model;

import Wf.C1241c;
import Wf.C1244d0;
import Wf.C1262u;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* renamed from: a, reason: collision with root package name */
    public final Double f33245a;

    /* renamed from: b, reason: collision with root package name */
    public final List f33246b;

    /* renamed from: c, reason: collision with root package name */
    public final List f33247c;

    public /* synthetic */ l(int i5, Double d3, List list, List list2) {
        if ((i5 & 1) == 0) {
            this.f33245a = null;
        } else {
            this.f33245a = d3;
        }
        if ((i5 & 2) == 0) {
            this.f33246b = null;
        } else {
            this.f33246b = list;
        }
        if ((i5 & 4) == 0) {
            this.f33247c = null;
        } else {
            this.f33247c = list2;
        }
    }

    public static final void a(l self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33245a != null) {
            output.i(serialDesc, 0, C1262u.f15638a, self.f33245a);
        }
        if (output.A(serialDesc, 1) || self.f33246b != null) {
            output.i(serialDesc, 1, new C1241c(Wf.q0.f15625a, 0), self.f33246b);
        }
        if (!output.A(serialDesc, 2) && self.f33247c == null) {
            return;
        }
        output.i(serialDesc, 2, new C1241c(Wf.q0.f15625a, 0), self.f33247c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC3340k.a(this.f33245a, lVar.f33245a) && AbstractC3340k.a(this.f33246b, lVar.f33246b) && AbstractC3340k.a(this.f33247c, lVar.f33247c);
    }

    public final int hashCode() {
        Double d3 = this.f33245a;
        int iHashCode = (d3 == null ? 0 : d3.hashCode()) * 31;
        List list = this.f33246b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f33247c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("CSBResponse(price=");
        sbA.append(this.f33245a);
        sbA.append(", nurls=");
        sbA.append(this.f33246b);
        sbA.append(", lurls=");
        sbA.append(this.f33247c);
        sbA.append(')');
        return sbA.toString();
    }
}
