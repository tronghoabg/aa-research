package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class apl extends defpackage.afed implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.afer c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apl(defpackage.afer aferVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.c = aferVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.apl aplVar = new defpackage.apl(this.c, afdkVar);
        aplVar.d = obj;
        return aplVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002e -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002b -> B:12:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r4) {
        /*
            r3 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r3.b
            if (r1 == 0) goto L10
            java.lang.Object r1 = r3.a
            java.lang.Object r2 = r3.d
            aisr r2 = (aisr) r2
            defpackage.afga.cz(r4)
            goto L2f
        L10:
            defpackage.afga.cz(r4)
            java.lang.Object r4 = r3.d
            aisr r4 = (aisr) r4
            r2 = r4
        L18:
            afer r4 = r3.c
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
            afbk r3 = defpackage.afbk.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apl.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.apl) b((aisr) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
