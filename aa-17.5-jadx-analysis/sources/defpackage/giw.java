package defpackage;

/* loaded from: classes2.dex */
final class giw extends afde implements afeh {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ asf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giw(asf asfVar, afck afckVar) {
        super(3, afckVar);
        this.c = asfVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            giv givVar = new giv(this.b, this.c, (apl) this.d, null);
            this.a = 1;
            if (ahni.a(givVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((cja) obj2).a;
        giw giwVar = new giw(this.c, (afck) obj3);
        giwVar.d = (apl) obj;
        giwVar.b = j;
        return giwVar.hT(afak.a);
    }
}
