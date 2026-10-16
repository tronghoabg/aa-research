package defpackage;

/* loaded from: classes.dex */
final class bey extends afde implements afeh {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ aitx c;
    final /* synthetic */ bwq d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bey(aitx aitxVar, bwq bwqVar, afck afckVar) {
        super(3, afckVar);
        this.c = aitxVar;
        this.d = bwqVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            Object obj2 = this.e;
            ahnc.d(this.c, null, 0, new bex(this.d, this.b, null), 3);
            this.a = 1;
            obj = ((apl) obj2).o(this);
            if (obj == afcrVar) {
                return afcrVar;
            }
        }
        ahnc.d(this.c, null, 0, new nhj(this.d, ((Boolean) obj).booleanValue(), (afck) null, 1), 3);
        return afak.a;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((cja) obj2).a;
        bey beyVar = new bey(this.c, this.d, (afck) obj3);
        beyVar.e = (apl) obj;
        beyVar.b = j;
        return beyVar.hT(afak.a);
    }
}
