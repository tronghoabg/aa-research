package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bfk {
    public final defpackage.bwx a = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
    public defpackage.dfb b;
    public final androidx.compose.runtime.snapshots.SnapshotStateList c;
    private final defpackage.dfb d;

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public bfk(defpackage.dfb dfbVar) {
        this.d = dfbVar;
        defpackage.bev bevVar = new defpackage.bev(8);
        defpackage.dez dezVar = new defpackage.dez(dfbVar);
        java.util.List list = dezVar.c;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ?? Invoke = bevVar.invoke(((defpackage.dey) list.get(i)).a(Integer.MIN_VALUE));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(Invoke.size());
            int size2 = Invoke.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(defpackage.dbb.e((defpackage.dfa) Invoke.get(i2)));
            }
            defpackage.afga.bk(arrayList, arrayList2);
        }
        dezVar.c.clear();
        dezVar.c.addAll(arrayList);
        this.b = dezVar.b();
        this.c = new androidx.compose.runtime.snapshots.SnapshotStateList();
    }

    public static final defpackage.dfa d(defpackage.dfa dfaVar, defpackage.dga dgaVar) {
        int iE = dgaVar.e() - 1;
        int i = dfaVar.b;
        int iF = dgaVar.f(iE, false);
        if (i < iF) {
            return defpackage.dfa.a(dfaVar, null, java.lang.Math.min(dfaVar.c, iF), 11);
        }
        return null;
    }

    public final defpackage.dga a() {
        return (defpackage.dga) this.a.a();
    }

    public final void b(defpackage.bve bveVar, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1154651354);
        int i6 = 2;
        boolean z3 = true;
        if (i5 == 0) {
            i2 = (true != bveVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        boolean z4 = false;
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.kwv kwvVar = (defpackage.kwv) bveVarC.f(defpackage.dbl.m);
            defpackage.dfb dfbVar = this.b;
            java.util.List listG = dfbVar.g(dfbVar.a());
            int size = listG.size();
            int i7 = 0;
            while (i7 < size) {
                defpackage.dfa dfaVar = (defpackage.dfa) listG.get(i7);
                if (dfaVar.b != dfaVar.c) {
                    bveVarC.v(725516538);
                    defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                    java.lang.Object objS = bwcVar.S();
                    java.lang.Object obj3 = defpackage.bvd.a;
                    if (objS == obj3) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    defpackage.ask askVar = (defpackage.ask) objS;
                    int i8 = 4;
                    defpackage.ccz cczVarAs = defpackage.dai.as(1731209863, z3, new defpackage.bhq(this, dfaVar, askVar, kwvVar, 1), bveVarC);
                    bveVarC.v(727333386);
                    cczVarAs.invoke(bveVarC, 6);
                    bwcVar.Y(z4);
                    defpackage.dfg dfgVar = (defpackage.dfg) dfaVar.a;
                    if (defpackage.asq.O(dfgVar.a())) {
                        i4 = i6;
                        z = z3;
                        z2 = z4;
                        bveVarC.v(729535006);
                        bwcVar.Y(z2);
                    } else {
                        bveVarC.v(727506335);
                        java.lang.Object objS2 = bwcVar.S();
                        if (objS2 == obj3) {
                            objS2 = new defpackage.bil(askVar);
                            bwcVar.ad(objS2);
                        }
                        defpackage.bil bilVar = (defpackage.bil) objS2;
                        defpackage.afbk afbkVar = defpackage.afbk.a;
                        z = z3;
                        java.lang.Object objS3 = bwcVar.S();
                        boolean z5 = z4;
                        if (objS3 == obj3) {
                            objS3 = new defpackage.ber(bilVar, (defpackage.afdk) null, i6);
                            bwcVar.ad(objS3);
                        }
                        defpackage.bvx.g(afbkVar, (defpackage.affg) objS3, bveVarC);
                        java.lang.Object objValueOf = java.lang.Boolean.valueOf(bilVar.i());
                        java.lang.Object objValueOf2 = java.lang.Boolean.valueOf(bilVar.h());
                        java.lang.Object objValueOf3 = java.lang.Boolean.valueOf(bilVar.j());
                        i4 = i6;
                        defpackage.dgb dgbVarA = dfgVar.a();
                        if (dgbVarA != null) {
                            obj = dgbVarA.a;
                            obj2 = null;
                        } else {
                            obj = null;
                            obj2 = null;
                        }
                        defpackage.dgb dgbVarA2 = dfgVar.a();
                        java.lang.Object obj4 = dgbVarA2 != null ? dgbVarA2.b : obj2;
                        dfgVar.a();
                        dfgVar.a();
                        java.lang.Object[] objArr = new java.lang.Object[7];
                        objArr[z5 ? 1 : 0] = objValueOf;
                        objArr[z ? 1 : 0] = objValueOf2;
                        objArr[i4] = objValueOf3;
                        objArr[3] = obj;
                        objArr[4] = obj4;
                        objArr[5] = obj2;
                        objArr[6] = obj2;
                        boolean zE = bveVarC.E(this) | bveVarC.C(dfaVar);
                        java.lang.Object objS4 = bwcVar.S();
                        if (zE || objS4 == obj3) {
                            objS4 = new defpackage.beh(dfaVar, bilVar, i8);
                            bwcVar.ad(objS4);
                        }
                        c(objArr, (defpackage.affc) objS4, bveVarC, (i2 << 6) & 896);
                        z2 = z5 ? 1 : 0;
                        bwcVar.Y(z2);
                    }
                    bwcVar.Y(z2);
                } else {
                    i4 = i6;
                    z = z3;
                    z2 = z4;
                    bveVarC.v(729548894);
                    ((defpackage.bwc) bveVarC).Y(z2);
                }
                z4 = z2;
                i7++;
                z3 = z;
                i6 = i4;
            }
            i3 = 6;
        } else {
            i3 = 6;
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.atn(this, i, i3);
        }
    }

    public final void c(java.lang.Object[] objArr, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2 = i & 48;
        defpackage.bve bveVarC = bveVar.c(-2083052099);
        int i3 = i2 == 0 ? (true != bveVarC.E(affcVar) ? 16 : 32) | i : i;
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.E(this) ? 128 : 256;
        }
        defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
        byte[] bArr = null;
        bwcVar.ab(-358306546, 7, 0, null);
        int i4 = i3 | (true != bveVarC.A(7) ? 0 : 4);
        for (int i5 = 0; i5 < 7; i5++) {
            i4 |= true != bveVarC.E(objArr[i5]) ? 0 : 4;
        }
        bwcVar.Y(false);
        if ((i4 & 14) == 0) {
            i4 |= 2;
        }
        if (bveVarC.I((i4 & 147) != 146, i4 & 1)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(2);
            arrayList.add(affcVar);
            defpackage.afgx.a(objArr, arrayList);
            java.lang.Object[] array = arrayList.toArray(new java.lang.Object[arrayList.size()]);
            boolean zE = bveVarC.E(this) | ((i4 & 112) == 32);
            java.lang.Object objS = bwcVar.S();
            if (zE || objS == defpackage.bvd.a) {
                objS = new defpackage.beh(this, affcVar, 3, bArr);
                bwcVar.ad(objS);
            }
            defpackage.bvx.d(array, (defpackage.affc) objS, bveVarC);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.alz(this, objArr, affcVar, i, 4);
        }
    }
}
