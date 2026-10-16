package defpackage;

/* loaded from: classes.dex */
final class aqm extends afdd implements afeg {
    long a;
    int b;
    final /* synthetic */ cqu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqm(cqu cquVar, afck afckVar) {
        super(afckVar);
        this.c = cquVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aqm aqmVar = new aqm(this.c, afckVar);
        aqmVar.d = obj;
        return aqmVar;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0035 -> B:8:0x0037). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r7) {
        /*
            r6 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r6.b
            if (r1 == 0) goto L10
            long r1 = r6.a
            java.lang.Object r3 = r6.d
            crl r3 = (defpackage.crl) r3
            defpackage.woy.dF(r7)
            goto L37
        L10:
            defpackage.woy.dF(r7)
            java.lang.Object r7 = r6.d
            crl r7 = (defpackage.crl) r7
            cqu r1 = r6.c
            dcc r2 = r7.q()
            r2.h()
            long r1 = r1.b
            r3 = 40
            long r1 = r1 + r3
            r3 = r7
        L26:
            r6.d = r3
            r6.a = r1
            r7 = 1
            r6.b = r7
            afeh r4 = defpackage.aqx.a
            cqm r4 = defpackage.cqm.b
            java.lang.Object r7 = defpackage.aqx.a(r3, r7, r4, r6)
            if (r7 == r0) goto L41
        L37:
            cqu r7 = (defpackage.cqu) r7
            long r4 = r7.b
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto L40
            goto L26
        L40:
            return r7
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqm.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aqm) b((crl) obj, (afck) obj2)).hT(afak.a);
    }
}
