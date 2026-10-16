package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class avm extends defpackage.cyc<defpackage.avn> {
    private final float a;
    private final float b;

    public avm(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.avn(this.a, this.b);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.avn avnVar = (defpackage.avn) cgeVar;
        float f = avnVar.a;
        float f2 = this.a;
        int iCompare = java.lang.Float.compare(f, f2);
        float f3 = this.b;
        if (iCompare != 0 || java.lang.Float.compare(avnVar.b, f3) != 0 || !avnVar.c) {
            defpackage.cjv.r(avnVar).W(false);
        }
        avnVar.a = f2;
        avnVar.b = f3;
        avnVar.c = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.avm avmVar = obj instanceof defpackage.avm ? (defpackage.avm) obj : null;
        return avmVar != null && java.lang.Float.compare(this.a, avmVar.a) == 0 && java.lang.Float.compare(this.b, avmVar.b) == 0;
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + 1231;
    }

    public final java.lang.String toString() {
        float f = this.b;
        return "OffsetModifierElement(x=" + defpackage.dlr.b(this.a) + ", y=" + defpackage.dlr.b(f) + ", rtlAware=true)";
    }
}
