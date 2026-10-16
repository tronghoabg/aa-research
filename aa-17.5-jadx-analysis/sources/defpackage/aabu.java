package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.LatLngBounds;
import com.google.android.libraries.maps.model.MapColorScheme;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class aabu implements zwl {
    private aacq A;
    private final gjt B;
    private final sm C;
    private final erb D;
    ufs a;
    public final tnq b;
    public final trk c;
    private final trc d;
    private final tpm e;
    private final ztt f;
    private final aacz g;
    private final aaei h;
    private final zxb i;
    private final aaco j;
    private final zyc k;
    private final aabp l;
    private final zys m;
    private final ztc n;
    private final zuh o;
    private final aaat p;
    private final aace q;
    private int r;
    private String s;
    private boolean t;
    private final String u;
    private volatile boolean v;
    private final zuu w;
    private final aabc x;
    private final ul y;
    private final aacq z;

    public aabu(aabc aabcVar, String str, trc trcVar, tnq tnqVar, trk trkVar, ztt zttVar, aacz aaczVar, aaei aaeiVar, zxb zxbVar, aaco aacoVar, zyc zycVar, aabp aabpVar, ul ulVar, sm smVar, erb erbVar, zys zysVar, ztc ztcVar, zuh zuhVar, zvz zvzVar, zuu zuuVar, gjt gjtVar, aaat aaatVar, aacq aacqVar, boolean z, aace aaceVar) {
        addm.g();
        this.v = false;
        this.x = aabcVar;
        this.d = trcVar;
        this.b = tnqVar;
        this.c = trkVar;
        this.f = zttVar;
        this.g = aaczVar;
        this.h = aaeiVar;
        this.i = zxbVar;
        this.j = aacoVar;
        this.k = zycVar;
        this.l = aabpVar;
        this.y = ulVar;
        this.C = smVar;
        this.D = erbVar;
        this.m = zysVar;
        this.n = ztcVar;
        this.o = zuhVar;
        this.r = 1;
        this.s = null;
        this.t = true;
        this.w = zuuVar;
        this.u = str;
        this.B = gjtVar;
        this.a = null;
        this.A = null;
        this.p = aaatVar;
        this.z = aacqVar;
        this.q = aaceVar;
        if (trcVar != null) {
            trcVar.c(str);
        }
        if (trcVar != null) {
            txw txwVar = trkVar != null ? new txw(this, 5) : null;
            txw txwVar2 = new txw(this, 6);
            trcVar.h().getClass();
            tnv tnvVar = tnqVar.q;
            new tpp(txwVar, txwVar2, z);
        }
        this.e = new tpn(tnqVar);
        String strA = addy.a.gu().a();
        if (woy.am(strA)) {
            return;
        }
        if (woy.at("blocked", strA)) {
            zvzVar.c(new zxq(2, gjtVar.F(R.string.maps_quota_blocked_user_error_message), "The Google Maps SDK has been disabled for this application. This might be because of an incorrectly configured project, or an invalid API key. See the Google API console: https://console.developers.google.com, and information about Obtaining an API key: https://developers.google.com/maps/documentation/android-sdk/signup.", null, null));
            zrn.a(5, strA.concat("The Google Maps SDK has been disabled for this application. This might be because of an incorrectly configured project, or an invalid API key. See the Google API console: https://console.developers.google.com, and information about Obtaining an API key: https://developers.google.com/maps/documentation/android-sdk/signup."), new Object[0]);
            o(strA.concat(String.valueOf(gjtVar.F(R.string.maps_quota_blocked_user_error_message))));
        } else if (woy.at("exceeded", strA)) {
            zvzVar.c(new zxq(3, gjtVar.F(R.string.maps_out_of_quota_user_error_message), "The number of requests has exceeded the usage limits for the Google Maps SDK.", null, null));
            zrn.a(5, strA.concat("The number of requests has exceeded the usage limits for the Google Maps SDK."), new Object[0]);
        } else if (woy.at("ok", strA)) {
            zvzVar.c(new zxq(1, "", "", null, null));
        } else {
            zrn.a(5, a.bq(strA, "Invalid value for Quota Override Flag: ", ". Value has to be one of blocked, exceeded, ok."), new Object[0]);
        }
    }

    private final void ab() {
        String str;
        int i = this.r;
        if (i != 1) {
            str = null;
            if (i == 2 ? !this.u.isEmpty() : !(i != 3 && i != 4)) {
                str = "s.t:33|p.v:off";
            }
        } else {
            str = this.s;
        }
        txu txuVar = (txu) this.b.c();
        if (txuVar.K) {
            txl txlVar = txuVar.J;
            synchronized (((txn) txlVar).c) {
                if (Objects.equals(str, ((txn) txlVar).k.m)) {
                    return;
                }
                wu wuVar = new wu(((txn) txlVar).k);
                wuVar.c = str;
                ((txn) txlVar).k = wuVar.e();
                txuVar.v();
            }
        }
    }

    private final void ac(int i) {
        tnq tnqVar = this.b;
        erb erbVar = this.D;
        if (i == 1) {
            tnqVar.v.k(erbVar);
        } else {
            tnqVar.v.l(erbVar);
        }
    }

    @Override // defpackage.zwl
    public final void A(boolean z) {
        this.h.x().f = z;
    }

    @Override // defpackage.zwl
    public final void B(boolean z) {
        aacx aacxVarX = this.h.x();
        aacxVarX.e = z;
        aacxVarX.c = z;
        aacxVarX.d = z;
        aacxVarX.b = z;
    }

    @Override // defpackage.zwl
    public final void C(LatLngBounds latLngBounds) {
        this.g.e(latLngBounds);
    }

    @Override // defpackage.zwl
    public final void D(@MapColorScheme int i) {
        if (i == 0) {
            this.b.m(false);
        } else if (i == 1) {
            this.b.m(true);
        } else if (i != 2) {
            return;
        } else {
            this.b.m((((Context) this.B.a).getResources().getConfiguration().uiMode & 48) == 32);
        }
        zys zysVar = this.m;
        aahu aahuVar = aahu.MAP_SET_DARK_MODE;
        int i2 = this.r;
        int i3 = 4;
        int i4 = i != 1 ? i != 2 ? 2 : 4 : 3;
        if (i2 == 0) {
            i3 = 6;
        } else if (i2 != 2) {
            i3 = i2 != 3 ? i2 != 4 ? 2 : 5 : 3;
        }
        abnp abnpVarN = yvv.a.n();
        abnp abnpVarN2 = yvu.a.n();
        abnpVarN2.t();
        yvu yvuVar = (yvu) abnpVarN2.b;
        yvuVar.c = i4 - 1;
        yvuVar.b |= 1;
        abnpVarN2.t();
        yvu yvuVar2 = (yvu) abnpVarN2.b;
        yvuVar2.d = i3 - 1;
        yvuVar2.b |= 2;
        yvu yvuVar3 = (yvu) abnpVarN2.q();
        abnpVarN.t();
        yvv yvvVar = (yvv) abnpVarN.b;
        yvuVar3.getClass();
        yvvVar.c = yvuVar3;
        yvvVar.b = 6;
        zysVar.c(aahuVar, (yvv) abnpVarN.q());
    }

    @Override // defpackage.zwl
    public final void E(String str) {
        this.s = str;
        ab();
    }

    @Override // defpackage.zwl
    public final void F(int i) {
        ztc ztcVar;
        this.r = i;
        if (this.t) {
            ac(i);
            zuh zuhVar = this.o;
            if (zuhVar == null || (ztcVar = this.n) == null) {
                ztc ztcVar2 = this.n;
                if (ztcVar2 != null && ztcVar2.a) {
                    tnq tnqVar = this.b;
                    boolean z = ztcVar2.b;
                    tnn tnnVarC = tnqVar.c();
                    txu txuVar = (txu) tnnVarC;
                    txuVar.r();
                    synchronized (txuVar.B) {
                        txr txrVar = ((txu) tnnVarC).E;
                        if (txrVar == null) {
                            txrVar = ((txu) tnnVarC).C;
                        }
                        ulx ulxVar = z ? ulx.E : ulx.D;
                        txq txqVar = new txq(txrVar);
                        txqVar.b(ulxVar.a(txrVar.a.c));
                        ((txu) tnnVarC).x(txqVar.a());
                    }
                    return;
                }
            } else {
                tnq tnqVar2 = this.b;
                boolean z2 = zuhVar.d;
                txu txuVar2 = (txu) tnqVar2.c();
                txuVar2.s();
                if (z2 != txuVar2.d) {
                    txuVar2.d = z2;
                    if (txuVar2.C()) {
                        txuVar2.g();
                    }
                }
                boolean z3 = ztcVar.a;
                txu txuVar3 = (txu) tnqVar2.c();
                txuVar3.U = z3;
                if (txuVar3.C()) {
                    txuVar3.g();
                } else if (txuVar3.i(tns.SATELLITE)) {
                    txuVar3.h();
                }
            }
            if (i == 0) {
                this.b.o();
            } else if (i == 1) {
                this.b.p();
            } else if (i == 2) {
                tnn tnnVarC2 = this.b.c();
                txu txuVar4 = (txu) tnnVarC2;
                txuVar4.f(tns.SATELLITE, true);
                txuVar4.F();
                synchronized (txuVar4.B) {
                    txr txrVar2 = ((txu) tnnVarC2).E;
                    if (txrVar2 == null) {
                        txrVar2 = ((txu) tnnVarC2).C;
                    }
                    txq txqVar2 = new txq(txrVar2);
                    txqVar2.b(ulx.y.a(txrVar2.a.c));
                    ((txu) tnnVarC2).x(txqVar2.a());
                }
            } else if (i != 3) {
                tnq tnqVar3 = this.b;
                if (i != 4) {
                    tnqVar3.p();
                } else {
                    tnqVar3.c().h();
                }
            } else {
                tnn tnnVarC3 = this.b.c();
                txu txuVar5 = (txu) tnnVarC3;
                txuVar5.f(tns.TERRAIN, true);
                txuVar5.F();
                synchronized (txuVar5.B) {
                    txr txrVar3 = ((txu) tnnVarC3).E;
                    if (txrVar3 == null) {
                        txrVar3 = ((txu) tnnVarC3).C;
                    }
                    txq txqVar3 = new txq(txrVar3);
                    txqVar3.b(ulx.z.a(txrVar3.a.c));
                    ((txu) tnnVarC3).x(txqVar3.a());
                }
            }
            ab();
        }
    }

    @Override // defpackage.zwl
    public final void G(float f) {
        this.g.f(f);
    }

    @Override // defpackage.zwl
    public final void H(float f) {
        this.g.g(f);
    }

    @Override // defpackage.zwl
    public final void I(String str, Set set) {
        boolean z;
        aabp aabpVar = this.l;
        aabpVar.a.a();
        Map map = aabpVar.d;
        map.put(str, set);
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (!((Set) it.next()).isEmpty()) {
                z = true;
                break;
            }
        }
        aabpVar.c.e(z);
    }

    @Override // defpackage.zwl
    public final void J(vgm vgmVar) {
        aabp aabpVar = this.l;
        aabpVar.a.a();
        aabpVar.f = vgmVar;
    }

    @Override // defpackage.zwl
    public final void K(vgs vgsVar) {
        aabp aabpVar = this.l;
        aabpVar.a.a();
        aabpVar.g = vgsVar;
    }

    @Override // defpackage.zwl
    public final void L(vhn vhnVar) {
        aabp aabpVar = this.l;
        aabpVar.a.a();
        aabpVar.c.f(vhnVar != null);
        aabpVar.h = vhnVar;
        this.q.b = vhnVar != null;
    }

    @Override // defpackage.zwl
    public final void M() {
        if (this.n != null) {
            F(this.r);
        }
    }

    @Override // defpackage.zwl
    public final void N() {
        if (this.o != null) {
            F(this.r);
        }
    }

    @Override // defpackage.zwl
    public final boolean O() {
        return this.h.x().g;
    }

    @Override // defpackage.zwl
    public final boolean P() {
        return this.h.x().a;
    }

    @Override // defpackage.zwl
    public final boolean Q() {
        return this.h.x().h;
    }

    @Override // defpackage.zwl
    public final boolean R() {
        return this.h.x().f;
    }

    @Override // defpackage.zwl
    public final boolean S() {
        aacx aacxVarX = this.h.x();
        return aacxVarX.e && aacxVarX.c && aacxVarX.d && aacxVarX.b;
    }

    @Override // defpackage.zwl
    public final boolean T() {
        trc trcVar = this.d;
        if (trcVar != null) {
            return trcVar.f(this.u);
        }
        return false;
    }

    @Override // defpackage.zwl
    public final boolean U(boolean z) {
        boolean zC = addv.c();
        tnq tnqVar = this.b;
        if (zC) {
            tnqVar.c().f(tns.THREE_DIMENSIONAL, z);
            return z;
        }
        txu txuVar = (txu) tnqVar.c();
        if (txuVar.K) {
            uaj uajVar = txuVar.aa;
            if (uajVar != null && ((Boolean) uajVar.e.gu()).booleanValue()) {
                txuVar.f(tns.THREE_DIMENSIONAL, z);
                return z;
            }
            uvg uvgVar = txuVar.ac;
            uvgVar.p = z;
            uvgVar.k();
        }
        return z;
    }

    @Override // defpackage.zwl
    public final boolean V(boolean z) {
        ufs ufsVar;
        tnq tnqVar = this.b;
        if (z) {
            txu txuVar = (txu) tnqVar.c();
            if (txuVar.K) {
                if (txuVar.F == null) {
                    uft uftVar = txuVar.j;
                    uvg uvgVar = txuVar.ac;
                    usy usyVar = txuVar.ad;
                    ucf ucfVar = txuVar.g;
                    ukr ukrVarA = txuVar.a();
                    uly ulyVarP = txuVar.p();
                    txe txeVar = uftVar.s;
                    if (txeVar == null) {
                        throw new IllegalArgumentException("Labels cannot be null when creating an indoor overlay.");
                    }
                    tox toxVarS = uftVar.x.s(abgl.GMM_INDOOR);
                    ackk ackkVar = uftVar.a;
                    uiw uiwVar = uftVar.b;
                    uor uorVarA = uftVar.e.a(toxVarS, ukrVarA, true);
                    tzt tztVar = uftVar.r;
                    ums umsVar = uftVar.c;
                    ugq ugqVar = uftVar.d;
                    tmb tmbVar = uftVar.f;
                    ppo ppoVar = uftVar.g;
                    ScheduledExecutorService scheduledExecutorService = uftVar.h;
                    Executor executor = uftVar.i;
                    ukz ukzVar = uftVar.k;
                    ttw ttwVar = uftVar.j;
                    tpa tpaVar = uftVar.m;
                    boolean zBooleanValue = ((Boolean) uftVar.o.gu()).booleanValue();
                    ackk ackkVar2 = uftVar.p;
                    boolean z2 = uftVar.q;
                    aezk aezkVar = uftVar.n;
                    uaj uajVar = uftVar.t;
                    plq plqVar = uftVar.u;
                    txuVar.F = new ufm(uvgVar, usyVar, toxVarS, ukrVarA, uorVarA, new ugy(uvgVar, ackkVar, uiwVar, toxVarS, ukrVarA, uorVarA, true, 4, false, tztVar, ugqVar, tmbVar, executor, tpaVar, ulyVarP, null, plqVar.c(), ((tre) aezkVar.a()).a()), umsVar, ugqVar, tmbVar, scheduledExecutorService, new rjr(ppoVar, tmbVar), ttwVar, ukzVar, 4, txeVar, ucfVar, aezkVar, tpaVar, zBooleanValue, ackkVar2, z2, uajVar, plqVar);
                }
                txuVar.J.e(txuVar.F);
                txuVar.M.j((ufm) txuVar.F, txuVar.ac, txuVar.ai, txuVar.ad, new gjv(txuVar.g, (char[]) null));
                return z;
            }
        } else {
            txu txuVar2 = (txu) tnqVar.c();
            if (txuVar2.K && (ufsVar = txuVar2.F) != null) {
                txuVar2.J.f(ufsVar);
                txuVar2.M.e();
                return false;
            }
        }
        return z;
    }

    @Override // defpackage.zwl
    public final boolean W(boolean z) {
        this.b.n(tns.TRAFFIC, z);
        return z;
    }

    @Override // defpackage.zwl
    public final boolean X(boolean z) {
        if (!adds.c()) {
            return false;
        }
        this.b.n(tns.TRANSIT, z);
        return z;
    }

    @Override // defpackage.zwl
    public final void Y(vhu vhuVar) {
        this.y.c(vhuVar);
    }

    @Override // defpackage.zwl
    public final void Z(aacq aacqVar) {
        this.A = aacqVar;
        ufs ufsVar = this.a;
        if (ufsVar != null) {
            ufsVar.L(aacqVar);
        }
    }

    @Override // defpackage.zwl
    public final View a() {
        trk trkVar = this.c;
        return trkVar != null ? trkVar.f() : this.b.a();
    }

    @Override // defpackage.zwl
    public final sm aa() {
        return this.C;
    }

    @Override // defpackage.zwl
    public final yvv c() {
        return wox.aw(this.z, this.u);
    }

    @Override // defpackage.zwl
    public final ztc d() {
        return this.n;
    }

    @Override // defpackage.zwl
    public final ztt e() {
        return this.f;
    }

    @Override // defpackage.zwl
    public final zuh f() {
        return this.o;
    }

    @Override // defpackage.zwl
    public final zwy g() {
        return this.j;
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder();
        String strConcat = str.concat("  ");
        sb.append(strConcat);
        sb.append(name);
        sb.append(":");
        printWriter.println(sb.toString());
        boolean zA = addm.a.gu().a();
        trk trkVar = this.c;
        if (!zA || trkVar != null) {
            trkVar.gt(strConcat, printWriter);
        }
        tnq tnqVar = this.b;
        printWriter.println(strConcat.concat("MapContainer:"));
        String strValueOf = String.valueOf(tnqVar.r().o());
        StringBuilder sb2 = new StringBuilder();
        String strConcat2 = strConcat.concat("  ");
        sb2.append(strConcat2);
        sb2.append("CameraPosition: ");
        sb2.append(strValueOf);
        printWriter.println(sb2.toString());
        ackk ackkVar = tnqVar.f;
        printWriter.println(strConcat2 + "Labeler: " + (true != ((gjv) ackkVar.a()).r() ? "Legacy Labeler" : "Shared Labeler"));
        printWriter.println(strConcat2.concat("Renderer: Legacy Renderer"));
        tnqVar.c().gt(strConcat2, printWriter);
        tnqVar.c().gt(strConcat, printWriter);
    }

    @Override // defpackage.zwl
    public final zxb h() {
        return this.i;
    }

    @Override // defpackage.zwl
    public final zxf i() {
        return this.j;
    }

    @Override // defpackage.zwl
    public final zyc j() {
        return this.k;
    }

    @Override // defpackage.zwl
    public final String k() {
        return this.s;
    }

    @Override // defpackage.zwl
    public final String l() {
        return "P";
    }

    @Override // defpackage.zwl
    public final void m() {
        String str = this.u;
        if (ysi.R(str)) {
            return;
        }
        this.b.c().d(str);
    }

    @Override // defpackage.zwl
    public final void n() {
        this.b.c().d("");
    }

    @Override // defpackage.zwl
    public final void o(String str) {
        this.t = false;
        this.b.o();
        ac(0);
        zuu zuuVar = this.w;
        zuuVar.a(str);
        zuuVar.a.setVisibility(0);
    }

    @Override // defpackage.zwl
    public final void p(Boolean bool) {
        trc trcVar = this.d;
        if (trcVar == null) {
            return;
        }
        qsb qsbVarH = trcVar.h().h();
        String str = this.u;
        abgl abglVar = abgl.MAPS_API_DDS_1P;
        String strL = qsbVarH.l(str, abglVar);
        if (!bool.booleanValue() || strL == null) {
            if (bool.booleanValue()) {
                return;
            }
            this.b.j(abglVar.name());
            return;
        }
        tnq tnqVar = this.b;
        tox toxVarT = tnqVar.A.t(abglVar, "");
        wu wuVarC = ukr.c();
        wuVarC.b = strL;
        ukr ukrVarA = wuVarC.e().a(tnqVar.c().a());
        uvg uvgVar = (uvg) tnqVar.k.a();
        ackk ackkVar = tnqVar.h;
        ackk ackkVarE = ((tno) ackkVar.a()).e();
        uiw uiwVarC = ((tno) ackkVar.a()).c();
        usy usyVarR = tnqVar.r();
        uod uodVar = (uod) tnqVar.j.a();
        ugq ugqVar = tnqVar.d;
        ugqVar.getClass();
        tmb tmbVar = tnqVar.b;
        tmbVar.getClass();
        ackk ackkVar2 = tnqVar.i;
        ttt tttVar = new ttt((ukz) ackkVar2.a());
        ukz ukzVar = (ukz) ackkVar2.a();
        ukzVar.getClass();
        ((tno) ackkVar.a()).a().getClass();
        erb erbVar = tnqVar.B;
        erbVar.getClass();
        xyc xycVarL = wub.L(new tnp(0));
        ackk ackkVarF = ((tno) ackkVar.a()).f();
        boolean zR = ((gjv) tnqVar.f.a()).r();
        ppo ppoVar = tnqVar.c;
        DisplayMetrics displayMetrics = tnqVar.u;
        ufs ufsVarA = new uft(uvgVar, ackkVarE, uiwVarC, usyVarR, null, uodVar, tnqVar.v, tnqVar.r, ugqVar, tmbVar, ppoVar, tnqVar.s, tnqVar.t, tttVar, ukzVar, erbVar, null, tnqVar.e, tnqVar.g, xycVarL, ackkVarF, zR, displayMetrics, tnqVar.w, tnqVar.x).a(toxVarT, ukrVarA, ulz.a.a(false), false);
        this.a = ufsVarA;
        ufsVarA.L(this.A);
        tnqVar.q(abglVar.name(), this.a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [acku, java.lang.Object] */
    @Override // defpackage.zwl
    public final void q() {
        trc trcVar = this.d;
        if (trcVar != null) {
            tnq tnqVar = this.b;
            trcVar.a(tnqVar.hashCode());
            trcVar.b(tnqVar.hashCode());
        }
        aaat aaatVar = this.p;
        if (aaatVar != null) {
            aaatVar.a.g(aaatVar);
            aaatVar.b.b.remove(aaatVar);
        }
        if (this.o != null) {
            this.e.l(false);
        }
        tnq tnqVar2 = this.b;
        tnqVar2.v.l(this.D);
        aacm aacmVar = (aacm) this.i;
        if (aacmVar.e) {
            aaew aaewVar = aacmVar.b;
            Object obj = aaewVar.d;
            aacl aaclVar = (aacl) obj;
            aaclVar.c((twq) aaewVar.e, aaewVar.a);
            aaex aaexVar = aacmVar.c;
            SparseIntArray sparseIntArray = aaexVar.f;
            int i = sparseIntArray.get(R.drawable.maps_blue_dot, -1);
            if (i != -1) {
                aaexVar.b.c(aaexVar.g, i);
            }
            int i2 = sparseIntArray.get(R.drawable.maps_chevron, -1);
            if (i2 != -1) {
                aaexVar.b.c(aaexVar.g, i2);
            }
        }
        if (adeh.c()) {
            aaco aacoVar = this.j;
            uzy uzyVar = aacoVar.f;
            vae vaeVar = aacoVar.b;
            if (uzyVar.g(vaeVar)) {
                uzyVar.f(vaeVar);
            }
        }
        aabc aabcVar = this.x;
        ((qrx) aabcVar.l.a()).a();
        trk trkVar = this.c;
        if (trkVar != null) {
            trkVar.i();
        } else {
            tnqVar2.f();
        }
        ((pkx) ((aabn) aabcVar.n).W.a()).f(BitmapDescriptorFactory.HUE_RED);
        tnqVar2.r().g = null;
        p(false);
        aabp aabpVar = this.l;
        zrt zrtVar = aabpVar.a;
        zrtVar.a();
        aabpVar.d.clear();
        zrtVar.a();
        twq twqVar = aabpVar.i;
        if (twqVar == null) {
            return;
        }
        twqVar.b(null);
        aabpVar.i.c(null);
        aabpVar.i = null;
    }

    @Override // defpackage.zwl
    public final void t() {
        if (this.v) {
            trk trkVar = this.c;
            if (trkVar != null) {
                trkVar.j();
            } else {
                this.b.h();
            }
            this.v = false;
        }
        tnq tnqVar = this.b;
        ((uvg) tnqVar.k.a()).k();
        tnqVar.e();
    }

    @Override // defpackage.zwl
    public final void u() {
        if (this.v) {
            trk trkVar = this.c;
            if (trkVar != null) {
                trkVar.j();
            } else {
                this.b.h();
            }
            this.v = false;
        }
    }

    @Override // defpackage.zwl
    public final void v() {
        if (this.v) {
            return;
        }
        trk trkVar = this.c;
        if (trkVar != null) {
            trkVar.k();
        } else {
            this.b.i();
        }
        this.v = true;
    }

    @Override // defpackage.zwl
    public final void w() {
        this.g.d();
    }

    @Override // defpackage.zwl
    public final void x(boolean z) {
        this.h.x().g = z;
    }

    @Override // defpackage.zwl
    public final void y(boolean z) {
        this.h.x().a = z;
    }

    @Override // defpackage.zwl
    public final void z(boolean z) {
        this.h.x().h = z;
    }

    @Override // defpackage.zwl
    public final void r() {
    }

    @Override // defpackage.zwl
    public final void s() {
    }
}
