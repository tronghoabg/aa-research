package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ara extends defpackage.afed implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.cqv b;
    final /* synthetic */ defpackage.afgv c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ara(defpackage.cqv cqvVar, defpackage.afgv afgvVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = cqvVar;
        this.c = afgvVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.ara araVar = new defpackage.ara(this.b, this.c, afdkVar);
        araVar.d = obj;
        return araVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[LOOP:0: B:12:0x0031->B:37:0x00ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0072 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Path cross not found for [B:30:0x0087, B:11:0x0028], limit reached: 46 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:19:0x0052
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r12) {
        /*
            r11 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r11.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L13
            java.lang.Object r4 = r11.d
            cru r4 = (defpackage.cru) r4
            defpackage.afga.cz(r12)
            if (r1 == r3) goto L28
            goto L87
        L13:
            defpackage.afga.cz(r12)
            java.lang.Object r12 = r11.d
            cru r12 = (defpackage.cru) r12
        L1a:
            r11.d = r12
            r11.a = r3
            cqv r1 = r11.b
            java.lang.Object r1 = r12.r(r1, r11)
            if (r1 == r0) goto Lc0
            r4 = r12
            r12 = r1
        L28:
            cqu r12 = (defpackage.cqu) r12
            java.util.List r1 = r12.a
            int r5 = r1.size()
            r6 = r2
        L31:
            if (r6 >= r5) goto Lae
            java.lang.Object r7 = r1.get(r6)
            crd r7 = (defpackage.crd) r7
            boolean r7 = defpackage.tq.k(r7)
            if (r7 != 0) goto Lab
            boolean r12 = defpackage.ca.aA(r12)
            if (r12 == 0) goto L4d
            afgv r11 = r11.c
            apc r12 = defpackage.apc.c
            r11.a = r12
            goto Lbd
        L4d:
            int r12 = r1.size()
            r5 = r2
        L52:
            if (r5 >= r12) goto L79
            java.lang.Object r6 = r1.get(r5)
            crd r6 = (defpackage.crd) r6
            boolean r7 = r6.c()
            if (r7 != 0) goto L72
            long r7 = r4.o()
            long r9 = r4.n()
            boolean r6 = defpackage.tq.m(r6, r7, r9)
            if (r6 == 0) goto L6f
            goto L72
        L6f:
            int r5 = r5 + 1
            goto L52
        L72:
            afgv r11 = r11.c
            apa r12 = defpackage.apa.c
            r11.a = r12
            goto Lbd
        L79:
            cqv r12 = defpackage.cqv.c
            r11.d = r4
            r1 = 2
            r11.a = r1
            java.lang.Object r12 = r4.r(r12, r11)
            if (r12 != r0) goto L87
            goto Lc0
        L87:
            cqu r12 = (defpackage.cqu) r12
            java.util.List r12 = r12.a
            int r1 = r12.size()
            r5 = r2
        L90:
            if (r5 >= r1) goto La8
            java.lang.Object r6 = r12.get(r5)
            crd r6 = (defpackage.crd) r6
            boolean r6 = r6.c()
            if (r6 == 0) goto La5
            afgv r11 = r11.c
            apa r12 = defpackage.apa.c
            r11.a = r12
            goto Lbd
        La5:
            int r5 = r5 + 1
            goto L90
        La8:
            r12 = r4
            goto L1a
        Lab:
            int r6 = r6 + 1
            goto L31
        Lae:
            afgv r11 = r11.c
            apb r12 = new apb
            java.lang.Object r0 = r1.get(r2)
            crd r0 = (defpackage.crd) r0
            r12.<init>(r0)
            r11.a = r12
        Lbd:
            afbk r11 = defpackage.afbk.a
            return r11
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ara.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ara) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
