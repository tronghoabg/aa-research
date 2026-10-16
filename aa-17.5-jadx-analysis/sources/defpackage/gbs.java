package defpackage;

/* loaded from: classes2.dex */
public final class gbs extends afde implements afeg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbs(egd egdVar, fdf fdfVar, boolean z, afeg afegVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.e = egdVar;
        this.d = fdfVar;
        this.b = z;
        this.c = afegVar;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [afeg, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.f != 0) {
            Object obj2 = this.e;
            return new gbs((egd) obj2, (fdf) this.d, this.b, (afeg) this.c, afckVar, 1);
        }
        Object obj3 = this.c;
        return new gbs((gbv) obj3, this.b, (ieb) this.d, (cil) this.e, afckVar, 0);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [afeg, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.f != 0) {
            afcr afcrVar = afcr.a;
            int i = this.a;
            woy.dF(obj);
            if (i != 0) {
                return obj;
            }
            efu efuVar = new efu(this.b, (egd) this.e, this.c, null);
            this.a = 1;
            Object objG = dsu.g(efuVar, this);
            return objG == afcrVar ? afcrVar : objG;
        }
        afcr afcrVar2 = afcr.a;
        if (this.a == 0) {
            woy.dF(obj);
            if (!((gbv) this.c).c) {
                ((ieb) this.d).u();
            } else if (this.b) {
                long j = gbm.a;
                long j2 = gbm.a;
                this.a = 1;
                if (aiow.d(j2, this) == afcrVar2) {
                    return afcrVar2;
                }
            } else {
                ((cil) this.e).a(7);
            }
            return afak.a;
        }
        woy.dF(obj);
        ((ieb) this.d).t();
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((gbs) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((gbs) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbs(gbv gbvVar, boolean z, ieb iebVar, cil cilVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.c = gbvVar;
        this.b = z;
        this.d = iebVar;
        this.e = cilVar;
    }
}
