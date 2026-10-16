package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cmg extends defpackage.clp {
    public cmg() {
        super("Generic XYZ", 12884901889L, 14);
    }

    @Override // defpackage.clp
    public final float a(int i) {
        return 2.0f;
    }

    @Override // defpackage.clp
    public final float b(int i) {
        return -2.0f;
    }

    @Override // defpackage.clp
    public final float c(float f, float f2, float f3) {
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            return 2.0f;
        }
        return f3;
    }

    @Override // defpackage.clp
    public final long d(float f, float f2, float f3) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        return (((long) java.lang.Float.floatToRawIntBits(f2 <= 2.0f ? f2 : 2.0f)) & 4294967295L) | (jFloatToRawIntBits << 32);
    }

    @Override // defpackage.clp
    public final long e(float f, float f2, float f3, float f4, defpackage.clp clpVar) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        return defpackage.cjv.k(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, clpVar);
    }
}
