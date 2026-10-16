package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wde {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public wde() {
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = new j$.util.concurrent.ConcurrentHashMap();
        this.c = new j$.util.concurrent.ConcurrentHashMap();
        this.d = new j$.util.concurrent.ConcurrentHashMap();
        this.e = new j$.util.concurrent.ConcurrentHashMap();
    }

    public static defpackage.wda a(java.lang.String str, java.lang.String str2, byte[] bArr) {
        if (str == null || bArr == null) {
            return null;
        }
        byte[][] bArr2 = com.google.android.gms.phenotype.ExperimentTokens.a;
        return new defpackage.wda(new com.google.android.gms.phenotype.ExperimentTokens(str, bArr, bArr2, bArr2, bArr2, bArr2, null, null, null, null), str2);
    }

    public static final defpackage.yhx b(java.lang.String str, java.util.concurrent.atomic.AtomicReference atomicReference) {
        if (str == null || atomicReference == null) {
            return defpackage.ynd.a;
        }
        defpackage.yhv yhvVar = new defpackage.yhv();
        java.lang.Object obj = atomicReference.get();
        if (obj instanceof defpackage.wdd) {
            int i = defpackage.wdd.b;
            ((defpackage.wdd) obj).a(str, yhvVar);
        } else {
            for (defpackage.wdd wddVar : (defpackage.wdd[]) obj) {
                int i2 = defpackage.wdd.b;
                wddVar.a(str, yhvVar);
            }
        }
        return yhvVar.g();
    }

    public static void c(defpackage.sim simVar, defpackage.xzi xziVar, defpackage.xyd xydVar) {
        java.lang.String str;
        int[] iArr;
        int[] iArr2;
        byte[][] bArr;
        byte[][] bArr2;
        byte[] bArr3;
        int[] iArr3;
        int[] iArr4;
        byte[][] bArr4;
        byte[][] bArr5;
        byte[][] bArr6;
        com.google.android.gms.phenotype.ExperimentTokens experimentTokens;
        byte[][] bArr7;
        int[] iArr5;
        byte[][] bArr8;
        int[] iArr6;
        java.util.ArrayList<com.google.android.gms.phenotype.ExperimentTokens> arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        if (!simVar.i.isEmpty()) {
            for (defpackage.wda wdaVar : (java.util.Set) xziVar.fF()) {
                arrayList.add(wdaVar.a);
                hashSet.add(wdaVar.b);
            }
        }
        java.util.ArrayList<java.lang.String> arrayList2 = simVar.d;
        if (arrayList2 != null) {
            for (java.lang.String str2 : arrayList2) {
                defpackage.wda wdaVar2 = (defpackage.wda) xydVar.a(str2);
                if (wdaVar2 != null) {
                    arrayList.add(wdaVar2.a);
                    hashSet.add(str2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.isEmpty()) {
            experimentTokens = com.google.android.gms.phenotype.ExperimentTokens.b;
        } else {
            final int i = 1;
            final int i2 = 0;
            if (arrayList.size() == 1) {
                experimentTokens = (com.google.android.gms.phenotype.ExperimentTokens) arrayList.get(0);
            } else {
                if (arrayList.isEmpty()) {
                    str = ((com.google.android.gms.phenotype.ExperimentTokens) arrayList.get(0)).c;
                    break;
                }
                java.lang.String str3 = ((com.google.android.gms.phenotype.ExperimentTokens) arrayList.get(0)).c;
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!defpackage.a.B(str3, ((com.google.android.gms.phenotype.ExperimentTokens) it.next()).c)) {
                            str = "";
                            break;
                        }
                    } else {
                        str = ((com.google.android.gms.phenotype.ExperimentTokens) arrayList.get(0)).c;
                        break;
                    }
                }
                byte[][] bArrA = com.google.android.gms.phenotype.ExperimentTokens.a(arrayList, new defpackage.svf() { // from class: sve
                    @Override // defpackage.svf
                    public final byte[][] a(com.google.android.gms.phenotype.ExperimentTokens experimentTokens2) {
                        int i3 = i;
                        if (i3 == 0) {
                            return experimentTokens2.f;
                        }
                        if (i3 != 1) {
                            return i3 != 2 ? experimentTokens2.h : experimentTokens2.g;
                        }
                        return experimentTokens2.e;
                    }
                });
                byte[][] bArrA2 = com.google.android.gms.phenotype.ExperimentTokens.a(arrayList, new defpackage.svf() { // from class: sve
                    @Override // defpackage.svf
                    public final byte[][] a(com.google.android.gms.phenotype.ExperimentTokens experimentTokens2) {
                        int i3 = i2;
                        if (i3 == 0) {
                            return experimentTokens2.f;
                        }
                        if (i3 != 1) {
                            return i3 != 2 ? experimentTokens2.h : experimentTokens2.g;
                        }
                        return experimentTokens2.e;
                    }
                });
                final int i3 = 2;
                byte[][] bArrA3 = com.google.android.gms.phenotype.ExperimentTokens.a(arrayList, new defpackage.svf() { // from class: sve
                    @Override // defpackage.svf
                    public final byte[][] a(com.google.android.gms.phenotype.ExperimentTokens experimentTokens2) {
                        int i4 = i3;
                        if (i4 == 0) {
                            return experimentTokens2.f;
                        }
                        if (i4 != 1) {
                            return i4 != 2 ? experimentTokens2.h : experimentTokens2.g;
                        }
                        return experimentTokens2.e;
                    }
                });
                final int i4 = 3;
                byte[][] bArrA4 = com.google.android.gms.phenotype.ExperimentTokens.a(arrayList, new defpackage.svf() { // from class: sve
                    @Override // defpackage.svf
                    public final byte[][] a(com.google.android.gms.phenotype.ExperimentTokens experimentTokens2) {
                        int i5 = i4;
                        if (i5 == 0) {
                            return experimentTokens2.f;
                        }
                        if (i5 != 1) {
                            return i5 != 2 ? experimentTokens2.h : experimentTokens2.g;
                        }
                        return experimentTokens2.e;
                    }
                });
                boolean z = true;
                int length = 0;
                for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens2 : arrayList) {
                    if (experimentTokens2 != null && (iArr6 = experimentTokens2.i) != null) {
                        length += iArr6.length;
                        z = false;
                    }
                }
                if (z) {
                    iArr = null;
                } else {
                    iArr = new int[length];
                    int i5 = 0;
                    for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens3 : arrayList) {
                        if (experimentTokens3 != null && (iArr2 = experimentTokens3.i) != null) {
                            int i6 = i2;
                            while (i6 < iArr2.length) {
                                iArr[i5] = iArr2[i6];
                                i6++;
                                i5++;
                            }
                        }
                        i2 = 0;
                    }
                }
                boolean z2 = true;
                int length2 = 0;
                for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens4 : arrayList) {
                    if (experimentTokens4 != null && experimentTokens4.d != null) {
                        length2++;
                        z2 = false;
                    }
                    if (experimentTokens4 != null && (bArr8 = experimentTokens4.j) != null) {
                        length2 += bArr8.length;
                        z2 = false;
                    }
                }
                if (z2) {
                    bArr = null;
                } else {
                    byte[][] bArr9 = new byte[length2][];
                    int i7 = 0;
                    for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens5 : arrayList) {
                        if (experimentTokens5 != null && (bArr3 = experimentTokens5.d) != null) {
                            bArr9[i7] = bArr3;
                            i7++;
                        }
                        if (experimentTokens5 != null && (bArr2 = experimentTokens5.j) != null) {
                            int i8 = 0;
                            while (i8 < bArr2.length) {
                                bArr9[i7] = bArr2[i8];
                                i8++;
                                i7++;
                            }
                        }
                    }
                    bArr = bArr9;
                }
                boolean z3 = true;
                int length3 = 0;
                for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens6 : arrayList) {
                    if (experimentTokens6 != null && (iArr5 = experimentTokens6.k) != null) {
                        length3 += iArr5.length;
                        z3 = false;
                    }
                }
                if (z3) {
                    iArr3 = null;
                } else {
                    iArr3 = new int[length3];
                    int i9 = 0;
                    for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens7 : arrayList) {
                        if (experimentTokens7 != null && (iArr4 = experimentTokens7.k) != null) {
                            int i10 = 0;
                            while (i10 < iArr4.length) {
                                iArr3[i9] = iArr4[i10];
                                i10++;
                                i9++;
                            }
                        }
                        arrayList = arrayList;
                    }
                }
                java.util.ArrayList<com.google.android.gms.phenotype.ExperimentTokens> arrayList3 = arrayList;
                boolean z4 = true;
                int length4 = 0;
                for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens8 : arrayList3) {
                    if (experimentTokens8 != null && (bArr7 = experimentTokens8.l) != null) {
                        length4 += bArr7.length;
                        z4 = false;
                    }
                }
                if (z4) {
                    bArr4 = null;
                } else {
                    byte[][] bArr10 = new byte[length4][];
                    int i11 = 0;
                    for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens9 : arrayList3) {
                        if (experimentTokens9 == null || (bArr6 = experimentTokens9.l) == null) {
                            bArr5 = bArr10;
                        } else {
                            bArr5 = bArr10;
                            for (byte[] bArr11 : bArr6) {
                                if (bArr11 != null) {
                                    bArr5[i11] = bArr11;
                                    i11++;
                                }
                            }
                        }
                        bArr10 = bArr5;
                    }
                    bArr4 = bArr10;
                }
                experimentTokens = new com.google.android.gms.phenotype.ExperimentTokens(str, null, bArrA, bArrA2, bArrA3, bArrA4, iArr, bArr, iArr3, bArr4);
            }
        }
        defpackage.sil silVar = simVar.a;
        if (silVar.c()) {
            throw new java.lang.IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
        }
        if (simVar.g == null) {
            simVar.g = new java.util.HashSet();
        }
        simVar.g.addAll(hashSet);
        if (silVar.c()) {
            throw new java.lang.IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
        }
        if (experimentTokens == null) {
            return;
        }
        if (simVar.f == null) {
            simVar.f = new java.util.ArrayList();
        }
        simVar.f.add(experimentTokens);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [afak, java.lang.Object] */
    public final defpackage.vsu d(java.util.concurrent.Executor executor, defpackage.aclm aclmVar, defpackage.afak afakVar) {
        defpackage.vss vssVar = (defpackage.vss) this.d.a();
        vssVar.getClass();
        defpackage.vmh vmhVar = (defpackage.vmh) this.a.a();
        vmhVar.getClass();
        java.lang.Object objA = this.e.a();
        executor.getClass();
        aclmVar.getClass();
        ?? r6 = this.b;
        return new defpackage.vsu(vssVar, this.c, vmhVar, (defpackage.ret) objA, r6, executor, aclmVar, afakVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [bys, diu, java.lang.Object] */
    public final defpackage.bys e(final defpackage.dir dirVar) {
        defpackage.affc affcVar = new defpackage.affc() { // from class: dia
            /* JADX WARN: Code duplicated, block: B:227:0x03b4  */
            /* JADX WARN: Code duplicated, block: B:228:0x03b6  */
            /* JADX WARN: Type inference failed for: r0v1, types: [affc, java.lang.Object] */
            @Override // defpackage.affc
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i;
                java.lang.Object obj2;
                java.lang.Object obj3;
                defpackage.afau afauVar;
                java.lang.Object disVar;
                java.lang.Object objInvoke;
                java.lang.Object objInvoke2;
                defpackage.dhs dhsVar;
                java.lang.Object afavVar;
                android.graphics.Typeface typefaceT;
                defpackage.affc affcVar2 = (defpackage.affc) obj;
                defpackage.dir dirVar2 = dirVar;
                defpackage.dhz dhzVar = dirVar2.a;
                defpackage.dit ditVar = null;
                if (dhzVar instanceof defpackage.dic) {
                    java.util.List list = ((defpackage.dic) dhzVar).f;
                    defpackage.dil dilVar = dirVar2.b;
                    int i2 = dirVar2.c;
                    java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        java.lang.Object obj4 = list.get(i3);
                        defpackage.dhy dhyVar = (defpackage.dhy) obj4;
                        if (defpackage.afga.f(dhyVar.c(), dilVar) && dhyVar.b() == i2) {
                            arrayList.add(obj4);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
                        int size2 = list.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            java.lang.Object obj5 = list.get(i4);
                            if (((defpackage.dhy) obj5).b() == i2) {
                                arrayList2.add(obj5);
                            }
                        }
                        if (true != arrayList2.isEmpty()) {
                            list = arrayList2;
                        }
                        if (dilVar.compareTo(defpackage.dil.d) < 0) {
                            int size3 = list.size();
                            defpackage.dil dilVar2 = null;
                            defpackage.dil dilVar3 = null;
                            for (int i5 = 0; i5 < size3; i5++) {
                                defpackage.dil dilVarC = ((defpackage.dhy) list.get(i5)).c();
                                if (dilVarC.compareTo(dilVar) >= 0) {
                                    if (dilVarC.compareTo(dilVar) <= 0) {
                                        dilVar2 = dilVarC;
                                        dilVar3 = dilVar2;
                                        break;
                                    }
                                    if (dilVar3 == null || dilVarC.compareTo(dilVar3) < 0) {
                                        dilVar3 = dilVarC;
                                    }
                                } else if (dilVar2 == null || dilVarC.compareTo(dilVar2) > 0) {
                                    dilVar2 = dilVarC;
                                }
                            }
                            arrayList = new java.util.ArrayList(list.size());
                            int size4 = list.size();
                            for (int i6 = 0; i6 < size4; i6++) {
                                defpackage.dil dilVar4 = dilVar2 == null ? dilVar3 : dilVar2;
                                java.lang.Object obj6 = list.get(i6);
                                if (defpackage.afga.f(((defpackage.dhy) obj6).c(), dilVar4)) {
                                    arrayList.add(obj6);
                                }
                            }
                        } else {
                            defpackage.dil dilVar5 = defpackage.dil.e;
                            if (dilVar.compareTo(dilVar5) > 0) {
                                int size5 = list.size();
                                defpackage.dil dilVar6 = null;
                                defpackage.dil dilVar7 = null;
                                for (int i7 = 0; i7 < size5; i7++) {
                                    defpackage.dil dilVarC2 = ((defpackage.dhy) list.get(i7)).c();
                                    if (dilVarC2.compareTo(dilVar) >= 0) {
                                        if (dilVarC2.compareTo(dilVar) <= 0) {
                                            dilVar6 = dilVarC2;
                                            dilVar7 = dilVar6;
                                            break;
                                        }
                                        if (dilVar7 == null || dilVarC2.compareTo(dilVar7) < 0) {
                                            dilVar7 = dilVarC2;
                                        }
                                    } else if (dilVar6 == null || dilVarC2.compareTo(dilVar6) > 0) {
                                        dilVar6 = dilVarC2;
                                    }
                                }
                                arrayList = new java.util.ArrayList(list.size());
                                int size6 = list.size();
                                for (int i8 = 0; i8 < size6; i8++) {
                                    defpackage.dil dilVar8 = dilVar7 == null ? dilVar6 : dilVar7;
                                    java.lang.Object obj7 = list.get(i8);
                                    if (defpackage.afga.f(((defpackage.dhy) obj7).c(), dilVar8)) {
                                        arrayList.add(obj7);
                                    }
                                }
                            } else {
                                int size7 = list.size();
                                defpackage.dil dilVar9 = null;
                                defpackage.dil dilVar10 = null;
                                for (int i9 = 0; i9 < size7; i9++) {
                                    defpackage.dil dilVarC3 = ((defpackage.dhy) list.get(i9)).c();
                                    if (dilVar5 == null || dilVarC3.compareTo(dilVar5) <= 0) {
                                        if (dilVarC3.compareTo(dilVar) >= 0) {
                                            if (dilVarC3.compareTo(dilVar) <= 0) {
                                                dilVar9 = dilVarC3;
                                                dilVar10 = dilVar9;
                                                break;
                                            }
                                            if (dilVar10 == null || dilVarC3.compareTo(dilVar10) < 0) {
                                                dilVar10 = dilVarC3;
                                            }
                                        } else if (dilVar9 == null || dilVarC3.compareTo(dilVar9) > 0) {
                                            dilVar9 = dilVarC3;
                                        }
                                    }
                                }
                                arrayList = new java.util.ArrayList(list.size());
                                int size8 = list.size();
                                for (int i10 = 0; i10 < size8; i10++) {
                                    defpackage.dil dilVar11 = dilVar10 == null ? dilVar9 : dilVar10;
                                    java.lang.Object obj8 = list.get(i10);
                                    if (defpackage.afga.f(((defpackage.dhy) obj8).c(), dilVar11)) {
                                        arrayList.add(obj8);
                                    }
                                }
                                i = 0;
                                if (arrayList.isEmpty()) {
                                    int size9 = list.size();
                                    defpackage.dil dilVar12 = null;
                                    defpackage.dil dilVar13 = null;
                                    for (int i11 = 0; i11 < size9; i11++) {
                                        defpackage.dil dilVarC4 = ((defpackage.dhy) list.get(i11)).c();
                                        if (dilVar5 == null || dilVarC4.compareTo(dilVar5) >= 0) {
                                            if (dilVarC4.compareTo(dilVar) >= 0) {
                                                if (dilVarC4.compareTo(dilVar) <= 0) {
                                                    dilVar12 = dilVarC4;
                                                    dilVar13 = dilVar12;
                                                    break;
                                                }
                                                if (dilVar13 == null || dilVarC4.compareTo(dilVar13) < 0) {
                                                    dilVar13 = dilVarC4;
                                                }
                                            } else if (dilVar12 == null || dilVarC4.compareTo(dilVar12) > 0) {
                                                dilVar12 = dilVarC4;
                                            }
                                        }
                                    }
                                    arrayList = new java.util.ArrayList(list.size());
                                    int size10 = list.size();
                                    for (int i12 = 0; i12 < size10; i12++) {
                                        defpackage.dil dilVar14 = dilVar13 == null ? dilVar12 : dilVar13;
                                        java.lang.Object obj9 = list.get(i12);
                                        if (defpackage.afga.f(((defpackage.dhy) obj9).c(), dilVar14)) {
                                            arrayList.add(obj9);
                                        }
                                    }
                                }
                            }
                        }
                        i = 0;
                    } else {
                        i = 0;
                    }
                    defpackage.wde wdeVar = this.b;
                    int size11 = arrayList.size();
                    int i13 = i;
                    java.util.List listAe = null;
                    while (true) {
                        obj2 = wdeVar.d;
                        ?? r0 = wdeVar.b;
                        obj3 = wdeVar.c;
                        if (i13 >= size11) {
                            afauVar = new defpackage.afau(listAe, r0.invoke(dirVar2));
                            break;
                        }
                        defpackage.ngb ngbVar = ((defpackage.did) obj2).b;
                        defpackage.dhy dhyVar2 = (defpackage.dhy) arrayList.get(i13);
                        int iA = dhyVar2.a();
                        if (iA == 0) {
                            synchronized (ngbVar.c) {
                                defpackage.dht dhtVar = new defpackage.dht(dhyVar2);
                                defpackage.dhs dhsVar2 = (defpackage.dhs) ((defpackage.aab) ngbVar.b).b(dhtVar);
                                if (dhsVar2 == null) {
                                    dhsVar2 = (defpackage.dhs) ((defpackage.aau) ngbVar.a).a(dhtVar);
                                }
                                if (dhsVar2 != null) {
                                    objInvoke2 = dhsVar2.a;
                                } else {
                                    try {
                                        objInvoke = ((defpackage.ldx) obj3).z(dhyVar2);
                                    } catch (java.lang.Exception unused) {
                                        objInvoke = r0.invoke(dirVar2);
                                    }
                                    objInvoke2 = objInvoke;
                                    ngbVar.r(dhyVar2, objInvoke2);
                                }
                            }
                            if (objInvoke2 == null) {
                                objInvoke2 = r0.invoke(dirVar2);
                            }
                            afauVar = new defpackage.afau(listAe, defpackage.dax.i(dirVar2.d, objInvoke2, dhyVar2, dirVar2.b, dirVar2.c));
                            break;
                        }
                        if (iA == 1) {
                            synchronized (ngbVar.c) {
                                defpackage.dht dhtVar2 = new defpackage.dht(dhyVar2);
                                defpackage.dhs dhsVar3 = (defpackage.dhs) ((defpackage.aab) ngbVar.b).b(dhtVar2);
                                if (dhsVar3 == null) {
                                    dhsVar3 = (defpackage.dhs) ((defpackage.aau) ngbVar.a).a(dhtVar2);
                                }
                                if (dhsVar3 != null) {
                                    afavVar = dhsVar3.a;
                                } else {
                                    try {
                                        afavVar = ((defpackage.ldx) obj3).z(dhyVar2);
                                    } catch (java.lang.Throwable th) {
                                        afavVar = new defpackage.afav(th);
                                    }
                                    if (true == (afavVar instanceof defpackage.afav)) {
                                        afavVar = null;
                                    }
                                    ngbVar.r(dhyVar2, afavVar);
                                }
                            }
                            if (afavVar != null) {
                                afauVar = new defpackage.afau(listAe, defpackage.dax.i(dirVar2.d, afavVar, dhyVar2, dirVar2.b, dirVar2.c));
                                break;
                            }
                            i13++;
                        } else {
                            defpackage.dht dhtVar3 = new defpackage.dht(dhyVar2);
                            synchronized (ngbVar.c) {
                                dhsVar = (defpackage.dhs) ((defpackage.aab) ngbVar.b).b(dhtVar3);
                                if (dhsVar == null) {
                                    dhsVar = (defpackage.dhs) ((defpackage.aau) ngbVar.a).a(dhtVar3);
                                }
                            }
                            if (dhsVar != null) {
                                if (dhsVar.a != null) {
                                    afauVar = new defpackage.afau(listAe, defpackage.dax.i(dirVar2.d, dhsVar.a, dhyVar2, dirVar2.b, dirVar2.c));
                                    break;
                                }
                            } else if (listAe == null) {
                                defpackage.dhy[] dhyVarArr = new defpackage.dhy[1];
                                dhyVarArr[i] = dhyVar2;
                                listAe = defpackage.afga.ae(dhyVarArr);
                            } else {
                                listAe.add(dhyVar2);
                            }
                            i13++;
                        }
                    }
                    java.util.List list2 = (java.util.List) afauVar.a;
                    java.lang.Object obj10 = afauVar.b;
                    if (list2 == null) {
                        disVar = new defpackage.dit(obj10, true);
                    } else {
                        defpackage.did didVar = (defpackage.did) obj2;
                        defpackage.dhr dhrVar = new defpackage.dhr(list2, obj10, dirVar2, didVar.b, affcVar2, (defpackage.ldx) obj3);
                        ahoc.d(didVar.a, (defpackage.afdo) null, 4, new defpackage.ber(dhrVar, (defpackage.afdk) null, 8), 1);
                        disVar = new defpackage.dis(dhrVar);
                    }
                } else {
                    disVar = null;
                }
                if (disVar != null) {
                    return disVar;
                }
                defpackage.dhz dhzVar2 = dirVar2.a;
                if (dhzVar2 != null && !(dhzVar2 instanceof defpackage.dhv)) {
                    if (dhzVar2 instanceof defpackage.din) {
                        typefaceT = defpackage.day.t(((defpackage.din) dhzVar2).f, dirVar2.b, dirVar2.c);
                    } else if (dhzVar2 instanceof defpackage.dio) {
                        throw null;
                    }
                    if (ditVar != null) {
                        return ditVar;
                    }
                    throw new java.lang.IllegalStateException("Could not load font");
                }
                typefaceT = defpackage.day.t(null, dirVar2.b, dirVar2.c);
                ditVar = new defpackage.dit(typefaceT, true);
                if (ditVar != null) {
                    return ditVar;
                }
                throw new java.lang.IllegalStateException("Could not load font");
            }
        };
        java.lang.Object obj = this.a;
        defpackage.fbl fblVar = (defpackage.fbl) obj;
        synchronized (fblVar.a) {
            java.lang.Object obj2 = ((defpackage.fbl) obj).b;
            defpackage.diu diuVar = (defpackage.diu) ((defpackage.aab) obj2).b(dirVar);
            if (diuVar != null) {
                if (diuVar.b()) {
                    return diuVar;
                }
            }
            try {
                ?? Invoke = affcVar.invoke(new defpackage.beh(obj, dirVar, 19));
                synchronized (fblVar.a) {
                    java.lang.Object obj3 = ((defpackage.fbl) obj).b;
                    if (((defpackage.aab) obj3).b(dirVar) == null && Invoke.b()) {
                        ((defpackage.aab) obj3).c(dirVar, Invoke);
                    }
                }
                return Invoke;
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException("Could not load font", e);
            }
        }
    }

    public final defpackage.bys f(defpackage.dhz dhzVar, defpackage.dil dilVar, int i, int i2) {
        int i3 = ((defpackage.dho) this.e).a;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            dilVar = new defpackage.dil(defpackage.afqt.g(dilVar.o + i3, 1, 1000));
        }
        return e(new defpackage.dir(dhzVar, dilVar, i, i2));
    }

    public wde(java.lang.String str, defpackage.zbe zbeVar, defpackage.zbd zbdVar, java.lang.String str2, java.lang.Object... objArr) {
        this.e = str;
        this.d = zbeVar;
        this.b = zbdVar;
        this.c = str2;
        this.a = objArr;
    }

    public wde(defpackage.ldx ldxVar, defpackage.dho dhoVar, defpackage.fbl fblVar, defpackage.did didVar) {
        this.c = ldxVar;
        this.e = dhoVar;
        this.a = fblVar;
        this.d = didVar;
        this.b = new defpackage.dbj(this, 7);
    }

    public wde(defpackage.afak afakVar, defpackage.afak afakVar2, defpackage.afak afakVar3, defpackage.afak afakVar4, defpackage.afak afakVar5) {
        this.d = afakVar;
        this.c = afakVar2;
        this.a = afakVar3;
        this.e = afakVar4;
        this.b = afakVar5;
    }

    public wde(defpackage.affg affgVar, aium aiumVar, defpackage.ehp ehpVar, defpackage.afdo afdoVar, defpackage.fdm fdmVar) {
        afdoVar.getClass();
        this.a = affgVar;
        this.b = aiumVar;
        this.c = ehpVar;
        this.d = afdoVar;
        this.e = fdmVar;
    }
}
