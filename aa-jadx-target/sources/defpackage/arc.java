package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class arc {
    public static final defpackage.affh a = new defpackage.aom((defpackage.afdk) null, 2, (char[]) null);

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.cru r5, boolean r6, defpackage.cqv r7, defpackage.afdk r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.aqq
            if (r0 == 0) goto L13
            r0 = r8
            aqq r0 = (defpackage.aqq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqq r0 = new aqq
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            afdr r1 = defpackage.afdr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r5 = r0.a
            cqv r6 = r0.d
            cru r7 = r0.e
            defpackage.afga.cz(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4b
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            defpackage.afga.cz(r8)
        L3c:
            r0.e = r5
            r0.d = r7
            r0.a = r6
            r0.c = r3
            java.lang.Object r8 = r5.r(r7, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            cqu r8 = (defpackage.cqu) r8
            boolean r2 = f(r8, r6)
            if (r2 != 0) goto L54
            goto L3c
        L54:
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arc.a(cru, boolean, cqv, afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004d A[LOOP:0: B:19:0x004b->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[LOOP:1: B:22:0x005d->B:26:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x005f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.cru r7, defpackage.afdk r8) {
        /*
            boolean r0 = r8 instanceof defpackage.aqs
            if (r0 == 0) goto L13
            r0 = r8
            aqs r0 = (defpackage.aqs) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aqs r0 = new aqs
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
            r0.c = r7
            r0.b = r3
            cqv r8 = defpackage.cqv.b
            java.lang.Object r8 = r7.r(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            cqu r8 = (defpackage.cqu) r8
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L4b:
            if (r5 >= r2) goto L59
            java.lang.Object r6 = r8.get(r5)
            crd r6 = (defpackage.crd) r6
            r6.b()
            int r5 = r5 + 1
            goto L4b
        L59:
            int r2 = r8.size()
        L5d:
            if (r4 >= r2) goto L6d
            java.lang.Object r5 = r8.get(r4)
            crd r5 = (defpackage.crd) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L6a
            goto L34
        L6a:
            int r4 = r4 + 1
            goto L5d
        L6d:
            afbk r7 = defpackage.afbk.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arc.b(cru, afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object c(defpackage.cru cruVar, defpackage.cqv cqvVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.aqz aqzVar;
        defpackage.afgv afgvVar;
        if (afdkVar instanceof defpackage.aqz) {
            aqzVar = (defpackage.aqz) afdkVar;
            int i = aqzVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aqzVar.b = i - Integer.MIN_VALUE;
            } else {
                aqzVar = new defpackage.aqz(afdkVar);
            }
        } else {
            aqzVar = new defpackage.aqz(afdkVar);
        }
        java.lang.Object obj = aqzVar.a;
        java.lang.Object obj2 = defpackage.afdr.a;
        int i2 = aqzVar.b;
        try {
            if (i2 == 0) {
                defpackage.afga.cz(obj);
                defpackage.afgv afgvVar2 = new defpackage.afgv();
                afgvVar2.a = defpackage.apa.c;
                long jF = cruVar.q().f();
                defpackage.affg araVar = new defpackage.ara(cqvVar, afgvVar2, null);
                aqzVar.c = afgvVar2;
                aqzVar.b = 1;
                if (cruVar.s(jF, araVar, aqzVar) == obj2) {
                    return obj2;
                }
                afgvVar = afgvVar2;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                afgvVar = aqzVar.c;
                defpackage.afga.cz(obj);
            }
            return afgvVar.a;
        } catch (defpackage.cqw unused) {
            return defpackage.apc.c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4 A[LOOP:1: B:23:0x0071->B:46:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b1 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object d(defpackage.cru r17, defpackage.cqv r18, defpackage.afdk r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arc.d(cru, cqv, afdk):java.lang.Object");
    }

    public static /* synthetic */ java.lang.Object e(defpackage.cri criVar, defpackage.affh affhVar, defpackage.affc affcVar, defpackage.afdk afdkVar, int i) {
        if ((i & 4) != 0) {
            affhVar = a;
        }
        java.lang.Object objA = ahoi.a(new defpackage.aqw(criVar, affhVar, affcVar, null), afdkVar);
        return objA == defpackage.afdr.a ? objA : defpackage.afbk.a;
    }

    public static final boolean f(defpackage.cqu cquVar, boolean z) {
        java.util.List list = cquVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.crd crdVar = (defpackage.crd) list.get(i);
            if (!(z ? defpackage.tq.i(crdVar) : defpackage.tq.j(crdVar))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x017b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0197  */
    /* JADX WARN: Code duplicated, block: B:28:0x019a  */
    /* JADX WARN: Code duplicated, block: B:31:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:39:0x0203  */
    /* JADX WARN: Code duplicated, block: B:42:0x0229  */
    /* JADX WARN: Code duplicated, block: B:45:0x023c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0240  */
    /* JADX WARN: Code duplicated, block: B:49:0x024b  */
    /* JADX WARN: Code duplicated, block: B:51:0x024f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0257  */
    /* JADX WARN: Code duplicated, block: B:55:0x0267  */
    /* JADX WARN: Code duplicated, block: B:57:0x027e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0280 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0282  */
    /* JADX WARN: Code duplicated, block: B:60:0x028e  */
    /* JADX WARN: Code duplicated, block: B:62:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x02c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:73:0x0319  */
    /* JADX WARN: Code duplicated, block: B:75:0x0324  */
    /* JADX WARN: Code duplicated, block: B:77:0x0343 A[PHI: r0 r1 r4 r5 r6 r7 r9 r12 r13 r14
  0x0343: PHI (r0v43 crd) = (r0v27 crd), (r0v55 crd) binds: [B:76:0x0341, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0343: PHI (r1v31 aiwg) = (r1v25 aiwg), (r1v34 aiwg) binds: [B:76:0x0341, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0343: PHI (r4v33 crd) = (r4v25 crd), (r4v37 crd) binds: [B:76:0x0341, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0343: PHI (r5v28 cru) = (r5v17 cru), (r5v32 cru) binds: [B:76:0x0341, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0343: PHI (r6v25 affc) = (r6v16 affc), (r6v30 affc) binds: [B:76:0x0341, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0343: PHI (r7v26 java.lang.Object) = (r7v19 java.lang.Object), (r7v31 java.lang.Object) binds: [B:76:0x0341, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0343: PHI (r9v12 java.lang.Object) = (r9v9 java.lang.Object), (r9v15 java.lang.Object) binds: [B:76:0x0341, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0343: PHI (r12v20 affc) = (r12v16 affc), (r12v22 affc) binds: [B:76:0x0341, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0343: PHI (r13v17 aiuw) = (r13v14 aiuw), (r13v20 aiuw) binds: [B:76:0x0341, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0343: PHI (r14v20 apq) = (r14v17 apq), (r14v22 apq) binds: [B:76:0x0341, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x034d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0373  */
    /* JADX WARN: Code duplicated, block: B:84:0x038a  */
    /* JADX WARN: Code duplicated, block: B:86:0x038e  */
    /* JADX WARN: Code duplicated, block: B:87:0x039a  */
    /* JADX WARN: Code duplicated, block: B:89:0x039e  */
    /* JADX WARN: Code duplicated, block: B:91:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:92:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:94:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:95:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:99:0x03ec  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v31, types: [affc] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r5v25, types: [affc] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v34 */
    public static final java.lang.Object g(defpackage.cru cruVar, aiuw aiuwVar, defpackage.apq apqVar, defpackage.affh affhVar, defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.aqy aqyVar;
        defpackage.apq apqVar2;
        defpackage.affh affhVar2;
        defpackage.cru cruVar2;
        aiuw aiuwVar2;
        defpackage.affc affcVar2;
        java.lang.Object obj;
        defpackage.affc affcVar3;
        defpackage.crd crdVar;
        aiwg aiwgVarD;
        defpackage.apq apqVar3;
        defpackage.crd crdVar2;
        java.lang.Object objC;
        defpackage.affc affcVar4;
        aiwg aiwgVar;
        defpackage.cru cruVar3;
        defpackage.apq apqVar4;
        java.lang.Object obj2;
        java.lang.Object objD;
        java.lang.Object obj3;
        aiuw aiuwVar3;
        defpackage.apq apqVar5;
        defpackage.cru cruVar4;
        defpackage.crd crdVar3;
        defpackage.apq apqVar6;
        aiwg aiwgVarD2;
        java.lang.Object objT;
        defpackage.affc affcVar5;
        defpackage.crd crdVar4;
        java.lang.Object obj4;
        defpackage.affh affhVar3;
        defpackage.cru cruVar5;
        defpackage.ca caVar;
        aiuw aiuwVar4;
        defpackage.apq apqVar7;
        defpackage.crd crdVar5;
        aiwg aiwgVarD3;
        defpackage.crd crdVar6;
        java.lang.Object objC2;
        java.lang.Object objD2;
        aiwg aiwgVar2;
        java.lang.Object obj5;
        aiuw aiuwVar5;
        defpackage.apq apqVar8;
        defpackage.crd crdVar7;
        java.lang.Object obj6;
        defpackage.crd crdVar8;
        ?? r5;
        ?? r4;
        defpackage.ca caVar2;
        aiwg aiwgVar3;
        aiuw aiuwVar6;
        defpackage.apq apqVar9;
        if (afdkVar instanceof defpackage.aqy) {
            aqyVar = (defpackage.aqy) afdkVar;
            int i = aqyVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                aqyVar.k = i - Integer.MIN_VALUE;
            } else {
                aqyVar = new defpackage.aqy(afdkVar);
            }
        } else {
            aqyVar = new defpackage.aqy(afdkVar);
        }
        java.lang.Object obj7 = aqyVar.j;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        switch (aqyVar.k) {
            case defpackage.abnt.b /* 0 */:
                defpackage.afga.cz(obj7);
                aqyVar.a = cruVar;
                aqyVar.b = aiuwVar;
                apqVar2 = apqVar;
                aqyVar.c = apqVar2;
                aqyVar.d = null;
                aqyVar.e = null;
                affhVar2 = affhVar;
                aqyVar.f = affhVar2;
                aqyVar.g = affcVar;
                aqyVar.k = 1;
                java.lang.Object objA = a(cruVar, true, defpackage.cqv.b, aqyVar);
                if (objA != afdrVar) {
                    cruVar2 = cruVar;
                    aiuwVar2 = aiuwVar;
                    affcVar2 = affcVar;
                    obj7 = objA;
                    obj = null;
                    affcVar3 = null;
                    crdVar = (defpackage.crd) obj7;
                    crdVar.b();
                    aiwgVarD = ahoc.d(aiuwVar2, (defpackage.afdo) null, 4, new defpackage.adh(apqVar2, (defpackage.afdk) null, 11, (byte[]) null), 1);
                    if (affhVar2 != a) {
                        defpackage.apq apqVar10 = apqVar2;
                        apqVar3 = apqVar10;
                        ahoc.d(aiuwVar2, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVarD, new defpackage.ait(affhVar2, apqVar10, crdVar, (defpackage.afdk) null, 8, (byte[]) null), (defpackage.afdk) null, 0), 1);
                    } else {
                        apqVar3 = apqVar2;
                    }
                    if (affcVar3 == null) {
                        aqyVar.a = cruVar2;
                        aqyVar.b = aiuwVar2;
                        aqyVar.c = apqVar3;
                        aqyVar.d = obj;
                        aqyVar.e = null;
                        aqyVar.f = affhVar2;
                        aqyVar.g = affcVar2;
                        aqyVar.h = aiwgVarD;
                        aqyVar.k = 2;
                        objD = d(cruVar2, defpackage.cqv.b, aqyVar);
                        if (objD != afdrVar) {
                            affcVar4 = affcVar2;
                            aiwgVar = aiwgVarD;
                            obj7 = objD;
                            defpackage.affc affcVar6 = affcVar3;
                            obj3 = obj;
                            affcVar3 = affcVar6;
                            defpackage.cru cruVar6 = cruVar2;
                            aiuwVar3 = aiuwVar2;
                            apqVar5 = apqVar3;
                            cruVar4 = cruVar6;
                            crdVar3 = (defpackage.crd) obj7;
                            cruVar3 = cruVar4;
                            apqVar6 = apqVar5;
                            if (crdVar3 == null) {
                                aiwgVarD2 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar6, (defpackage.afdk) null, 5, (short[]) null), (defpackage.afdk) null, 0), 1);
                            } else {
                                crdVar3.b();
                                aiwgVarD2 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar6, (defpackage.afdk) null, 6, (int[]) null), (defpackage.afdk) null, 0), 1);
                            }
                            if (crdVar3 != null) {
                                if (obj3 == null) {
                                    aqyVar.a = cruVar3;
                                    aqyVar.b = aiuwVar3;
                                    aqyVar.c = apqVar6;
                                    aqyVar.d = obj3;
                                    aqyVar.e = affcVar3;
                                    aqyVar.f = affhVar2;
                                    aqyVar.g = affcVar4;
                                    aqyVar.h = crdVar3;
                                    aqyVar.i = aiwgVarD2;
                                    aqyVar.k = 5;
                                    objT = cruVar3.t(cruVar3.q().e(), new defpackage.aqr(crdVar3, null), aqyVar);
                                    if (objT != afdrVar) {
                                        affcVar5 = affcVar4;
                                        crdVar4 = crdVar3;
                                        obj7 = objT;
                                        obj4 = obj3;
                                        affhVar3 = affhVar2;
                                        cruVar5 = cruVar3;
                                        crdVar5 = (defpackage.crd) obj7;
                                        if (crdVar5 != null) {
                                            aiwgVarD3 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.ais(aiwgVarD2, apqVar6, (defpackage.afdk) null, 12), 1);
                                            if (affhVar3 != a) {
                                                ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVarD3, new defpackage.ait(affhVar3, apqVar6, crdVar5, (defpackage.afdk) null, 9, (char[]) null), (defpackage.afdk) null, 0), 1);
                                            }
                                            if (affcVar3 == null) {
                                                aqyVar.a = aiuwVar3;
                                                aqyVar.b = apqVar6;
                                                aqyVar.c = obj4;
                                                aqyVar.d = affcVar5;
                                                aqyVar.e = aiwgVarD3;
                                                aqyVar.f = crdVar4;
                                                aqyVar.g = null;
                                                aqyVar.h = null;
                                                aqyVar.i = null;
                                                aqyVar.k = 6;
                                                objD2 = d(cruVar5, defpackage.cqv.b, aqyVar);
                                                if (objD2 != afdrVar) {
                                                    aiwgVar2 = aiwgVarD3;
                                                    obj5 = obj4;
                                                    aiuwVar5 = aiuwVar3;
                                                    apqVar8 = apqVar6;
                                                    obj7 = objD2;
                                                    crdVar7 = crdVar4;
                                                    obj6 = affcVar5;
                                                    crdVar8 = (defpackage.crd) obj7;
                                                    r4 = obj6;
                                                    r5 = obj5;
                                                    if (crdVar8 != null) {
                                                        crdVar8.b();
                                                        ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                                        r5.invoke(new defpackage.cji(crdVar8.c));
                                                    } else {
                                                        ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                                        if (r4 != 0) {
                                                            r4.invoke(new defpackage.cji(crdVar7.c));
                                                        }
                                                    }
                                                }
                                            } else {
                                                aqyVar.a = cruVar5;
                                                aqyVar.b = aiuwVar3;
                                                aqyVar.c = apqVar6;
                                                aqyVar.d = obj4;
                                                aqyVar.e = affcVar3;
                                                aqyVar.f = affcVar5;
                                                aqyVar.g = aiwgVarD3;
                                                aqyVar.h = crdVar4;
                                                crdVar6 = crdVar5;
                                                aqyVar.i = crdVar6;
                                                aqyVar.k = 7;
                                                objC2 = c(cruVar5, defpackage.cqv.b, aqyVar);
                                                if (objC2 != afdrVar) {
                                                    caVar2 = (defpackage.ca) objC2;
                                                    if (defpackage.afga.f(caVar2, defpackage.apc.c)) {
                                                        affcVar3.invoke(new defpackage.cji(crdVar6.c));
                                                        aqyVar.a = aiuwVar3;
                                                        aqyVar.b = apqVar6;
                                                        aqyVar.c = aiwgVarD3;
                                                        aqyVar.d = null;
                                                        aqyVar.e = null;
                                                        aqyVar.f = null;
                                                        aqyVar.g = null;
                                                        aqyVar.h = null;
                                                        aqyVar.i = null;
                                                        aqyVar.k = 8;
                                                        if (b(cruVar5, aqyVar) != afdrVar) {
                                                            aiwgVar3 = aiwgVarD3;
                                                            aiuwVar6 = aiuwVar3;
                                                            apqVar9 = apqVar6;
                                                            ahoc.d(aiuwVar6, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar3, new defpackage.aiv(apqVar9, (defpackage.afdk) null, 9, (byte[][]) null), (defpackage.afdk) null, 0), 1);
                                                            return defpackage.afbk.a;
                                                        }
                                                    } else {
                                                        if (caVar2 instanceof defpackage.apb) {
                                                            aiwgVar2 = aiwgVarD3;
                                                            r5 = obj4;
                                                            aiuwVar5 = aiuwVar3;
                                                            apqVar8 = apqVar6;
                                                            crdVar8 = ((defpackage.apb) caVar2).c;
                                                            crdVar7 = crdVar4;
                                                            r4 = affcVar5;
                                                        } else {
                                                            if (caVar2 instanceof defpackage.apa) {
                                                                throw new defpackage.afas();
                                                            }
                                                            aiwgVar2 = aiwgVarD3;
                                                            crdVar7 = crdVar4;
                                                            r5 = obj4;
                                                            crdVar8 = null;
                                                            r4 = affcVar5;
                                                            aiuwVar5 = aiuwVar3;
                                                            apqVar8 = apqVar6;
                                                        }
                                                        if (crdVar8 != null) {
                                                            crdVar8.b();
                                                            ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                                            r5.invoke(new defpackage.cji(crdVar8.c));
                                                        } else {
                                                            ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                                            if (r4 != 0) {
                                                                r4.invoke(new defpackage.cji(crdVar7.c));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (affcVar5 != null) {
                                            affcVar5.invoke(new defpackage.cji(crdVar4.c));
                                        }
                                    }
                                } else if (affcVar4 != null) {
                                    affcVar4.invoke(new defpackage.cji(crdVar3.c));
                                }
                            }
                            return defpackage.afbk.a;
                        }
                    } else {
                        aqyVar.a = cruVar2;
                        aqyVar.b = aiuwVar2;
                        aqyVar.c = apqVar3;
                        aqyVar.d = obj;
                        aqyVar.e = affcVar3;
                        aqyVar.f = affhVar2;
                        aqyVar.g = affcVar2;
                        crdVar2 = crdVar;
                        aqyVar.h = crdVar2;
                        aqyVar.i = aiwgVarD;
                        aqyVar.k = 3;
                        objC = c(cruVar2, defpackage.cqv.b, aqyVar);
                        if (objC != afdrVar) {
                            defpackage.affh affhVar4 = affhVar2;
                            affcVar4 = affcVar2;
                            aiwgVar = aiwgVarD;
                            obj7 = objC;
                            cruVar3 = cruVar2;
                            apqVar4 = apqVar3;
                            obj2 = obj;
                            affhVar2 = affhVar4;
                            caVar = (defpackage.ca) obj7;
                            if (!defpackage.afga.f(caVar, defpackage.apc.c)) {
                                if (caVar instanceof defpackage.apb) {
                                    crdVar3 = ((defpackage.apb) caVar).c;
                                } else {
                                    if (!(caVar instanceof defpackage.apa)) {
                                        throw new defpackage.afas();
                                    }
                                    crdVar3 = null;
                                }
                                obj3 = obj2;
                                apqVar6 = apqVar4;
                                aiuwVar3 = aiuwVar2;
                                if (crdVar3 == null) {
                                    aiwgVarD2 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar6, (defpackage.afdk) null, 5, (short[]) null), (defpackage.afdk) null, 0), 1);
                                } else {
                                    crdVar3.b();
                                    aiwgVarD2 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar6, (defpackage.afdk) null, 6, (int[]) null), (defpackage.afdk) null, 0), 1);
                                }
                                if (crdVar3 != null) {
                                    if (obj3 == null) {
                                        aqyVar.a = cruVar3;
                                        aqyVar.b = aiuwVar3;
                                        aqyVar.c = apqVar6;
                                        aqyVar.d = obj3;
                                        aqyVar.e = affcVar3;
                                        aqyVar.f = affhVar2;
                                        aqyVar.g = affcVar4;
                                        aqyVar.h = crdVar3;
                                        aqyVar.i = aiwgVarD2;
                                        aqyVar.k = 5;
                                        objT = cruVar3.t(cruVar3.q().e(), new defpackage.aqr(crdVar3, null), aqyVar);
                                        if (objT != afdrVar) {
                                            affcVar5 = affcVar4;
                                            crdVar4 = crdVar3;
                                            obj7 = objT;
                                            obj4 = obj3;
                                            affhVar3 = affhVar2;
                                            cruVar5 = cruVar3;
                                            crdVar5 = (defpackage.crd) obj7;
                                            if (crdVar5 != null) {
                                                aiwgVarD3 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.ais(aiwgVarD2, apqVar6, (defpackage.afdk) null, 12), 1);
                                                if (affhVar3 != a) {
                                                    ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVarD3, new defpackage.ait(affhVar3, apqVar6, crdVar5, (defpackage.afdk) null, 9, (char[]) null), (defpackage.afdk) null, 0), 1);
                                                }
                                                if (affcVar3 == null) {
                                                    aqyVar.a = aiuwVar3;
                                                    aqyVar.b = apqVar6;
                                                    aqyVar.c = obj4;
                                                    aqyVar.d = affcVar5;
                                                    aqyVar.e = aiwgVarD3;
                                                    aqyVar.f = crdVar4;
                                                    aqyVar.g = null;
                                                    aqyVar.h = null;
                                                    aqyVar.i = null;
                                                    aqyVar.k = 6;
                                                    objD2 = d(cruVar5, defpackage.cqv.b, aqyVar);
                                                    if (objD2 != afdrVar) {
                                                        aiwgVar2 = aiwgVarD3;
                                                        obj5 = obj4;
                                                        aiuwVar5 = aiuwVar3;
                                                        apqVar8 = apqVar6;
                                                        obj7 = objD2;
                                                        crdVar7 = crdVar4;
                                                        obj6 = affcVar5;
                                                        crdVar8 = (defpackage.crd) obj7;
                                                        r4 = obj6;
                                                        r5 = obj5;
                                                        if (crdVar8 != null) {
                                                            crdVar8.b();
                                                            ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                                            r5.invoke(new defpackage.cji(crdVar8.c));
                                                        } else {
                                                            ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                                            if (r4 != 0) {
                                                                r4.invoke(new defpackage.cji(crdVar7.c));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    aqyVar.a = cruVar5;
                                                    aqyVar.b = aiuwVar3;
                                                    aqyVar.c = apqVar6;
                                                    aqyVar.d = obj4;
                                                    aqyVar.e = affcVar3;
                                                    aqyVar.f = affcVar5;
                                                    aqyVar.g = aiwgVarD3;
                                                    aqyVar.h = crdVar4;
                                                    crdVar6 = crdVar5;
                                                    aqyVar.i = crdVar6;
                                                    aqyVar.k = 7;
                                                    objC2 = c(cruVar5, defpackage.cqv.b, aqyVar);
                                                    if (objC2 != afdrVar) {
                                                        caVar2 = (defpackage.ca) objC2;
                                                        if (defpackage.afga.f(caVar2, defpackage.apc.c)) {
                                                            affcVar3.invoke(new defpackage.cji(crdVar6.c));
                                                            aqyVar.a = aiuwVar3;
                                                            aqyVar.b = apqVar6;
                                                            aqyVar.c = aiwgVarD3;
                                                            aqyVar.d = null;
                                                            aqyVar.e = null;
                                                            aqyVar.f = null;
                                                            aqyVar.g = null;
                                                            aqyVar.h = null;
                                                            aqyVar.i = null;
                                                            aqyVar.k = 8;
                                                            if (b(cruVar5, aqyVar) != afdrVar) {
                                                                aiwgVar3 = aiwgVarD3;
                                                                aiuwVar6 = aiuwVar3;
                                                                apqVar9 = apqVar6;
                                                                ahoc.d(aiuwVar6, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar3, new defpackage.aiv(apqVar9, (defpackage.afdk) null, 9, (byte[][]) null), (defpackage.afdk) null, 0), 1);
                                                                return defpackage.afbk.a;
                                                            }
                                                        } else {
                                                            if (caVar2 instanceof defpackage.apb) {
                                                                aiwgVar2 = aiwgVarD3;
                                                                r5 = obj4;
                                                                aiuwVar5 = aiuwVar3;
                                                                apqVar8 = apqVar6;
                                                                crdVar8 = ((defpackage.apb) caVar2).c;
                                                                crdVar7 = crdVar4;
                                                                r4 = affcVar5;
                                                            } else {
                                                                if (caVar2 instanceof defpackage.apa) {
                                                                    throw new defpackage.afas();
                                                                }
                                                                aiwgVar2 = aiwgVarD3;
                                                                crdVar7 = crdVar4;
                                                                r5 = obj4;
                                                                crdVar8 = null;
                                                                r4 = affcVar5;
                                                                aiuwVar5 = aiuwVar3;
                                                                apqVar8 = apqVar6;
                                                            }
                                                            if (crdVar8 != null) {
                                                                crdVar8.b();
                                                                ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                                                r5.invoke(new defpackage.cji(crdVar8.c));
                                                            } else {
                                                                ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                                                if (r4 != 0) {
                                                                    r4.invoke(new defpackage.cji(crdVar7.c));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (affcVar5 != null) {
                                                affcVar5.invoke(new defpackage.cji(crdVar4.c));
                                            }
                                        }
                                    } else if (affcVar4 != null) {
                                        affcVar4.invoke(new defpackage.cji(crdVar3.c));
                                    }
                                }
                                return defpackage.afbk.a;
                            }
                            affcVar3.invoke(new defpackage.cji(crdVar2.c));
                            aqyVar.a = aiuwVar2;
                            aqyVar.b = apqVar4;
                            aqyVar.c = aiwgVar;
                            aqyVar.d = null;
                            aqyVar.e = null;
                            aqyVar.f = null;
                            aqyVar.g = null;
                            aqyVar.h = null;
                            aqyVar.i = null;
                            aqyVar.k = 4;
                            if (b(cruVar3, aqyVar) != afdrVar) {
                                aiuwVar4 = aiuwVar2;
                                apqVar7 = apqVar4;
                                ahoc.d(aiuwVar4, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar7, (defpackage.afdk) null, 4, (char[]) null), (defpackage.afdk) null, 0), 1);
                                return defpackage.afbk.a;
                            }
                        }
                    }
                }
                return afdrVar;
            case 1:
                affcVar2 = (defpackage.affc) aqyVar.g;
                defpackage.affh affhVar5 = (defpackage.affh) aqyVar.f;
                defpackage.affc affcVar7 = (defpackage.affc) aqyVar.e;
                obj = aqyVar.d;
                defpackage.apq apqVar11 = (defpackage.apq) aqyVar.c;
                aiuwVar2 = (aiuw) aqyVar.b;
                cruVar2 = (defpackage.cru) aqyVar.a;
                defpackage.afga.cz(obj7);
                affhVar2 = affhVar5;
                apqVar2 = apqVar11;
                affcVar3 = affcVar7;
                crdVar = (defpackage.crd) obj7;
                crdVar.b();
                aiwgVarD = ahoc.d(aiuwVar2, (defpackage.afdo) null, 4, new defpackage.adh(apqVar2, (defpackage.afdk) null, 11, (byte[]) null), 1);
                if (affhVar2 != a) {
                    defpackage.apq apqVar12 = apqVar2;
                    apqVar3 = apqVar12;
                    ahoc.d(aiuwVar2, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVarD, new defpackage.ait(affhVar2, apqVar12, crdVar, (defpackage.afdk) null, 8, (byte[]) null), (defpackage.afdk) null, 0), 1);
                } else {
                    apqVar3 = apqVar2;
                }
                if (affcVar3 == null) {
                    aqyVar.a = cruVar2;
                    aqyVar.b = aiuwVar2;
                    aqyVar.c = apqVar3;
                    aqyVar.d = obj;
                    aqyVar.e = null;
                    aqyVar.f = affhVar2;
                    aqyVar.g = affcVar2;
                    aqyVar.h = aiwgVarD;
                    aqyVar.k = 2;
                    objD = d(cruVar2, defpackage.cqv.b, aqyVar);
                    if (objD != afdrVar) {
                        affcVar4 = affcVar2;
                        aiwgVar = aiwgVarD;
                        obj7 = objD;
                        defpackage.affc affcVar8 = affcVar3;
                        obj3 = obj;
                        affcVar3 = affcVar8;
                        defpackage.cru cruVar7 = cruVar2;
                        aiuwVar3 = aiuwVar2;
                        apqVar5 = apqVar3;
                        cruVar4 = cruVar7;
                        crdVar3 = (defpackage.crd) obj7;
                        cruVar3 = cruVar4;
                        apqVar6 = apqVar5;
                        if (crdVar3 == null) {
                            aiwgVarD2 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar6, (defpackage.afdk) null, 5, (short[]) null), (defpackage.afdk) null, 0), 1);
                        } else {
                            crdVar3.b();
                            aiwgVarD2 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar6, (defpackage.afdk) null, 6, (int[]) null), (defpackage.afdk) null, 0), 1);
                        }
                        if (crdVar3 != null) {
                            if (obj3 == null) {
                                aqyVar.a = cruVar3;
                                aqyVar.b = aiuwVar3;
                                aqyVar.c = apqVar6;
                                aqyVar.d = obj3;
                                aqyVar.e = affcVar3;
                                aqyVar.f = affhVar2;
                                aqyVar.g = affcVar4;
                                aqyVar.h = crdVar3;
                                aqyVar.i = aiwgVarD2;
                                aqyVar.k = 5;
                                objT = cruVar3.t(cruVar3.q().e(), new defpackage.aqr(crdVar3, null), aqyVar);
                                if (objT != afdrVar) {
                                    affcVar5 = affcVar4;
                                    crdVar4 = crdVar3;
                                    obj7 = objT;
                                    obj4 = obj3;
                                    affhVar3 = affhVar2;
                                    cruVar5 = cruVar3;
                                    crdVar5 = (defpackage.crd) obj7;
                                    if (crdVar5 != null) {
                                        aiwgVarD3 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.ais(aiwgVarD2, apqVar6, (defpackage.afdk) null, 12), 1);
                                        if (affhVar3 != a) {
                                            ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVarD3, new defpackage.ait(affhVar3, apqVar6, crdVar5, (defpackage.afdk) null, 9, (char[]) null), (defpackage.afdk) null, 0), 1);
                                        }
                                        if (affcVar3 == null) {
                                            aqyVar.a = aiuwVar3;
                                            aqyVar.b = apqVar6;
                                            aqyVar.c = obj4;
                                            aqyVar.d = affcVar5;
                                            aqyVar.e = aiwgVarD3;
                                            aqyVar.f = crdVar4;
                                            aqyVar.g = null;
                                            aqyVar.h = null;
                                            aqyVar.i = null;
                                            aqyVar.k = 6;
                                            objD2 = d(cruVar5, defpackage.cqv.b, aqyVar);
                                            if (objD2 != afdrVar) {
                                                aiwgVar2 = aiwgVarD3;
                                                obj5 = obj4;
                                                aiuwVar5 = aiuwVar3;
                                                apqVar8 = apqVar6;
                                                obj7 = objD2;
                                                crdVar7 = crdVar4;
                                                obj6 = affcVar5;
                                                crdVar8 = (defpackage.crd) obj7;
                                                r4 = obj6;
                                                r5 = obj5;
                                                if (crdVar8 != null) {
                                                    crdVar8.b();
                                                    ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                                    r5.invoke(new defpackage.cji(crdVar8.c));
                                                } else {
                                                    ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                                    if (r4 != 0) {
                                                        r4.invoke(new defpackage.cji(crdVar7.c));
                                                    }
                                                }
                                            }
                                        } else {
                                            aqyVar.a = cruVar5;
                                            aqyVar.b = aiuwVar3;
                                            aqyVar.c = apqVar6;
                                            aqyVar.d = obj4;
                                            aqyVar.e = affcVar3;
                                            aqyVar.f = affcVar5;
                                            aqyVar.g = aiwgVarD3;
                                            aqyVar.h = crdVar4;
                                            crdVar6 = crdVar5;
                                            aqyVar.i = crdVar6;
                                            aqyVar.k = 7;
                                            objC2 = c(cruVar5, defpackage.cqv.b, aqyVar);
                                            if (objC2 != afdrVar) {
                                                caVar2 = (defpackage.ca) objC2;
                                                if (defpackage.afga.f(caVar2, defpackage.apc.c)) {
                                                    affcVar3.invoke(new defpackage.cji(crdVar6.c));
                                                    aqyVar.a = aiuwVar3;
                                                    aqyVar.b = apqVar6;
                                                    aqyVar.c = aiwgVarD3;
                                                    aqyVar.d = null;
                                                    aqyVar.e = null;
                                                    aqyVar.f = null;
                                                    aqyVar.g = null;
                                                    aqyVar.h = null;
                                                    aqyVar.i = null;
                                                    aqyVar.k = 8;
                                                    if (b(cruVar5, aqyVar) != afdrVar) {
                                                        aiwgVar3 = aiwgVarD3;
                                                        aiuwVar6 = aiuwVar3;
                                                        apqVar9 = apqVar6;
                                                        ahoc.d(aiuwVar6, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar3, new defpackage.aiv(apqVar9, (defpackage.afdk) null, 9, (byte[][]) null), (defpackage.afdk) null, 0), 1);
                                                        return defpackage.afbk.a;
                                                    }
                                                } else {
                                                    if (caVar2 instanceof defpackage.apb) {
                                                        aiwgVar2 = aiwgVarD3;
                                                        r5 = obj4;
                                                        aiuwVar5 = aiuwVar3;
                                                        apqVar8 = apqVar6;
                                                        crdVar8 = ((defpackage.apb) caVar2).c;
                                                        crdVar7 = crdVar4;
                                                        r4 = affcVar5;
                                                    } else {
                                                        if (caVar2 instanceof defpackage.apa) {
                                                            throw new defpackage.afas();
                                                        }
                                                        aiwgVar2 = aiwgVarD3;
                                                        crdVar7 = crdVar4;
                                                        r5 = obj4;
                                                        crdVar8 = null;
                                                        r4 = affcVar5;
                                                        aiuwVar5 = aiuwVar3;
                                                        apqVar8 = apqVar6;
                                                    }
                                                    if (crdVar8 != null) {
                                                        crdVar8.b();
                                                        ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                                        r5.invoke(new defpackage.cji(crdVar8.c));
                                                    } else {
                                                        ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                                        if (r4 != 0) {
                                                            r4.invoke(new defpackage.cji(crdVar7.c));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (affcVar5 != null) {
                                        affcVar5.invoke(new defpackage.cji(crdVar4.c));
                                    }
                                }
                            } else if (affcVar4 != null) {
                                affcVar4.invoke(new defpackage.cji(crdVar3.c));
                            }
                        }
                        return defpackage.afbk.a;
                    }
                } else {
                    aqyVar.a = cruVar2;
                    aqyVar.b = aiuwVar2;
                    aqyVar.c = apqVar3;
                    aqyVar.d = obj;
                    aqyVar.e = affcVar3;
                    aqyVar.f = affhVar2;
                    aqyVar.g = affcVar2;
                    crdVar2 = crdVar;
                    aqyVar.h = crdVar2;
                    aqyVar.i = aiwgVarD;
                    aqyVar.k = 3;
                    objC = c(cruVar2, defpackage.cqv.b, aqyVar);
                    if (objC != afdrVar) {
                        defpackage.affh affhVar6 = affhVar2;
                        affcVar4 = affcVar2;
                        aiwgVar = aiwgVarD;
                        obj7 = objC;
                        cruVar3 = cruVar2;
                        apqVar4 = apqVar3;
                        obj2 = obj;
                        affhVar2 = affhVar6;
                        caVar = (defpackage.ca) obj7;
                        if (!defpackage.afga.f(caVar, defpackage.apc.c)) {
                            if (caVar instanceof defpackage.apb) {
                                crdVar3 = ((defpackage.apb) caVar).c;
                            } else {
                                if (!(caVar instanceof defpackage.apa)) {
                                    throw new defpackage.afas();
                                }
                                crdVar3 = null;
                            }
                            obj3 = obj2;
                            apqVar6 = apqVar4;
                            aiuwVar3 = aiuwVar2;
                            if (crdVar3 == null) {
                                aiwgVarD2 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar6, (defpackage.afdk) null, 5, (short[]) null), (defpackage.afdk) null, 0), 1);
                            } else {
                                crdVar3.b();
                                aiwgVarD2 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar6, (defpackage.afdk) null, 6, (int[]) null), (defpackage.afdk) null, 0), 1);
                            }
                            if (crdVar3 != null) {
                                if (obj3 == null) {
                                    aqyVar.a = cruVar3;
                                    aqyVar.b = aiuwVar3;
                                    aqyVar.c = apqVar6;
                                    aqyVar.d = obj3;
                                    aqyVar.e = affcVar3;
                                    aqyVar.f = affhVar2;
                                    aqyVar.g = affcVar4;
                                    aqyVar.h = crdVar3;
                                    aqyVar.i = aiwgVarD2;
                                    aqyVar.k = 5;
                                    objT = cruVar3.t(cruVar3.q().e(), new defpackage.aqr(crdVar3, null), aqyVar);
                                    if (objT != afdrVar) {
                                        affcVar5 = affcVar4;
                                        crdVar4 = crdVar3;
                                        obj7 = objT;
                                        obj4 = obj3;
                                        affhVar3 = affhVar2;
                                        cruVar5 = cruVar3;
                                        crdVar5 = (defpackage.crd) obj7;
                                        if (crdVar5 != null) {
                                            aiwgVarD3 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.ais(aiwgVarD2, apqVar6, (defpackage.afdk) null, 12), 1);
                                            if (affhVar3 != a) {
                                                ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVarD3, new defpackage.ait(affhVar3, apqVar6, crdVar5, (defpackage.afdk) null, 9, (char[]) null), (defpackage.afdk) null, 0), 1);
                                            }
                                            if (affcVar3 == null) {
                                                aqyVar.a = aiuwVar3;
                                                aqyVar.b = apqVar6;
                                                aqyVar.c = obj4;
                                                aqyVar.d = affcVar5;
                                                aqyVar.e = aiwgVarD3;
                                                aqyVar.f = crdVar4;
                                                aqyVar.g = null;
                                                aqyVar.h = null;
                                                aqyVar.i = null;
                                                aqyVar.k = 6;
                                                objD2 = d(cruVar5, defpackage.cqv.b, aqyVar);
                                                if (objD2 != afdrVar) {
                                                    aiwgVar2 = aiwgVarD3;
                                                    obj5 = obj4;
                                                    aiuwVar5 = aiuwVar3;
                                                    apqVar8 = apqVar6;
                                                    obj7 = objD2;
                                                    crdVar7 = crdVar4;
                                                    obj6 = affcVar5;
                                                    crdVar8 = (defpackage.crd) obj7;
                                                    r4 = obj6;
                                                    r5 = obj5;
                                                    if (crdVar8 != null) {
                                                        crdVar8.b();
                                                        ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                                        r5.invoke(new defpackage.cji(crdVar8.c));
                                                    } else {
                                                        ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                                        if (r4 != 0) {
                                                            r4.invoke(new defpackage.cji(crdVar7.c));
                                                        }
                                                    }
                                                }
                                            } else {
                                                aqyVar.a = cruVar5;
                                                aqyVar.b = aiuwVar3;
                                                aqyVar.c = apqVar6;
                                                aqyVar.d = obj4;
                                                aqyVar.e = affcVar3;
                                                aqyVar.f = affcVar5;
                                                aqyVar.g = aiwgVarD3;
                                                aqyVar.h = crdVar4;
                                                crdVar6 = crdVar5;
                                                aqyVar.i = crdVar6;
                                                aqyVar.k = 7;
                                                objC2 = c(cruVar5, defpackage.cqv.b, aqyVar);
                                                if (objC2 != afdrVar) {
                                                    caVar2 = (defpackage.ca) objC2;
                                                    if (defpackage.afga.f(caVar2, defpackage.apc.c)) {
                                                        affcVar3.invoke(new defpackage.cji(crdVar6.c));
                                                        aqyVar.a = aiuwVar3;
                                                        aqyVar.b = apqVar6;
                                                        aqyVar.c = aiwgVarD3;
                                                        aqyVar.d = null;
                                                        aqyVar.e = null;
                                                        aqyVar.f = null;
                                                        aqyVar.g = null;
                                                        aqyVar.h = null;
                                                        aqyVar.i = null;
                                                        aqyVar.k = 8;
                                                        if (b(cruVar5, aqyVar) != afdrVar) {
                                                            aiwgVar3 = aiwgVarD3;
                                                            aiuwVar6 = aiuwVar3;
                                                            apqVar9 = apqVar6;
                                                            ahoc.d(aiuwVar6, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar3, new defpackage.aiv(apqVar9, (defpackage.afdk) null, 9, (byte[][]) null), (defpackage.afdk) null, 0), 1);
                                                            return defpackage.afbk.a;
                                                        }
                                                    } else {
                                                        if (caVar2 instanceof defpackage.apb) {
                                                            aiwgVar2 = aiwgVarD3;
                                                            r5 = obj4;
                                                            aiuwVar5 = aiuwVar3;
                                                            apqVar8 = apqVar6;
                                                            crdVar8 = ((defpackage.apb) caVar2).c;
                                                            crdVar7 = crdVar4;
                                                            r4 = affcVar5;
                                                        } else {
                                                            if (caVar2 instanceof defpackage.apa) {
                                                                throw new defpackage.afas();
                                                            }
                                                            aiwgVar2 = aiwgVarD3;
                                                            crdVar7 = crdVar4;
                                                            r5 = obj4;
                                                            crdVar8 = null;
                                                            r4 = affcVar5;
                                                            aiuwVar5 = aiuwVar3;
                                                            apqVar8 = apqVar6;
                                                        }
                                                        if (crdVar8 != null) {
                                                            crdVar8.b();
                                                            ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                                            r5.invoke(new defpackage.cji(crdVar8.c));
                                                        } else {
                                                            ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                                            if (r4 != 0) {
                                                                r4.invoke(new defpackage.cji(crdVar7.c));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (affcVar5 != null) {
                                            affcVar5.invoke(new defpackage.cji(crdVar4.c));
                                        }
                                    }
                                } else if (affcVar4 != null) {
                                    affcVar4.invoke(new defpackage.cji(crdVar3.c));
                                }
                            }
                            return defpackage.afbk.a;
                        }
                        affcVar3.invoke(new defpackage.cji(crdVar2.c));
                        aqyVar.a = aiuwVar2;
                        aqyVar.b = apqVar4;
                        aqyVar.c = aiwgVar;
                        aqyVar.d = null;
                        aqyVar.e = null;
                        aqyVar.f = null;
                        aqyVar.g = null;
                        aqyVar.h = null;
                        aqyVar.i = null;
                        aqyVar.k = 4;
                        if (b(cruVar3, aqyVar) != afdrVar) {
                            aiuwVar4 = aiuwVar2;
                            apqVar7 = apqVar4;
                            ahoc.d(aiuwVar4, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar7, (defpackage.afdk) null, 4, (char[]) null), (defpackage.afdk) null, 0), 1);
                            return defpackage.afbk.a;
                        }
                    }
                }
                return afdrVar;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                aiwgVar = (aiwg) aqyVar.h;
                affcVar4 = (defpackage.affc) aqyVar.g;
                affhVar2 = (defpackage.affh) aqyVar.f;
                affcVar3 = (defpackage.affc) aqyVar.e;
                obj3 = aqyVar.d;
                apqVar5 = (defpackage.apq) aqyVar.c;
                aiuwVar3 = (aiuw) aqyVar.b;
                cruVar4 = (defpackage.cru) aqyVar.a;
                defpackage.afga.cz(obj7);
                crdVar3 = (defpackage.crd) obj7;
                cruVar3 = cruVar4;
                apqVar6 = apqVar5;
                if (crdVar3 == null) {
                    aiwgVarD2 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar6, (defpackage.afdk) null, 5, (short[]) null), (defpackage.afdk) null, 0), 1);
                } else {
                    crdVar3.b();
                    aiwgVarD2 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar6, (defpackage.afdk) null, 6, (int[]) null), (defpackage.afdk) null, 0), 1);
                }
                if (crdVar3 != null) {
                    if (obj3 == null) {
                        aqyVar.a = cruVar3;
                        aqyVar.b = aiuwVar3;
                        aqyVar.c = apqVar6;
                        aqyVar.d = obj3;
                        aqyVar.e = affcVar3;
                        aqyVar.f = affhVar2;
                        aqyVar.g = affcVar4;
                        aqyVar.h = crdVar3;
                        aqyVar.i = aiwgVarD2;
                        aqyVar.k = 5;
                        objT = cruVar3.t(cruVar3.q().e(), new defpackage.aqr(crdVar3, null), aqyVar);
                        if (objT != afdrVar) {
                            affcVar5 = affcVar4;
                            crdVar4 = crdVar3;
                            obj7 = objT;
                            obj4 = obj3;
                            affhVar3 = affhVar2;
                            cruVar5 = cruVar3;
                            crdVar5 = (defpackage.crd) obj7;
                            if (crdVar5 != null) {
                                aiwgVarD3 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.ais(aiwgVarD2, apqVar6, (defpackage.afdk) null, 12), 1);
                                if (affhVar3 != a) {
                                    ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVarD3, new defpackage.ait(affhVar3, apqVar6, crdVar5, (defpackage.afdk) null, 9, (char[]) null), (defpackage.afdk) null, 0), 1);
                                }
                                if (affcVar3 == null) {
                                    aqyVar.a = aiuwVar3;
                                    aqyVar.b = apqVar6;
                                    aqyVar.c = obj4;
                                    aqyVar.d = affcVar5;
                                    aqyVar.e = aiwgVarD3;
                                    aqyVar.f = crdVar4;
                                    aqyVar.g = null;
                                    aqyVar.h = null;
                                    aqyVar.i = null;
                                    aqyVar.k = 6;
                                    objD2 = d(cruVar5, defpackage.cqv.b, aqyVar);
                                    if (objD2 != afdrVar) {
                                        aiwgVar2 = aiwgVarD3;
                                        obj5 = obj4;
                                        aiuwVar5 = aiuwVar3;
                                        apqVar8 = apqVar6;
                                        obj7 = objD2;
                                        crdVar7 = crdVar4;
                                        obj6 = affcVar5;
                                        crdVar8 = (defpackage.crd) obj7;
                                        r4 = obj6;
                                        r5 = obj5;
                                        if (crdVar8 != null) {
                                            crdVar8.b();
                                            ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                            r5.invoke(new defpackage.cji(crdVar8.c));
                                        } else {
                                            ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                            if (r4 != 0) {
                                                r4.invoke(new defpackage.cji(crdVar7.c));
                                            }
                                        }
                                    }
                                } else {
                                    aqyVar.a = cruVar5;
                                    aqyVar.b = aiuwVar3;
                                    aqyVar.c = apqVar6;
                                    aqyVar.d = obj4;
                                    aqyVar.e = affcVar3;
                                    aqyVar.f = affcVar5;
                                    aqyVar.g = aiwgVarD3;
                                    aqyVar.h = crdVar4;
                                    crdVar6 = crdVar5;
                                    aqyVar.i = crdVar6;
                                    aqyVar.k = 7;
                                    objC2 = c(cruVar5, defpackage.cqv.b, aqyVar);
                                    if (objC2 != afdrVar) {
                                        caVar2 = (defpackage.ca) objC2;
                                        if (defpackage.afga.f(caVar2, defpackage.apc.c)) {
                                            affcVar3.invoke(new defpackage.cji(crdVar6.c));
                                            aqyVar.a = aiuwVar3;
                                            aqyVar.b = apqVar6;
                                            aqyVar.c = aiwgVarD3;
                                            aqyVar.d = null;
                                            aqyVar.e = null;
                                            aqyVar.f = null;
                                            aqyVar.g = null;
                                            aqyVar.h = null;
                                            aqyVar.i = null;
                                            aqyVar.k = 8;
                                            if (b(cruVar5, aqyVar) != afdrVar) {
                                                aiwgVar3 = aiwgVarD3;
                                                aiuwVar6 = aiuwVar3;
                                                apqVar9 = apqVar6;
                                                ahoc.d(aiuwVar6, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar3, new defpackage.aiv(apqVar9, (defpackage.afdk) null, 9, (byte[][]) null), (defpackage.afdk) null, 0), 1);
                                                return defpackage.afbk.a;
                                            }
                                        } else {
                                            if (caVar2 instanceof defpackage.apb) {
                                                aiwgVar2 = aiwgVarD3;
                                                r5 = obj4;
                                                aiuwVar5 = aiuwVar3;
                                                apqVar8 = apqVar6;
                                                crdVar8 = ((defpackage.apb) caVar2).c;
                                                crdVar7 = crdVar4;
                                                r4 = affcVar5;
                                            } else {
                                                if (caVar2 instanceof defpackage.apa) {
                                                    throw new defpackage.afas();
                                                }
                                                aiwgVar2 = aiwgVarD3;
                                                crdVar7 = crdVar4;
                                                r5 = obj4;
                                                crdVar8 = null;
                                                r4 = affcVar5;
                                                aiuwVar5 = aiuwVar3;
                                                apqVar8 = apqVar6;
                                            }
                                            if (crdVar8 != null) {
                                                crdVar8.b();
                                                ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                                r5.invoke(new defpackage.cji(crdVar8.c));
                                            } else {
                                                ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                                if (r4 != 0) {
                                                    r4.invoke(new defpackage.cji(crdVar7.c));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (affcVar5 != null) {
                                affcVar5.invoke(new defpackage.cji(crdVar4.c));
                            }
                        }
                        return afdrVar;
                    }
                    if (affcVar4 != null) {
                        affcVar4.invoke(new defpackage.cji(crdVar3.c));
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                aiwgVar = (aiwg) aqyVar.i;
                crdVar2 = (defpackage.crd) aqyVar.h;
                affcVar4 = (defpackage.affc) aqyVar.g;
                affhVar2 = (defpackage.affh) aqyVar.f;
                affcVar3 = (defpackage.affc) aqyVar.e;
                java.lang.Object obj8 = aqyVar.d;
                apqVar4 = (defpackage.apq) aqyVar.c;
                aiuw aiuwVar7 = (aiuw) aqyVar.b;
                cruVar3 = (defpackage.cru) aqyVar.a;
                defpackage.afga.cz(obj7);
                obj2 = obj8;
                aiuwVar2 = aiuwVar7;
                caVar = (defpackage.ca) obj7;
                if (!defpackage.afga.f(caVar, defpackage.apc.c)) {
                    if (caVar instanceof defpackage.apb) {
                        crdVar3 = ((defpackage.apb) caVar).c;
                    } else {
                        if (!(caVar instanceof defpackage.apa)) {
                            throw new defpackage.afas();
                        }
                        crdVar3 = null;
                    }
                    obj3 = obj2;
                    apqVar6 = apqVar4;
                    aiuwVar3 = aiuwVar2;
                    if (crdVar3 == null) {
                        aiwgVarD2 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar6, (defpackage.afdk) null, 5, (short[]) null), (defpackage.afdk) null, 0), 1);
                    } else {
                        crdVar3.b();
                        aiwgVarD2 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar6, (defpackage.afdk) null, 6, (int[]) null), (defpackage.afdk) null, 0), 1);
                    }
                    if (crdVar3 != null) {
                        if (obj3 == null) {
                            aqyVar.a = cruVar3;
                            aqyVar.b = aiuwVar3;
                            aqyVar.c = apqVar6;
                            aqyVar.d = obj3;
                            aqyVar.e = affcVar3;
                            aqyVar.f = affhVar2;
                            aqyVar.g = affcVar4;
                            aqyVar.h = crdVar3;
                            aqyVar.i = aiwgVarD2;
                            aqyVar.k = 5;
                            objT = cruVar3.t(cruVar3.q().e(), new defpackage.aqr(crdVar3, null), aqyVar);
                            if (objT != afdrVar) {
                                affcVar5 = affcVar4;
                                crdVar4 = crdVar3;
                                obj7 = objT;
                                obj4 = obj3;
                                affhVar3 = affhVar2;
                                cruVar5 = cruVar3;
                                crdVar5 = (defpackage.crd) obj7;
                                if (crdVar5 != null) {
                                    aiwgVarD3 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.ais(aiwgVarD2, apqVar6, (defpackage.afdk) null, 12), 1);
                                    if (affhVar3 != a) {
                                        ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVarD3, new defpackage.ait(affhVar3, apqVar6, crdVar5, (defpackage.afdk) null, 9, (char[]) null), (defpackage.afdk) null, 0), 1);
                                    }
                                    if (affcVar3 == null) {
                                        aqyVar.a = aiuwVar3;
                                        aqyVar.b = apqVar6;
                                        aqyVar.c = obj4;
                                        aqyVar.d = affcVar5;
                                        aqyVar.e = aiwgVarD3;
                                        aqyVar.f = crdVar4;
                                        aqyVar.g = null;
                                        aqyVar.h = null;
                                        aqyVar.i = null;
                                        aqyVar.k = 6;
                                        objD2 = d(cruVar5, defpackage.cqv.b, aqyVar);
                                        if (objD2 != afdrVar) {
                                            aiwgVar2 = aiwgVarD3;
                                            obj5 = obj4;
                                            aiuwVar5 = aiuwVar3;
                                            apqVar8 = apqVar6;
                                            obj7 = objD2;
                                            crdVar7 = crdVar4;
                                            obj6 = affcVar5;
                                            crdVar8 = (defpackage.crd) obj7;
                                            r4 = obj6;
                                            r5 = obj5;
                                            if (crdVar8 != null) {
                                                crdVar8.b();
                                                ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                                r5.invoke(new defpackage.cji(crdVar8.c));
                                            } else {
                                                ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                                if (r4 != 0) {
                                                    r4.invoke(new defpackage.cji(crdVar7.c));
                                                }
                                            }
                                        }
                                    } else {
                                        aqyVar.a = cruVar5;
                                        aqyVar.b = aiuwVar3;
                                        aqyVar.c = apqVar6;
                                        aqyVar.d = obj4;
                                        aqyVar.e = affcVar3;
                                        aqyVar.f = affcVar5;
                                        aqyVar.g = aiwgVarD3;
                                        aqyVar.h = crdVar4;
                                        crdVar6 = crdVar5;
                                        aqyVar.i = crdVar6;
                                        aqyVar.k = 7;
                                        objC2 = c(cruVar5, defpackage.cqv.b, aqyVar);
                                        if (objC2 != afdrVar) {
                                            caVar2 = (defpackage.ca) objC2;
                                            if (defpackage.afga.f(caVar2, defpackage.apc.c)) {
                                                affcVar3.invoke(new defpackage.cji(crdVar6.c));
                                                aqyVar.a = aiuwVar3;
                                                aqyVar.b = apqVar6;
                                                aqyVar.c = aiwgVarD3;
                                                aqyVar.d = null;
                                                aqyVar.e = null;
                                                aqyVar.f = null;
                                                aqyVar.g = null;
                                                aqyVar.h = null;
                                                aqyVar.i = null;
                                                aqyVar.k = 8;
                                                if (b(cruVar5, aqyVar) != afdrVar) {
                                                    aiwgVar3 = aiwgVarD3;
                                                    aiuwVar6 = aiuwVar3;
                                                    apqVar9 = apqVar6;
                                                    ahoc.d(aiuwVar6, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar3, new defpackage.aiv(apqVar9, (defpackage.afdk) null, 9, (byte[][]) null), (defpackage.afdk) null, 0), 1);
                                                    return defpackage.afbk.a;
                                                }
                                            } else {
                                                if (caVar2 instanceof defpackage.apb) {
                                                    aiwgVar2 = aiwgVarD3;
                                                    r5 = obj4;
                                                    aiuwVar5 = aiuwVar3;
                                                    apqVar8 = apqVar6;
                                                    crdVar8 = ((defpackage.apb) caVar2).c;
                                                    crdVar7 = crdVar4;
                                                    r4 = affcVar5;
                                                } else {
                                                    if (caVar2 instanceof defpackage.apa) {
                                                        throw new defpackage.afas();
                                                    }
                                                    aiwgVar2 = aiwgVarD3;
                                                    crdVar7 = crdVar4;
                                                    r5 = obj4;
                                                    crdVar8 = null;
                                                    r4 = affcVar5;
                                                    aiuwVar5 = aiuwVar3;
                                                    apqVar8 = apqVar6;
                                                }
                                                if (crdVar8 != null) {
                                                    crdVar8.b();
                                                    ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                                    r5.invoke(new defpackage.cji(crdVar8.c));
                                                } else {
                                                    ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                                    if (r4 != 0) {
                                                        r4.invoke(new defpackage.cji(crdVar7.c));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (affcVar5 != null) {
                                    affcVar5.invoke(new defpackage.cji(crdVar4.c));
                                }
                            }
                        } else if (affcVar4 != null) {
                            affcVar4.invoke(new defpackage.cji(crdVar3.c));
                        }
                    }
                    return defpackage.afbk.a;
                }
                affcVar3.invoke(new defpackage.cji(crdVar2.c));
                aqyVar.a = aiuwVar2;
                aqyVar.b = apqVar4;
                aqyVar.c = aiwgVar;
                aqyVar.d = null;
                aqyVar.e = null;
                aqyVar.f = null;
                aqyVar.g = null;
                aqyVar.h = null;
                aqyVar.i = null;
                aqyVar.k = 4;
                if (b(cruVar3, aqyVar) != afdrVar) {
                    aiuwVar4 = aiuwVar2;
                    apqVar7 = apqVar4;
                    ahoc.d(aiuwVar4, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar7, (defpackage.afdk) null, 4, (char[]) null), (defpackage.afdk) null, 0), 1);
                    return defpackage.afbk.a;
                }
                return afdrVar;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                aiwgVar = (aiwg) aqyVar.c;
                apqVar7 = (defpackage.apq) aqyVar.b;
                aiuwVar4 = (aiuw) aqyVar.a;
                defpackage.afga.cz(obj7);
                ahoc.d(aiuwVar4, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar, new defpackage.aiv(apqVar7, (defpackage.afdk) null, 4, (char[]) null), (defpackage.afdk) null, 0), 1);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                aiwgVarD2 = (aiwg) aqyVar.i;
                crdVar4 = (defpackage.crd) aqyVar.h;
                defpackage.affc affcVar9 = (defpackage.affc) aqyVar.g;
                affhVar3 = (defpackage.affh) aqyVar.f;
                defpackage.affc affcVar10 = (defpackage.affc) aqyVar.e;
                java.lang.Object obj9 = aqyVar.d;
                apqVar6 = (defpackage.apq) aqyVar.c;
                aiuw aiuwVar8 = (aiuw) aqyVar.b;
                defpackage.cru cruVar8 = (defpackage.cru) aqyVar.a;
                defpackage.afga.cz(obj7);
                affcVar5 = affcVar9;
                cruVar5 = cruVar8;
                affcVar3 = affcVar10;
                obj4 = obj9;
                aiuwVar3 = aiuwVar8;
                crdVar5 = (defpackage.crd) obj7;
                if (crdVar5 != null) {
                    aiwgVarD3 = ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.ais(aiwgVarD2, apqVar6, (defpackage.afdk) null, 12), 1);
                    if (affhVar3 != a) {
                        ahoc.d(aiuwVar3, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVarD3, new defpackage.ait(affhVar3, apqVar6, crdVar5, (defpackage.afdk) null, 9, (char[]) null), (defpackage.afdk) null, 0), 1);
                    }
                    if (affcVar3 == null) {
                        aqyVar.a = aiuwVar3;
                        aqyVar.b = apqVar6;
                        aqyVar.c = obj4;
                        aqyVar.d = affcVar5;
                        aqyVar.e = aiwgVarD3;
                        aqyVar.f = crdVar4;
                        aqyVar.g = null;
                        aqyVar.h = null;
                        aqyVar.i = null;
                        aqyVar.k = 6;
                        objD2 = d(cruVar5, defpackage.cqv.b, aqyVar);
                        if (objD2 != afdrVar) {
                            aiwgVar2 = aiwgVarD3;
                            obj5 = obj4;
                            aiuwVar5 = aiuwVar3;
                            apqVar8 = apqVar6;
                            obj7 = objD2;
                            crdVar7 = crdVar4;
                            obj6 = affcVar5;
                            crdVar8 = (defpackage.crd) obj7;
                            r4 = obj6;
                            r5 = obj5;
                            if (crdVar8 != null) {
                                crdVar8.b();
                                ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                r5.invoke(new defpackage.cji(crdVar8.c));
                            } else {
                                ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                if (r4 != 0) {
                                    r4.invoke(new defpackage.cji(crdVar7.c));
                                }
                            }
                        }
                    } else {
                        aqyVar.a = cruVar5;
                        aqyVar.b = aiuwVar3;
                        aqyVar.c = apqVar6;
                        aqyVar.d = obj4;
                        aqyVar.e = affcVar3;
                        aqyVar.f = affcVar5;
                        aqyVar.g = aiwgVarD3;
                        aqyVar.h = crdVar4;
                        crdVar6 = crdVar5;
                        aqyVar.i = crdVar6;
                        aqyVar.k = 7;
                        objC2 = c(cruVar5, defpackage.cqv.b, aqyVar);
                        if (objC2 != afdrVar) {
                            caVar2 = (defpackage.ca) objC2;
                            if (defpackage.afga.f(caVar2, defpackage.apc.c)) {
                                affcVar3.invoke(new defpackage.cji(crdVar6.c));
                                aqyVar.a = aiuwVar3;
                                aqyVar.b = apqVar6;
                                aqyVar.c = aiwgVarD3;
                                aqyVar.d = null;
                                aqyVar.e = null;
                                aqyVar.f = null;
                                aqyVar.g = null;
                                aqyVar.h = null;
                                aqyVar.i = null;
                                aqyVar.k = 8;
                                if (b(cruVar5, aqyVar) != afdrVar) {
                                    aiwgVar3 = aiwgVarD3;
                                    aiuwVar6 = aiuwVar3;
                                    apqVar9 = apqVar6;
                                    ahoc.d(aiuwVar6, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar3, new defpackage.aiv(apqVar9, (defpackage.afdk) null, 9, (byte[][]) null), (defpackage.afdk) null, 0), 1);
                                    return defpackage.afbk.a;
                                }
                            } else {
                                if (caVar2 instanceof defpackage.apb) {
                                    aiwgVar2 = aiwgVarD3;
                                    r5 = obj4;
                                    aiuwVar5 = aiuwVar3;
                                    apqVar8 = apqVar6;
                                    crdVar8 = ((defpackage.apb) caVar2).c;
                                    crdVar7 = crdVar4;
                                    r4 = affcVar5;
                                } else {
                                    if (caVar2 instanceof defpackage.apa) {
                                        throw new defpackage.afas();
                                    }
                                    aiwgVar2 = aiwgVarD3;
                                    crdVar7 = crdVar4;
                                    r5 = obj4;
                                    crdVar8 = null;
                                    r4 = affcVar5;
                                    aiuwVar5 = aiuwVar3;
                                    apqVar8 = apqVar6;
                                }
                                if (crdVar8 != null) {
                                    crdVar8.b();
                                    ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                                    r5.invoke(new defpackage.cji(crdVar8.c));
                                } else {
                                    ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                                    if (r4 != 0) {
                                        r4.invoke(new defpackage.cji(crdVar7.c));
                                    }
                                }
                            }
                        }
                    }
                    return afdrVar;
                }
                if (affcVar5 != null) {
                    affcVar5.invoke(new defpackage.cji(crdVar4.c));
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                crdVar7 = (defpackage.crd) aqyVar.f;
                aiwgVar2 = (aiwg) aqyVar.e;
                java.lang.Object obj10 = aqyVar.d;
                defpackage.affc affcVar11 = (defpackage.affc) aqyVar.c;
                apqVar8 = (defpackage.apq) aqyVar.b;
                aiuwVar5 = (aiuw) aqyVar.a;
                defpackage.afga.cz(obj7);
                obj6 = obj10;
                obj5 = affcVar11;
                crdVar8 = (defpackage.crd) obj7;
                r4 = obj6;
                r5 = obj5;
                if (crdVar8 != null) {
                    crdVar8.b();
                    ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                    r5.invoke(new defpackage.cji(crdVar8.c));
                } else {
                    ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                    if (r4 != 0) {
                        r4.invoke(new defpackage.cji(crdVar7.c));
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                crdVar6 = (defpackage.crd) aqyVar.i;
                crdVar4 = (defpackage.crd) aqyVar.h;
                aiwg aiwgVar4 = (aiwg) aqyVar.g;
                affcVar5 = (defpackage.affc) aqyVar.f;
                defpackage.affc affcVar12 = (defpackage.affc) aqyVar.e;
                java.lang.Object obj11 = aqyVar.d;
                defpackage.apq apqVar13 = (defpackage.apq) aqyVar.c;
                aiuw aiuwVar9 = (aiuw) aqyVar.b;
                cruVar5 = (defpackage.cru) aqyVar.a;
                defpackage.afga.cz(obj7);
                objC2 = obj7;
                aiwgVarD3 = aiwgVar4;
                affcVar3 = affcVar12;
                aiuwVar3 = aiuwVar9;
                obj4 = obj11;
                apqVar6 = apqVar13;
                caVar2 = (defpackage.ca) objC2;
                if (defpackage.afga.f(caVar2, defpackage.apc.c)) {
                    affcVar3.invoke(new defpackage.cji(crdVar6.c));
                    aqyVar.a = aiuwVar3;
                    aqyVar.b = apqVar6;
                    aqyVar.c = aiwgVarD3;
                    aqyVar.d = null;
                    aqyVar.e = null;
                    aqyVar.f = null;
                    aqyVar.g = null;
                    aqyVar.h = null;
                    aqyVar.i = null;
                    aqyVar.k = 8;
                    if (b(cruVar5, aqyVar) != afdrVar) {
                        aiwgVar3 = aiwgVarD3;
                        aiuwVar6 = aiuwVar3;
                        apqVar9 = apqVar6;
                        ahoc.d(aiuwVar6, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar3, new defpackage.aiv(apqVar9, (defpackage.afdk) null, 9, (byte[][]) null), (defpackage.afdk) null, 0), 1);
                        return defpackage.afbk.a;
                    }
                    return afdrVar;
                }
                if (caVar2 instanceof defpackage.apb) {
                    aiwgVar2 = aiwgVarD3;
                    r5 = obj4;
                    aiuwVar5 = aiuwVar3;
                    apqVar8 = apqVar6;
                    crdVar8 = ((defpackage.apb) caVar2).c;
                    crdVar7 = crdVar4;
                    r4 = affcVar5;
                } else {
                    if (caVar2 instanceof defpackage.apa) {
                        throw new defpackage.afas();
                    }
                    aiwgVar2 = aiwgVarD3;
                    crdVar7 = crdVar4;
                    r5 = obj4;
                    crdVar8 = null;
                    r4 = affcVar5;
                    aiuwVar5 = aiuwVar3;
                    apqVar8 = apqVar6;
                }
                if (crdVar8 != null) {
                    crdVar8.b();
                    ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 7, (boolean[]) null), (defpackage.afdk) null, 0), 1);
                    r5.invoke(new defpackage.cji(crdVar8.c));
                } else {
                    ahoc.d(aiuwVar5, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar2, new defpackage.aiv(apqVar8, (defpackage.afdk) null, 8, (float[]) null), (defpackage.afdk) null, 0), 1);
                    if (r4 != 0) {
                        r4.invoke(new defpackage.cji(crdVar7.c));
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                aiwgVar3 = (aiwg) aqyVar.c;
                apqVar9 = (defpackage.apq) aqyVar.b;
                aiuwVar6 = (aiuw) aqyVar.a;
                defpackage.afga.cz(obj7);
                ahoc.d(aiuwVar6, (defpackage.afdo) null, 4, new defpackage.aqx(aiwgVar3, new defpackage.aiv(apqVar9, (defpackage.afdk) null, 9, (byte[][]) null), (defpackage.afdk) null, 0), 1);
                return defpackage.afbk.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
