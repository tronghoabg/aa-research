package defpackage;

/* loaded from: classes.dex */
final class bkc extends afde implements afeg {
    Object a;
    Object b;
    int c;
    final /* synthetic */ bke d;
    final /* synthetic */ afeg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkc(bke bkeVar, afeg afegVar, afck afckVar) {
        super(2, afckVar);
        this.d = bkeVar;
        this.e = afegVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new bkc(this.d, this.e, afckVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[RETURN] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r9.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L11
            defpackage.woy.dF(r10)
            return r10
        L11:
            java.lang.Object r1 = r9.a
            defpackage.woy.dF(r10)     // Catch: java.lang.Throwable -> L17
            goto L65
        L17:
            r9 = move-exception
            goto L91
        L1a:
            java.lang.Object r1 = r9.b
            java.lang.Object r3 = r9.a
            defpackage.woy.dF(r10)
            r10 = r3
            goto L36
        L23:
            defpackage.woy.dF(r10)
            bke r1 = r9.d
            ajdz r10 = r1.e
            r9.a = r10
            r9.b = r1
            r9.c = r3
            java.lang.Object r3 = r10.b(r9)
            if (r3 == r0) goto L97
        L36:
            r3 = r1
            bke r3 = (defpackage.bke) r3     // Catch: java.lang.Throwable -> L8f
            android.view.textclassifier.TextClassifier r3 = r3.c     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L43
            boolean r5 = defpackage.hg$$ExternalSyntheticApiModelOutline0.m(r3)     // Catch: java.lang.Throwable -> L8f
            if (r5 == 0) goto L6a
        L43:
            long r5 = defpackage.aisq.a     // Catch: java.lang.Throwable -> L8f
            aiss r3 = defpackage.aiss.c     // Catch: java.lang.Throwable -> L8f
            r5 = 300(0x12c, double:1.48E-321)
            long r5 = defpackage.afzc.d(r5, r3)     // Catch: java.lang.Throwable -> L8f
            aiq r3 = new aiq     // Catch: java.lang.Throwable -> L8f
            bke r1 = (defpackage.bke) r1     // Catch: java.lang.Throwable -> L8f
            r7 = 10
            r3.<init>(r1, r4, r7)     // Catch: java.lang.Throwable -> L8f
            r9.a = r10     // Catch: java.lang.Throwable -> L8f
            r9.b = r4     // Catch: java.lang.Throwable -> L8f
            r9.c = r2     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r1 = defpackage.aikc.c(r5, r3, r9)     // Catch: java.lang.Throwable -> L8f
            if (r1 == r0) goto L97
            r8 = r1
            r1 = r10
            r10 = r8
        L65:
            android.view.textclassifier.TextClassifier r3 = defpackage.a$$ExternalSyntheticApiModelOutline0.m11m(r10)     // Catch: java.lang.Throwable -> L17
            r10 = r1
        L6a:
            ajdz r10 = (defpackage.ajdz) r10
            r10.d()
            long r1 = defpackage.aisq.a
            r1 = 200(0xc8, double:9.9E-322)
            aiss r10 = defpackage.aiss.c
            long r1 = defpackage.afzc.d(r1, r10)
            afeg r10 = r9.e
            bkb r5 = new bkb
            r5.<init>(r3, r10, r4)
            r9.a = r4
            r9.b = r4
            r10 = 3
            r9.c = r10
            java.lang.Object r9 = defpackage.aikc.c(r1, r5, r9)
            if (r9 != r0) goto L8e
            goto L97
        L8e:
            return r9
        L8f:
            r9 = move-exception
            r1 = r10
        L91:
            ajdz r1 = (defpackage.ajdz) r1
            r1.d()
            throw r9
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkc.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bkc) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
