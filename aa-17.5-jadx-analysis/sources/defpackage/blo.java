package defpackage;

/* loaded from: classes.dex */
final class blo extends afde implements afeg {
    int a;
    final /* synthetic */ blr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blo(blr blrVar, afck afckVar) {
        super(2, afckVar);
        this.b = blrVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new blo(this.b, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x02bd, code lost:
    
        if (r2 == r1) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0156  */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blo.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((blo) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
