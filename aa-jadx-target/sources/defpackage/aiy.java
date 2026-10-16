package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aiy extends defpackage.afed implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.aiz b;
    private /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiy(defpackage.aiz aizVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = aizVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aiy aiyVar = new defpackage.aiy(this.b, afdkVar);
        aiyVar.c = obj;
        return aiyVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[LOOP:1: B:20:0x006e->B:24:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[EDGE_INSN: B:41:0x0084->B:26:0x0084 BREAK  A[LOOP:1: B:20:0x006e->B:24:0x0080], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009d -> B:10:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
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
            if (r1 == 0) goto L12
            java.lang.Object r4 = r11.c
            cru r4 = (defpackage.cru) r4
            defpackage.afga.cz(r12)
            if (r1 == r3) goto L28
            goto L42
        L12:
            defpackage.afga.cz(r12)
            java.lang.Object r12 = r11.c
            r4 = r12
            cru r4 = (defpackage.cru) r4
            r11.c = r4
            r11.a = r3
            affh r12 = defpackage.arc.a
            cqv r12 = defpackage.cqv.b
            java.lang.Object r12 = defpackage.arc.a(r4, r2, r12, r11)
            if (r12 == r0) goto La7
        L28:
            aiz r1 = r11.b
            crd r12 = (defpackage.crd) r12
            long r5 = r12.a
            r1.f = r5
            long r5 = r12.c
            r1.a = r5
        L34:
            r11.c = r4
            r12 = 2
            r11.a = r12
            cqv r12 = defpackage.cqv.b
            java.lang.Object r12 = r4.r(r12, r11)
            if (r12 != r0) goto L42
            goto La7
        L42:
            cqu r12 = (defpackage.cqu) r12
            java.util.List r12 = r12.a
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r12.size()
            r1.<init>(r3)
            int r3 = r12.size()
            r5 = r2
        L54:
            if (r5 >= r3) goto L67
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            crd r7 = (defpackage.crd) r7
            boolean r7 = r7.d
            if (r7 == 0) goto L64
            r1.add(r6)
        L64:
            int r5 = r5 + 1
            goto L54
        L67:
            aiz r12 = r11.b
            int r3 = r1.size()
            r5 = r2
        L6e:
            if (r5 >= r3) goto L83
            java.lang.Object r6 = r1.get(r5)
            r7 = r6
            crd r7 = (defpackage.crd) r7
            long r7 = r7.a
            long r9 = r12.f
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L80
            goto L84
        L80:
            int r5 = r5 + 1
            goto L6e
        L83:
            r6 = 0
        L84:
            crd r6 = (defpackage.crd) r6
            if (r6 != 0) goto L8f
            java.lang.Object r3 = defpackage.afga.aB(r1)
            r6 = r3
            crd r6 = (defpackage.crd) r6
        L8f:
            if (r6 == 0) goto L99
            long r7 = r6.a
            r12.f = r7
            long r5 = r6.c
            r12.a = r5
        L99:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto La0
            goto L34
        La0:
            r0 = -1
            r12.f = r0
            afbk r11 = defpackage.afbk.a
            return r11
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiy.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aiy) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
