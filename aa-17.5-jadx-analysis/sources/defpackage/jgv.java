package defpackage;

import android.content.ComponentName;
import android.os.Build;
import android.os.Handler;
import androidx.car.app.model.Alert;
import j$.util.Objects;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class jgv implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jgv(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [icz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, jgt] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, moa] */
    @Override // java.lang.Runnable
    public final void run() {
        xpx xpxVar;
        char c = 1;
        switch (this.c) {
            case 0:
                ((jgy) this.b).z(this.a, null, -1);
                return;
            case 1:
                ify.f();
                boolean z = this.a;
                scz sczVar = ((idr) this.b).a;
                boolean z2 = sczVar.b;
                sczVar.b = z;
                if (z2 != z) {
                    sczVar.e.a(z);
                    return;
                }
                return;
            case 2:
                boolean z3 = this.a;
                Object obj = this.b;
                ((jgy) obj).x(z3 ? ((jgy) obj).v() : null);
                return;
            case 3:
                ilb.d();
                jgy jgyVar = (jgy) this.b;
                jhf jhfVar = jgyVar.h;
                boolean z4 = this.a;
                if (jhfVar != null) {
                    jhfVar.ar(z4);
                    return;
                } else {
                    ((ype) ((ype) jgy.a.h()).ai(2138)).N("%s: No window, caching critical UI state: %b", jgyVar.b, z4);
                    jgyVar.i = z4;
                    return;
                }
            case 4:
                if (acpf.m()) {
                    boolean z5 = this.a;
                    ?? r11 = this.b;
                    jgy jgyVar2 = (jgy) r11;
                    jgyVar2.q = z5;
                    if (!z5) {
                        if (jgyVar2.r) {
                            ((ype) jgy.a.l().ai((char) 2128)).y("%s.setOverlayVisible(false)", jgyVar2.b);
                            Runnable runnable = jgyVar2.t;
                            if (runnable != null) {
                                jgyVar2.s.removeCallbacks(runnable);
                            }
                            jgyVar2.x(jgyVar2.v());
                            return;
                        }
                        return;
                    }
                    if (!jgyVar2.l && !jgyVar2.r) {
                        ((ype) ((ype) jgy.a.h()).ai(2130)).y("%s not hidden, nothing to do for setOverlayVisible(true).", jgyVar2.b);
                        return;
                    }
                    ((ype) jgy.a.l().ai((char) 2129)).y("%s.setOverlayVisible(true)", jgyVar2.b);
                    jgyVar2.l = false;
                    woy.aa(jgyVar2.h != null, "This car window must have a ProjectionWindow before setOverlayVisible can be called");
                    jgyVar2.r = true;
                    jgyVar2.B(jgyVar2.g);
                    if (jgyVar2.d.aj(r11, jgyVar2.p)) {
                        jgyVar2.m = true;
                        jgyVar2.n = true;
                        jgyVar2.o = null;
                    }
                    Runnable runnable2 = jgyVar2.t;
                    if (runnable2 != null) {
                        jgyVar2.s.removeCallbacks(runnable2);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                yop yopVarF = pbx.a.f();
                boolean z6 = this.a;
                ((ype) ((ype) yopVarF).ai((char) 6291)).y("handoff initiated: %b", Boolean.valueOf(z6));
                pbu pbuVar = (pbu) ((jll) this.b).a.h;
                ols.L(pbuVar.c, "com.google.android.gms.car.CONNECTION_HANDOFF", z6 ? rrx.b : rrx.c, null);
                if (z6) {
                    return;
                }
                pbuVar.i.c();
                return;
            case 6:
                Object obj2 = this.b;
                hik hikVar = (hik) ((hlf) obj2).C();
                if (hikVar.a instanceof gmp) {
                    boolean z7 = this.a;
                    gne gneVar = (gne) obj2;
                    if (gneVar.f != z7) {
                        gneVar.f = z7;
                        i = true == z7 ? Alert.DURATION_SHOW_INDEFINITELY : 2;
                        hii hiiVar = hikVar.b;
                        hii hiiVar2 = gneVar.g;
                        gneVar.h = gneVar.f(i, hiiVar, (hiiVar2 == null || !hiiVar2.equals(hiiVar)) ? hiiVar.c : true);
                        gneVar.g = hiiVar;
                        gneVar.h();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                boolean z8 = this.a;
                kpn kpnVar = (kpn) this.b;
                kpnVar.o = z8;
                kpnVar.w();
                return;
            case 8:
                yph yphVar = lvq.a;
                yph yphVar2 = lvq.a;
                boolean Z = yphVar2.l().Z();
                ?? r6 = this.b;
                if (Z) {
                    ((ype) yphVar2.l().ai((char) 4327)).y("updateImConversation: %s", Objects.toString(r6));
                }
                wer.c();
                moc mocVar = (moc) r6;
                moa moaVarA = mlq.e().a(mocVar.j, mocVar.k);
                if ((moaVarA instanceof lwz) && ((lwz) moaVarA).h(r6)) {
                    return;
                }
                if (this.a && ((lxb) r6).m()) {
                    z = true;
                }
                mocVar.r = z;
                int i = mocVar.q;
                String str = mocVar.l;
                yzy yzyVar = yzy.Kw;
                if (i == 0) {
                    yzyVar = yzy.Kx;
                } else if (i == 1) {
                    yzyVar = yzy.Ky;
                } else if (i == 2) {
                    yzyVar = yzy.Kz;
                } else if (i == 3) {
                    yzyVar = yzy.KA;
                } else if (i == 4) {
                    yzyVar = yzy.KB;
                } else if (i == 5) {
                    yzyVar = yzy.KC;
                }
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PROJECTION_NOTIFICATION, yzyVar);
                rrbVarH.p(new ComponentName(str, ""));
                ohsVarJ.F(rrbVarH.l());
                lwz lwzVar = (lwz) r6;
                if (!lwo.a().c(lwzVar.b())) {
                    lvq.f(lwzVar);
                    return;
                } else {
                    ((ype) yphVar2.l().ai((char) 4325)).u("Trying to get Smart Actions");
                    lwo.a().d(lwzVar.a, (int) actj.d()).fE(lbh.d(), new lsh(r6, i));
                    return;
                }
            case 9:
                pap papVar = ((pao) this.b).b;
                papVar.j = this.a;
                pak pakVar = papVar.h;
                pbg pbgVar = papVar.g;
                pan panVar = (pan) pakVar;
                panVar.c = papVar.d;
                panVar.b = pbgVar;
                panVar.g.postDelayed(panVar.i, 25000L);
                panVar.f.execute(new oyy(pakVar, 8));
                return;
            case 10:
                Object obj3 = this.b;
                pgr pgrVar = (pgr) obj3;
                woy.aa(((pgn) pgrVar.an.v()).a(), "Start request remained scheduled after WPP became not ready to send");
                if (pgr.ab()) {
                    int i2 = ((uk) pgrVar.at.v()).a;
                    boolean z9 = i2 == 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    woy.aa(z9, "Start request remained scheduled after user intention was unset");
                } else {
                    woy.aa(((Boolean) pgrVar.am.v()).booleanValue(), "Start request remained scheduled after user intention set false");
                }
                boolean z10 = this.a;
                woy.aa(z10 || (pgrVar.ao.v() instanceof pgi), "Start request remained scheduled when start request journey not from MD");
                pgrVar.p();
                if (z10) {
                    pgrVar.ao.w(new pgi(new gjv(pgrVar.Q)));
                    pgrVar.w(yxi.WIRELESS_MD_PROJECTION_REQUEST_LOOP_INITIATED);
                }
                yph yphVar3 = pgr.a;
                ((ype) ((ype) yphVar3.f()).ai((char) 6569)).u("User intends to start projection. Sending start request.");
                ((ype) ((ype) yphVar3.f()).ai((char) 6606)).u("Send WifiStartRequest.");
                pgrVar.w(yxi.WIRELESS_WIFI_MD_PROJECTION_REQUESTED);
                pdk pdkVar = pgrVar.z;
                Object obj4 = pgrVar.L;
                pdkVar.c(obj4);
                pdkVar.f(new pfp(obj3, c == true ? 1 : 0), obj4, pgrVar.K.toMillis());
                if (aczv.ab()) {
                    abnp abnpVarN = xpx.a.n();
                    abnpVarN.t();
                    xpx xpxVar2 = (xpx) abnpVarN.b;
                    xpxVar2.e = 2;
                    xpxVar2.b = 4 | xpxVar2.b;
                    xpxVar = (xpx) abnpVarN.q();
                } else {
                    xpxVar = xpx.a;
                }
                pdz pdzVar = pgrVar.S;
                xpr xprVar = xpr.MESSAGE_WIFI_REQUEST_START_BT;
                pgrVar.H(pdzVar, xpxVar, xprVar);
                if (Build.VERSION.SDK_INT >= 30) {
                    pgrVar.H(pgrVar.T, xpxVar, xprVar);
                }
                pgrVar.J(pag.WIFI_PROJECTION_RESTART_REQUESTED);
                return;
            case 11:
                boolean z11 = this.a;
                Object obj5 = this.b;
                if (z11) {
                    ((qfp) obj5).a.interactionModerator.k(gsn.j, yzz.DRAWER);
                    return;
                } else {
                    ((qfp) obj5).a.interactionModerator.k(gsn.k, yzz.DRAWER);
                    return;
                }
            case 12:
                rfr rfrVar = (rfr) this.b;
                int iA = rfrVar.a();
                int andSet = rfrVar.e.getAndSet(iA);
                yop yopVarAi = rfr.a.f().ai(7971);
                Integer numValueOf = Integer.valueOf(iA);
                zjc zjcVar = zjc.a;
                zjd zjdVar = new zjd(zjcVar, numValueOf);
                zjd zjdVar2 = new zjd(zjcVar, Integer.valueOf(andSet));
                boolean z12 = this.a;
                yopVarAi.R("maybeNotifyFocusStackChange: currentFocusGrant %s, oldFocusGrant %s, forceNotify: %s", zjdVar, zjdVar2, new zjd(zjcVar, Boolean.valueOf(z12)));
                if (z12 || iA != andSet) {
                    Object obj6 = rfrVar.f.a;
                    Handler handler = ((rfq) obj6).c;
                    if (handler != null) {
                        handler.post(new ral(obj6, 10));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                Iterator it = ((sab) this.b).f.iterator();
                while (it.hasNext()) {
                    ((rzz) it.next()).i(this.a);
                }
                return;
            case 14:
                ((tvz) this.b).b(this.a);
                return;
            default:
                if (this.a) {
                    adtn adtnVar = ((adtk) this.b).a;
                    adtnVar.p = true;
                    if (adtnVar.l > 0) {
                        xya xyaVar = adtnVar.o;
                        xyaVar.d();
                        xyaVar.e();
                    }
                }
                ((adtk) this.b).a.q = false;
                return;
        }
    }

    public jgv(Object obj, boolean z, int i, byte[] bArr) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }
}
