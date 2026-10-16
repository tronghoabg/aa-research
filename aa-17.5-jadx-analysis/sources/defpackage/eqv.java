package defpackage;

/* loaded from: classes.dex */
final class eqv extends afde implements afeg {
    Object a;
    Object b;
    int c;
    final /* synthetic */ afeg d;
    final /* synthetic */ ajdz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqv(ajdz ajdzVar, afeg afegVar, afck afckVar) {
        super(2, afckVar);
        this.e = ajdzVar;
        this.d = afegVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new eqv(this.e, this.d, afckVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        ajdz ajdzVar;
        afeg afegVar;
        Throwable th;
        Object obj2;
        afcr afcrVar = afcr.a;
        int i = this.c;
        try {
            if (i == 0) {
                woy.dF(obj);
                ajdzVar = this.e;
                afeg afegVar2 = this.d;
                this.a = ajdzVar;
                this.b = afegVar2;
                this.c = 1;
                afegVar = afegVar2;
                if (ajdzVar.b(this) != afcrVar) {
                }
                return afcrVar;
            }
            if (i != 1) {
                obj2 = this.a;
                try {
                    woy.dF(obj);
                    ((ajdz) obj2).d();
                    return afak.a;
                } catch (Throwable th2) {
                    th = th2;
                    ((ajdz) obj2).d();
                    throw th;
                }
            }
            Object obj3 = this.b;
            Object obj4 = this.a;
            woy.dF(obj);
            ajdzVar = obj4;
            afegVar = obj3;
            epm epmVar = new epm(afegVar, (afck) null, 2, (byte[]) null);
            this.a = ajdzVar;
            this.b = null;
            this.c = 2;
            if (ahni.a(epmVar, this) != afcrVar) {
                obj2 = ajdzVar;
                ((ajdz) obj2).d();
                return afak.a;
            }
            return afcrVar;
        } catch (Throwable th3) {
            ajdz ajdzVar2 = ajdzVar;
            th = th3;
            obj2 = ajdzVar2;
            ((ajdz) obj2).d();
            throw th;
        }
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((eqv) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
