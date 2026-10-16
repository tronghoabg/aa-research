package defpackage;

/* loaded from: classes.dex */
final class bbp extends afde implements afeg {
    int a;
    final /* synthetic */ bbt b;
    final /* synthetic */ int c;
    final /* synthetic */ float d;
    final /* synthetic */ aec e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbp(bbt bbtVar, int i, float f, aec aecVar, afck afckVar) {
        super(2, afckVar);
        this.b = bbtVar;
        this.c = i;
        this.d = f;
        this.e = aecVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        bbp bbpVar = new bbp(this.b, this.c, this.d, this.e, afckVar);
        bbpVar.f = obj;
        return bbpVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i;
        int iB;
        Object obj2 = afcr.a;
        int i2 = this.a;
        woy.dF(obj);
        if (i2 == 0) {
            apr aprVar = (apr) this.f;
            bbt bbtVar = this.b;
            axv axvVar = new axv(aprVar, bbtVar, 2);
            int i3 = this.c;
            float f = this.d;
            aec aecVar = this.e;
            alx alxVar = new alx(bbtVar, 6);
            this.a = 1;
            bbu bbuVar = bbv.a;
            alxVar.invoke(axvVar, new Integer(i3));
            int iB2 = axvVar.b();
            int iE = axvVar.e() - axvVar.b();
            boolean z = i3 > iB2;
            if (((z && i3 > axvVar.e()) || (!z && i3 < axvVar.b())) && Math.abs(i3 - axvVar.b()) >= 3) {
                int i4 = iE + 1;
                if (!z ? (i = i3 + i4) > (iB = axvVar.b()) : (i = i3 - i4) < (iB = axvVar.b())) {
                    i = iB;
                }
                axvVar.g(i);
            }
            Object objI = afp.i(axvVar.f(i3) + f, aecVar, new apn(new affs(), axvVar, 7), this, 4);
            if (objI != obj2) {
                objI = afak.a;
            }
            if (objI == obj2) {
                return obj2;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bbp) b((apr) obj, (afck) obj2)).hT(afak.a);
    }
}
