package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afg implements defpackage.aff {
    private final float a = 0.1f;
    private final float b = -4.2f;

    @Override // defpackage.aff
    public final float a() {
        return this.a;
    }

    @Override // defpackage.aff
    public final float b(float f, float f2) {
        float fAbs = java.lang.Math.abs(f2);
        float f3 = this.a;
        if (fAbs <= f3) {
            return f;
        }
        double dAbs = java.lang.Math.abs(f3 / f2);
        float f4 = this.b;
        double d = f4;
        float f5 = f2 / f4;
        return (f - f5) + (f5 * ((float) java.lang.Math.exp((d * ((java.lang.Math.log(dAbs) / d) * 1000.0d)) / 1000.0d)));
    }

    @Override // defpackage.aff
    public final float c(long j, float f, float f2) {
        float f3 = this.b;
        float f4 = f2 / f3;
        return (f - f4) + (f4 * ((float) java.lang.Math.exp(((j / 1000000) * f3) / 1000.0f)));
    }

    @Override // defpackage.aff
    public final long d(float f) {
        return ((long) ((((float) java.lang.Math.log(this.a / java.lang.Math.abs(f))) * 1000.0f) / this.b)) * 1000000;
    }

    @Override // defpackage.aff
    public final float e(long j, float f) {
        return f * ((float) java.lang.Math.exp(((j / 1000000) / 1000.0f) * this.b));
    }
}
