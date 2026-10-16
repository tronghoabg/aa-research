package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bfh {
    public final bwq a = new ParcelableSnapshotMutableState(null, bxp.c);
    public deu b;
    public final SnapshotStateList c;
    private final deu d;

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public bfh(deu deuVar) {
        this.d = deuVar;
        bes besVar = new bes(8);
        des desVar = new des(deuVar);
        List list = desVar.c;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ?? Invoke = besVar.invoke(((der) list.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList2 = new ArrayList(Invoke.size());
            int size2 = Invoke.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(das.i((det) Invoke.get(i2)));
            }
            woy.cq(arrayList, arrayList2);
        }
        desVar.c.clear();
        desVar.c.addAll(arrayList);
        this.b = desVar.b();
        this.c = new SnapshotStateList();
    }

    public static final det d(det detVar, dft dftVar) {
        int iE = dftVar.e() - 1;
        int i = detVar.b;
        int iF = dftVar.f(iE, false);
        if (i < iF) {
            return det.a(detVar, null, Math.min(detVar.c, iF), 11);
        }
        return null;
    }

    public final dft a() {
        return (dft) this.a.a();
    }

    public final void b(bux buxVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        Object obj;
        Object obj2;
        int i6 = i & 6;
        bux buxVarC = buxVar.c(1154651354);
        int i7 = 2;
        boolean z3 = true;
        if (i6 == 0) {
            i2 = (true != buxVarC.E(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        boolean z4 = false;
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            kwp kwpVar = (kwp) buxVarC.f(dbc.m);
            deu deuVar = this.b;
            List listG = deuVar.g(deuVar.a());
            int size = listG.size();
            int i8 = 0;
            while (i8 < size) {
                det detVar = (det) listG.get(i8);
                if (detVar.b != detVar.c) {
                    buxVarC.v(725516538);
                    bvv bvvVar = (bvv) buxVarC;
                    Object objS = bvvVar.S();
                    Object obj3 = buw.a;
                    if (objS == obj3) {
                        objS = new asg();
                        bvvVar.ad(objS);
                    }
                    asf asfVar = (asf) objS;
                    i4 = i8;
                    int i9 = 4;
                    cct cctVarI = bxc.i(1731209863, z3, new bhm(this, detVar, asfVar, kwpVar, 1), buxVarC);
                    buxVarC.v(727333386);
                    cctVarI.invoke(buxVarC, 6);
                    bvvVar.Y(z4);
                    dez dezVar = (dez) detVar.a;
                    if (asl.R(dezVar.a())) {
                        i5 = i7;
                        z = z3;
                        z2 = z4;
                        buxVarC.v(729535006);
                        bvvVar.Y(z2);
                    } else {
                        buxVarC.v(727506335);
                        Object objS2 = bvvVar.S();
                        if (objS2 == obj3) {
                            objS2 = new bii(asfVar);
                            bvvVar.ad(objS2);
                        }
                        bii biiVar = (bii) objS2;
                        afak afakVar = afak.a;
                        z = z3;
                        Object objS3 = bvvVar.S();
                        boolean z5 = z4;
                        if (objS3 == obj3) {
                            objS3 = new beo(biiVar, (afck) null, i7);
                            bvvVar.ad(objS3);
                        }
                        bvq.g(afakVar, (afeg) objS3, buxVarC);
                        Object objValueOf = Boolean.valueOf(biiVar.i());
                        Object objValueOf2 = Boolean.valueOf(biiVar.h());
                        Object objValueOf3 = Boolean.valueOf(biiVar.j());
                        i5 = i7;
                        dfu dfuVarA = dezVar.a();
                        if (dfuVarA != null) {
                            obj = dfuVarA.a;
                            obj2 = null;
                        } else {
                            obj = null;
                            obj2 = null;
                        }
                        dfu dfuVarA2 = dezVar.a();
                        Object obj4 = dfuVarA2 != null ? dfuVarA2.b : obj2;
                        dezVar.a();
                        dezVar.a();
                        Object[] objArr = new Object[7];
                        objArr[z5 ? 1 : 0] = objValueOf;
                        objArr[z ? 1 : 0] = objValueOf2;
                        objArr[i5] = objValueOf3;
                        objArr[3] = obj;
                        objArr[4] = obj4;
                        objArr[5] = obj2;
                        objArr[6] = obj2;
                        boolean zE = buxVarC.E(this) | buxVarC.C(detVar);
                        Object objS4 = bvvVar.S();
                        if (zE || objS4 == obj3) {
                            objS4 = new bee(detVar, biiVar, i9);
                            bvvVar.ad(objS4);
                        }
                        c(objArr, (afec) objS4, buxVarC, (i2 << 6) & 896);
                        z2 = z5 ? 1 : 0;
                        bvvVar.Y(z2);
                    }
                    bvvVar.Y(z2);
                } else {
                    i4 = i8;
                    i5 = i7;
                    z = z3;
                    z2 = z4;
                    buxVarC.v(729548894);
                    ((bvv) buxVarC).Y(z2);
                }
                z4 = z2;
                i8 = i4 + 1;
                z3 = z;
                i7 = i5;
            }
            i3 = 6;
        } else {
            i3 = 6;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new ati(this, i, i3);
        }
    }

    public final void c(Object[] objArr, afec afecVar, bux buxVar, int i) {
        int i2 = i & 48;
        bux buxVarC = buxVar.c(-2083052099);
        int i3 = i2 == 0 ? (true != buxVarC.E(afecVar) ? 16 : 32) | i : i;
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.E(this) ? 128 : 256;
        }
        bvv bvvVar = (bvv) buxVarC;
        byte[] bArr = null;
        bvvVar.ab(-358306546, 7, 0, null);
        int i4 = i3 | (true != buxVarC.A(7) ? 0 : 4);
        for (int i5 = 0; i5 < 7; i5++) {
            i4 |= true != buxVarC.E(objArr[i5]) ? 0 : 4;
        }
        bvvVar.Y(false);
        if ((i4 & 14) == 0) {
            i4 |= 2;
        }
        if (buxVarC.I((i4 & 147) != 146, i4 & 1)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(afecVar);
            affx.a(objArr, arrayList);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zE = buxVarC.E(this) | ((i4 & 112) == 32);
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new bee(this, afecVar, 3, bArr);
                bvvVar.ad(objS);
            }
            bvq.d(array, (afec) objS, buxVarC);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new alu(this, objArr, afecVar, i, 4);
        }
    }
}
