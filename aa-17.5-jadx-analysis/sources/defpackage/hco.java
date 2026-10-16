package defpackage;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class hco implements afeh {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hco(float f, cmw cmwVar, int i) {
        this.c = i;
        this.a = f;
        this.b = cmwVar;
    }

    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        final bym bymVar;
        final byd bydVar;
        int i = this.c;
        if (i == 0) {
            bux buxVar = (bux) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            ((bii) obj).getClass();
            int i2 = iIntValue & 17;
            if (buxVar.I(i2 != 16, iIntValue & 1)) {
                float f = this.a;
                hcp hcpVar = (hcp) this.b;
                gtz.g(hcpVar.e, hcpVar.c, f, awd.r(cfy.e), buxVar, 3072);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i == 1) {
            bux buxVar2 = (bux) obj2;
            int iIntValue2 = ((Integer) obj3).intValue();
            ((ats) obj).getClass();
            if (buxVar2.I((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                cfv cfvVar = cfy.e;
                float f2 = gjk.d.k;
                cfy cfyVarI = asl.I(cfvVar, f2, gjk.c.k);
                ctp ctpVarA = atp.a(atd.c, cfl.j, buxVar2, 0);
                int iG = a.g(buxVar2.b());
                ccx ccxVarN = buxVar2.N();
                cfy cfyVarJ = bzi.j(buxVar2, cfyVarI);
                afdr afdrVar = cwb.a;
                buxVar2.M();
                buxVar2.w();
                if (buxVar2.G()) {
                    buxVar2.j(afdrVar);
                } else {
                    buxVar2.y();
                }
                float f3 = this.a;
                Object obj4 = this.b;
                byq.c(buxVar2, ctpVarA, cwb.e);
                byq.c(buxVar2, ccxVarN, cwb.d);
                byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
                byq.b(buxVar2, cwb.g);
                byq.c(buxVar2, cfyVarJ, cwb.c);
                gud gudVar = (gud) obj4;
                gab gabVar = gudVar.h;
                if (dlj.a(f3, gabVar != null ? 160.0f : 136.0f) < 0 || gudVar.j) {
                    buxVar2.v(1825635791);
                    buxVar2.o();
                } else {
                    buxVar2.v(1825237937);
                    gfa gfaVar = gudVar.g;
                    gmu.i(null, gfaVar, gabVar, buxVar2, sk.AUDIO_CONTENT_BUFFER_SIZE);
                    if (fwl.t(gfaVar, buxVar2, 0)) {
                        buxVar2.v(1825623887);
                        buxVar2.o();
                    } else {
                        buxVar2.v(1825370183);
                        xb.a(bzi.C(asl.I(cfvVar, BitmapDescriptorFactory.HUE_RED, gjk.b.k), new guf(f2, false ? 1 : 0)), BitmapDescriptorFactory.HUE_RED, czz.at(buxVar2).B, buxVar2, 0, 2);
                        buxVar2.o();
                    }
                    buxVar2.o();
                }
                gmu.h(gudVar, null, buxVar2, gud.a);
                buxVar2.n();
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        if (i != 2) {
            bux buxVar3 = (bux) obj2;
            int iIntValue3 = ((Integer) obj3).intValue();
            ((ats) obj).getClass();
            if (buxVar3.I((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                Object obj5 = this.b;
                float f4 = this.a;
                long j = ((cjv) buxVar3.f(bnm.a)).a;
                cfv cfvVar2 = cfy.e;
                ksy ksyVar = nly.a;
                boc.a((cmw) obj5, null, awd.i(asl.I(cfvVar2, BitmapDescriptorFactory.HUE_RED, 2.5f), f4), j, buxVar3, 56, 0);
            } else {
                buxVar3.s();
            }
            return afak.a;
        }
        bux buxVar4 = (bux) obj2;
        int iIntValue4 = ((Integer) obj3).intValue();
        ((ats) obj).getClass();
        if (buxVar4.I((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
            Context context = (Context) buxVar4.f(daa.b);
            Object objG = buxVar4.g();
            Object obj6 = buw.a;
            if (objG == obj6) {
                objG = new ParcelableSnapshotMutableIntState(-1);
                buxVar4.x(objG);
            }
            Object obj7 = this.b;
            final naq naqVar = (naq) obj7;
            byd bydVar2 = (byd) objG;
            bym bymVarF = bxc.f(naqVar.e, afbe.a, buxVar4);
            bym bymVarF2 = bxc.f(naqVar.j, false, buxVar4);
            bym bymVarF3 = bxc.f(naqVar.i, false, buxVar4);
            Object objG2 = buxVar4.g();
            if (objG2 == obj6) {
                mts mtsVar = new mts(bymVarF3, bymVarF, 9);
                lah lahVar = byj.a;
                Object bvkVar = new bvk(mtsVar, null);
                buxVar4.x(bvkVar);
                objG2 = bvkVar;
            }
            bym bymVar2 = (bym) objG2;
            Object objG3 = buxVar4.g();
            if (objG3 == obj6) {
                Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                buxVar4.x(parcelableSnapshotMutableState);
                objG3 = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objG3;
            Object objG4 = buxVar4.g();
            if (objG4 == obj6) {
                mts mtsVar2 = new mts((Object) bymVarF2, (Object) bwqVar, 10);
                lah lahVar2 = byj.a;
                Object bvkVar2 = new bvk(mtsVar2, null);
                buxVar4.x(bvkVar2);
                objG4 = bvkVar2;
            }
            if (((Boolean) ((bym) objG4).a()).booleanValue()) {
                buxVar4.v(501458648);
                Object objG5 = buxVar4.g();
                if (objG5 == obj6) {
                    objG5 = new mto(14);
                    buxVar4.x(objG5);
                }
                buxVar4.r((afdr) objG5);
                buxVar4.o();
            } else {
                buxVar4.v(501689288);
                buxVar4.o();
            }
            Boolean boolValueOf = Boolean.valueOf(((Boolean) bymVarF2.a()).booleanValue());
            boolean zC = buxVar4.C(bymVarF2);
            Object objG6 = buxVar4.g();
            if (zC || objG6 == obj6) {
                objG6 = new dxa(bymVarF2, bwqVar, (afck) null, 16);
                buxVar4.x(objG6);
            }
            bvq.g(boolValueOf, (afeg) objG6, buxVar4);
            boolean zBooleanValue = ((Boolean) bymVarF2.a()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) bymVar2.a()).booleanValue();
            boolean zE = buxVar4.E(obj7) | buxVar4.E(context) | buxVar4.C(bymVarF);
            Object objG7 = buxVar4.g();
            if (zE || objG7 == obj6) {
                Object fpbVar = new fpb(naqVar, context, bymVarF, bydVar2, 5);
                bymVar = bymVarF;
                bydVar = bydVar2;
                buxVar4.x(fpbVar);
                objG7 = fpbVar;
            } else {
                bymVar = bymVarF;
                bydVar = bydVar2;
            }
            mjv.m(zBooleanValue, zBooleanValue2, null, this.a, (afdr) objG7, buxVar4, 0);
            bym bymVarF4 = bxc.f(naqVar.g, nap.a, buxVar4);
            nap napVarF = mjv.f(bymVarF4);
            boolean zC2 = buxVar4.C(bymVarF4);
            Object objG8 = buxVar4.g();
            if (zC2 || objG8 == obj6) {
                objG8 = new dxi(bymVarF4, (afck) null, 19);
                buxVar4.x(objG8);
            }
            bvq.g(napVarF, (afeg) objG8, buxVar4);
            ca.I(mjv.f(bymVarF4), null, null, "MediaSuggestionsState", bxc.i(-1166362850, true, new afeh() { // from class: naf
                @Override // defpackage.afeh
                public final Object invoke(Object obj8, Object obj9, Object obj10) {
                    nap napVar = (nap) obj8;
                    bux buxVar5 = (bux) obj9;
                    int iIntValue5 = ((Integer) obj10).intValue();
                    napVar.getClass();
                    if ((iIntValue5 & 6) == 0) {
                        iIntValue5 |= true != buxVar5.A(napVar.ordinal()) ? 2 : 4;
                    }
                    if (buxVar5.I((iIntValue5 & 19) != 18, iIntValue5 & 1)) {
                        byd bydVar3 = bydVar;
                        naq naqVar2 = naqVar;
                        int iOrdinal = napVar.ordinal();
                        if (iOrdinal == 0) {
                            buxVar5.v(-829594443);
                            afbt afbtVar = new afbt(10);
                            for (int i3 = 0; i3 < 10; i3++) {
                                afbtVar.add(afak.a);
                            }
                            List listF = afbtVar.f();
                            Object objG9 = buxVar5.g();
                            if (objG9 == buw.a) {
                                objG9 = new mzg(bydVar3, 17);
                                buxVar5.x(objG9);
                            }
                            mjv.g(listF, null, 0, (afec) objG9, null, mwx.a, buxVar5, 199680, 22);
                            buxVar5.o();
                        } else if (iOrdinal == 1) {
                            bym bymVar3 = bymVar;
                            buxVar5.v(-828184532);
                            Integer numValueOf = Integer.valueOf(bydVar3.e());
                            List listAg = roc.ag(bymVar3);
                            boolean zE2 = buxVar5.E(naqVar2) | buxVar5.C(bymVar3);
                            Object objG10 = buxVar5.g();
                            if (zE2 || objG10 == buw.a) {
                                gqj gqjVar = new gqj(naqVar2, bydVar3, bymVar3, (afck) null, 2);
                                buxVar5.x(gqjVar);
                                objG10 = gqjVar;
                            }
                            bvq.f(numValueOf, listAg, (afeg) objG10, buxVar5);
                            List listAg2 = roc.ag(bymVar3);
                            Object objG11 = buxVar5.g();
                            if (objG11 == buw.a) {
                                objG11 = new mzg(bydVar3, 18);
                                buxVar5.x(objG11);
                            }
                            mjv.g(listAg2, null, 0, (afec) objG11, mwx.b, bxc.i(859401831, true, new dxm(naqVar2, 10), buxVar5), buxVar5, 224256, 6);
                            buxVar5.o();
                        } else {
                            if (iOrdinal != 2) {
                                buxVar5.v(111772779);
                                buxVar5.o();
                                throw new aezs();
                            }
                            buxVar5.v(-830141562);
                            Integer numValueOf2 = Integer.valueOf(bydVar3.e());
                            boolean zE3 = buxVar5.E(naqVar2);
                            Object objG12 = buxVar5.g();
                            if (zE3 || objG12 == buw.a) {
                                objG12 = new dxa(naqVar2, bydVar3, (afck) null, 17);
                                buxVar5.x(objG12);
                            }
                            bvq.g(numValueOf2, (afeg) objG12, buxVar5);
                            cfy cfyVarC = awd.c(cfy.e, 1.0f);
                            ctp ctpVarB = atk.b(cfl.e, false);
                            int iG2 = a.g(buxVar5.b());
                            ccx ccxVarN2 = buxVar5.N();
                            cfy cfyVarJ2 = bzi.j(buxVar5, cfyVarC);
                            afdr afdrVar2 = cwb.a;
                            buxVar5.M();
                            buxVar5.w();
                            if (buxVar5.G()) {
                                buxVar5.j(afdrVar2);
                            } else {
                                buxVar5.y();
                            }
                            byq.c(buxVar5, ctpVarB, cwb.e);
                            byq.c(buxVar5, ccxVarN2, cwb.d);
                            byq.c(buxVar5, Integer.valueOf(iG2), cwb.f);
                            byq.b(buxVar5, cwb.g);
                            byq.c(buxVar5, cfyVarJ2, cwb.c);
                            brp.b(vq.e(R.string.media_suggestions_empty, buxVar5), null, kfn.i(buxVar5).t(), 0L, null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVar5).i, buxVar5, 0, 0, 131066);
                            buxVar5.n();
                            buxVar5.o();
                        }
                    } else {
                        buxVar5.s();
                    }
                    return afak.a;
                }
            }, buxVar4), buxVar4, 27648, 6);
        } else {
            buxVar4.s();
        }
        return afak.a;
    }

    public /* synthetic */ hco(Object obj, float f, int i) {
        this.c = i;
        this.b = obj;
        this.a = f;
    }
}
