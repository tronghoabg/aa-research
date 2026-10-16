package defpackage;

/* loaded from: classes.dex */
public final class ajg extends cxt<ajf> {
    private final float a;
    private final cjs b;
    private final ckv c;

    public ajg(float f, cjs cjsVar, ckv ckvVar) {
        this.a = f;
        this.b = cjsVar;
        this.c = ckvVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new ajf(this.a, this.b, this.c);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        ajf ajfVar = (ajf) cfxVar;
        float f = ajfVar.b;
        float f2 = this.a;
        if (Float.compare(f, f2) != 0) {
            ajfVar.b = f2;
            ajfVar.e.d();
        }
        cjs cjsVar = this.b;
        if (!affa.f(ajfVar.c, cjsVar)) {
            ajfVar.c = cjsVar;
            ajfVar.e.d();
        }
        ckv ckvVar = this.c;
        if (affa.f(ajfVar.d, ckvVar)) {
            return;
        }
        ajfVar.d = ckvVar;
        ajfVar.e.d();
        bzi.q(ajfVar).J();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajg)) {
            return false;
        }
        ajg ajgVar = (ajg) obj;
        return Float.compare(this.a, ajgVar.a) == 0 && affa.f(this.b, ajgVar.b) && affa.f(this.c, ajgVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + dlj.b(this.a) + ", brush=" + this.b + ", shape=" + this.c + ")";
    }
}
