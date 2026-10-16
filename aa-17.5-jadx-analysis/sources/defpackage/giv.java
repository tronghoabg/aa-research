package defpackage;

/* loaded from: classes2.dex */
final class giv extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ long c;
    final /* synthetic */ asf d;
    final /* synthetic */ apl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giv(long j, asf asfVar, apl aplVar, afck afckVar) {
        super(2, afckVar);
        this.c = j;
        this.d = asfVar;
        this.e = aplVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new giv(this.c, this.d, this.e, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r1.b(r7, r6) != r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r6.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L16
            if (r1 == r2) goto L10
            defpackage.woy.dF(r7)
            goto L65
        L10:
            java.lang.Object r1 = r6.a
            defpackage.woy.dF(r7)
            goto L3f
        L16:
            java.lang.Object r1 = r6.a
            defpackage.woy.dF(r7)
            goto L33
        L1c:
            defpackage.woy.dF(r7)
            long r4 = r6.c
            asi r7 = new asi
            r7.<init>(r4)
            asf r1 = r6.d
            r6.a = r7
            r6.b = r3
            java.lang.Object r1 = r1.b(r7, r6)
            if (r1 == r0) goto L68
            r1 = r7
        L33:
            apl r7 = r6.e
            r6.a = r1
            r6.b = r2
            java.lang.Object r7 = r7.o(r6)
            if (r7 == r0) goto L68
        L3f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L4f
            asj r7 = new asj
            asi r1 = (defpackage.asi) r1
            r7.<init>(r1)
            goto L56
        L4f:
            ash r7 = new ash
            asi r1 = (defpackage.asi) r1
            r7.<init>(r1)
        L56:
            asf r1 = r6.d
            r2 = 0
            r6.a = r2
            r2 = 3
            r6.b = r2
            java.lang.Object r6 = r1.b(r7, r6)
            if (r6 != r0) goto L65
            goto L68
        L65:
            afak r6 = defpackage.afak.a
            return r6
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.giv.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((giv) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
