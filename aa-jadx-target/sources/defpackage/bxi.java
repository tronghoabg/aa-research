package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bxi {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [beq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [beq] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(defpackage.cru r8, defpackage.beq r9, defpackage.cqu r10, defpackage.afdk r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof defpackage.bky
            if (r0 == 0) goto L13
            r0 = r11
            bky r0 = (defpackage.bky) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bky r0 = new bky
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.b
            afdr r1 = defpackage.afdr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r9 = r0.a
            cru r8 = r0.e
            defpackage.afga.cz(r11)     // Catch: java.util.concurrent.CancellationException -> L43
            goto L8e
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            crd r8 = r0.d
            java.lang.Object r9 = r0.a
            cru r10 = r0.e
            defpackage.afga.cz(r11)     // Catch: java.util.concurrent.CancellationException -> L43
            r7 = r10
            r10 = r8
            r8 = r7
            goto L62
        L43:
            r8 = move-exception
            goto Lc1
        L46:
            defpackage.afga.cz(r11)
            java.util.List r10 = r10.a     // Catch: java.util.concurrent.CancellationException -> L43
            java.lang.Object r10 = defpackage.afga.az(r10)     // Catch: java.util.concurrent.CancellationException -> L43
            crd r10 = (defpackage.crd) r10     // Catch: java.util.concurrent.CancellationException -> L43
            long r5 = r10.a     // Catch: java.util.concurrent.CancellationException -> L43
            r0.e = r8     // Catch: java.util.concurrent.CancellationException -> L43
            r0.a = r9     // Catch: java.util.concurrent.CancellationException -> L43
            r0.d = r10     // Catch: java.util.concurrent.CancellationException -> L43
            r0.c = r4     // Catch: java.util.concurrent.CancellationException -> L43
            java.lang.Object r11 = defpackage.ca.aP(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L43
            if (r11 != r1) goto L62
            goto Lbd
        L62:
            crd r11 = (defpackage.crd) r11     // Catch: java.util.concurrent.CancellationException -> L43
            if (r11 == 0) goto Lbe
            dck r2 = r8.q()     // Catch: java.util.concurrent.CancellationException -> L43
            boolean r10 = y(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L43
            if (r10 == 0) goto Lbe
            long r4 = r11.c     // Catch: java.util.concurrent.CancellationException -> L43
            bks r10 = defpackage.blc.a     // Catch: java.util.concurrent.CancellationException -> L43
            r9.c(r4, r10)     // Catch: java.util.concurrent.CancellationException -> L43
            long r10 = r11.a     // Catch: java.util.concurrent.CancellationException -> L43
            bjm r2 = new bjm     // Catch: java.util.concurrent.CancellationException -> L43
            r4 = 5
            r2.<init>(r9, r4)     // Catch: java.util.concurrent.CancellationException -> L43
            r0.e = r8     // Catch: java.util.concurrent.CancellationException -> L43
            r0.a = r9     // Catch: java.util.concurrent.CancellationException -> L43
            r4 = 0
            r0.d = r4     // Catch: java.util.concurrent.CancellationException -> L43
            r0.c = r3     // Catch: java.util.concurrent.CancellationException -> L43
            java.lang.Object r11 = defpackage.ca.aS(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L43
            if (r11 == r1) goto Lbd
        L8e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L43
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L43
            if (r10 == 0) goto Lb9
            cqu r8 = r8.p()     // Catch: java.util.concurrent.CancellationException -> L43
            java.util.List r8 = r8.a     // Catch: java.util.concurrent.CancellationException -> L43
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> L43
            r11 = 0
        La1:
            if (r11 >= r10) goto Lb5
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L43
            crd r0 = (defpackage.crd) r0     // Catch: java.util.concurrent.CancellationException -> L43
            boolean r1 = defpackage.tq.k(r0)     // Catch: java.util.concurrent.CancellationException -> L43
            if (r1 == 0) goto Lb2
            r0.b()     // Catch: java.util.concurrent.CancellationException -> L43
        Lb2:
            int r11 = r11 + 1
            goto La1
        Lb5:
            r9.d()     // Catch: java.util.concurrent.CancellationException -> L43
            goto Lbe
        Lb9:
            r9.a()     // Catch: java.util.concurrent.CancellationException -> L43
            goto Lbe
        Lbd:
            return r1
        Lbe:
            afbk r8 = defpackage.afbk.a
            return r8
        Lc1:
            r9.a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxi.A(cru, beq, cqu, afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c5, code lost:
    
        if (r14 != r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [beq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [beq] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [beq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [beq] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(defpackage.cru r10, defpackage.beq r11, defpackage.cqu r12, int r13, defpackage.afdk r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxi.B(cru, beq, cqu, int, afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:20:0x0048, B:31:0x007f, B:33:0x0087, B:35:0x0093, B:37:0x009f), top: B:79:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:20:0x0048, B:31:0x007f, B:33:0x0087, B:35:0x0093, B:37:0x009f), top: B:79:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #3 {all -> 0x004c, blocks: (B:20:0x0048, B:31:0x007f, B:33:0x0087, B:35:0x0093, B:37:0x009f), top: B:79:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0109 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0032, B:55:0x00f1, B:57:0x00f9, B:59:0x00fd, B:61:0x0109, B:63:0x0115), top: B:75:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0115 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0032, B:55:0x00f1, B:57:0x00f9, B:59:0x00fd, B:61:0x0109, B:63:0x0115), top: B:75:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [bkb] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [bkb] */
    /* JADX WARN: Type inference failed for: r1v16, types: [bkb] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [bkb] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final java.lang.Object C(defpackage.cru cruVar, defpackage.bkb bkbVar, defpackage.bwk bwkVar, defpackage.cqu cquVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.bkx bkxVar;
        defpackage.bks bksVar;
        ?? r1;
        defpackage.afgq afgqVar;
        defpackage.cru cruVar2;
        ?? r2;
        defpackage.cru cruVar3;
        java.util.List list;
        int size;
        defpackage.crd crdVar;
        java.util.List list2;
        int size2;
        defpackage.crd crdVar2;
        if (afdkVar instanceof defpackage.bkx) {
            bkxVar = (defpackage.bkx) afdkVar;
            int i = bkxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bkxVar.c = i - Integer.MIN_VALUE;
            } else {
                bkxVar = new defpackage.bkx(afdkVar);
            }
        } else {
            bkxVar = new defpackage.bkx(afdkVar);
        }
        defpackage.bkx bkxVar2 = bkxVar;
        java.lang.Object objAS = bkxVar2.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = bkxVar2.c;
        int i3 = 0;
        if (i2 == 0) {
            defpackage.afga.cz(objAS);
            defpackage.crd crdVar3 = (defpackage.crd) cquVar.a.get(0);
            if ((cquVar.d & 1) == 0) {
                int i4 = bwkVar.a;
                if (i4 != 1) {
                    bksVar = i4 != 2 ? defpackage.bkr.c : defpackage.bkr.b;
                } else {
                    bksVar = defpackage.bkr.a;
                }
                if (bkbVar.e(crdVar3.c, bksVar, i4)) {
                    try {
                        defpackage.afgq afgqVar2 = new defpackage.afgq();
                        afgqVar2.a = true ^ defpackage.afga.f(bksVar, defpackage.bkr.a);
                        long j = crdVar3.a;
                        defpackage.bks bksVar2 = bksVar;
                        afgqVar = afgqVar2;
                        defpackage.acn acnVar = new defpackage.acn(bkbVar, bksVar2, afgqVar, 9, (int[]) null);
                        bkxVar2.e = cruVar;
                        bkxVar2.a = bkbVar;
                        bkxVar2.d = afgqVar;
                        bkxVar2.c = 2;
                        objAS = defpackage.ca.aS(cruVar, j, acnVar, bkxVar2);
                        if (objAS != afdrVar) {
                            cruVar2 = cruVar;
                            r1 = bkbVar;
                            if (((java.lang.Boolean) objAS).booleanValue()) {
                                list2 = cruVar2.p().a;
                                size2 = list2.size();
                                while (i3 < size2) {
                                    crdVar2 = (defpackage.crd) list2.get(i3);
                                    if (defpackage.tq.k(crdVar2)) {
                                        crdVar2.b();
                                    }
                                    i3++;
                                }
                            }
                            r1.a();
                        }
                        return afdrVar;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        r1 = bkbVar;
                        r1.a();
                        throw th;
                    }
                }
            } else if (bkbVar.c(crdVar3.c)) {
                try {
                    crdVar3.b();
                    long j2 = crdVar3.a;
                    defpackage.bjm bjmVar = new defpackage.bjm(bkbVar, 4);
                    bkxVar2.e = cruVar;
                    bkxVar2.a = bkbVar;
                    bkxVar2.c = 1;
                    objAS = defpackage.ca.aS(cruVar, j2, bjmVar, bkxVar2);
                    if (objAS != afdrVar) {
                        cruVar3 = cruVar;
                        r2 = bkbVar;
                        if (((java.lang.Boolean) objAS).booleanValue()) {
                            list = cruVar3.p().a;
                            size = list.size();
                            while (i3 < size) {
                                crdVar = (defpackage.crd) list.get(i3);
                                if (defpackage.tq.k(crdVar)) {
                                    crdVar.b();
                                }
                                i3++;
                            }
                        }
                        r2.a();
                    }
                    return afdrVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r2 = bkbVar;
                    r2.a();
                    throw th;
                }
            }
        } else if (i2 == 1) {
            r2 = bkxVar2.a;
            cruVar3 = bkxVar2.e;
            try {
                defpackage.afga.cz(objAS);
                r2 = r2;
                if (((java.lang.Boolean) objAS).booleanValue()) {
                    list = cruVar3.p().a;
                    size = list.size();
                    while (i3 < size) {
                        crdVar = (defpackage.crd) list.get(i3);
                        if (defpackage.tq.k(crdVar)) {
                            crdVar.b();
                        }
                        i3++;
                    }
                }
                r2.a();
            } catch (java.lang.Throwable th3) {
                th = th3;
                r2.a();
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afgq afgqVar3 = bkxVar2.d;
            r1 = bkxVar2.a;
            defpackage.cru cruVar4 = bkxVar2.e;
            try {
                defpackage.afga.cz(objAS);
                afgqVar = afgqVar3;
                cruVar2 = cruVar4;
                r1 = r1;
                if (((java.lang.Boolean) objAS).booleanValue() && afgqVar.a) {
                    list2 = cruVar2.p().a;
                    size2 = list2.size();
                    while (i3 < size2) {
                        crdVar2 = (defpackage.crd) list2.get(i3);
                        if (defpackage.tq.k(crdVar2)) {
                            crdVar2.b();
                        }
                        i3++;
                    }
                }
                r1.a();
            } catch (java.lang.Throwable th4) {
                th = th4;
                r1.a();
                throw th;
            }
        }
        return defpackage.afbk.a;
    }

    public static final void D(defpackage.bil bilVar, android.content.Context context, defpackage.beo beoVar, boolean z, defpackage.afer aferVar, defpackage.afer aferVar2) {
        android.content.res.Resources resources = context.getResources();
        defpackage.beh behVar = new defpackage.beh(aferVar2, aferVar, 8, null);
        if (z) {
            defpackage.asq.S(bilVar, beoVar.f, resources.getString(beoVar.g), beoVar.h, behVar);
        }
    }

    public static final void E(defpackage.bil bilVar, aiuw aiuwVar, android.content.Context context, defpackage.beo beoVar, boolean z, defpackage.affc affcVar) {
        D(bilVar, context, beoVar, z, null, new defpackage.ajz(aiuwVar, affcVar, 18));
    }

    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void c(defpackage.bzp bzpVar, java.util.List list, defpackage.bxm bxmVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = bzpVar.a((defpackage.bzh) list.get(i));
            int iM = bzpVar.m(bzpVar.b, bzpVar.g(iA));
            java.lang.Object obj = iM < bzpVar.c(bzpVar.b, bzpVar.g(iA + 1)) ? bzpVar.c[bzpVar.d(iM)] : defpackage.bvd.a;
            defpackage.bxl bxlVar = obj instanceof defpackage.bxl ? (defpackage.bxl) obj : null;
            if (bxlVar != null) {
                bxlVar.a = bxmVar;
            }
        }
    }

    public static final defpackage.bwq d(defpackage.afdo afdoVar) {
        defpackage.bwq bwqVar = (defpackage.bwq) afdoVar.get(defpackage.bwq.b);
        if (bwqVar != null) {
            return bwqVar;
        }
        throw new java.lang.IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final java.lang.Object e(defpackage.affc affcVar, defpackage.afdk afdkVar) {
        return d(afdkVar.gT()).a(new defpackage.adv(affcVar, 4), afdkVar);
    }

    public static final java.lang.Object f(defpackage.affc affcVar, defpackage.afdk afdkVar) {
        return d(afdkVar.gT()).a(affcVar, afdkVar);
    }

    public static final java.lang.String g(java.lang.Object obj) {
        java.util.Objects.toString(obj);
        return obj.toString().concat(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
    }

    public static final java.lang.Object h(java.lang.Object[] objArr, defpackage.afer aferVar, defpackage.bve bveVar) {
        return j(java.util.Arrays.copyOf(objArr, 0), defpackage.cea.a, aferVar, bveVar, 3456);
    }

    public static final java.lang.Object i(java.lang.Object[] objArr, defpackage.cdz cdzVar, defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2 = i & 112;
        return j(java.util.Arrays.copyOf(objArr, objArr.length), cdzVar, aferVar, bveVar, ((i << 3) & 7168) | i2 | 384);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [affc, java.lang.Object] */
    public static final java.lang.Object j(java.lang.Object[] objArr, defpackage.cdz cdzVar, defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        java.lang.Object[] objArr2;
        defpackage.cdz cdzVar2;
        final java.lang.Object obj;
        java.lang.Object objA;
        final java.lang.String string = java.lang.Long.toString(bveVar.b(), 36);
        string.getClass();
        cdzVar.getClass();
        final defpackage.cdv cdvVar = (defpackage.cdv) bveVar.f(defpackage.cdx.a);
        java.lang.Object objG = bveVar.g();
        java.lang.Object obj2 = defpackage.bvd.a;
        if (objG == obj2) {
            java.lang.Object objInvoke = (cdvVar == null || (objA = cdvVar.a(string)) == null) ? null : cdzVar.b.invoke(objA);
            if (objInvoke == null) {
                objInvoke = aferVar.invoke();
            }
            objArr2 = objArr;
            cdzVar2 = cdzVar;
            java.lang.Object cdrVar = new defpackage.cdr(cdzVar2, cdvVar, string, objInvoke, objArr2);
            bveVar.x(cdrVar);
            objG = cdrVar;
        } else {
            objArr2 = objArr;
            cdzVar2 = cdzVar;
        }
        final defpackage.cdr cdrVar2 = (defpackage.cdr) objG;
        java.lang.Object objInvoke2 = java.util.Arrays.equals(objArr2, cdrVar2.d) ? cdrVar2.c : null;
        if (objInvoke2 == null) {
            objInvoke2 = aferVar.invoke();
        }
        boolean zE = bveVar.E(cdrVar2);
        boolean z = true;
        if ((((i & 112) ^ 48) <= 32 || !bveVar.E(cdzVar2)) && (i & 48) != 32) {
            z = false;
        }
        boolean zE2 = zE | z | bveVar.E(cdvVar) | bveVar.C(string) | bveVar.E(objInvoke2) | bveVar.E(objArr2);
        java.lang.Object objG2 = bveVar.g();
        if (zE2 || objG2 == obj2) {
            final java.lang.Object[] objArr3 = objArr2;
            obj = objInvoke2;
            final defpackage.cdz cdzVar3 = cdzVar2;
            java.lang.Object obj3 = new defpackage.afer() { // from class: cdq
                @Override // defpackage.afer
                public final java.lang.Object invoke() {
                    boolean z2;
                    defpackage.cdr cdrVar3 = cdrVar2;
                    defpackage.cdv cdvVar2 = cdrVar3.a;
                    defpackage.cdv cdvVar3 = cdvVar;
                    boolean z3 = true;
                    if (cdvVar2 != cdvVar3) {
                        cdrVar3.a = cdvVar3;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    java.lang.String str = string;
                    if (defpackage.afga.f(cdrVar3.b, str)) {
                        z3 = z2;
                    } else {
                        cdrVar3.b = str;
                    }
                    java.lang.Object[] objArr4 = objArr3;
                    java.lang.Object obj4 = obj;
                    cdrVar3.e = cdzVar3;
                    cdrVar3.c = obj4;
                    cdrVar3.d = objArr4;
                    defpackage.rqj rqjVar = cdrVar3.f;
                    if (rqjVar != null && z3) {
                        rqjVar.b();
                        cdrVar3.f = null;
                        cdrVar3.d();
                    }
                    return defpackage.afbk.a;
                }
            };
            bveVar.x(obj3);
            objG2 = obj3;
        } else {
            obj = objInvoke2;
        }
        bveVar.r((defpackage.afer) objG2);
        return obj;
    }

    public static final defpackage.cdz k(defpackage.affg affgVar, defpackage.affc affcVar) {
        defpackage.amc amcVar = new defpackage.amc(affgVar, 17);
        defpackage.afgz.g(affcVar, 1);
        return new defpackage.cdz(amcVar, affcVar);
    }

    public static final defpackage.bys l(defpackage.eqp eqpVar, defpackage.bve bveVar) {
        return m(eqpVar, eqpVar.e(), bveVar);
    }

    public static final defpackage.bys m(defpackage.eqp eqpVar, java.lang.Object obj, defpackage.bve bveVar) {
        defpackage.eqg eqgVar = (defpackage.eqg) bveVar.f(defpackage.esf.a);
        java.lang.Object objG = bveVar.g();
        java.lang.Object obj2 = defpackage.bvd.a;
        if (objG == obj2) {
            if (eqpVar.o()) {
                obj = eqpVar.e();
            }
            java.lang.Object parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, defpackage.bxv.c);
            bveVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        defpackage.bwx bwxVar = (defpackage.bwx) objG;
        boolean zE = bveVar.E(eqpVar) | bveVar.E(eqgVar);
        java.lang.Object objG2 = bveVar.g();
        if (zE || objG2 == obj2) {
            objG2 = new defpackage.acn(eqpVar, eqgVar, bwxVar, 12);
            bveVar.x(objG2);
        }
        defpackage.bvx.b(eqpVar, eqgVar, (defpackage.affc) objG2, bveVar);
        return bwxVar;
    }

    public static final defpackage.bnk n(defpackage.bve bveVar) {
        return ((defpackage.bol) bveVar.f(defpackage.bom.a)).a;
    }

    public static final defpackage.bpz o(defpackage.bve bveVar) {
        return ((defpackage.bol) bveVar.f(defpackage.bom.a)).c;
    }

    public static final defpackage.bse p(defpackage.bve bveVar) {
        return ((defpackage.bol) bveVar.f(defpackage.bom.a)).b;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x0136  */
    /* JADX WARN: Code duplicated, block: B:110:0x013f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0184 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0186  */
    /* JADX WARN: Code duplicated, block: B:125:0x0189  */
    /* JADX WARN: Code duplicated, block: B:128:0x0192  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:133:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:139:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:150:0x0205  */
    /* JADX WARN: Code duplicated, block: B:152:0x0214  */
    /* JADX WARN: Code duplicated, block: B:154:0x0221  */
    /* JADX WARN: Code duplicated, block: B:155:0x0226  */
    /* JADX WARN: Code duplicated, block: B:157:0x022c  */
    /* JADX WARN: Code duplicated, block: B:158:0x0231  */
    /* JADX WARN: Code duplicated, block: B:160:0x0237  */
    /* JADX WARN: Code duplicated, block: B:161:0x0244  */
    /* JADX WARN: Code duplicated, block: B:163:0x0261  */
    /* JADX WARN: Code duplicated, block: B:164:0x026a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0275  */
    /* JADX WARN: Code duplicated, block: B:169:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    public static final void q(final defpackage.afer aferVar, defpackage.cgf cgfVar, boolean z, defpackage.cld cldVar, defpackage.bmr bmrVar, defpackage.bmv bmvVar, defpackage.ajl ajlVar, defpackage.avv avvVar, defpackage.ask askVar, final defpackage.affh affhVar, defpackage.bve bveVar, final int i, final int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        boolean z2;
        int i5;
        defpackage.cld cldVarA;
        defpackage.bmr bmrVar2;
        defpackage.bmv bmvVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        defpackage.bve bveVar2;
        final boolean z4;
        final defpackage.avv avvVar2;
        final defpackage.ask askVar2;
        final defpackage.cgf cgfVar3;
        final defpackage.cld cldVar2;
        final defpackage.bmr bmrVar3;
        final defpackage.bmv bmvVar3;
        final defpackage.ajl ajlVar2;
        defpackage.bxl bxlVarJ;
        int i12;
        int i13;
        int i14;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        defpackage.bmr bmrVarB;
        defpackage.bmv bmvVar4;
        defpackage.ajl ajlVar3;
        defpackage.ajl ajlVar4;
        boolean z5;
        defpackage.cld cldVar3;
        defpackage.ask askVar3;
        defpackage.bmv bmvVar5;
        defpackage.ask askVar4;
        long j;
        final long j2;
        defpackage.bys bysVar;
        float f;
        java.lang.Object objS;
        java.lang.Object objS2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1310015664);
        if (i19 == 0) {
            i3 = (true != bveVarC.E(aferVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i20 = i2 & 2;
        if (i20 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (true != bveVarC.D(z)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                i18 = 1024;
                if ((i2 & 8) == 0) {
                    cldVarA = cldVar;
                    if (bveVarC.C(cldVarA)) {
                        i18 = 2048;
                    }
                } else {
                    cldVarA = cldVar;
                }
                i3 |= i18;
            } else {
                cldVarA = cldVar;
            }
            if ((i & 24576) == 0) {
                i17 = 8192;
                if ((i2 & 16) == 0) {
                    bmrVar2 = bmrVar;
                    if (bveVarC.C(bmrVar2)) {
                        i17 = 16384;
                    }
                } else {
                    bmrVar2 = bmrVar;
                }
                i3 |= i17;
            } else {
                bmrVar2 = bmrVar;
            }
            if ((196608 & i) == 0) {
                i16 = 65536;
                if ((i2 & 32) == 0) {
                    bmvVar2 = bmvVar;
                    if (bveVarC.C(bmvVar2)) {
                        i16 = 131072;
                    }
                } else {
                    bmvVar2 = bmvVar;
                }
                i3 |= i16;
            } else {
                bmvVar2 = bmvVar;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != bveVarC.C(ajlVar)) {
                    i7 = 524288;
                } else {
                    i7 = 1048576;
                }
                i3 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                int i21 = i3;
                if (true != bveVarC.C(avvVar)) {
                    i9 = 4194304;
                } else {
                    i9 = 8388608;
                }
                i3 = i21 | i9;
            }
            i10 = i2 & 256;
            if (i10 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                int i22 = i3;
                if (true != bveVarC.C(askVar)) {
                    i11 = 33554432;
                } else {
                    i11 = 67108864;
                }
                i3 = i22 | i11;
            }
            if ((805306368 & i) == 0) {
                int i23 = i3;
                if (true != bveVarC.E(affhVar)) {
                    i15 = 268435456;
                } else {
                    i15 = 536870912;
                }
                i3 = i23 | i15;
            }
            if ((306783379 & i3) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i3 & 1)) {
                i12 = i2 & 32;
                i13 = i2 & 16;
                i14 = i2 & 8;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i20 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    boolean z6 = (!z2) | z;
                    if (i14 != 0) {
                        i3 &= -7169;
                        defpackage.avv avvVar3 = defpackage.bms.a;
                        int i24 = defpackage.bqa.a;
                        cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                    }
                    if (i13 != 0) {
                        defpackage.avv avvVar4 = defpackage.bms.a;
                        bmrVarB = defpackage.bms.b(((defpackage.bol) bveVarC.f(defpackage.bom.a)).a);
                        i3 &= -57345;
                    } else {
                        bmrVarB = bmrVar2;
                    }
                    if (i12 != 0) {
                        defpackage.avv avvVar5 = defpackage.bms.a;
                        bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        i3 &= -458753;
                    } else {
                        bmvVar4 = bmvVar2;
                    }
                    if (i6 != 0) {
                        ajlVar3 = null;
                    } else {
                        ajlVar3 = ajlVar;
                    }
                    if (i8 != 0) {
                        defpackage.avv avvVar6 = defpackage.bms.a;
                        avvVar2 = defpackage.bms.a;
                    } else {
                        avvVar2 = avvVar;
                    }
                    ajlVar4 = ajlVar3;
                    z5 = z6;
                    cldVar3 = cldVarA;
                    if (i10 != 0) {
                        askVar3 = null;
                    } else {
                        askVar3 = askVar;
                    }
                    bmvVar5 = bmvVar4;
                } else {
                    bveVarC.s();
                    if (i14 != 0) {
                        i3 &= -7169;
                    }
                    if (i13 != 0) {
                        i3 &= -57345;
                    }
                    if (i12 != 0) {
                        i3 &= -458753;
                    }
                    ajlVar4 = ajlVar;
                    avvVar2 = avvVar;
                    askVar3 = askVar;
                    cgfVar4 = cgfVar2;
                    cldVar3 = cldVarA;
                    bmrVarB = bmrVar2;
                    i3 = i3;
                    bmvVar5 = bmvVar2;
                    z5 = z;
                }
                bveVarC.l();
                if (askVar3 == null) {
                    bveVarC.v(1691726283);
                    objS2 = bwcVar.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new defpackage.asl();
                        bwcVar.ad(objS2);
                    }
                    askVar4 = (defpackage.ask) objS2;
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(-499618164);
                    bwcVar.Y(false);
                    askVar4 = askVar3;
                }
                if (z5) {
                    j = bmrVarB.a;
                } else {
                    j = bmrVarB.c;
                }
                if (z5) {
                    j2 = bmrVarB.b;
                } else {
                    j2 = bmrVarB.d;
                }
                if (bmvVar5 == null) {
                    bveVarC.v(1691909926);
                    bwcVar.Y(false);
                    bysVar = null;
                } else {
                    bveVarC.v(-499611589);
                    defpackage.bys bysVarA = bmvVar5.a(z5, askVar4, bveVarC, (((i3 >> 9) & 896) | ((i3 >> 6) & 14)) & 910);
                    bwcVar.Y(false);
                    bysVar = bysVarA;
                }
                if (bysVar != null) {
                    f = ((defpackage.dlr) bysVar.a()).a;
                } else {
                    f = 0.0f;
                }
                float f2 = f;
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.bev(16);
                    bwcVar.ad(objS);
                }
                java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dea.a;
                bveVar2 = bveVarC;
                defpackage.bqv.c(aferVar, cgfVar4.a(new defpackage.ddo(false, (defpackage.affc) objS)), z5, cldVar3, j, j2, 0.0f, f2, ajlVar4, askVar4, defpackage.dai.as(-535639973, true, new defpackage.affg() { // from class: bmx
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar3 = (defpackage.bve) obj;
                        int iIntValue = ((java.lang.Integer) obj2).intValue();
                        int i25 = iIntValue & 3;
                        if (bveVar3.I(i25 != 2, iIntValue & 1)) {
                            defpackage.dai.aC(j2, ((defpackage.bol) bveVar3.f(defpackage.bom.a)).b.m, defpackage.dai.as(417635459, true, new defpackage.aps(avvVar2, affhVar, 10, null), bveVar3), bveVar3, 384);
                        } else {
                            bveVar3.s();
                        }
                        return defpackage.afbk.a;
                    }
                }, bveVarC), bveVar2, 64);
                bmvVar3 = bmvVar5;
                cgfVar3 = cgfVar4;
                bmrVar3 = bmrVarB;
                z4 = z5;
                cldVar2 = cldVar3;
                ajlVar2 = ajlVar4;
                askVar2 = askVar3;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                z4 = z;
                avvVar2 = avvVar;
                askVar2 = askVar;
                cgfVar3 = cgfVar2;
                cldVar2 = cldVarA;
                bmrVar3 = bmrVar2;
                bmvVar3 = bmvVar2;
                ajlVar2 = ajlVar;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: bmy
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        ((java.lang.Integer) obj2).intValue();
                        defpackage.afer aferVar2 = aferVar;
                        defpackage.cgf cgfVar5 = cgfVar3;
                        boolean z7 = z4;
                        defpackage.cld cldVar4 = cldVar2;
                        defpackage.bmr bmrVar4 = bmrVar3;
                        defpackage.bmv bmvVar6 = bmvVar3;
                        int i25 = i;
                        int i26 = i25 | 1;
                        int i27 = 306783378 & i26;
                        int i28 = i27 + i27;
                        int i29 = 613566756 & i26;
                        defpackage.bxi.q(aferVar2, cgfVar5, z7, cldVar4, bmrVar4, bmvVar6, ajlVar2, avvVar2, askVar2, affhVar, (defpackage.bve) obj, i27 | (i29 >> 1) | (i26 & (-920350135)) | (i28 & i29), i2);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (true != bveVarC.D(z)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i18 = 1024;
            if ((i2 & 8) == 0) {
                cldVarA = cldVar;
                if (bveVarC.C(cldVarA)) {
                    i18 = 2048;
                }
            } else {
                cldVarA = cldVar;
            }
            i3 |= i18;
        } else {
            cldVarA = cldVar;
        }
        if ((i & 24576) == 0) {
            i17 = 8192;
            if ((i2 & 16) == 0) {
                bmrVar2 = bmrVar;
                if (bveVarC.C(bmrVar2)) {
                    i17 = 16384;
                }
            } else {
                bmrVar2 = bmrVar;
            }
            i3 |= i17;
        } else {
            bmrVar2 = bmrVar;
        }
        if ((196608 & i) == 0) {
            i16 = 65536;
            if ((i2 & 32) == 0) {
                bmvVar2 = bmvVar;
                if (bveVarC.C(bmvVar2)) {
                    i16 = 131072;
                }
            } else {
                bmvVar2 = bmvVar;
            }
            i3 |= i16;
        } else {
            bmvVar2 = bmvVar;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (true != bveVarC.C(ajlVar)) {
                i7 = 524288;
            } else {
                i7 = 1048576;
            }
            i3 |= i7;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            int i25 = i3;
            if (true != bveVarC.C(avvVar)) {
                i9 = 4194304;
            } else {
                i9 = 8388608;
            }
            i3 = i25 | i9;
        }
        i10 = i2 & 256;
        if (i10 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            int i26 = i3;
            if (true != bveVarC.C(askVar)) {
                i11 = 33554432;
            } else {
                i11 = 67108864;
            }
            i3 = i26 | i11;
        }
        if ((805306368 & i) == 0) {
            int i27 = i3;
            if (true != bveVarC.E(affhVar)) {
                i15 = 268435456;
            } else {
                i15 = 536870912;
            }
            i3 = i27 | i15;
        }
        if ((306783379 & i3) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bveVarC.I(z3, i3 & 1)) {
            i12 = i2 & 32;
            i13 = i2 & 16;
            i14 = i2 & 8;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i20 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                boolean z7 = (!z2) | z;
                if (i14 != 0) {
                    i3 &= -7169;
                    defpackage.avv avvVar7 = defpackage.bms.a;
                    int i28 = defpackage.bqa.a;
                    cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                }
                if (i13 != 0) {
                    defpackage.avv avvVar8 = defpackage.bms.a;
                    bmrVarB = defpackage.bms.b(((defpackage.bol) bveVarC.f(defpackage.bom.a)).a);
                    i3 &= -57345;
                } else {
                    bmrVarB = bmrVar2;
                }
                if (i12 != 0) {
                    defpackage.avv avvVar9 = defpackage.bms.a;
                    bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    i3 &= -458753;
                } else {
                    bmvVar4 = bmvVar2;
                }
                if (i6 != 0) {
                    ajlVar3 = null;
                } else {
                    ajlVar3 = ajlVar;
                }
                if (i8 != 0) {
                    defpackage.avv avvVar10 = defpackage.bms.a;
                    avvVar2 = defpackage.bms.a;
                } else {
                    avvVar2 = avvVar;
                }
                ajlVar4 = ajlVar3;
                z5 = z7;
                cldVar3 = cldVarA;
                if (i10 != 0) {
                    askVar3 = null;
                } else {
                    askVar3 = askVar;
                }
                bmvVar5 = bmvVar4;
            } else {
                if (i20 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                boolean z8 = (!z2) | z;
                if (i14 != 0) {
                    i3 &= -7169;
                    defpackage.avv avvVar11 = defpackage.bms.a;
                    int i29 = defpackage.bqa.a;
                    cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(defpackage.bom.a)).c, 7);
                }
                if (i13 != 0) {
                    defpackage.avv avvVar12 = defpackage.bms.a;
                    bmrVarB = defpackage.bms.b(((defpackage.bol) bveVarC.f(defpackage.bom.a)).a);
                    i3 &= -57345;
                } else {
                    bmrVarB = bmrVar2;
                }
                if (i12 != 0) {
                    defpackage.avv avvVar13 = defpackage.bms.a;
                    bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    i3 &= -458753;
                } else {
                    bmvVar4 = bmvVar2;
                }
                if (i6 != 0) {
                    ajlVar3 = null;
                } else {
                    ajlVar3 = ajlVar;
                }
                if (i8 != 0) {
                    defpackage.avv avvVar14 = defpackage.bms.a;
                    avvVar2 = defpackage.bms.a;
                } else {
                    avvVar2 = avvVar;
                }
                ajlVar4 = ajlVar3;
                z5 = z8;
                cldVar3 = cldVarA;
                if (i10 != 0) {
                    askVar3 = null;
                } else {
                    askVar3 = askVar;
                }
                bmvVar5 = bmvVar4;
            }
            bveVarC.l();
            if (askVar3 == null) {
                bveVarC.v(1691726283);
                objS2 = bwcVar.S();
                if (objS2 == defpackage.bvd.a) {
                    objS2 = new defpackage.asl();
                    bwcVar.ad(objS2);
                }
                askVar4 = (defpackage.ask) objS2;
                bwcVar.Y(false);
            } else {
                bveVarC.v(-499618164);
                bwcVar.Y(false);
                askVar4 = askVar3;
            }
            if (z5) {
                j = bmrVarB.a;
            } else {
                j = bmrVarB.c;
            }
            if (z5) {
                j2 = bmrVarB.b;
            } else {
                j2 = bmrVarB.d;
            }
            if (bmvVar5 == null) {
                bveVarC.v(1691909926);
                bwcVar.Y(false);
                bysVar = null;
            } else {
                bveVarC.v(-499611589);
                defpackage.bys bysVarA2 = bmvVar5.a(z5, askVar4, bveVarC, (((i3 >> 9) & 896) | ((i3 >> 6) & 14)) & 910);
                bwcVar.Y(false);
                bysVar = bysVarA2;
            }
            if (bysVar != null) {
                f = ((defpackage.dlr) bysVar.a()).a;
            } else {
                f = 0.0f;
            }
            float f3 = f;
            objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.bev(16);
                bwcVar.ad(objS);
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger2 = defpackage.dea.a;
            bveVar2 = bveVarC;
            defpackage.bqv.c(aferVar, cgfVar4.a(new defpackage.ddo(false, (defpackage.affc) objS)), z5, cldVar3, j, j2, 0.0f, f3, ajlVar4, askVar4, defpackage.dai.as(-535639973, true, new defpackage.affg() { // from class: bmx
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    int i210 = iIntValue & 3;
                    if (bveVar3.I(i210 != 2, iIntValue & 1)) {
                        defpackage.dai.aC(j2, ((defpackage.bol) bveVar3.f(defpackage.bom.a)).b.m, defpackage.dai.as(417635459, true, new defpackage.aps(avvVar2, affhVar, 10, null), bveVar3), bveVar3, 384);
                    } else {
                        bveVar3.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVarC), bveVar2, 64);
            bmvVar3 = bmvVar5;
            cgfVar3 = cgfVar4;
            bmrVar3 = bmrVarB;
            z4 = z5;
            cldVar2 = cldVar3;
            ajlVar2 = ajlVar4;
            askVar2 = askVar3;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            z4 = z;
            avvVar2 = avvVar;
            askVar2 = askVar;
            cgfVar3 = cgfVar2;
            cldVar2 = cldVarA;
            bmrVar3 = bmrVar2;
            bmvVar3 = bmvVar2;
            ajlVar2 = ajlVar;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: bmy
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.afer aferVar2 = aferVar;
                    defpackage.cgf cgfVar5 = cgfVar3;
                    boolean z9 = z4;
                    defpackage.cld cldVar4 = cldVar2;
                    defpackage.bmr bmrVar4 = bmrVar3;
                    defpackage.bmv bmvVar6 = bmvVar3;
                    int i210 = i;
                    int i211 = i210 | 1;
                    int i212 = 306783378 & i211;
                    int i213 = i212 + i212;
                    int i214 = 613566756 & i211;
                    defpackage.bxi.q(aferVar2, cgfVar5, z9, cldVar4, bmrVar4, bmvVar6, ajlVar2, avvVar2, askVar2, affhVar, (defpackage.bve) obj, i212 | (i214 >> 1) | (i211 & (-920350135)) | (i213 & i214), i2);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void r(defpackage.afer aferVar, defpackage.cgf cgfVar, boolean z, defpackage.cld cldVar, defpackage.bmr bmrVar, defpackage.ajl ajlVar, defpackage.avv avvVar, defpackage.affh affhVar, defpackage.bve bveVar, int i) {
        defpackage.afer aferVar2;
        int i2;
        defpackage.affh affhVar2;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar2;
        boolean z2;
        defpackage.cld cldVar2;
        defpackage.bmr bmrVar2;
        defpackage.ajl ajlVar2;
        defpackage.avv avvVar2;
        defpackage.ajl ajlVarB;
        boolean z3;
        defpackage.avv avvVar3;
        defpackage.cld cldVar3;
        defpackage.bmr bmrVar3;
        defpackage.cgf cgfVar3;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(399974542);
        if (i3 == 0) {
            aferVar2 = aferVar;
            i2 = (true != bveVarC.E(aferVar2) ? 2 : 4) | i;
        } else {
            aferVar2 = aferVar;
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 = i4 | 720896;
        }
        int i6 = i5 | 113246208;
        if ((805306368 & i) == 0) {
            affhVar2 = affhVar;
            i6 |= true != bveVarC.E(affhVar2) ? 268435456 : 536870912;
        } else {
            affhVar2 = affhVar;
        }
        if (bveVarC.I((306783379 & i6) != 306783378, i6 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                defpackage.cgc cgcVar = defpackage.cgf.e;
                defpackage.avv avvVar4 = defpackage.bms.a;
                defpackage.cld cldVarD = defpackage.bms.d(bveVarC);
                defpackage.bnk bnkVarN = n(bveVarC);
                defpackage.bmr bmrVar4 = bnkVarN.X;
                if (bmrVar4 == null) {
                    defpackage.bmr bmrVar5 = new defpackage.bmr(defpackage.cjv.j(0), defpackage.bnl.e(bnkVarN, 19), defpackage.cjv.j(0), defpackage.ckd.h(defpackage.bnl.e(bnkVarN, 19), 0.38f));
                    bnkVarN.X = bmrVar5;
                    bmrVar4 = bmrVar5;
                }
                bveVarC.v(-112362814);
                long jF = defpackage.bnl.f(25, bveVarC);
                bwcVar.Y(false);
                ajlVarB = defpackage.afw.B(1.0f, jF);
                z3 = true;
                avvVar3 = defpackage.bms.a;
                cldVar3 = cldVarD;
                bmrVar3 = bmrVar4;
                cgfVar3 = cgcVar;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar;
                z3 = z;
                cldVar3 = cldVar;
                bmrVar3 = bmrVar;
                ajlVarB = ajlVar;
                avvVar3 = avvVar;
            }
            bveVarC.l();
            bveVar2 = bveVarC;
            q(aferVar2, cgfVar3, z3, cldVar3, bmrVar3, null, ajlVarB, avvVar3, null, affhVar2, bveVar2, i6 & 2143749118, 0);
            cgfVar2 = cgfVar3;
            z2 = z3;
            cldVar2 = cldVar3;
            bmrVar2 = bmrVar3;
            ajlVar2 = ajlVarB;
            avvVar2 = avvVar3;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar2 = cgfVar;
            z2 = z;
            cldVar2 = cldVar;
            bmrVar2 = bmrVar;
            ajlVar2 = ajlVar;
            avvVar2 = avvVar;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bmw(aferVar, cgfVar2, z2, cldVar2, bmrVar2, ajlVar2, avvVar2, affhVar, i);
        }
    }

    public static final boolean s(defpackage.blw blwVar, boolean z) {
        defpackage.ctc ctcVarF;
        defpackage.beg begVar = blwVar.d;
        if (begVar != null && (ctcVarF = begVar.f()) != null) {
            defpackage.cjj cjjVarV = v(ctcVarF);
            long jA = blwVar.a(z);
            float f = cjjVarV.b;
            float f2 = cjjVarV.d;
            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jA >> 32));
            if (f <= fIntBitsToFloat && fIntBitsToFloat <= f2) {
                float f3 = cjjVarV.c;
                float f4 = cjjVarV.e;
                float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jA & 4294967295L));
                if (f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void t(final boolean z, int i, final defpackage.blw blwVar, defpackage.bve bveVar, final int i2) {
        int i3;
        final int i4;
        defpackage.bfi bfiVarE;
        int i5 = i2 & 6;
        defpackage.bve bveVarC = bveVar.c(-1344558920);
        if (i5 == 0) {
            i3 = (true != bveVarC.D(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.A(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != bveVarC.E(blwVar) ? 128 : 256;
        }
        if (bveVarC.I((i3 & 147) != 146, i3 & 1)) {
            boolean z2 = (i3 & 14) == 4;
            boolean zC = bveVarC.C(blwVar) | z2;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                objS = new defpackage.blq(blwVar, z);
                bwcVar.ad(objS);
            }
            defpackage.beq beqVar = (defpackage.beq) objS;
            boolean zE = bveVarC.E(blwVar) | z2;
            java.lang.Object objS2 = bwcVar.S();
            if (zE || objS2 == defpackage.bvd.a) {
                objS2 = new defpackage.bly(blwVar, z);
                bwcVar.ad(objS2);
            }
            defpackage.bkc bkcVar = (defpackage.bkc) objS2;
            boolean zJ = defpackage.dgc.j(blwVar.f().b);
            int i6 = (int) (z ? blwVar.f().b >> 32 : blwVar.f().b & 4294967295L);
            defpackage.beg begVar = blwVar.d;
            float fD = 0.0f;
            if (begVar != null && (bfiVarE = begVar.e()) != null && i6 >= 0) {
                defpackage.dga dgaVar = bfiVarE.a;
                if (dgaVar.a.a.a() != 0) {
                    defpackage.dfi dfiVar = dgaVar.b;
                    int iMin = java.lang.Math.min(dfiVar.d(i6), java.lang.Math.min(dfiVar.b - 1, dfiVar.f - 1));
                    if (i6 <= dfiVar.c(iMin, false)) {
                        dfiVar.k(iMin);
                        java.util.List list = dfiVar.h;
                        defpackage.dfk dfkVar = (defpackage.dfk) list.get(defpackage.dai.v(list, iMin));
                        fD = dfkVar.g.d(dfkVar.f(iMin));
                    }
                }
            }
            defpackage.cgc cgcVar = defpackage.cgf.e;
            boolean zE2 = bveVarC.E(beqVar);
            java.lang.Object objS3 = bwcVar.S();
            if (zE2 || objS3 == defpackage.bvd.a) {
                objS3 = new defpackage.bax(beqVar, 7);
                bwcVar.ad(objS3);
            }
            i4 = i;
            defpackage.axd.x(bkcVar, z, i4, zJ, 0L, fD, defpackage.crq.a(cgcVar, beqVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objS3), bveVarC, (i3 << 3) & 1008);
        } else {
            i4 = i;
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: blx
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    int i7 = i2 | 1;
                    int i8 = 306783378 & i7;
                    int i9 = i4;
                    int i10 = 613566756 & i7;
                    defpackage.blw blwVar2 = blwVar;
                    defpackage.bxi.t(z, i9, blwVar2, (defpackage.bve) obj, (i7 & (-920350135)) | i8 | (i10 >> 1) | ((i8 + i8) & i10));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void u(defpackage.cgf cgfVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1854833411);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        int i5 = 18;
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = defpackage.ato.d;
                bwcVar.ad(objS);
            }
            defpackage.cty ctyVar = (defpackage.cty) objS;
            long j = bwcVar.u;
            long j2 = j ^ (j >>> 32);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            int i6 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVar, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, i4));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i6 >> 6) & 14));
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(cgfVar, affgVar, i, i5);
        }
    }

    public static final defpackage.cjj v(defpackage.ctc ctcVar) {
        defpackage.cjj cjjVarF = defpackage.csc.f(ctcVar, true);
        long jN = ctcVar.n(cjjVarF.c());
        float f = cjjVarF.d;
        float f2 = cjjVarF.e;
        long j = jN >> 32;
        long jN2 = ctcVar.n((((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L));
        return new defpackage.cjj(java.lang.Float.intBitsToFloat((int) j), java.lang.Float.intBitsToFloat((int) (jN & 4294967295L)), java.lang.Float.intBitsToFloat((int) (jN2 >> 32)), java.lang.Float.intBitsToFloat((int) (jN2 & 4294967295L)));
    }

    public static final int w(defpackage.dga dgaVar, int i) {
        defpackage.dfb dfbVar = dgaVar.a.a;
        if (dfbVar.a() != 0) {
            int iG = dgaVar.g(i);
            if ((i != 0 && iG == dgaVar.g(i - 1)) || (i != dfbVar.a() && iG == dgaVar.g(i + 1))) {
                return dgaVar.p(i);
            }
        }
        return dgaVar.q(i);
    }

    public static final java.lang.Object x(defpackage.cri criVar, defpackage.bkb bkbVar, defpackage.beq beqVar, defpackage.afdk afdkVar) {
        java.lang.Object objAK = defpackage.ca.aK(criVar, new defpackage.bkw(new defpackage.bwk(criVar.n()), bkbVar, beqVar, null), afdkVar);
        return objAK == defpackage.afdr.a ? objAK : defpackage.afbk.a;
    }

    public static final boolean y(defpackage.dck dckVar, defpackage.crd crdVar, defpackage.crd crdVar2) {
        return defpackage.cji.a(defpackage.acmj.r(crdVar.c, crdVar2.c)) < defpackage.ca.aM(dckVar, crdVar.i);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[LOOP:0: B:19:0x004a->B:23:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object z(defpackage.cru r7, defpackage.afdk r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.bkv
            if (r0 == 0) goto L13
            r0 = r8
            bkv r0 = (defpackage.bkv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            bkv r0 = new bkv
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            afdr r1 = defpackage.afdr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cru r7 = r0.c
            defpackage.afga.cz(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.afga.cz(r8)
        L34:
            cqv r8 = defpackage.cqv.b
            r0.c = r7
            r0.b = r3
            java.lang.Object r8 = r7.r(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            cqu r8 = (defpackage.cqu) r8
            java.util.List r2 = r8.a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            crd r6 = (defpackage.crd) r6
            boolean r6 = defpackage.tq.i(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxi.z(cru, afdk):java.lang.Object");
    }
}
