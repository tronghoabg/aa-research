package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bmv {
    public final float a;
    public final float b;
    public final float c;
    private final float d;
    private final float e;

    public bmv(float f, float f2, float f3, float f4, float f5) {
        this.d = f;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.e = f5;
    }

    public final defpackage.bys a(boolean z, defpackage.asj asjVar, defpackage.bve bveVar, int i) {
        float f;
        defpackage.aeb aebVar;
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        java.lang.Object obj = defpackage.bvd.a;
        if (objS == obj) {
            objS = new androidx.compose.runtime.snapshots.SnapshotStateList();
            bwcVar.ad(objS);
        }
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) objS;
        boolean z2 = (((i & 112) ^ 48) > 32 && bveVar.C(asjVar)) || (i & 48) == 32;
        java.lang.Object objS2 = bwcVar.S();
        if (z2 || objS2 == obj) {
            objS2 = new defpackage.bej(asjVar, snapshotStateList, (defpackage.afdk) null, 5);
            bwcVar.ad(objS2);
        }
        defpackage.bvx.g(asjVar, (defpackage.affg) objS2, bveVar);
        defpackage.asi asiVar = (defpackage.asi) defpackage.afga.aF(snapshotStateList);
        if (!z) {
            f = this.e;
        } else if (asiVar instanceof defpackage.asn) {
            f = this.a;
        } else if (asiVar instanceof defpackage.asf) {
            f = this.c;
        } else {
            f = asiVar instanceof defpackage.asd ? this.b : this.d;
        }
        float f2 = f;
        java.lang.Object objS3 = bwcVar.S();
        if (objS3 == obj) {
            objS3 = new defpackage.aeb(new defpackage.dlr(f2), defpackage.agt.c, null, "Animatable");
            bwcVar.ad(objS3);
        }
        defpackage.aeb aebVar2 = (defpackage.aeb) objS3;
        defpackage.dlr dlrVar = new defpackage.dlr(f2);
        boolean zE = bveVar.E(aebVar2) | bveVar.z(f2) | ((((i & 14) ^ 6) > 4 && bveVar.D(z)) || (i & 6) == 4) | ((((i & 896) ^ 384) > 256 && bveVar.C(this)) || (i & 384) == 256) | bveVar.E(asiVar);
        java.lang.Object objS4 = bwcVar.S();
        if (zE || objS4 == obj) {
            aebVar = aebVar2;
            defpackage.bmu bmuVar = new defpackage.bmu(aebVar, f2, z, this, asiVar, null);
            bwcVar.ad(bmuVar);
            objS4 = bmuVar;
        } else {
            aebVar = aebVar2;
        }
        defpackage.bvx.g(dlrVar, (defpackage.affg) objS4, bveVar);
        return aebVar.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bmv)) {
            defpackage.bmv bmvVar = (defpackage.bmv) obj;
            if (java.lang.Float.compare(this.d, bmvVar.d) == 0 && java.lang.Float.compare(this.a, bmvVar.a) == 0 && java.lang.Float.compare(this.b, bmvVar.b) == 0 && java.lang.Float.compare(this.c, bmvVar.c) == 0 && java.lang.Float.compare(this.e, bmvVar.e) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((java.lang.Float.floatToIntBits(this.d) * 31) + java.lang.Float.floatToIntBits(this.a)) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.e);
    }
}
