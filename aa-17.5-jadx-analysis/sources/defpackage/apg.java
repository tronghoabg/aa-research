package defpackage;

/* loaded from: classes.dex */
final class apg extends afdd implements afeg {
    Object a;
    int b;
    final /* synthetic */ afdr c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apg(afdr afdrVar, afck afckVar) {
        super(afckVar);
        this.c = afdrVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        apg apgVar = new apg(this.c, afckVar);
        apgVar.d = obj;
        return apgVar;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002e -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002b -> B:12:0x002f). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r4) {
        /*
            r3 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r3.b
            if (r1 == 0) goto L10
            java.lang.Object r1 = r3.a
            java.lang.Object r2 = r3.d
            airr r2 = (defpackage.airr) r2
            defpackage.woy.dF(r4)
            goto L2f
        L10:
            defpackage.woy.dF(r4)
            java.lang.Object r4 = r3.d
            airr r4 = (defpackage.airr) r4
            r2 = r4
        L18:
            afdr r4 = r3.c
            java.lang.Object r1 = r4.invoke()
            if (r1 == 0) goto L2e
            r3.d = r2
            r3.a = r1
            r4 = 1
            r3.b = r4
            java.lang.Object r4 = r2.a(r1, r3)
            if (r4 != r0) goto L2f
            return r0
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L32
            goto L18
        L32:
            afak r3 = defpackage.afak.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apg.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((apg) b((airr) obj, (afck) obj2)).hT(afak.a);
    }
}
