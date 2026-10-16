package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class apm implements defpackage.apy {
    public final defpackage.afer a;

    public apm(defpackage.afer aferVar) {
        this.a = aferVar;
    }

    @Override // defpackage.apy
    public final long a(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        boolean zBooleanValue = ((java.lang.Boolean) this.a.invoke()).booleanValue();
        float f = true != zBooleanValue ? fIntBitsToFloat : 0.0f;
        if (true != zBooleanValue) {
            fIntBitsToFloat = 0.0f;
        }
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(f)) << 32);
    }

    @Override // defpackage.apy
    public final long b(long j) {
        boolean zBooleanValue = ((java.lang.Boolean) this.a.invoke()).booleanValue();
        int i = (int) (4294967295L & j);
        float fAbs = java.lang.Math.abs(java.lang.Float.intBitsToFloat(i));
        int i2 = (int) (j >> 32);
        float fAbs2 = java.lang.Math.abs(java.lang.Float.intBitsToFloat(i2));
        float fIntBitsToFloat = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        if (fAbs >= fAbs2) {
            if (zBooleanValue) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat(i);
            }
        } else if (!zBooleanValue) {
            fIntBitsToFloat = java.lang.Float.intBitsToFloat(i2);
        }
        return java.lang.Float.floatToRawIntBits(fIntBitsToFloat);
    }
}
