package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class acn implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ acn(defpackage.eqp eqpVar, defpackage.eqg eqgVar, defpackage.bwx bwxVar, int i) {
        this.d = i;
        this.a = eqpVar;
        this.c = eqgVar;
        this.b = bwxVar;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x041d  */
    /* JADX WARN: Code duplicated, block: B:265:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x01e6 A[LOOP:1: B:48:0x01a0->B:62:0x01e6, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [aiwg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [eqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r1v48, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [bwx, bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v57, types: [eqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v61, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v64, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v65, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v69, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [eqp] */
    /* JADX WARN: Type inference failed for: r3v50, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [bks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [djv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [bkb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.cli cliVar;
        defpackage.cli cliVar2;
        long jAK;
        defpackage.dga dgaVar;
        defpackage.ckc ckcVar;
        defpackage.dfa dfaVar;
        int i;
        java.lang.Object objA;
        int i2 = 9;
        int i3 = 11;
        int i4 = 10;
        int i5 = 7;
        ?? cliVar3 = 0;
        boolean z = true;
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                defpackage.aga agaVar = defpackage.acs.a;
                int iOrdinal = ((defpackage.acj) obj).ordinal();
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = this.c;
                if (iOrdinal == 0) {
                    defpackage.adf adfVar = ((defpackage.acw) this.b).b.d;
                    if (adfVar != null) {
                        cliVar2 = new defpackage.cli(adfVar.b);
                    } else {
                        defpackage.adf adfVar2 = ((defpackage.acx) obj3).b.d;
                        if (adfVar2 != null) {
                            cliVar = new defpackage.cli(adfVar2.b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    cliVar3 = obj2;
                } else {
                    if (iOrdinal != 2) {
                        throw new defpackage.afas();
                    }
                    defpackage.adf adfVar3 = ((defpackage.acx) obj3).b.d;
                    cliVar3 = new defpackage.cli(adfVar3 != null ? adfVar3.b : defpackage.tna.aK(0.5f, 0.5f));
                }
                if (cliVar3 != 0) {
                    cliVar3 = cliVar;
                    cliVar3 = cliVar2;
                    jAK = ((defpackage.cli) cliVar3).a;
                } else {
                    cliVar3 = cliVar;
                    cliVar3 = cliVar2;
                    jAK = defpackage.tna.aK(0.5f, 0.5f);
                }
                return new defpackage.cli(jAK);
            case 1:
                return new defpackage.cdt((androidx.compose.runtime.snapshots.SnapshotStateList) this.c, this.a, (defpackage.abr) this.b, 1);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                defpackage.anj anjVar = (defpackage.anj) this.b;
                float f = true != anjVar.c ? -1.0f : 1.0f;
                defpackage.aqp aqpVar = anjVar.b;
                float fB = f * aqpVar.b(aqpVar.d(((defpackage.izq) this.c).p(aqpVar.d(aqpVar.f(f * fFloatValue)))));
                if (java.lang.Math.abs(fB) < java.lang.Math.abs(fFloatValue)) {
                    defpackage.afgz.v(this.a, "Scroll animation cancelled because scroll was not consumed (" + fB + " < " + fFloatValue + ")");
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((bqp) ((ajnd) this.a).a).g(defpackage.aon.a(defpackage.cji.c(((defpackage.anu) obj).c, true != ((defpackage.aoq) this.b).i ? 1.0f : -1.0f), (defpackage.apn) this.c));
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.dkd dkdVar = (defpackage.dkd) obj;
                this.b.b(dkdVar);
                ?? r2 = this.c;
                boolean zF = defpackage.afga.f((java.lang.String) r2.a(), dkdVar.a());
                r2.b(dkdVar.a());
                if (!zF) {
                    this.a.invoke(dkdVar.a());
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.cml cmlVar = (defpackage.cml) obj;
                defpackage.beg begVar = (defpackage.beg) this.b;
                defpackage.bfi bfiVarE = begVar.e();
                if (bfiVarE != null) {
                    ?? r5 = this.c;
                    defpackage.ckc ckcVarB = cmlVar.r().b();
                    long jC = begVar.c();
                    long jB = begVar.b();
                    defpackage.cjs cjsVar = begVar.r;
                    long j = begVar.p;
                    boolean zI = defpackage.dgc.i(jC);
                    defpackage.dga dgaVar2 = bfiVarE.a;
                    if (!zI) {
                        cjsVar.j(j);
                        dgaVar = dgaVar2;
                        defpackage.asq.R(ckcVarB, jC, r5, dgaVar, cjsVar);
                    } else if (defpackage.dgc.i(jB)) {
                        dgaVar = dgaVar2;
                        long j2 = ((defpackage.dkd) this.a).b;
                        if (!defpackage.dgc.i(j2)) {
                            cjsVar.j(j);
                            defpackage.asq.R(ckcVarB, j2, r5, dgaVar, cjsVar);
                        }
                    } else {
                        defpackage.ckd ckdVar = new defpackage.ckd(dgaVar2.a.b.f());
                        defpackage.ckd ckdVar2 = ckdVar.a != 16 ? ckdVar : null;
                        long j3 = ckdVar2 != null ? ckdVar2.a : -72057594037927936L;
                        float fD = defpackage.ckd.d(j3);
                        float fC = defpackage.ckd.c(j3);
                        float fB2 = defpackage.ckd.b(j3);
                        float[] fArr = defpackage.clr.a;
                        cjsVar.j(defpackage.cjv.k(fD, fC, fB2, defpackage.ckd.a(j3) * 0.2f, defpackage.clr.y[(int) (j3 & 63)]));
                        dgaVar = dgaVar2;
                        defpackage.asq.R(ckcVarB, jB, r5, dgaVar, cjsVar);
                    }
                    defpackage.dga dgaVar3 = dgaVar;
                    boolean z2 = dgaVar3.o() && dgaVar3.a.f != 3;
                    if (z2) {
                        long j4 = dgaVar3.c;
                        defpackage.cjj cjjVarC = defpackage.bzo.C(0L, (((long) java.lang.Float.floatToRawIntBits((int) (j4 & 4294967295L))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits((int) (j4 >> 32))) << 32));
                        ckcVarB.g();
                        ckcVarB.r(cjjVarC);
                    }
                    defpackage.dft dftVar = dgaVar3.a.b.b;
                    defpackage.dlc dlcVar = dftVar.m;
                    if (dlcVar == null) {
                        dlcVar = defpackage.dlc.a;
                    }
                    defpackage.dlc dlcVar2 = dlcVar;
                    defpackage.clc clcVar = dftVar.n;
                    if (clcVar == null) {
                        clcVar = defpackage.clc.a;
                    }
                    defpackage.clc clcVar2 = clcVar;
                    defpackage.dai daiVar = dftVar.p;
                    if (daiVar == null) {
                        daiVar = defpackage.cmn.a;
                    }
                    defpackage.dai daiVar2 = daiVar;
                    try {
                        dftVar.g();
                        defpackage.dlf dlfVar = dftVar.a;
                        try {
                            dgaVar3.b.m(ckcVarB, dlfVar != defpackage.dle.a ? dlfVar.b() : -72057594037927936L, clcVar2, dlcVar2, daiVar2);
                            if (z2) {
                                ckcVarB.e();
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            ckcVar = ckcVarB;
                            if (z2) {
                                ckcVar.e();
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ckcVar = ckcVarB;
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.dfa dfaVar2 = (defpackage.dfa) obj;
                defpackage.afgq afgqVar = (defpackage.afgq) this.a;
                boolean z3 = afgqVar.a;
                java.lang.Object obj4 = this.b;
                if (z3 && (dfaVar2.a instanceof defpackage.dft)) {
                    int i6 = dfaVar2.b;
                    defpackage.dfa dfaVar3 = (defpackage.dfa) obj4;
                    if (i6 == dfaVar3.b && (i = dfaVar2.c) == dfaVar3.c) {
                        java.lang.Object dftVar2 = this.c;
                        if (dftVar2 == null) {
                            dftVar2 = new defpackage.dft(0L, 0L, null, null, null, null, null, 0L, null, null, 0L, null, null, 65535);
                        }
                        dfaVar = new defpackage.dfa(dftVar2, i6, i, "");
                    } else {
                        dfaVar = dfaVar2;
                    }
                } else {
                    dfaVar = dfaVar2;
                }
                afgqVar.a = defpackage.afga.f(obj4, dfaVar2);
                return dfaVar;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.asq.V((java.util.List) obj, (defpackage.iwa) this.b, this.c, (defpackage.fbl) ((defpackage.afgv) this.a).a);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.bil bilVar = (defpackage.bil) obj;
                int i7 = defpackage.bgq.a;
                java.util.List list = ((defpackage.bfx) this.c).b;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    defpackage.bfw bfwVar = (defpackage.bfw) list.get(i8);
                    if (bfwVar instanceof defpackage.bfy) {
                        defpackage.bil.ab(bilVar, new defpackage.amc(bfwVar, i2), ((defpackage.bfy) bfwVar).c == 0 ? null : new defpackage.ccz(-1930700965, true, new defpackage.bgx(bfwVar, 1)), new defpackage.ajz(bfwVar, this.a, 15, cliVar3));
                    } else if (bfwVar instanceof defpackage.bgc) {
                        java.lang.Object obj5 = this.b;
                        defpackage.bgc bgcVar = (defpackage.bgc) bfwVar;
                        if (obj5 != null) {
                            int i9 = bgcVar.c;
                            final android.view.textclassifier.TextClassification textClassification = bgcVar.b;
                            android.graphics.drawable.Drawable drawable = bgcVar.d;
                            if (i9 < 0) {
                                final android.content.Context context = (android.content.Context) obj5;
                                defpackage.bil.ab(bilVar, new defpackage.affg() { // from class: bgt
                                    @Override // defpackage.affg
                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                        defpackage.bve bveVar = (defpackage.bve) obj6;
                                        ((java.lang.Integer) obj7).intValue();
                                        bveVar.v(950061013);
                                        java.lang.String strValueOf = java.lang.String.valueOf(a$.ExternalSyntheticApiModelOutline1.m(textClassification));
                                        bveVar.o();
                                        return strValueOf;
                                    }
                                }, drawable != null ? new defpackage.ccz(-1123224187, true, new defpackage.bgx(drawable, 0)) : null, new defpackage.afer() { // from class: bgu
                                    @Override // defpackage.afer
                                    public final java.lang.Object invoke() throws android.app.PendingIntent.CanceledException {
                                        defpackage.axd.W(context, textClassification);
                                        return defpackage.afbk.a;
                                    }
                                });
                            } else {
                                final android.app.RemoteAction remoteActionM = a$.ExternalSyntheticApiModelOutline1.m(hh$.ExternalSyntheticApiModelOutline0.m(textClassification).get(i9));
                                defpackage.bil.ab(bilVar, new defpackage.affg() { // from class: bgv
                                    @Override // defpackage.affg
                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                        defpackage.bve bveVar = (defpackage.bve) obj6;
                                        ((java.lang.Integer) obj7).intValue();
                                        bveVar.v(-1376593684);
                                        java.lang.String string = a$.ExternalSyntheticApiModelOutline1.m(remoteActionM).toString();
                                        bveVar.o();
                                        return string;
                                    }
                                }, drawable != null ? new defpackage.ccz(1106162332, true, new defpackage.bgx(drawable, 2)) : null, new defpackage.afer() { // from class: bgw
                                    @Override // defpackage.afer
                                    public final java.lang.Object invoke() throws android.app.PendingIntent.CanceledException {
                                        defpackage.axd.V(a$.ExternalSyntheticApiModelOutline1.m(remoteActionM));
                                        return defpackage.afbk.a;
                                    }
                                });
                            }
                        }
                    } else if (bfwVar instanceof defpackage.bga) {
                        bilVar.b.add(defpackage.alt.b);
                    }
                }
                return defpackage.afbk.a;
            case 9:
                defpackage.crd crdVar = (defpackage.crd) obj;
                if (this.b.b(crdVar.c, this.c)) {
                    java.lang.Object obj6 = this.a;
                    crdVar.b();
                    ((defpackage.afgq) obj6).a = true;
                }
                return defpackage.afbk.a;
            case 10:
                defpackage.bil bilVar2 = (defpackage.bil) obj;
                bilVar2.g();
                java.lang.Object obj7 = this.c;
                defpackage.beo beoVar = defpackage.beo.Cut;
                defpackage.blw blwVar = (defpackage.blw) obj7;
                boolean z4 = blwVar.w() && blwVar.u() && blwVar.x != null;
                java.lang.Object obj8 = this.b;
                ?? r12 = this.a;
                android.content.Context context2 = (android.content.Context) obj8;
                defpackage.bxi.E(bilVar2, r12, context2, beoVar, z4, new defpackage.bln(blwVar, (defpackage.afdk) null, 2, (byte[]) null));
                defpackage.bxi.E(bilVar2, r12, context2, defpackage.beo.Copy, blwVar.w() && blwVar.x != null, new defpackage.bln(blwVar, (defpackage.afdk) null, 3, (char[]) null));
                defpackage.bxi.E(bilVar2, r12, context2, defpackage.beo.Paste, blwVar.u() && ((java.lang.Boolean) blwVar.p.a()).booleanValue() && blwVar.x != null, new defpackage.bln(blwVar, (defpackage.afdk) null, 4, (short[]) null));
                defpackage.beo beoVar2 = defpackage.beo.SelectAll;
                long j5 = blwVar.f().b;
                long j6 = defpackage.dgc.a;
                int i10 = (int) (j5 >> 32);
                int i11 = (int) (4294967295L & j5);
                defpackage.bxi.D(bilVar2, context2, beoVar2, java.lang.Math.max(i10, i11) - java.lang.Math.min(i10, i11) != blwVar.f().a().length(), new defpackage.bjd(obj7, i3), new defpackage.bjd(obj7, 12));
                defpackage.bxi.D(bilVar2, context2, defpackage.beo.Autofill, blwVar.u() && defpackage.dgc.i(blwVar.f().b), null, new defpackage.bjd(obj7, 13));
                bilVar2.g();
                return defpackage.afbk.a;
            case 11:
                if (this.c.contains(obj) && (objA = ((defpackage.bww) this.b).a.a(obj)) != null) {
                    java.lang.Object obj9 = this.a;
                    if (objA instanceof defpackage.aaw) {
                        defpackage.aaw aawVar = (defpackage.aaw) objA;
                        java.lang.Object[] objArr = aawVar.b;
                        long[] jArr = aawVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j7 = jArr[i12];
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = i12 - length;
                                    int i14 = 0;
                                    while (true) {
                                        int i15 = 8 - ((~i13) >>> 31);
                                        if (i14 < i15) {
                                            if ((255 & j7) < 128) {
                                                aiyx aiyxVar = (aiyx) objArr[(i12 << 3) + i14];
                                                defpackage.afgv afgvVar = (defpackage.afgv) obj9;
                                                if (afgvVar.a == null) {
                                                    afgvVar.a = new java.util.ArrayList();
                                                }
                                                ((java.util.List) afgvVar.a).add(aiyxVar);
                                            }
                                            j7 >>= 8;
                                            i14++;
                                        } else if (i15 == 8) {
                                            if (i12 != length) {
                                                i12++;
                                            }
                                        }
                                    }
                                } else if (i12 != length) {
                                    i12++;
                                }
                            }
                        }
                    } else {
                        aiyx aiyxVar2 = (aiyx) objA;
                        defpackage.afgv afgvVar2 = (defpackage.afgv) obj9;
                        if (afgvVar2.a == null) {
                            afgvVar2.a = new java.util.ArrayList();
                        }
                        ((java.util.List) afgvVar2.a).add(aiyxVar2);
                    }
                }
                return defpackage.afbk.a;
            case 12:
                defpackage.kkr kkrVar = new defpackage.kkr(this.b, z ? 1 : 0);
                ?? r3 = this.c;
                java.lang.Object obj10 = this.a;
                ((defpackage.eqp) obj10).eM(r3, kkrVar);
                return new defpackage.agp(obj10, kkrVar, 7);
            case 13:
                defpackage.cdu cduVar = (defpackage.cdu) this.b;
                defpackage.aau aauVar = cduVar.c;
                java.lang.Object obj11 = this.a;
                if (defpackage.aau.f(aauVar, obj11)) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bl(obj11, "Key ", " was used multiple times "));
                }
                java.lang.Object obj12 = this.c;
                cduVar.a.remove(obj11);
                aauVar.m(obj11, obj12);
                return new defpackage.cdt(cduVar, obj11, (defpackage.cdy) obj12, 0);
            case 14:
                java.lang.Throwable th3 = (java.lang.Throwable) obj;
                this.c.invoke(th3);
                ?? r4 = ((defpackage.mku) this.b).d;
                r4.u(th3);
                while (true) {
                    java.lang.Object objA2 = aiyo.a(r4.i());
                    if (objA2 == null) {
                        return defpackage.afbk.a;
                    }
                    this.a.invoke(objA2, th3);
                }
                break;
            case 15:
                defpackage.eqp eqpVar = (defpackage.eqp) this.c.invoke(obj);
                defpackage.afgv afgvVar3 = (defpackage.afgv) this.a;
                java.lang.Object obj13 = afgvVar3.a;
                if (obj13 != eqpVar) {
                    java.lang.Object obj14 = this.b;
                    if (obj13 != null) {
                        ((defpackage.eqr) obj14).s((defpackage.eqp) obj13);
                    }
                    afgvVar3.a = eqpVar;
                    java.lang.Object obj15 = afgvVar3.a;
                    if (obj15 != null) {
                        ((defpackage.eqr) obj14).r((defpackage.eqp) obj15, new defpackage.kku(new defpackage.dbj(obj14, i4), 1));
                    }
                }
                return defpackage.afbk.a;
            case 16:
                final defpackage.afgv afgvVar4 = new defpackage.afgv();
                final ?? r6 = this.a;
                final defpackage.ese eseVar = (defpackage.ese) this.c;
                defpackage.eqe eqeVar = new defpackage.eqe() { // from class: esc
                    @Override // defpackage.eqe
                    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
                        defpackage.afgv afgvVar5 = afgvVar4;
                        int iOrdinal2 = epwVar.ordinal();
                        if (iOrdinal2 == 2) {
                            afgvVar5.a = r6.invoke(eseVar);
                        } else {
                            if (iOrdinal2 != 3) {
                                return;
                            }
                            afgvVar5.a = null;
                        }
                    }
                };
                ?? r0 = this.b;
                r0.getLifecycle().c(eqeVar);
                return new defpackage.cdt((defpackage.eqg) r0, eqeVar, afgvVar4, 2);
            case 17:
                defpackage.jmk jmkVar = (defpackage.jmk) obj;
                jmkVar.getClass();
                java.lang.Object obj16 = this.c;
                java.lang.Object obj17 = this.b;
                defpackage.bxn bxnVar = new defpackage.bxn(obj17, obj16, i4);
                defpackage.ntl ntlVar = (defpackage.ntl) this.a;
                ntlVar.e(jmkVar, bxnVar);
                ntlVar.g(jmkVar, new defpackage.jmk[]{defpackage.jmk.d}, new defpackage.bxn(obj17, obj16, i3));
                return defpackage.afbk.a;
            case 18:
                defpackage.jmk jmkVar2 = (defpackage.jmk) obj;
                jmkVar2.getClass();
                java.lang.Object obj18 = this.c;
                java.lang.Object obj19 = this.b;
                defpackage.bxn bxnVar2 = new defpackage.bxn(obj19, obj18, i5);
                defpackage.ntl ntlVar2 = (defpackage.ntl) this.a;
                ntlVar2.e(jmkVar2, bxnVar2);
                ntlVar2.g(jmkVar2, new defpackage.jmk[]{defpackage.jmk.b}, new defpackage.bxn(obj19, obj18, i2));
                return defpackage.afbk.a;
            case 19:
                ((defpackage.bxi) obj).getClass();
                defpackage.nzv nzvVar = new defpackage.nzv((defpackage.byl) this.a, this.c);
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.TIME_TICK");
                intentFilter.addAction("android.intent.action.TIME_SET");
                intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                java.lang.Object obj20 = this.b;
                ((android.content.Context) obj20).registerReceiver(nzvVar, intentFilter);
                return new defpackage.agp(obj20, nzvVar, 8);
            default:
                defpackage.afdo afdoVar = defpackage.tcu.a;
                if (obj != null) {
                    defpackage.afgv afgvVar5 = (defpackage.afgv) this.a;
                    ((defpackage.eqp) this.b).m(this.c.invoke(obj, afgvVar5.a));
                    afgvVar5.a = obj;
                }
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ acn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ acn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ acn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ acn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int[] iArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ acn(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
