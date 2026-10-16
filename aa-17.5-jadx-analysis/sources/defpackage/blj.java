package defpackage;

/* loaded from: classes.dex */
final class blj extends afde implements afeg {
    int a;
    final /* synthetic */ blr b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(blr blrVar, boolean z, afck afckVar) {
        super(2, afckVar);
        this.b = blrVar;
        this.c = z;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new blj(this.b, this.c, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        kwp kwpVar;
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            blr blrVar = this.b;
            boolean z = this.c;
            deu deuVar = null;
            if (blrVar.w()) {
                deu deuVarM = dap.m(blrVar.f());
                if (z) {
                    long j = blrVar.f().b;
                    long j2 = dfv.a;
                    int iMax = Math.max((int) (j >> 32), (int) (j & 4294967295L));
                    blrVar.c.invoke(new djv(blrVar.f().a, czz.t(iMax, iMax), (dfv) null));
                    blrVar.q(bdu.a);
                }
                deuVar = deuVarM;
            }
            if (deuVar != null && (kwpVar = blrVar.x) != null) {
                sm smVarQ = asl.q(deuVar);
                this.a = 1;
                if (kwpVar.r(smVarQ) == afcrVar) {
                    return afcrVar;
                }
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((blj) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
