package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
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
        int i2 = (int) (j >> 32);
        float fIntBitsToFloat = 0.0f;
        if (java.lang.Math.abs(java.lang.Float.intBitsToFloat(i)) >= java.lang.Math.abs(java.lang.Float.intBitsToFloat(i2))) {
            if (zBooleanValue) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat(i);
            }
        } else if (!zBooleanValue) {
            fIntBitsToFloat = java.lang.Float.intBitsToFloat(i2);
        }
        return java.lang.Float.floatToRawIntBits(fIntBitsToFloat);
    }
}
