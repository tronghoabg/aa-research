package defpackage;

/* loaded from: classes.dex */
final class bus extends afdd implements afeg {
    int a;
    int b;
    int c;
    int d;
    final /* synthetic */ but e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bus(but butVar, afck afckVar) {
        super(afckVar);
        this.e = butVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        bus busVar = new bus(this.e, afckVar);
        busVar.f = obj;
        return busVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0157 A[LOOP:0: B:6:0x001f->B:24:0x0157, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015a A[SYNTHETIC] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bus.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bus) b((airr) obj, (afck) obj2)).hT(afak.a);
    }
}
