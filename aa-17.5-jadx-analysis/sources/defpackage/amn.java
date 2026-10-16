package defpackage;

/* loaded from: classes.dex */
final class amn extends afde implements afeh {
    int a;
    final /* synthetic */ afeg b;
    final /* synthetic */ amq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amn(afeg afegVar, amq amqVar, afck afckVar) {
        super(3, afckVar);
        this.b = afegVar;
        this.c = amqVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            Object obj2 = this.d;
            afeg afegVar = this.b;
            aju ajuVar = new aju(this.c, obj2, 2, null);
            this.a = 1;
            if (afegVar.invoke(ajuVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        amn amnVar = new amn(this.b, this.c, (afck) obj3);
        amnVar.d = (amu) obj;
        return amnVar.hT(afak.a);
    }
}
