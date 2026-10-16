package defpackage;

/* loaded from: classes.dex */
final class aly extends afde implements afeg {
    int a;
    final /* synthetic */ ama b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aly(ama amaVar, float f, float f2, afck afckVar) {
        super(2, afckVar);
        this.b = amaVar;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new aly(this.b, this.c, this.d, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            ama amaVar = this.b;
            float f = this.c;
            float f2 = this.d;
            long jFloatToRawIntBits = Float.floatToRawIntBits(f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
            this.a = 1;
            if (amaVar.i((jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32), this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aly) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
