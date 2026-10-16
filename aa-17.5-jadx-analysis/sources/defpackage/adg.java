package defpackage;

/* loaded from: classes.dex */
final class adg extends afde implements afeg {
    int a;
    final /* synthetic */ adf b;
    final /* synthetic */ long c;
    final /* synthetic */ adh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adg(adf adfVar, long j, adh adhVar, afck afckVar) {
        super(2, afckVar);
        this.b = adfVar;
        this.c = j;
        this.d = adhVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new adg(this.b, this.c, this.d, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        adg adgVar;
        afeg afegVar;
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i != 0) {
            adgVar = this;
        } else {
            adf adfVar = this.b;
            dlq dlqVar = new dlq(this.c);
            aec aecVar = this.d.a;
            this.a = 1;
            adgVar = this;
            obj = adu.k(adfVar.a, dlqVar, aecVar, null, adgVar, 12);
            if (obj == afcrVar) {
                return afcrVar;
            }
        }
        aea aeaVar = (aea) obj;
        if (aeaVar.b == 2 && (afegVar = adgVar.d.c) != null) {
            afegVar.invoke(new dlq(adgVar.b.b), aeaVar.a.a());
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((adg) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
