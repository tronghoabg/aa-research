package defpackage;

/* loaded from: classes.dex */
public final class aez implements aey {
    private final float a = Math.max(1.0E-7f, Math.abs(0.1f));
    private final float b = Math.max(1.0E-4f, 1.0f) * (-4.2f);

    @Override // defpackage.aey
    public final float a() {
        return this.a;
    }

    @Override // defpackage.aey
    public final float b(float f, float f2) {
        float fAbs = Math.abs(f2);
        float f3 = this.a;
        if (fAbs <= f3) {
            return f;
        }
        double dAbs = Math.abs(f3 / f2);
        float f4 = this.b;
        double d = f4;
        float f5 = f2 / f4;
        return (f - f5) + (f5 * ((float) Math.exp((d * ((Math.log(dAbs) / d) * 1000.0d)) / 1000.0d)));
    }

    @Override // defpackage.aey
    public final float c(long j, float f, float f2) {
        float f3 = f2 / this.b;
        return (f - f3) + (f3 * ((float) Math.exp(((j / 1000000) * r2) / 1000.0f)));
    }

    @Override // defpackage.aey
    public final long d(float f) {
        return ((long) ((((float) Math.log(this.a / Math.abs(f))) * 1000.0f) / this.b)) * 1000000;
    }

    @Override // defpackage.aey
    public final float e(long j, float f) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.b));
    }
}
