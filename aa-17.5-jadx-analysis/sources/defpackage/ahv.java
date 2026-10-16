package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
final class ahv extends ahw {
    /* JADX WARN: Type inference failed for: r3v2, types: [aew, java.lang.Object] */
    @Override // defpackage.ahw
    public final bym a(agg aggVar, int i, bux buxVar, int i2) {
        Object objE;
        buxVar.v(119461169);
        brh brhVar = new brh(i, 1);
        int i3 = ((i2 << 3) & 896) | (i2 & 14);
        int i4 = (i3 & 14) | ((i3 << 3) & 7168);
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        bii biiVar = agm.a;
        if (aggVar.w()) {
            buxVar.v(1666827533);
            ((bvv) buxVar).Y(false);
            objE = aggVar.e();
        } else {
            buxVar.v(1666573488);
            boolean z = (i6 > 4 && buxVar.C(aggVar)) || (i4 & 6) == 4;
            bvv bvvVar = (bvv) buxVar;
            objE = bvvVar.S();
            if (z || objE == buw.a) {
                cec cecVarH = byx.h();
                afec afecVarI = cecVarH != null ? cecVarH.i() : null;
                cec cecVarI = byx.i(cecVarH);
                try {
                    Object objE2 = aggVar.e();
                    byx.l(cecVarH, cecVarI, afecVarI);
                    bvvVar.ad(objE2);
                    objE = objE2;
                } catch (Throwable th) {
                    byx.l(cecVarH, cecVarI, afecVarI);
                    throw th;
                }
            }
            bvvVar.Y(false);
        }
        boolean zBooleanValue = ((Boolean) objE).booleanValue();
        buxVar.v(-1210845840);
        float f = zBooleanValue ? i : BitmapDescriptorFactory.HUE_RED;
        bvv bvvVar2 = (bvv) buxVar;
        bvvVar2.Y(false);
        Float fValueOf = Float.valueOf(f);
        boolean z2 = (i6 > 4 && buxVar.C(aggVar)) || (i4 & 6) == 4;
        Object objS = bvvVar2.S();
        if (z2 || objS == buw.a) {
            ahp ahpVar = new ahp(aggVar, 2);
            lah lahVar = byj.a;
            bvk bvkVar = new bvk(ahpVar, null);
            bvvVar2.ad(bvkVar);
            objS = bvkVar;
        }
        boolean zBooleanValue2 = ((Boolean) ((bym) objS).a()).booleanValue();
        buxVar.v(-1210845840);
        float f2 = zBooleanValue2 ? i : BitmapDescriptorFactory.HUE_RED;
        bvvVar2.Y(false);
        Float fValueOf2 = Float.valueOf(f2);
        boolean z3 = (i6 > 4 && buxVar.C(aggVar)) || (i4 & 6) == 4;
        Object objS2 = bvvVar2.S();
        if (z3 || objS2 == buw.a) {
            ahq ahqVar = new ahq(aggVar, 2);
            lah lahVar2 = byj.a;
            bvk bvkVar2 = new bvk(ahqVar, null);
            bvvVar2.ad(bvkVar2);
            objS2 = bvkVar2;
        }
        final bym bymVarAf = afp.af(aggVar, fValueOf, fValueOf2, brhVar.invoke(((bym) objS2).a(), buxVar, 0), biiVar, buxVar, i5 | ((i4 << 6) & 458752));
        boolean zE = buxVar.E(this) | buxVar.C(bymVarAf);
        Object objS3 = bvvVar2.S();
        if (zE || objS3 == buw.a) {
            objS3 = new afdr() { // from class: ahu
                @Override // defpackage.afdr
                public final Object invoke() {
                    Object objPrevious;
                    List list;
                    float f3;
                    cob cnqVar;
                    cob cniVar;
                    float fFloatValue = ((Number) bymVarAf.a()).floatValue();
                    List list2 = this.a.a;
                    ListIterator listIterator = list2.listIterator(list2.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                        if (((aig) objPrevious).a <= fFloatValue) {
                            break;
                        }
                    }
                    aig aigVar = (aig) objPrevious;
                    if (aigVar == null) {
                        aigVar = (aig) woy.bF(list2);
                    }
                    float f4 = (fFloatValue - aigVar.a) / aigVar.b;
                    int i7 = 0;
                    float f5 = 1.0f;
                    if (aigVar.c != 0) {
                        int i8 = 0;
                        while (f4 > 1.0f) {
                            f4 -= 1.0f;
                            i8++;
                        }
                        if (aigVar.d == 2 && i8 % 2 != 0) {
                            f4 = 1.0f - f4;
                        }
                    }
                    Object obj = aigVar.e;
                    obj.getClass();
                    List list3 = ((aid) obj).b;
                    Iterator it = list3.iterator();
                    int i9 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i9 = -1;
                            break;
                        }
                        if (((ahs) it.next()).a >= f4) {
                            break;
                        }
                        i9++;
                    }
                    int iE = afpt.e(i9 - 1, 0);
                    int i10 = iE + 1;
                    aes aesVar = ((ahs) list3.get(i10)).c;
                    float f6 = (f4 - ((ahs) list3.get(iE)).a) / (((ahs) list3.get(i10)).a - ((ahs) list3.get(iE)).a);
                    if (f6 < BitmapDescriptorFactory.HUE_RED) {
                        f6 = 0.0f;
                    }
                    if (f6 > 1.0f) {
                        f6 = 1.0f;
                    }
                    float fA = aesVar.a(f6);
                    List list4 = (List) ((ahs) list3.get(iE)).b;
                    List list5 = (List) ((ahs) list3.get(i10)).b;
                    int iMin = Math.min(list4.size(), list5.size());
                    ArrayList arrayList = new ArrayList(iMin);
                    while (i7 < iMin) {
                        Object obj2 = list4.get(i7);
                        cob cobVar = (cob) list5.get(i7);
                        cob cobVar2 = (cob) obj2;
                        if (cobVar2 instanceof cnv) {
                            if (!(cobVar instanceof cnv)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            float f7 = f5 - fA;
                            cnv cnvVar = (cnv) cobVar2;
                            cnv cnvVar2 = (cnv) cobVar;
                            cnqVar = new cnv((cnvVar.a * f7) + (cnvVar2.a * fA), (f7 * cnvVar.b) + (cnvVar2.b * fA));
                        } else if (cobVar2 instanceof cnn) {
                            if (!(cobVar instanceof cnn)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            float f8 = f5 - fA;
                            cnn cnnVar = (cnn) cobVar2;
                            cnn cnnVar2 = (cnn) cobVar;
                            cnqVar = new cnn((cnnVar.a * f8) + (cnnVar2.a * fA), (f8 * cnnVar.b) + (cnnVar2.b * fA));
                        } else if (cobVar2 instanceof cnu) {
                            if (!(cobVar instanceof cnu)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            float f9 = f5 - fA;
                            cnu cnuVar = (cnu) cobVar2;
                            cnu cnuVar2 = (cnu) cobVar;
                            cnqVar = new cnu((cnuVar.a * f9) + (cnuVar2.a * fA), (f9 * cnuVar.b) + (cnuVar2.b * fA));
                        } else if (cobVar2 instanceof cnm) {
                            if (!(cobVar instanceof cnm)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            float f10 = f5 - fA;
                            cnm cnmVar = (cnm) cobVar2;
                            cnm cnmVar2 = (cnm) cobVar;
                            cnqVar = new cnm((cnmVar.a * f10) + (cnmVar2.a * fA), (f10 * cnmVar.b) + (cnmVar2.b * fA));
                        } else if (cobVar2 instanceof cnt) {
                            if (!(cobVar instanceof cnt)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            cnqVar = new cnt(((f5 - fA) * ((cnt) cobVar2).a) + (((cnt) cobVar).a * fA));
                        } else if (cobVar2 instanceof cnl) {
                            if (!(cobVar instanceof cnl)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            cnqVar = new cnl(((f5 - fA) * ((cnl) cobVar2).a) + (((cnl) cobVar).a * fA));
                        } else if (cobVar2 instanceof cnz) {
                            if (!(cobVar instanceof cnz)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            cnqVar = new cnz(((f5 - fA) * ((cnz) cobVar2).a) + (((cnz) cobVar).a * fA));
                        } else if (!(cobVar2 instanceof coa)) {
                            if (!(cobVar2 instanceof cns)) {
                                list = list5;
                                f3 = f5;
                                if (cobVar2 instanceof cnk) {
                                    if (!(cobVar instanceof cnk)) {
                                        throw new IllegalArgumentException("start and stop path nodes have different types");
                                    }
                                    float f11 = f3 - fA;
                                    cnk cnkVar = (cnk) cobVar2;
                                    cnk cnkVar2 = (cnk) cobVar;
                                    cniVar = new cnk((cnkVar.a * f11) + (cnkVar2.a * fA), (cnkVar.b * f11) + (cnkVar2.b * fA), (cnkVar.c * f11) + (cnkVar2.c * fA), (cnkVar.d * f11) + (cnkVar2.d * fA), (cnkVar.e * f11) + (cnkVar2.e * fA), (f11 * cnkVar.f) + (cnkVar2.f * fA));
                                } else if (cobVar2 instanceof cnx) {
                                    if (!(cobVar instanceof cnx)) {
                                        throw new IllegalArgumentException("start and stop path nodes have different types");
                                    }
                                    float f12 = f3 - fA;
                                    cnx cnxVar = (cnx) cobVar2;
                                    cnx cnxVar2 = (cnx) cobVar;
                                    cnqVar = new cnx((cnxVar.a * f12) + (cnxVar2.a * fA), (cnxVar.b * f12) + (cnxVar2.b * fA), (cnxVar.c * f12) + (cnxVar2.c * fA), (f12 * cnxVar.d) + (cnxVar2.d * fA));
                                } else if (cobVar2 instanceof cnp) {
                                    if (!(cobVar instanceof cnp)) {
                                        throw new IllegalArgumentException("start and stop path nodes have different types");
                                    }
                                    float f13 = f3 - fA;
                                    cnp cnpVar = (cnp) cobVar2;
                                    cnp cnpVar2 = (cnp) cobVar;
                                    cnqVar = new cnp((cnpVar.a * f13) + (cnpVar2.a * fA), (cnpVar.b * f13) + (cnpVar2.b * fA), (cnpVar.c * f13) + (cnpVar2.c * fA), (f13 * cnpVar.d) + (cnpVar2.d * fA));
                                } else if (cobVar2 instanceof cnw) {
                                    if (!(cobVar instanceof cnw)) {
                                        throw new IllegalArgumentException("start and stop path nodes have different types");
                                    }
                                    float f14 = f3 - fA;
                                    cnw cnwVar = (cnw) cobVar2;
                                    cnw cnwVar2 = (cnw) cobVar;
                                    cnqVar = new cnw((cnwVar.a * f14) + (cnwVar2.a * fA), (cnwVar.b * f14) + (cnwVar2.b * fA), (cnwVar.c * f14) + (cnwVar2.c * fA), (f14 * cnwVar.d) + (cnwVar2.d * fA));
                                } else if (cobVar2 instanceof cno) {
                                    if (!(cobVar instanceof cno)) {
                                        throw new IllegalArgumentException("start and stop path nodes have different types");
                                    }
                                    float f15 = f3 - fA;
                                    cno cnoVar = (cno) cobVar2;
                                    cno cnoVar2 = (cno) cobVar;
                                    cnqVar = new cno((cnoVar.a * f15) + (cnoVar2.a * fA), (cnoVar.b * f15) + (cnoVar2.b * fA), (cnoVar.c * f15) + (cnoVar2.c * fA), (f15 * cnoVar.d) + (cnoVar2.d * fA));
                                } else if (cobVar2 instanceof cny) {
                                    if (!(cobVar instanceof cny)) {
                                        throw new IllegalArgumentException("start and stop path nodes have different types");
                                    }
                                    float f16 = f3 - fA;
                                    cny cnyVar = (cny) cobVar2;
                                    cny cnyVar2 = (cny) cobVar;
                                    cnqVar = new cny((cnyVar.a * f16) + (cnyVar2.a * fA), (f16 * cnyVar.b) + (cnyVar2.b * fA));
                                } else if (cobVar2 instanceof cnq) {
                                    if (!(cobVar instanceof cnq)) {
                                        throw new IllegalArgumentException("start and stop path nodes have different types");
                                    }
                                    float f17 = f3 - fA;
                                    cnq cnqVar2 = (cnq) cobVar2;
                                    cnq cnqVar3 = (cnq) cobVar;
                                    cnqVar = new cnq((cnqVar2.a * f17) + (cnqVar3.a * fA), (f17 * cnqVar2.b) + (cnqVar3.b * fA));
                                } else if (cobVar2 instanceof cnr) {
                                    if (!(cobVar instanceof cnr)) {
                                        throw new IllegalArgumentException("start and stop path nodes have different types");
                                    }
                                    float f18 = f3 - fA;
                                    cnr cnrVar = (cnr) cobVar2;
                                    cnr cnrVar2 = (cnr) cobVar;
                                    float f19 = cnrVar.a * f18;
                                    float f20 = cnrVar2.a * fA;
                                    float f21 = cnrVar.b * f18;
                                    float f22 = cnrVar2.b * fA;
                                    cniVar = new cnr(f19 + f20, f21 + f22, (cnrVar.c * f18) + (cnrVar2.c * fA), cnrVar.d, cnrVar.e, (cnrVar.f * f18) + (cnrVar2.f * fA), (f18 * cnrVar.g) + (cnrVar2.g * fA));
                                } else if (!(cobVar2 instanceof cni)) {
                                    cnqVar = cnj.a;
                                    if (!affa.f(cobVar2, cnqVar)) {
                                        throw new aezs();
                                    }
                                } else {
                                    if (!(cobVar instanceof cni)) {
                                        throw new IllegalArgumentException("start and stop path nodes have different types");
                                    }
                                    float f23 = f3 - fA;
                                    cni cniVar2 = (cni) cobVar2;
                                    cni cniVar3 = (cni) cobVar;
                                    float f24 = cniVar2.a * f23;
                                    float f25 = cniVar3.a * fA;
                                    float f26 = cniVar2.b * f23;
                                    float f27 = cniVar3.b * fA;
                                    cniVar = new cni(f24 + f25, f26 + f27, (cniVar2.c * f23) + (cniVar3.c * fA), cniVar2.d, cniVar2.e, (cniVar2.f * f23) + (cniVar3.f * fA), (f23 * cniVar2.g) + (cniVar3.g * fA));
                                }
                                cnqVar = cniVar;
                            } else {
                                if (!(cobVar instanceof cns)) {
                                    throw new IllegalArgumentException("start and stop path nodes have different types");
                                }
                                float f28 = f5 - fA;
                                cns cnsVar = (cns) cobVar2;
                                cns cnsVar2 = (cns) cobVar;
                                f3 = f5;
                                list = list5;
                                cnqVar = new cns((cnsVar.a * f28) + (cnsVar2.a * fA), (cnsVar.b * f28) + (cnsVar2.b * fA), (cnsVar.c * f28) + (cnsVar2.c * fA), (cnsVar.d * f28) + (cnsVar2.d * fA), (cnsVar.e * f28) + (cnsVar2.e * fA), (f28 * cnsVar.f) + (cnsVar2.f * fA));
                            }
                            arrayList.add(cnqVar);
                            i7++;
                            f5 = f3;
                            list5 = list;
                        } else {
                            if (!(cobVar instanceof coa)) {
                                throw new IllegalArgumentException("start and stop path nodes have different types");
                            }
                            cnqVar = new coa(((f5 - fA) * ((coa) cobVar2).a) + (((coa) cobVar).a * fA));
                        }
                        list = list5;
                        f3 = f5;
                        arrayList.add(cnqVar);
                        i7++;
                        f5 = f3;
                        list5 = list;
                    }
                    return arrayList;
                }
            };
            bvvVar2.ad(objS3);
        }
        lah lahVar3 = byj.a;
        bvk bvkVar3 = new bvk((afdr) objS3, null);
        bvvVar2.Y(false);
        return bvkVar3;
    }
}
