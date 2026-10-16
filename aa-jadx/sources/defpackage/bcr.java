package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bcr implements defpackage.cld {
    public final defpackage.bcs a;
    public final defpackage.bcs b;
    public final defpackage.bcs c;
    public final defpackage.bcs d;

    public bcr(defpackage.bcs bcsVar, defpackage.bcs bcsVar2, defpackage.bcs bcsVar3, defpackage.bcs bcsVar4) {
        this.a = bcsVar;
        this.b = bcsVar2;
        this.c = bcsVar3;
        this.d = bcsVar4;
    }

    public static /* synthetic */ defpackage.bcr b(defpackage.bcr bcrVar, defpackage.bcs bcsVar, defpackage.bcs bcsVar2, defpackage.bcs bcsVar3, defpackage.bcs bcsVar4, int i) {
        if ((i & 1) != 0) {
            bcsVar = bcrVar.a;
        }
        if ((i & 2) != 0) {
            bcsVar2 = bcrVar.b;
        }
        if ((i & 4) != 0) {
            bcsVar3 = bcrVar.c;
        }
        if ((i & 8) != 0) {
            bcsVar4 = bcrVar.d;
        }
        return new defpackage.bcr(bcsVar, bcsVar2, bcsVar3, bcsVar4);
    }

    @Override // defpackage.cld
    public final defpackage.cku a(long j, defpackage.dlz dlzVar, defpackage.dlo dloVar) {
        defpackage.bcs bcsVar = this.d;
        defpackage.bcs bcsVar2 = this.c;
        defpackage.bcs bcsVar3 = this.b;
        float fA = this.a.a(j, dloVar);
        float fA2 = bcsVar3.a(j, dloVar);
        float fA3 = bcsVar2.a(j, dloVar);
        float fA4 = bcsVar.a(j, dloVar);
        float f = fA + fA4;
        float fB = defpackage.cjl.b(j);
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
        if (fA < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || fA2 < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || fA3 < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || fA4 < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            defpackage.asq.c("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return new defpackage.cks(defpackage.bzo.C(0L, j));
        }
        defpackage.cjj cjjVarC = defpackage.bzo.C(0L, j);
        defpackage.dlz dlzVar2 = defpackage.dlz.a;
        float f5 = dlzVar == dlzVar2 ? fA : fA2;
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f5);
        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f5);
        if (dlzVar == dlzVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fA);
        float f6 = fA3;
        long jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(fA);
        float f7 = dlzVar == dlzVar2 ? f6 : fA4;
        long jFloatToRawIntBits5 = java.lang.Float.floatToRawIntBits(f7);
        long jFloatToRawIntBits6 = java.lang.Float.floatToRawIntBits(f7);
        if (dlzVar != dlzVar2) {
            fA4 = f6;
        }
        return new defpackage.ckt(defpackage.bzo.z(cjjVarC, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L), (jFloatToRawIntBits5 << 32) | (jFloatToRawIntBits6 & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(fA4)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bcr) {
            defpackage.bcr bcrVar = (defpackage.bcr) obj;
            return defpackage.afga.f(this.a, bcrVar.a) && defpackage.afga.f(this.b, bcrVar.b) && defpackage.afga.f(this.c, bcrVar.c) && defpackage.afga.f(this.d, bcrVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
