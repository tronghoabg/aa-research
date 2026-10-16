package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class afn extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.bwx c;
    final /* synthetic */ defpackage.afo d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afn(defpackage.bwx bwxVar, defpackage.afo afoVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.c = bwxVar;
        this.d = afoVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.afn afnVar = new defpackage.afn(this.c, this.d, afdkVar);
        afnVar.e = obj;
        return afnVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f A[PHI: r3 r8
  0x002f: PHI (r3v3 java.lang.Object) = (r3v2 java.lang.Object), (r3v2 java.lang.Object), (r3v4 java.lang.Object) binds: [B:13:0x0050, B:15:0x0074, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r8v1 aiuw) = (r8v0 aiuw), (r8v0 aiuw), (r8v2 aiuw) binds: [B:13:0x0050, B:15:0x0074, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0048 A[PHI: r3 r8
  0x0048: PHI (r3v2 java.lang.Object) = (r3v3 java.lang.Object), (r3v5 java.lang.Object) binds: [B:11:0x0046, B:7:0x0013] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r8v0 aiuw) = (r8v1 aiuw), (r8v3 aiuw) binds: [B:11:0x0046, B:7:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0074 -> B:10:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r11) {
        /*
            r10 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r10.b
            r2 = 1
            if (r1 == 0) goto L1c
            java.lang.Object r3 = r10.a
            if (r1 == r2) goto L13
            java.lang.Object r1 = r10.e
            aiuw r1 = (aiuw) r1
            defpackage.afga.cz(r11)
            goto L2e
        L13:
            java.lang.Object r1 = r10.e
            aiuw r1 = (aiuw) r1
            defpackage.afga.cz(r11)
            r8 = r1
            goto L48
        L1c:
            defpackage.afga.cz(r11)
            java.lang.Object r11 = r10.e
            r1 = r11
            aiuw r1 = (aiuw) r1
            afgs r11 = new afgs
            r11.<init>()
            r3 = 1065353216(0x3f800000, float:1.0)
            r11.a = r3
            r3 = r11
        L2e:
            r8 = r1
        L2f:
            afo r6 = r10.d
            afl r4 = new afl
            r7 = r3
            afgs r7 = (afgs) r7
            bwx r5 = r10.c
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r10.e = r8
            r10.a = r3
            r10.b = r2
            java.lang.Object r11 = defpackage.afw.m(r4, r10)
            if (r11 == r0) goto L76
        L48:
            r11 = r3
            afgs r11 = (afgs) r11
            float r11 = r11.a
            r1 = 0
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 != 0) goto L2f
            nz r11 = new nz
            r1 = 8
            r11.<init>(r8, r1)
            byr r1 = new byr
            r4 = 0
            r1.<init>(r11, r4)
            aiza r11 = new aiza
            r11.<init>(r1)
            afm r1 = new afm
            r1.<init>(r4)
            r10.e = r8
            r10.a = r3
            r4 = 2
            r10.b = r4
            java.lang.Object r11 = afsg.x(r11, r1, r10)
            if (r11 != r0) goto L2f
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afn.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.afn) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
