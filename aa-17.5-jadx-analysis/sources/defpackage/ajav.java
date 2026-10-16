package defpackage;

/* loaded from: classes3.dex */
public final class ajav extends afde implements afeg {
    Object a;
    Object b;
    int c;
    int d;
    int e;
    final /* synthetic */ aiyk[] f;
    final /* synthetic */ afdr g;
    final /* synthetic */ afeh h;
    final /* synthetic */ aiyl i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajav(aiyk[] aiykVarArr, afdr afdrVar, afeh afehVar, aiyl aiylVar, afck afckVar) {
        super(2, afckVar);
        this.f = aiykVarArr;
        this.g = afdrVar;
        this.h = afehVar;
        this.i = aiylVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        ajav ajavVar = new ajav(this.f, this.g, this.h, this.i, afckVar);
        ajavVar.j = obj;
        return ajavVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
    
        if (r11.invoke(r12, r10, r17) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e8, code lost:
    
        if (r12.invoke(r13, r11, r17) == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088 A[LOOP:0: B:18:0x0088->B:40:?, LOOP_START, PHI: r7 r11
  0x0088: PHI (r7v5 int) = (r7v4 int), (r7v6 int) binds: [B:17:0x0086, B:40:?] A[DONT_GENERATE, DONT_INLINE]
  0x0088: PHI (r11v4 afbh) = (r11v3 afbh), (r11v17 afbh) binds: [B:17:0x0086, B:40:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00eb -> B:13:0x0067). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajav.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ajav) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
