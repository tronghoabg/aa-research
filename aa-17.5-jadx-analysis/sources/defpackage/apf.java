package defpackage;

/* loaded from: classes.dex */
public final class apf extends afde implements afeg {
    int a;
    private /* synthetic */ Object b;

    public apf(afck afckVar) {
        super(2, afckVar);
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        apf apfVar = new apf(afckVar);
        apfVar.b = obj;
        return apfVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        aitx aitxVar;
        afcr afcrVar = afcr.a;
        if (this.a != 0) {
            aitxVar = (aitx) this.b;
            woy.dF(obj);
        } else {
            woy.dF(obj);
            aitxVar = (aitx) this.b;
        }
        while (affx.h(aitxVar.c())) {
            ajc ajcVar = new ajc(15);
            this.b = aitxVar;
            this.a = 1;
            if (czz.ah(hH()).a(ajcVar, this) == afcrVar) {
                return afcrVar;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((apf) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
