package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class dad extends defpackage.edq {
    final /* synthetic */ defpackage.dah a;

    public dad(defpackage.dah dahVar) {
        this.a = dahVar;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x029e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:394:0x0857  */
    /* JADX WARN: Type inference failed for: r11v64, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v66, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.edq
    public final edn a(int i) {
        defpackage.hio hioVar;
        defpackage.dah dahVar;
        boolean z;
        defpackage.dej dejVar;
        defpackage.ddw ddwVar;
        android.text.SpannableString spannableString;
        defpackage.ddw ddwVar2;
        int i2;
        int i3;
        defpackage.dah dahVar2;
        boolean z2;
        defpackage.dej dejVar2;
        defpackage.czz czzVar;
        edn ednVar;
        defpackage.ddp ddpVar;
        defpackage.ddn ddnVar;
        java.lang.CharSequence charSequenceE;
        defpackage.ddz ddzVarR;
        android.content.ClipDescription primaryClipDescription;
        java.util.List arrayList;
        java.util.List arrayList2;
        int i4;
        int i5;
        int i6;
        defpackage.dah dahVar3 = this.a;
        defpackage.czz czzVar2 = dahVar3.b;
        if (czzVar2.P().b().getLifecycle().a() == defpackage.epx.a || (hioVar = (defpackage.hio) dahVar3.q().a(i)) == null) {
            edn ednVarR = dahVar3.r();
            dahVar2 = dahVar3;
            ednVar = ednVarR;
            i3 = i;
        } else {
            java.lang.Object obj = hioVar.b;
            defpackage.dec decVar = (defpackage.dec) obj;
            boolean zF = defpackage.afga.f(decVar.g().g(defpackage.def.o), java.lang.Boolean.TRUE);
            if (!zF || dahVar3.C()) {
                edn ednVarB = edn.b();
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    axd$.ExternalSyntheticApiModelOutline0.m(ednVarB.a, zF);
                } else {
                    ednVarB.m(64, zF);
                }
                if (i == -1) {
                    java.lang.Object parentForAccessibility = czzVar2.getParentForAccessibility();
                    ednVarB.I(parentForAccessibility instanceof android.view.View ? (android.view.View) parentForAccessibility : null);
                } else {
                    defpackage.dec decVarI = decVar.i();
                    java.lang.Integer numValueOf = decVarI != null ? java.lang.Integer.valueOf(decVarI.c) : null;
                    if (numValueOf == null) {
                        defpackage.csc.a(defpackage.a.bm(i, "semanticsNode ", " has null parent"));
                        throw new defpackage.afap();
                    }
                    defpackage.mku mkuVar = czzVar2.W;
                    int iIntValue = numValueOf.intValue();
                    if (iIntValue == mkuVar.x().c) {
                        iIntValue = -1;
                    }
                    ednVarB.J(czzVar2, iIntValue);
                }
                ednVarB.O(czzVar2, i);
                ednVarB.o(dahVar3.M(hioVar));
                android.content.res.Resources resources = czzVar2.getContext().getResources();
                defpackage.hio hioVar2 = (defpackage.hio) dahVar3.q().a(i);
                boolean z3 = hioVar2 != null && hioVar2.a;
                ednVarB.r("android.view.View");
                defpackage.ddz ddzVar = decVar.b;
                defpackage.dej dejVar3 = defpackage.def.H;
                if (ddzVar.f(dejVar3)) {
                    ednVarB.r("android.widget.EditText");
                }
                if (ddzVar.f(defpackage.def.D)) {
                    ednVarB.r("android.widget.TextView");
                }
                defpackage.ddw ddwVar3 = (defpackage.ddw) ddzVar.g(defpackage.def.A);
                if (ddwVar3 != null && (decVar.j() || decVar.k((4 & 1) != 0 ? !decVar.e : false, true & ((4 & 2) == 0)).isEmpty())) {
                    int i7 = ddwVar3.a;
                    if (i7 == 4) {
                        ednVarB.K(resources.getString(2132085372));
                    } else if (i7 == 2) {
                        ednVarB.K(resources.getString(2132085369));
                    } else if (i7 != 5 || defpackage.daw.i(decVar) || ddzVar.a) {
                        ednVarB.r(defpackage.dbc.e(i7));
                    }
                }
                ednVarB.G(czzVar2.getContext().getPackageName());
                boolean zB = defpackage.ded.b(decVar);
                android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = ednVarB.a;
                a$.ExternalSyntheticApiModelOutline2.m(accessibilityNodeInfo, zB);
                boolean zC = dahVar3.C();
                boolean zBooleanValue = ((java.lang.Boolean) ddzVar.d(defpackage.def.n, new defpackage.bmd(8))).booleanValue();
                boolean z4 = ddzVar.a;
                java.lang.Object obj2 = obj;
                java.util.List listK = decVar.k((4 & 1) != 0 ? !decVar.e : false, true & ((4 & 2) == 0));
                int size = listK.size();
                if (zBooleanValue && z4 && size > 1) {
                    int size2 = listK.size();
                    defpackage.dec[] decVarArr = new defpackage.dec[size2];
                    for (int i8 = 0; i8 < size2; i8++) {
                        decVarArr[i8] = (defpackage.dec) listK.get(i8);
                    }
                    defpackage.afga.bz(decVarArr, new defpackage.dab(defpackage.del.a, 0));
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < size) {
                        defpackage.dec decVar2 = decVarArr[i9];
                        int i11 = i9;
                        defpackage.zo zoVarQ = dahVar3.q();
                        int i12 = decVar2.c;
                        defpackage.hio hioVar3 = (defpackage.hio) zoVarQ.a(i12);
                        defpackage.dec[] decVarArr2 = decVarArr;
                        if (hioVar3 != null && i12 != -1) {
                            dahVar3.N(hioVar3, ednVarB, zC, i10);
                            i10++;
                        }
                        i9 = i11 + 1;
                        decVarArr = decVarArr2;
                    }
                } else {
                    int size3 = listK.size();
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < size3) {
                        defpackage.dec decVar3 = (defpackage.dec) listK.get(i13);
                        int i15 = size3;
                        defpackage.zo zoVarQ2 = dahVar3.q();
                        int i16 = decVar3.c;
                        defpackage.hio hioVar4 = (defpackage.hio) zoVarQ2.a(i16);
                        int i17 = i13;
                        if (hioVar4 != null && i16 != -1) {
                            dahVar3.N(hioVar4, ednVarB, zC, i14);
                            i14++;
                        }
                        i13 = i17 + 1;
                        size3 = i15;
                    }
                }
                if (i == dahVar3.d) {
                    ednVarB.l(true);
                    ednVarB.h(defpackage.edm.e);
                } else {
                    ednVarB.l(false);
                    ednVarB.h(defpackage.edm.d);
                }
                defpackage.dfb dfbVarC = defpackage.daw.c(decVar);
                if (dfbVarC != null) {
                    defpackage.ngb ngbVar = dahVar3.A;
                    defpackage.wde wdeVarJ = czzVar2.J();
                    defpackage.dlo dloVarR = czzVar2.r();
                    android.text.SpannableString spannableString2 = new android.text.SpannableString(dfbVarC.b);
                    java.util.List list = dfbVarC.c;
                    if (list != null) {
                        int size4 = list.size();
                        int i18 = 0;
                        while (i18 < size4) {
                            int i19 = size4;
                            defpackage.dfa dfaVar = (defpackage.dfa) list.get(i18);
                            java.util.List list2 = list;
                            defpackage.dft dftVar = (defpackage.dft) dfaVar.a;
                            int i20 = i18;
                            int i21 = dfaVar.b;
                            int i22 = dfaVar.c;
                            defpackage.dah dahVar4 = dahVar3;
                            boolean z5 = z3;
                            defpackage.dft dftVarF = defpackage.dft.f(dftVar, 0L, 65503);
                            defpackage.dej dejVar4 = dejVar3;
                            defpackage.ddw ddwVar4 = ddwVar3;
                            defpackage.dki.j(spannableString2, dftVarF.b(), i21, i22);
                            android.text.SpannableString spannableString3 = spannableString2;
                            defpackage.dki.k(spannableString3, dftVarF.b, dloVarR, i21, i22);
                            defpackage.dlo dloVar = dloVarR;
                            defpackage.dil dilVar = dftVarF.c;
                            if (dilVar == null && dftVarF.d == null) {
                                i5 = 33;
                            } else {
                                if (dilVar == null) {
                                    dilVar = defpackage.dil.k;
                                }
                                defpackage.die dieVar = dftVarF.d;
                                int i23 = dieVar != null ? dieVar.a : 0;
                                boolean z6 = dilVar.compareTo(defpackage.dil.f) >= 0;
                                if (i23 != 0) {
                                    if (z6) {
                                        i4 = 3;
                                    } else if (i23 != 0) {
                                        i4 = 2;
                                    } else {
                                        i4 = 0;
                                    }
                                } else if (z6) {
                                    i4 = 1;
                                } else if (i23 != 0) {
                                    i4 = 2;
                                } else {
                                    i4 = 0;
                                }
                                android.text.style.StyleSpan styleSpan = new android.text.style.StyleSpan(i4);
                                i5 = 33;
                                spannableString3.setSpan(styleSpan, i21, i22, 33);
                            }
                            defpackage.dhz dhzVar = dftVarF.f;
                            if (dhzVar == null) {
                                i6 = i5;
                            } else if (dhzVar instanceof defpackage.din) {
                                spannableString3.setSpan(new android.text.style.TypefaceSpan(((defpackage.din) dhzVar).f), i21, i22, i5);
                                i6 = i5;
                            } else {
                                defpackage.dif difVar = dftVarF.e;
                                java.lang.Object objA = defpackage.dax.o(wdeVarJ, dhzVar, null, 0, difVar != null ? difVar.a : 65535, 6).a();
                                objA.getClass();
                                android.text.style.TypefaceSpan typefaceSpan = new android.text.style.TypefaceSpan((android.graphics.Typeface) objA);
                                i6 = 33;
                                spannableString3.setSpan(typefaceSpan, i21, i22, 33);
                            }
                            defpackage.dlc dlcVar = dftVarF.m;
                            if (dlcVar != null) {
                                if (dlcVar.a(defpackage.dlc.b)) {
                                    spannableString3.setSpan(new android.text.style.UnderlineSpan(), i21, i22, i6);
                                }
                                if (dlcVar.a(defpackage.dlc.c)) {
                                    spannableString3.setSpan(new android.text.style.StrikethroughSpan(), i21, i22, i6);
                                }
                            }
                            defpackage.dlg dlgVar = dftVarF.j;
                            if (dlgVar != null) {
                                spannableString3.setSpan(new android.text.style.ScaleXSpan(dlgVar.b), i21, i22, i6);
                            }
                            defpackage.dki.l(spannableString3, dftVarF.k, i21, i22);
                            defpackage.dki.i(spannableString3, dftVarF.l, i21, i22);
                            i18 = i20 + 1;
                            ddwVar3 = ddwVar4;
                            spannableString2 = spannableString3;
                            dejVar3 = dejVar4;
                            size4 = i19;
                            list = list2;
                            dahVar3 = dahVar4;
                            z3 = z5;
                            dloVarR = dloVar;
                        }
                    }
                    dahVar = dahVar3;
                    z = z3;
                    android.text.SpannableString spannableString4 = spannableString2;
                    dejVar = dejVar3;
                    defpackage.ddw ddwVar5 = ddwVar3;
                    int iA = dfbVarC.a();
                    java.util.List list3 = dfbVarC.a;
                    if (list3 != null) {
                        arrayList = new java.util.ArrayList(list3.size());
                        int size5 = list3.size();
                        int i24 = 0;
                        while (i24 < size5) {
                            java.lang.Object obj3 = list3.get(i24);
                            defpackage.dfa dfaVar2 = (defpackage.dfa) obj3;
                            defpackage.ddw ddwVar6 = ddwVar5;
                            if (dfaVar2.a instanceof defpackage.dge) {
                                int i25 = dfaVar2.b;
                                int i26 = dfaVar2.c;
                                defpackage.dfb dfbVar = defpackage.dfc.a;
                                if ((((i25 == i26) | (iA == 0)) & (i25 == 0)) | ((i26 > 0) & (i25 < iA))) {
                                    arrayList.add(obj3);
                                }
                            }
                            i24++;
                            ddwVar5 = ddwVar6;
                        }
                        ddwVar = ddwVar5;
                    } else {
                        ddwVar = ddwVar5;
                        arrayList = defpackage.afce.a;
                    }
                    if (arrayList.size() > 0) {
                        defpackage.dfa dfaVar3 = (defpackage.dfa) arrayList.get(0);
                        defpackage.dge dgeVar = (defpackage.dge) dfaVar3.a;
                        int i27 = dfaVar3.b;
                        int i28 = dfaVar3.c;
                        if (dgeVar instanceof defpackage.dge) {
                            throw null;
                        }
                        throw new defpackage.afas();
                    }
                    int iA2 = dfbVarC.a();
                    if (list3 != null) {
                        arrayList2 = new java.util.ArrayList(list3.size());
                        int size6 = list3.size();
                        for (int i29 = 0; i29 < size6; i29++) {
                            java.lang.Object obj4 = list3.get(i29);
                            defpackage.dfa dfaVar4 = (defpackage.dfa) obj4;
                            if (dfaVar4.a instanceof defpackage.dgf) {
                                int i30 = dfaVar4.b;
                                int i31 = dfaVar4.c;
                                defpackage.dfb dfbVar2 = defpackage.dfc.a;
                                if ((((i30 == i31) | (iA2 == 0)) & (i30 == 0)) | ((i31 > 0) & (i30 < iA2))) {
                                    arrayList2.add(obj4);
                                }
                            }
                        }
                    } else {
                        arrayList2 = defpackage.afce.a;
                    }
                    int size7 = arrayList2.size();
                    for (int i32 = 0; i32 < size7; i32++) {
                        defpackage.dfa dfaVar5 = (defpackage.dfa) arrayList2.get(i32);
                        defpackage.dgf dgfVar = (defpackage.dgf) dfaVar5.a;
                        int i33 = dfaVar5.b;
                        int i34 = dfaVar5.c;
                        java.lang.Object obj5 = ngbVar.a.get(dgfVar);
                        obj5.getClass();
                        spannableString4.setSpan((android.text.style.URLSpan) obj5, i33, i34, 33);
                    }
                    java.util.List listG = dfbVarC.g(dfbVarC.a());
                    int size8 = listG.size();
                    for (int i35 = 0; i35 < size8; i35++) {
                        defpackage.dfa dfaVar6 = (defpackage.dfa) listG.get(i35);
                        int i36 = dfaVar6.b;
                        int i37 = dfaVar6.c;
                        if (i36 != i37) {
                            java.lang.Object obj6 = dfaVar6.a;
                            defpackage.dfg dfgVar = (defpackage.dfg) obj6;
                            if (dfgVar instanceof defpackage.dff) {
                                obj6.getClass();
                                defpackage.dfa dfaVar7 = new defpackage.dfa((defpackage.dff) obj6, i36, i37, "");
                                java.lang.Object obj7 = ngbVar.b.get(dfaVar7);
                                if (obj7 == null) {
                                    throw null;
                                }
                                spannableString4.setSpan((android.text.style.URLSpan) obj7, i36, i37, 33);
                            } else {
                                ?? r11 = ngbVar.c;
                                java.lang.Object dkqVar = r11.get(dfaVar6);
                                if (dkqVar == null) {
                                    dkqVar = new defpackage.dkq(dfgVar);
                                    r11.put(dfaVar6, dkqVar);
                                }
                                spannableString4.setSpan((android.text.style.ClickableSpan) dkqVar, i36, i37, 33);
                            }
                        }
                    }
                    spannableString = (android.text.SpannableString) defpackage.dah.K(spannableString4);
                } else {
                    dahVar = dahVar3;
                    z = z3;
                    dejVar = dejVar3;
                    ddwVar = ddwVar3;
                    spannableString = null;
                }
                ednVarB.Q(spannableString);
                defpackage.dej dejVar5 = defpackage.def.P;
                if (ddzVar.f(dejVar5)) {
                    accessibilityNodeInfo.setContentInvalid(true);
                    ednVarB.y((java.lang.CharSequence) ddzVar.g(dejVar5));
                }
                ednVarB.P(defpackage.daw.d(decVar, resources));
                ednVarB.p(defpackage.daw.f(decVar));
                defpackage.det detVar = (defpackage.det) ddzVar.g(defpackage.def.M);
                if (detVar != null) {
                    if (detVar == defpackage.det.a) {
                        ednVarB.q(true);
                    } else if (detVar == defpackage.det.b) {
                        ednVarB.q(false);
                    }
                }
                defpackage.dej dejVar6 = defpackage.def.L;
                java.lang.Boolean bool = (java.lang.Boolean) ddzVar.g(dejVar6);
                if (bool != null) {
                    boolean zBooleanValue2 = bool.booleanValue();
                    if (ddwVar == null) {
                        ddwVar2 = ddwVar;
                        i2 = 4;
                    } else {
                        ddwVar2 = ddwVar;
                        i2 = 4;
                        if (ddwVar2.a == 4) {
                            accessibilityNodeInfo.setSelected(zBooleanValue2);
                        }
                    }
                    ednVarB.q(zBooleanValue2);
                } else {
                    ddwVar2 = ddwVar;
                    i2 = 4;
                }
                if (!ddzVar.a || decVar.k((4 & 1) != 0 ? !decVar.e : false, true & ((4 & 2) == 0)).isEmpty()) {
                    java.util.List list4 = (java.util.List) ddzVar.g(defpackage.def.a);
                    ednVarB.v(list4 != null ? (java.lang.String) defpackage.afga.aB(list4) : null);
                }
                defpackage.dej dejVar7 = defpackage.def.B;
                java.lang.String str = (java.lang.String) ddzVar.g(dejVar7);
                if (str != null) {
                    java.lang.Object objI = obj2;
                    while (objI != null) {
                        defpackage.dej dejVar8 = defpackage.deg.a;
                        defpackage.dec decVar4 = (defpackage.dec) objI;
                        defpackage.ddz ddzVar2 = decVar4.b;
                        if (ddzVar2.f(dejVar8)) {
                            if (!((java.lang.Boolean) ddzVar2.c(dejVar8)).booleanValue()) {
                                break;
                            }
                            accessibilityNodeInfo.setViewIdResourceName(str);
                            break;
                        }
                        objI = decVar4.i();
                    }
                }
                java.lang.String str2 = (java.lang.String) ddzVar.g(defpackage.def.v);
                if (str2 != null) {
                    ednVarB.C(str2);
                }
                if (((defpackage.afbk) ddzVar.g(defpackage.def.h)) != null) {
                    ednVarB.B(true);
                }
                if (((defpackage.afbk) ddzVar.g(defpackage.def.i)) != null) {
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        alh$.ExternalSyntheticApiModelOutline0.m(accessibilityNodeInfo, true);
                    } else {
                        ednVarB.m(8, true);
                    }
                }
                i3 = i;
                dahVar2 = dahVar;
                if (i3 != -1) {
                    int iD = dahVar2.z.d(decVar.c);
                    if (iD != -1) {
                        a$.ExternalSyntheticApiModelOutline2.m(accessibilityNodeInfo, iD);
                    } else {
                        android.util.Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                    }
                }
                accessibilityNodeInfo.setPassword(ddzVar.f(defpackage.def.O));
                java.lang.Object objG = ddzVar.g(defpackage.def.R);
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                accessibilityNodeInfo.setEditable(defpackage.afga.f(objG, bool2));
                java.lang.Integer num = (java.lang.Integer) ddzVar.g(defpackage.def.S);
                ednVarB.E(num != null ? num.intValue() : -1);
                ednVarB.x(defpackage.daw.e(decVar));
                defpackage.dej dejVar9 = defpackage.def.l;
                ednVarB.z(ddzVar.f(dejVar9));
                if (ednVarB.X()) {
                    ednVarB.A(((java.lang.Boolean) ddzVar.c(dejVar9)).booleanValue());
                    if (ednVarB.Y()) {
                        ednVarB.g(2);
                        dahVar2.e = i3;
                    } else {
                        ednVarB.g(1);
                    }
                }
                ednVarB.U((defpackage.ded.a(decVar) || z) ? false : true);
                if (decVar.j()) {
                    defpackage.dec decVarI2 = decVar.i();
                    decVarI2.getClass();
                    obj2 = decVarI2;
                }
                if (((defpackage.dec) obj2).d().h()) {
                    z2 = false;
                    ednVarB.U(false);
                } else {
                    z2 = false;
                }
                if (((defpackage.ddu) ddzVar.g(defpackage.def.k)) != null) {
                    throw null;
                }
                ednVarB.s(z2);
                defpackage.ddn ddnVar2 = (defpackage.ddn) ddzVar.g(defpackage.ddy.b);
                if (ddnVar2 != null) {
                    ednVarB.s(((ddwVar2 == null || ddwVar2.a != 4) && (ddwVar2 == null || ddwVar2.a != 3)) || !defpackage.afga.f(ddzVar.g(dejVar6), bool2));
                    if (defpackage.daw.e(decVar) && ednVarB.V()) {
                        ednVarB.h(new defpackage.edm(null, 16, ddnVar2.a, null, null));
                    }
                }
                ednVarB.D(false);
                defpackage.ddn ddnVar3 = (defpackage.ddn) ddzVar.g(defpackage.ddy.c);
                if (ddnVar3 != null) {
                    ednVarB.D(true);
                    if (defpackage.daw.e(decVar)) {
                        ednVarB.h(new defpackage.edm(null, 32, ddnVar3.a, null, null));
                    }
                }
                defpackage.ddn ddnVar4 = (defpackage.ddn) ddzVar.g(defpackage.ddy.q);
                if (ddnVar4 != null) {
                    ednVarB.h(new defpackage.edm(null, 16384, ddnVar4.a, null, null));
                }
                if (defpackage.daw.e(decVar)) {
                    defpackage.ddn ddnVar5 = (defpackage.ddn) ddzVar.g(defpackage.ddy.k);
                    if (ddnVar5 != null) {
                        ednVarB.h(new defpackage.edm(null, 2097152, ddnVar5.a, null, null));
                    }
                    defpackage.ddn ddnVar6 = (defpackage.ddn) ddzVar.g(defpackage.ddy.p);
                    if (ddnVar6 != null) {
                        ednVarB.h(new defpackage.edm(null, android.R.id.accessibilityActionImeEnter, ddnVar6.a, null, null));
                    }
                    defpackage.ddn ddnVar7 = (defpackage.ddn) ddzVar.g(defpackage.ddy.r);
                    if (ddnVar7 != null) {
                        ednVarB.h(new defpackage.edm(null, 65536, ddnVar7.a, null, null));
                    }
                    defpackage.ddn ddnVar8 = (defpackage.ddn) ddzVar.g(defpackage.ddy.s);
                    if (ddnVar8 != null && ednVarB.Y() && (primaryClipDescription = czzVar2.G().a().getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
                        ednVarB.h(new defpackage.edm(null, 32768, ddnVar8.a, null, null));
                    }
                }
                java.lang.String strL = defpackage.dah.L(decVar);
                if (strL == null || strL.length() == 0) {
                    dejVar2 = dejVar;
                } else {
                    accessibilityNodeInfo.setTextSelection(dahVar2.l(decVar), dahVar2.k(decVar));
                    defpackage.ddn ddnVar9 = (defpackage.ddn) ddzVar.g(defpackage.ddy.j);
                    ednVarB.h(new defpackage.edm(null, 131072, ddnVar9 != null ? ddnVar9.a : null, null, null));
                    ednVarB.g(256);
                    ednVarB.g(512);
                    ednVarB.F(11);
                    java.util.List list5 = (java.util.List) ddzVar.g(defpackage.def.a);
                    if ((list5 == null || list5.isEmpty()) && ddzVar.f(defpackage.ddy.a)) {
                        dejVar2 = dejVar;
                        if (!ddzVar.f(dejVar2) || defpackage.afga.f(ddzVar.g(dejVar9), bool2)) {
                            defpackage.cxl cxlVarL = decVar.a.l();
                            while (true) {
                                if (cxlVarL == null) {
                                    cxlVarL = null;
                                    break;
                                }
                                defpackage.ddz ddzVarR2 = cxlVarL.r();
                                if (ddzVarR2 != null && ddzVarR2.a && ddzVarR2.f(dejVar2)) {
                                    break;
                                }
                                cxlVarL = cxlVarL.l();
                            }
                            if (cxlVarL == null || ((ddzVarR = cxlVarL.r()) != null && defpackage.afga.f(ddzVarR.g(dejVar9), java.lang.Boolean.TRUE))) {
                                ednVarB.F(accessibilityNodeInfo.getMovementGranularities() | 20);
                            }
                        }
                    } else {
                        dejVar2 = dejVar;
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add("androidx.compose.ui.semantics.id");
                java.lang.CharSequence charSequenceE2 = ednVarB.e();
                if (charSequenceE2 != null && charSequenceE2.length() != 0 && ddzVar.f(defpackage.ddy.a)) {
                    arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                }
                if (android.os.Build.VERSION.SDK_INT >= 37 && (((charSequenceE = ednVarB.e()) != null && charSequenceE.length() != 0) || ddzVar.f(dejVar2) || ddzVar.f(defpackage.ddy.a) || ddzVar.f(defpackage.def.T))) {
                    arrayList3.add("android.view.accessibility.extra.DATA_RENDERING_INFO_KEY");
                }
                if (ddzVar.f(dejVar7)) {
                    arrayList3.add("androidx.compose.ui.semantics.testTag");
                }
                if (ddzVar.f(defpackage.def.U)) {
                    arrayList3.add("androidx.compose.ui.semantics.shapeType");
                    arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                    arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                    arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                }
                ep$.ExternalSyntheticApiModelOutline1.m(accessibilityNodeInfo, arrayList3);
                defpackage.ddv ddvVar = (defpackage.ddv) ddzVar.g(defpackage.def.c);
                if (ddvVar != null) {
                    defpackage.dej dejVar10 = defpackage.ddy.i;
                    if (ddzVar.f(dejVar10)) {
                        ednVarB.r("android.widget.SeekBar");
                    } else {
                        ednVarB.r("android.widget.ProgressBar");
                    }
                    if (ddvVar != defpackage.ddv.a) {
                        defpackage.afhw afhwVar = ddvVar.c;
                        accessibilityNodeInfo.setRangeInfo(android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(1, ((java.lang.Number) afhwVar.d()).floatValue(), ((java.lang.Number) afhwVar.c()).floatValue(), ddvVar.b));
                    }
                    if (ddzVar.f(dejVar10) && defpackage.daw.e(decVar)) {
                        float f = ddvVar.b;
                        defpackage.afhw afhwVar2 = ddvVar.c;
                        float fFloatValue = ((java.lang.Number) afhwVar2.c()).floatValue();
                        float fFloatValue2 = ((java.lang.Number) afhwVar2.d()).floatValue();
                        if (fFloatValue < fFloatValue2) {
                            fFloatValue = fFloatValue2;
                        }
                        if (f < fFloatValue) {
                            ednVarB.h(defpackage.edm.f);
                        }
                        float fFloatValue3 = ((java.lang.Number) afhwVar2.d()).floatValue();
                        float fFloatValue4 = ((java.lang.Number) afhwVar2.c()).floatValue();
                        if (fFloatValue3 > fFloatValue4) {
                            fFloatValue3 = fFloatValue4;
                        }
                        if (f > fFloatValue3) {
                            ednVarB.h(defpackage.edm.g);
                        }
                    }
                }
                if (defpackage.daw.e(decVar) && (ddnVar = (defpackage.ddn) ddzVar.g(defpackage.ddy.i)) != null) {
                    ednVarB.h(new defpackage.edm(null, android.R.id.accessibilityActionSetProgress, ddnVar.a, null, null));
                }
                defpackage.ddz ddzVarG = decVar.g();
                defpackage.dej dejVar11 = defpackage.def.f;
                defpackage.ddp ddpVar2 = (defpackage.ddp) ddzVarG.g(dejVar11);
                if (ddpVar2 != null) {
                    ednVarB.t(defpackage.erh.K(ddpVar2.a, ddpVar2.b, 0));
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    if (decVar.g().g(defpackage.def.e) != null) {
                        java.util.List listK2 = decVar.k((4 & 1) != 0 ? !decVar.e : false, true & ((4 & 2) == 0));
                        int size9 = listK2.size();
                        for (int i38 = 0; i38 < size9; i38++) {
                            defpackage.dec decVar5 = (defpackage.dec) listK2.get(i38);
                            if (decVar5.g().f(dejVar6)) {
                                arrayList4.add(decVar5);
                            }
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        boolean zB2 = defpackage.dbd.b(arrayList4);
                        ednVarB.t(defpackage.erh.K(zB2 ? 1 : arrayList4.size(), zB2 ? arrayList4.size() : 1, 0));
                    }
                }
                if (((defpackage.daz) decVar.g().g(defpackage.def.g)) != null) {
                    throw null;
                }
                defpackage.dec decVarI3 = decVar.i();
                if (decVarI3 != null && decVarI3.g().g(defpackage.def.e) != null && (((ddpVar = (defpackage.ddp) decVarI3.g().g(dejVar11)) == null || (ddpVar.a >= 0 && ddpVar.b >= 0)) && decVar.g().f(dejVar6))) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.util.List listK3 = decVarI3.k((4 & 1) != 0 ? !decVarI3.e : false, true & ((4 & 2) == 0));
                    int size10 = listK3.size();
                    int i39 = 0;
                    for (int i40 = 0; i40 < size10; i40++) {
                        defpackage.dec decVar6 = (defpackage.dec) listK3.get(i40);
                        if (decVar6.g().f(dejVar6)) {
                            arrayList5.add(decVar6);
                            if (decVar6.a.f() < decVar.a.f()) {
                                i39++;
                            }
                        }
                    }
                    if (!arrayList5.isEmpty()) {
                        boolean zB3 = defpackage.dbd.b(arrayList5);
                        int i41 = true != zB3 ? i39 : 0;
                        if (true != zB3) {
                            i39 = 0;
                        }
                        ednVarB.u(defpackage.erh.J(i41, 1, i39, 1, ((java.lang.Boolean) decVar.g().d(dejVar6, new defpackage.bmd(11))).booleanValue()));
                    }
                }
                defpackage.ddx ddxVar = (defpackage.ddx) ddzVar.g(defpackage.def.w);
                defpackage.ddn ddnVar10 = (defpackage.ddn) ddzVar.g(defpackage.ddy.d);
                if (ddxVar != null && ddnVar10 != null) {
                    if (!defpackage.dbd.c(decVar)) {
                        ednVarB.r("android.widget.HorizontalScrollView");
                    }
                    if (((java.lang.Number) ddxVar.b.invoke()).floatValue() > 0.0f) {
                        ednVarB.M(true);
                    }
                    if (defpackage.daw.e(decVar)) {
                        if (defpackage.dah.G(ddxVar)) {
                            ednVarB.h(defpackage.edm.f);
                            ednVarB.h(!defpackage.daw.g(decVar) ? defpackage.edm.n : defpackage.edm.l);
                        }
                        if (defpackage.dah.F(ddxVar)) {
                            ednVarB.h(defpackage.edm.g);
                            ednVarB.h(!defpackage.daw.g(decVar) ? defpackage.edm.l : defpackage.edm.n);
                        }
                    }
                }
                defpackage.ddx ddxVar2 = (defpackage.ddx) ddzVar.g(defpackage.def.x);
                if (ddxVar2 != null && ddnVar10 != null) {
                    if (!defpackage.dbd.c(decVar)) {
                        ednVarB.r("android.widget.ScrollView");
                    }
                    if (((java.lang.Number) ddxVar2.b.invoke()).floatValue() > 0.0f) {
                        ednVarB.M(true);
                    }
                    if (defpackage.daw.e(decVar)) {
                        if (defpackage.dah.G(ddxVar2)) {
                            ednVarB.h(defpackage.edm.f);
                            ednVarB.h(defpackage.edm.m);
                        }
                        if (defpackage.dah.F(ddxVar2)) {
                            ednVarB.h(defpackage.edm.g);
                            ednVarB.h(defpackage.edm.k);
                        }
                    }
                }
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    defpackage.daw.j(ednVarB, decVar);
                }
                ednVarB.H((java.lang.CharSequence) ddzVar.g(defpackage.def.d));
                if (defpackage.daw.e(decVar)) {
                    defpackage.ddn ddnVar11 = (defpackage.ddn) ddzVar.g(defpackage.ddy.t);
                    if (ddnVar11 != null) {
                        ednVarB.h(new defpackage.edm(null, 262144, ddnVar11.a, null, null));
                    }
                    defpackage.ddn ddnVar12 = (defpackage.ddn) ddzVar.g(defpackage.ddy.u);
                    if (ddnVar12 != null) {
                        ednVarB.h(new defpackage.edm(null, 524288, ddnVar12.a, null, null));
                    }
                    defpackage.ddn ddnVar13 = (defpackage.ddn) ddzVar.g(defpackage.ddy.v);
                    if (ddnVar13 != null) {
                        ednVarB.h(new defpackage.edm(null, 1048576, ddnVar13.a, null, null));
                    }
                    defpackage.dej dejVar12 = defpackage.ddy.x;
                    if (ddzVar.f(dejVar12)) {
                        java.util.List list6 = (java.util.List) ddzVar.c(dejVar12);
                        int size11 = list6.size();
                        defpackage.zm zmVar = defpackage.dah.a;
                        int i42 = zmVar.b;
                        if (size11 >= i42) {
                            throw new java.lang.IllegalStateException(defpackage.a.bm(i42, "Can't have more than ", " custom actions for one widget"));
                        }
                        defpackage.abb abbVar = new defpackage.abb(null);
                        defpackage.aal aalVar = defpackage.aam.a;
                        defpackage.aal aalVar2 = new defpackage.aal(6);
                        defpackage.abb abbVar2 = dahVar2.j;
                        if (abbVar2.g(i3)) {
                            defpackage.aal aalVar3 = (defpackage.aal) defpackage.abc.a(abbVar2, i3);
                            defpackage.zm zmVar2 = new defpackage.zm(16);
                            int[] iArr = zmVar.a;
                            int i43 = zmVar.b;
                            for (int i44 = 0; i44 < i43; i44++) {
                                zmVar2.e(iArr[i44]);
                            }
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            if (list6.size() > 0) {
                                aalVar3.getClass();
                                throw null;
                            }
                            if (arrayList6.size() > 0) {
                                zmVar2.a(0);
                                throw null;
                            }
                        } else if (list6.size() > 0) {
                            zmVar.a(0);
                            throw null;
                        }
                        dahVar2.i.f(i3, abbVar);
                        abbVar2.f(i3, aalVar2);
                    }
                }
                ednVarB.L(defpackage.daw.h(decVar, resources, z));
                int iD2 = dahVar2.w.d(i3);
                if (iD2 != -1) {
                    defpackage.dau dauVarO = czzVar2.O();
                    android.view.View viewB = dauVarO != null ? defpackage.dbc.b(dauVarO, iD2) : null;
                    if (viewB != null) {
                        ednVarB.S(viewB);
                        czzVar = czzVar2;
                    } else {
                        czzVar = czzVar2;
                        ednVarB.T(czzVar, iD2);
                    }
                    dahVar2.t(i3, ednVarB, dahVar2.o, null);
                } else {
                    czzVar = czzVar2;
                }
                int iD3 = dahVar2.x.d(i3);
                if (iD3 != -1) {
                    defpackage.dau dauVarO2 = czzVar.O();
                    android.view.View viewB2 = dauVarO2 != null ? defpackage.dbc.b(dauVarO2, iD3) : null;
                    if (viewB2 != null) {
                        ednVarB.R(viewB2);
                        dahVar2.t(i3, ednVarB, dahVar2.p, null);
                    }
                }
                java.lang.String str3 = (java.lang.String) ddzVar.g(defpackage.deg.b);
                if (str3 != null) {
                    ednVarB.r(str3);
                }
                ednVar = ednVarB;
            } else {
                dahVar2 = dahVar3;
                i3 = i;
                ednVar = null;
            }
        }
        if (dahVar2.h) {
            if (i3 == dahVar2.d) {
                dahVar2.f = ednVar;
            }
            if (i3 == dahVar2.e) {
                dahVar2.g = ednVar;
            }
        }
        return ednVar;
    }

    @Override // defpackage.edq
    public final edn b(int i) {
        if (i != 1) {
            if (i == 2) {
                return a(this.a.d);
            }
            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Unknown focus type: "));
        }
        int i2 = this.a.e;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.edq
    public final void c(int i, edn ednVar, java.lang.String str, android.os.Bundle bundle) {
        this.a.t(i, ednVar, str, bundle);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX WARN: Code duplicated, block: B:108:0x0208  */
    /* JADX WARN: Code duplicated, block: B:358:0x0694  */
    /* JADX WARN: Code duplicated, block: B:365:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:367:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:369:0x06be  */
    /* JADX WARN: Code duplicated, block: B:371:0x06c2  */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0164, code lost:
    
        r1 = null;
     */
    @Override // defpackage.edq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(int r22, int r23, android.os.Bundle r24) throws afbj {
        /*
            Method dump skipped, instruction units count: 2090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dad.d(int, int, android.os.Bundle):boolean");
    }
}
