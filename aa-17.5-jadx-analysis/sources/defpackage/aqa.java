package defpackage;

/* loaded from: classes.dex */
public final class aqa implements cpt {
    public boolean a;
    private final aqk b;

    public aqa(aqk aqkVar, boolean z) {
        this.b = aqkVar;
        this.a = z;
    }

    @Override // defpackage.cpt
    public final long a(long j, long j2, int i) {
        if (!this.a) {
            return 0L;
        }
        aqk aqkVar = this.b;
        if (aqkVar.a.i()) {
            return 0L;
        }
        return aqkVar.f(aqkVar.a(aqkVar.a.a(aqkVar.a(aqkVar.b(j2)))));
    }

    @Override // defpackage.cpt
    public final /* synthetic */ long b(long j, int i) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cpt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, long r7, defpackage.afck r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r9 instanceof defpackage.apz
            if (r5 == 0) goto L13
            r5 = r9
            apz r5 = (defpackage.apz) r5
            int r6 = r5.d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.d = r6
            goto L18
        L13:
            apz r5 = new apz
            r5.<init>(r4, r9)
        L18:
            java.lang.Object r6 = r5.b
            afcr r9 = defpackage.afcr.a
            int r0 = r5.d
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            long r4 = r5.a
            defpackage.woy.dF(r6)
            r7 = r4
            goto L4c
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            defpackage.woy.dF(r6)
            boolean r6 = r4.a
            r2 = 0
            if (r6 == 0) goto L56
            aqk r4 = r4.b
            boolean r6 = r4.f
            if (r6 == 0) goto L42
            goto L50
        L42:
            r5.a = r7
            r5.d = r1
            java.lang.Object r6 = r4.g(r7, r5)
            if (r6 == r9) goto L55
        L4c:
            dlv r6 = (defpackage.dlv) r6
            long r2 = r6.a
        L50:
            long r2 = defpackage.aclh.y(r7, r2)
            goto L56
        L55:
            return r9
        L56:
            dlv r4 = new dlv
            r4.<init>(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqa.c(long, long, afck):java.lang.Object");
    }

    @Override // defpackage.cpt
    public final /* synthetic */ Object d(long j, afck afckVar) {
        return new dlv(0L);
    }
}
