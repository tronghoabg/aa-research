package defpackage;

/* loaded from: classes2.dex */
final class mvn extends afde implements afeg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bbt c;
    final /* synthetic */ int d;
    final /* synthetic */ bym e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvn(boolean z, bbt bbtVar, int i, bym bymVar, afck afckVar) {
        super(2, afckVar);
        this.b = z;
        this.c = bbtVar;
        this.d = i;
        this.e = bymVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new mvn(this.b, this.c, this.d, this.e, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0 && this.b) {
            bbt bbtVar = this.c;
            int iIntValue = ((Number) this.e.a()).intValue();
            int i2 = 1073741823 % iIntValue;
            int iMin = (1073741823 - (i2 + (iIntValue & (((i2 ^ iIntValue) & ((-i2) | i2)) >> 31)))) + Math.min(this.d, ((Number) r1.a()).intValue() - 1);
            this.a = 1;
            if (bbtVar.A(iMin, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((mvn) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
