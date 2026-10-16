package defpackage;

/* loaded from: classes2.dex */
public final class faq extends afde implements afeg {
    int a;
    final /* synthetic */ afco b;
    final /* synthetic */ ezc c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ afec f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public faq(afco afcoVar, ezc ezcVar, boolean z, boolean z2, afec afecVar, afck afckVar) {
        super(2, afckVar);
        this.b = afcoVar;
        this.c = ezcVar;
        this.d = z;
        this.e = z2;
        this.f = afecVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new faq(this.b, this.c, this.d, this.e, this.f, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i != 0) {
            return obj;
        }
        afco afcoVar = this.b;
        fap fapVar = new fap(this.c, this.d, this.e, this.f, null);
        this.a = 1;
        Object objA = ahnc.a(afcoVar, fapVar, this);
        return objA == afcrVar ? afcrVar : objA;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((faq) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
