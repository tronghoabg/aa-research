package defpackage;

import android.util.Log;
import androidx.car.app.model.CarColor;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final /* synthetic */ class gks {
    public static String a(String str, Object... objArr) {
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null && obj.getClass().isArray()) {
                objArr[i] = Arrays.deepToString(new Object[]{objArr[i]}).substring(1, r2.length() - 1);
            }
        }
        try {
            return String.format(Locale.US, str, objArr);
        } catch (IllegalFormatException unused) {
            return str.concat(String.valueOf(Arrays.deepToString(objArr)));
        }
    }

    public static void b(String str, String str2) {
        if (Log.isLoggable(str, 3)) {
            Log.d(str, str2);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 3)) {
            Log.d(str, a(str2, objArr));
        }
    }

    public static void d(String str, String str2) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, a(str2, objArr));
        }
    }

    public static void f(String str, Throwable th, String str2) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    public static void g(String str, Throwable th, String str2, Object... objArr) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, a(str2, objArr), th);
        }
    }

    public static void h(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 4)) {
            Log.i(str, a(str2, objArr));
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, a(str2, objArr));
        }
    }

    public static void j(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void k(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, a(str2, objArr));
        }
    }

    public static final void l(grh grhVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bcm bcmVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(178234442);
        int i4 = 4;
        int i5 = 1;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(grhVar) : buxVarC.E(grhVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarD = dyz.d(grhVar.b, Float.valueOf(BitmapDescriptorFactory.HUE_RED), buxVarC);
            boolean z = ((gvl) buxVarC.f(gfp.a)).g;
            if (z) {
                buxVarC.v(1202945160);
                bcmVar = gux.f(buxVarC).a.d;
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1202998666);
                bcmVar = gux.f(buxVarC).a.a;
                ((bvv) buxVarC).Y(false);
            }
            bcm bcmVar2 = bcmVar;
            cfy cfyVarE = afp.E(cjn.g(bxc.m(awd.d(awd.r(cfyVar), 120.0f), gip.c.g, bcmVar), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcmVar2, true, 0, 1042431), gux.c(buxVarC).K(), bcmVar2);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new gqr(i4);
                bvvVar.ad(objS);
            }
            cfy cfyVarK = bxc.k(cfyVarE, (afec) objS);
            afdr afdrVar = grhVar.e;
            if (afdrVar == null) {
                buxVarC.v(1203527030);
                Object objS2 = bvvVar.S();
                if (objS2 == obj) {
                    objS2 = new fwp(20);
                    bvvVar.ad(objS2);
                }
                afdrVar = (afdr) objS2;
            } else {
                buxVarC.v(-515366589);
            }
            bvvVar.Y(false);
            ca.at(ca.be(afp.x(cfyVarK, true, null, null, afdrVar)), null, bxc.i(-1726130400, true, new nlj(z ? 1 : 0, bymVarD, grhVar, i5), buxVarC), buxVarC, 3072, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(grhVar, cfyVar, i, i5);
        }
    }

    public static final void m(gpk gpkVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3;
        bux buxVar2;
        bym bymVar;
        afeg afegVar;
        afec afecVar;
        afeg afegVar2;
        cfv cfvVar;
        afdr afdrVar;
        afeg afegVar3;
        afeg afegVar4;
        bvv bvvVar;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-1139658822);
        if (i4 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(gpkVar) : buxVarC.E(gpkVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            aiyk aiykVar = gpkVar.a;
            gfs gfsVar = gey.b;
            bym bymVarD = dyz.d(aiykVar, gfsVar, buxVarC);
            bym bymVarD2 = dyz.d(gpkVar.b, gfsVar, buxVarC);
            bym bymVarD3 = dyz.d(gpkVar.c, null, buxVarC);
            ctp ctpVarA = avv.a(atd.g(gjk.d.k), cfl.n, buxVarC, 48);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            afeg afegVar5 = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar5);
            afeg afegVar6 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar6);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar7 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar7);
            afec afecVar2 = cwb.g;
            byq.b(buxVarC, afecVar2);
            afeg afegVar8 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar8);
            cfv cfvVar2 = cfy.e;
            cfy cfyVarG = cjn.g(ca.av(awd.b(cfvVar2, 1.0f), false), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gux.f(buxVarC).a.c, true, 0, 1042431);
            if (a.ae(bymVarD3) != null) {
                buxVarC.v(473398902);
                gab gabVarAe = a.ae(bymVarD3);
                gabVarAe.getClass();
                afegVar = afegVar6;
                afegVar2 = afegVar7;
                afegVar4 = afegVar8;
                i3 = 0;
                afecVar = afecVar2;
                cfvVar = cfvVar2;
                afegVar3 = afegVar5;
                bymVar = bymVarD;
                bvvVar = bvvVar2;
                afdrVar = afdrVar2;
                fxp.c(gabVarAe, BitmapDescriptorFactory.HUE_RED, cfyVarG, null, null, null, false, false, null, buxVarC, 56, 1016);
                bvvVar.Y(false);
            } else {
                bymVar = bymVarD;
                afegVar = afegVar6;
                i3 = 0;
                afecVar = afecVar2;
                afegVar2 = afegVar7;
                cfvVar = cfvVar2;
                afdrVar = afdrVar2;
                afegVar3 = afegVar5;
                afegVar4 = afegVar8;
                bvvVar = bvvVar2;
                buxVarC.v(473487252);
                gpm.b(cfyVarG, buxVarC, 0);
                bvvVar.Y(false);
            }
            asx asxVarG = atd.g(gjk.a.k);
            cfy cfyVarI = asl.I(cfvVar, BitmapDescriptorFactory.HUE_RED, gjk.b.k);
            ctp ctpVarA2 = atp.a(asxVarG, cfl.j, buxVarC, i3);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarI);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar3);
            byq.c(buxVarC, ccxVarAh2, afegVar);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar2);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            buxVar2 = buxVarC;
            fzc.g(new gcq(a.af(bymVar)), null, 1, 0, gux.c(buxVarC).T(), czz.av(buxVarC).d, 0L, null, 0, 0, null, null, null, false, false, buxVar2, 392, 0, 65482);
            fzc.g(new gcq(a.af(bymVarD2)), null, 1, 0, gux.c(buxVar2).U(), czz.av(buxVar2).i, 0L, null, 0, 0, null, null, null, false, false, buxVar2, 392, 0, 65482);
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            i3 = 0;
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(gpkVar, cfyVar, i, i3);
        }
    }

    public static final void n(gqh gqhVar, float f, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        bux buxVarC = buxVar.c(-1559322294);
        if ((i & 6) == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(gqhVar) : buxVarC.E(gqhVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.z(f) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            aiyk aiykVar = gqhVar.b;
            cfv cfvVar = cfy.e;
            bym bymVarD = dyz.d(aiykVar, null, buxVarC);
            aiyk aiykVar2 = gqhVar.c;
            bym bymVarD2 = dyz.d(aiykVar2, null, buxVarC);
            aiyk aiykVar3 = gqhVar.d;
            Object objCd = afbe.a;
            bym bymVarD3 = dyz.d(aiykVar3, objCd, buxVarC);
            boolean zC = ((i3 & 112) == 32) | buxVarC.C(roc.ag(bymVarD3));
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                if (dlj.a(f, 800.0f) >= 0) {
                    objCd = dlj.a(f, 1100.0f) < 0 ? woy.cd(roc.ag(bymVarD3), 2) : woy.cd(roc.ag(bymVarD3), 3);
                }
                bvvVar.ad(objCd);
                objS = objCd;
            }
            List list = (List) objS;
            boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && buxVarC.C(gqhVar));
            Object objS2 = bvvVar.S();
            if (z || objS2 == buw.a) {
                gqh gqhVar2 = new gqh(new fmn(gqhVar.a, 13), aiykVar, aiykVar2, aiykVar3, gqhVar.e, gqhVar.f, gqhVar.g, gqhVar.h, gqhVar.i, gqhVar.j);
                bvvVar.ad(gqhVar2);
                objS2 = gqhVar2;
            }
            gqh gqhVar3 = (gqh) objS2;
            float f2 = gjk.d.k;
            asx asxVarG = atd.g(f2);
            cfr cfrVar = cfl.n;
            cfy cfyVarI = asl.I(cfvVar, BitmapDescriptorFactory.HUE_RED, f2);
            ctp ctpVarA = avv.a(asxVarG, cfrVar, buxVarC, 48);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarI);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            gkq.b(gqhVar3, das.d(awd.d(awd.m(cfvVar, 124.0f), 64.0f), "playPauseButton"), buxVarC, 48);
            gjy.b((fwm) bymVarD.a(), null, null, null, buxVarC, 8, 14);
            gjy.b((fwm) bymVarD2.a(), null, null, null, buxVarC, 8, 14);
            buxVarC.v(153155095);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gjy.b((fwm) it.next(), null, null, null, buxVarC, 8, 14);
            }
            bvvVar.Y(false);
            bvvVar.Y(true);
            cfyVar2 = cfvVar;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grk(gqhVar, f, cfyVar2, i, 0);
        }
    }

    public static final CarColor o(fwd fwdVar) {
        return CarColor.createCustom(fwdVar.a, fwdVar.b);
    }

    public static final fwe p(wnj wnjVar) {
        int iA = wnjVar.a(85);
        int iA2 = wnjVar.a(40);
        int iA3 = wnjVar.a(20);
        int iA4 = wnjVar.a(95);
        fwd fwdVar = new fwd(iA3, iA4);
        return new fwe(new fwd(iA, iA2), new fwd(iA3, iA4), fwdVar, new fwd(iA, iA2), new fwd(iA3, iA4), new fwd(iA3, iA4), null, null);
    }

    public static /* synthetic */ fwm q(gex gexVar, geu geuVar, boolean z) {
        fwx fwxVar = fwx.d;
        gexVar.getClass();
        sw swVar = new sw();
        swVar.c(gexVar.a);
        swVar.a = gexVar.b;
        swVar.d(new gec(gexVar, 3));
        return fvr.h(fvl.c(swVar.a(), geuVar, z, null, false, 12), geuVar, fwxVar, false, fwh.a, null, null, false, 0, 244);
    }
}
