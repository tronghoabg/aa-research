package defpackage;

/* loaded from: classes2.dex */
public final class gfz extends afde implements afeg {
    long a;
    int b;
    final /* synthetic */ byd c;
    final /* synthetic */ aagd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfz(aagd aagdVar, byd bydVar, afck afckVar) {
        super(2, afckVar);
        this.d = aagdVar;
        this.c = bydVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new gfz(this.d, this.c, afckVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x001d -> B:8:0x001f). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r6) {
        /*
            r5 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto Ld
            long r3 = r5.a
            defpackage.woy.dF(r6)
            goto L1f
        Ld:
            defpackage.woy.dF(r6)
            aagd r6 = r5.d
            int r6 = r6.a
            long r3 = (long) r6
        L15:
            r5.a = r3
            r5.b = r2
            java.lang.Object r6 = defpackage.aiow.c(r3, r5)
            if (r6 == r0) goto L2a
        L1f:
            byd r6 = r5.c
            int r1 = r6.e()
            int r1 = r1 + r2
            r6.h(r1)
            goto L15
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfz.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((gfz) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
