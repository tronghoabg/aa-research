package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cfw implements defpackage.cfu {
    private final float a;
    private final float b = -1.0f;

    public cfw(float f) {
        this.a = f;
    }

    @Override // defpackage.cfu
    public final long a(long j, long j2, defpackage.dlz dlzVar) {
        long j3 = (((long) (-((int) (j >> 32)))) << 32) | (((long) (-((int) (j & 4294967295L)))) & 4294967295L);
        return (((long) java.lang.Math.round((((int) (j3 & 4294967295L)) / 2.0f) * com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED)) & 4294967295L) | (java.lang.Math.round((((int) (j3 >> 32)) / 2.0f) * (this.a + 1.0f)) << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cfw)) {
            return false;
        }
        defpackage.cfw cfwVar = (defpackage.cfw) obj;
        if (java.lang.Float.compare(this.a, cfwVar.a) != 0) {
            return false;
        }
        float f = cfwVar.b;
        return true;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) - 1082130432;
    }

    public final java.lang.String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}
