package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class avr extends defpackage.cyc<defpackage.avs> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public avr(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f || java.lang.Float.isNaN(f)) & (f2 >= 0.0f || java.lang.Float.isNaN(f2)) & (f3 >= 0.0f || java.lang.Float.isNaN(f3))) || !(f4 >= 0.0f || java.lang.Float.isNaN(f4))) {
            defpackage.axd.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.avs(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.avs avsVar = (defpackage.avs) cgeVar;
        avsVar.a = this.a;
        avsVar.b = this.b;
        avsVar.c = this.c;
        avsVar.d = this.d;
        avsVar.e = true;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.avr avrVar = obj instanceof defpackage.avr ? (defpackage.avr) obj : null;
        return avrVar != null && java.lang.Float.compare(this.a, avrVar.a) == 0 && java.lang.Float.compare(this.b, avrVar.b) == 0 && java.lang.Float.compare(this.c, avrVar.c) == 0 && java.lang.Float.compare(this.d, avrVar.d) == 0;
    }

    public final int hashCode() {
        return (((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + 1231;
    }
}
