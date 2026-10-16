package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class awp extends defpackage.cyc<defpackage.awq> {
    private final float a;
    private final float b;

    public awp(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.awq(this.a, this.b);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.awq awqVar = (defpackage.awq) cgeVar;
        awqVar.a = this.a;
        awqVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.awp)) {
            return false;
        }
        defpackage.awp awpVar = (defpackage.awp) obj;
        return java.lang.Float.compare(this.a, awpVar.a) == 0 && java.lang.Float.compare(this.b, awpVar.b) == 0;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }
}
