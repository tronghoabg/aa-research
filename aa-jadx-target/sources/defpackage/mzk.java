package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mzk {
    public static final defpackage.yqm a = defpackage.yqm.c("Gh.ComposeMediaSwitcher");

    public static final float a(float f, boolean z) {
        return (defpackage.dlr.a(f, 220.0f) < 0 || !z) ? 24.0f : 36.0f;
    }

    public static final android.content.ComponentName b(defpackage.bys bysVar) {
        return (android.content.ComponentName) bysVar.a();
    }

    public static final lph c(defpackage.bys bysVar) {
        return (lph) bysVar.a();
    }

    public static final lph d(defpackage.bys bysVar) {
        return (lph) bysVar.a();
    }

    public static final java.lang.Object e(nbt nbtVar) {
        if (!defpackage.acmw.j()) {
            android.content.ComponentName componentName = nbtVar.b;
            java.lang.String className = componentName.getClassName();
            className.getClass();
            if (className.length() <= 0) {
                lph lphVar = nbtVar.a;
                return lphVar == null ? componentName : lphVar;
            }
        }
        return nbtVar.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    public static final java.lang.Object f(defpackage.bby bbyVar, java.util.List list, defpackage.afer aferVar, defpackage.affc affcVar, lph lphVar, android.content.ComponentName componentName, java.util.Map map, aiuw aiuwVar, defpackage.afdk afdkVar) {
        mzi mziVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object next;
        java.lang.Object obj3;
        if (afdkVar instanceof mzi) {
            mziVar = (mzi) afdkVar;
            int i = mziVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mziVar.e = i - Integer.MIN_VALUE;
            } else {
                mziVar = new mzi(afdkVar);
            }
        } else {
            mziVar = new mzi(afdkVar);
        }
        mzi mziVar2 = mziVar;
        java.lang.Object obj4 = mziVar2.d;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = mziVar2.e;
        if (i2 == 0) {
            defpackage.afga.cz(obj4);
            ?? Invoke = aferVar.invoke();
            defpackage.yqm yqmVar = a;
            yqmVar.l().y("Filtered Live Items: %s", list);
            if (Invoke == 0 || Invoke.isEmpty()) {
                yqmVar.l().y("Latching initial media items: %s", list);
                java.util.List listI = i(list, lphVar, componentName);
                affcVar.invoke(listI);
                return listI;
            }
            java.util.Set setBf = defpackage.afga.bf(list);
            java.util.Set setBf2 = defpackage.afga.bf(Invoke);
            java.util.Set setKeySet = map.keySet();
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj5 : setKeySet) {
                if (setBf.contains((nbt) obj5)) {
                    arrayList.add(obj5);
                }
            }
            for (java.lang.Object obj6 : arrayList) {
                aiwg aiwgVar = (aiwg) map.remove(obj6);
                if (aiwgVar != null) {
                    aiwgVar.s((java.util.concurrent.CancellationException) null);
                }
                yqmVar.l().y("Cancelled removal for reappeared item: %s", obj6);
            }
            java.util.Set<nbt> setK = defpackage.afga.K(setBf2, setBf);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj7 : list) {
                if (!setBf2.contains((nbt) obj7)) {
                    arrayList2.add(obj7);
                }
            }
            java.util.List listBb = defpackage.afga.bb(arrayList2);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (nbt nbtVar : setK) {
                java.util.Iterator it = listBb.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!defpackage.afga.f(e(nbtVar), e((nbt) next)));
                nbt nbtVar2 = (nbt) next;
                if (nbtVar2 != null) {
                    linkedHashMap.put(nbtVar, nbtVar2);
                    listBb.remove(nbtVar2);
                    aiwg aiwgVar2 = (aiwg) map.remove(nbtVar);
                    if (aiwgVar2 != null) {
                        aiwgVar2.s((java.util.concurrent.CancellationException) null);
                    }
                    yqmVar.l().M("Found replacement for %s: %s", nbtVar, nbtVar2);
                } else if (!map.containsKey(nbtVar)) {
                    yqmVar.l().L("Scheduling removal for %s in %dms", nbtVar, 3000L);
                    map.put(nbtVar, ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new mzj(aferVar, affcVar, bbyVar, map, nbtVar, (defpackage.afdk) null, 0), 3));
                }
            }
            if (listBb.isEmpty() && linkedHashMap.isEmpty()) {
                return Invoke;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.afga.aj(Invoke, 10));
            for (nbt nbtVar3 : Invoke) {
                nbt nbtVar4 = (nbt) linkedHashMap.get(nbtVar3);
                if (nbtVar4 != null) {
                    nbtVar3 = nbtVar4;
                }
                arrayList3.add(nbtVar3);
            }
            java.util.List listAS = defpackage.afga.aS(arrayList3, listBb);
            int size = listAS.size();
            java.util.List list2 = listAS;
            if (size > 5) {
                java.util.List listAX = defpackage.afga.aX(defpackage.afga.aZ(defpackage.afga.bd(map.keySet(), defpackage.afga.bf(listAS))), listAS.size() - 5);
                java.util.Iterator it2 = listAX.iterator();
                while (it2.hasNext()) {
                    aiwg aiwgVar3 = (aiwg) map.remove((nbt) it2.next());
                    if (aiwgVar3 != null) {
                        aiwgVar3.s((java.util.concurrent.CancellationException) null);
                    }
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj8 : listAS) {
                    if (!listAX.contains((nbt) obj8)) {
                        arrayList4.add(obj8);
                    }
                }
                list2 = arrayList4;
            }
            affcVar.invoke(list2);
            mziVar2.a = listBb;
            mziVar2.b = linkedHashMap;
            mziVar2.c = list2;
            mziVar2.e = 1;
            if (g(bbyVar, Invoke, list2, mziVar2) == afdrVar) {
                return afdrVar;
            }
            obj = listBb;
            obj2 = linkedHashMap;
            obj3 = list2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj9 = mziVar2.c;
            obj2 = mziVar2.b;
            obj = mziVar2.a;
            defpackage.afga.cz(obj4);
            obj3 = obj9;
        }
        defpackage.yqm yqmVar2 = a;
        yqmVar2.l().y("Added new items: %s", obj);
        yqmVar2.l().y("Replaced items: %s", obj2);
        yqmVar2.l().y("Stable items: %s", obj3);
        return obj3;
    }

    public static final java.lang.Object g(defpackage.bby bbyVar, java.util.List list, java.util.List list2, defpackage.afdk afdkVar) {
        int size = list.size() + 1;
        int size2 = list2.size() + 1;
        nbt nbtVar = (nbt) defpackage.afga.aC(list, defpackage.mkc.z(bbyVar.j(), size));
        int iE = defpackage.afqt.e(list2.indexOf(nbtVar), 0);
        int iY = defpackage.mkc.y(bbyVar, size2) + iE;
        if (bbyVar.j() == iY) {
            return defpackage.afbk.a;
        }
        a.l().K("Items changed, scrolling to keep %s in view at %s", nbtVar, iE);
        return bbyVar.z(iY, afdkVar);
    }

    public static final java.util.List h(defpackage.bwx bwxVar) {
        return (java.util.List) bwxVar.a();
    }

    public static final java.util.List i(java.util.List list, lph lphVar, android.content.ComponentName componentName) {
        nbt nbtVar;
        java.lang.Object next;
        java.lang.Object obj = null;
        if (lphVar != null) {
            java.util.Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!defpackage.afga.f(((nbt) next).a, lphVar));
            nbtVar = (nbt) next;
        } else {
            nbtVar = null;
        }
        if (componentName != null) {
            for (java.lang.Object obj2 : list) {
                if (defpackage.afga.f(((nbt) obj2).b, componentName)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (nbt) obj;
        }
        if (nbtVar == null || !list.contains(nbtVar)) {
            return obj != null ? defpackage.afga.aS(defpackage.afga.aa(obj), defpackage.afga.aP(list, obj)) : list;
        }
        return defpackage.afga.aS(defpackage.afga.aa(nbtVar), defpackage.afga.aP(list, nbtVar));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0125  */
    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0175  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    public static final void j(final defpackage.nan nanVar, final defpackage.bby bbyVar, final int i, defpackage.cgf cgfVar, final defpackage.affc affcVar, java.util.List list, int i2, final boolean z, final boolean z2, defpackage.bve bveVar, int i3, int i4) {
        int i5;
        final defpackage.cgf cgfVar2;
        int i6;
        boolean z3;
        defpackage.bve bveVar2;
        final java.util.List list2;
        int i7;
        defpackage.bxl bxlVarJ;
        int i8;
        int iB;
        int i9;
        float f;
        float f2;
        boolean zA;
        defpackage.bwc bwcVar;
        java.lang.Object objS;
        int i10;
        int i11;
        int i12 = i3 & 6;
        defpackage.bve bveVarC = bveVar.c(-1206314754);
        if (i12 == 0) {
            i5 = (true != ((i3 & 8) == 0 ? bveVarC.C(nanVar) : bveVarC.E(nanVar)) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != bveVarC.C(bbyVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != bveVarC.A(i) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            cgfVar2 = cgfVar;
            i5 |= true != bveVarC.C(cgfVar2) ? 1024 : 2048;
        } else {
            cgfVar2 = cgfVar;
        }
        if ((i3 & 24576) == 0) {
            i5 |= true != bveVarC.E(affcVar) ? 8192 : 16384;
        }
        int i13 = i4 & 32;
        int i14 = 196608;
        if (i13 != 0) {
            i5 |= i14;
        } else if ((196608 & i3) == 0) {
            i14 = true != ((262144 & i3) == 0 ? bveVarC.C(list) : bveVarC.E(list)) ? 65536 : 131072;
            i5 |= i14;
        }
        int i15 = i4 & 64;
        if (i15 == 0) {
            if ((1572864 & i3) == 0) {
                i6 = i2;
                i5 |= true != bveVarC.A(i6) ? 524288 : 1048576;
            }
            if ((12582912 & i3) != 0) {
                if (true != bveVarC.D(z)) {
                    i11 = 4194304;
                } else {
                    i11 = 8388608;
                }
                i5 |= i11;
            }
            if ((100663296 & i3) == 0) {
                if (true != bveVarC.D(z2)) {
                    i10 = 33554432;
                } else {
                    i10 = 67108864;
                }
                i5 |= i10;
            }
            if ((38347923 & i5) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i5 & 1)) {
                if (i13 != 0) {
                    list2 = defpackage.afce.a;
                } else {
                    list2 = list;
                }
                if (i15 != 0) {
                    i8 = -1;
                } else {
                    i8 = i6;
                }
                if (i8 != -1) {
                    iB = i8;
                    i9 = iB;
                } else {
                    iB = bbyVar.b();
                    i9 = -1;
                }
                final boolean z4 = i9 == -1 && iB > 1;
                if (defpackage.lee.a.a().b()) {
                    f = defpackage.gjr.P1.k;
                } else {
                    f = 0.0f;
                }
                final float f3 = defpackage.gjr.P2.k + f + 0.0f;
                float fL = (defpackage.mcl.l() * iB) + 0.0f + (defpackage.mcl.m() * defpackage.afqt.e(iB - 1, 0)) + 0.0f + 0.0f;
                float fN = defpackage.mcl.n();
                f2 = fL + fN + fN + 0.0f + 0.0f + f3 + 0.0f;
                zA = bveVarC.A(iB);
                bwcVar = (defpackage.bwc) bveVarC;
                int i16 = i8;
                objS = bwcVar.S();
                if (zA || objS == defpackage.bvd.a) {
                    objS = new defpackage.dlr(java.lang.Math.max(52.0f, f2));
                    bwcVar.ad(objS);
                }
                final float f4 = ((defpackage.dlr) objS).a;
                final int i17 = iB;
                final float f5 = f;
                bveVar2 = bveVarC;
                defpackage.ca.at(null, null, defpackage.dai.as(1292105428, true, new defpackage.affh() { // from class: mzd
                    @Override // defpackage.affh
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.bys bysVarM;
                        defpackage.bys bysVarM2;
                        defpackage.nbs nbsVar;
                        long j;
                        float f6;
                        defpackage.cgc cgcVar;
                        defpackage.cgf cgfVarL;
                        defpackage.ars arsVarAb;
                        defpackage.att attVar = (defpackage.att) obj;
                        defpackage.bve bveVar3 = (defpackage.bve) obj2;
                        int iIntValue = ((java.lang.Integer) obj3).intValue();
                        defpackage.yqm yqmVar = defpackage.mzk.a;
                        attVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= true != bveVar3.C(attVar) ? 2 : 4;
                        }
                        if (bveVar3.I((iIntValue & 19) != 18, iIntValue & 1)) {
                            float f7 = f5;
                            final long jAK = defpackage.tna.aK((attVar.d() - f7) + 0.0f, (attVar.c() - f7) + 0.0f);
                            java.lang.Object objG = bveVar3.g();
                            java.lang.Object obj4 = defpackage.bvd.a;
                            if (objG == obj4) {
                                objG = defpackage.cis.a;
                                bveVar3.x(objG);
                            }
                            final defpackage.cit citVar = new defpackage.cit();
                            defpackage.cit citVar2 = new defpackage.cit();
                            java.lang.Object objG2 = bveVar3.g();
                            if (objG2 == obj4) {
                                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                                bveVar3.x(parcelableSnapshotMutableState);
                                objG2 = parcelableSnapshotMutableState;
                            }
                            defpackage.bwx bwxVar = (defpackage.bwx) objG2;
                            defpackage.kwv kwvVar = (defpackage.kwv) bveVar3.f(defpackage.dbl.h);
                            java.lang.Object objG3 = bveVar3.g();
                            int i18 = 9;
                            if (objG3 == obj4) {
                                defpackage.mtd mtdVar = new defpackage.mtd(kwvVar, bwxVar, i18);
                                defpackage.lam lamVar = defpackage.byp.a;
                                defpackage.bvr bvrVar = new defpackage.bvr(mtdVar, null);
                                bveVar3.x(bvrVar);
                                objG3 = bvrVar;
                            }
                            final defpackage.bby bbyVar2 = bbyVar;
                            final defpackage.bys bysVar = (defpackage.bys) objG3;
                            java.lang.Object objG4 = bveVar3.g();
                            if (objG4 == obj4) {
                                defpackage.muk mukVar = new defpackage.muk(bbyVar2, 11);
                                defpackage.lam lamVar2 = defpackage.byp.a;
                                defpackage.bvr bvrVar2 = new defpackage.bvr(mukVar, null);
                                bveVar3.x(bvrVar2);
                                objG4 = bvrVar2;
                            }
                            final int i19 = i17;
                            final int i20 = i;
                            defpackage.bys bysVar2 = (defpackage.bys) objG4;
                            boolean zA2 = bveVar3.A(i20) | bveVar3.A(i19);
                            java.lang.Object objG5 = bveVar3.g();
                            if (zA2 || objG5 == obj4) {
                                ajlx ajlxVar = new ajlx(bbyVar2, i19, i20, 1);
                                defpackage.lam lamVar3 = defpackage.byp.a;
                                objG5 = new defpackage.bvr(ajlxVar, null);
                                bveVar3.x(objG5);
                            }
                            defpackage.bys bysVar3 = (defpackage.bys) objG5;
                            java.lang.Object objG6 = bveVar3.g();
                            if (objG6 == obj4) {
                                objG6 = new defpackage.mtb(bwxVar, i18);
                                bveVar3.x(objG6);
                            }
                            defpackage.cgf cgfVarS = defpackage.bzd.s(cgfVar2, (defpackage.affc) objG6);
                            int i21 = defpackage.kms.a;
                            defpackage.cgf cgfVarBe = defpackage.ca.be(defpackage.kms.a(cgfVarS, new defpackage.kbl(10)));
                            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
                            int iF = defpackage.a.f(bveVar3.b());
                            defpackage.cdd cddVarN = bveVar3.N();
                            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar3, cgfVarBe);
                            defpackage.afer aferVar = defpackage.cwl.a;
                            bveVar3.M();
                            bveVar3.w();
                            if (bveVar3.G()) {
                                bveVar3.j(aferVar);
                            } else {
                                bveVar3.y();
                            }
                            defpackage.nan nanVar2 = nanVar;
                            defpackage.byw.c(bveVar3, ctyVarB, defpackage.cwl.e);
                            defpackage.byw.c(bveVar3, cddVarN, defpackage.cwl.d);
                            defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                            defpackage.byw.b(bveVar3, defpackage.cwl.g);
                            defpackage.byw.c(bveVar3, cgfVarN, defpackage.cwl.c);
                            defpackage.ats atsVar = defpackage.ats.a;
                            defpackage.eqp eqpVarJ = nanVar2 != null ? nanVar2.j() : null;
                            if (eqpVarJ == null) {
                                bveVar3.v(2094155603);
                                bveVar3.o();
                                bysVarM = null;
                            } else {
                                bveVar3.v(-486635922);
                                bysVarM = defpackage.bxi.m(eqpVarJ, null, bveVar3);
                                bveVar3.o();
                            }
                            if (bysVarM == null) {
                                bveVar3.v(2094179815);
                                java.lang.Object objG7 = bveVar3.g();
                                if (objG7 == obj4) {
                                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
                                    bveVar3.x(parcelableSnapshotMutableState2);
                                    objG7 = parcelableSnapshotMutableState2;
                                }
                                bysVarM = (defpackage.bwx) objG7;
                            } else {
                                bveVar3.v(-486636753);
                            }
                            bveVar3.o();
                            boolean zK = defpackage.mzk.k((android.content.ComponentName) bysVarM.a());
                            java.lang.Boolean bool = java.lang.Boolean.FALSE;
                            defpackage.dlr dlrVar = new defpackage.dlr(defpackage.dlt.a(jAK));
                            boolean zB = bveVar3.B(jAK) | bveVar3.D(zK);
                            java.lang.Object objG8 = bveVar3.g();
                            if (zB || objG8 == obj4) {
                                objG8 = new defpackage.mzg(jAK, zK, null);
                                bveVar3.x(objG8);
                            }
                            final defpackage.bys bysVarAx = defpackage.dai.ax(bool, dlrVar, (defpackage.affg) objG8, bveVar3);
                            boolean zD = bveVar3.D(((java.lang.Boolean) bysVar2.a()).booleanValue()) | bveVar3.D(((java.lang.Boolean) bysVar3.a()).booleanValue());
                            java.lang.Object objG9 = bveVar3.g();
                            if (zD || objG9 == obj4) {
                                defpackage.fpk fpkVar = new defpackage.fpk(bysVar, bysVarAx, bysVar2, bysVar3, 4);
                                defpackage.lam lamVar4 = defpackage.byp.a;
                                objG9 = new defpackage.bvr(fpkVar, null);
                                bveVar3.x(objG9);
                            }
                            defpackage.bys bysVar4 = (defpackage.bys) objG9;
                            java.lang.Object objG10 = bveVar3.g();
                            if (objG10 == obj4) {
                                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.nbs.a, defpackage.bxv.c);
                                bveVar3.x(parcelableSnapshotMutableState3);
                                objG10 = parcelableSnapshotMutableState3;
                            }
                            final defpackage.bwx bwxVar2 = (defpackage.bwx) objG10;
                            defpackage.eqp eqpVar = nanVar2 != null ? nanVar2.n : null;
                            if (eqpVar == null) {
                                bveVar3.v(2094818631);
                                bveVar3.o();
                                bysVarM2 = null;
                            } else {
                                bveVar3.v(-486614534);
                                bysVarM2 = defpackage.bxi.m(eqpVar, new defpackage.afau(null, null), bveVar3);
                                bveVar3.o();
                            }
                            if (bysVarM2 == null) {
                                bveVar3.v(2094864667);
                                java.lang.Object objG11 = bveVar3.g();
                                if (objG11 == obj4) {
                                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.afau(null, null), defpackage.bxv.c);
                                    bveVar3.x(parcelableSnapshotMutableState4);
                                    objG11 = parcelableSnapshotMutableState4;
                                }
                                bysVarM2 = (defpackage.bwx) objG11;
                            } else {
                                bveVar3.v(-486615715);
                            }
                            bveVar3.o();
                            defpackage.acbb acbbVar = (defpackage.acbb) ((defpackage.afau) bysVarM2.a()).b;
                            if (zK || ((java.lang.Boolean) bysVar3.a()).booleanValue() || ((java.lang.Boolean) bysVar2.a()).booleanValue()) {
                                bveVar3.v(2095127826);
                                bveVar3.o();
                                nbsVar = defpackage.nbs.a;
                            } else if (defpackage.actz.I()) {
                                bveVar3.v(2095248726);
                                if (defpackage.afga.f(bwxVar2.a(), defpackage.nbs.a)) {
                                    bveVar3.v(2095328148);
                                    nbsVar = new defpackage.nbs(defpackage.ksx.f(bveVar3).s(), acbbVar != null ? defpackage.cjv.j(defpackage.mkc.x(acbbVar)) : defpackage.cjv.c(), 4);
                                    bveVar3.o();
                                } else {
                                    bveVar3.v(2095508847);
                                    bveVar3.o();
                                    nbsVar = (defpackage.nbs) bwxVar2.a();
                                }
                                bveVar3.o();
                            } else {
                                bveVar3.v(2095581139);
                                bveVar3.o();
                                nbsVar = (defpackage.nbs) bwxVar2.a();
                            }
                            defpackage.nbs nbsVar2 = nbsVar;
                            bveVar3.v(-486586740);
                            long jS = nbsVar2.b;
                            if (jS == 16) {
                                jS = defpackage.kfp.i(bveVar3).s();
                            }
                            long jA = nbsVar2.c;
                            bveVar3.o();
                            defpackage.bys bysVarA = defpackage.adj.a(jS, null, bveVar3, 0, 14);
                            bveVar3.v(-486581300);
                            if (jA == 16) {
                                jA = ((defpackage.kvj) bveVar3.f(defpackage.kvi.b)).a(bveVar3);
                            }
                            long j2 = jA;
                            long j3 = nbsVar2.d;
                            bveVar3.o();
                            defpackage.bys bysVarA2 = defpackage.adj.a(j2, null, bveVar3, 0, 14);
                            bveVar3.v(-486575135);
                            if (j3 == 16) {
                                if (!((java.lang.Boolean) bysVar2.a()).booleanValue() || ((java.lang.Boolean) bysVar.a()).booleanValue()) {
                                    bveVar3.v(-1741466344);
                                    bveVar3.o();
                                    j = defpackage.cjv.j(0);
                                } else {
                                    bveVar3.v(-1741577293);
                                    j = defpackage.ckd.h(defpackage.kfp.i(bveVar3).O(), 0.8f);
                                    bveVar3.o();
                                }
                                j3 = j;
                            }
                            long j4 = j3;
                            bveVar3.o();
                            java.lang.Object objG12 = bveVar3.g();
                            if (objG12 == obj4) {
                                objG12 = defpackage.bvx.a(defpackage.afdp.a, bveVar3);
                                bveVar3.x(objG12);
                            }
                            float f8 = f3;
                            final aiuw aiuwVar = (aiuw) objG12;
                            float fA = defpackage.mzk.a(defpackage.dlt.a(jAK), zK);
                            boolean zBooleanValue = ((java.lang.Boolean) bysVar4.a()).booleanValue();
                            long j5 = ((defpackage.ckd) bysVarA.a()).a;
                            boolean zC = defpackage.lmp.a.a().c();
                            defpackage.cgc cgcVar2 = defpackage.cgf.e;
                            defpackage.cgf cgfVarY = defpackage.dai.y(defpackage.asq.H(cgcVar2, f8), "pagerIndicator");
                            boolean zC2 = bveVar3.C(citVar2);
                            java.lang.Object objG13 = bveVar3.g();
                            if (zC2 || objG13 == obj4) {
                                objG13 = new defpackage.mtb(citVar2, 10);
                                bveVar3.x(objG13);
                            }
                            final boolean z5 = z4;
                            defpackage.cgf cgfVarR = defpackage.bzd.r(cgfVarY, (defpackage.affc) objG13);
                            float f9 = defpackage.mwo.a;
                            defpackage.cgf cgfVarA = defpackage.kvi.a(cgfVarR, defpackage.mwo.d, ((defpackage.ckd) bysVarA2.a()).a, 0L, null, null, null, true, false, bveVar3, 12582912, 188);
                            boolean zE = bveVar3.E(aiuwVar) | bveVar3.C(bbyVar2) | bveVar3.D(z5) | bveVar3.A(i19);
                            java.lang.Object objG14 = bveVar3.g();
                            if (zE || objG14 == obj4) {
                                objG14 = new defpackage.afer() { // from class: myy
                                    @Override // defpackage.afer
                                    public final java.lang.Object invoke() {
                                        defpackage.yqm yqmVar2 = defpackage.mzk.a;
                                        ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new oax(bbyVar2, z5, i19, (defpackage.afdk) null, 1), 3);
                                        return defpackage.afbk.a;
                                    }
                                };
                                bveVar3.x(objG14);
                            }
                            boolean z6 = z;
                            defpackage.cgf cgfVarX = defpackage.afw.x(cgfVarA, true, null, null, (defpackage.afer) objG14);
                            if (z6) {
                                f6 = fA;
                                cgcVar = cgcVar2;
                                cgfVarL = defpackage.awj.l(defpackage.awj.m(cgcVar, java.lang.Math.max(f6, 32.0f)), Float.NaN, 52.0f, Float.NaN, Float.NaN);
                            } else {
                                f6 = fA;
                                cgcVar = cgcVar2;
                                cgfVarL = defpackage.awj.l(defpackage.awj.d(cgcVar, java.lang.Math.max(f6, 32.0f)), 52.0f, Float.NaN, Float.NaN, Float.NaN);
                            }
                            final float f10 = f6;
                            defpackage.mkc.A(atsVar, zBooleanValue, bbyVar2, cgfVarX.a(cgfVarL), z6, j5, j4, zC, i19, z5, citVar, null, bveVar3, 6, 0, 1024);
                            defpackage.cgf cgfVarBe2 = defpackage.ca.be(defpackage.bzd.q(cgcVar, citVar2));
                            float f11 = defpackage.gjr.P1.k;
                            if (defpackage.acmw.e()) {
                                bveVar3.v(2098110243);
                                arsVarAb = defpackage.afw.ab(bbyVar2, 0.3f, bveVar3, 221184, 14);
                                bveVar3.o();
                            } else {
                                bveVar3.v(2098215395);
                                arsVarAb = defpackage.afw.ab(bbyVar2, 0.0f, bveVar3, 196608, 30);
                                bveVar3.o();
                            }
                            final defpackage.affc affcVar2 = affcVar;
                            final boolean z7 = z2;
                            final java.util.List list3 = list2;
                            final float f12 = f4;
                            defpackage.mkc.G(z6, bbyVar2, cgfVarBe2, f11, arsVarAb, defpackage.dai.as(1782785092, true, new defpackage.affi() { // from class: myz
                                @Override // defpackage.affi
                                public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
                                    int iIntValue2 = ((java.lang.Integer) obj6).intValue();
                                    defpackage.bve bveVar4 = (defpackage.bve) obj7;
                                    int iIntValue3 = ((java.lang.Integer) obj8).intValue();
                                    defpackage.yqm yqmVar2 = defpackage.mzk.a;
                                    ((defpackage.bbp) obj5).getClass();
                                    if ((iIntValue3 & 48) == 0) {
                                        iIntValue3 |= true != bveVar4.A(iIntValue2) ? 16 : 32;
                                    }
                                    if (bveVar4.I((iIntValue3 & 145) != 144, iIntValue3 & 1)) {
                                        final defpackage.bby bbyVar3 = bbyVar2;
                                        final int i22 = i19;
                                        final int iZ = defpackage.mkc.z(iIntValue2, i22);
                                        bveVar4.v(-435463338);
                                        defpackage.cgf cgfVarC = defpackage.awj.c(defpackage.cgf.e, 1.0f);
                                        boolean zC3 = ((iIntValue3 & 112) == 32) | bveVar4.C(bbyVar3);
                                        java.lang.Object objG15 = bveVar4.g();
                                        if (zC3 || objG15 == defpackage.bvd.a) {
                                            objG15 = new defpackage.aif(iIntValue2, bbyVar3, 18);
                                            bveVar4.x(objG15);
                                        }
                                        final int i23 = i20;
                                        defpackage.cgf cgfVarY2 = defpackage.dai.y(defpackage.bzd.r(cgfVarC, (defpackage.affc) objG15), iZ != i23 ? "mediaPlayerCard" : "mediaSuggestionsCard");
                                        if (defpackage.lee.a.a().b()) {
                                            cgfVarY2 = defpackage.kfp.k(defpackage.asq.H(cgfVarY2, defpackage.gjr.P1.k), null, bveVar4, 1);
                                        }
                                        defpackage.cgf cgfVar3 = cgfVarY2;
                                        final defpackage.bys bysVar5 = bysVarAx;
                                        final defpackage.bys bysVar6 = bysVar;
                                        final defpackage.bwx bwxVar3 = bwxVar2;
                                        final boolean z8 = z5;
                                        final defpackage.affc affcVar3 = affcVar2;
                                        final boolean z9 = z7;
                                        final float f13 = f10;
                                        final defpackage.cit citVar3 = citVar;
                                        final long j6 = jAK;
                                        final java.util.List list4 = list3;
                                        final float f14 = f12;
                                        bveVar4.o();
                                        defpackage.jya.e(cgfVar3, null, defpackage.jya.f(defpackage.cjv.j(0), bveVar4, 14), null, defpackage.dai.as(1435813650, true, new defpackage.affh() { // from class: mzc
                                            @Override // defpackage.affh
                                            public final java.lang.Object invoke(java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11) {
                                                defpackage.nan nanVar3;
                                                defpackage.bve bveVar5 = (defpackage.bve) obj10;
                                                int iIntValue4 = ((java.lang.Integer) obj11).intValue();
                                                defpackage.yqm yqmVar3 = defpackage.mzk.a;
                                                ((defpackage.atx) obj9).getClass();
                                                boolean z10 = false;
                                                if (bveVar5.I((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                                    float f15 = f14;
                                                    int i24 = i23;
                                                    int i25 = iZ;
                                                    if (i25 == i24) {
                                                        bveVar5.v(745199484);
                                                        defpackage.mkc.p(f15, bveVar5, 0);
                                                        bveVar5.o();
                                                    } else {
                                                        boolean z11 = z9;
                                                        float f16 = f13;
                                                        defpackage.cit citVar4 = citVar3;
                                                        long j7 = j6;
                                                        java.util.List list5 = list4;
                                                        if (list5.isEmpty() && defpackage.lmp.a.a().c()) {
                                                            bveVar5.v(745372247);
                                                            defpackage.myx.s(j7, citVar4, f16, f15, null, null, false, null, false, false, z11, false, bveVar5, 0, 0, 3056);
                                                            bveVar5.o();
                                                        } else {
                                                            defpackage.bys bysVar7 = bysVar6;
                                                            bveVar5.v(745746231);
                                                            if (((java.lang.Boolean) bysVar7.a()).booleanValue() && ((java.lang.Boolean) bysVar5.a()).booleanValue()) {
                                                                z10 = true;
                                                            }
                                                            if (defpackage.lmp.a.a().c()) {
                                                                bveVar5.v(746849800);
                                                                java.lang.String string = defpackage.acmw.j() ? ((nbt) list5.get(i25)).b.toString() : java.lang.String.valueOf(((nbt) list5.get(i25)).hashCode());
                                                                defpackage.erw erwVar = (defpackage.erw) affcVar3.invoke(list5.get(i25));
                                                                defpackage.bvm bvmVar = defpackage.esn.a;
                                                                defpackage.esa esaVarA = defpackage.esn.a(bveVar5);
                                                                if (esaVarA == null) {
                                                                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                                                }
                                                                nanVar3 = (defpackage.nan) defpackage.ebl.l(defpackage.afgw.b(defpackage.nan.class), esaVarA, string, erwVar, defpackage.edd.f(esaVarA));
                                                                bveVar5.o();
                                                            } else {
                                                                bveVar5.v(747233983);
                                                                defpackage.bvm bvmVar2 = defpackage.esn.a;
                                                                defpackage.esa esaVarA2 = defpackage.esn.a(bveVar5);
                                                                if (esaVarA2 == null) {
                                                                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                                                }
                                                                nanVar3 = (defpackage.nan) defpackage.ebl.l(defpackage.afgw.b(defpackage.nan.class), esaVarA2, null, null, defpackage.edd.f(esaVarA2));
                                                                bveVar5.o();
                                                            }
                                                            boolean z12 = z8;
                                                            int i26 = i22;
                                                            defpackage.bby bbyVar4 = bbyVar3;
                                                            boolean zC4 = bveVar5.C(bbyVar4) | bveVar5.A(i26) | bveVar5.A(i25) | bveVar5.A(i24) | bveVar5.D(z12);
                                                            java.lang.Object objG16 = bveVar5.g();
                                                            if (zC4 || objG16 == defpackage.bvd.a) {
                                                                mzf mzfVar = new mzf(bbyVar4, i26, i25, i24, z12, (defpackage.afdk) null);
                                                                bveVar5.x(mzfVar);
                                                                objG16 = mzfVar;
                                                            }
                                                            defpackage.myx.o(z10, (defpackage.affc) objG16, j7, citVar4, f16, bwxVar3, f15, null, false, z11, nanVar3, bveVar5, 196608, 8, 384);
                                                            bveVar5.o();
                                                        }
                                                    }
                                                } else {
                                                    bveVar5.s();
                                                }
                                                return defpackage.afbk.a;
                                            }
                                        }, bveVar4), bveVar4, 196608, 26);
                                    } else {
                                        bveVar4.s();
                                    }
                                    return defpackage.afbk.a;
                                }
                            }, bveVar3), bveVar3, 1572864, 32);
                            bveVar3.n();
                        } else {
                            bveVar3.s();
                        }
                        return defpackage.afbk.a;
                    }
                }, bveVarC), bveVar2, 3072, 7);
                i7 = i16;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                list2 = list;
                i7 = i6;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mze(nanVar, bbyVar, i, cgfVar, affcVar, list2, i7, z, z2, i3, i4);
            }
        }
        i5 |= 1572864;
        i6 = i2;
        if ((12582912 & i3) != 0) {
            if (true != bveVarC.D(z)) {
                i11 = 4194304;
            } else {
                i11 = 8388608;
            }
            i5 |= i11;
        }
        if ((100663296 & i3) == 0) {
            if (true != bveVarC.D(z2)) {
                i10 = 33554432;
            } else {
                i10 = 67108864;
            }
            i5 |= i10;
        }
        if ((38347923 & i5) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bveVarC.I(z3, i5 & 1)) {
            if (i13 != 0) {
                list2 = defpackage.afce.a;
            } else {
                list2 = list;
            }
            if (i15 != 0) {
                i8 = -1;
            } else {
                i8 = i6;
            }
            if (i8 != -1) {
                iB = i8;
                i9 = iB;
            } else {
                iB = bbyVar.b();
                i9 = -1;
            }
            if (i9 == -1) {
            }
            if (defpackage.lee.a.a().b()) {
                f = defpackage.gjr.P1.k;
            } else {
                f = 0.0f;
            }
            final float f6 = defpackage.gjr.P2.k + f + 0.0f;
            float fL2 = (defpackage.mcl.l() * iB) + 0.0f + (defpackage.mcl.m() * defpackage.afqt.e(iB - 1, 0)) + 0.0f + 0.0f;
            float fN2 = defpackage.mcl.n();
            f2 = fL2 + fN2 + fN2 + 0.0f + 0.0f + f6 + 0.0f;
            zA = bveVarC.A(iB);
            bwcVar = (defpackage.bwc) bveVarC;
            int i18 = i8;
            objS = bwcVar.S();
            if (zA) {
                objS = new defpackage.dlr(java.lang.Math.max(52.0f, f2));
                bwcVar.ad(objS);
            } else {
                objS = new defpackage.dlr(java.lang.Math.max(52.0f, f2));
                bwcVar.ad(objS);
            }
            final float f7 = ((defpackage.dlr) objS).a;
            final int i19 = iB;
            final float f8 = f;
            bveVar2 = bveVarC;
            defpackage.ca.at(null, null, defpackage.dai.as(1292105428, true, new defpackage.affh() { // from class: mzd
                @Override // defpackage.affh
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.bys bysVarM;
                    defpackage.bys bysVarM2;
                    defpackage.nbs nbsVar;
                    long j;
                    float f9;
                    defpackage.cgc cgcVar;
                    defpackage.cgf cgfVarL;
                    defpackage.ars arsVarAb;
                    defpackage.att attVar = (defpackage.att) obj;
                    defpackage.bve bveVar3 = (defpackage.bve) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    defpackage.yqm yqmVar = defpackage.mzk.a;
                    attVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != bveVar3.C(attVar) ? 2 : 4;
                    }
                    if (bveVar3.I((iIntValue & 19) != 18, iIntValue & 1)) {
                        float f10 = f8;
                        final long jAK = defpackage.tna.aK((attVar.d() - f10) + 0.0f, (attVar.c() - f10) + 0.0f);
                        java.lang.Object objG = bveVar3.g();
                        java.lang.Object obj4 = defpackage.bvd.a;
                        if (objG == obj4) {
                            objG = defpackage.cis.a;
                            bveVar3.x(objG);
                        }
                        final defpackage.cit citVar = new defpackage.cit();
                        defpackage.cit citVar2 = new defpackage.cit();
                        java.lang.Object objG2 = bveVar3.g();
                        if (objG2 == obj4) {
                            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                            bveVar3.x(parcelableSnapshotMutableState);
                            objG2 = parcelableSnapshotMutableState;
                        }
                        defpackage.bwx bwxVar = (defpackage.bwx) objG2;
                        defpackage.kwv kwvVar = (defpackage.kwv) bveVar3.f(defpackage.dbl.h);
                        java.lang.Object objG3 = bveVar3.g();
                        int i110 = 9;
                        if (objG3 == obj4) {
                            defpackage.mtd mtdVar = new defpackage.mtd(kwvVar, bwxVar, i110);
                            defpackage.lam lamVar = defpackage.byp.a;
                            defpackage.bvr bvrVar = new defpackage.bvr(mtdVar, null);
                            bveVar3.x(bvrVar);
                            objG3 = bvrVar;
                        }
                        final defpackage.bby bbyVar2 = bbyVar;
                        final defpackage.bys bysVar = (defpackage.bys) objG3;
                        java.lang.Object objG4 = bveVar3.g();
                        if (objG4 == obj4) {
                            defpackage.muk mukVar = new defpackage.muk(bbyVar2, 11);
                            defpackage.lam lamVar2 = defpackage.byp.a;
                            defpackage.bvr bvrVar2 = new defpackage.bvr(mukVar, null);
                            bveVar3.x(bvrVar2);
                            objG4 = bvrVar2;
                        }
                        final int i111 = i19;
                        final int i20 = i;
                        defpackage.bys bysVar2 = (defpackage.bys) objG4;
                        boolean zA2 = bveVar3.A(i20) | bveVar3.A(i111);
                        java.lang.Object objG5 = bveVar3.g();
                        if (zA2 || objG5 == obj4) {
                            ajlx ajlxVar = new ajlx(bbyVar2, i111, i20, 1);
                            defpackage.lam lamVar3 = defpackage.byp.a;
                            objG5 = new defpackage.bvr(ajlxVar, null);
                            bveVar3.x(objG5);
                        }
                        defpackage.bys bysVar3 = (defpackage.bys) objG5;
                        java.lang.Object objG6 = bveVar3.g();
                        if (objG6 == obj4) {
                            objG6 = new defpackage.mtb(bwxVar, i110);
                            bveVar3.x(objG6);
                        }
                        defpackage.cgf cgfVarS = defpackage.bzd.s(cgfVar2, (defpackage.affc) objG6);
                        int i21 = defpackage.kms.a;
                        defpackage.cgf cgfVarBe = defpackage.ca.be(defpackage.kms.a(cgfVarS, new defpackage.kbl(10)));
                        defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
                        int iF = defpackage.a.f(bveVar3.b());
                        defpackage.cdd cddVarN = bveVar3.N();
                        defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar3, cgfVarBe);
                        defpackage.afer aferVar = defpackage.cwl.a;
                        bveVar3.M();
                        bveVar3.w();
                        if (bveVar3.G()) {
                            bveVar3.j(aferVar);
                        } else {
                            bveVar3.y();
                        }
                        defpackage.nan nanVar2 = nanVar;
                        defpackage.byw.c(bveVar3, ctyVarB, defpackage.cwl.e);
                        defpackage.byw.c(bveVar3, cddVarN, defpackage.cwl.d);
                        defpackage.byw.c(bveVar3, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                        defpackage.byw.b(bveVar3, defpackage.cwl.g);
                        defpackage.byw.c(bveVar3, cgfVarN, defpackage.cwl.c);
                        defpackage.ats atsVar = defpackage.ats.a;
                        defpackage.eqp eqpVarJ = nanVar2 != null ? nanVar2.j() : null;
                        if (eqpVarJ == null) {
                            bveVar3.v(2094155603);
                            bveVar3.o();
                            bysVarM = null;
                        } else {
                            bveVar3.v(-486635922);
                            bysVarM = defpackage.bxi.m(eqpVarJ, null, bveVar3);
                            bveVar3.o();
                        }
                        if (bysVarM == null) {
                            bveVar3.v(2094179815);
                            java.lang.Object objG7 = bveVar3.g();
                            if (objG7 == obj4) {
                                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
                                bveVar3.x(parcelableSnapshotMutableState2);
                                objG7 = parcelableSnapshotMutableState2;
                            }
                            bysVarM = (defpackage.bwx) objG7;
                        } else {
                            bveVar3.v(-486636753);
                        }
                        bveVar3.o();
                        boolean zK = defpackage.mzk.k((android.content.ComponentName) bysVarM.a());
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        defpackage.dlr dlrVar = new defpackage.dlr(defpackage.dlt.a(jAK));
                        boolean zB = bveVar3.B(jAK) | bveVar3.D(zK);
                        java.lang.Object objG8 = bveVar3.g();
                        if (zB || objG8 == obj4) {
                            objG8 = new defpackage.mzg(jAK, zK, null);
                            bveVar3.x(objG8);
                        }
                        final defpackage.bys bysVarAx = defpackage.dai.ax(bool, dlrVar, (defpackage.affg) objG8, bveVar3);
                        boolean zD = bveVar3.D(((java.lang.Boolean) bysVar2.a()).booleanValue()) | bveVar3.D(((java.lang.Boolean) bysVar3.a()).booleanValue());
                        java.lang.Object objG9 = bveVar3.g();
                        if (zD || objG9 == obj4) {
                            defpackage.fpk fpkVar = new defpackage.fpk(bysVar, bysVarAx, bysVar2, bysVar3, 4);
                            defpackage.lam lamVar4 = defpackage.byp.a;
                            objG9 = new defpackage.bvr(fpkVar, null);
                            bveVar3.x(objG9);
                        }
                        defpackage.bys bysVar4 = (defpackage.bys) objG9;
                        java.lang.Object objG10 = bveVar3.g();
                        if (objG10 == obj4) {
                            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.nbs.a, defpackage.bxv.c);
                            bveVar3.x(parcelableSnapshotMutableState3);
                            objG10 = parcelableSnapshotMutableState3;
                        }
                        final defpackage.bwx bwxVar2 = (defpackage.bwx) objG10;
                        defpackage.eqp eqpVar = nanVar2 != null ? nanVar2.n : null;
                        if (eqpVar == null) {
                            bveVar3.v(2094818631);
                            bveVar3.o();
                            bysVarM2 = null;
                        } else {
                            bveVar3.v(-486614534);
                            bysVarM2 = defpackage.bxi.m(eqpVar, new defpackage.afau(null, null), bveVar3);
                            bveVar3.o();
                        }
                        if (bysVarM2 == null) {
                            bveVar3.v(2094864667);
                            java.lang.Object objG11 = bveVar3.g();
                            if (objG11 == obj4) {
                                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.afau(null, null), defpackage.bxv.c);
                                bveVar3.x(parcelableSnapshotMutableState4);
                                objG11 = parcelableSnapshotMutableState4;
                            }
                            bysVarM2 = (defpackage.bwx) objG11;
                        } else {
                            bveVar3.v(-486615715);
                        }
                        bveVar3.o();
                        defpackage.acbb acbbVar = (defpackage.acbb) ((defpackage.afau) bysVarM2.a()).b;
                        if (zK || ((java.lang.Boolean) bysVar3.a()).booleanValue() || ((java.lang.Boolean) bysVar2.a()).booleanValue()) {
                            bveVar3.v(2095127826);
                            bveVar3.o();
                            nbsVar = defpackage.nbs.a;
                        } else if (defpackage.actz.I()) {
                            bveVar3.v(2095248726);
                            if (defpackage.afga.f(bwxVar2.a(), defpackage.nbs.a)) {
                                bveVar3.v(2095328148);
                                nbsVar = new defpackage.nbs(defpackage.ksx.f(bveVar3).s(), acbbVar != null ? defpackage.cjv.j(defpackage.mkc.x(acbbVar)) : defpackage.cjv.c(), 4);
                                bveVar3.o();
                            } else {
                                bveVar3.v(2095508847);
                                bveVar3.o();
                                nbsVar = (defpackage.nbs) bwxVar2.a();
                            }
                            bveVar3.o();
                        } else {
                            bveVar3.v(2095581139);
                            bveVar3.o();
                            nbsVar = (defpackage.nbs) bwxVar2.a();
                        }
                        defpackage.nbs nbsVar2 = nbsVar;
                        bveVar3.v(-486586740);
                        long jS = nbsVar2.b;
                        if (jS == 16) {
                            jS = defpackage.kfp.i(bveVar3).s();
                        }
                        long jA = nbsVar2.c;
                        bveVar3.o();
                        defpackage.bys bysVarA = defpackage.adj.a(jS, null, bveVar3, 0, 14);
                        bveVar3.v(-486581300);
                        if (jA == 16) {
                            jA = ((defpackage.kvj) bveVar3.f(defpackage.kvi.b)).a(bveVar3);
                        }
                        long j2 = jA;
                        long j3 = nbsVar2.d;
                        bveVar3.o();
                        defpackage.bys bysVarA2 = defpackage.adj.a(j2, null, bveVar3, 0, 14);
                        bveVar3.v(-486575135);
                        if (j3 == 16) {
                            if (!((java.lang.Boolean) bysVar2.a()).booleanValue() || ((java.lang.Boolean) bysVar.a()).booleanValue()) {
                                bveVar3.v(-1741466344);
                                bveVar3.o();
                                j = defpackage.cjv.j(0);
                            } else {
                                bveVar3.v(-1741577293);
                                j = defpackage.ckd.h(defpackage.kfp.i(bveVar3).O(), 0.8f);
                                bveVar3.o();
                            }
                            j3 = j;
                        }
                        long j4 = j3;
                        bveVar3.o();
                        java.lang.Object objG12 = bveVar3.g();
                        if (objG12 == obj4) {
                            objG12 = defpackage.bvx.a(defpackage.afdp.a, bveVar3);
                            bveVar3.x(objG12);
                        }
                        float f11 = f6;
                        final aiuw aiuwVar = (aiuw) objG12;
                        float fA = defpackage.mzk.a(defpackage.dlt.a(jAK), zK);
                        boolean zBooleanValue = ((java.lang.Boolean) bysVar4.a()).booleanValue();
                        long j5 = ((defpackage.ckd) bysVarA.a()).a;
                        boolean zC = defpackage.lmp.a.a().c();
                        defpackage.cgc cgcVar2 = defpackage.cgf.e;
                        defpackage.cgf cgfVarY = defpackage.dai.y(defpackage.asq.H(cgcVar2, f11), "pagerIndicator");
                        boolean zC2 = bveVar3.C(citVar2);
                        java.lang.Object objG13 = bveVar3.g();
                        if (zC2 || objG13 == obj4) {
                            objG13 = new defpackage.mtb(citVar2, 10);
                            bveVar3.x(objG13);
                        }
                        final boolean z5 = z4;
                        defpackage.cgf cgfVarR = defpackage.bzd.r(cgfVarY, (defpackage.affc) objG13);
                        float f12 = defpackage.mwo.a;
                        defpackage.cgf cgfVarA = defpackage.kvi.a(cgfVarR, defpackage.mwo.d, ((defpackage.ckd) bysVarA2.a()).a, 0L, null, null, null, true, false, bveVar3, 12582912, 188);
                        boolean zE = bveVar3.E(aiuwVar) | bveVar3.C(bbyVar2) | bveVar3.D(z5) | bveVar3.A(i111);
                        java.lang.Object objG14 = bveVar3.g();
                        if (zE || objG14 == obj4) {
                            objG14 = new defpackage.afer() { // from class: myy
                                @Override // defpackage.afer
                                public final java.lang.Object invoke() {
                                    defpackage.yqm yqmVar2 = defpackage.mzk.a;
                                    ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new oax(bbyVar2, z5, i111, (defpackage.afdk) null, 1), 3);
                                    return defpackage.afbk.a;
                                }
                            };
                            bveVar3.x(objG14);
                        }
                        boolean z6 = z;
                        defpackage.cgf cgfVarX = defpackage.afw.x(cgfVarA, true, null, null, (defpackage.afer) objG14);
                        if (z6) {
                            f9 = fA;
                            cgcVar = cgcVar2;
                            cgfVarL = defpackage.awj.l(defpackage.awj.m(cgcVar, java.lang.Math.max(f9, 32.0f)), Float.NaN, 52.0f, Float.NaN, Float.NaN);
                        } else {
                            f9 = fA;
                            cgcVar = cgcVar2;
                            cgfVarL = defpackage.awj.l(defpackage.awj.d(cgcVar, java.lang.Math.max(f9, 32.0f)), 52.0f, Float.NaN, Float.NaN, Float.NaN);
                        }
                        final float f13 = f9;
                        defpackage.mkc.A(atsVar, zBooleanValue, bbyVar2, cgfVarX.a(cgfVarL), z6, j5, j4, zC, i111, z5, citVar, null, bveVar3, 6, 0, 1024);
                        defpackage.cgf cgfVarBe2 = defpackage.ca.be(defpackage.bzd.q(cgcVar, citVar2));
                        float f14 = defpackage.gjr.P1.k;
                        if (defpackage.acmw.e()) {
                            bveVar3.v(2098110243);
                            arsVarAb = defpackage.afw.ab(bbyVar2, 0.3f, bveVar3, 221184, 14);
                            bveVar3.o();
                        } else {
                            bveVar3.v(2098215395);
                            arsVarAb = defpackage.afw.ab(bbyVar2, 0.0f, bveVar3, 196608, 30);
                            bveVar3.o();
                        }
                        final defpackage.affc affcVar2 = affcVar;
                        final boolean z7 = z2;
                        final java.util.List list3 = list2;
                        final float f15 = f7;
                        defpackage.mkc.G(z6, bbyVar2, cgfVarBe2, f14, arsVarAb, defpackage.dai.as(1782785092, true, new defpackage.affi() { // from class: myz
                            @Override // defpackage.affi
                            public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
                                int iIntValue2 = ((java.lang.Integer) obj6).intValue();
                                defpackage.bve bveVar4 = (defpackage.bve) obj7;
                                int iIntValue3 = ((java.lang.Integer) obj8).intValue();
                                defpackage.yqm yqmVar2 = defpackage.mzk.a;
                                ((defpackage.bbp) obj5).getClass();
                                if ((iIntValue3 & 48) == 0) {
                                    iIntValue3 |= true != bveVar4.A(iIntValue2) ? 16 : 32;
                                }
                                if (bveVar4.I((iIntValue3 & 145) != 144, iIntValue3 & 1)) {
                                    final defpackage.bby bbyVar3 = bbyVar2;
                                    final int i22 = i111;
                                    final int iZ = defpackage.mkc.z(iIntValue2, i22);
                                    bveVar4.v(-435463338);
                                    defpackage.cgf cgfVarC = defpackage.awj.c(defpackage.cgf.e, 1.0f);
                                    boolean zC3 = ((iIntValue3 & 112) == 32) | bveVar4.C(bbyVar3);
                                    java.lang.Object objG15 = bveVar4.g();
                                    if (zC3 || objG15 == defpackage.bvd.a) {
                                        objG15 = new defpackage.aif(iIntValue2, bbyVar3, 18);
                                        bveVar4.x(objG15);
                                    }
                                    final int i23 = i20;
                                    defpackage.cgf cgfVarY2 = defpackage.dai.y(defpackage.bzd.r(cgfVarC, (defpackage.affc) objG15), iZ != i23 ? "mediaPlayerCard" : "mediaSuggestionsCard");
                                    if (defpackage.lee.a.a().b()) {
                                        cgfVarY2 = defpackage.kfp.k(defpackage.asq.H(cgfVarY2, defpackage.gjr.P1.k), null, bveVar4, 1);
                                    }
                                    defpackage.cgf cgfVar3 = cgfVarY2;
                                    final defpackage.bys bysVar5 = bysVarAx;
                                    final defpackage.bys bysVar6 = bysVar;
                                    final defpackage.bwx bwxVar3 = bwxVar2;
                                    final boolean z8 = z5;
                                    final defpackage.affc affcVar3 = affcVar2;
                                    final boolean z9 = z7;
                                    final float f16 = f13;
                                    final defpackage.cit citVar3 = citVar;
                                    final long j6 = jAK;
                                    final java.util.List list4 = list3;
                                    final float f17 = f15;
                                    bveVar4.o();
                                    defpackage.jya.e(cgfVar3, null, defpackage.jya.f(defpackage.cjv.j(0), bveVar4, 14), null, defpackage.dai.as(1435813650, true, new defpackage.affh() { // from class: mzc
                                        @Override // defpackage.affh
                                        public final java.lang.Object invoke(java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11) {
                                            defpackage.nan nanVar3;
                                            defpackage.bve bveVar5 = (defpackage.bve) obj10;
                                            int iIntValue4 = ((java.lang.Integer) obj11).intValue();
                                            defpackage.yqm yqmVar3 = defpackage.mzk.a;
                                            ((defpackage.atx) obj9).getClass();
                                            boolean z10 = false;
                                            if (bveVar5.I((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                                                float f18 = f17;
                                                int i24 = i23;
                                                int i25 = iZ;
                                                if (i25 == i24) {
                                                    bveVar5.v(745199484);
                                                    defpackage.mkc.p(f18, bveVar5, 0);
                                                    bveVar5.o();
                                                } else {
                                                    boolean z11 = z9;
                                                    float f19 = f16;
                                                    defpackage.cit citVar4 = citVar3;
                                                    long j7 = j6;
                                                    java.util.List list5 = list4;
                                                    if (list5.isEmpty() && defpackage.lmp.a.a().c()) {
                                                        bveVar5.v(745372247);
                                                        defpackage.myx.s(j7, citVar4, f19, f18, null, null, false, null, false, false, z11, false, bveVar5, 0, 0, 3056);
                                                        bveVar5.o();
                                                    } else {
                                                        defpackage.bys bysVar7 = bysVar6;
                                                        bveVar5.v(745746231);
                                                        if (((java.lang.Boolean) bysVar7.a()).booleanValue() && ((java.lang.Boolean) bysVar5.a()).booleanValue()) {
                                                            z10 = true;
                                                        }
                                                        if (defpackage.lmp.a.a().c()) {
                                                            bveVar5.v(746849800);
                                                            java.lang.String string = defpackage.acmw.j() ? ((nbt) list5.get(i25)).b.toString() : java.lang.String.valueOf(((nbt) list5.get(i25)).hashCode());
                                                            defpackage.erw erwVar = (defpackage.erw) affcVar3.invoke(list5.get(i25));
                                                            defpackage.bvm bvmVar = defpackage.esn.a;
                                                            defpackage.esa esaVarA = defpackage.esn.a(bveVar5);
                                                            if (esaVarA == null) {
                                                                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                                            }
                                                            nanVar3 = (defpackage.nan) defpackage.ebl.l(defpackage.afgw.b(defpackage.nan.class), esaVarA, string, erwVar, defpackage.edd.f(esaVarA));
                                                            bveVar5.o();
                                                        } else {
                                                            bveVar5.v(747233983);
                                                            defpackage.bvm bvmVar2 = defpackage.esn.a;
                                                            defpackage.esa esaVarA2 = defpackage.esn.a(bveVar5);
                                                            if (esaVarA2 == null) {
                                                                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                                            }
                                                            nanVar3 = (defpackage.nan) defpackage.ebl.l(defpackage.afgw.b(defpackage.nan.class), esaVarA2, null, null, defpackage.edd.f(esaVarA2));
                                                            bveVar5.o();
                                                        }
                                                        boolean z12 = z8;
                                                        int i26 = i22;
                                                        defpackage.bby bbyVar4 = bbyVar3;
                                                        boolean zC4 = bveVar5.C(bbyVar4) | bveVar5.A(i26) | bveVar5.A(i25) | bveVar5.A(i24) | bveVar5.D(z12);
                                                        java.lang.Object objG16 = bveVar5.g();
                                                        if (zC4 || objG16 == defpackage.bvd.a) {
                                                            mzf mzfVar = new mzf(bbyVar4, i26, i25, i24, z12, (defpackage.afdk) null);
                                                            bveVar5.x(mzfVar);
                                                            objG16 = mzfVar;
                                                        }
                                                        defpackage.myx.o(z10, (defpackage.affc) objG16, j7, citVar4, f19, bwxVar3, f18, null, false, z11, nanVar3, bveVar5, 196608, 8, 384);
                                                        bveVar5.o();
                                                    }
                                                }
                                            } else {
                                                bveVar5.s();
                                            }
                                            return defpackage.afbk.a;
                                        }
                                    }, bveVar4), bveVar4, 196608, 26);
                                } else {
                                    bveVar4.s();
                                }
                                return defpackage.afbk.a;
                            }
                        }, bveVar3), bveVar3, 1572864, 32);
                        bveVar3.n();
                    } else {
                        bveVar3.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVarC), bveVar2, 3072, 7);
            i7 = i18;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            list2 = list;
            i7 = i6;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mze(nanVar, bbyVar, i, cgfVar, affcVar, list2, i7, z, z2, i3, i4);
        }
    }

    public static final boolean k(android.content.ComponentName componentName) {
        return defpackage.lmp.a.a().d() && defpackage.afga.f(componentName, defpackage.mkt.G);
    }

    public static final boolean l(float f, boolean z) {
        if (z) {
            return defpackage.dlr.a(f, 250.0f) < 0;
        }
        return defpackage.dlr.a(f, 220.0f) < 0;
    }

    public static final void m(defpackage.cgf cgfVar, boolean z, boolean z2, defpackage.affh affhVar, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3;
        defpackage.afce afceVar;
        java.util.List listAq;
        boolean z3;
        boolean z4;
        defpackage.bys bysVar;
        defpackage.affc affcVar2;
        defpackage.nan nanVar;
        defpackage.nan nanVar2;
        affhVar.getClass();
        affcVar.getClass();
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1716983662);
        if (i4 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.E(affhVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 8192 : 16384;
        }
        if (bveVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            defpackage.afdo afdoVar = defpackage.tcu.a;
            defpackage.eqp eqpVarB = defpackage.lpx.i().b();
            eqpVarB.getClass();
            defpackage.eqp eqpVarV = defpackage.tcu.v(eqpVarB, new defpackage.mtz(13));
            defpackage.afce afceVar2 = defpackage.afce.a;
            defpackage.bys bysVarM = defpackage.bxi.m(eqpVarV, afceVar2, bveVarC);
            defpackage.bys bysVarM2 = defpackage.bxi.m(defpackage.lom.a.a().a(), afceVar2, bveVarC);
            defpackage.eqp eqpVarA = defpackage.lhe.b().a(defpackage.mqg.MEDIA);
            eqpVarA.getClass();
            defpackage.bys bysVarL = defpackage.bxi.l(eqpVarA, bveVarC);
            final defpackage.bys bysVarL2 = defpackage.bxi.l(defpackage.lsd.a.a().c, bveVarC);
            final defpackage.bys bysVarL3 = defpackage.bxi.l(defpackage.lpx.i().e(), bveVarC);
            if (defpackage.acmw.g()) {
                bveVarC.v(-1893710804);
                ((defpackage.bwc) bveVarC).Y(false);
                listAq = defpackage.tna.aq(bysVarM2);
                i3 = i2;
                afceVar = afceVar2;
            } else {
                bveVarC.v(-1893656275);
                java.util.List listAq2 = defpackage.tna.aq(bysVarM);
                listAq2.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = listAq2.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    lph lphVar = (lph) next;
                    java.lang.String strValueOf = java.lang.String.valueOf(lphVar.hashCode());
                    int i5 = i2;
                    java.util.Iterator it2 = it;
                    defpackage.erw erwVar = (defpackage.erw) affcVar.invoke(new nbt(lphVar, lphVar.a));
                    defpackage.bvm bvmVar = defpackage.esn.a;
                    defpackage.esa esaVarA = defpackage.esn.a(bveVarC);
                    if (esaVarA == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    defpackage.afce afceVar3 = afceVar2;
                    defpackage.nan nanVar3 = (defpackage.nan) defpackage.ebl.l(defpackage.afgw.b(defpackage.nan.class), esaVarA, strValueOf, erwVar, defpackage.edd.f(esaVarA));
                    com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) defpackage.bxi.l(nanVar3.l(), bveVarC).a();
                    defpackage.lmk lmkVar = (defpackage.lmk) defpackage.bxi.l(nanVar3.k(), bveVarC).a();
                    lphVar.getClass();
                    if (defpackage.lol.c(lphVar, aaPlaybackState, lmkVar)) {
                        arrayList.add(next);
                    }
                    it = it2;
                    afceVar2 = afceVar3;
                    i2 = i5;
                }
                i3 = i2;
                afceVar = afceVar2;
                ((defpackage.bwc) bveVarC).Y(false);
                listAq = arrayList;
            }
            boolean zC = bveVarC.C(b(bysVarL)) | bveVarC.C(listAq) | bveVarC.C(c(bysVarL2));
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                defpackage.mtd mtdVar = new defpackage.mtd(listAq, bysVarL, 7);
                defpackage.lam lamVar = defpackage.byp.a;
                objS = new defpackage.bvr(mtdVar, null);
                bwcVar.ad(objS);
            }
            final defpackage.bys bysVar2 = (defpackage.bys) objS;
            java.lang.Object objS2 = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS2 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS2 = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS2;
            java.util.List listH = h(bwxVar);
            final java.util.List list = listH == null ? afceVar : listH;
            java.lang.Object objS3 = bwcVar.S();
            if (objS3 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState2);
                objS3 = parcelableSnapshotMutableState2;
            }
            defpackage.bwx bwxVar2 = (defpackage.bwx) objS3;
            boolean zE = bveVarC.E(list) | bveVarC.C(bysVar2) | bveVarC.C(bysVarL2) | bveVarC.C(bysVarL3);
            java.lang.Object objS4 = bwcVar.S();
            if (zE || objS4 == obj) {
                objS4 = new defpackage.mnj() { // from class: mza
                    @Override // defpackage.mnj
                    public final void h(java.io.PrintWriter printWriter) {
                        defpackage.yqm yqmVar = defpackage.mzk.a;
                        printWriter.println("MultiplePlayerSwitcher");
                        java.util.List list2 = list;
                        java.util.Objects.toString(list2);
                        printWriter.println("  stableItems: ".concat(list2.toString()));
                        java.util.List listAq3 = defpackage.tna.aq(bysVar2);
                        java.util.Objects.toString(listAq3);
                        printWriter.println("  liveItems: ".concat(java.lang.String.valueOf(listAq3)));
                        lph lphVarC = defpackage.mzk.c(bysVarL2);
                        java.util.Objects.toString(lphVarC);
                        printWriter.println("  ongoingSession: ".concat(java.lang.String.valueOf(lphVarC)));
                        lph lphVarD = defpackage.mzk.d(bysVarL3);
                        java.util.Objects.toString(lphVarD);
                        printWriter.println("  nowPlayingSession: ".concat(java.lang.String.valueOf(lphVarD)));
                    }
                };
                bwcVar.ad(objS4);
            }
            defpackage.kmj.a(list, (defpackage.mnj) objS4, bveVarC, 0, 0);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(list.size());
            boolean zE2 = bveVarC.E(list);
            java.lang.Object objS5 = bwcVar.S();
            if (zE2 || objS5 == obj) {
                objS5 = new defpackage.jwp(list, bwxVar2, (defpackage.afdk) null, 11);
                bwcVar.ad(objS5);
            }
            defpackage.bvx.g(numValueOf, (defpackage.affg) objS5, bveVarC);
            int size = list.size() + 1 + ((list.isEmpty() && ((java.lang.Boolean) bwxVar2.a()).booleanValue()) ? 1 : 0);
            if (!defpackage.lmp.a.a().c() || list.isEmpty()) {
                z3 = true;
                z4 = false;
            } else {
                z4 = true;
                z3 = true;
            }
            java.lang.Object objInvoke = affhVar.invoke(java.lang.Integer.valueOf(z3 != z4 ? size : Integer.MAX_VALUE), bveVarC, java.lang.Integer.valueOf((i3 >> 6) & 112));
            java.lang.Object objS6 = bwcVar.S();
            if (objS6 == obj) {
                objS6 = new java.util.LinkedHashMap();
                bwcVar.ad(objS6);
            }
            java.util.Map map = (java.util.Map) objS6;
            java.lang.Object objS7 = bwcVar.S();
            if (objS7 == obj) {
                objS7 = defpackage.bvx.a(defpackage.afdp.a, bveVarC);
                bwcVar.ad(objS7);
            }
            aiuw aiuwVar = (aiuw) objS7;
            java.lang.Object objS8 = bwcVar.S();
            if (objS8 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState3);
                objS8 = parcelableSnapshotMutableState3;
            }
            defpackage.bwx bwxVar3 = (defpackage.bwx) objS8;
            java.lang.Object objS9 = bwcVar.S();
            if (objS9 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState4);
                objS9 = parcelableSnapshotMutableState4;
            }
            defpackage.bwx bwxVar4 = (defpackage.bwx) objS9;
            defpackage.epw epwVar = defpackage.epw.ON_PAUSE;
            boolean zE3 = bveVarC.E(map);
            java.lang.Object objS10 = bwcVar.S();
            int i6 = 8;
            if (zE3 || objS10 == obj) {
                objS10 = new defpackage.mtd(map, bwxVar3, i6);
                bwcVar.ad(objS10);
            }
            defpackage.epv.f(epwVar, null, (defpackage.afer) objS10, bveVarC, 6);
            defpackage.epw epwVar2 = defpackage.epw.ON_RESUME;
            boolean zC2 = bveVarC.C(bysVar2) | bveVarC.C(bysVarL2) | bveVarC.C(bysVarL);
            java.lang.Object objS11 = bwcVar.S();
            if (zC2 || objS11 == obj) {
                defpackage.nxt nxtVar = new defpackage.nxt(bwxVar3, bwxVar, bysVar2, bysVarL2, bysVarL, bwxVar4, 1);
                bysVar = bysVarL2;
                bwcVar.ad(nxtVar);
                objS11 = nxtVar;
            } else {
                bysVar = bysVarL2;
            }
            defpackage.epv.f(epwVar2, null, (defpackage.afer) objS11, bveVarC, 6);
            java.lang.Object objS12 = bwcVar.S();
            if (objS12 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState5 = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState5);
                objS12 = parcelableSnapshotMutableState5;
            }
            defpackage.bwx bwxVar5 = (defpackage.bwx) objS12;
            java.lang.Object[] objArr = {defpackage.tna.aq(bysVar2), d(bysVarL3), java.lang.Boolean.valueOf(((java.lang.Boolean) bwxVar4.a()).booleanValue()), java.lang.Boolean.valueOf(z4)};
            boolean zC3 = bveVarC.C(bysVar2) | bveVarC.C(bysVarL3) | bveVarC.D(z4) | bveVarC.E(list) | bveVarC.C(objInvoke) | bveVarC.A(size) | bveVarC.C(bysVar) | bveVarC.C(bysVarL) | bveVarC.E(map) | bveVarC.E(aiuwVar);
            java.lang.Object objS13 = bwcVar.S();
            if (zC3 || objS13 == obj) {
                objS13 = new defpackage.mzh(z4, list, (defpackage.bby) objInvoke, size, map, aiuwVar, bwxVar5, bysVar2, bysVarL3, bwxVar4, bwxVar, bysVar, bysVarL, null);
                bwcVar.ad(objS13);
            }
            int i7 = size - 1;
            defpackage.bvx.h(objArr, (defpackage.affg) objS13, bveVarC);
            defpackage.bby bbyVar = (defpackage.bby) objInvoke;
            int iZ = defpackage.mkc.z(bbyVar.j(), size);
            if (iZ == i7) {
                bveVarC.v(-1888498837);
                bwcVar.Y(false);
                affcVar2 = affcVar;
                nanVar2 = null;
            } else {
                if (list.isEmpty()) {
                    affcVar2 = affcVar;
                    bveVarC.v(-753644291);
                    defpackage.bvm bvmVar2 = defpackage.esn.a;
                    defpackage.esa esaVarA2 = defpackage.esn.a(bveVarC);
                    if (esaVarA2 == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    nanVar = (defpackage.nan) defpackage.ebl.l(defpackage.afgw.b(defpackage.nan.class), esaVarA2, null, null, defpackage.edd.f(esaVarA2));
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(-753654361);
                    java.lang.String string = defpackage.acmw.j() ? ((nbt) list.get(iZ)).b.toString() : java.lang.String.valueOf(((nbt) list.get(iZ)).hashCode());
                    affcVar2 = affcVar;
                    defpackage.erw erwVar2 = (defpackage.erw) affcVar2.invoke(list.get(iZ));
                    defpackage.bvm bvmVar3 = defpackage.esn.a;
                    defpackage.esa esaVarA3 = defpackage.esn.a(bveVarC);
                    if (esaVarA3 == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    nanVar = (defpackage.nan) defpackage.ebl.l(defpackage.afgw.b(defpackage.nan.class), esaVarA3, string, erwVar2, defpackage.edd.f(esaVarA3));
                    bwcVar.Y(false);
                }
                nanVar2 = nanVar;
            }
            int i8 = i3 << 18;
            j(nanVar2, bbyVar, i7, cgfVar, affcVar2, list, size, z, z2, bveVarC, ((i3 << 9) & 7168) | 8 | (i3 & 57344) | (29360128 & i8) | (234881024 & i8), 0);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.mzb(cgfVar, z, z2, affhVar, affcVar, i, 1);
        }
    }

    public static final void n(defpackage.cgf cgfVar, boolean z, boolean z2, defpackage.affh affhVar, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        defpackage.cgf cgfVar2;
        int i2;
        defpackage.bve bveVar2;
        affhVar.getClass();
        affcVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(479116362);
        if (i3 == 0) {
            cgfVar2 = cgfVar;
            i2 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.E(affhVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 8192 : 16384;
        }
        if (bveVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            java.lang.Object objInvoke = affhVar.invoke(2, bveVarC, java.lang.Integer.valueOf(((i2 >> 6) & 112) | 6));
            defpackage.bvm bvmVar = defpackage.esn.a;
            defpackage.esa esaVarA = defpackage.esn.a(bveVarC);
            if (esaVarA == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            defpackage.nan nanVar = (defpackage.nan) defpackage.ebl.l(defpackage.afgw.b(defpackage.nan.class), esaVarA, null, null, defpackage.edd.f(esaVarA));
            defpackage.bys bysVarM = defpackage.bxi.m(nanVar.l(), com.google.android.apps.auto.components.media.compat.AaPlaybackState.a, bveVarC);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                defpackage.muk mukVar = new defpackage.muk(bysVarM, 10);
                defpackage.lam lamVar = defpackage.byp.a;
                defpackage.bvr bvrVar = new defpackage.bvr(mukVar, null);
                bwcVar.ad(bvrVar);
                objS = bvrVar;
            }
            defpackage.bys bysVar = (defpackage.bys) objS;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((java.lang.Boolean) bysVar.a()).booleanValue());
            boolean zC = bveVarC.C(objInvoke);
            java.lang.Object objS2 = bwcVar.S();
            if (zC || objS2 == obj) {
                objS2 = new defpackage.jwp((defpackage.bby) objInvoke, bysVar, (defpackage.afdk) null, 12);
                bwcVar.ad(objS2);
            }
            defpackage.bvx.g(boolValueOf, (defpackage.affg) objS2, bveVarC);
            int i4 = i2 << 18;
            bveVar2 = bveVarC;
            j(nanVar, (defpackage.bby) objInvoke, 1, cgfVar2, affcVar, null, 0, z, z2, bveVar2, ((i2 << 9) & 7168) | 392 | (i2 & 57344) | (29360128 & i4) | (234881024 & i4), 96);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.mzb(cgfVar, z, z2, affhVar, affcVar, i, 2);
        }
    }

    public static final void o(defpackage.cgf cgfVar, boolean z, boolean z2, defpackage.affh affhVar, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.affh affhVar2;
        defpackage.affc affcVar2;
        defpackage.affh affhVar3;
        defpackage.affc affcVar3;
        defpackage.bve bveVarC = bveVar.c(130451657);
        if ((i & 6) == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        int i3 = i2 | 24576;
        if (bveVarC.I((i3 & 9363) != 9362, i3 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                defpackage.kvb kvbVar = new defpackage.kvb(19);
                java.lang.Object objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.mtz(12);
                    bwcVar.ad(objS);
                }
                affhVar3 = kvbVar;
                affcVar3 = (defpackage.affc) objS;
            } else {
                bveVarC.s();
                affhVar3 = affhVar;
                affcVar3 = affcVar;
            }
            bveVarC.l();
            if (defpackage.lmp.a.a().c()) {
                bveVarC.v(-659646015);
                m(cgfVar, z, z2, affhVar3, affcVar3, bveVarC, i3 & 58366);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-659489341);
                n(cgfVar, z, z2, affhVar3, affcVar3, bveVarC, i3 & 58366);
                bwcVar.Y(false);
            }
            affhVar2 = affhVar3;
            affcVar2 = affcVar3;
        } else {
            bveVarC.s();
            affhVar2 = affhVar;
            affcVar2 = affcVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.mzb(cgfVar, z, z2, affhVar2, affcVar2, i, 0);
        }
    }
}
