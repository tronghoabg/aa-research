package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ces {
    public final afec a;
    public boolean c;
    public cer f;
    private cdz i;
    public final AtomicReference b = new AtomicReference(null);
    private final afeg g = new alx(this, 18);
    private final afec h = new cep(this, 0);
    public final byw d = new byw(new cer[16]);
    public final Object e = new Object();
    private long j = -1;

    public ces(afec afecVar) {
        this.a = afecVar;
    }

    public final void a() {
        synchronized (this.e) {
            byw bywVar = this.d;
            Object[] objArr = bywVar.a;
            int i = bywVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                cer cerVar = (cer) objArr[i2];
                cerVar.e().k();
                cerVar.d().k();
                cerVar.i.k();
                cerVar.j.k();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c3  */
    /* JADX WARN: Type inference failed for: r11v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2, types: [cer] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r24, defpackage.afec r25, defpackage.afdr r26) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ces.b(java.lang.Object, afec, afdr):void");
    }

    public final void c() {
        this.i = byx.j(this.g);
    }

    public final void d() {
        cdz cdzVar = this.i;
        if (cdzVar != null) {
            cdzVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0282 A[PHI: r25
  0x0282: PHI (r25v48 boolean) = (r25v47 boolean), (r25v49 boolean) binds: [B:125:0x025a, B:133:0x0280] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0333 A[EDGE_INSN: B:410:0x0333->B:174:0x0333 BREAK  A[LOOP:4: B:157:0x02df->B:170:0x0316], PHI: r10 r25 r29 r30 r34 r35 r36 r37 r41 r42 r45
  0x0333: PHI (r10v24 cer) = (r10v22 cer), (r10v25 cer), (r10v25 cer), (r10v25 cer) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r25v38 boolean) = (r25v36 boolean), (r25v39 boolean), (r25v39 boolean), (r25v42 boolean) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r29v14 int) = (r29v15 int), (r29v19 int), (r29v19 int), (r29v19 int) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r30v2 long) = (r30v3 long), (r30v4 long), (r30v4 long), (r30v4 long) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r34v7 java.util.Set) = (r34v8 java.util.Set), (r34v10 java.util.Set), (r34v10 java.util.Set), (r34v10 java.util.Set) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r35v7 int) = (r35v8 int), (r35v10 int), (r35v10 int), (r35v10 int) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r36v7 java.lang.Object[]) = (r36v8 java.lang.Object[]), (r36v10 java.lang.Object[]), (r36v10 java.lang.Object[]), (r36v10 java.lang.Object[]) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r37v7 int) = (r37v8 int), (r37v10 int), (r37v10 int), (r37v10 int) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r41v4 long[]) = (r41v5 long[]), (r41v7 long[]), (r41v7 long[]), (r41v7 long[]) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r42v2 int) = (r42v3 int), (r42v5 int), (r42v5 int), (r42v5 int) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r45v22 aan) = (r45v23 aan), (r45v25 aan), (r45v25 aan), (r45v25 aan) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0569 A[PHI: r25
  0x0569: PHI (r25v12 boolean) = (r25v11 boolean), (r25v13 boolean) binds: [B:267:0x0541, B:275:0x0567] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05aa A[Catch: all -> 0x06ce, TryCatch #8 {all -> 0x06ce, blocks: (B:46:0x00b5, B:48:0x00bb, B:175:0x0335, B:52:0x00cb, B:54:0x00cf, B:56:0x00d5, B:147:0x02b7, B:148:0x02ba, B:145:0x02b3, B:150:0x02c9, B:152:0x02cf, B:154:0x02d3, B:157:0x02df, B:159:0x02eb, B:161:0x02f7, B:163:0x02fd, B:164:0x0307, B:170:0x0316, B:171:0x0319, B:315:0x05ff, B:317:0x0603, B:319:0x060b, B:321:0x0616, B:323:0x0635, B:325:0x063b, B:328:0x0647, B:330:0x0653, B:332:0x0661, B:334:0x0667, B:336:0x0674, B:337:0x067c, B:338:0x067f, B:344:0x068f, B:350:0x06aa, B:345:0x0692, B:347:0x069c, B:348:0x06a4, B:351:0x06ae, B:182:0x0371, B:184:0x0397, B:185:0x03ab, B:187:0x03b1, B:189:0x03b9, B:193:0x03c5, B:195:0x03c9, B:197:0x03d1, B:290:0x0598, B:291:0x059b, B:288:0x0592, B:294:0x05a2, B:296:0x05aa, B:298:0x05ae, B:301:0x05ba, B:303:0x05c6, B:305:0x05d3, B:307:0x05d9, B:308:0x05e3, B:312:0x05ef, B:313:0x05f2), top: B:391:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05ed A[PHI: r25
  0x05ed: PHI (r25v7 boolean) = (r25v6 boolean), (r25v8 boolean) binds: [B:302:0x05c4, B:310:0x05eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x05fb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ces.e():boolean");
    }
}
