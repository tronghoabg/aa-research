package defpackage;

/* loaded from: classes.dex */
public final class ait extends afdd implements afeg {
    int a;
    final /* synthetic */ aiu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ait(aiu aiuVar, afck afckVar) {
        super(afckVar);
        this.b = aiuVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        ait aitVar = new ait(this.b, afckVar);
        aitVar.c = obj;
        return aitVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r12 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r12 != r0) goto L9;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009d -> B:10:0x0034). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L12
            java.lang.Object r4 = r11.c
            crl r4 = (defpackage.crl) r4
            defpackage.woy.dF(r12)
            if (r1 == r3) goto L28
            goto L42
        L12:
            defpackage.woy.dF(r12)
            java.lang.Object r12 = r11.c
            r4 = r12
            crl r4 = (defpackage.crl) r4
            r11.c = r4
            r11.a = r3
            afeh r12 = defpackage.aqx.a
            cqm r12 = defpackage.cqm.b
            java.lang.Object r12 = defpackage.aqx.a(r4, r2, r12, r11)
            if (r12 == r0) goto La7
        L28:
            aiu r1 = r11.b
            cqu r12 = (defpackage.cqu) r12
            long r5 = r12.a
            r1.f = r5
            long r5 = r12.c
            r1.a = r5
        L34:
            r11.c = r4
            r12 = 2
            r11.a = r12
            cqm r12 = defpackage.cqm.b
            java.lang.Object r12 = r4.r(r12, r11)
            if (r12 != r0) goto L42
            goto La7
        L42:
            cql r12 = (defpackage.cql) r12
            java.util.List r12 = r12.a
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r12.size()
            r1.<init>(r3)
            int r3 = r12.size()
            r5 = r2
        L54:
            if (r5 >= r3) goto L67
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            cqu r7 = (defpackage.cqu) r7
            boolean r7 = r7.d
            if (r7 == 0) goto L64
            r1.add(r6)
        L64:
            int r5 = r5 + 1
            goto L54
        L67:
            aiu r12 = r11.b
            int r3 = r1.size()
            r5 = r2
        L6e:
            if (r5 >= r3) goto L83
            java.lang.Object r6 = r1.get(r5)
            r7 = r6
            cqu r7 = (defpackage.cqu) r7
            long r7 = r7.a
            long r9 = r12.f
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L80
            goto L84
        L80:
            int r5 = r5 + 1
            goto L6e
        L83:
            r6 = 0
        L84:
            cqu r6 = (defpackage.cqu) r6
            if (r6 != 0) goto L8f
            java.lang.Object r3 = defpackage.woy.bH(r1)
            r6 = r3
            cqu r6 = (defpackage.cqu) r6
        L8f:
            if (r6 == 0) goto L99
            long r7 = r6.a
            r12.f = r7
            long r5 = r6.c
            r12.a = r5
        L99:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto La0
            goto L34
        La0:
            r0 = -1
            r12.f = r0
            afak r11 = defpackage.afak.a
            return r11
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ait.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ait) b((crl) obj, (afck) obj2)).hT(afak.a);
    }
}
