package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bnc implements afeg {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bnc(long j, Object obj, int i) {
        this.c = i;
        this.a = j;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [afei, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [bym, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return bnf.a(this.a, this.b, (bux) obj, ((Integer) obj2).intValue());
        }
        if (i == 1) {
            return bnf.a(this.a, this.b, (bux) obj, ((Integer) obj2).intValue());
        }
        if (i != 2) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                mva.o(this.a, mva.a(this.b), das.d(awd.d(asl.H(awd.r(cfy.e), gjk.b.k), 80.0f), "earth_minimized_card"), buxVar, 64);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        int i2 = iIntValue2 & 3;
        if (buxVar2.I(i2 != 2, iIntValue2 & 1)) {
            long j = this.a;
            this.b.invoke(Float.valueOf(Float.intBitsToFloat((int) (j >> 32))), Float.valueOf(Float.intBitsToFloat((int) (j & 4294967295L))), buxVar2, 0);
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public /* synthetic */ bnc(afei afeiVar, long j, int i) {
        this.c = i;
        this.b = afeiVar;
        this.a = j;
    }
}
