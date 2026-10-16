package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cez {
    public final defpackage.affc a;
    public boolean c;
    public defpackage.cey f;
    private defpackage.ceg i;
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference(null);
    private final defpackage.affg g = new defpackage.amc(this, 18);
    private final defpackage.affc h = new defpackage.chq(this, 1);
    public final defpackage.bzc d = new defpackage.bzc(new defpackage.cey[16]);
    public final java.lang.Object e = new java.lang.Object();
    private long j = -1;

    public cez(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    public final void a() {
        synchronized (this.e) {
            defpackage.bzc bzcVar = this.d;
            java.lang.Object[] objArr = bzcVar.a;
            int i = bzcVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.cey ceyVar = (defpackage.cey) objArr[i2];
                ceyVar.e().k();
                ceyVar.d().k();
                ceyVar.i.k();
                ceyVar.j.k();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x01c4 A[EDGE_INSN: B:186:0x01c4->B:98:0x01c4 BREAK  A[LOOP:1: B:78:0x016a->B:94:0x01ba], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ba A[Catch: all -> 0x01da, LOOP:1: B:78:0x016a->B:94:0x01ba, LOOP_END, TryCatch #14 {all -> 0x01da, blocks: (B:87:0x0198, B:89:0x01a4, B:91:0x01af, B:98:0x01c4, B:94:0x01ba), top: B:174:0x0198 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01c3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2, types: [cey] */
    /* JADX WARN: Type inference failed for: r11v20 */
    public final void b(java.lang.Object obj, defpackage.affc affcVar, defpackage.afer aferVar) {
        ?? r11;
        java.lang.Object obj2;
        defpackage.cey ceyVar;
        defpackage.cey ceyVar2;
        long j;
        java.lang.Throwable th;
        defpackage.cej cfhVar;
        defpackage.cey ceyVar3;
        int i;
        char c;
        int i2;
        defpackage.cez cezVar = this;
        long id = java.lang.Thread.currentThread().getId();
        synchronized (cezVar.e) {
            defpackage.bzc bzcVar = cezVar.d;
            java.lang.Object[] objArr = bzcVar.a;
            int i3 = bzcVar.b;
            int i4 = 0;
            while (true) {
                r11 = 0;
                if (i4 >= i3) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i4];
                if (((defpackage.cey) obj2).a == affcVar) {
                    break;
                } else {
                    i4++;
                }
            }
            ceyVar = (defpackage.cey) obj2;
            if (ceyVar == null) {
                affcVar.getClass();
                defpackage.afgz.g(affcVar, 1);
                ceyVar = new defpackage.cey(affcVar);
                bzcVar.n(ceyVar);
            }
            ceyVar2 = cezVar.f;
            j = cezVar.j;
        }
        if (j != -1 && j != id) {
            defpackage.bxi.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + id + ", name=" + java.lang.Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            synchronized (cezVar.e) {
                try {
                    cezVar.f = ceyVar;
                    cezVar.j = id;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
            defpackage.affc behVar = cezVar.h;
            java.lang.Object obj3 = ceyVar.b;
            defpackage.aal aalVar = ceyVar.g;
            int i5 = ceyVar.c;
            ceyVar.b = obj;
            ceyVar.g = (defpackage.aal) ceyVar.d().a(obj);
            if (ceyVar.c == -1) {
                long jV = defpackage.cer.b().v();
                ceyVar.c = (int) (jV ^ (jV >>> 32));
            }
            defpackage.bvs bvsVar = ceyVar.d;
            defpackage.bzc bzcVarA = defpackage.byp.a();
            try {
                bzcVarA.n(bvsVar);
                if (behVar == null) {
                    aferVar.invoke();
                    j = j;
                } else {
                    defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
                    try {
                        if (cejVar instanceof defpackage.cfh) {
                            try {
                                defpackage.cfh cfhVar2 = (defpackage.cfh) cejVar;
                                try {
                                    if (cfhVar2.n == java.lang.Thread.currentThread().getId()) {
                                        defpackage.affc affcVar2 = cfhVar2.l;
                                        defpackage.affc affcVar3 = cfhVar2.m;
                                        if (affcVar2 != null && behVar != affcVar2) {
                                            try {
                                                try {
                                                    behVar = new defpackage.beh(behVar, affcVar2, 13, r11);
                                                } catch (java.lang.Throwable th3) {
                                                    th = th3;
                                                    defpackage.cfh cfhVar3 = (defpackage.cfh) cejVar;
                                                    cfhVar3.l = affcVar2;
                                                    cfhVar3.m = affcVar3;
                                                    throw th;
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                th = th4;
                                                defpackage.cfh cfhVar4 = (defpackage.cfh) cejVar;
                                                cfhVar4.l = affcVar2;
                                                cfhVar4.m = affcVar3;
                                                throw th;
                                            }
                                        }
                                        cfhVar2.l = behVar;
                                        cfhVar2.m = affcVar3;
                                        aferVar.invoke();
                                        cfhVar2.l = affcVar2;
                                        cfhVar2.m = affcVar3;
                                    }
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    bzcVarA.c(bzcVarA.b - 1);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                            }
                        }
                        j = j;
                        if (cejVar == null || (cejVar instanceof defpackage.ced)) {
                            cfhVar = new defpackage.cfh(cejVar instanceof defpackage.ced ? (defpackage.ced) cejVar : null, behVar, null, true, false);
                        } else {
                            cfhVar = cejVar.b(behVar);
                        }
                        try {
                            defpackage.cej cejVarW = cfhVar.w();
                            try {
                                aferVar.invoke();
                                defpackage.cer.i.k(cejVarW);
                                cfhVar.d();
                            } catch (java.lang.Throwable th7) {
                                try {
                                    defpackage.cer.i.k(cejVarW);
                                    throw th7;
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                    try {
                                        cfhVar.d();
                                        throw th;
                                    } catch (java.lang.Throwable th9) {
                                        th = th9;
                                        bzcVarA.c(bzcVarA.b - 1);
                                        throw th;
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                        }
                    } catch (java.lang.Throwable th11) {
                        th = th11;
                    }
                }
                try {
                    bzcVarA.c(bzcVarA.b - 1);
                    java.lang.Object obj4 = ceyVar.b;
                    obj4.getClass();
                    int i6 = ceyVar.c;
                    defpackage.aal aalVar2 = ceyVar.g;
                    if (aalVar2 != null) {
                        try {
                            long[] jArr = aalVar2.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i7 = 0;
                                ceyVar2 = ceyVar2;
                                while (true) {
                                    long j2 = jArr[i7];
                                    ceyVar3 = ceyVar2;
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i7 != length) {
                                            break;
                                            break;
                                        } else {
                                            i7++;
                                            ceyVar2 = ceyVar3;
                                        }
                                    } else {
                                        int i8 = ~(i7 - length);
                                        int i9 = 0;
                                        while (true) {
                                            int i10 = i8;
                                            i = 8 - (i8 >>> 31);
                                            if (i9 >= i) {
                                                break;
                                            }
                                            if ((j2 & 255) < 128) {
                                                int i11 = (i7 << 3) + i9;
                                                c = '\b';
                                                try {
                                                    java.lang.Object obj5 = aalVar2.b[i11];
                                                    i2 = i9;
                                                    if (aalVar2.c[i11] != i6) {
                                                        ceyVar.b(obj4, obj5);
                                                        aalVar2.f(i11);
                                                    }
                                                } catch (java.lang.Throwable th12) {
                                                    th = th12;
                                                }
                                            } else {
                                                c = '\b';
                                                i2 = i9;
                                            }
                                            j2 >>= c;
                                            i9 = i2 + 1;
                                            i8 = i10;
                                            th = th12;
                                            cezVar = this;
                                            r11 = ceyVar3;
                                            id = j;
                                            synchronized (cezVar.e) {
                                                cezVar.f = r11;
                                                cezVar.j = id;
                                            }
                                            throw th;
                                        }
                                        if (i != 8) {
                                            break;
                                        }
                                        if (i7 != length) {
                                            break;
                                        }
                                        i7++;
                                        ceyVar2 = ceyVar3;
                                    }
                                }
                            } else {
                                ceyVar3 = ceyVar2;
                            }
                        } catch (java.lang.Throwable th13) {
                            th = th13;
                            ceyVar3 = ceyVar2;
                        }
                    } else {
                        ceyVar3 = ceyVar2;
                    }
                    ceyVar.b = obj3;
                    ceyVar.g = aalVar;
                    ceyVar.c = i5;
                    synchronized (this.e) {
                        this.f = ceyVar3;
                        this.j = j;
                    }
                } catch (java.lang.Throwable th14) {
                    th = th14;
                    r11 = ceyVar2;
                }
            } catch (java.lang.Throwable th15) {
                th = th15;
            }
        } catch (java.lang.Throwable th16) {
            th = th16;
            r11 = ceyVar2;
            id = j;
        }
    }

    public final void c() {
        this.i = defpackage.bzd.i(this.g);
    }

    public final void d() {
        defpackage.ceg cegVar = this.i;
        if (cegVar != null) {
            cegVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:134:0x0282 A[DONT_INVERT, PHI: r25
  0x0282: PHI (r25v48 boolean) = (r25v47 boolean), (r25v49 boolean) binds: [B:125:0x025a, B:133:0x0280] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x0284 A[Catch: all -> 0x0298, LOOP:10: B:124:0x0250->B:135:0x0284, LOOP_END, TryCatch #4 {all -> 0x0298, blocks: (B:91:0x017f, B:93:0x0189, B:105:0x01d7, B:99:0x019b, B:100:0x01a6, B:102:0x01bb, B:111:0x0200, B:112:0x0212, B:114:0x022c, B:115:0x022e, B:117:0x023a, B:119:0x0240, B:121:0x0244, B:124:0x0250, B:126:0x025c, B:128:0x0268, B:130:0x026e, B:131:0x0278, B:135:0x0284, B:136:0x0287, B:137:0x0290), top: B:383:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:143:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:174:0x0333 A[PHI: r10 r25 r29 r30 r34 r35 r36 r37 r41 r42 r45
  0x0333: PHI (r10v26 cey) = (r10v24 cey), (r10v27 cey), (r10v27 cey), (r10v27 cey) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r25v38 boolean) = (r25v36 boolean), (r25v39 boolean), (r25v39 boolean), (r25v42 boolean) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r29v14 int) = (r29v15 int), (r29v19 int), (r29v19 int), (r29v19 int) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r30v2 long) = (r30v3 long), (r30v4 long), (r30v4 long), (r30v4 long) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r34v7 java.util.Set) = (r34v8 java.util.Set), (r34v10 java.util.Set), (r34v10 java.util.Set), (r34v10 java.util.Set) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r35v7 int) = (r35v8 int), (r35v10 int), (r35v10 int), (r35v10 int) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r36v7 java.lang.Object[]) = (r36v8 java.lang.Object[]), (r36v10 java.lang.Object[]), (r36v10 java.lang.Object[]), (r36v10 java.lang.Object[]) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r37v7 int) = (r37v8 int), (r37v10 int), (r37v10 int), (r37v10 int) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r41v4 long[]) = (r41v5 long[]), (r41v7 long[]), (r41v7 long[]), (r41v7 long[]) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r42v2 int) = (r42v3 int), (r42v5 int), (r42v5 int), (r42v5 int) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]
  0x0333: PHI (r45v22 aau) = (r45v23 aau), (r45v25 aau), (r45v25 aau), (r45v25 aau) binds: [B:173:0x0325, B:151:0x02cd, B:155:0x02dc, B:410:0x0333] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:276:0x0569 A[DONT_INVERT, PHI: r25
  0x0569: PHI (r25v12 boolean) = (r25v11 boolean), (r25v13 boolean) binds: [B:267:0x0541, B:275:0x0567] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:277:0x056b A[Catch: all -> 0x057d, LOOP:22: B:266:0x0537->B:277:0x056b, LOOP_END, TryCatch #7 {all -> 0x057d, blocks: (B:232:0x0471, B:234:0x047b, B:247:0x04c5, B:240:0x048f, B:241:0x0498, B:243:0x04a9, B:253:0x04f2, B:254:0x0501, B:256:0x0513, B:257:0x0515, B:259:0x0521, B:261:0x0527, B:263:0x052b, B:266:0x0537, B:268:0x0543, B:270:0x054f, B:272:0x0555, B:273:0x055f, B:277:0x056b, B:278:0x056e, B:279:0x0575), top: B:389:0x0471 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x0585  */
    /* JADX WARN: Code duplicated, block: B:311:0x05ed A[DONT_INVERT, PHI: r25
  0x05ed: PHI (r25v7 boolean) = (r25v6 boolean), (r25v8 boolean) binds: [B:302:0x05c4, B:310:0x05eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:312:0x05ef A[Catch: all -> 0x06ce, LOOP:16: B:301:0x05ba->B:312:0x05ef, LOOP_END, TryCatch #8 {all -> 0x06ce, blocks: (B:46:0x00b5, B:48:0x00bb, B:175:0x0335, B:52:0x00cb, B:54:0x00cf, B:56:0x00d5, B:147:0x02b7, B:148:0x02ba, B:145:0x02b3, B:150:0x02c9, B:152:0x02cf, B:154:0x02d3, B:157:0x02df, B:159:0x02eb, B:161:0x02f7, B:163:0x02fd, B:164:0x0307, B:170:0x0316, B:171:0x0319, B:315:0x05ff, B:317:0x0603, B:319:0x060b, B:321:0x0616, B:323:0x0635, B:325:0x063b, B:328:0x0647, B:330:0x0653, B:332:0x0661, B:334:0x0667, B:336:0x0674, B:337:0x067c, B:338:0x067f, B:344:0x068f, B:350:0x06aa, B:345:0x0692, B:347:0x069c, B:348:0x06a4, B:351:0x06ae, B:182:0x0371, B:184:0x0397, B:185:0x03ab, B:187:0x03b1, B:189:0x03b9, B:193:0x03c5, B:195:0x03c9, B:197:0x03d1, B:290:0x0598, B:291:0x059b, B:288:0x0592, B:294:0x05a2, B:296:0x05aa, B:298:0x05ae, B:301:0x05ba, B:303:0x05c6, B:305:0x05d3, B:307:0x05d9, B:308:0x05e3, B:312:0x05ef, B:313:0x05f2), top: B:391:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:349:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:426:0x02b0 A[EDGE_INSN: B:426:0x02b0->B:144:0x02b0 BREAK  A[LOOP:10: B:124:0x0250->B:135:0x0284], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x05fb A[EDGE_INSN: B:449:0x05fb->B:314:0x05fb BREAK  A[LOOP:16: B:301:0x05ba->B:312:0x05ef], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x058d A[EDGE_INSN: B:465:0x058d->B:286:0x058d BREAK  A[LOOP:22: B:266:0x0537->B:277:0x056b], SYNTHETIC] */
    public final boolean e() throws java.lang.Throwable {
        boolean z;
        java.lang.Object obj;
        boolean z2;
        int i;
        java.util.Set set;
        java.lang.Object[] objArr;
        int i2;
        boolean z3;
        java.util.Iterator it;
        java.lang.Object obj2;
        defpackage.cey ceyVar;
        boolean z4;
        java.lang.Object[] objArr2;
        java.util.Iterator it2;
        defpackage.aau aauVar;
        long j;
        java.lang.Object[] objArr3;
        defpackage.cey ceyVar2;
        char c;
        long[] jArr;
        defpackage.aau aauVar2;
        long[] jArr2;
        int i3;
        long j2;
        int i4;
        defpackage.aau aauVar3;
        int i5;
        long[] jArr3;
        int i6;
        java.lang.Object[] objArr4;
        int i7;
        java.util.Set set2;
        int i8;
        defpackage.cey ceyVar3;
        boolean z5;
        long j3;
        int i9;
        int i10;
        defpackage.cey ceyVar4;
        defpackage.aau aauVar4;
        long[] jArr4;
        int i11;
        long[] jArr5;
        java.util.Set set3;
        this = this;
        synchronized (this.e) {
            z = this.c;
        }
        int i12 = 0;
        if (z) {
            return false;
        }
        boolean z6 = false;
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
            java.lang.Object obj3 = atomicReference.get();
            java.util.Set set4 = null;
            objSubList = null;
            java.lang.Object objSubList = null;
            if (obj3 != null) {
                if (obj3 instanceof java.util.Set) {
                    set3 = (java.util.Set) obj3;
                } else {
                    if (!(obj3 instanceof java.util.List)) {
                        defpackage.bvg.a("Unexpected notification");
                        throw new defpackage.afap();
                    }
                    java.util.List list = (java.util.List) obj3;
                    java.util.Set set5 = (java.util.Set) list.get(i12);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set3 = set5;
                }
                if (defpackage.a.g(atomicReference, obj3, objSubList)) {
                    set4 = set3;
                }
            }
            if (set4 == null) {
                return z6;
            }
            java.lang.Object obj4 = this.e;
            synchronized (obj4) {
                try {
                    defpackage.bzc bzcVar = this.d;
                    java.lang.Object[] objArr5 = bzcVar.a;
                    int i13 = bzcVar.b;
                    int i14 = i12;
                    while (i14 < i13) {
                        defpackage.cey ceyVar5 = (defpackage.cey) objArr5[i14];
                        defpackage.aau aauVar5 = ceyVar5.i;
                        defpackage.aau aauVar6 = ceyVar5.j;
                        defpackage.aau aauVarE = ceyVar5.e();
                        defpackage.aaw aawVar = ceyVar5.h;
                        if (set4 instanceof defpackage.bzf) {
                            defpackage.aaw aawVar2 = ((defpackage.bzf) set4).a;
                            int i15 = 8;
                            java.lang.Object[] objArr6 = aawVar2.b;
                            long[] jArr6 = aawVar2.a;
                            int length = jArr6.length - 2;
                            if (length >= 0) {
                                int i16 = 0;
                                z3 = false;
                                while (true) {
                                    long j4 = jArr6[i16];
                                    z2 = z6;
                                    obj = obj4;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                                        int i18 = 0;
                                        while (i18 < i17) {
                                            if ((j4 & 255) < 128) {
                                                j2 = j4;
                                                try {
                                                    java.lang.Object obj5 = objArr6[(i16 << 3) + i18];
                                                    if (obj5 instanceof defpackage.cfd) {
                                                        i4 = i18;
                                                        if (!((defpackage.cfd) obj5).j(2)) {
                                                        }
                                                        j4 = j2 >> i8;
                                                        i18 = i4 + 1;
                                                        i15 = i8;
                                                        set4 = set2;
                                                        i13 = i7;
                                                        objArr5 = objArr4;
                                                        i14 = i6;
                                                        jArr6 = jArr3;
                                                        i16 = i5;
                                                        aauVar5 = aauVar3;
                                                    } else {
                                                        i4 = i18;
                                                    }
                                                    if (ceyVar5.e || !defpackage.aau.f(aauVar5, obj5)) {
                                                        i7 = i13;
                                                        set2 = set4;
                                                        i5 = i16;
                                                        objArr4 = objArr5;
                                                        i6 = i14;
                                                        aauVar3 = aauVar5;
                                                        jArr3 = jArr6;
                                                    } else {
                                                        ceyVar5.e = true;
                                                        try {
                                                            java.lang.Object objA = aauVar5.a(obj5);
                                                            if (objA != null) {
                                                                try {
                                                                    if (objA instanceof defpackage.aaw) {
                                                                        defpackage.aaw aawVar3 = (defpackage.aaw) objA;
                                                                        java.lang.Object[] objArr7 = aawVar3.b;
                                                                        long[] jArr7 = aawVar3.a;
                                                                        int length2 = jArr7.length - 2;
                                                                        if (length2 >= 0) {
                                                                            i7 = i13;
                                                                            set2 = set4;
                                                                            int i19 = 0;
                                                                            while (true) {
                                                                                long j5 = jArr7[i19];
                                                                                objArr4 = objArr5;
                                                                                i6 = i14;
                                                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                    int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                                                    int i21 = 0;
                                                                                    while (i21 < i20) {
                                                                                        if ((j5 & 255) < 128) {
                                                                                            j3 = j5;
                                                                                            defpackage.bvr bvrVar = (defpackage.bvr) objArr7[(i19 << 3) + i21];
                                                                                            bvrVar.getClass();
                                                                                            java.lang.Object objA2 = aauVar6.a(bvrVar);
                                                                                            i10 = i21;
                                                                                            defpackage.byo byoVar = bvrVar.b;
                                                                                            if (byoVar == null) {
                                                                                                byoVar = defpackage.bxv.c;
                                                                                            }
                                                                                            jArr4 = jArr6;
                                                                                            if (byoVar.a(bvrVar.e().e, objA2)) {
                                                                                                i9 = i16;
                                                                                                ceyVar4 = ceyVar5;
                                                                                                aauVar4 = aauVar5;
                                                                                                ceyVar4.a().n(bvrVar);
                                                                                            } else {
                                                                                                java.lang.Object objA3 = aauVarE.a(bvrVar);
                                                                                                if (objA3 == null) {
                                                                                                    i9 = i16;
                                                                                                    ceyVar4 = ceyVar5;
                                                                                                    aauVar4 = aauVar5;
                                                                                                } else if (objA3 instanceof defpackage.aaw) {
                                                                                                    defpackage.aaw aawVar4 = (defpackage.aaw) objA3;
                                                                                                    java.lang.Object[] objArr8 = aawVar4.b;
                                                                                                    long[] jArr8 = aawVar4.a;
                                                                                                    int length3 = jArr8.length - 2;
                                                                                                    if (length3 >= 0) {
                                                                                                        i9 = i16;
                                                                                                        int i22 = 0;
                                                                                                        while (true) {
                                                                                                            long j6 = jArr8[i22];
                                                                                                            ceyVar4 = ceyVar5;
                                                                                                            aauVar4 = aauVar5;
                                                                                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                                                int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                                                                                                int i24 = 0;
                                                                                                                while (i24 < i23) {
                                                                                                                    if ((j6 & 255) < 128) {
                                                                                                                        try {
                                                                                                                            aawVar.j(objArr8[(i22 << 3) + i24]);
                                                                                                                            z3 = true;
                                                                                                                        } catch (java.lang.Throwable th) {
                                                                                                                            th = th;
                                                                                                                            ceyVar5 = ceyVar4;
                                                                                                                            ceyVar5.e = false;
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    j6 >>= i15;
                                                                                                                    i24++;
                                                                                                                    jArr8 = jArr8;
                                                                                                                }
                                                                                                                jArr5 = jArr8;
                                                                                                                i11 = i15;
                                                                                                                if (i23 == i11) {
                                                                                                                    break;
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                            jArr5 = jArr8;
                                                                                                            if (i22 != length3) {
                                                                                                                i22++;
                                                                                                                ceyVar5 = ceyVar4;
                                                                                                                aauVar5 = aauVar4;
                                                                                                                jArr8 = jArr5;
                                                                                                                i15 = 8;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        i9 = i16;
                                                                                                        ceyVar4 = ceyVar5;
                                                                                                        aauVar4 = aauVar5;
                                                                                                    }
                                                                                                } else {
                                                                                                    i9 = i16;
                                                                                                    ceyVar4 = ceyVar5;
                                                                                                    aauVar4 = aauVar5;
                                                                                                    aawVar.j(objA3);
                                                                                                    i11 = 8;
                                                                                                    z3 = true;
                                                                                                }
                                                                                                i21 = i10 + 1;
                                                                                                i15 = i11;
                                                                                                j5 = j3 >> i11;
                                                                                                jArr6 = jArr4;
                                                                                                i16 = i9;
                                                                                                ceyVar5 = ceyVar4;
                                                                                                aauVar5 = aauVar4;
                                                                                            }
                                                                                        } else {
                                                                                            j3 = j5;
                                                                                            i9 = i16;
                                                                                            i10 = i21;
                                                                                            ceyVar4 = ceyVar5;
                                                                                            aauVar4 = aauVar5;
                                                                                            jArr4 = jArr6;
                                                                                        }
                                                                                        i11 = 8;
                                                                                        i21 = i10 + 1;
                                                                                        i15 = i11;
                                                                                        j5 = j3 >> i11;
                                                                                        jArr6 = jArr4;
                                                                                        i16 = i9;
                                                                                        ceyVar5 = ceyVar4;
                                                                                        aauVar5 = aauVar4;
                                                                                    }
                                                                                    i5 = i16;
                                                                                    ceyVar3 = ceyVar5;
                                                                                    aauVar3 = aauVar5;
                                                                                    jArr3 = jArr6;
                                                                                    if (i20 == i15) {
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                i5 = i16;
                                                                                ceyVar3 = ceyVar5;
                                                                                aauVar3 = aauVar5;
                                                                                jArr3 = jArr6;
                                                                                if (i19 == length2) {
                                                                                    break;
                                                                                }
                                                                                i19++;
                                                                                objArr5 = objArr4;
                                                                                i14 = i6;
                                                                                jArr6 = jArr3;
                                                                                i16 = i5;
                                                                                ceyVar5 = ceyVar3;
                                                                                aauVar5 = aauVar3;
                                                                                i15 = 8;
                                                                            }
                                                                        } else {
                                                                            i7 = i13;
                                                                            set2 = set4;
                                                                            i5 = i16;
                                                                            objArr4 = objArr5;
                                                                            i6 = i14;
                                                                            ceyVar3 = ceyVar5;
                                                                            aauVar3 = aauVar5;
                                                                            jArr3 = jArr6;
                                                                        }
                                                                    } else {
                                                                        i7 = i13;
                                                                        set2 = set4;
                                                                        i5 = i16;
                                                                        objArr4 = objArr5;
                                                                        i6 = i14;
                                                                        ceyVar3 = ceyVar5;
                                                                        aauVar3 = aauVar5;
                                                                        jArr3 = jArr6;
                                                                        defpackage.bvr bvrVar2 = (defpackage.bvr) objA;
                                                                        java.lang.Object objA4 = aauVar6.a(bvrVar2);
                                                                        defpackage.byo byoVar2 = bvrVar2.b;
                                                                        if (byoVar2 == null) {
                                                                            byoVar2 = defpackage.bxv.c;
                                                                        }
                                                                        if (byoVar2.a(bvrVar2.e().e, objA4)) {
                                                                            ceyVar3.a().n(bvrVar2);
                                                                        } else {
                                                                            java.lang.Object objA5 = aauVarE.a(bvrVar2);
                                                                            if (objA5 == null) {
                                                                                break;
                                                                            }
                                                                            if (objA5 instanceof defpackage.aaw) {
                                                                                defpackage.aaw aawVar5 = (defpackage.aaw) objA5;
                                                                                java.lang.Object[] objArr9 = aawVar5.b;
                                                                                long[] jArr9 = aawVar5.a;
                                                                                int length4 = jArr9.length - 2;
                                                                                if (length4 >= 0) {
                                                                                    int i25 = 0;
                                                                                    while (true) {
                                                                                        long j7 = jArr9[i25];
                                                                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                            if (i25 != length4) {
                                                                                                break;
                                                                                                break;
                                                                                            }
                                                                                            i25++;
                                                                                        } else {
                                                                                            int i26 = 8 - ((~(i25 - length4)) >>> 31);
                                                                                            for (int i27 = 0; i27 < i26; i27++) {
                                                                                                if ((j7 & 255) < 128) {
                                                                                                    aawVar.j(objArr9[(i25 << 3) + i27]);
                                                                                                    z3 = true;
                                                                                                }
                                                                                                j7 >>= 8;
                                                                                            }
                                                                                            if (i26 != 8) {
                                                                                                break;
                                                                                            }
                                                                                            if (i25 != length4) {
                                                                                                break;
                                                                                            }
                                                                                            i25++;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                aawVar.j(objA5);
                                                                                ceyVar5 = ceyVar3;
                                                                                z5 = false;
                                                                                z3 = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    ceyVar5 = ceyVar3;
                                                                    z5 = false;
                                                                } catch (java.lang.Throwable th2) {
                                                                    th = th2;
                                                                }
                                                            } else {
                                                                i7 = i13;
                                                                set2 = set4;
                                                                i5 = i16;
                                                                objArr4 = objArr5;
                                                                i6 = i14;
                                                                ceyVar3 = ceyVar5;
                                                                aauVar3 = aauVar5;
                                                                jArr3 = jArr6;
                                                                ceyVar5 = ceyVar3;
                                                                z5 = false;
                                                            }
                                                            ceyVar5.e = z5;
                                                        } catch (java.lang.Throwable th3) {
                                                            th = th3;
                                                        }
                                                    }
                                                    java.lang.Object objA6 = aauVarE.a(obj5);
                                                    if (objA6 == null) {
                                                        i8 = 8;
                                                        break;
                                                    }
                                                    if (objA6 instanceof defpackage.aaw) {
                                                        defpackage.aaw aawVar6 = (defpackage.aaw) objA6;
                                                        java.lang.Object[] objArr10 = aawVar6.b;
                                                        long[] jArr10 = aawVar6.a;
                                                        int length5 = jArr10.length - 2;
                                                        if (length5 < 0) {
                                                            i8 = 8;
                                                            break;
                                                            break;
                                                        }
                                                        int i28 = 0;
                                                        while (true) {
                                                            long j8 = jArr10[i28];
                                                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i29 = 8 - ((~(i28 - length5)) >>> 31);
                                                                for (int i30 = 0; i30 < i29; i30++) {
                                                                    if ((j8 & 255) < 128) {
                                                                        aawVar.j(objArr10[(i28 << 3) + i30]);
                                                                        z3 = true;
                                                                    }
                                                                    j8 >>= 8;
                                                                }
                                                                if (i29 != 8) {
                                                                    i8 = 8;
                                                                    break;
                                                                }
                                                            }
                                                            if (i28 == length5) {
                                                                i8 = 8;
                                                                break;
                                                                break;
                                                            }
                                                            i28++;
                                                        }
                                                    } else {
                                                        aawVar.j(objA6);
                                                        i8 = 8;
                                                        z3 = true;
                                                    }
                                                    j4 = j2 >> i8;
                                                    i18 = i4 + 1;
                                                    i15 = i8;
                                                    set4 = set2;
                                                    i13 = i7;
                                                    objArr5 = objArr4;
                                                    i14 = i6;
                                                    jArr6 = jArr3;
                                                    i16 = i5;
                                                    aauVar5 = aauVar3;
                                                } catch (java.lang.Throwable th4) {
                                                    th = th4;
                                                    throw th;
                                                }
                                            } else {
                                                j2 = j4;
                                                i4 = i18;
                                            }
                                            i7 = i13;
                                            set2 = set4;
                                            i5 = i16;
                                            objArr4 = objArr5;
                                            i6 = i14;
                                            aauVar3 = aauVar5;
                                            jArr3 = jArr6;
                                            i8 = 8;
                                            break;
                                            j4 = j2 >> i8;
                                            i18 = i4 + 1;
                                            i15 = i8;
                                            set4 = set2;
                                            i13 = i7;
                                            objArr5 = objArr4;
                                            i14 = i6;
                                            jArr6 = jArr3;
                                            i16 = i5;
                                            aauVar5 = aauVar3;
                                        }
                                        i = i13;
                                        set = set4;
                                        int i31 = i16;
                                        objArr = objArr5;
                                        i2 = i14;
                                        aauVar2 = aauVar5;
                                        jArr2 = jArr6;
                                        if (i17 != i15) {
                                            break;
                                        }
                                        i3 = i31;
                                    } else {
                                        i = i13;
                                        set = set4;
                                        objArr = objArr5;
                                        i2 = i14;
                                        aauVar2 = aauVar5;
                                        jArr2 = jArr6;
                                        i3 = i16;
                                    }
                                    if (i3 == length) {
                                        break;
                                    }
                                    i16 = i3 + 1;
                                    obj4 = obj;
                                    z6 = z2;
                                    set4 = set;
                                    i13 = i;
                                    objArr5 = objArr;
                                    i14 = i2;
                                    jArr6 = jArr2;
                                    aauVar5 = aauVar2;
                                    i15 = 8;
                                }
                            } else {
                                z2 = z6;
                                obj = obj4;
                                i = i13;
                                set = set4;
                                objArr = objArr5;
                                i2 = i14;
                                z3 = false;
                            }
                        } else {
                            z2 = z6;
                            obj = obj4;
                            i = i13;
                            set = set4;
                            objArr = objArr5;
                            i2 = i14;
                            defpackage.aau aauVar7 = aauVar5;
                            java.util.Iterator it3 = set.iterator();
                            z3 = false;
                            while (it3.hasNext()) {
                                java.lang.Object next = it3.next();
                                if (!(next instanceof defpackage.cfd) || ((defpackage.cfd) next).j(2)) {
                                    if (ceyVar5.e) {
                                        it = it3;
                                        obj2 = next;
                                    } else {
                                        defpackage.aau aauVar8 = aauVar7;
                                        if (defpackage.aau.f(aauVar8, next)) {
                                            ceyVar5.e = true;
                                            try {
                                                java.lang.Object objA7 = aauVar8.a(next);
                                                if (objA7 != null) {
                                                    try {
                                                        if (objA7 instanceof defpackage.aaw) {
                                                            defpackage.aaw aawVar7 = (defpackage.aaw) objA7;
                                                            java.lang.Object[] objArr11 = aawVar7.b;
                                                            long[] jArr11 = aawVar7.a;
                                                            int length6 = jArr11.length - 2;
                                                            if (length6 >= 0) {
                                                                int i32 = 0;
                                                                while (true) {
                                                                    long j9 = jArr11[i32];
                                                                    long[] jArr12 = jArr11;
                                                                    java.lang.Object[] objArr12 = objArr11;
                                                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i33 = 8 - ((~(i32 - length6)) >>> 31);
                                                                        int i34 = 0;
                                                                        while (i34 < i33) {
                                                                            if ((j9 & 255) < 128) {
                                                                                defpackage.bvr bvrVar3 = (defpackage.bvr) objArr12[(i32 << 3) + i34];
                                                                                bvrVar3.getClass();
                                                                                it2 = it3;
                                                                                java.lang.Object objA8 = aauVar6.a(bvrVar3);
                                                                                aauVar = aauVar8;
                                                                                defpackage.byo byoVar3 = bvrVar3.b;
                                                                                if (byoVar3 == null) {
                                                                                    byoVar3 = defpackage.bxv.c;
                                                                                }
                                                                                j = j9;
                                                                                if (byoVar3.a(bvrVar3.e().e, objA8)) {
                                                                                    next = next;
                                                                                    objArr3 = objArr12;
                                                                                    ceyVar2 = ceyVar5;
                                                                                    ceyVar2.a().n(bvrVar3);
                                                                                } else {
                                                                                    java.lang.Object objA9 = aauVarE.a(bvrVar3);
                                                                                    if (objA9 != null) {
                                                                                        if (objA9 instanceof defpackage.aaw) {
                                                                                            defpackage.aaw aawVar8 = (defpackage.aaw) objA9;
                                                                                            java.lang.Object[] objArr13 = aawVar8.b;
                                                                                            long[] jArr13 = aawVar8.a;
                                                                                            int length7 = jArr13.length - 2;
                                                                                            if (length7 >= 0) {
                                                                                                next = next;
                                                                                                int i35 = 0;
                                                                                                while (true) {
                                                                                                    long j10 = jArr13[i35];
                                                                                                    objArr3 = objArr12;
                                                                                                    ceyVar2 = ceyVar5;
                                                                                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                                        int i36 = 8 - ((~(i35 - length7)) >>> 31);
                                                                                                        int i37 = 0;
                                                                                                        while (i37 < i36) {
                                                                                                            if ((j10 & 255) < 128) {
                                                                                                                try {
                                                                                                                    aawVar.j(objArr13[(i35 << 3) + i37]);
                                                                                                                    z3 = true;
                                                                                                                } catch (java.lang.Throwable th5) {
                                                                                                                    th = th5;
                                                                                                                    ceyVar5 = ceyVar2;
                                                                                                                    ceyVar5.e = false;
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            }
                                                                                                            j10 >>= 8;
                                                                                                            i37++;
                                                                                                            jArr13 = jArr13;
                                                                                                        }
                                                                                                        jArr = jArr13;
                                                                                                        if (i36 != 8) {
                                                                                                            c = '\b';
                                                                                                            break;
                                                                                                        }
                                                                                                    } else {
                                                                                                        jArr = jArr13;
                                                                                                    }
                                                                                                    if (i35 != length7) {
                                                                                                        i35++;
                                                                                                        objArr12 = objArr3;
                                                                                                        jArr13 = jArr;
                                                                                                        ceyVar5 = ceyVar2;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            next = next;
                                                                                            objArr3 = objArr12;
                                                                                            ceyVar2 = ceyVar5;
                                                                                            aawVar.j(objA9);
                                                                                            c = '\b';
                                                                                            z3 = true;
                                                                                        }
                                                                                        i34++;
                                                                                        j9 = j >> c;
                                                                                        it3 = it2;
                                                                                        next = next;
                                                                                        objArr12 = objArr3;
                                                                                        ceyVar5 = ceyVar2;
                                                                                        aauVar8 = aauVar;
                                                                                    }
                                                                                }
                                                                                c = '\b';
                                                                                i34++;
                                                                                j9 = j >> c;
                                                                                it3 = it2;
                                                                                next = next;
                                                                                objArr12 = objArr3;
                                                                                ceyVar5 = ceyVar2;
                                                                                aauVar8 = aauVar;
                                                                            } else {
                                                                                it2 = it3;
                                                                                aauVar = aauVar8;
                                                                                j = j9;
                                                                            }
                                                                            objArr3 = objArr12;
                                                                            ceyVar2 = ceyVar5;
                                                                            c = '\b';
                                                                            i34++;
                                                                            j9 = j >> c;
                                                                            it3 = it2;
                                                                            next = next;
                                                                            objArr12 = objArr3;
                                                                            ceyVar5 = ceyVar2;
                                                                            aauVar8 = aauVar;
                                                                        }
                                                                        it = it3;
                                                                        obj2 = next;
                                                                        aauVar7 = aauVar8;
                                                                        objArr2 = objArr12;
                                                                        ceyVar = ceyVar5;
                                                                        if (i33 == 8) {
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    it = it3;
                                                                    obj2 = next;
                                                                    aauVar7 = aauVar8;
                                                                    objArr2 = objArr12;
                                                                    ceyVar = ceyVar5;
                                                                    if (i32 == length6) {
                                                                        break;
                                                                    }
                                                                    i32++;
                                                                    jArr11 = jArr12;
                                                                    it3 = it;
                                                                    next = obj2;
                                                                    objArr11 = objArr2;
                                                                    ceyVar5 = ceyVar;
                                                                    aauVar8 = aauVar7;
                                                                }
                                                            } else {
                                                                it = it3;
                                                                obj2 = next;
                                                                aauVar7 = aauVar8;
                                                                ceyVar = ceyVar5;
                                                            }
                                                        } else {
                                                            it = it3;
                                                            obj2 = next;
                                                            aauVar7 = aauVar8;
                                                            ceyVar = ceyVar5;
                                                            defpackage.bvr bvrVar4 = (defpackage.bvr) objA7;
                                                            java.lang.Object objA10 = aauVar6.a(bvrVar4);
                                                            defpackage.byo byoVar4 = bvrVar4.b;
                                                            if (byoVar4 == null) {
                                                                byoVar4 = defpackage.bxv.c;
                                                            }
                                                            if (byoVar4.a(bvrVar4.e().e, objA10)) {
                                                                ceyVar.a().n(bvrVar4);
                                                            } else {
                                                                java.lang.Object objA11 = aauVarE.a(bvrVar4);
                                                                if (objA11 == null) {
                                                                    break;
                                                                }
                                                                if (objA11 instanceof defpackage.aaw) {
                                                                    defpackage.aaw aawVar9 = (defpackage.aaw) objA11;
                                                                    java.lang.Object[] objArr14 = aawVar9.b;
                                                                    long[] jArr14 = aawVar9.a;
                                                                    int length8 = jArr14.length - 2;
                                                                    if (length8 >= 0) {
                                                                        int i38 = 0;
                                                                        while (true) {
                                                                            long j11 = jArr14[i38];
                                                                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                if (i38 != length8) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i38++;
                                                                            } else {
                                                                                int i39 = 8 - ((~(i38 - length8)) >>> 31);
                                                                                for (int i40 = 0; i40 < i39; i40++) {
                                                                                    if ((j11 & 255) < 128) {
                                                                                        aawVar.j(objArr14[(i38 << 3) + i40]);
                                                                                        z3 = true;
                                                                                    }
                                                                                    j11 >>= 8;
                                                                                }
                                                                                if (i39 != 8) {
                                                                                    break;
                                                                                }
                                                                                if (i38 != length8) {
                                                                                    break;
                                                                                }
                                                                                i38++;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    aawVar.j(objA11);
                                                                    ceyVar5 = ceyVar;
                                                                    z4 = true;
                                                                }
                                                            }
                                                        }
                                                        z4 = z3;
                                                        ceyVar5 = ceyVar;
                                                    } catch (java.lang.Throwable th6) {
                                                        th = th6;
                                                    }
                                                } else {
                                                    it = it3;
                                                    obj2 = next;
                                                    aauVar7 = aauVar8;
                                                    ceyVar = ceyVar5;
                                                    z4 = z3;
                                                    ceyVar5 = ceyVar;
                                                }
                                                ceyVar5.e = false;
                                                z3 = z4;
                                            } catch (java.lang.Throwable th7) {
                                                th = th7;
                                            }
                                        } else {
                                            aauVar7 = aauVar8;
                                            it = it3;
                                            obj2 = next;
                                        }
                                    }
                                    java.lang.Object objA12 = aauVarE.a(obj2);
                                    if (objA12 != null) {
                                        if (objA12 instanceof defpackage.aaw) {
                                            defpackage.aaw aawVar10 = (defpackage.aaw) objA12;
                                            java.lang.Object[] objArr15 = aawVar10.b;
                                            long[] jArr15 = aawVar10.a;
                                            int length9 = jArr15.length - 2;
                                            if (length9 >= 0) {
                                                int i41 = 0;
                                                while (true) {
                                                    long j12 = jArr15[i41];
                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i41 != length9) {
                                                            break;
                                                            break;
                                                        }
                                                        i41++;
                                                    } else {
                                                        int i42 = 8 - ((~(i41 - length9)) >>> 31);
                                                        long j13 = j12;
                                                        for (int i43 = 0; i43 < i42; i43++) {
                                                            if ((j13 & 255) < 128) {
                                                                aawVar.j(objArr15[(i41 << 3) + i43]);
                                                                z3 = true;
                                                            }
                                                            j13 >>= 8;
                                                        }
                                                        if (i42 != 8) {
                                                            break;
                                                        }
                                                        if (i41 != length9) {
                                                            break;
                                                        }
                                                        i41++;
                                                    }
                                                }
                                            }
                                        } else {
                                            aawVar.j(objA12);
                                            it3 = it;
                                            z3 = true;
                                        }
                                    }
                                    it3 = it;
                                }
                            }
                        }
                        if (!ceyVar5.e && ceyVar5.a().b != 0) {
                            defpackage.bzc bzcVarA = ceyVar5.a();
                            java.lang.Object[] objArr16 = bzcVarA.a;
                            int i44 = bzcVarA.b;
                            for (int i45 = 0; i45 < i44; i45++) {
                                defpackage.bvr bvrVar5 = (defpackage.bvr) objArr16[i45];
                                defpackage.aau aauVarD = ceyVar5.d();
                                long jV = defpackage.cer.b().v();
                                long j14 = jV ^ (jV >>> 32);
                                java.lang.Object objA13 = ceyVar5.e().a(bvrVar5);
                                if (objA13 != null) {
                                    int i46 = (int) j14;
                                    if (objA13 instanceof defpackage.aaw) {
                                        defpackage.aaw aawVar11 = (defpackage.aaw) objA13;
                                        java.lang.Object[] objArr17 = aawVar11.b;
                                        long[] jArr16 = aawVar11.a;
                                        int length10 = jArr16.length - 2;
                                        if (length10 >= 0) {
                                            int i47 = 0;
                                            while (true) {
                                                long j15 = jArr16[i47];
                                                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i48 = 8 - ((~(i47 - length10)) >>> 31);
                                                    long j16 = j15;
                                                    for (int i49 = 0; i49 < i48; i49++) {
                                                        if ((j16 & 255) < 128) {
                                                            java.lang.Object obj6 = objArr17[(i47 << 3) + i49];
                                                            defpackage.aal aalVar = (defpackage.aal) aauVarD.a(obj6);
                                                            if (aalVar == null) {
                                                                aalVar = new defpackage.aal(6);
                                                                aauVarD.m(obj6, aalVar);
                                                            }
                                                            ceyVar5.f(bvrVar5, i46, obj6, aalVar);
                                                        }
                                                        j16 >>= 8;
                                                    }
                                                    if (i48 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i47 == length10) {
                                                    break;
                                                }
                                                i47++;
                                            }
                                        }
                                    } else {
                                        defpackage.aal aalVar2 = (defpackage.aal) aauVarD.a(objA13);
                                        if (aalVar2 == null) {
                                            aalVar2 = new defpackage.aal(6);
                                            aauVarD.m(objA13, aalVar2);
                                        }
                                        ceyVar5.f(bvrVar5, i46, objA13, aalVar2);
                                    }
                                }
                            }
                            ceyVar5.a().g();
                        }
                        z6 = z3 || z2;
                        i14 = i2 + 1;
                        obj4 = obj;
                        set4 = set;
                        i13 = i;
                        objArr5 = objArr;
                    }
                    i12 = 0;
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    obj = obj4;
                }
            }
        }
    }
}
