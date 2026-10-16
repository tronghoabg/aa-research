package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class and extends afde implements afeg {
    int a;
    final /* synthetic */ ane b;
    final /* synthetic */ arf c;
    final /* synthetic */ amy d;
    final /* synthetic */ long e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public and(ane aneVar, arf arfVar, amy amyVar, long j, afck afckVar) {
        super(2, afckVar);
        this.b = aneVar;
        this.c = arfVar;
        this.d = amyVar;
        this.e = j;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        and andVar = new and(this.b, this.c, this.d, this.e, afckVar);
        andVar.f = obj;
        return andVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        CancellationException cancellationException = null;
        try {
            try {
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    aivh aivhVarD = affx.d(((aitx) this.f).c());
                    ane aneVar = this.b;
                    aneVar.h = true;
                    aqk aqkVar = aneVar.b;
                    akq akqVar = akq.a;
                    anc ancVar = new anc(this.c, aneVar, this.d, this.e, aivhVarD, null);
                    this.a = 1;
                    if (aqkVar.i(akqVar, ancVar, this) == afcrVar) {
                        return afcrVar;
                    }
                }
                Object obj2 = this.b.i.a;
                afha afhaVarM = afpt.m(0, ((byw) obj2).b);
                int i = afhaVarM.a;
                int i2 = afhaVarM.b;
                if (i <= i2) {
                    while (true) {
                        ((anb) ((byw) obj2).a[i]).b.w(afak.a);
                        if (i == i2) {
                            break;
                        }
                        i++;
                    }
                }
                ((byw) obj2).g();
                ane aneVar2 = this.b;
                aneVar2.h = false;
                aneVar2.i.v(null);
                aneVar2.f = false;
                return afak.a;
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (Throwable th) {
            ane aneVar3 = this.b;
            aneVar3.h = false;
            aneVar3.i.v(cancellationException);
            aneVar3.f = false;
            throw th;
        }
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((and) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
