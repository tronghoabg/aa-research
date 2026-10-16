package defpackage;

/* loaded from: classes2.dex */
public final class hbp extends hcc {
    public static final int a = hbo.a | 8;
    public final gcq b;
    public final gbg c;
    public final gbg d;
    public final boolean e;
    public final afdr f;
    public final hbo g;

    public hbp(gcq gcqVar, gbg gbgVar, gbg gbgVar2, boolean z, afdr afdrVar, hbo hboVar) {
        this.b = gcqVar;
        this.c = gbgVar;
        this.d = gbgVar2;
        this.e = z;
        this.f = afdrVar;
        this.g = hboVar;
    }

    @Override // defpackage.hcc
    public final void a(cfy cfyVar, hcd hcdVar, bux buxVar, int i) {
        int i2;
        cfyVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(221406626);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 131) != 130, i2 & 1)) {
            hbf.b(this, cfyVar, null, buxVarC, ((i2 << 3) & 112) | ((i2 >> 6) & 14));
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gtu(this, cfyVar, hcdVar, i, 8, (short[]) null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbp)) {
            return false;
        }
        hbp hbpVar = (hbp) obj;
        return affa.f(this.b, hbpVar.b) && affa.f(this.c, hbpVar.c) && affa.f(this.d, hbpVar.d) && this.e == hbpVar.e && affa.f(this.f, hbpVar.f) && affa.f(this.g, hbpVar.g);
    }

    public final int hashCode() {
        gcq gcqVar = this.b;
        int iHashCode = gcqVar == null ? 0 : gcqVar.hashCode();
        gbg gbgVar = this.c;
        int iHashCode2 = gbgVar == null ? 0 : gbgVar.hashCode();
        int i = iHashCode * 31;
        gbg gbgVar2 = this.d;
        int iHashCode3 = (((((((i + iHashCode2) * 31) + (gbgVar2 == null ? 0 : gbgVar2.hashCode())) * 31) + a.f(this.e)) * 31) + this.f.hashCode()) * 31;
        hbo hboVar = this.g;
        return iHashCode3 + (hboVar != null ? hboVar.hashCode() : 0);
    }

    public final String toString() {
        return "FilterChipUiModel(text=" + this.b + ", startIcon=" + this.c + ", endIcon=" + this.d + ", isSelected=" + this.e + ", onClick=" + this.f + ", style=" + this.g + ")";
    }
}
