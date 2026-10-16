package defpackage;

import android.view.MotionEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class tl {
    public static List a(List list) {
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public static List b(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.cfy r19, defpackage.afeg r20, defpackage.afeg r21, defpackage.afeg r22, defpackage.afeg r23, int r24, long r25, long r27, defpackage.awo r29, final defpackage.afeh r30, defpackage.bux r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl.c(cfy, afeg, afeg, afeg, afeg, int, long, long, awo, afeh, bux, int, int):void");
    }

    public static final void d(int i, final afeg afegVar, afeh afehVar, final afeg afegVar2, final afeg afegVar3, awo awoVar, afeg afegVar4, bux buxVar, int i2) {
        final int i3;
        int i4;
        afeh afehVar2;
        awo awoVar2;
        afeg afegVar5;
        Object obj;
        int i5;
        int i6 = i2 & 6;
        bux buxVarC = buxVar.c(-280287501);
        if (i6 == 0) {
            i3 = i;
            i4 = (true != buxVarC.A(i3) ? 2 : 4) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            afehVar2 = afehVar;
            i4 |= true != buxVarC.E(afehVar2) ? 128 : 256;
        } else {
            afehVar2 = afehVar;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != buxVarC.E(afegVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != buxVarC.E(afegVar3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            awoVar2 = awoVar;
            i4 |= true != buxVarC.C(awoVar2) ? 65536 : 131072;
        } else {
            awoVar2 = awoVar;
        }
        if ((1572864 & i2) == 0) {
            afegVar5 = afegVar4;
            i4 |= true != buxVarC.E(afegVar5) ? 524288 : 1048576;
        } else {
            afegVar5 = afegVar4;
        }
        if (buxVarC.I((599187 & i4) != 599186, i4 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj2 = buw.a;
            if (objS == obj2) {
                objS = new bpo();
                bvvVar.ad(objS);
            }
            boolean z = (i4 & 458752) == 131072;
            boolean z2 = (i4 & 112) == 32;
            Object obj3 = objS;
            boolean z3 = (i4 & 7168) == 2048;
            boolean z4 = (57344 & i4) == 16384;
            boolean z5 = (i4 & 14) == 4;
            boolean z6 = (3670016 & i4) == 1048576;
            final bpo bpoVar = (bpo) obj3;
            boolean z7 = (i4 & 896) == 256;
            Object objS2 = bvvVar.S();
            if (((z6 | z2 | z | z3 | z4 | z5) || z7) || objS2 == obj2) {
                final afeh afehVar3 = afehVar2;
                final awo awoVar3 = awoVar2;
                i5 = 0;
                final afeg afegVar6 = afegVar5;
                obj = new afeg() { // from class: bpm
                    @Override // defpackage.afeg
                    public final Object invoke(Object obj4, Object obj5) {
                        Object obj6;
                        Object obj7;
                        Object obj8;
                        rt rtVar;
                        Object obj9;
                        final Integer numValueOf;
                        float fA;
                        final Integer num;
                        int iEF;
                        int iA;
                        Object obj10;
                        Object obj11;
                        int iEF2;
                        int iEF3;
                        final cvd cvdVar = (cvd) obj4;
                        long j = ((dle) obj5).a;
                        int iB = dle.b(j);
                        int iA2 = dle.a(j);
                        long jM = dle.m(j, 0, 0, 0, 0, 10);
                        dlr dlrVarP = cvdVar.p();
                        final awo awoVar4 = awoVar3;
                        int iB2 = awoVar4.b(cvdVar, dlrVarP);
                        int iC = awoVar4.c(cvdVar, cvdVar.p());
                        int iA3 = awoVar4.a(cvdVar);
                        List listR = cvdVar.r(bpp.a, afegVar);
                        ArrayList arrayList = new ArrayList(listR.size());
                        int size = listR.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            arrayList.add(((cto) listR.get(i7)).v(jM));
                        }
                        if (arrayList.isEmpty()) {
                            obj6 = null;
                        } else {
                            obj6 = arrayList.get(0);
                            int i8 = ((cuo) obj6).b;
                            int iBh = woy.bh(arrayList);
                            if (iBh > 0) {
                                int i9 = 1;
                                while (true) {
                                    Object obj12 = arrayList.get(i9);
                                    int i10 = ((cuo) obj12).b;
                                    int i11 = i8 < i10 ? i10 : i8;
                                    if (i8 < i10) {
                                        obj6 = obj12;
                                    }
                                    if (i9 == iBh) {
                                        break;
                                    }
                                    i9++;
                                    i8 = i11;
                                }
                            }
                        }
                        cuo cuoVar = (cuo) obj6;
                        int i12 = cuoVar != null ? cuoVar.b : 0;
                        List listR2 = cvdVar.r(bpp.c, afegVar2);
                        final ArrayList arrayList2 = new ArrayList(listR2.size());
                        int size2 = listR2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            int i14 = iC;
                            arrayList2.add(((cto) listR2.get(i13)).v(dlf.h(jM, (-iB2) - i14, -iA3)));
                            i13++;
                            iB = iB;
                            arrayList = arrayList;
                            iC = i14;
                            iA2 = iA2;
                            listR2 = listR2;
                        }
                        final int i15 = iB;
                        int i16 = iC;
                        final int i17 = iA2;
                        final ArrayList arrayList3 = arrayList;
                        if (arrayList2.isEmpty()) {
                            obj7 = null;
                        } else {
                            obj7 = arrayList2.get(0);
                            int i18 = ((cuo) obj7).b;
                            int iBh2 = woy.bh(arrayList2);
                            if (iBh2 > 0) {
                                int i19 = 1;
                                while (true) {
                                    Object obj13 = arrayList2.get(i19);
                                    int i20 = ((cuo) obj13).b;
                                    int i21 = i18 < i20 ? i20 : i18;
                                    if (i18 < i20) {
                                        obj7 = obj13;
                                    }
                                    if (i19 == iBh2) {
                                        break;
                                    }
                                    i19++;
                                    i18 = i21;
                                }
                            }
                        }
                        cuo cuoVar2 = (cuo) obj7;
                        int i22 = cuoVar2 != null ? cuoVar2.b : 0;
                        if (arrayList2.isEmpty()) {
                            obj8 = null;
                        } else {
                            obj8 = arrayList2.get(0);
                            int i23 = ((cuo) obj8).a;
                            int iBh3 = woy.bh(arrayList2);
                            if (iBh3 > 0) {
                                int i24 = 1;
                                while (true) {
                                    Object obj14 = arrayList2.get(i24);
                                    int i25 = ((cuo) obj14).a;
                                    int i26 = i23 < i25 ? i25 : i23;
                                    if (i23 < i25) {
                                        obj8 = obj14;
                                    }
                                    if (i24 == iBh3) {
                                        break;
                                    }
                                    i24++;
                                    i23 = i26;
                                }
                            }
                        }
                        cuo cuoVar3 = (cuo) obj8;
                        int i27 = cuoVar3 != null ? cuoVar3.a : 0;
                        List listR3 = cvdVar.r(bpp.d, afegVar3);
                        final ArrayList arrayList4 = new ArrayList(listR3.size());
                        int size3 = listR3.size();
                        int i28 = 0;
                        while (i28 < size3) {
                            int i29 = i22;
                            int i30 = iB2;
                            int i31 = i27;
                            int i32 = iA3;
                            cuo cuoVarV = ((cto) listR3.get(i28)).v(dlf.h(jM, (-iB2) - i16, -iA3));
                            if (cuoVarV.b == 0 || cuoVarV.a == 0) {
                                cuoVarV = null;
                            }
                            if (cuoVarV != null) {
                                arrayList4.add(cuoVarV);
                            }
                            i28++;
                            i22 = i29;
                            iA3 = i32;
                            iB2 = i30;
                            i27 = i31;
                        }
                        int i33 = i22;
                        int i34 = iB2;
                        final int i35 = i27;
                        int i36 = i3;
                        if (arrayList4.isEmpty()) {
                            rtVar = null;
                        } else {
                            if (arrayList4.isEmpty()) {
                                obj10 = null;
                            } else {
                                obj10 = arrayList4.get(0);
                                int i37 = ((cuo) obj10).a;
                                int iBh4 = woy.bh(arrayList4);
                                if (iBh4 > 0) {
                                    int i38 = 1;
                                    while (true) {
                                        Object obj15 = arrayList4.get(i38);
                                        int i39 = ((cuo) obj15).a;
                                        int i40 = i37 < i39 ? i39 : i37;
                                        if (i37 < i39) {
                                            obj10 = obj15;
                                        }
                                        if (i38 == iBh4) {
                                            break;
                                        }
                                        i38++;
                                        i37 = i40;
                                    }
                                }
                            }
                            obj10.getClass();
                            int i41 = ((cuo) obj10).a;
                            if (arrayList4.isEmpty()) {
                                obj11 = null;
                            } else {
                                obj11 = arrayList4.get(0);
                                int i42 = ((cuo) obj11).b;
                                int iBh5 = woy.bh(arrayList4);
                                if (iBh5 > 0) {
                                    int i43 = 1;
                                    while (true) {
                                        Object obj16 = arrayList4.get(i43);
                                        int i44 = ((cuo) obj16).b;
                                        int i45 = i42 < i44 ? i44 : i42;
                                        if (i42 < i44) {
                                            obj11 = obj16;
                                        }
                                        if (i43 == iBh5) {
                                            break;
                                        }
                                        i43++;
                                        i42 = i45;
                                    }
                                }
                            }
                            obj11.getClass();
                            int i46 = ((cuo) obj11).b;
                            if (!a.Y(i36, 0)) {
                                if (!a.Y(i36, 2) && !a.Y(i36, 3)) {
                                    iEF3 = (((i15 - i41) + i34) - i16) / 2;
                                } else if (cvdVar.p() == dlr.a) {
                                    iEF3 = ((i15 - cvdVar.eF(16.0f)) - i41) - i16;
                                } else {
                                    iEF2 = cvdVar.eF(16.0f);
                                    iEF3 = iEF2 + i34;
                                }
                                rtVar = new rt(iEF3, i46);
                            } else if (cvdVar.p() == dlr.a) {
                                iEF2 = cvdVar.eF(16.0f);
                                iEF3 = iEF2 + i34;
                                rtVar = new rt(iEF3, i46);
                            } else {
                                iEF3 = ((i15 - cvdVar.eF(16.0f)) - i41) - i16;
                                rtVar = new rt(iEF3, i46);
                            }
                        }
                        List listR4 = cvdVar.r(bpp.e, afegVar6);
                        final ArrayList arrayList5 = new ArrayList(listR4.size());
                        int size4 = listR4.size();
                        for (int i47 = 0; i47 < size4; i47++) {
                            arrayList5.add(((cto) listR4.get(i47)).v(jM));
                        }
                        if (arrayList5.isEmpty()) {
                            obj9 = null;
                        } else {
                            obj9 = arrayList5.get(0);
                            int i48 = ((cuo) obj9).b;
                            int iBh6 = woy.bh(arrayList5);
                            if (iBh6 > 0) {
                                int i49 = 1;
                                while (true) {
                                    Object obj17 = arrayList5.get(i49);
                                    int i50 = ((cuo) obj17).b;
                                    int i51 = i48 < i50 ? i50 : i48;
                                    if (i48 < i50) {
                                        obj9 = obj17;
                                    }
                                    if (i49 == iBh6) {
                                        break;
                                    }
                                    i49++;
                                    i48 = i51;
                                }
                            }
                        }
                        cuo cuoVar4 = (cuo) obj9;
                        Integer numValueOf2 = cuoVar4 != null ? Integer.valueOf(cuoVar4.b) : null;
                        if (rtVar != null) {
                            if (numValueOf2 == null || a.Y(i36, 3)) {
                                iEF = rtVar.b + cvdVar.eF(16.0f);
                                iA = awoVar4.a(cvdVar);
                            } else {
                                iEF = numValueOf2.intValue() + rtVar.b;
                                iA = cvdVar.eF(16.0f);
                            }
                            numValueOf = Integer.valueOf(iEF + iA);
                        } else {
                            numValueOf = null;
                        }
                        int iIntValue = i33 != 0 ? i33 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : awoVar4.a(cvdVar)) : 0;
                        aux auxVar = new aux(awoVar4, cvdVar);
                        float fD = arrayList3.isEmpty() ? auxVar.d() : cvdVar.ey(i12);
                        if (numValueOf2 != null) {
                            num = numValueOf2;
                            fA = cvdVar.ey(numValueOf2.intValue());
                        } else {
                            fA = auxVar.a();
                            num = null;
                        }
                        afeh afehVar4 = afehVar3;
                        bpo bpoVar2 = bpoVar;
                        final int i52 = iIntValue;
                        final rt rtVar2 = rtVar;
                        bpoVar2.a.b(new avr(asl.F(auxVar, cvdVar.p()), fD, asl.E(auxVar, cvdVar.p()), fA));
                        List listR5 = cvdVar.r(bpp.b, new cct(-278021671, true, new bmc(afehVar4, bpoVar2, 4, null)));
                        final ArrayList arrayList6 = new ArrayList(listR5.size());
                        int size5 = listR5.size();
                        for (int i53 = 0; i53 < size5; i53++) {
                            arrayList6.add(((cto) listR5.get(i53)).v(jM));
                        }
                        return cvdVar.eK(i15, i17, afbf.a, new afec() { // from class: bpl
                            @Override // defpackage.afec
                            public final Object invoke(Object obj18) {
                                int i54;
                                List list = arrayList6;
                                cun cunVar = (cun) obj18;
                                int size6 = list.size();
                                for (int i55 = 0; i55 < size6; i55++) {
                                    cunVar.r((cuo) list.get(i55), 0, 0, BitmapDescriptorFactory.HUE_RED);
                                }
                                List list2 = arrayList3;
                                int size7 = list2.size();
                                for (int i56 = 0; i56 < size7; i56++) {
                                    cunVar.r((cuo) list2.get(i56), 0, 0, BitmapDescriptorFactory.HUE_RED);
                                }
                                List list3 = arrayList2;
                                int size8 = list3.size();
                                int i57 = 0;
                                while (true) {
                                    i54 = i17;
                                    if (i57 >= size8) {
                                        break;
                                    }
                                    int i58 = i52;
                                    cvd cvdVar2 = cvdVar;
                                    awo awoVar5 = awoVar4;
                                    cunVar.r((cuo) list3.get(i57), (((i15 - i35) + awoVar5.b(cvdVar2, cvdVar2.p())) - awoVar5.c(cvdVar2, cvdVar2.p())) / 2, i54 - i58, BitmapDescriptorFactory.HUE_RED);
                                    i57++;
                                }
                                List list4 = arrayList5;
                                int size9 = list4.size();
                                for (int i59 = 0; i59 < size9; i59++) {
                                    Integer num2 = num;
                                    cunVar.r((cuo) list4.get(i59), 0, i54 - (num2 != null ? num2.intValue() : 0), BitmapDescriptorFactory.HUE_RED);
                                }
                                rt rtVar3 = rtVar2;
                                if (rtVar3 != null) {
                                    List list5 = arrayList4;
                                    int size10 = list5.size();
                                    for (int i60 = 0; i60 < size10; i60++) {
                                        Integer num3 = numValueOf;
                                        cuo cuoVar5 = (cuo) list5.get(i60);
                                        num3.getClass();
                                        cunVar.r(cuoVar5, rtVar3.a, i54 - num3.intValue(), BitmapDescriptorFactory.HUE_RED);
                                    }
                                }
                                return afak.a;
                            }
                        });
                    }
                };
                bvvVar.ad(obj);
            } else {
                obj = objS2;
                i5 = 0;
            }
            cuy.a(null, (afeg) obj, buxVarC, i5, 1);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bpn(i, afegVar, afehVar, afegVar2, afegVar3, awoVar, afegVar4, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Type inference failed for: r15v2, types: [afec, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.sx r24, defpackage.afeh r25, defpackage.cfy r26, boolean r27, boolean r28, boolean r29, defpackage.afec r30, defpackage.afeh r31, defpackage.bux r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl.e(sx, afeh, cfy, boolean, boolean, boolean, afec, afeh, bux, int, int):void");
    }

    public static final sx f(bux buxVar) {
        bqr bqrVar = bqr.c;
        buxVar.v(-485754360);
        dlg dlgVar = (dlg) buxVar.f(dbc.d);
        boolean zC = buxVar.C(dlgVar);
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            objG = new bml(dlgVar, 10);
            buxVar.x(objG);
        }
        afec afecVar = (afec) objG;
        buxVar.o();
        Object[] objArr = new Object[0];
        cdt cdtVar = new cdt(new bni(6), new bml(afecVar, 11));
        boolean zA = buxVar.A(bqrVar.ordinal()) | buxVar.C(afecVar);
        Object objG2 = buxVar.g();
        if (zA || objG2 == buw.a) {
            objG2 = new bsh(bqrVar, afecVar, 1, null);
            buxVar.x(objG2);
        }
        return (sx) byx.r(objArr, cdtVar, (afdr) objG2, buxVar, 0);
    }

    public static final float g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void h(cql cqlVar, long j, afec afecVar, boolean z) {
        MotionEvent motionEventA = cqlVar.a();
        if (motionEventA == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        afecVar.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventA.setAction(action);
    }

    public static final cfy i(cfy cfyVar, cqr cqrVar) {
        return cfyVar.a(new cqo(cqrVar));
    }

    public static final boolean j(cqu cquVar) {
        return (cquVar.c() || cquVar.h || !cquVar.d) ? false : true;
    }

    public static final boolean k(cqu cquVar) {
        return !cquVar.h && cquVar.d;
    }

    public static final boolean l(cqu cquVar) {
        return (cquVar.c() || !cquVar.h || cquVar.d) ? false : true;
    }

    public static final boolean m(cqu cquVar) {
        return cquVar.h && !cquVar.d;
    }

    public static final boolean n(cqu cquVar, long j, long j2) {
        long j3 = cquVar.c;
        int i = cquVar.i;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float f = i == 1 ? 1 : 0;
        float f2 = fIntBitsToFloat3 * f;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > ((float) ((int) (j >> 32))) + f2) | (fIntBitsToFloat < (-f2)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((float) ((int) (j & 4294967295L))) + fIntBitsToFloat4);
    }

    public static final boolean o(cqu cquVar) {
        return aclh.y(cquVar.c, cquVar.g) != 0;
    }

    public static final long p(cqu cquVar) {
        long jY = aclh.y(cquVar.c, cquVar.g);
        if (cquVar.c()) {
            return 0L;
        }
        return jY;
    }
}
