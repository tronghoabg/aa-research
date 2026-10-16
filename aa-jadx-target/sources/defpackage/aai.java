package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aai extends defpackage.afed implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    int e;
    int f;
    int g;
    long h;
    int i;
    final /* synthetic */ defpackage.aak j;
    final /* synthetic */ defpackage.aaj k;
    private /* synthetic */ java.lang.Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aai(defpackage.aak aakVar, defpackage.aaj aajVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.j = aakVar;
        this.k = aajVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aai aaiVar = new defpackage.aai(this.j, this.k, afdkVar);
        aaiVar.l = obj;
        return aaiVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x009e  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x004d -> B:11:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006a -> B:18:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0095 -> B:18:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x004b -> B:21:0x00a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            afdr r1 = defpackage.afdr.a
            int r2 = r0.i
            r4 = 1
            r5 = 8
            if (r2 == 0) goto L24
            int r2 = r0.g
            int r6 = r0.f
            long r7 = r0.h
            int r9 = r0.e
            int r10 = r0.d
            java.lang.Object r11 = r0.c
            java.lang.Object r12 = r0.b
            java.lang.Object r13 = r0.a
            java.lang.Object r14 = r0.l
            aisr r14 = (aisr) r14
            defpackage.afga.cz(r22)
            goto L99
        L24:
            defpackage.afga.cz(r22)
            java.lang.Object r2 = r0.l
            aisr r2 = (aisr) r2
            aak r6 = r0.j
            aaj r7 = r0.k
            aaw r8 = r6.a
            long[] r8 = r8.a
            int r9 = r8.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Laa
            r10 = 0
        L39:
            r11 = r8
            long[] r11 = (long[]) r11
            r12 = r11[r10]
            long r14 = ~r12
            r11 = 7
            long r14 = r14 << r11
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r11 == 0) goto La5
            int r11 = r10 - r9
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r14 = r10
            r10 = r9
            r9 = r14
            r14 = r2
            r2 = 0
            r19 = r12
            r12 = r6
            r13 = r7
            r6 = r11
            r11 = r8
            r7 = r19
        L61:
            if (r2 >= r6) goto L9c
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L99
            int r15 = r9 << 3
            int r15 = r15 + r2
            r3 = r13
            aaj r3 = (defpackage.aaj) r3
            r3.a = r15
            r3 = r12
            aak r3 = (defpackage.aak) r3
            aaw r3 = r3.a
            java.lang.Object[] r3 = r3.b
            r3 = r3[r15]
            r0.l = r14
            r0.a = r13
            r0.b = r12
            r0.c = r11
            r0.d = r10
            r0.e = r9
            r0.h = r7
            r0.f = r6
            r0.g = r2
            r0.i = r4
            java.lang.Object r3 = r14.a(r3, r0)
            if (r3 == r1) goto L98
            goto L99
        L98:
            return r1
        L99:
            long r7 = r7 >> r5
            int r2 = r2 + r4
            goto L61
        L9c:
            if (r6 != r5) goto Laa
            r2 = r10
            r10 = r9
            r9 = r2
            r8 = r11
            r6 = r12
            r7 = r13
            r2 = r14
        La5:
            if (r10 == r9) goto Laa
            int r10 = r10 + 1
            goto L39
        Laa:
            afbk r0 = defpackage.afbk.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aai.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aai) b((aisr) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
