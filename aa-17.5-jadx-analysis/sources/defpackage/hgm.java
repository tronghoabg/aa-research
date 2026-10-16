package defpackage;

/* loaded from: classes2.dex */
final class hgm extends afdd implements afeg {
    Object a;
    Object b;
    int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ hga e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgm(boolean z, hga hgaVar, afck afckVar) {
        super(afckVar);
        this.d = z;
        this.e = hgaVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        hgm hgmVar = new hgm(this.d, this.e, afckVar);
        hgmVar.f = obj;
        return hgmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        if (r11 != r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0094 -> B:40:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a6 -> B:27:0x00aa). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgm.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((hgm) b((crl) obj, (afck) obj2)).hT(afak.a);
    }
}
