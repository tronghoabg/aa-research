package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class bcm implements ckv {
    public final bcn a;
    public final bcn b;
    public final bcn c;
    public final bcn d;

    public bcm(bcn bcnVar, bcn bcnVar2, bcn bcnVar3, bcn bcnVar4) {
        this.a = bcnVar;
        this.b = bcnVar2;
        this.c = bcnVar3;
        this.d = bcnVar4;
    }

    public static /* synthetic */ bcm b(bcm bcmVar, bcn bcnVar, bcn bcnVar2, bcn bcnVar3, bcn bcnVar4, int i) {
        if ((i & 1) != 0) {
            bcnVar = bcmVar.a;
        }
        if ((i & 2) != 0) {
            bcnVar2 = bcmVar.b;
        }
        if ((i & 4) != 0) {
            bcnVar3 = bcmVar.c;
        }
        if ((i & 8) != 0) {
            bcnVar4 = bcmVar.d;
        }
        return new bcm(bcnVar, bcnVar2, bcnVar3, bcnVar4);
    }

    @Override // defpackage.ckv
    public final ckm a(long j, dlr dlrVar, dlg dlgVar) {
        bcn bcnVar = this.d;
        bcn bcnVar2 = this.c;
        bcn bcnVar3 = this.b;
        float fA = this.a.a(j, dlgVar);
        float fA2 = bcnVar3.a(j, dlgVar);
        float fA3 = bcnVar2.a(j, dlgVar);
        float fA4 = bcnVar.a(j, dlgVar);
        float f = fA + fA4;
        float fB = cjd.b(j);
        if (f > fB) {
            float f2 = fB / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fB) {
            float f4 = fB / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < BitmapDescriptorFactory.HUE_RED || fA2 < BitmapDescriptorFactory.HUE_RED || fA3 < BitmapDescriptorFactory.HUE_RED || fA4 < BitmapDescriptorFactory.HUE_RED) {
            asl.c("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == BitmapDescriptorFactory.HUE_RED) {
            return new ckk(byx.E(0L, j));
        }
        cjb cjbVarE = byx.E(0L, j);
        dlr dlrVar2 = dlr.a;
        float f5 = dlrVar == dlrVar2 ? fA : fA2;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f5);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f5);
        if (dlrVar == dlrVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(fA);
        float f6 = fA3;
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(fA);
        float f7 = dlrVar == dlrVar2 ? f6 : fA4;
        long jFloatToRawIntBits5 = Float.floatToRawIntBits(f7);
        long jFloatToRawIntBits6 = Float.floatToRawIntBits(f7);
        if (dlrVar != dlrVar2) {
            fA4 = f6;
        }
        return new ckl(byx.B(cjbVarE, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L), (jFloatToRawIntBits5 << 32) | (jFloatToRawIntBits6 & 4294967295L), (Float.floatToRawIntBits(fA4) << 32) | (Float.floatToRawIntBits(fA4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bcm) {
            bcm bcmVar = (bcm) obj;
            return affa.f(this.a, bcmVar.a) && affa.f(this.b, bcmVar.b) && affa.f(this.c, bcmVar.c) && affa.f(this.d, bcmVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
