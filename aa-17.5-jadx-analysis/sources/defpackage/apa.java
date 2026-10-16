package defpackage;

/* loaded from: classes.dex */
final class apa extends afde implements afeg {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ apc e;
    final /* synthetic */ affv f;
    final /* synthetic */ affu g;
    final /* synthetic */ affv h;
    final /* synthetic */ float i;
    final /* synthetic */ float j;
    private /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apa(apc apcVar, affv affvVar, affu affuVar, affv affvVar2, float f, float f2, afck afckVar) {
        super(2, afckVar);
        this.e = apcVar;
        this.f = affvVar;
        this.g = affuVar;
        this.h = affvVar2;
        this.i = f;
        this.j = f2;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        apa apaVar = new apa(this.e, this.f, this.g, this.h, this.i, this.j, afckVar);
        apaVar.k = obj;
        return apaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ba, code lost:
    
        r11 = java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (java.lang.Float.floatToRawIntBits(java.lang.Math.signum(java.lang.Float.intBitsToFloat(r8))) & 4294967295L)) * r15);
        r0.l(r10, r11);
        r4 = defpackage.apc.k(r4, r11);
        r12 = r10;
        r3.a = defpackage.ca.D((defpackage.aed) r3.a, java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (r4 & 4294967295L))), 0, 30);
        r8 = defpackage.afgi.k(java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (defpackage.apc.i(r2.a, r4) & 4294967295L))) / r6.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0110, code lost:
    
        if (r8 <= 100) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0112, code lost:
    
        r8 = 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0113, code lost:
    
        r9 = (defpackage.aed) r3.a;
        r10 = r2.a;
        r10 = new defpackage.afe(r0, r1, r2, r14, 4);
        r6.k = r12;
        r6.a = r14;
        r6.b = null;
        r6.c = r8;
        r11 = 2;
        r6.d = 2;
        r2 = new defpackage.affu();
        r2.a = r4;
        r12 = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (r10 & 4294967295L)));
        r13 = defpackage.ca.F(r8, 0, defpackage.aev.d, 2);
        r0 = new defpackage.afe(r0, r2, r12, (defpackage.afec) r10, 3);
        r10 = r12;
        r0 = defpackage.afp.f(r9, r12, r13, true, r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x015e, code lost:
    
        if (r0 == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0160, code lost:
    
        r0 = defpackage.afak.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0162, code lost:
    
        if (r0 == r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0164, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x018c -> B:31:0x018d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x019c -> B:33:0x019f). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apa.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((apa) b((izj) obj, (afck) obj2)).hT(afak.a);
    }
}
