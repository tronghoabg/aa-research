package defpackage;

/* loaded from: classes2.dex */
public final class hbj extends hcc {
    public static final int a;
    public final gcq b;
    public final gcq c;
    public final gbg d;
    public final gbg e;
    public final fyt f;
    public final hke g;
    public final gcb h;
    public final afdr i;
    public final int j;
    public final int k;

    static {
        int i = gcb.c;
        a = 8;
    }

    public hbj(gcq gcqVar, gcq gcqVar2, gbg gbgVar, int i, gbg gbgVar2, int i2, fyt fytVar, hke hkeVar, gcb gcbVar, afdr afdrVar) {
        this.b = gcqVar;
        this.c = gcqVar2;
        this.d = gbgVar;
        this.j = i;
        this.e = gbgVar2;
        this.k = i2;
        this.f = fytVar;
        this.g = hkeVar;
        this.h = gcbVar;
        this.i = afdrVar;
    }

    @Override // defpackage.hcc
    public final void a(cfy cfyVar, hcd hcdVar, bux buxVar, int i) {
        int i2;
        cfyVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1305043766);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(this) : buxVarC.E(this)) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 131) != 130, i2 & 1)) {
            grx.e(this, cfyVar, buxVarC, ((i2 << 3) & 112) | ((i2 >> 6) & 14));
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gtu(this, cfyVar, hcdVar, i, 7, (short[]) null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbj)) {
            return false;
        }
        hbj hbjVar = (hbj) obj;
        return affa.f(this.b, hbjVar.b) && affa.f(this.c, hbjVar.c) && affa.f(this.d, hbjVar.d) && this.j == hbjVar.j && affa.f(this.e, hbjVar.e) && this.k == hbjVar.k && affa.f(this.f, hbjVar.f) && affa.f(this.g, hbjVar.g) && affa.f(this.h, hbjVar.h) && affa.f(this.i, hbjVar.i);
    }

    public final int hashCode() {
        gcq gcqVar = this.b;
        int iHashCode = gcqVar == null ? 0 : gcqVar.hashCode();
        gcq gcqVar2 = this.c;
        int iHashCode2 = gcqVar2 == null ? 0 : gcqVar2.hashCode();
        int i = iHashCode * 31;
        gbg gbgVar = this.d;
        int iHashCode3 = (((((i + iHashCode2) * 31) + (gbgVar == null ? 0 : gbgVar.hashCode())) * 31) + this.j) * 31;
        gbg gbgVar2 = this.e;
        int iHashCode4 = (((((((iHashCode3 + (gbgVar2 == null ? 0 : gbgVar2.hashCode())) * 31) + this.k) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        gcb gcbVar = this.h;
        int iHashCode5 = (iHashCode4 + (gcbVar == null ? 0 : gcbVar.hashCode())) * 31;
        afdr afdrVar = this.i;
        return iHashCode5 + (afdrVar != null ? afdrVar.hashCode() : 0);
    }

    public final String toString() {
        return "CondensedItemUiModel(title=" + this.b + ", text=" + this.c + ", leadingImage=" + this.d + ", leadingImageSize=" + ((Object) gsm.e(this.j)) + ", trailingImage=" + this.e + ", trailingImageSize=" + ((Object) gsm.e(this.k)) + ", background=" + this.f + ", containerShape=" + this.g + ", progress=" + this.h + ", onClick=" + this.i + ")";
    }

    public hbj() {
        this(null, null, null, 2, null, 2, fym.a, hkb.a, null, null);
    }
}
