package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class ads extends afde implements afec {
    Object a;
    Object b;
    int c;
    final /* synthetic */ adu d;
    final /* synthetic */ Object e;
    final /* synthetic */ adz f;
    final /* synthetic */ long g;
    final /* synthetic */ afec h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ads(adu aduVar, Object obj, adz adzVar, long j, afec afecVar, afck afckVar) {
        super(1, afckVar);
        this.d = aduVar;
        this.e = obj;
        this.f = adzVar;
        this.g = j;
        this.h = afecVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [afec, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        ads adsVar;
        adz adzVar;
        aed aedVarD;
        affq affqVar;
        long j;
        afe afeVar;
        Object obj2;
        Object obj3;
        CancellationException cancellationException;
        afcr afcrVar = afcr.a;
        if (this.c != 0) {
            obj2 = this.b;
            obj3 = this.a;
            try {
                woy.dF(obj);
                adsVar = this;
            } catch (CancellationException e) {
                cancellationException = e;
                adsVar = this;
                adsVar.d.g();
                throw cancellationException;
            }
        } else {
            woy.dF(obj);
            try {
                adu aduVar = this.d;
                aed aedVar = aduVar.b;
                aedVar.a = (aei) aduVar.g.b.invoke(this.e);
                adzVar = this.f;
                aduVar.i(((afy) adzVar).a);
                aduVar.h(true);
                aedVarD = ca.D(aedVar, null, Long.MIN_VALUE, 23);
                affqVar = new affq();
                j = this.g;
                afeVar = new afe(aduVar, aedVarD, this.h, affqVar, 1);
                this.a = aedVarD;
                this.b = affqVar;
                this.c = 1;
                adsVar = this;
            } catch (CancellationException e2) {
                e = e2;
                adsVar = this;
                cancellationException = e;
                adsVar.d.g();
                throw cancellationException;
            }
            try {
                if (afp.d(aedVarD, adzVar, j, afeVar, adsVar) == afcrVar) {
                    return afcrVar;
                }
                obj2 = affqVar;
                obj3 = aedVarD;
            } catch (CancellationException e3) {
                e = e3;
                cancellationException = e;
                adsVar.d.g();
                throw cancellationException;
            }
        }
        int i = true != ((affq) obj2).a ? 2 : 1;
        adsVar.d.g();
        return new aea((aed) obj3, i);
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ads(this.d, this.e, this.f, this.g, this.h, (afck) obj).hT(afak.a);
    }
}
