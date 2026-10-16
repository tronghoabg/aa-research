package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bdg implements afec {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ bdg(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        aitf aitfVar;
        Object aezvVar;
        int i = this.b;
        if (i == 0) {
            ((dec) obj).a(bla.a, new bkz(bdt.a, this.a, 2, true));
            return afak.a;
        }
        if (i == 1) {
            cgz cgzVar = (cgz) obj;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (cgzVar.n() >> 32)) / 2.0f;
            return cgzVar.q(new azw(fIntBitsToFloat, awx.E(cgzVar, fIntBitsToFloat), new cjp(this.a, 5), 2));
        }
        buk bukVar = (buk) obj;
        afec afecVar = bukVar.b;
        long j = this.a;
        if (afecVar != null && (aitfVar = bukVar.a) != null) {
            try {
                aezvVar = afecVar.invoke(Long.valueOf(j));
            } catch (Throwable th) {
                aezvVar = new aezv(th);
            }
            aitfVar.w(aezvVar);
        }
        return afak.a;
    }
}
