package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aqr extends defpackage.afed implements defpackage.affg {
    long a;
    int b;
    final /* synthetic */ defpackage.crd c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqr(defpackage.crd crdVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = crdVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aqr aqrVar = new defpackage.aqr(this.c, afdkVar);
        aqrVar.d = obj;
        return aqrVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0041 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0035 -> B:8:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r7) {
        /*
            r6 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r6.b
            if (r1 == 0) goto L10
            long r1 = r6.a
            java.lang.Object r3 = r6.d
            cru r3 = (defpackage.cru) r3
            defpackage.afga.cz(r7)
            goto L37
        L10:
            defpackage.afga.cz(r7)
            java.lang.Object r7 = r6.d
            cru r7 = (defpackage.cru) r7
            crd r1 = r6.c
            dck r2 = r7.q()
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
            affh r4 = defpackage.arc.a
            cqv r4 = defpackage.cqv.b
            java.lang.Object r7 = defpackage.arc.a(r3, r7, r4, r6)
            if (r7 == r0) goto L41
        L37:
            crd r7 = (defpackage.crd) r7
            long r4 = r7.b
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto L40
            goto L26
        L40:
            return r7
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqr.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aqr) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
