package defpackage;

import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class nrb implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ nrb(Integer num, nko nkoVar, afha afhaVar, int i) {
        this.d = i;
        this.b = num;
        this.a = nkoVar;
        this.c = afhaVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [afdr, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.d;
        if (i == 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                cfy cfyVarI = asl.I(afp.E(awd.c(this.a, 1.0f), nqq.a, bcr.c(vq.g(buxVar), vq.g(buxVar), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED)), gjk.d.k, gjk.b.k);
                ctp ctpVarA = avv.a(atd.a, cfl.o, buxVar, 48);
                int iG = a.g(buxVar.b());
                ccx ccxVarN = buxVar.N();
                cfy cfyVarJ = bzi.j(buxVar, cfyVarI);
                afdr afdrVar = cwb.a;
                buxVar.M();
                buxVar.w();
                if (buxVar.G()) {
                    buxVar.j(afdrVar);
                } else {
                    buxVar.y();
                }
                ?? r8 = this.c;
                ?? r0 = this.b;
                byq.c(buxVar, ctpVarA, cwb.e);
                byq.c(buxVar, ccxVarN, cwb.d);
                byq.c(buxVar, Integer.valueOf(iG), cwb.f);
                byq.b(buxVar, cwb.g);
                byq.c(buxVar, cfyVarJ, cwb.c);
                avy avyVar = avy.a;
                cmw cmwVarB = dao.b(R.drawable.gs_arrow_back_vd_theme_24, buxVar, 0);
                cfv cfvVar = cfy.e;
                khc.r(cmwVarB, r0, das.d(cfvVar, "back_button_tag"), null, false, false, null, null, null, null, null, buxVar, 392, 0, 4088);
                asl.A(avyVar.b(cfvVar, 1.0f, true), buxVar);
                khc.q(dao.b(R.drawable.gs_close_vd_theme_24, buxVar, 0), "Exit", r8, das.d(cfvVar, "exit_button_tag"), null, false, false, null, null, null, null, null, buxVar, 3128, 0, 8176);
                buxVar.n();
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i != 1) {
            bux buxVar2 = (bux) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                mcd.k((GhIcon) this.a, (GhIcon) this.b, null, this.c == nuo.h, BitmapDescriptorFactory.HUE_RED, 0L, 0L, 0L, buxVar2, 0);
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        bux buxVar3 = (bux) obj;
        int iIntValue3 = ((Integer) obj2).intValue();
        int i2 = iIntValue3 & 3;
        int i3 = iIntValue3 & 1;
        yph yphVar = nkx.a;
        if (buxVar3.I(i2 != 2, i3)) {
            Object obj3 = this.b;
            int iIntValue4 = obj3 != null ? ((Integer) obj3).intValue() : 0;
            nli nliVar = iIntValue4 > 0 ? nli.a : iIntValue4 < 0 ? nli.b : nli.c;
            int iOrdinal = nliVar.ordinal();
            if (iOrdinal == 0) {
                buxVar3.v(-434022761);
                j = ksp.j(krr.E, buxVar3);
                buxVar3.o();
            } else if (iOrdinal == 1) {
                buxVar3.v(-434020553);
                j = ksp.j(krr.M, buxVar3);
                buxVar3.o();
            } else {
                if (iOrdinal != 2) {
                    buxVar3.v(-434024882);
                    buxVar3.o();
                    throw new aezs();
                }
                buxVar3.v(-434018411);
                j = ((cjv) buxVar3.f(bnm.a)).a;
                buxVar3.o();
            }
            Object obj4 = this.c;
            Object obj5 = this.a;
            long j2 = ksp.j(krr.v, buxVar3);
            if (obj5 == null) {
                buxVar3.v(-569563947);
                nkx.h(nliVar, iIntValue4, (afha) obj4, j, j2, buxVar3, 0);
                buxVar3.o();
            } else {
                buxVar3.v(-569461306);
                nkx.f(nliVar, iIntValue4, (afha) obj4, j, j2, (nko) obj5, false, buxVar3, 0);
                buxVar3.o();
            }
        } else {
            buxVar3.s();
        }
        return afak.a;
    }

    public /* synthetic */ nrb(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
