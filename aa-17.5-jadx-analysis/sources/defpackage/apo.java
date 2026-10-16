package defpackage;

/* loaded from: classes.dex */
public final class apo extends afde implements afeg {
    int a;
    final /* synthetic */ float b;
    final /* synthetic */ aec c;
    final /* synthetic */ affs d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apo(float f, aec aecVar, affs affsVar, afck afckVar) {
        super(2, afckVar);
        this.b = f;
        this.c = aecVar;
        this.d = affsVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        apo apoVar = new apo(this.b, this.c, this.d, afckVar);
        apoVar.e = obj;
        return apoVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            apr aprVar = (apr) this.e;
            float f = this.b;
            aec aecVar = this.c;
            apn apnVar = new apn(this.d, aprVar, 0);
            this.a = 1;
            if (afp.i(f, aecVar, apnVar, this, 4) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((apo) b((apr) obj, (afck) obj2)).hT(afak.a);
    }
}
