package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class apn implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ apn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [apr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [azj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [azu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [bfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [cym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ctp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [avp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v50, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v59, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [azh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v14 */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        bux buxVar;
        dfv dfvVar;
        int i = 12;
        blg blgVar = 0;
        blgVar = null;
        blg blgVar2 = null;
        int i2 = 3;
        switch (this.c) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                affs affsVar = (affs) this.a;
                float f = affsVar.a;
                affsVar.a = f + this.b.a(fFloatValue - f);
                break;
            case 1:
                float fFloatValue2 = ((Float) obj).floatValue();
                ((amu) this.b).a(fFloatValue2, ((Float) obj2).floatValue());
                ((affs) this.a).a = fFloatValue2;
                break;
            case 2:
                cvd cvdVar = (cvd) obj;
                long j = ((dle) obj2).a;
                break;
            case 3:
                bux buxVar2 = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar2.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    this.a.invoke(this.b, buxVar2, 0);
                } else {
                    buxVar2.s();
                }
                break;
            case 4:
                bux buxVar3 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (buxVar3.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    Object obj3 = this.b;
                    nfh nfhVar = (nfh) this.a;
                    ?? Invoke = nfhVar.c.invoke();
                    azf azfVar = (azf) obj3;
                    int iA = azfVar.c;
                    if ((iA >= Invoke.b() || !affa.f(Invoke.d(iA), azfVar.a)) && (iA = Invoke.a(azfVar.a)) != -1) {
                        azfVar.c = iA;
                    }
                    if (iA != -1) {
                        buxVar3.v(-1664741271);
                        buxVar = buxVar3;
                        awx.p(Invoke, nfhVar.b, iA, azfVar.a, buxVar, 0);
                        buxVar.o();
                    } else {
                        buxVar = buxVar3;
                        buxVar.v(-1664505826);
                        buxVar.o();
                    }
                    Object obj4 = azfVar.a;
                    boolean zE = buxVar.E(obj3);
                    Object objG = buxVar.g();
                    if (zE || objG == buw.a) {
                        objG = new aui(obj3, 15);
                        buxVar.x(objG);
                    }
                    bvq.c(obj4, (afec) objG, buxVar);
                } else {
                    buxVar3.s();
                }
                break;
            case 5:
                break;
            case 6:
                bux buxVar4 = (bux) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (buxVar4.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    this.a.invoke(this.b, buxVar4, 0);
                } else {
                    buxVar4.s();
                }
                break;
            case 7:
                float fFloatValue3 = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                bbu bbuVar = bbv.a;
                affs affsVar2 = (affs) this.a;
                affsVar2.a += this.b.a(fFloatValue3 - affsVar2.a);
                break;
            case 8:
                bux buxVar5 = (bux) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (buxVar5.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    Object obj5 = this.a;
                    boolean zC = buxVar5.C(obj5);
                    Object objG2 = buxVar5.g();
                    if (zC || objG2 == buw.a) {
                        bgl bglVar = new bgl(obj5, 0);
                        lah lahVar = byj.a;
                        objG2 = new bvk(bglVar, null);
                        buxVar5.x(objG2);
                    }
                    bgm.a(this.b, (bfu) ((bym) objG2).a(), buxVar5, 0);
                } else {
                    buxVar5.s();
                }
                break;
            case 9:
                bii biiVar = (bii) obj;
                Context context = (Context) obj2;
                Object obj6 = this.b;
                blr blrVar = (blr) obj6;
                boolean zU = blrVar.u();
                deu deuVarE = blrVar.e();
                String str = deuVarE != null ? deuVarE.b : null;
                dfv dfvVar2 = blrVar.o;
                if (dfvVar2 != null) {
                    djn djnVar = blrVar.b;
                    long j2 = dfvVar2.b;
                    dfvVar = new dfv(czz.t(djnVar.a(dfv.e(j2)), djnVar.a(dfv.a(j2))));
                } else {
                    dfvVar = null;
                }
                Object obj7 = this.a;
                bke bkeVar = blrVar.t;
                acg acgVar = new acg(obj6, obj7, (Object) context, 10, (byte[]) null);
                if (str == null || dfvVar == null || bkeVar == null) {
                    String str2 = str;
                    acgVar.invoke(biiVar);
                    if (str2 != null && dfvVar != null) {
                        asl.W(biiVar, context, zU, str2, dfvVar.b);
                    }
                } else {
                    long j3 = dfvVar.b;
                    ajdz ajdzVar = bkeVar.e;
                    if (ajdzVar.c()) {
                        blg blgVarC = bkeVar.c();
                        if (blgVarC != null && bkg.a(blgVarC, str, j3)) {
                            blgVar2 = blgVarC;
                        }
                        ajdzVar.d();
                        blgVar = blgVar2;
                    }
                    if (blgVar == 0) {
                        acgVar.invoke(biiVar);
                    } else {
                        TextClassification textClassification = blgVar.c;
                        if (!textClassification.getActions().isEmpty()) {
                            asl.V(biiVar, bkeVar.d, textClassification, 0, (Drawable) blgVar.d.get(0));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            asl.V(biiVar, bkeVar.d, textClassification, -1, textClassification.getIcon());
                        }
                        acgVar.invoke(biiVar);
                        List actions = textClassification.getActions();
                        int size = actions.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            a$$ExternalSyntheticApiModelOutline0.m(actions.get(i3));
                            if (i3 > 0) {
                                asl.V(biiVar, bkeVar.d, textClassification, i3, (Drawable) blgVar.d.get(i3));
                            }
                        }
                    }
                    asl.W(biiVar, context, zU, str, j3);
                }
                break;
            case 10:
                bux buxVar6 = (bux) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (buxVar6.I((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    ?? r1 = this.b;
                    avp avpVar = bmo.a;
                    cfy cfyVarA = new awj(bmo.b, bmo.c()).a(new avq(r1));
                    ctp ctpVarA = avv.a(atd.e, cfl.n, buxVar6, 54);
                    long jB = buxVar6.b();
                    long j4 = jB ^ (jB >>> 32);
                    ccx ccxVarN = buxVar6.N();
                    cfy cfyVarJ = bzi.j(buxVar6, cfyVarA);
                    afdr afdrVar = cwb.a;
                    buxVar6.M();
                    buxVar6.w();
                    if (buxVar6.G()) {
                        buxVar6.j(afdrVar);
                    } else {
                        buxVar6.y();
                    }
                    ?? r0 = this.a;
                    byq.c(buxVar6, ctpVarA, cwb.e);
                    byq.c(buxVar6, ccxVarN, cwb.d);
                    byq.c(buxVar6, Integer.valueOf((int) j4), cwb.f);
                    buxVar6.i(afak.a, new alx(cwb.g, 16));
                    byq.c(buxVar6, cfyVarJ, cwb.c);
                    r0.invoke(avy.a, buxVar6, 6);
                    buxVar6.n();
                } else {
                    buxVar6.s();
                }
                break;
            case 11:
                bux buxVar7 = (bux) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (buxVar7.I((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    czz.as(bxc.i(-241536773, true, new apn(this.b, this.a, i, blgVar), buxVar7), buxVar7, 6);
                } else {
                    buxVar7.s();
                }
                break;
            case 12:
                bux buxVar8 = (bux) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (buxVar8.I((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    brp.a(((bry) this.b).j, this.a, buxVar8, 0);
                } else {
                    buxVar8.s();
                }
                break;
            case 13:
                int iIntValue8 = ((Integer) obj).intValue();
                Object obj8 = this.a;
                if (obj2 instanceof bur) {
                    ((cda) obj8).f((bur) obj2);
                } else if (!(obj2 instanceof bxu)) {
                    Object obj9 = this.b;
                    if (obj2 instanceof bxr) {
                        bvw.g((bzj) obj9, iIntValue8, obj2);
                        ((cda) obj8).e((bxr) obj2);
                    } else if (obj2 instanceof bxf) {
                        bvw.g((bzj) obj9, iIntValue8, obj2);
                        ((bxf) obj2).b();
                    }
                }
                break;
            case 14:
                cju cjuVar = (cju) obj;
                cmi cmiVar = (cmi) obj2;
                Object obj10 = this.b;
                cyc cycVar = (cyc) obj10;
                if (cycVar.t.an()) {
                    ?? r02 = this.a;
                    cycVar.G = cjuVar;
                    cycVar.F = cmiVar;
                    ((ces) cycVar.ag().a).b(obj10, cyc.p, r02);
                    cycVar.H = false;
                } else {
                    cycVar.H = true;
                }
                break;
            case 15:
                bux buxVar9 = (bux) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (buxVar9.I((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    ?? r12 = this.a;
                    ?? r03 = this.b;
                    buxVar9.v(1759209312);
                    dbc.a(r03, r12, buxVar9, 0);
                    buxVar9.o();
                } else {
                    buxVar9.s();
                }
                break;
            default:
                bux buxVar10 = (bux) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i4 = iIntValue10 & 3;
                int i5 = iIntValue10 & 1;
                bpc bpcVar = ksr.a;
                if (buxVar10.I(i4 != 2, i5)) {
                    Object obj11 = this.a;
                    Object obj12 = this.b;
                    czz.an(new bxe[]{ksp.b.b(obj12), bpe.b.b(ksr.a), bnm.a.b(new cjv(((kso) obj12).R()))}, bxc.i(-1249433100, true, new cuz(obj11, i), buxVar10), buxVar10, 48);
                } else {
                    buxVar10.s();
                }
                break;
        }
        return afak.a;
    }

    public /* synthetic */ apn(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
