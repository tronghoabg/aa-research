package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class blb extends defpackage.afed implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.affc b;
    private /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blb(defpackage.affc affcVar, defpackage.afdk afdkVar, int i) {
        super(afdkVar);
        this.d = i;
        this.b = affcVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        if (this.d != 0) {
            defpackage.blb blbVar = new defpackage.blb(this.b, afdkVar, 1, null);
            blbVar.c = obj;
            return blbVar;
        }
        defpackage.blb blbVar2 = new defpackage.blb(this.b, afdkVar, 0);
        blbVar2.c = obj;
        return blbVar2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0076 -> B:28:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0078
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.d
            r1 = 1
            if (r0 == 0) goto L56
            afdr r0 = defpackage.afdr.a
            int r2 = r6.a
            if (r2 == 0) goto L19
            if (r2 == r1) goto L11
            defpackage.afga.cz(r7)
            goto L4c
        L11:
            java.lang.Object r1 = r6.c
            cru r1 = (defpackage.cru) r1
            defpackage.afga.cz(r7)
            goto L2e
        L19:
            defpackage.afga.cz(r7)
            java.lang.Object r7 = r6.c
            cru r7 = (defpackage.cru) r7
            r6.c = r7
            r6.a = r1
            java.lang.Object r1 = defpackage.asq.M(r7, r6)
            if (r1 != r0) goto L2b
            goto L4b
        L2b:
            r5 = r1
            r1 = r7
            r7 = r5
        L2e:
            crd r7 = (defpackage.crd) r7
            r7.b()
            affc r2 = r6.b
            long r3 = r7.c
            cji r7 = new cji
            r7.<init>(r3)
            r2.invoke(r7)
            r7 = 0
            r6.c = r7
            r7 = 2
            r6.a = r7
            java.lang.Object r7 = defpackage.arc.h(r1, r6)
            if (r7 != r0) goto L4c
        L4b:
            return r0
        L4c:
            crd r7 = (defpackage.crd) r7
            if (r7 == 0) goto L53
            r7.b()
        L53:
            afbk r6 = defpackage.afbk.a
            return r6
        L56:
            afdr r0 = defpackage.afdr.a
            int r2 = r6.a
            if (r2 == 0) goto L64
            java.lang.Object r2 = r6.c
            cru r2 = (defpackage.cru) r2
            defpackage.afga.cz(r7)
            goto L79
        L64:
            defpackage.afga.cz(r7)
            java.lang.Object r7 = r6.c
            cru r7 = (defpackage.cru) r7
            r2 = r7
        L6c:
            cqv r7 = defpackage.cqv.a
            r6.c = r2
            r6.a = r1
            java.lang.Object r7 = r2.r(r7, r6)
            if (r7 != r0) goto L79
            return r0
        L79:
            cqu r7 = (defpackage.cqu) r7
            boolean r7 = defpackage.blc.a(r7)
            r7 = r7 ^ r1
            affc r3 = r6.b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r3.invoke(r7)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blb.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.d != 0) {
            return ((defpackage.blb) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.blb) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blb(defpackage.affc affcVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(afdkVar);
        this.d = i;
        this.b = affcVar;
    }
}
