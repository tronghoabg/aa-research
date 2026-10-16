package defpackage;

/* loaded from: classes2.dex */
public final class hgp extends afdd implements afeg {
    int a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgp(afck afckVar, int i) {
        super(afckVar);
        this.c = i;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.c != 0) {
            hgp hgpVar = new hgp(afckVar, 1, null);
            hgpVar.b = obj;
            return hgpVar;
        }
        hgp hgpVar2 = new hgp(afckVar, 0);
        hgpVar2.b = obj;
        return hgpVar2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[LOOP:0: B:12:0x002e->B:14:0x0034, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0023 -> B:11:0x0026). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.c
            r1 = 1
            if (r0 == 0) goto L3e
            afcr r0 = defpackage.afcr.a
            int r2 = r4.a
            if (r2 == 0) goto L13
            java.lang.Object r2 = r4.b
            crl r2 = (defpackage.crl) r2
            defpackage.woy.dF(r5)
            goto L26
        L13:
            defpackage.woy.dF(r5)
            java.lang.Object r5 = r4.b
            crl r5 = (defpackage.crl) r5
            r2 = r5
        L1b:
            r4.b = r2
            r4.a = r1
            java.lang.Object r5 = defpackage.ti.e(r2, r4)
            if (r5 != r0) goto L26
            return r0
        L26:
            cql r5 = (defpackage.cql) r5
            java.util.List r5 = r5.a
            java.util.Iterator r5 = r5.iterator()
        L2e:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L1b
            java.lang.Object r3 = r5.next()
            cqu r3 = (defpackage.cqu) r3
            r3.b()
            goto L2e
        L3e:
            afcr r0 = defpackage.afcr.a
            int r2 = r4.a
            if (r2 == 0) goto L48
            defpackage.woy.dF(r5)
            return r5
        L48:
            defpackage.woy.dF(r5)
            java.lang.Object r5 = r4.b
            crl r5 = (defpackage.crl) r5
            r4.a = r1
            java.lang.Object r4 = defpackage.aqx.h(r5, r4)
            if (r4 != r0) goto L58
            return r0
        L58:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgp.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.c != 0) {
            return ((hgp) b((crl) obj, (afck) obj2)).hT(afak.a);
        }
        return ((hgp) b((crl) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgp(afck afckVar, int i, byte[] bArr) {
        super(afckVar);
        this.c = i;
    }
}
