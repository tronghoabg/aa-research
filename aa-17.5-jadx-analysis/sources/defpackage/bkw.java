package defpackage;

/* loaded from: classes.dex */
public final class bkw extends afdd implements afeg {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ affu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkw(long j, affu affuVar, afck afckVar) {
        super(afckVar);
        this.b = j;
        this.c = affuVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        bkw bkwVar = new bkw(this.b, this.c, afckVar);
        bkwVar.d = obj;
        return bkwVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        crl crlVar;
        afcr afcrVar = afcr.a;
        if (this.a != 0) {
            crlVar = (crl) this.d;
            woy.dF(obj);
        } else {
            woy.dF(obj);
            crl crlVar2 = (crl) this.d;
            long j = this.b;
            alx alxVar = new alx(this.c, 10);
            this.d = crlVar2;
            this.a = 1;
            Object objAQ = ca.aQ(crlVar2, j, alxVar, this);
            if (objAQ == afcrVar) {
                return afcrVar;
            }
            crlVar = crlVar2;
            obj = objAQ;
        }
        if (((cqu) obj) != null && (this.c.a & 9223372034707292159L) != 9205357640488583168L) {
            return bjv.b;
        }
        cqu cquVar = (cqu) woy.bF(crlVar.p().a);
        if (!tl.m(cquVar)) {
            return bjv.d;
        }
        cquVar.b();
        return bjv.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bkw) b((crl) obj, (afck) obj2)).hT(afak.a);
    }
}
