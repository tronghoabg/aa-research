package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.SessionInfo;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class jsf extends jrh {
    public static final yph a = yph.c("CarApp.H.Tem");
    private View r;
    private final jsp q = new jsp();
    private boolean s = false;
    private final ebf v = new jse(this);
    private juf t = new juf();
    private mqb u = null;
    mqb b = null;

    private final geu V() {
        mqb mqbVar = this.u;
        mqbVar.getClass();
        return this.q.c(mqbVar, b());
    }

    private final void W() {
        w wVar = new w(S());
        wVar.k(this.t);
        jsp jspVar = this.q;
        bt btVar = jspVar.mFragmentManager;
        if (btVar != null && btVar != wVar.a) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + jspVar.toString() + " is already attached to a FragmentManager.");
        }
        wVar.m(new cb(5, jspVar));
        wVar.c();
        ViewGroup viewGroup = (ViewGroup) jspVar.getView();
        viewGroup.getClass();
        viewGroup.setDescendantFocusability(131072);
        View view = this.r;
        if (view != null) {
            view.requestFocus();
        }
        if (Objects.equals(q().getAction(), "android.intent.action.CALL")) {
            V().c().b();
        }
    }

    private final boolean X() {
        return S().f("in_call_view_fragment_tag") != null;
    }

    @ResultIgnorabilityUnspecified
    private final boolean Y(Intent intent) {
        gkw gkwVar;
        gkw gkwVar2;
        try {
            mqb mqbVar = this.b;
            if (mqbVar == null || !mqbVar.equals(mqb.b(intent))) {
                String stringExtra = intent.getStringExtra("GH.CarAppServiceKey");
                mqb mqbVarC = stringExtra == null ? null : mpl.c(stringExtra);
                if (mqbVarC != null) {
                    mqbVar = mqbVarC;
                } else if (mqbVar == null) {
                    throw new IllegalArgumentException("GH.CarAppServiceKey is not set");
                }
                mqbVar.d(intent);
                intent.removeExtra("GH.CarAppServiceKey");
                ((ype) ((ype) a.e()).ai((char) 2741)).y("Intent to bind to car app service %s", intent);
            }
            this.u = mqbVar;
            if (gkx.c(intent)) {
                yph yphVar = a;
                ((ype) ((ype) yphVar.f()).ai(2738)).R("Intent received in Gearhead is %s with Intent Data as %s and Intent Action as %s", intent, intent.getData(), intent.getAction());
                ComponentName component = intent.getComponent();
                boolean z = component != null && (new tgw(mki.a.c, acob.q()).a(component.getPackageName()) || tgx.c(new ijt(17), acob.q()).contains(component.getPackageName()));
                intent.getClass();
                String action = intent.getAction();
                String scheme = intent.getScheme();
                if (!gkx.f(intent, "geo.action")) {
                    if (gkx.e(intent) && affa.f(action, "androidx.car.app.action.NAVIGATE")) {
                        Log.d("CarApp.H.Tem", "[VALID] Mobile Consistent Intent is a Nav to Home / Work specific intent");
                    } else if ((affa.f(intent.getAction(), "androidx.car.app.action.NAVIGATE") || affa.f(intent.getAction(), "android.intent.action.VIEW")) && gkx.f(intent, "geo") && gkx.d(intent.getData())) {
                        Log.d("CarApp.H.Tem", "[VALID] Mobile Consistent Intent is a Navigation / Search specific intent");
                    } else {
                        Log.e("CarApp.H.Tem", a.bM(scheme, action, "[INVALID] Mobile Consistent Intent is not in the right format, intentAction: ", ", intentScheme: "));
                        gkwVar = gld.a;
                    }
                    gkwVar = gky.a;
                } else if (affa.f(action, "android.intent.action.VIEW") && gkx.g(String.valueOf(intent.getData()))) {
                    Log.d("CarApp.H.Tem", "[VALID] Mobile Consistent Intent is a custom type intent ");
                    gkwVar = gky.a;
                } else {
                    Log.w("CarApp.H.Tem", "[INVALID] Mobile Consistent Intent is following incorrect format for custom intents");
                    gkwVar = gld.a;
                }
                if (affa.f(gkwVar, gky.a)) {
                    gkwVar2 = gkwVar;
                } else {
                    if (!affa.f(gkwVar, gld.a)) {
                        java.util.Objects.toString(gkwVar);
                        throw new IllegalArgumentException("Unexpected IntentFormat: ".concat(gkwVar.toString()));
                    }
                    ComponentName component2 = intent.getComponent();
                    gkwVar2 = (affa.f(component2 != null ? component2.getPackageName() : null, "com.waze") && z) ? gle.a : gkv.a;
                }
                gks.h("CarApp.H.Tem", "Converting %s to %s, input intent is: %s", gkwVar, gkwVar2, intent);
                gkwVar.a(gkwVar2, intent);
                gks.h("CarApp.H.Tem", "Intent transformed, output intent is: %s", intent);
                ((ype) ((ype) yphVar.f()).ai(2739)).R("Gearhead Converted Intent is %s with Intent Data as %s and Intent Action as %s", intent, intent.getData(), intent.getAction());
                intent.getClass();
                String action2 = intent.getAction();
                if (action2 != null && affa.f(action2, "android.intent.action.SEARCH")) {
                    oct octVar = ((ouv) this).d.p;
                    if (octVar.i()) {
                        octVar.h();
                    }
                }
            }
            jsp jspVar = this.q;
            jspVar.h(b());
            jspVar.e(intent);
            if (b().getDisplayType() != 0) {
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzy.JA);
                ComponentName component3 = intent.getComponent();
                component3.getClass();
                rrbVarH.p(component3);
                ohsVarJ.f(rrbVarH);
            }
            return true;
        } catch (IllegalArgumentException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 2740)).y("Intent is not valid %s", intent);
            return false;
        }
    }

    public static void l(Intent intent, mqb mqbVar) {
        intent.putExtra("GH.CarAppServiceKey", mqbVar.c());
    }

    @Override // defpackage.jrh, defpackage.ouv, defpackage.qru, defpackage.qrq, defpackage.qqh
    public void a(Bundle bundle) {
        Fragment fragmentD;
        leh.a();
        if (leh.a().b()) {
            setTheme(R.style.Theme_Template_Material);
        } else {
            setTheme(R.style.Theme_Template_Material_Dark);
        }
        super.a(bundle);
        ((ype) a.l().ai((char) 2734)).u("TemplateCarActivity onCreate");
        v(R.layout.template_car_activity_layout);
        jsp jspVar = this.q;
        jspVar.u = ((ouv) this).d.n;
        jspVar.i = new jwh(O());
        jspVar.v = ((ouv) this).d.p;
        if (bundle != null) {
            String string = bundle.getString("GH.CarAppServiceKey");
            if (string != null) {
                this.b = mpl.c(string);
            }
            this.s = bundle.getBoolean("GH.HideInCallViewKey");
            if (leh.a().b()) {
                bt btVarS = S();
                String string2 = bundle.getString("GH.InCallViewFragmentKey");
                if (string2 == null) {
                    fragmentD = null;
                } else {
                    fragmentD = btVarS.d(string2);
                    if (fragmentD == null) {
                        btVarS.W(new IllegalStateException("Fragment no longer exists for key GH.InCallViewFragmentKey: unique id ".concat(string2)));
                    }
                }
                if (fragmentD != null) {
                    this.t = (juf) fragmentD;
                }
            }
        }
        if (!Y(q())) {
            fp();
            return;
        }
        w wVar = new w(S());
        wVar.q(R.id.fragment_container, jspVar, null);
        wVar.c();
    }

    protected SessionInfo b() {
        String stringExtra = q().getStringExtra("TemplateCarActivity.SESSION_ID");
        return stringExtra != null ? new SessionInfo(0, stringExtra) : SessionInfo.DEFAULT_SESSION_INFO;
    }

    @Override // defpackage.qrq, defpackage.qqh
    public final void c() {
        if (this.q.j()) {
            return;
        }
        super.c();
    }

    @Override // defpackage.ouv, defpackage.qrq, defpackage.qqh
    public final void d(Configuration configuration) {
        super.d(configuration);
        if (leh.a().b()) {
            m(ksa.d().c());
            if (X()) {
                ((ype) a.l().ai((char) 2733)).u("Recreating In-Call View Fragment.");
                w wVar = new w(S());
                wVar.j(this.t);
                wVar.c();
                w wVar2 = new w(S());
                wVar2.o(this.t);
                wVar2.c();
            }
        }
    }

    @Override // defpackage.qrq, defpackage.qqh
    public void e(Intent intent) {
        super.e(intent);
        M(intent);
        ((ype) a.l().ai((char) 2735)).u("TemplateCarActivity onNewIntent");
        Y(intent);
        o();
    }

    @Override // defpackage.ouv, defpackage.qrq, defpackage.qqh
    public final void g(Bundle bundle) {
        super.g(bundle);
        mqb mqbVar = this.q.p;
        bundle.putString("GH.CarAppServiceKey", mqbVar != null ? mqbVar.c() : null);
        bundle.putBoolean("GH.HideInCallViewKey", this.s);
        if (leh.a().b() && this.t.isAdded()) {
            bt btVarS = S();
            juf jufVar = this.t;
            if (jufVar.mFragmentManager != btVarS) {
                btVarS.W(new IllegalStateException(a.bm(jufVar, "Fragment ", " is not currently in the FragmentManager")));
            }
            bundle.putString("GH.InCallViewFragmentKey", jufVar.mWho);
        }
    }

    @Override // defpackage.ouv, defpackage.qru, defpackage.qrq, defpackage.qqh
    public final void h() {
        super.h();
        if (leh.a().b()) {
            ksa.d().e.fE(this, new hlg(this, 3));
        }
        if (this.s) {
            W();
            this.s = false;
        }
        o();
        ebf.A().D(this.v);
    }

    @Override // defpackage.ouv, defpackage.qru, defpackage.qrq, defpackage.qqh
    public final void j() {
        super.j();
        ebf.A().E(this.v);
    }

    public final void m(krz krzVar) {
        int iB = krr.q.b(V(), krzVar);
        B(R.id.fragment_container).setBackgroundColor(iB);
        ((ype) ((ype) a.f()).ai((char) 2742)).w("FragmentContainer background color set: 0x%x", iB);
    }

    public final void o() {
        View viewFindFocus;
        mqb mqbVarE;
        mqb mqbVar = this.u;
        Intent intentQ = q();
        if (intentQ != null && (mqbVarE = mov.e(intentQ)) != null) {
            mqbVar = mqbVarE;
        }
        jsp jspVar = this.q;
        View view = jspVar.getView();
        if (view != null && (viewFindFocus = view.findFocus()) != null) {
            this.r = viewFindFocus;
        }
        if (mqbVar != null) {
            Context baseContext = getBaseContext();
            for (CarCall carCall : ebf.A().k()) {
                int i = carCall.e;
                if (i == 9 || i == 8 || odn.a().I(i)) {
                    ComponentName componentName = mqbVar.a;
                    String packageName = componentName.getPackageName();
                    String packageName2 = mcd.A().b(carCall).getPackageName();
                    if (packageName2.equals(baseContext.getPackageName()) ? mqbVar.equals(lvl.D(baseContext)) || mqbVar.equals(mpl.b(mkn.b)) : packageName.equals(packageName2)) {
                        if (X()) {
                            this.t.d(componentName.getPackageName());
                            juf jufVar = this.t;
                            if (mcd.B(jufVar.a()) == 1) {
                                if (jufVar.c && jufVar.getContext() != null) {
                                    jufVar.c();
                                }
                            } else if (leh.a().b()) {
                                jufVar.b();
                            } else {
                                jufVar.g(false);
                            }
                        } else {
                            if (!leh.a().b()) {
                                this.t = new juf();
                            }
                            juf jufVar2 = this.t;
                            geu geuVarV = V();
                            jufVar2.l = geuVarV;
                            jufVar2.k.b = geuVarV;
                            this.t.d(componentName.getPackageName());
                            ViewGroup viewGroup = (ViewGroup) jspVar.getView();
                            kad.f(yzy.sO, componentName);
                            viewGroup.getClass();
                            viewGroup.setDescendantFocusability(393216);
                            w wVar = new w(S());
                            wVar.e(R.id.fragment_container, this.t, "in_call_view_fragment_tag", 1);
                            bt btVar = jspVar.mFragmentManager;
                            if (btVar != null && btVar != wVar.a) {
                                throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + jspVar.toString() + " is already attached to a FragmentManager.");
                            }
                            wVar.m(new cb(4, jspVar));
                            wVar.c();
                        }
                        if (intentQ == null || !Objects.equals(intentQ.getAction(), "com.google.android.gearhead.telecom.SELECT_PHONE_ACCOUNT")) {
                            return;
                        }
                        ofe ofeVar = off.a().b;
                        if (ofeVar != null) {
                            this.t.h(ofeVar);
                        } else {
                            ((ype) ((ype) a.h()).ai((char) 2737)).u("Received action select phone account intent but there is no call to select phone account for anymore");
                        }
                        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_SIM_SELECTION, yzy.aJ).l());
                        M(new Intent());
                        return;
                    }
                }
            }
        }
        if (X()) {
            if (!Objects.equals(q().getAction(), "android.intent.action.CALL")) {
                W();
            } else {
                V().c().b();
                this.s = true;
            }
        }
    }

    @Override // defpackage.qqh
    public final boolean p(int i, KeyEvent keyEvent) {
        SessionInfo sessionInfo;
        jsp jspVar = this.q;
        mqb mqbVar = jspVar.p;
        return !(mqbVar == null || (sessionInfo = jspVar.q) == null || !jspVar.d(mqbVar, sessionInfo).onKeyUp(i, keyEvent)) || super.p(i, keyEvent);
    }
}
