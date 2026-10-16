package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cfz implements defpackage.cfu {
    private final float a;
    private final float b;

    public cfz(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cfu
    public final long a(long j, long j2, defpackage.dlz dlzVar) {
        defpackage.dlz dlzVar2 = defpackage.dlz.a;
        float f = this.a;
        if (dlzVar != dlzVar2) {
            f = -f;
        }
        return (((long) java.lang.Math.round(((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f) * (this.b + 1.0f))) & 4294967295L) | (java.lang.Math.round(((((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f) * (f + 1.0f)) << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cfz)) {
            return false;
        }
        defpackage.cfz cfzVar = (defpackage.cfz) obj;
        return java.lang.Float.compare(this.a, cfzVar.a) == 0 && java.lang.Float.compare(this.b, cfzVar.b) == 0;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ")";
    }
}
