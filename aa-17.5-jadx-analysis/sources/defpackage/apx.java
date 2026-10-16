package defpackage;

/* loaded from: classes.dex */
final class apx extends afde implements afeg {
    int a;
    final /* synthetic */ aqk b;
    final /* synthetic */ long c;
    final /* synthetic */ affs d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apx(aqk aqkVar, long j, affs affsVar, afck afckVar) {
        super(2, afckVar);
        this.b = aqkVar;
        this.c = j;
        this.d = affsVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        apx apxVar = new apx(this.b, this.c, this.d, afckVar);
        apxVar.e = obj;
        return apxVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            izj izjVar = (izj) this.e;
            aqk aqkVar = this.b;
            long j = this.c;
            affs affsVar = this.d;
            float fB = aqkVar.b(j);
            bgh bghVar = new bgh(affsVar, aqkVar, izjVar, 1);
            this.a = 1;
            if (afp.i(fB, null, bghVar, this, 12) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((apx) b((izj) obj, (afck) obj2)).hT(afak.a);
    }
}
