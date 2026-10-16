package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class aup implements ctw, avt {
    public final atz a;
    private final boolean b = true;
    private final asw c;
    private final atc d;
    private final float e;
    private final float f;
    private final int g;
    private final int h;
    private final aun i;

    public aup(asw aswVar, atc atcVar, float f, atz atzVar, float f2, int i, int i2, aun aunVar) {
        this.c = aswVar;
        this.d = atcVar;
        this.e = f;
        this.a = atzVar;
        this.f = f2;
        this.g = i;
        this.h = i2;
        this.i = aunVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int k(List list, int i, int i2, int i3, int i4, int i5, aun aunVar) {
        csp cspVar;
        boolean z;
        long jC;
        int i6;
        boolean z2;
        int i7;
        ze zeVar;
        List list2 = list;
        int i8 = 0;
        if (list2.isEmpty()) {
            jC = ze.c(0, 0);
        } else {
            int i9 = Alert.DURATION_SHOW_INDEFINITELY;
            long jD = dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
            csp cspVar2 = (csp) woy.bI(list2, 0);
            int iE = cspVar2 != null ? cspVar2.e(i) : 0;
            int iF = cspVar2 != null ? cspVar2.f(iE) : 0;
            if (list2.size() > 1) {
                cspVar = cspVar2;
                z = true;
            } else {
                cspVar = cspVar2;
                z = false;
            }
            int i10 = iE;
            int i11 = iF;
            if (ca.ar(z, 0, ze.c(i, Alert.DURATION_SHOW_INDEFINITELY), cspVar == null ? null : new ze(ze.c(iF, iE)), 0, 0, 0, false, false, i4, aunVar, jD, i5, i2, i3).b) {
                jC = ze.c(0, 0);
            } else {
                int size = list2.size();
                int i12 = i;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = i10;
                int i19 = i11;
                int i20 = 0;
                while (true) {
                    if (i13 >= size) {
                        break;
                    }
                    int i21 = i12 - i19;
                    int i22 = i13 + 1;
                    int iMax = Math.max(i14, i18);
                    csp cspVar3 = (csp) woy.bI(list2, i22);
                    int iE2 = cspVar3 != null ? cspVar3.e(i) : i8;
                    int iF2 = cspVar3 != null ? cspVar3.f(iE2) + i2 : i8;
                    if (i13 + 2 < list2.size()) {
                        i6 = size;
                        z2 = 1;
                    } else {
                        i6 = size;
                        z2 = i8;
                    }
                    int i23 = i15;
                    int i24 = i16;
                    int i25 = i22 - i20;
                    int i26 = i6;
                    long jC2 = ze.c(i21, i9);
                    if (cspVar3 == null) {
                        i7 = i21;
                        zeVar = null;
                    } else {
                        i7 = i21;
                        zeVar = new ze(ze.c(iF2, iE2));
                    }
                    int i27 = iE2;
                    int i28 = iF2;
                    int i29 = i7;
                    aug augVarAr = ca.ar(z2, i25, jC2, zeVar, i23, i24, iMax, false, false, i4, aunVar, jD, i5, i2, i3);
                    if (augVarAr.a) {
                        i16 = i24 + iMax + i3;
                        ca.as(augVarAr, aunVar);
                        int i30 = i28 - i2;
                        i15 = i23 + 1;
                        if (augVarAr.b) {
                            i17 = i22;
                            break;
                        }
                        i20 = i22;
                        i12 = i;
                        i19 = i30;
                        i14 = 0;
                    } else {
                        i15 = i23;
                        i14 = iMax;
                        i16 = i24;
                        i12 = i29;
                        i19 = i28;
                    }
                    i13 = i22;
                    i17 = i13;
                    size = i26;
                    i18 = i27;
                    i9 = Alert.DURATION_SHOW_INDEFINITELY;
                    i8 = 0;
                    list2 = list;
                }
                jC = ze.c(i16 - i3, i17);
            }
        }
        return ze.a(jC);
    }

    @Override // defpackage.ctw
    public final int a(csq csqVar, List list, int i) {
        List list2 = (List) woy.bI(list, 1);
        csp cspVar = list2 != null ? (csp) woy.bH(list2) : null;
        List list3 = (List) woy.bI(list, 2);
        csp cspVar2 = list3 != null ? (csp) woy.bH(list3) : null;
        aun aunVar = this.i;
        aunVar.a(cspVar, cspVar2, dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY));
        List list4 = (List) woy.bH(list);
        if (list4 == null) {
            list4 = afbe.a;
        }
        return k(list4, i, csqVar.eF(this.e), csqVar.eF(this.f), this.g, this.h, aunVar);
    }

    @Override // defpackage.ctw
    public final int b(csq csqVar, List list, int i) {
        List list2 = (List) woy.bI(list, 1);
        csp cspVar = list2 != null ? (csp) woy.bH(list2) : null;
        List list3 = (List) woy.bI(list, 2);
        this.i.a(cspVar, list3 != null ? (csp) woy.bH(list3) : null, dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i));
        List list4 = (List) woy.bH(list);
        if (list4 == null) {
            list4 = afbe.a;
        }
        int iEF = csqVar.eF(this.e);
        int i2 = this.g;
        int size = list4.size();
        int i3 = 0;
        int iMax = 0;
        int iD = 0;
        int i4 = 0;
        while (i3 < size) {
            iD += ((csp) list4.get(i3)).d(i) + iEF;
            int i5 = i3 + 1;
            if (i5 - i4 == i2 || i5 == list4.size()) {
                iMax = Math.max(iMax, iD - iEF);
                i4 = i3;
                iD = 0;
            }
            i3 = i5;
        }
        return iMax;
    }

    @Override // defpackage.ctw
    public final int c(csq csqVar, List list, int i) {
        List list2 = (List) woy.bI(list, 1);
        csp cspVar = list2 != null ? (csp) woy.bH(list2) : null;
        List list3 = (List) woy.bI(list, 2);
        csp cspVar2 = list3 != null ? (csp) woy.bH(list3) : null;
        aun aunVar = this.i;
        aunVar.a(cspVar, cspVar2, dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY));
        List list4 = (List) woy.bH(list);
        if (list4 == null) {
            list4 = afbe.a;
        }
        return k(list4, i, csqVar.eF(this.e), csqVar.eF(this.f), this.g, this.h, aunVar);
    }

    @Override // defpackage.ctw
    public final int d(csq csqVar, List list, int i) {
        int i2;
        ze zeVar;
        int i3;
        int i4;
        int[] iArr;
        List list2;
        aun aunVar;
        long jC;
        int i5;
        int i6;
        int i7;
        ze zeVar2;
        List list3 = (List) woy.bI(list, 1);
        csp cspVar = list3 != null ? (csp) woy.bH(list3) : null;
        char c = 2;
        List list4 = (List) woy.bI(list, 2);
        csp cspVar2 = list4 != null ? (csp) woy.bH(list4) : null;
        aun aunVar2 = this.i;
        int i8 = 0;
        int i9 = Alert.DURATION_SHOW_INDEFINITELY;
        aunVar2.a(cspVar, cspVar2, dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i));
        List list5 = (List) woy.bH(list);
        if (list5 == null) {
            list5 = afbe.a;
        }
        int iEF = csqVar.eF(this.e);
        int iEF2 = csqVar.eF(this.f);
        int i10 = this.h;
        int i11 = this.g;
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        int i12 = 0;
        while (i12 < size3) {
            csp cspVar3 = (csp) list5.get(i12);
            char c2 = c;
            int iF = cspVar3.f(i);
            iArr2[i12] = iF;
            iArr3[i12] = cspVar3.e(iF);
            i12++;
            c = c2;
        }
        int i13 = (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : i11 * i10;
        if (i13 < list5.size()) {
            int i14 = aunVar2.c;
        }
        if (i13 >= list5.size()) {
            int i15 = aunVar2.c;
        }
        int iMin = Math.min(i13, list5.size());
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            i16 += iArr2[i17];
        }
        int size4 = i16 + ((list5.size() - 1) * iEF);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i18 = iArr3[0];
        int iCL = woy.cL(iArr3);
        if (iCL > 0) {
            int i19 = 1;
            while (true) {
                int i20 = iArr3[i19];
                if (i18 < i20) {
                    i18 = i20;
                }
                if (i19 == iCL) {
                    break;
                }
                i19++;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i21 = iArr2[0];
        int iCL2 = woy.cL(iArr2);
        if (iCL2 > 0) {
            int i22 = 1;
            while (true) {
                int i23 = iArr2[i22];
                if (i21 < i23) {
                    i21 = i23;
                }
                if (i22 == iCL2) {
                    break;
                }
                i22++;
            }
        }
        int i24 = size4;
        while (i21 <= i24 && i18 != i) {
            int i25 = (i21 + i24) / 2;
            if (list5.isEmpty()) {
                jC = ze.c(i8, i8);
                i3 = i11;
                i4 = i10;
                list2 = list5;
                aunVar = aunVar2;
                iArr = iArr3;
            } else {
                long jD = dlf.d(i8, i25, i8, i9);
                csp cspVar4 = (csp) woy.bI(list5, i8);
                int i26 = cspVar4 != null ? iArr3[i8] : i8;
                int i27 = cspVar4 != null ? iArr2[i8] : i8;
                boolean z = list5.size() > 1;
                long jC2 = ze.c(i25, Alert.DURATION_SHOW_INDEFINITELY);
                if (cspVar4 == null) {
                    i2 = i11;
                    zeVar = null;
                } else {
                    i2 = i11;
                    zeVar = new ze(ze.c(i27, i26));
                }
                i3 = i2;
                aun aunVar3 = aunVar2;
                int i28 = i26;
                int i29 = i27;
                i4 = i10;
                int[] iArr4 = iArr3;
                if (ca.ar(z, 0, jC2, zeVar, 0, 0, 0, false, false, i3, aunVar3, jD, i4, iEF, iEF2).b) {
                    jC = ze.c(0, 0);
                    iArr = iArr4;
                    list2 = list5;
                    aunVar = aunVar3;
                } else {
                    int size5 = list5.size();
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = i25;
                    int i36 = i28;
                    int i37 = 0;
                    while (true) {
                        if (i30 >= size5) {
                            iArr = iArr4;
                            list2 = list5;
                            aunVar = aunVar3;
                            break;
                        }
                        int i38 = i35 - i29;
                        int i39 = i30 + 1;
                        int iMax = Math.max(i31, i36);
                        csp cspVar5 = (csp) woy.bI(list5, i39);
                        int i40 = cspVar5 != null ? iArr4[i39] : 0;
                        if (cspVar5 != null) {
                            i5 = i39;
                            i6 = iArr2[i39] + iEF;
                        } else {
                            i5 = i39;
                            i6 = 0;
                        }
                        iArr = iArr4;
                        boolean z2 = i30 + 2 < list5.size();
                        int i41 = i5 - i37;
                        list2 = list5;
                        int i42 = i38;
                        long jC3 = ze.c(i42, Alert.DURATION_SHOW_INDEFINITELY);
                        if (cspVar5 == null) {
                            i7 = i6;
                            zeVar2 = null;
                        } else {
                            i7 = i6;
                            zeVar2 = new ze(ze.c(i6, i40));
                            i42 = i42;
                        }
                        int i43 = i40;
                        ze zeVar3 = zeVar2;
                        int i44 = size5;
                        aug augVarAr = ca.ar(z2, i41, jC3, zeVar3, i33, i34, iMax, false, false, i3, aunVar3, jD, i4, iEF, iEF2);
                        aunVar = aunVar3;
                        if (augVarAr.a) {
                            i34 += iMax + iEF2;
                            ca.as(augVarAr, aunVar);
                            int i45 = i7 - iEF;
                            i33++;
                            if (augVarAr.b) {
                                i32 = i5;
                                break;
                            }
                            i37 = i5;
                            i7 = i45;
                            i35 = i25;
                            i31 = 0;
                        } else {
                            i31 = iMax;
                            i35 = i42;
                        }
                        i32 = i5;
                        size5 = i44;
                        i36 = i43;
                        aunVar3 = aunVar;
                        list5 = list2;
                        i29 = i7;
                        i30 = i32;
                        iArr4 = iArr;
                    }
                    jC = ze.c(i34 - iEF2, i32);
                }
            }
            int iA = ze.a(jC);
            if (iA > i || ze.b(jC) < iMin) {
                i21 = i25 + 1;
                if (i21 > i24) {
                    return i21;
                }
            } else {
                if (iA >= i) {
                    return i25;
                }
                i24 = i25 - 1;
            }
            iArr3 = iArr;
            size4 = i25;
            aunVar2 = aunVar;
            i10 = i4;
            list5 = list2;
            i8 = 0;
            i9 = Alert.DURATION_SHOW_INDEFINITELY;
            i18 = iA;
            i11 = i3;
        }
        return size4;
    }

    @Override // defpackage.ctw
    public final ctq e(cts ctsVar, List list, long j) {
        int i;
        ca caVar;
        zh zhVar;
        cto ctoVarBm;
        int i2;
        long j2;
        ze zeVar;
        Integer num;
        Integer numValueOf;
        ArrayList arrayList;
        affv affvVar;
        Iterator it;
        ze zeVar2;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer num2;
        long j3;
        ze zeVar3;
        zf zfVar;
        zf zfVar2;
        int i3;
        int i4;
        int i5 = this.h;
        if (i5 != 0 && (i = this.g) != 0 && !list.isEmpty()) {
            if (dle.a(j) != 0) {
                List list2 = (List) woy.bF(list);
                if (list2.isEmpty()) {
                    return ctsVar.eK(0, 0, afbf.a, new awf(1));
                }
                List list3 = (List) woy.bI(list, 1);
                cto ctoVar = list3 != null ? (cto) woy.bH(list3) : null;
                List list4 = (List) woy.bI(list, 2);
                cto ctoVar2 = list4 != null ? (cto) woy.bH(list4) : null;
                list2.size();
                aun aunVar = this.i;
                long jD = dlf.d(dle.d(j), dle.b(j), dle.c(j), dle.a(j));
                long jD2 = dlf.d((10 & 1) != 0 ? dle.d(jD) : 0, (10 & 2) != 0 ? dle.b(jD) : 0, (10 & 4) != 0 ? dle.c(jD) : 0, dle.a(jD));
                long jD3 = dlf.d(dle.d(jD2), dle.b(jD2), dle.c(jD2), dle.a(jD2));
                if (ctoVar != null) {
                    ca.aq(ctoVar, jD3, new aui(aunVar, 3));
                    aunVar.a = ctoVar;
                }
                if (ctoVar2 != null) {
                    ca.aq(ctoVar2, jD3, new aui(aunVar, 4));
                    aunVar.b = ctoVar2;
                }
                Iterator it2 = list2.iterator();
                float f = this.e;
                float f2 = this.f;
                long jD4 = dlf.d(dle.d(j), dle.b(j), dle.c(j), dle.a(j));
                byw bywVar = new byw(new ctq[16]);
                int iB = dle.b(jD4);
                int iD = dle.d(jD4);
                int iA = dle.a(jD4);
                zh zhVar2 = zi.a;
                zh zhVar3 = new zh(6);
                ArrayList arrayList2 = new ArrayList();
                float fCeil = (float) Math.ceil(ctsVar.eA(f));
                float fCeil2 = (float) Math.ceil(ctsVar.eA(f2));
                long jD5 = dlf.d(0, iB, 0, iA);
                long jD6 = dlf.d((10 & 1) != 0 ? dle.d(jD5) : 0, (10 & 2) != 0 ? dle.b(jD5) : 0, (10 & 4) != 0 ? dle.c(jD5) : 0, dle.a(jD5));
                long jD7 = dlf.d(dle.d(jD6), dle.b(jD6), dle.c(jD6), dle.a(jD6));
                affv affvVar2 = new affv();
                if (it2 instanceof atv) {
                    ctsVar.ey(iB);
                    ctsVar.ey(iA);
                    caVar = new ca();
                } else {
                    caVar = null;
                }
                if (it2.hasNext()) {
                    zhVar = zhVar3;
                    ctoVarBm = ca.bm(it2, caVar);
                } else {
                    zhVar = zhVar3;
                    ctoVarBm = null;
                }
                if (ctoVarBm != null) {
                    i2 = i;
                    j2 = jD5;
                    zeVar = new ze(ca.aq(ctoVarBm, jD7, new aui(affvVar2, 0)));
                } else {
                    i2 = i;
                    j2 = jD5;
                    zeVar = null;
                }
                Integer numValueOf4 = zeVar != null ? Integer.valueOf(ze.a(zeVar.a)) : null;
                if (zeVar != null) {
                    num = numValueOf4;
                    numValueOf = Integer.valueOf(ze.b(zeVar.a));
                } else {
                    num = numValueOf4;
                    numValueOf = null;
                }
                int i6 = (int) fCeil2;
                int i7 = (int) fCeil;
                ze zeVar4 = zeVar;
                zf zfVar3 = new zf(16);
                cto ctoVar3 = ctoVarBm;
                zf zfVar4 = new zf(16);
                int[] iArr = zk.a;
                zj zjVar = new zj(6);
                zh zhVar4 = zhVar;
                aug augVarAr = ca.ar(it2.hasNext(), 0, ze.c(iB, iA), zeVar4, 0, 0, 0, false, false, i2, aunVar, jD4, i5, i7, i6);
                Integer num3 = numValueOf;
                int i8 = i2;
                if (augVarAr.b) {
                    ca.as(augVarAr, aunVar);
                }
                zj zjVar2 = zjVar;
                int iMax = iD;
                int i9 = iA;
                zf zfVar5 = zfVar4;
                aun aunVar2 = aunVar;
                int i10 = iB;
                aug augVar = augVarAr;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                cto ctoVar4 = ctoVar3;
                Integer num4 = num;
                zf zfVar6 = zfVar3;
                int i16 = 0;
                while (!augVar.b && ctoVar4 != null) {
                    num4.getClass();
                    int iIntValue = num4.intValue();
                    num3.getClass();
                    int i17 = i12 + iIntValue;
                    int i18 = iB;
                    int iMax2 = Math.max(i16, num3.intValue());
                    int i19 = i10 - iIntValue;
                    arrayList2.add(ctoVar4);
                    zhVar4.g(i11, affvVar2.a);
                    Object objG = ctoVar4.g();
                    if (objG instanceof avu) {
                    }
                    i11++;
                    int i20 = i11 - i15;
                    boolean z = i20 < i8;
                    if (caVar != null) {
                        if (z) {
                            int i21 = i19 - i7;
                            arrayList = arrayList2;
                            i3 = i21 < 0 ? 0 : i21;
                        } else {
                            arrayList = arrayList2;
                            i3 = i18;
                        }
                        ctsVar.ey(i3);
                        if (z) {
                            i4 = i9;
                        } else {
                            i4 = (i9 - iMax2) - i6;
                            if (i4 < 0) {
                                i4 = 0;
                            }
                        }
                        ctsVar.ey(i4);
                    } else {
                        arrayList = arrayList2;
                    }
                    cto ctoVarBm2 = !it2.hasNext() ? null : ca.bm(it2, caVar);
                    affvVar2.a = null;
                    if (ctoVarBm2 != null) {
                        it = it2;
                        affvVar = affvVar2;
                        zeVar2 = new ze(ca.aq(ctoVarBm2, jD7, new aui(affvVar2, 2)));
                    } else {
                        affvVar = affvVar2;
                        it = it2;
                        zeVar2 = null;
                    }
                    Integer numValueOf5 = zeVar2 != null ? Integer.valueOf(ze.a(zeVar2.a) + i7) : null;
                    if (zeVar2 != null) {
                        numValueOf2 = numValueOf5;
                        numValueOf3 = Integer.valueOf(ze.b(zeVar2.a));
                    } else {
                        numValueOf2 = numValueOf5;
                        numValueOf3 = null;
                    }
                    ze zeVar5 = zeVar2;
                    boolean zHasNext = it.hasNext();
                    long jC = ze.c(i19, i9);
                    if (zeVar5 == null) {
                        num2 = numValueOf3;
                        j3 = jD7;
                        zeVar3 = null;
                    } else {
                        numValueOf2.getClass();
                        int iIntValue2 = numValueOf2.intValue();
                        numValueOf3.getClass();
                        num2 = numValueOf3;
                        j3 = jD7;
                        zeVar3 = new ze(ze.c(iIntValue2, num2.intValue()));
                    }
                    int i22 = i8;
                    aug augVarAr2 = ca.ar(zHasNext, i20, jC, zeVar3, i13, i14, iMax2, false, false, i22, aunVar2, jD4, i5, i7, i6);
                    aun aunVar3 = aunVar2;
                    if (augVarAr2.a) {
                        iB = i18;
                        int iMin = Math.min(Math.max(iMax, i17), iB);
                        int i23 = i14 + iMax2;
                        ca.as(augVarAr2, aunVar3);
                        zfVar2 = zfVar5;
                        zfVar2.e(iMax2);
                        int i24 = (iA - i23) - i6;
                        zfVar = zfVar6;
                        zfVar.e(i11);
                        i13++;
                        i14 = i23 + i6;
                        i9 = i24;
                        numValueOf2 = numValueOf2 != null ? Integer.valueOf(numValueOf2.intValue() - i7) : null;
                        i15 = i11;
                        i10 = iB;
                        i16 = 0;
                        i12 = 0;
                        iMax = iMin;
                    } else {
                        zfVar = zfVar6;
                        zfVar2 = zfVar5;
                        iB = i18;
                        i12 = i17;
                        i10 = i19;
                        i16 = iMax2;
                    }
                    augVar = augVarAr2;
                    aunVar2 = aunVar3;
                    zfVar5 = zfVar2;
                    zfVar6 = zfVar;
                    i8 = i22;
                    it2 = it;
                    jD7 = j3;
                    affvVar2 = affvVar;
                    ctoVar4 = ctoVarBm2;
                    num3 = num2;
                    arrayList2 = arrayList;
                    num4 = numValueOf2;
                }
                ArrayList arrayList3 = arrayList2;
                zf zfVar7 = zfVar6;
                zf zfVar8 = zfVar5;
                int size = arrayList3.size();
                cuo[] cuoVarArr = new cuo[size];
                for (int i25 = 0; i25 < size; i25++) {
                    cuoVarArr[i25] = (cuo) zhVar4.a(i25);
                }
                int i26 = zfVar7.b;
                int[] iArr2 = new int[i26];
                int[] iArr3 = new int[i26];
                aul aulVar = new aul(ctsVar);
                int[] iArr4 = zfVar7.a;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (i28 < i26) {
                    int i30 = iArr4[i28];
                    int iA2 = zfVar8.a(i28);
                    zj zjVar3 = zjVar2;
                    if (!zjVar3.a(i28)) {
                        iA2 = dle.a(j2) == Integer.MAX_VALUE ? Integer.MAX_VALUE : dle.a(j2) - i29;
                    }
                    zjVar2 = zjVar3;
                    int[] iArr5 = iArr4;
                    int[] iArr6 = iArr3;
                    int i31 = iMax;
                    ctq ctqVarB = asl.B(this, i31, dle.c(j2), dle.b(j2), iA2, i7, aulVar, arrayList3, cuoVarArr, i27, i30, iArr2, i28);
                    int iC = ctqVarB.c();
                    int iB2 = ctqVarB.b();
                    iArr6[i28] = iB2;
                    i29 += iB2;
                    iMax = Math.max(i31, iC);
                    bywVar.n(ctqVarB);
                    i28++;
                    i27 = i30;
                    iArr3 = iArr6;
                    i26 = i26;
                    iArr4 = iArr5;
                    zfVar8 = zfVar8;
                }
                int[] iArr7 = iArr3;
                int i32 = iMax;
                int i33 = bywVar.b;
                int i34 = i33 == 0 ? 0 : i29;
                if (i33 == 0) {
                    i32 = 0;
                }
                atc atcVar = this.d;
                int iEF = ctsVar.eF(atcVar.a()) * (bywVar.b - 1);
                int iC2 = dle.c(jD4);
                int iA3 = dle.a(jD4);
                int i35 = i34 + iEF;
                if (i35 >= iC2) {
                    iC2 = i35;
                }
                if (iC2 <= iA3) {
                    iA3 = iC2;
                }
                atcVar.c(ctsVar, iA3, iArr7, iArr2);
                int iD2 = dle.d(jD4);
                int iB3 = dle.b(jD4);
                aui auiVar = new aui(bywVar, 1);
                if (i32 < iD2) {
                    i32 = iD2;
                }
                if (i32 <= iB3) {
                    iB3 = i32;
                }
                return ctsVar.eK(iB3, iA3, afbf.a, auiVar);
            }
            int i36 = this.i.c;
        }
        return ctsVar.eK(0, 0, afbf.a, new ajc(20));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aup)) {
            return false;
        }
        aup aupVar = (aup) obj;
        boolean z = aupVar.b;
        return affa.f(this.c, aupVar.c) && affa.f(this.d, aupVar.d) && Float.compare(this.e, aupVar.e) == 0 && affa.f(this.a, aupVar.a) && Float.compare(this.f, aupVar.f) == 0 && this.g == aupVar.g && this.h == aupVar.h && affa.f(this.i, aupVar.i);
    }

    @Override // defpackage.avt
    public final /* synthetic */ int f(cuo cuoVar) {
        return cuoVar.eC();
    }

    @Override // defpackage.avt
    public final /* synthetic */ int g(cuo cuoVar) {
        return cuoVar.x();
    }

    @Override // defpackage.avt
    public final /* synthetic */ ctq h(final cuo[] cuoVarArr, cts ctsVar, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        final dlr dlrVar = dlr.a;
        return ctsVar.eK(i2, i3, afbf.a, new afec() { // from class: auo
            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                atz atzVar;
                cun cunVar = (cun) obj;
                int[] iArr3 = iArr2;
                int i7 = iArr3 != null ? iArr3[i4] : 0;
                int i8 = i5;
                for (int i9 = i8; i9 < i6; i9++) {
                    cuo cuoVar = cuoVarArr[i9];
                    cuoVar.getClass();
                    avu avuVarD = asl.D(cuoVar);
                    if (avuVarD == null || (atzVar = avuVarD.c) == null) {
                        atzVar = this.a;
                    }
                    cunVar.r(cuoVar, iArr[i9 - i8], atzVar.a(i3, cuoVar.eC(), dlrVar, cuoVar, i) + i7, BitmapDescriptorFactory.HUE_RED);
                }
                return afak.a;
            }
        });
    }

    public final int hashCode() {
        return ((((((((((((((this.c.hashCode() + 38161) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e)) * 31) + this.a.hashCode()) * 31) + Float.floatToIntBits(this.f)) * 31) + this.g) * 31) + this.h) * 31) + 1922;
    }

    @Override // defpackage.avt
    public final /* synthetic */ void i(int i, int[] iArr, int[] iArr2, cts ctsVar) {
        this.c.b(ctsVar, i, iArr, ctsVar.p(), iArr2);
    }

    @Override // defpackage.avt
    public final /* synthetic */ long j(int i, int i2, int i3, boolean z) {
        return avv.b(z, i, i2, i3);
    }

    public final String toString() {
        float f = this.f;
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.c + ", verticalArrangement=" + this.d + ", mainAxisSpacing=" + dlj.b(this.e) + ", crossAxisAlignment=" + this.a + ", crossAxisArrangementSpacing=" + dlj.b(f) + ", maxItemsInMainAxis=" + this.g + ", maxLines=" + this.h + ", overflow=" + this.i + ")";
    }
}
