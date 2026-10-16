package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class asq {
    public static final void A(defpackage.cgf cgfVar, defpackage.bve bveVar) {
        defpackage.ocb ocbVar = defpackage.ocb.a;
        long jB = bveVar.b();
        long j = jB ^ (jB >>> 32);
        defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar, cgfVar);
        defpackage.cdd cddVarN = bveVar.N();
        defpackage.afer aferVar = defpackage.cwl.a;
        bveVar.M();
        bveVar.w();
        if (bveVar.G()) {
            bveVar.j(aferVar);
        } else {
            bveVar.y();
        }
        defpackage.byw.c(bveVar, ocbVar, defpackage.cwl.e);
        defpackage.byw.c(bveVar, cddVarN, defpackage.cwl.d);
        bveVar.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
        defpackage.byw.c(bveVar, cgfVarN, defpackage.cwl.c);
        defpackage.byw.c(bveVar, java.lang.Integer.valueOf((int) j), defpackage.cwl.f);
        bveVar.n();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    public static final defpackage.ctz B(defpackage.avz avzVar, int i, int i2, int i3, int i4, int i5, defpackage.cub cubVar, java.util.List list, defpackage.cux[] cuxVarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        float f;
        int i11;
        int iMax;
        int i12;
        int i13;
        int i14;
        ?? r9;
        int i15 = i3;
        int i16 = i4;
        java.util.List list2 = list;
        int i17 = i7 - i6;
        int[] iArr2 = new int[i17];
        int i18 = i6;
        int iMax2 = 0;
        int i19 = 0;
        int i20 = 0;
        int iMin = 0;
        boolean z = false;
        float f2 = 0.0f;
        while (true) {
            if (i18 >= i7) {
                break;
            }
            defpackage.ctx ctxVar = (defpackage.ctx) list2.get(i18);
            int i21 = i18;
            defpackage.awa awaVarC = C(ctxVar);
            float f3 = awaVarC != null ? awaVarC.a : 0.0f;
            if (z) {
                z = true;
            } else {
                defpackage.aue aueVar = awaVarC != null ? awaVarC.c : null;
                if (aueVar == null || !aueVar.c()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (f3 > 0.0f) {
                f2 += f3;
                i19++;
            } else {
                int i22 = i15 - i20;
                int i23 = i16 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i16;
                defpackage.cux cuxVarV = cuxVarArr[i21];
                if (cuxVarV == null) {
                    if (i15 == Integer.MAX_VALUE) {
                        i13 = i22;
                        r9 = 0;
                        i14 = Integer.MAX_VALUE;
                    } else if (i22 < 0) {
                        i13 = i22;
                        r9 = 0;
                        i14 = 0;
                    } else {
                        i14 = i22;
                        i13 = i14;
                        r9 = 0;
                    }
                    cuxVarV = ctxVar.v(avzVar.j(r9, i14, i23, r9));
                } else {
                    i13 = i22;
                    i20 = i20;
                }
                defpackage.cux cuxVar = cuxVarV;
                int iG = avzVar.g(cuxVar);
                int iF = avzVar.f(cuxVar);
                iArr2[i21 - i6] = iG;
                int i24 = i13 - iG;
                if (i24 < 0) {
                    i24 = 0;
                }
                iMin = java.lang.Math.min(i5, i24);
                i20 += iG + iMin;
                iMax2 = java.lang.Math.max(iMax2, iF);
                cuxVarArr[i21] = cuxVar;
                i19 = i19;
            }
            i18 = i21 + 1;
        }
        int i25 = i19;
        int i26 = i20;
        if (i25 == 0) {
            i10 = i26 - iMin;
            i9 = 0;
        } else {
            i9 = i15 - i26;
            long j = i5;
            if (i15 == Integer.MAX_VALUE) {
                i15 = i;
            }
            int iMax3 = iMax2;
            long j2 = j * ((long) (i25 - 1));
            long jRound = ((long) (i15 - i26)) - j2;
            if (jRound < 0) {
                jRound = 0;
            }
            float f4 = jRound / f2;
            for (int i27 = i6; i27 < i7; i27++) {
                defpackage.awa awaVarC2 = C((defpackage.ctx) list2.get(i27));
                jRound -= (long) java.lang.Math.round((awaVarC2 != null ? awaVarC2.a : 0.0f) * f4);
            }
            int i28 = i6;
            int i29 = 0;
            while (i28 < i7) {
                if (cuxVarArr[i28] == null) {
                    f = f4;
                    defpackage.ctx ctxVar2 = (defpackage.ctx) list2.get(i28);
                    defpackage.awa awaVarC3 = C(ctxVar2);
                    float f5 = awaVarC3 != null ? awaVarC3.a : 0.0f;
                    if (i16 == Integer.MAX_VALUE) {
                        i11 = Integer.MAX_VALUE;
                    } else {
                        i11 = i16;
                        if (awaVarC3 == null) {
                            awaVarC3 = null;
                        }
                    }
                    if (f5 <= 0.0f) {
                        defpackage.axd.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = java.lang.Long.signum(jRound);
                    long j3 = jRound - ((long) iSignum);
                    int iRound = java.lang.Math.round(f5 * f) + iSignum;
                    int i30 = 0;
                    int iMax4 = java.lang.Math.max(0, iRound);
                    if ((awaVarC3 == null || awaVarC3.b) && iMax4 != Integer.MAX_VALUE) {
                        i30 = iMax4;
                    }
                    defpackage.cux cuxVarV2 = ctxVar2.v(avzVar.j(i30, iMax4, i11, true));
                    int iG2 = avzVar.g(cuxVarV2);
                    int iF2 = avzVar.f(cuxVarV2);
                    iArr2[i28 - i6] = iG2;
                    i29 += iG2;
                    iMax3 = java.lang.Math.max(iMax3, iF2);
                    cuxVarArr[i28] = cuxVarV2;
                    jRound = j3;
                } else {
                    f = f4;
                }
                i28++;
                f4 = f;
                i16 = i4;
                list2 = list;
                j2 = j2;
            }
            int i31 = (int) (((long) i29) + j2);
            if (i31 < 0) {
                i31 = 0;
            }
            if (i31 <= i9) {
                i9 = i31;
            }
            iMax2 = iMax3;
            i10 = i26;
        }
        if (z) {
            int iMax5 = 0;
            iMax = 0;
            for (int i32 = i6; i32 < i7; i32++) {
                defpackage.cux cuxVar2 = cuxVarArr[i32];
                cuxVar2.getClass();
                defpackage.awa awaVarD = D(cuxVar2);
                defpackage.aue aueVar2 = awaVarD != null ? awaVarD.c : null;
                java.lang.Integer numB = aueVar2 != null ? aueVar2.b(cuxVar2) : null;
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    int iF3 = avzVar.f(cuxVar2);
                    iMax5 = java.lang.Math.max(iMax5, iIntValue != Integer.MIN_VALUE ? numB.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iF3;
                    }
                    iMax = java.lang.Math.max(iMax, iF3 - iIntValue);
                }
            }
            i12 = iMax5;
        } else {
            iMax = 0;
            i12 = 0;
        }
        int i33 = i10 + i9;
        int iMax6 = java.lang.Math.max(i33 < 0 ? 0 : i33, i);
        int iMax7 = java.lang.Math.max(iMax2, java.lang.Math.max(i2, iMax + i12));
        int[] iArr3 = new int[i17];
        avzVar.i(iMax6, iArr2, iArr3, cubVar);
        return avzVar.h(cuxVarArr, cubVar, i12, iArr3, iMax6, iMax7, iArr, i8, i6, i7);
    }

    public static final defpackage.awa C(defpackage.csy csyVar) {
        java.lang.Object objG = csyVar.g();
        if (objG instanceof defpackage.awa) {
            return (defpackage.awa) objG;
        }
        return null;
    }

    public static final defpackage.awa D(defpackage.cux cuxVar) {
        java.lang.Object objG = cuxVar.g();
        if (objG instanceof defpackage.awa) {
            return (defpackage.awa) objG;
        }
        return null;
    }

    public static final float E(defpackage.avv avvVar, defpackage.dlz dlzVar) {
        return dlzVar == defpackage.dlz.a ? avvVar.c(dlzVar) : avvVar.b(dlzVar);
    }

    public static final float F(defpackage.avv avvVar, defpackage.dlz dlzVar) {
        return dlzVar == defpackage.dlz.a ? avvVar.b(dlzVar) : avvVar.c(dlzVar);
    }

    public static final defpackage.cgf G(defpackage.cgf cgfVar, defpackage.avv avvVar) {
        return cgfVar.a(new defpackage.avw(avvVar));
    }

    public static final defpackage.cgf H(defpackage.cgf cgfVar, float f) {
        return cgfVar.a(new defpackage.avr(f, f, f, f));
    }

    public static final defpackage.cgf I(defpackage.cgf cgfVar, float f, float f2) {
        return cgfVar.a(new defpackage.avr(f, f2, f, f2));
    }

    public static final defpackage.cgf J(defpackage.cgf cgfVar, float f, float f2, float f3, float f4) {
        return cgfVar.a(new defpackage.avr(f, f2, f3, f4));
    }

    public static /* synthetic */ defpackage.avv K(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new defpackage.avx(f, f2, f, f2);
    }

    public static /* synthetic */ defpackage.avv L(float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new defpackage.avx(f, f2, f3, f4);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e A[LOOP:0: B:21:0x004f->B:25:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object M(defpackage.cru r7, defpackage.afdk r8) {
        /*
            boolean r0 = r8 instanceof defpackage.bgd
            if (r0 == 0) goto L13
            r0 = r8
            bgd r0 = (defpackage.bgd) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            bgd r0 = new bgd
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
            goto L3f
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
            java.lang.Object r8 = defpackage.tq.p(r7, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            cqu r8 = (defpackage.cqu) r8
            int r2 = r8.c
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L4f:
            if (r5 >= r2) goto L61
            java.lang.Object r6 = r8.get(r5)
            crd r6 = (defpackage.crd) r6
            boolean r6 = defpackage.tq.i(r6)
            if (r6 != 0) goto L5e
            goto L34
        L5e:
            int r5 = r5 + 1
            goto L4f
        L61:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asq.M(cru, afdk):java.lang.Object");
    }

    public static final boolean N(defpackage.bfw bfwVar) {
        return bfwVar == defpackage.bga.b;
    }

    public static final boolean O(defpackage.dgb dgbVar) {
        if (dgbVar != null) {
            return dgbVar.a == null && dgbVar.b == null;
        }
        return true;
    }

    public static final defpackage.cjj P(defpackage.dlo dloVar, int i, defpackage.dkg dkgVar, defpackage.dga dgaVar, boolean z, int i2) {
        float f;
        defpackage.cjj cjjVarM = dgaVar != null ? dgaVar.m(dkgVar.b.a(i)) : defpackage.cjj.a;
        int iDN = dloVar.dN(2.0f);
        if (z) {
            f = (i2 - cjjVarM.b) - iDN;
        } else {
            f = cjjVarM.b;
        }
        return defpackage.cjj.j(cjjVarM, f, z ? i2 - cjjVarM.b : iDN + cjjVarM.b, 0.0f, 10);
    }

    public static final boolean Q(android.view.KeyEvent keyEvent, int i) {
        return ((int) (defpackage.tn.i(keyEvent) >> 32)) == i;
    }

    public static final void R(defpackage.ckc ckcVar, long j, defpackage.djv djvVar, defpackage.dga dgaVar, defpackage.cjs cjsVar) {
        long j2 = defpackage.dgc.a;
        long j3 = 4294967295L & j;
        int i = (int) (j >> 32);
        int i2 = (int) j3;
        int iA = djvVar.a(java.lang.Math.min(i, i2));
        int iA2 = djvVar.a(java.lang.Math.max(i, i2));
        if (iA != iA2) {
            ckcVar.p(dgaVar.r(iA, iA2), cjsVar);
        }
    }

    public static final void S(defpackage.bil bilVar, java.lang.Object obj, java.lang.String str, int i, defpackage.affc affcVar) {
        bilVar.f(new defpackage.bfy(obj, str, i, affcVar));
    }

    public static final void T(defpackage.bil bilVar, java.lang.Object obj, android.view.textclassifier.TextClassification textClassification, int i, android.graphics.drawable.Drawable drawable) {
        bilVar.f(new defpackage.bgc(obj, textClassification, i, drawable));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final void U(defpackage.bil bilVar, final android.content.Context context, final boolean z, final java.lang.CharSequence charSequence, final long j) {
        if (defpackage.dgc.i(j) || charSequence.length() == 0) {
            return;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        ?? Invoke = defpackage.bft.a.invoke(context);
        if (Invoke.isEmpty()) {
            return;
        }
        bilVar.g();
        int size = Invoke.size();
        for (int i = 0; i < size; i++) {
            final android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) Invoke.get(i);
            S(bilVar, new defpackage.bfv(i), resolveInfo.loadLabel(packageManager).toString(), 0, new defpackage.affc() { // from class: bfu
                @Override // defpackage.affc
                public final java.lang.Object invoke(java.lang.Object obj) {
                    boolean z2 = z;
                    defpackage.bft.b.invoke(context, resolveInfo, java.lang.Boolean.valueOf(z2), charSequence, new defpackage.dgc(j));
                    ((defpackage.bgb) obj).a();
                    return defpackage.afbk.a;
                }
            });
        }
        bilVar.g();
    }

    public static final void V(java.util.List list, defpackage.iwa iwaVar, defpackage.affc affcVar, defpackage.fbl fblVar) {
        defpackage.dkd dkdVarB = iwaVar.b(list);
        if (fblVar != null) {
            fblVar.j(null, dkdVarB);
        }
        affcVar.invoke(dkdVarB);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [djy, java.lang.Object] */
    public static final defpackage.fbl W(defpackage.fbl fblVar, defpackage.dkd dkdVar, defpackage.iwa iwaVar, defpackage.djl djlVar, defpackage.affc affcVar, defpackage.affc affcVar2) {
        defpackage.afgv afgvVar = new defpackage.afgv();
        defpackage.acn acnVar = new defpackage.acn(iwaVar, affcVar, afgvVar, 7, (int[]) null);
        ?? r8 = fblVar.b;
        r8.d(dkdVar, djlVar, acnVar, affcVar2);
        defpackage.fbl fblVar2 = new defpackage.fbl(fblVar, (java.lang.Object) r8);
        ((java.util.concurrent.atomic.AtomicReference) fblVar.a).set(fblVar2);
        afgvVar.a = fblVar2;
        return (defpackage.fbl) afgvVar.a;
    }

    public static final int X(float f, float f2, float f3, int i) {
        if (i == 1) {
            return java.lang.Math.round((float) java.lang.Math.ceil((f + f3) - f2));
        }
        if (i == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        int i2 = i - 2;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = i - 1;
        return java.lang.Math.round((float) java.lang.Math.ceil(f + (f2 * i2) + (f3 * (i3 <= 1 ? i3 : 1))));
    }

    public static final int Y(java.lang.String str, int i) {
        defpackage.emx emxVar = defpackage.emx.b;
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    public static final int Z(java.lang.String str, int i) {
        defpackage.emx emxVar = defpackage.emx.b;
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final java.lang.Void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final int aa(java.lang.CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int ab(java.lang.CharSequence charSequence, int i) {
        while (i > 0) {
            int i2 = i - 1;
            if (charSequence.charAt(i2) == '\n') {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    public static final java.lang.Object ac(defpackage.cri criVar, defpackage.beq beqVar, defpackage.afdk afdkVar) {
        java.lang.Object objA = ahoi.a(new defpackage.bek(criVar, beqVar, null), afdkVar);
        return objA == defpackage.afdr.a ? objA : defpackage.afbk.a;
    }

    public static final void ad(defpackage.dez dezVar, java.lang.String str) {
        if ("�".length() <= 0) {
            c("alternateText can't be an empty string.");
        }
        defpackage.dey deyVar = new defpackage.dey(new defpackage.dfv(str), dezVar.a.length(), Integer.MIN_VALUE, "androidx.compose.foundation.text.inlineContent");
        java.util.List list = dezVar.b;
        list.add(deyVar);
        dezVar.c.add(deyVar);
        list.size();
        dezVar.f("�");
        dezVar.g();
    }

    public static final void ae(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            c(defpackage.a.bz(i2, i, "both minLines ", " and maxLines ", " must be greater than zero"));
        }
        if (i <= i2) {
            return;
        }
        c(defpackage.a.bn(i2, i, "minLines ", " must be less than or equal to maxLines "));
    }

    public static final void af(defpackage.cgf cgfVar, defpackage.blw blwVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(2036174316);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(blwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, true);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            long j = bwcVar.u;
            long j2 = j ^ (j >>> 32);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, i4));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            defpackage.afw.G(blwVar, affgVar, bveVarC, (i2 >> 3) & 126);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.alz(cgfVar, blwVar, affgVar, i, 3);
        }
    }

    public static final void ag(final defpackage.blw blwVar, final boolean z, defpackage.bve bveVar, final int i) {
        int i2;
        defpackage.bfi bfiVarE;
        defpackage.beg begVar;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(626339208);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(blwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if (!bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            bveVarC.s();
        } else if (z) {
            bveVarC.v(1530097388);
            defpackage.beg begVar2 = blwVar.d;
            defpackage.dga dgaVar = null;
            if (begVar2 != null && (bfiVarE = begVar2.e()) != null && (begVar = blwVar.d) != null && !begVar.j) {
                dgaVar = bfiVarE.a;
            }
            if (dgaVar == null) {
                bveVarC.v(1530097387);
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC.v(1530097388);
                if (defpackage.dgc.i(blwVar.f().b)) {
                    bveVarC.v(2110860558);
                    ((defpackage.bwc) bveVarC).Y(false);
                } else {
                    bveVarC.v(2109807302);
                    int iA = blwVar.b.a((int) (blwVar.f().b >> 32));
                    int iA2 = blwVar.b.a((int) (blwVar.f().b & 4294967295L));
                    int iP = dgaVar.p(iA);
                    int iP2 = dgaVar.p(java.lang.Math.max(iA2 - 1, 0));
                    defpackage.beg begVar3 = blwVar.d;
                    if (begVar3 == null || !((java.lang.Boolean) begVar3.g.a()).booleanValue()) {
                        bveVarC.v(2110490542);
                        ((defpackage.bwc) bveVarC).Y(false);
                    } else {
                        bveVarC.v(2110225306);
                        defpackage.bxi.t(true, iP, blwVar, bveVarC, ((i2 << 6) & 896) | 6);
                        ((defpackage.bwc) bveVarC).Y(false);
                    }
                    defpackage.beg begVar4 = blwVar.d;
                    if (begVar4 == null || !((java.lang.Boolean) begVar4.h.a()).booleanValue()) {
                        bveVarC.v(2110838734);
                        ((defpackage.bwc) bveVarC).Y(false);
                    } else {
                        bveVarC.v(2110574459);
                        defpackage.bxi.t(false, iP2, blwVar, bveVarC, ((i2 << 6) & 896) | 6);
                        ((defpackage.bwc) bveVarC).Y(false);
                    }
                    ((defpackage.bwc) bveVarC).Y(false);
                }
                defpackage.beg begVar5 = blwVar.d;
                if (begVar5 != null) {
                    if (!defpackage.afga.f(blwVar.n.a(), blwVar.f().a())) {
                        begVar5.n(false);
                    }
                    if (begVar5.q()) {
                        if (begVar5.s()) {
                            blwVar.s();
                        } else {
                            blwVar.l();
                        }
                    }
                }
                ((defpackage.bwc) bveVarC).Y(false);
            }
            ((defpackage.bwc) bveVarC).Y(false);
        } else {
            bveVarC.v(1989076778);
            ((defpackage.bwc) bveVarC).Y(false);
            blwVar.l();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: bdm
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    defpackage.blw blwVar2 = blwVar;
                    int i6 = 613566756 & i4;
                    boolean z2 = z;
                    defpackage.asq.ag(blwVar2, z2, (defpackage.bve) obj, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void ah(defpackage.blw blwVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.dfb dfbVarE;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1436003720);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(blwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 0;
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.beg begVar = blwVar.d;
            if (begVar == null || !((java.lang.Boolean) begVar.i.a()).booleanValue() || (dfbVarE = blwVar.e()) == null || dfbVarE.a() <= 0) {
                bveVarC.v(-2111042550);
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC.v(-2112351432);
                boolean zC = bveVarC.C(blwVar);
                defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                java.lang.Object objS = bwcVar.S();
                if (zC || objS == defpackage.bvd.a) {
                    objS = new defpackage.blp(blwVar);
                    bwcVar.ad(objS);
                }
                defpackage.beq beqVar = (defpackage.beq) objS;
                defpackage.dlo dloVar = (defpackage.dlo) bveVarC.f(defpackage.dbl.d);
                defpackage.djv djvVar = blwVar.b;
                long j = blwVar.f().b;
                long j2 = defpackage.dgc.a;
                int iA = djvVar.a((int) (j >> 32));
                defpackage.beg begVar2 = blwVar.d;
                defpackage.bfi bfiVarE = begVar2 != null ? begVar2.e() : null;
                bfiVarE.getClass();
                defpackage.dga dgaVar = bfiVarE.a;
                defpackage.cjj cjjVarM = dgaVar.m(defpackage.afqt.g(iA, 0, dgaVar.a.a.a()));
                long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(cjjVarM.e)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(cjjVarM.b + (dloVar.dI(2.0f) / 2.0f))) << 32);
                boolean zB = bveVarC.B(jFloatToRawIntBits);
                java.lang.Object objS2 = bwcVar.S();
                if (zB || objS2 == defpackage.bvd.a) {
                    objS2 = new defpackage.bdv(jFloatToRawIntBits);
                    bwcVar.ad(objS2);
                }
                defpackage.bkc bkcVar = (defpackage.bkc) objS2;
                boolean zE = bveVarC.E(beqVar) | bveVarC.E(blwVar);
                java.lang.Object objS3 = bwcVar.S();
                if (zE || objS3 == defpackage.bvd.a) {
                    objS3 = new defpackage.nid(beqVar, blwVar, 1);
                    bwcVar.ad(objS3);
                }
                defpackage.cqu cquVar = defpackage.crq.a;
                defpackage.crp crpVar = new defpackage.crp(beqVar, null, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objS3);
                boolean zB2 = bveVarC.B(jFloatToRawIntBits);
                java.lang.Object objS4 = bwcVar.S();
                if (zB2 || objS4 == defpackage.bvd.a) {
                    objS4 = new defpackage.bdl(jFloatToRawIntBits, i4);
                    bwcVar.ad(objS4);
                }
                java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dea.a;
                defpackage.ddo ddoVar = new defpackage.ddo(false, (defpackage.affc) objS4);
                defpackage.afw.O(bkcVar, ddoVar == defpackage.cgf.e ? crpVar : new defpackage.cga(crpVar, ddoVar), 0L, bveVarC, 0);
                bwcVar.Y(false);
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.atn(blwVar, i, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [djy, java.lang.Object] */
    public static final void ai(defpackage.beg begVar) {
        defpackage.fbl fblVar = begVar.u;
        if (fblVar != null) {
            begVar.m.invoke(defpackage.dkd.b((defpackage.dkd) begVar.s.b, null, 0L, 3));
            defpackage.fbl fblVar2 = (defpackage.fbl) fblVar.a;
            if (defpackage.a.p((java.util.concurrent.atomic.AtomicReference) fblVar2.a, fblVar)) {
                fblVar2.b.f();
            }
        }
        begVar.u = null;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [djy, java.lang.Object] */
    public static final void aj(defpackage.beg begVar, defpackage.dkd dkdVar, defpackage.djv djvVar) {
        defpackage.fbl fblVar;
        defpackage.ctc ctcVarF;
        defpackage.cjj cjjVarL;
        defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
        defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
        defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
        try {
            defpackage.bfi bfiVarE = begVar.e();
            if (bfiVarE != null && (fblVar = begVar.u) != null && (ctcVarF = begVar.f()) != null) {
                defpackage.bep bepVar = begVar.a;
                defpackage.dga dgaVar = bfiVarE.a;
                if (begVar.q()) {
                    long j = dkdVar.b;
                    long j2 = defpackage.dgc.a;
                    int iA = djvVar.a(java.lang.Math.max((int) (j >> 32), (int) (j & 4294967295L)));
                    defpackage.bav bavVar = new defpackage.bav(bepVar, 20);
                    java.lang.String str = defpackage.bes.a;
                    if (iA < dgaVar.a.a.a()) {
                        cjjVarL = dgaVar.l(iA);
                    } else {
                        cjjVarL = iA != 0 ? dgaVar.l(iA - 1) : new defpackage.cjj(0.0f, 0.0f, 1.0f, (int) (((defpackage.dly) bavVar.invoke()).a & 4294967295L));
                    }
                    float f = cjjVarL.b;
                    float f2 = cjjVarL.c;
                    long j3 = ctcVarF.j((((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L));
                    defpackage.cjj cjjVarC = defpackage.bzo.C((((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j3 >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(cjjVarL.d - f)) << 32) | (4294967295L & ((long) java.lang.Float.floatToRawIntBits(cjjVarL.e - f2))));
                    if (fblVar.i()) {
                        fblVar.b.b(cjjVarC);
                    }
                }
            }
        } finally {
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
        }
    }

    public static final void ak(defpackage.beg begVar, defpackage.cit citVar) {
        if (!begVar.q()) {
            citVar.a(7);
            return;
        }
        defpackage.sr srVar = begVar.v;
        if (srVar != null) {
            srVar.r();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v13 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void al(final defpackage.dkd r61, defpackage.affc r62, defpackage.cgf r63, final defpackage.dgd r64, final defpackage.dki r65, defpackage.affc r66, defpackage.cka r67, boolean r68, int r69, final int r70, defpackage.djl r71, defpackage.bee r72, final boolean r73, final defpackage.affh r74, defpackage.bve r75, int r76, int r77) {
        /*
            Method dump skipped, instruction units count: 2527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asq.al(dkd, affc, cgf, dgd, dki, affc, cka, boolean, int, int, djl, bee, boolean, affh, bve, int, int):void");
    }

    public static final void am(defpackage.fbl fblVar, defpackage.beg begVar, defpackage.dkd dkdVar, defpackage.djl djlVar, defpackage.djv djvVar) {
        begVar.u = W(fblVar, dkdVar, begVar.s, djlVar, begVar.m, begVar.n);
        aj(begVar, dkdVar, djvVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object an(defpackage.apw apwVar, float f, defpackage.aek aekVar, defpackage.kwv kwvVar, defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.aru aruVar;
        float f2;
        afgs afgsVar;
        if (afdkVar instanceof defpackage.aru) {
            aruVar = (defpackage.aru) afdkVar;
            int i = aruVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aruVar.c = i - Integer.MIN_VALUE;
            } else {
                aruVar = new defpackage.aru(afdkVar);
            }
        } else {
            aruVar = new defpackage.aru(afdkVar);
        }
        java.lang.Object obj = aruVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = aruVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            afgs afgsVar2 = new afgs();
            boolean z = ((java.lang.Number) aekVar.b()).floatValue() != 0.0f;
            defpackage.art artVar = new defpackage.art(f, afgsVar2, apwVar, affcVar, 1);
            aruVar.d = aekVar;
            aruVar.e = afgsVar2;
            aruVar.a = f;
            aruVar.c = 1;
            if (defpackage.afw.ah(aekVar, kwvVar, z, artVar, aruVar) == afdrVar) {
                return afdrVar;
            }
            f2 = f;
            afgsVar = afgsVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f2 = aruVar.a;
            afgsVar = aruVar.e;
            aekVar = aruVar.d;
            defpackage.afga.cz(obj);
        }
        return new defpackage.bil(new java.lang.Float(f2 - afgsVar.a), aekVar);
    }

    public static final java.lang.Void b(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void c(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void d(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void e(java.lang.String str) {
        throw new java.lang.IndexOutOfBoundsException(str);
    }

    public static final void f(long j, android.os.Parcel parcel) {
        long jB = defpackage.dmb.b(j);
        byte b = 0;
        if (!defpackage.a.i(jB, 0L)) {
            if (defpackage.a.i(jB, 4294967296L)) {
                b = 1;
            } else if (defpackage.a.i(jB, 8589934592L)) {
                b = 2;
            }
        }
        parcel.writeByte(b);
        if (defpackage.a.i(defpackage.dmb.b(j), 0L)) {
            return;
        }
        parcel.writeFloat(defpackage.dmb.a(j));
    }

    public static final long g(android.os.Parcel parcel) {
        return defpackage.bzo.v(parcel.readLong());
    }

    public static final long h(android.os.Parcel parcel) {
        long j;
        byte b = parcel.readByte();
        if (b == 1) {
            j = 4294967296L;
        } else {
            j = b == 2 ? 8589934592L : 0L;
        }
        if (!defpackage.a.i(j, 0L)) {
            return defpackage.dmh.h(j, parcel.readFloat());
        }
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        return defpackage.dmh.h(0L, Float.NaN);
    }

    public static final defpackage.bys i(defpackage.asj asjVar, defpackage.bve bveVar, int i) {
        defpackage.asj asjVar2;
        java.lang.Object objG = bveVar.g();
        java.lang.Object obj = defpackage.bvd.a;
        if (objG == obj) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
            bveVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        defpackage.bwx bwxVar = (defpackage.bwx) objG;
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !bveVar.C(asjVar)) && (i & 6) != 4) {
            z = false;
        }
        java.lang.Object objG2 = bveVar.g();
        if (z || objG2 == obj) {
            asjVar2 = asjVar;
            defpackage.ais aisVar = new defpackage.ais(asjVar2, bwxVar, (defpackage.afdk) null, 15, (char[]) null);
            bveVar.x(aisVar);
            objG2 = aisVar;
        } else {
            asjVar2 = asjVar;
        }
        defpackage.bvx.g(asjVar2, (defpackage.affg) objG2, bveVar);
        return bwxVar;
    }

    public static final defpackage.bys j(defpackage.asj asjVar, defpackage.bve bveVar, int i) {
        java.lang.Object objG = bveVar.g();
        java.lang.Object obj = defpackage.bvd.a;
        if (objG == obj) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
            bveVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        defpackage.bwx bwxVar = (defpackage.bwx) objG;
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !bveVar.C(asjVar)) && (i & 6) != 4) {
            z = false;
        }
        java.lang.Object objG2 = bveVar.g();
        if (z || objG2 == obj) {
            objG2 = new defpackage.ais(asjVar, bwxVar, (defpackage.afdk) null, 13);
            bveVar.x(objG2);
        }
        defpackage.bvx.g(asjVar, (defpackage.affg) objG2, bveVar);
        return bwxVar;
    }

    public static final float k(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f < f2 : f > f2) ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final java.lang.Object l(defpackage.apw apwVar, float f, float f2, defpackage.aek aekVar, defpackage.aej aejVar, defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.arv arvVar;
        float fFloatValue;
        defpackage.aek aekVar2;
        afgs afgsVar;
        float f3 = f;
        if (afdkVar instanceof defpackage.arv) {
            arvVar = (defpackage.arv) afdkVar;
            int i = arvVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                arvVar.d = i - Integer.MIN_VALUE;
            } else {
                arvVar = new defpackage.arv(afdkVar);
            }
        } else {
            arvVar = new defpackage.arv(afdkVar);
        }
        defpackage.arv arvVar2 = arvVar;
        java.lang.Object obj = arvVar2.c;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = arvVar2.d;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            afgs afgsVar2 = new afgs();
            fFloatValue = ((java.lang.Number) aekVar.b()).floatValue();
            java.lang.Float f4 = new java.lang.Float(f3);
            boolean z = ((java.lang.Number) aekVar.b()).floatValue() != 0.0f;
            defpackage.art artVar = new defpackage.art(f2, afgsVar2, apwVar, affcVar, 0);
            arvVar2.e = aekVar;
            arvVar2.f = afgsVar2;
            arvVar2.a = f3;
            arvVar2.b = fFloatValue;
            arvVar2.d = 1;
            if (defpackage.afw.f(aekVar, f4, aejVar, z, artVar, arvVar2) == afdrVar) {
                return afdrVar;
            }
            aekVar2 = aekVar;
            afgsVar = afgsVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f5 = arvVar2.b;
            float f6 = arvVar2.a;
            afgsVar = arvVar2.f;
            aekVar2 = arvVar2.e;
            defpackage.afga.cz(obj);
            fFloatValue = f5;
            f3 = f6;
        }
        return new defpackage.bil(new java.lang.Float(f3 - afgsVar.a), defpackage.ca.C(aekVar2, 0.0f, k(((java.lang.Number) aekVar2.b()).floatValue(), fFloatValue), 29));
    }

    public static final defpackage.afbk m(float f, afgs afgsVar, defpackage.apw apwVar, defpackage.affc affcVar, defpackage.aei aeiVar) {
        float fA;
        float fK = k(((java.lang.Number) aeiVar.a()).floatValue(), f);
        float f2 = fK - afgsVar.a;
        try {
            fA = apwVar.a(f2);
        } catch (java.util.concurrent.CancellationException unused) {
            aeiVar.b();
            fA = 0.0f;
        }
        affcVar.invoke(java.lang.Float.valueOf(fA));
        if (java.lang.Math.abs(f2 - fA) > 0.5f || fK != ((java.lang.Number) aeiVar.a()).floatValue()) {
            aeiVar.b();
        }
        afgsVar.a += fA;
        return defpackage.afbk.a;
    }

    public static final void n(defpackage.aei aeiVar, defpackage.apw apwVar, defpackage.affc affcVar, float f) {
        float fA;
        try {
            fA = apwVar.a(f);
        } catch (java.util.concurrent.CancellationException unused) {
            aeiVar.b();
            fA = 0.0f;
        }
        affcVar.invoke(java.lang.Float.valueOf(fA));
        if (java.lang.Math.abs(f - fA) > 0.5f) {
            aeiVar.b();
        }
    }

    public static final float o(defpackage.bby bbyVar) {
        return bbyVar.w().e == defpackage.apn.b ? java.lang.Float.intBitsToFloat((int) (bbyVar.o() >> 32)) : java.lang.Float.intBitsToFloat((int) (bbyVar.o() & 4294967295L));
    }

    public static final boolean p(defpackage.bby bbyVar, float f) {
        bbyVar.w();
        return (bbyVar.v() ? -f : o(bbyVar)) <= 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    public static final defpackage.sr q(defpackage.dfb dfbVar) {
        java.lang.CharSequence charSequence;
        if (dfbVar.f().isEmpty()) {
            charSequence = dfbVar.b;
        } else {
            android.text.SpannableString spannableString = new android.text.SpannableString(dfbVar.b);
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            java.util.List listF = dfbVar.f();
            int size = listF.size();
            int i = 0;
            while (i < size) {
                defpackage.dfa dfaVar = (defpackage.dfa) listF.get(i);
                defpackage.dft dftVar = (defpackage.dft) dfaVar.a;
                int i2 = dfaVar.b;
                int i3 = dfaVar.c;
                parcelObtain.recycle();
                parcelObtain = android.os.Parcel.obtain();
                byte b = 1;
                if (!defpackage.a.i(dftVar.b(), defpackage.cjv.c())) {
                    parcelObtain.writeByte((byte) 1);
                    parcelObtain.writeLong(dftVar.b());
                }
                long j = dftVar.b;
                defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
                int i4 = i;
                if (!defpackage.a.i(j, defpackage.dmh.h(0L, Float.NaN))) {
                    parcelObtain.writeByte((byte) 2);
                    f(j, parcelObtain);
                }
                defpackage.dil dilVar = dftVar.c;
                if (dilVar != null) {
                    parcelObtain.writeByte((byte) 3);
                    parcelObtain.writeInt(dilVar.o);
                }
                defpackage.die dieVar = dftVar.d;
                if (dieVar != null) {
                    parcelObtain.writeByte((byte) 4);
                    int i5 = dieVar.a;
                    parcelObtain.writeByte((!defpackage.a.X(i5, 0) && defpackage.a.X(i5, 1)) ? (byte) 1 : (byte) 0);
                }
                defpackage.dif difVar = dftVar.e;
                if (difVar != null) {
                    parcelObtain.writeByte((byte) 5);
                    int i6 = difVar.a;
                    if (defpackage.a.X(i6, 0)) {
                        b = 0;
                    } else if (!defpackage.a.X(i6, 65535)) {
                        if (defpackage.a.X(i6, 1)) {
                            b = 2;
                        } else if (defpackage.a.X(i6, 2)) {
                            b = 3;
                        } else {
                            b = 0;
                        }
                    }
                    parcelObtain.writeByte(b);
                }
                java.lang.String str = dftVar.g;
                if (str != null) {
                    parcelObtain.writeByte((byte) 6);
                    parcelObtain.writeString(str);
                }
                long j2 = dftVar.h;
                if (!defpackage.a.i(j2, defpackage.dmh.h(0L, Float.NaN))) {
                    parcelObtain.writeByte((byte) 7);
                    f(j2, parcelObtain);
                }
                defpackage.dku dkuVar = dftVar.i;
                if (dkuVar != null) {
                    parcelObtain.writeByte((byte) 8);
                    parcelObtain.writeFloat(dkuVar.a);
                }
                defpackage.dlg dlgVar = dftVar.j;
                if (dlgVar != null) {
                    parcelObtain.writeByte((byte) 9);
                    parcelObtain.writeFloat(dlgVar.b);
                    parcelObtain.writeFloat(dlgVar.c);
                }
                long j3 = dftVar.l;
                if (!defpackage.a.i(j3, defpackage.cjv.c())) {
                    parcelObtain.writeByte((byte) 10);
                    parcelObtain.writeLong(j3);
                }
                defpackage.dlc dlcVar = dftVar.m;
                if (dlcVar != null) {
                    parcelObtain.writeByte((byte) 11);
                    parcelObtain.writeInt(dlcVar.d);
                }
                defpackage.clc clcVar = dftVar.n;
                if (clcVar != null) {
                    parcelObtain.writeByte((byte) 12);
                    parcelObtain.writeLong(clcVar.b);
                    long j4 = clcVar.c;
                    parcelObtain.writeFloat(java.lang.Float.intBitsToFloat((int) (j4 >> 32)));
                    parcelObtain.writeFloat(java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)));
                    parcelObtain.writeFloat(clcVar.d);
                }
                spannableString.setSpan(new android.text.Annotation("androidx.compose.text.SpanStyle", android.util.Base64.encodeToString(parcelObtain.marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
            }
            charSequence = spannableString;
        }
        return new defpackage.sr(android.content.ClipData.newPlainText("plain text", charSequence));
    }

    public static final defpackage.axa r(defpackage.cfy cfyVar) {
        return new defpackage.axa(1, false, new defpackage.amc(cfyVar, 4), cfyVar);
    }

    public static final defpackage.axa s(defpackage.cfu cfuVar) {
        return new defpackage.axa(3, false, new defpackage.amc(cfuVar, 5), cfuVar);
    }

    public static final defpackage.axa t(defpackage.cft cftVar) {
        return new defpackage.axa(2, false, new defpackage.amc(cftVar, 3), cftVar);
    }

    public static final defpackage.ave u(defpackage.dvl dvlVar) {
        return new defpackage.ave(dvlVar.b, dvlVar.c, dvlVar.d, dvlVar.e);
    }

    public static final defpackage.awu v(defpackage.bve bveVar) {
        java.util.WeakHashMap weakHashMap = defpackage.awv.a;
        return z(bveVar).k;
    }

    public static final defpackage.awu w(defpackage.bve bveVar) {
        java.util.WeakHashMap weakHashMap = defpackage.awv.a;
        return z(bveVar).h;
    }

    public static final defpackage.cgf x(defpackage.cgf cgfVar, defpackage.awu awuVar) {
        return cgfVar.a(new defpackage.ava(awuVar));
    }

    public static final defpackage.awv y(android.view.View view) {
        defpackage.awv awvVar;
        java.util.WeakHashMap weakHashMap = defpackage.awv.a;
        synchronized (weakHashMap) {
            java.lang.Object awvVar2 = weakHashMap.get(view);
            if (awvVar2 == null) {
                awvVar2 = new defpackage.awv(view);
                weakHashMap.put(view, awvVar2);
            }
            awvVar = (defpackage.awv) awvVar2;
        }
        return awvVar;
    }

    public static final defpackage.awv z(defpackage.bve bveVar) {
        android.view.View view = (android.view.View) bveVar.f(defpackage.daj.f);
        defpackage.awv awvVarY = y(view);
        boolean zE = bveVar.E(awvVarY) | bveVar.E(view);
        java.lang.Object objG = bveVar.g();
        if (zE || objG == defpackage.bvd.a) {
            objG = new defpackage.ajy(awvVarY, view, 11);
            bveVar.x(objG);
        }
        defpackage.bvx.c(awvVarY, (defpackage.affc) objG, bveVar);
        return awvVarY;
    }
}
