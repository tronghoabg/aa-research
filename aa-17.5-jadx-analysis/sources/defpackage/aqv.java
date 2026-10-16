package defpackage;

/* loaded from: classes.dex */
final class aqv extends afdd implements afeg {
    int a;
    final /* synthetic */ cqm b;
    final /* synthetic */ affv c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqv(cqm cqmVar, affv affvVar, afck afckVar) {
        super(afckVar);
        this.b = cqmVar;
        this.c = affvVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aqv aqvVar = new aqv(this.b, this.c, afckVar);
        aqvVar.d = obj;
        return aqvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (defpackage.ca.aA(r12) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        r11.c.a = defpackage.aox.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        r12 = r1.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r5 >= r12) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r6 = (defpackage.cqu) r1.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r6.c() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (defpackage.tl.n(r6, r4.o(), r4.n()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        r11.c.a = defpackage.aov.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        r12 = defpackage.cqm.c;
        r11.d = r4;
        r11.a = 2;
        r12 = r4.r(r12, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r12 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        r11.c.a = defpackage.aov.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
    
        return defpackage.afak.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        if (r1 != 1) goto L30;
     */
    /* JADX WARN: Path cross not found for [B:30:0x0087, B:11:0x0028], limit reached: 46 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r11.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L13
            java.lang.Object r4 = r11.d
            crl r4 = (defpackage.crl) r4
            defpackage.woy.dF(r12)
            if (r1 == r3) goto L28
            goto L87
        L13:
            defpackage.woy.dF(r12)
            java.lang.Object r12 = r11.d
            crl r12 = (defpackage.crl) r12
        L1a:
            r11.d = r12
            r11.a = r3
            cqm r1 = r11.b
            java.lang.Object r1 = r12.r(r1, r11)
            if (r1 == r0) goto Lc0
            r4 = r12
            r12 = r1
        L28:
            cql r12 = (defpackage.cql) r12
            java.util.List r1 = r12.a
            int r5 = r1.size()
            r6 = r2
        L31:
            if (r6 >= r5) goto Lae
            java.lang.Object r7 = r1.get(r6)
            cqu r7 = (defpackage.cqu) r7
            boolean r7 = defpackage.tl.l(r7)
            if (r7 != 0) goto Lab
            boolean r12 = defpackage.ca.aA(r12)
            if (r12 == 0) goto L4d
            affv r11 = r11.c
            aox r12 = defpackage.aox.c
            r11.a = r12
            goto Lbd
        L4d:
            int r12 = r1.size()
            r5 = r2
        L52:
            if (r5 >= r12) goto L79
            java.lang.Object r6 = r1.get(r5)
            cqu r6 = (defpackage.cqu) r6
            boolean r7 = r6.c()
            if (r7 != 0) goto L72
            long r7 = r4.o()
            long r9 = r4.n()
            boolean r6 = defpackage.tl.n(r6, r7, r9)
            if (r6 == 0) goto L6f
            goto L72
        L6f:
            int r5 = r5 + 1
            goto L52
        L72:
            affv r11 = r11.c
            aov r12 = defpackage.aov.c
            r11.a = r12
            goto Lbd
        L79:
            cqm r12 = defpackage.cqm.c
            r11.d = r4
            r1 = 2
            r11.a = r1
            java.lang.Object r12 = r4.r(r12, r11)
            if (r12 != r0) goto L87
            goto Lc0
        L87:
            cql r12 = (defpackage.cql) r12
            java.util.List r12 = r12.a
            int r1 = r12.size()
            r5 = r2
        L90:
            if (r5 >= r1) goto La8
            java.lang.Object r6 = r12.get(r5)
            cqu r6 = (defpackage.cqu) r6
            boolean r6 = r6.c()
            if (r6 == 0) goto La5
            affv r11 = r11.c
            aov r12 = defpackage.aov.c
            r11.a = r12
            goto Lbd
        La5:
            int r5 = r5 + 1
            goto L90
        La8:
            r12 = r4
            goto L1a
        Lab:
            int r6 = r6 + 1
            goto L31
        Lae:
            affv r11 = r11.c
            aow r12 = new aow
            java.lang.Object r0 = r1.get(r2)
            cqu r0 = (defpackage.cqu) r0
            r12.<init>(r0)
            r11.a = r12
        Lbd:
            afak r11 = defpackage.afak.a
            return r11
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqv.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aqv) b((crl) obj, (afck) obj2)).hT(afak.a);
    }
}
