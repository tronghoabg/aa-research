package defpackage;

/* loaded from: classes.dex */
final class aqj extends afde implements afeg {
    long a;
    int b;
    /* synthetic */ long c;
    final /* synthetic */ aqk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqj(aqk aqkVar, afck afckVar) {
        super(2, afckVar);
        this.d = aqkVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aqj aqjVar = new aqj(this.d, afckVar);
        aqjVar.c = ((dlv) obj).a;
        return aqjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            long r3 = r11.a
            if (r1 == r2) goto L14
            long r0 = r11.c
            defpackage.woy.dF(r12)
            goto L66
        L14:
            long r1 = r11.c
            defpackage.woy.dF(r12)
            goto L4a
        L1a:
            long r3 = r11.c
            defpackage.woy.dF(r12)
            goto L32
        L20:
            defpackage.woy.dF(r12)
            long r4 = r11.c
            aqk r12 = r11.d
            tp r12 = r12.k
            r11.b = r3
            java.lang.Object r12 = r12.e(r4, r11)
            if (r12 == r0) goto L77
            r3 = r4
        L32:
            dlv r12 = (defpackage.dlv) r12
            long r5 = r12.a
            long r5 = defpackage.aclh.y(r3, r5)
            aqk r12 = r11.d
            r11.c = r3
            r11.a = r5
            r11.b = r2
            java.lang.Object r12 = r12.g(r5, r11)
            if (r12 == r0) goto L77
            r1 = r3
            r3 = r5
        L4a:
            dlv r12 = (defpackage.dlv) r12
            long r8 = r12.a
            aqk r12 = r11.d
            tp r5 = r12.k
            long r6 = defpackage.aclh.y(r3, r8)
            r11.c = r1
            r11.a = r8
            r12 = 3
            r11.b = r12
            r10 = r11
            java.lang.Object r12 = r5.d(r6, r8, r10)
            if (r12 == r0) goto L77
            r0 = r1
            r3 = r8
        L66:
            dlv r12 = (defpackage.dlv) r12
            long r11 = r12.a
            long r11 = defpackage.aclh.y(r3, r11)
            long r11 = defpackage.aclh.y(r0, r11)
            dlv r0 = new dlv
            r0.<init>(r11)
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqj.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aqj) b(new dlv(((dlv) obj).a), (afck) obj2)).hT(afak.a);
    }
}
