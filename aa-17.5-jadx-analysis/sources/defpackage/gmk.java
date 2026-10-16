package defpackage;

import android.content.Context;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.navigation.model.MapController;
import androidx.car.app.navigation.model.PanModeDelegateImpl;
import androidx.core.graphics.drawable.IconCompat;
import com.android.car.libraries.apphost.internal.model.GoogleListTemplate;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class gmk {
    public gmk(gml gmlVar, GoogleListTemplate googleListTemplate, Action action, List list) {
        gmlVar.getClass();
        googleListTemplate.getClass();
        action.getClass();
        list.getClass();
    }

    public static final ActionStrip a(ActionStrip actionStrip) {
        if (actionStrip == null) {
            return null;
        }
        sx sxVar = new sx();
        List<Action> actions = actionStrip.getActions();
        actions.getClass();
        Iterator<T> it = actions.iterator();
        while (it.hasNext()) {
            sxVar.b((Action) it.next());
        }
        return sxVar.a();
    }

    public static final ListTemplate b(ItemList itemList, Header header) {
        uj ujVar = new uj();
        if (itemList != null) {
            ujVar.f(itemList);
        }
        if (header != null) {
            ujVar.d(header);
        }
        return ujVar.a();
    }

    public static final Header c(Header header, Action action, CarText carText) {
        if (header != null) {
            return header;
        }
        if (action == null && carText == null) {
            return null;
        }
        ua uaVar = new ua();
        if (action != null) {
            uaVar.c(action);
        }
        if (carText != null) {
            uaVar.d(carText);
        }
        return uaVar.a();
    }

    public static final Header d(Header header, ut utVar, geu geuVar) {
        Action actionA;
        ua uaVar;
        if (utVar != null) {
            sw swVar = new sw();
            Context applicationContext = geuVar.getApplicationContext();
            geuVar.u();
            leh.a();
            CarIcon carIcon = new CarIcon(new tj(IconCompat.m(applicationContext, R.drawable.gs_refresh_vd_theme_24)));
            gbz gbzVar = new gbz(utVar, 9);
            swVar.c(carIcon);
            swVar.d(new gec(gbzVar, 2));
            actionA = swVar.a();
        } else {
            actionA = null;
        }
        if (actionA == null) {
            return header;
        }
        if (header != null) {
            uaVar = new ua();
            CarText title = header.getTitle();
            if (title == null) {
                title = CarText.create(" ");
            }
            uaVar.d(title);
            Action startHeaderAction = header.getStartHeaderAction();
            if (startHeaderAction != null) {
                uaVar.c(startHeaderAction);
            }
            List<Action> endHeaderActions = header.getEndHeaderActions();
            endHeaderActions.getClass();
            Iterator<T> it = endHeaderActions.iterator();
            while (it.hasNext()) {
                uaVar.b((Action) it.next());
            }
        } else {
            uaVar = new ua();
            uaVar.d(CarText.create(" "));
        }
        uaVar.b(actionA);
        return uaVar.a();
    }

    public static final MapController e(ActionStrip actionStrip, final xc xcVar) {
        wt wtVar = new wt();
        if (actionStrip != null) {
            wf.d.a(actionStrip.getActions());
            wtVar.b = actionStrip;
        }
        wtVar.a = PanModeDelegateImpl.create(new xe() { // from class: god
            @Override // defpackage.xe
            public final void a(boolean z) {
                xc xcVar2 = xcVar;
                if (xcVar2 != null) {
                    xcVar2.sendPanModeChanged(z, new goe());
                }
            }
        });
        return new MapController(wtVar);
    }

    public static final void f(float f, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-534288488);
        if (i3 == 0) {
            i2 = (true != buxVarC.z(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfyVar2 = cfyVar;
            gca.a(new gcb(f, new hjw(gux.c(buxVarC).C(), gux.c(buxVarC).C())), cfyVar2, 0, buxVarC, i2 & 112, 4);
        } else {
            cfyVar2 = cfyVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grm(f, cfyVar2, i, i4);
        }
    }

    public static final void g(grh grhVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        afdr afdrVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1011357932);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(grhVar) : buxVarC.E(grhVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarD = dyz.d(grhVar.b, Float.valueOf(BitmapDescriptorFactory.HUE_RED), buxVarC);
            cfy cfyVarE = afp.E(cjn.g(awd.m(awd.b(cfyVar, 1.0f), 420.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gux.f(buxVarC).a.c, true, 0, 1042431), gux.c(buxVarC).K(), gux.f(buxVarC).a.d);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new gqr(5);
                bvvVar.ad(objS);
            }
            cfy cfyVarK = bxc.k(cfyVarE, (afec) objS);
            afdr afdrVar2 = grhVar.e;
            if (afdrVar2 == null) {
                buxVarC.v(169074772);
                Object objS2 = bvvVar.S();
                if (objS2 == obj) {
                    objS2 = new grl(0);
                    bvvVar.ad(objS2);
                }
                afdrVar = (afdr) objS2;
                bvvVar.Y(false);
            } else {
                buxVarC.v(1252379301);
                bvvVar.Y(false);
                afdrVar = afdrVar2;
            }
            cfy cfyVarBe = ca.be(afp.x(cfyVarK, true, null, null, afdrVar));
            float f = gjk.e.k;
            cfy cfyVarH = asl.H(cfyVarBe, f);
            ctp ctpVarA = atp.a(atd.g(gjk.a.k), cfl.j, buxVarC, 0);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarH);
            afdr afdrVar3 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar3);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            cfv cfvVar = cfy.e;
            buxVar2 = buxVarC;
            i(ca.bf(ggh.a(awd.r(awd.b(ats.b(cfvVar, 1.0f, true), 1.0f)), gux.f(buxVarC).a.d, gux.c(buxVarC).C(), 0L, null, null, null, false, true, buxVarC, 100663296, 124), afdrVar2 != null, null), grhVar.a, 0, buxVar2, 0);
            asl.A(awd.d(cfvVar, gjk.f.k), buxVar2);
            f(((Number) bymVarD.a()).floatValue(), awd.d(awd.r(cfvVar), gjk.b.k), buxVar2, 0);
            asl.A(awd.d(cfvVar, f), buxVar2);
            h(grhVar.c, null, buxVar2, 0);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(grhVar, cfyVar, i, 4);
        }
    }

    public static final void h(gqh gqhVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(-1932025708);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gqhVar) : buxVarC.E(gqhVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            aiyk aiykVar = gqhVar.b;
            cfv cfvVar = cfy.e;
            bym bymVarD = dyz.d(aiykVar, null, buxVarC);
            bym bymVarD2 = dyz.d(gqhVar.c, null, buxVarC);
            ctp ctpVarA = avv.a(atd.g(gjk.d.k), cfl.n, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfvVar);
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
            gkq.b(gqhVar, das.d(awd.d(awd.r(avy.a.b(cfvVar, 1.0f, true)), 64.0f), "playPauseButton"), buxVarC, i3 & 14);
            gjy.b((fwm) bymVarD.a(), null, null, null, buxVarC, 8, 14);
            gjy.b((fwm) bymVarD2.a(), null, null, null, buxVarC, 8, 14);
            bvvVar.Y(true);
            cfyVar = cfvVar;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(gqhVar, cfyVar, i, 3);
        }
    }

    public static final void i(cfy cfyVar, gpk gpkVar, int i, bux buxVar, int i2) {
        int i3;
        bux buxVar2;
        int i4;
        int i5;
        afeg afegVar;
        int i6;
        bvv bvvVar;
        afec afecVar;
        afeg afegVar2;
        cfv cfvVar;
        afdr afdrVar;
        afeg afegVar3;
        afeg afegVar4;
        cfm cfmVar;
        bux buxVarC = buxVar.c(-1136185173);
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != buxVarC.C(cfyVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? buxVarC.C(gpkVar) : buxVarC.E(gpkVar)) ? 16 : 32;
        }
        int i7 = i3 | 384;
        if (buxVarC.I((i7 & 147) != 146, i7 & 1)) {
            aiyk aiykVar = gpkVar.a;
            gfs gfsVar = gey.b;
            bym bymVarD = dyz.d(aiykVar, gfsVar, buxVarC);
            bym bymVarD2 = dyz.d(gpkVar.b, gfsVar, buxVarC);
            bym bymVarD3 = dyz.d(gpkVar.c, null, buxVarC);
            asx asxVar = atd.g;
            cfm cfmVar2 = cfl.j;
            ctp ctpVarA = atp.a(asxVar, cfmVar2, buxVarC, 6);
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
            cfy cfyVarG = cjn.g(ca.av(ats.b(cfvVar2, 1.0f, false), false), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gux.f(buxVarC).a.c, true, 0, 1042431);
            if (a.ae(bymVarD3) != null) {
                buxVarC.v(1951495027);
                gab gabVarAe = a.ae(bymVarD3);
                gabVarAe.getClass();
                afdrVar = afdrVar2;
                i5 = i7;
                afegVar4 = afegVar8;
                afegVar = afegVar6;
                bvvVar = bvvVar2;
                afecVar = afecVar2;
                afegVar2 = afegVar7;
                cfvVar = cfvVar2;
                i6 = 0;
                afegVar3 = afegVar5;
                cfmVar = cfmVar2;
                fxp.c(gabVarAe, BitmapDescriptorFactory.HUE_RED, cfyVarG, null, null, null, false, false, null, buxVarC, 56, 1016);
                bvvVar.Y(false);
            } else {
                i5 = i7;
                afegVar = afegVar6;
                i6 = 0;
                bvvVar = bvvVar2;
                afecVar = afecVar2;
                afegVar2 = afegVar7;
                cfvVar = cfvVar2;
                afdrVar = afdrVar2;
                afegVar3 = afegVar5;
                afegVar4 = afegVar8;
                cfmVar = cfmVar2;
                buxVarC.v(1951583377);
                gpm.b(cfyVarG, buxVarC, 0);
                bvvVar.Y(false);
            }
            float f = gjk.b.k;
            asl.A(awd.d(cfvVar, f), buxVarC);
            ctp ctpVarA2 = atp.a(atd.g(f), cfmVar, buxVarC, i6);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfvVar);
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
            int i8 = (i5 & 896) | 8;
            buxVar2 = buxVarC;
            fzc.g(new gcq(a.af(bymVarD)), null, 1, 0, gux.c(buxVarC).T(), czz.av(buxVarC).d, 0L, null, 0, 0, null, null, null, false, false, buxVar2, i8, 0, 65482);
            fzc.g(new gcq(a.af(bymVarD2)), null, 1, 0, gux.c(buxVar2).U(), czz.av(buxVar2).i, 0L, null, 0, 0, null, null, null, false, false, buxVar2, i8, 0, 65482);
            bvvVar.Y(true);
            bvvVar.Y(true);
            i4 = 1;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            i4 = i;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new fwz(cfyVar, gpkVar, i4, i2, 5, null);
        }
    }

    public static final void j(grh grhVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bvv bvvVar;
        boolean z;
        cfv cfvVar;
        atn atnVar;
        boolean z2;
        long jV;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1887542048);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(grhVar) : buxVarC.E(grhVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bym bymVarE = byx.e(grhVar.a.c, null, null, null, buxVarC, 6);
            bym bymVarE2 = byx.e(grhVar.d, null, null, null, buxVarC, 6);
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new asg();
                bvvVar2.ad(objS);
            }
            asf asfVar = (asf) objS;
            bcm bcmVar = gux.f(buxVarC).a.d;
            float f = gux.g(buxVarC).d.d;
            cfy cfyVarA = ggh.a(cjn.g(bxc.m(awd.i(cfyVar, 72.0f), gip.c.g, bcmVar), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcmVar, true, 0, 1042431), bcmVar, 0L, 0L, null, null, asfVar, false, false, buxVarC, 1572864, 222);
            buxVarC = buxVarC;
            afdr afdrVar = grhVar.e;
            if (afdrVar == null) {
                buxVarC.v(-2052568672);
                Object objS2 = bvvVar2.S();
                if (objS2 == obj) {
                    objS2 = new grl(1);
                    bvvVar = bvvVar2;
                    bvvVar.ad(objS2);
                } else {
                    bvvVar = bvvVar2;
                }
                afdrVar = (afdr) objS2;
                z = false;
            } else {
                bvvVar = bvvVar2;
                z = false;
                buxVarC.v(-1451685927);
            }
            bvvVar.Y(z);
            cfy cfyVarX = afp.x(cfyVarA, true, null, asfVar, afdrVar);
            ctp ctpVarB = atk.b(cfl.a, z);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarX);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            atn atnVar2 = atn.a;
            cfv cfvVar2 = cfy.e;
            boolean z3 = z;
            cfy cfyVarB = atnVar2.b(cfvVar2);
            gab gabVarAe = a.ae(bymVarE);
            if (gabVarAe != null) {
                buxVarC.v(206644542);
                cfvVar = cfvVar2;
                atnVar = atnVar2;
                z2 = z3;
                fxp.c(gabVarAe, BitmapDescriptorFactory.HUE_RED, cfyVarB, null, csh.a, null, false, false, null, buxVarC, 24632, 1000);
                buxVarC = buxVarC;
                atk.c(cfyVarB.a(new aix(cjv.h(-72057594037927936L, 0.3f), ckq.a)), buxVarC, z2 ? 1 : 0);
                bvvVar.Y(z2);
            } else {
                cfvVar = cfvVar2;
                atnVar = atnVar2;
                z2 = z3;
                buxVarC.v(206897750);
                atk.c(cfyVarB.a(new aix(gux.c(buxVarC).K(), ckq.a)), buxVarC, z2 ? 1 : 0);
                bvvVar.Y(z2);
            }
            gbg gbgVar = (gbg) bymVarE2.a();
            if (gbgVar == null) {
                buxVarC.v(207119647);
                bvvVar.Y(z2);
            } else {
                float f2 = f + 2.0f + BitmapDescriptorFactory.HUE_RED;
                buxVarC.v(207119648);
                cfy cfyVarA2 = atnVar.a(awd.k(cfvVar, f2, f2), cfl.e);
                if (a.ae(bymVarE) != null) {
                    buxVarC.v(765159022);
                    bvvVar.Y(z2);
                    jV = -4294967296L;
                } else {
                    buxVarC.v(765160217);
                    jV = gux.c(buxVarC).v();
                    bvvVar.Y(z2);
                }
                bux buxVar2 = buxVarC;
                gbf.d(gbgVar, cfyVarA2, null, null, new cjv(jV), true, false, null, null, false, buxVar2, 196608, 972);
                buxVarC = buxVar2;
                bvvVar.Y(z2);
            }
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grj(grhVar, cfyVar, i, 2);
        }
    }
}
