package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adx extends defpackage.cyc<defpackage.ady> {
    private final float a;
    private final java.lang.Object b;

    public adx(float f, java.lang.Object obj) {
        this.a = f;
        this.b = obj;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.ady(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.ady) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adx)) {
            return false;
        }
        defpackage.adx adxVar = (defpackage.adx) obj;
        return adxVar.a == this.a && defpackage.afga.f(adxVar.b, this.b);
    }

    public final int hashCode() {
        int iFloatToIntBits = java.lang.Float.floatToIntBits(this.a) * 31;
        java.lang.Object obj = this.b;
        return iFloatToIntBits + (obj != null ? obj.hashCode() : 0);
    }
}
