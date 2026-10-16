package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hcz extends hcc {
    public final gcq a;
    public final gcq b;
    public final afdr c;
    public final hcw d;
    public final hcv e;
    public final List f;
    public final hcv g;
    public final List h;
    public final hke i;
    public final fwl j;

    public hcz(gcq gcqVar, gcq gcqVar2, afdr afdrVar, fwl fwlVar, hcw hcwVar, hcv hcvVar, List list, hcv hcvVar2, List list2, hke hkeVar) {
        list.getClass();
        this.a = gcqVar;
        this.b = gcqVar2;
        this.c = afdrVar;
        this.j = fwlVar;
        this.d = hcwVar;
        this.e = hcvVar;
        this.f = list;
        this.g = hcvVar2;
        this.h = list2;
        this.i = hkeVar;
    }

    @Override // defpackage.hcc
    public final void a(cfy cfyVar, hcd hcdVar, bux buxVar, int i) {
        int i2;
        cfyVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-712055352);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 131) != 130, i2 & 1)) {
            gum.h(this, cfyVar, buxVarC, ((i2 << 3) & 112) | ((i2 >> 6) & 14));
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gtu((Object) this, (Object) cfyVar, (Object) hcdVar, i, 10, (byte[]) null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcz)) {
            return false;
        }
        hcz hczVar = (hcz) obj;
        return affa.f(this.a, hczVar.a) && affa.f(this.b, hczVar.b) && affa.f(this.c, hczVar.c) && affa.f(this.j, hczVar.j) && affa.f(this.d, hczVar.d) && affa.f(this.e, hczVar.e) && affa.f(this.f, hczVar.f) && affa.f(this.g, hczVar.g) && affa.f(this.h, hczVar.h) && affa.f(this.i, hczVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gcq gcqVar = this.b;
        int iHashCode2 = (iHashCode + (gcqVar == null ? 0 : gcqVar.hashCode())) * 31;
        afdr afdrVar = this.c;
        int iHashCode3 = (iHashCode2 + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31;
        fwl fwlVar = this.j;
        int iHashCode4 = (iHashCode3 + (fwlVar == null ? 0 : fwlVar.hashCode())) * 31;
        hcw hcwVar = this.d;
        int iHashCode5 = (iHashCode4 + (hcwVar == null ? 0 : hcwVar.hashCode())) * 31;
        hcv hcvVar = this.e;
        int iHashCode6 = (((iHashCode5 + (hcvVar == null ? 0 : hcvVar.hashCode())) * 31) + this.f.hashCode()) * 31;
        hcv hcvVar2 = this.g;
        return ((((iHashCode6 + (hcvVar2 != null ? hcvVar2.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "BannerLayoutUiModel(title=" + this.a + ", subtitle=" + this.b + ", onClick=" + this.c + ", background=" + this.j + ", innerLeadingElement=" + this.d + ", outerLeadingElement=" + this.e + ", innerTrailingElements=" + this.f + ", outerTrailingElement=" + this.g + ", belowActions=" + this.h + ", containerShape=" + this.i + ")";
    }
}
