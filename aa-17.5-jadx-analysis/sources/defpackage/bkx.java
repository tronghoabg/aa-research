package defpackage;

/* loaded from: classes.dex */
public final class bkx extends afdd implements afeg {
    int a;
    final /* synthetic */ afec b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkx(afec afecVar, afck afckVar, int i) {
        super(afckVar);
        this.d = i;
        this.b = afecVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.d != 0) {
            bkx bkxVar = new bkx(this.b, afckVar, 1, null);
            bkxVar.c = obj;
            return bkxVar;
        }
        bkx bkxVar2 = new bkx(this.b, afckVar, 0);
        bkxVar2.c = obj;
        return bkxVar2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0076 -> B:28:0x0079). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.d
            r1 = 1
            if (r0 == 0) goto L56
            afcr r0 = defpackage.afcr.a
            int r2 = r6.a
            if (r2 == 0) goto L19
            if (r2 == r1) goto L11
            defpackage.woy.dF(r7)
            goto L4c
        L11:
            java.lang.Object r1 = r6.c
            crl r1 = (defpackage.crl) r1
            defpackage.woy.dF(r7)
            goto L2e
        L19:
            defpackage.woy.dF(r7)
            java.lang.Object r7 = r6.c
            crl r7 = (defpackage.crl) r7
            r6.c = r7
            r6.a = r1
            java.lang.Object r1 = defpackage.asl.P(r7, r6)
            if (r1 != r0) goto L2b
            goto L4b
        L2b:
            r5 = r1
            r1 = r7
            r7 = r5
        L2e:
            cqu r7 = (defpackage.cqu) r7
            r7.b()
            afec r2 = r6.b
            long r3 = r7.c
            cja r7 = new cja
            r7.<init>(r3)
            r2.invoke(r7)
            r7 = 0
            r6.c = r7
            r7 = 2
            r6.a = r7
            java.lang.Object r7 = defpackage.aqx.h(r1, r6)
            if (r7 != r0) goto L4c
        L4b:
            return r0
        L4c:
            cqu r7 = (defpackage.cqu) r7
            if (r7 == 0) goto L53
            r7.b()
        L53:
            afak r6 = defpackage.afak.a
            return r6
        L56:
            afcr r0 = defpackage.afcr.a
            int r2 = r6.a
            if (r2 == 0) goto L64
            java.lang.Object r2 = r6.c
            crl r2 = (defpackage.crl) r2
            defpackage.woy.dF(r7)
            goto L79
        L64:
            defpackage.woy.dF(r7)
            java.lang.Object r7 = r6.c
            crl r7 = (defpackage.crl) r7
            r2 = r7
        L6c:
            cqm r7 = defpackage.cqm.a
            r6.c = r2
            r6.a = r1
            java.lang.Object r7 = r2.r(r7, r6)
            if (r7 != r0) goto L79
            return r0
        L79:
            cql r7 = (defpackage.cql) r7
            boolean r7 = defpackage.bky.a(r7)
            r7 = r7 ^ r1
            afec r3 = r6.b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r3.invoke(r7)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkx.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((bkx) b((crl) obj, (afck) obj2)).hT(afak.a);
        }
        return ((bkx) b((crl) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkx(afec afecVar, afck afckVar, int i, byte[] bArr) {
        super(afckVar);
        this.d = i;
        this.b = afecVar;
    }
}
