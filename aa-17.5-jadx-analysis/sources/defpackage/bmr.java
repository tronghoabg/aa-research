package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes.dex */
public final class bmr {
    public final float a;
    public final float b;
    public final float c;
    private final float d;
    private final float e;

    public bmr(float f, float f2, float f3, float f4, float f5) {
        this.d = f;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.e = f5;
    }

    public final bym a(boolean z, ase aseVar, bux buxVar, int i) {
        adu aduVar;
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        Object obj = buw.a;
        if (objS == obj) {
            objS = new SnapshotStateList();
            bvvVar.ad(objS);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objS;
        boolean z2 = (((i & 112) ^ 48) > 32 && buxVar.C(aseVar)) || (i & 48) == 32;
        Object objS2 = bvvVar.S();
        if (z2 || objS2 == obj) {
            objS2 = new beh(aseVar, snapshotStateList, (afck) null, 5);
            bvvVar.ad(objS2);
        }
        bvq.g(aseVar, (afeg) objS2, buxVar);
        asd asdVar = (asd) woy.bL(snapshotStateList);
        float f = !z ? this.e : asdVar instanceof asi ? this.a : asdVar instanceof asa ? this.c : asdVar instanceof ary ? this.b : this.d;
        Object objS3 = bvvVar.S();
        if (objS3 == obj) {
            objS3 = new adu(new dlj(f), agm.c, null, "Animatable");
            bvvVar.ad(objS3);
        }
        adu aduVar2 = (adu) objS3;
        dlj dljVar = new dlj(f);
        boolean zE = buxVar.E(aduVar2) | buxVar.z(f) | ((((i & 14) ^ 6) > 4 && buxVar.D(z)) || (i & 6) == 4) | ((((i & 896) ^ 384) > 256 && buxVar.C(this)) || (i & 384) == 256) | buxVar.E(asdVar);
        Object objS4 = bvvVar.S();
        if (zE || objS4 == obj) {
            aduVar = aduVar2;
            bmq bmqVar = new bmq(aduVar, f, z, this, asdVar, null);
            bvvVar.ad(bmqVar);
            objS4 = bmqVar;
        } else {
            aduVar = aduVar2;
        }
        bvq.g(dljVar, (afeg) objS4, buxVar);
        return aduVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bmr)) {
            bmr bmrVar = (bmr) obj;
            if (Float.compare(this.d, bmrVar.d) == 0 && Float.compare(this.a, bmrVar.a) == 0 && Float.compare(this.b, bmrVar.b) == 0 && Float.compare(this.c, bmrVar.c) == 0 && Float.compare(this.e, bmrVar.e) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.d) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.e);
    }
}
