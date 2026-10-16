package com.vungle.ads.internal.model;

import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* renamed from: a, reason: collision with root package name */
    public final String f33306a;

    /* renamed from: b, reason: collision with root package name */
    public final i f33307b;

    /* renamed from: c, reason: collision with root package name */
    public final l f33308c;

    public /* synthetic */ s(int i5, String str, i iVar, l lVar) {
        if ((i5 & 1) == 0) {
            this.f33306a = null;
        } else {
            this.f33306a = str;
        }
        if ((i5 & 2) == 0) {
            this.f33307b = null;
        } else {
            this.f33307b = iVar;
        }
        if ((i5 & 4) == 0) {
            this.f33308c = null;
        } else {
            this.f33308c = lVar;
        }
    }

    public static final void a(s self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33306a != null) {
            output.i(serialDesc, 0, Wf.q0.f15625a, self.f33306a);
        }
        if (output.A(serialDesc, 1) || self.f33307b != null) {
            output.i(serialDesc, 1, g.f33169a, self.f33307b);
        }
        if (!output.A(serialDesc, 2) && self.f33308c == null) {
            return;
        }
        output.i(serialDesc, 2, j.f33230a, self.f33308c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return AbstractC3340k.a(this.f33306a, sVar.f33306a) && AbstractC3340k.a(this.f33307b, sVar.f33307b) && AbstractC3340k.a(this.f33308c, sVar.f33308c);
    }

    public final int hashCode() {
        String str = this.f33306a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        i iVar = this.f33307b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        l lVar = this.f33308c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("PlacementAdUnit(placementReferenceId=");
        sbA.append(this.f33306a);
        sbA.append(", adMarkup=");
        sbA.append(this.f33307b);
        sbA.append(", csb=");
        sbA.append(this.f33308c);
        sbA.append(')');
        return sbA.toString();
    }
}
