package defpackage;

/* loaded from: classes2.dex */
final class ezt extends afde implements afeg {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    int f;
    int g;
    final /* synthetic */ eyu[] h;
    final /* synthetic */ ezv i;
    final /* synthetic */ faf j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezt(eyu[] eyuVarArr, ezv ezvVar, faf fafVar, afck afckVar) {
        super(2, afckVar);
        this.h = eyuVarArr;
        this.i = ezvVar;
        this.j = fafVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new ezt(this.h, this.i, this.j, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (((defpackage.ezv) r6).d(r5, r4, r10) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (((defpackage.ezv) r6).c(r5, r4, r10) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0084 -> B:26:0x0085). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r10.g
            r2 = 1
            if (r1 == 0) goto L24
            int r3 = r10.f
            if (r1 == r2) goto L16
            int r1 = r10.e
            int r4 = r10.d
            java.lang.Object r5 = r10.c
            java.lang.Object r6 = r10.b
            java.lang.Object r7 = r10.a
            goto L20
        L16:
            int r1 = r10.e
            int r4 = r10.d
            java.lang.Object r5 = r10.c
            java.lang.Object r6 = r10.b
            java.lang.Object r7 = r10.a
        L20:
            defpackage.woy.dF(r11)
            goto L85
        L24:
            defpackage.woy.dF(r11)
            eyu[] r11 = r10.h
            ezv r1 = r10.i
            faf r3 = r10.j
            r4 = 0
            r5 = 7
            r6 = r5
            r5 = r3
            r3 = r6
            r7 = r11
            r6 = r1
            r1 = r4
        L35:
            if (r1 >= r3) goto L87
            r11 = r7
            eyu[] r11 = (defpackage.eyu[]) r11
            r11 = r11[r1]
            int r8 = r4 + 1
            int r11 = r11.ordinal()
            if (r11 == 0) goto L84
            if (r11 == r2) goto L69
            r9 = 2
            if (r11 != r9) goto L63
            r10.a = r7
            r10.b = r6
            r10.c = r5
            r10.d = r8
            r10.e = r1
            r10.f = r3
            r10.g = r9
            int r11 = defpackage.ezv.h
            r11 = r6
            ezv r11 = (defpackage.ezv) r11
            java.lang.Object r11 = r11.d(r5, r4, r10)
            if (r11 == r0) goto L83
            goto L84
        L63:
            aezs r10 = new aezs
            r10.<init>()
            throw r10
        L69:
            r10.a = r7
            r10.b = r6
            r10.c = r5
            r10.d = r8
            r10.e = r1
            r10.f = r3
            r10.g = r2
            int r11 = defpackage.ezv.h
            r11 = r6
            ezv r11 = (defpackage.ezv) r11
            java.lang.Object r11 = r11.c(r5, r4, r10)
            if (r11 == r0) goto L83
            goto L84
        L83:
            return r0
        L84:
            r4 = r8
        L85:
            int r1 = r1 + r2
            goto L35
        L87:
            afak r10 = defpackage.afak.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezt.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ezt) b((faa) obj, (afck) obj2)).hT(afak.a);
    }
}
