package defpackage;

/* loaded from: classes.dex */
final class aod extends afde implements afeg {
    Object a;
    Object b;
    int c;
    final /* synthetic */ aoe d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aod(aoe aoeVar, afck afckVar) {
        super(2, afckVar);
        this.d = aoeVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aod aodVar = new aod(this.d, afckVar);
        aodVar.e = obj;
        return aodVar;
    }

    /* JADX WARN: Path cross not found for [B:41:0x00cb, B:38:0x00b7], limit reached: 51 */
    /* JADX WARN: Path cross not found for [B:43:0x00cf, B:20:0x0051], limit reached: 51 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af A[Catch: CancellationException -> 0x00df, PHI: r1 r8
  0x00af: PHI (r1v1 java.lang.Object) = (r1v5 java.lang.Object), (r1v15 java.lang.Object) binds: [B:35:0x00ad, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r8v1 aitx) = (r8v2 aitx), (r8v16 aitx) binds: [B:35:0x00ad, B:15:0x002e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {CancellationException -> 0x00df, blocks: (B:34:0x0099, B:36:0x00af, B:38:0x00b7, B:41:0x00cb, B:43:0x00cf, B:11:0x001e, B:15:0x002e), top: B:52:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7 A[Catch: CancellationException -> 0x00df, TryCatch #0 {CancellationException -> 0x00df, blocks: (B:34:0x0099, B:36:0x00af, B:38:0x00b7, B:41:0x00cb, B:43:0x00cf, B:11:0x001e, B:15:0x002e), top: B:52:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb A[Catch: CancellationException -> 0x00df, TryCatch #0 {CancellationException -> 0x00df, blocks: (B:34:0x0099, B:36:0x00af, B:38:0x00b7, B:41:0x00cb, B:43:0x00cf, B:11:0x001e, B:15:0x002e), top: B:52:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ca -> B:20:0x0051). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00cd -> B:20:0x0051). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00db -> B:20:0x0051). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00ec -> B:20:0x0051). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00ef -> B:20:0x0051). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aod.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aod) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
