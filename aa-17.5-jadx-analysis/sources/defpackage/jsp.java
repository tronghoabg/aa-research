package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Insets;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.AppInfo;
import androidx.car.app.SessionInfo;
import com.google.android.apps.auto.components.apphost.view.TemplateView;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class jsp extends Fragment implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final yph a;
    private boolean A;
    public krz f;
    public Intent g;
    public FrameLayout h;
    public gku i;
    public obs j;
    public WindowInsets k;
    public TextView l;
    public qrn m;
    public Display n;
    public gdx o;
    public mqb p;
    public SessionInfo q;
    protected SessionInfo r;
    public oct u;
    public oct v;
    private VirtualDisplay x;
    private SharedPreferences y;
    private jrx z;
    public final jsd b = new jsr(this);
    public final jsd c = new jso(this);
    private final HashSet w = new HashSet();
    public final jti t = new jti();
    public final eqm d = new eqm();
    public final ges e = new jsc(this);
    public final jsj s = new jsj();

    static {
        ggj ggjVar = new ggj();
        if (ggj.b == null) {
            ggj.b = ggjVar;
        } else {
            ((ynz) ggj.a.h().ai(33)).u("Instance can only be set once");
        }
        a = yph.c("CarApp.H.Tem");
    }

    public jsp() {
        kio.b().v(new jsk(this));
    }

    private final mqb k() {
        mqb mqbVar = this.p;
        if (mqbVar != null) {
            return mqbVar;
        }
        throw new IllegalStateException("The app name should be set at this point");
    }

    private final void l(epr eprVar) {
        try {
            mqb mqbVarK = k();
            SessionInfo sessionInfo = this.q;
            sessionInfo.getClass();
            b(mqbVarK, sessionInfo).c(eprVar);
        } catch (gee e) {
            ((ype) ((ype) a.l().p(e)).ai(2761)).y("Failure while dispatching %s, race condition between invalidating the cache and the view being destroyed", eprVar);
        }
    }

    private final void m() {
        if (this.l == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.y;
        sharedPreferences.getClass();
        boolean z = sharedPreferences.getBoolean("debug_overlay_enabled", false);
        Object obj = this.o;
        gdy gdyVar = (gdy) obj;
        gdyVar.l = z;
        ((eqj) obj).j(gdyVar.r());
    }

    private final void n() {
        if (this.l == null) {
            return;
        }
        SharedPreferences sharedPreferences = this.y;
        sharedPreferences.getClass();
        boolean z = sharedPreferences.getBoolean("input_config_enabled", false);
        Object obj = this.o;
        gdy gdyVar = (gdy) obj;
        gdyVar.m = z;
        ((eqj) obj).j(gdyVar.r());
    }

    public final int a() {
        int i;
        int i2;
        int i3;
        int systemWindowInsetBottom;
        int systemWindowInsetTop;
        int i4;
        Context context = getContext();
        int systemWindowInsetLeft = 0;
        if (context != null) {
            i2 = context.getResources().getConfiguration().screenWidthDp;
            i3 = context.getResources().getConfiguration().screenHeightDp;
            i = context.getResources().getDisplayMetrics().densityDpi;
        } else {
            i = 160;
            i2 = 0;
            i3 = 0;
        }
        if (this.k == null) {
            i4 = 0;
        } else {
            int i5 = Build.VERSION.SDK_INT;
            WindowInsets windowInsets = this.k;
            if (i5 >= 30) {
                Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
                systemWindowInsetLeft = insets.left + insets.right;
                systemWindowInsetBottom = insets.bottom;
                systemWindowInsetTop = insets.top;
            } else {
                systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft() + this.k.getSystemWindowInsetRight();
                systemWindowInsetBottom = this.k.getSystemWindowInsetBottom();
                systemWindowInsetTop = this.k.getSystemWindowInsetTop();
            }
            i4 = systemWindowInsetTop + systemWindowInsetBottom;
        }
        return grx.b(i2 - ((systemWindowInsetLeft * 160) / i), i3 - ((i4 * 160) / i));
    }

    public final fug b(mqb mqbVar, SessionInfo sessionInfo) {
        jry jryVarG = jry.g();
        Pair pairCreate = Pair.create(mqbVar, sessionInfo);
        jsl jslVar = new jsl(this, mqbVar, sessionInfo, 1);
        if (!jryVarG.a) {
            throw new gee();
        }
        Map map = jryVarG.b;
        fug fugVar = (fug) map.get(pairCreate);
        if (fugVar == null) {
            fugVar = (fug) jslVar.get();
            map.put(pairCreate, fugVar);
        }
        hhz hhzVar = (hhz) fugVar.a(CloudRecognizerProtocolStrings.APP);
        if (!equals(((jsb) hhzVar.r()).c())) {
            Log.d("CarApp.H.Tem", "Fragment has been re-created, updating UI controller and template context in the host services");
            jsb jsbVar = new jsb(c(mqbVar, sessionInfo), this, mqbVar);
            hhzVar.g();
            hhzVar.x();
            hhzVar.d = jsbVar;
            hhzVar.y();
            geu geuVarC = c(mqbVar, sessionInfo);
            fugVar.e.B().c(fugVar, 7);
            fugVar.e = geuVarC;
            fugVar.e.c().a = fugVar;
            fugVar.e.D().a = fugVar.h;
            fugVar.e.B().b(fugVar, 7, new elt(fugVar, 16));
            gmg gmgVar = fugVar.b;
            gmgVar.g = geuVarC;
            AppInfo appInfo = gmgVar.l;
            if (appInfo != null) {
                try {
                    gmgVar.g.i().d(appInfo);
                } catch (ggm e) {
                    gdp gdpVar = new gdp();
                    gdpVar.a = e;
                    gmgVar.h(new gdq(gdpVar));
                }
            }
            Iterator it = fugVar.d.values().iterator();
            while (it.hasNext()) {
                ((fuh) it.next()).o(geuVarC);
            }
        }
        return fugVar;
    }

    final geu c(mqb mqbVar, SessionInfo sessionInfo) {
        ((ype) a.l().ai((char) 2748)).M("getTemplateContext AppKey: %s, SessionInfo: %s", mqbVar, sessionInfo);
        return (geu) this.c.b(Pair.create(mqbVar, sessionInfo));
    }

    protected final TemplateView d(mqb mqbVar, SessionInfo sessionInfo) {
        return (TemplateView) this.b.b(Pair.create(mqbVar, sessionInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Intent intent) {
        mqb mqbVarB = mqb.b(intent);
        mqbVarB.getClass();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 2744)).y("Binding to: %s", mqbVarB.c());
        this.q.getClass();
        mqb mqbVar = this.p;
        if (mqbVar != null && !mqbVarB.equals(mqbVar)) {
            SessionInfo sessionInfo = this.r;
            mqb mqbVar2 = this.p;
            if (sessionInfo != null) {
                b(mqbVar2, sessionInfo).c(epr.ON_STOP);
            } else {
                b(mqbVar2, this.q).c(epr.ON_STOP);
            }
            kad.e(kad.b(yzy.JC, this.p.a));
        }
        HashSet hashSet = this.w;
        if (hashSet.contains(mqbVarB)) {
            ((ype) yphVar.l().ai(2746)).M("Binding to an already bound app with updatedAppKey as %s and current set of connected apps as %s", mqbVarB, hashSet);
        }
        hashSet.remove(this.p);
        this.p = mqbVarB;
        this.g = intent;
        if (this.h == null) {
            ((ype) yphVar.l().ai((char) 2745)).u("View is not ready, will defer binding until after it's created");
            return;
        }
        SessionInfo sessionInfo2 = this.q;
        sessionInfo2.getClass();
        geu geuVarC = c(mqbVarB, sessionInfo2);
        gtt gttVar = (gtt) geuVarC.l(gtt.class);
        gttVar.getClass();
        gttVar.b(this.g);
        if (Objects.equals(intent.getAction(), "com.google.android.gms.car.ACTION_UPDATE_TURN_CARD_STATE")) {
            return;
        }
        SessionInfo sessionInfo3 = this.q;
        sessionInfo3.getClass();
        TemplateView templateViewD = d(mqbVarB, sessionInfo3);
        eqm eqmVar = templateViewD.q;
        eqa viewLifecycleOwner = getViewLifecycleOwner();
        eqm eqmVar2 = this.d;
        eqmVar2.getClass();
        eqmVar.fE(viewLifecycleOwner, new hlg(eqmVar2, 5));
        WindowInsets windowInsets = this.k;
        if (windowInsets != null) {
            templateViewD.k(windowInsets);
        }
        if (this.z != null) {
            FrameLayout frameLayout = this.h;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                if (this.z.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.z.getParent()).removeView(this.z);
                }
                this.h.addView(this.z);
                ((ype) ((ype) yphVar.f()).ai((char) 2762)).u("Remove all views and add a blank view");
                Context contextRequireContext = requireContext();
                int i = fgd.a;
                fgc fgcVarA = fgd.a(R.transition.template_view_transition, contextRequireContext);
                fgcVarA.getClass();
                fgcVarA.N(czd.class);
                this.z.post(new jda(this, fgcVarA, templateViewD, 7));
            }
        } else {
            Context contextRequireContext2 = requireContext();
            int i2 = fgd.a;
            fgc fgcVarA2 = fgd.a(R.transition.template_view_transition, contextRequireContext2);
            fgcVarA2.getClass();
            fgcVarA2.N(czd.class);
            mlq.S(this.h, fgcVarA2);
            this.h.removeAllViews();
            this.h.addView(templateViewD);
        }
        geuVarC.B().c(geuVarC, 10);
        geuVarC.B().b(geuVarC, 10, new jlh(this, mqbVarB, 11, (byte[]) null));
        SessionInfo sessionInfo4 = this.q;
        sessionInfo4.getClass();
        fug fugVarB = b(mqbVarB, sessionInfo4);
        mt.h(this.q, intent);
        ComponentName componentName = mqbVarB.a;
        rrb rrbVarB = kad.b(yzy.JB, componentName);
        rrbVarB.p(componentName);
        kad.e(rrbVarB);
        fugVarB.b();
        Iterator it = fugVarB.d.values().iterator();
        while (it.hasNext()) {
            ((fuh) it.next()).i(intent);
        }
        fugVarB.e.i();
        ynp ynpVarListIterator = jvd.c.listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            intent.removeExtra((String) ynpVarListIterator.next());
        }
        mt.h(fugVarB.e.b(), intent);
        gmg gmgVar = fugVarB.b;
        gmgVar.a(intent);
        fugVarB.c.d(gnr.b(1, gmgVar.c));
        hashSet.add(mqbVarB);
        eps epsVarA = getLifecycle().a();
        eps epsVar = eps.d;
        if (epsVarA.a(epsVar)) {
            fugVarB.c(epsVarA == epsVar ? epr.ON_START : epr.ON_RESUME);
        }
        if (((gmh) geuVarC.d()).b) {
            rrb rrbVarB2 = kad.b(yzy.sg, componentName);
            rrbVarB2.f(componentName.getPackageName());
            kad.e(rrbVarB2);
        }
    }

    public void f(mqb mqbVar, SessionInfo sessionInfo) {
        FrameLayout frameLayout;
        int i = gev.a;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Not running on main thread when it is required to.");
        }
        Pair pairCreate = Pair.create(mqbVar, sessionInfo);
        TemplateView templateView = (TemplateView) this.b.a.get(pairCreate);
        try {
            jry jryVarG = jry.g();
            if (!jryVarG.a) {
                throw new gee();
            }
            fug fugVar = (fug) jryVarG.b.get(pairCreate);
            if (fugVar != null) {
                fugVar.e();
            }
            if (Objects.equals(mqbVar, this.p) && Objects.equals(sessionInfo, this.q) && getLifecycle().a().a(eps.d)) {
                Intent intent = this.g;
                if (intent != null && intent.hasExtra("com.google.android.apps.auto.components.apphost.EXTRA_START_COMPONENT_ON_FINISH")) {
                    Parcelable parcelableExtra = this.g.getParcelableExtra("com.google.android.apps.auto.components.apphost.EXTRA_START_COMPONENT_ON_FINISH");
                    if (parcelableExtra != null) {
                        mpe.a().i(new Intent().setComponent((ComponentName) parcelableExtra));
                        return;
                    }
                    return;
                }
                nsv nsvVarM = nsr.c().b().m();
                if ((nsvVarM == nsv.f || nsvVarM == nsv.e || nsr.c().b().H()) && ((gmh) c(mqbVar, this.q).d()).b) {
                    mpe.a().i(mqbVar.a());
                } else {
                    mpe.a().i(new Intent().setComponent(mkn.s));
                }
            }
            if (templateView == null || (frameLayout = this.h) == null) {
                return;
            }
            frameLayout.removeView(templateView);
        } catch (gee e) {
            ((ype) ((ype) a.l().p(e)).ai((char) 2747)).u("Failure while attempting to finish an app, Android Auto has been stopped already");
        }
    }

    public final void g(mqb mqbVar, SessionInfo sessionInfo) {
        ((ype) a.l().ai((char) 2760)).M("removeAppFromCaches AppKey: %s, SessionInfo: %s", mqbVar, sessionInfo);
        jsd jsdVar = this.b;
        Pair pairCreate = Pair.create(mqbVar, sessionInfo);
        jsdVar.d(pairCreate);
        this.c.d(pairCreate);
        fug fugVar = (fug) jry.g().b.remove(pairCreate);
        if (fugVar != null) {
            fugVar.d();
        }
    }

    public final void h(SessionInfo sessionInfo) {
        this.r = this.q;
        this.q = sessionInfo;
    }

    protected boolean i() {
        return true;
    }

    @ResultIgnorabilityUnspecified
    public final boolean j() {
        mqb mqbVar = this.p;
        if (mqbVar == null) {
            return false;
        }
        SessionInfo sessionInfo = this.q;
        sessionInfo.getClass();
        geu geuVarC = c(mqbVar, sessionInfo);
        ghe gheVar = (ghe) geuVarC.l(ghe.class);
        if (gheVar != null) {
            gheVar.g(gsn.g);
        }
        if (!geuVarC.D().a) {
            return true;
        }
        mqb mqbVar2 = this.p;
        SessionInfo sessionInfo2 = this.q;
        sessionInfo2.getClass();
        hhz hhzVar = (hhz) b(mqbVar2, sessionInfo2).a(CloudRecognizerProtocolStrings.APP);
        hhzVar.g();
        hhzVar.t();
        hhzVar.c.a(new geh(gnk.x, new gss(hhzVar.a, 6)));
        return true;
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        tfk tfkVar = tfk.a;
        tfj tfjVar = tfj.GEARHEAD_CAL_ON_CONFIGURATION_CHANGED_FLOW;
        tfkVar.b(tfjVar);
        super.onConfigurationChanged(configuration);
        ((ype) a.l().ai((char) 2752)).y("onConfigurationChanged: %s", configuration);
        this.c.c(new iju(configuration, 16));
        tfkVar.d(tfjVar, 1);
        jrx jrxVar = this.z;
        if (jrxVar != null) {
            jrxVar.onConfigurationChanged(configuration);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        String string = getResources().getString(R.string.task_step_debug_text);
        String string2 = getResources().getString(R.string.template_debug_text);
        if (gdy.a == null) {
            gdy.a = new gdy(string, string2);
        }
        gdy gdyVar = gdy.a;
        this.o = gdyVar;
        gdyVar.l(this);
        this.o.fE(this, new hlg(this, 4));
        leh.a();
        this.A = true;
        return layoutInflater.inflate(R.layout.template_car_fragment, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        VirtualDisplay virtualDisplay = this.x;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        if (i()) {
            ((ype) a.l().ai((char) 2753)).u("TemplateCarFragment onPause");
            l(epr.ON_PAUSE);
            SharedPreferences sharedPreferences = this.y;
            sharedPreferences.getClass();
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
        }
        super.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 2754)).u("TemplateCarFragment onResume");
        if (leh.a().b()) {
            Configuration configuration = requireContext().getResources().getConfiguration();
            ((ype) yphVar.l().ai((char) 2755)).y("onResume config: %s", configuration);
            this.c.c(new iju(configuration, 17));
        }
        l(epr.ON_RESUME);
        SharedPreferences sharedPreferences = this.y;
        sharedPreferences.getClass();
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        m();
        n();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("debug_overlay_enabled")) {
            m();
        }
        if (str.equals("input_config_enabled")) {
            n();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 2756)).u("TemplateCarFragment onStart");
        try {
            mqb mqbVarK = k();
            SessionInfo sessionInfo = this.q;
            sessionInfo.getClass();
            fug fugVarB = b(mqbVarK, sessionInfo);
            if (!fugVarB.h && this.g != null) {
                ((ype) ((ype) yphVar.f()).ai(2758)).u("Rebinding to app because app was found to be unbound in onStart");
                e(this.g);
            }
            fugVarB.c(epr.ON_START);
        } catch (gee e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 2757)).u("Failure while dispatching ON_START, race condition between invalidating the cache and the view being destroyed");
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onStop() {
        if (i()) {
            ((ype) a.l().ai((char) 2759)).u("TemplateCarFragment onStop");
            l(epr.ON_STOP);
        }
        super.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Context context = getContext();
        context.getClass();
        Configuration configuration = context.getResources().getConfiguration();
        Object systemService = getContext().getSystemService("display");
        systemService.getClass();
        VirtualDisplay virtualDisplayCreateVirtualDisplay = ((DisplayManager) systemService).createVirtualDisplay("TemplateCarFragment", configuration.screenWidthDp, configuration.screenHeightDp, configuration.densityDpi, null, 8);
        this.x = virtualDisplayCreateVirtualDisplay;
        this.n = virtualDisplayCreateVirtualDisplay.getDisplay();
        this.h = (FrameLayout) view.findViewById(R.id.template_view_container);
        if (this.A) {
            this.z = new jrx(requireContext());
        }
        Intent intent = this.g;
        if (intent != null) {
            e(intent);
        }
        view.setOnApplyWindowInsetsListener(new jsg(this, 0));
        this.y = getContext().getSharedPreferences("action_developer_settings", 0);
        this.l = (TextView) view.findViewById(R.id.debug_overlay);
        leh.a();
        ksa.d().e.fE(getViewLifecycleOwner(), new hlg(this, 6));
    }

    @Override // android.support.v4.app.Fragment
    public final String toString() {
        String hexString = Integer.toHexString(hashCode());
        mqb mqbVar = this.p;
        String strC = mqbVar != null ? mqbVar.c() : null;
        SessionInfo sessionInfo = this.q;
        return "[" + hexString + ": " + strC + ": " + String.valueOf(sessionInfo != null ? sessionInfo : null) + "]";
    }
}
