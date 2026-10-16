package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hby extends defpackage.hcl {
    public static final int a = defpackage.hbx.a | 8;
    public final defpackage.gcw b;
    public final defpackage.gbm c;
    public final defpackage.gbm d;
    public final boolean e;
    public final defpackage.afer f;
    public final defpackage.hbx g;

    public hby(defpackage.gcw gcwVar, defpackage.gbm gbmVar, defpackage.gbm gbmVar2, boolean z, defpackage.afer aferVar, defpackage.hbx hbxVar) {
        this.b = gcwVar;
        this.c = gbmVar;
        this.d = gbmVar2;
        this.e = z;
        this.f = aferVar;
        this.g = hbxVar;
    }

    @Override // defpackage.hcl
    public final void a(defpackage.cgf cgfVar, defpackage.hcm hcmVar, defpackage.bve bveVar, int i) {
        int i2;
        cgfVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(221406626);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? bveVarC.C(this) : bveVarC.E(this)) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 131) != 130, i2 & 1)) {
            defpackage.hbo.b(this, cgfVar, null, bveVarC, ((i2 << 3) & 112) | ((i2 >> 6) & 14));
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.guf(this, cgfVar, hcmVar, i, 9, (short[]) null);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hby)) {
            return false;
        }
        defpackage.hby hbyVar = (defpackage.hby) obj;
        return defpackage.afga.f(this.b, hbyVar.b) && defpackage.afga.f(this.c, hbyVar.c) && defpackage.afga.f(this.d, hbyVar.d) && this.e == hbyVar.e && defpackage.afga.f(this.f, hbyVar.f) && defpackage.afga.f(this.g, hbyVar.g);
    }

    public final int hashCode() {
        defpackage.gcw gcwVar = this.b;
        int iHashCode = gcwVar == null ? 0 : gcwVar.hashCode();
        defpackage.gbm gbmVar = this.c;
        int iHashCode2 = gbmVar == null ? 0 : gbmVar.hashCode();
        int i = iHashCode * 31;
        defpackage.gbm gbmVar2 = this.d;
        int iHashCode3 = (((((((i + iHashCode2) * 31) + (gbmVar2 == null ? 0 : gbmVar2.hashCode())) * 31) + defpackage.a.e(this.e)) * 31) + this.f.hashCode()) * 31;
        defpackage.hbx hbxVar = this.g;
        return iHashCode3 + (hbxVar != null ? hbxVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "FilterChipUiModel(text=" + this.b + ", startIcon=" + this.c + ", endIcon=" + this.d + ", isSelected=" + this.e + ", onClick=" + this.f + ", style=" + this.g + ")";
    }
}
