package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentContainerView;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton;
import com.google.android.apps.auto.components.system.facetbar.CircleOverlayView;
import com.google.android.apps.auto.components.system.facetbar.ResizeButton;
import com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView;
import com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class niy extends Fragment implements nzh {
    private static final olo R;
    private static final Duration S;
    public ViewGroup A;
    public RailWidgetView B;
    public FragmentContainerView C;
    public ImageView D;
    public ResizeButton E;
    public View F;
    public View G;
    public RailHotseatItemView H;
    public RailHotseatItemView I;
    public RailHotseatItemView J;
    public RailHotseatItemView K;
    public final ydx L;
    public Fragment M;
    public jvo N;
    public final eqn O;
    public final eqn P;
    private boolean T;
    private ViewTreeObserver.OnPreDrawListener U;
    private final aezr V;
    private final aezr W;
    private final aezr X;
    private CoolwalkButton Y;
    private CoolwalkButton Z;
    private final eqn aa;
    public final njp c;
    public mpz d;
    public int e;
    public kxa f;
    public nip g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public ViewTreeObserver l;
    public ViewTreeObserver m;
    public nso n;
    public ocq o;
    public final aezr p;
    public final aezr q;
    public final afgl r;
    public CoolwalkButton s;
    public View t;
    public View u;
    public CoolwalkButton v;
    public View w;
    public CircleOverlayView x;
    public FragmentContainerView y;
    public ViewGroup z;
    public static final /* synthetic */ afia[] a = {new affn(niy.class, "fragmentHost", "getFragmentHost()Lcom/google/android/apps/auto/components/system/fragment/CarFragmentHost;", 0)};
    public static final yph b = yph.c("GH.GhRailFrg");
    private static final Duration Q = wub.ak(350);

    static {
        wub.ak(400);
        R = new olo(0.18f, 0.89f, 0.4f, 1.13f);
        S = wub.ak(600);
        wub.ak(250);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ niy(byte[] bArr) {
        super(nsr.c().b().F() ? R.layout.gh_coolwalk_vertical_facet_bar : nsr.c().b().J() ? R.layout.gh_coolwalk_facet_bar_rhd : R.layout.gh_coolwalk_facet_bar);
        njp njpVarA = njp.a.a();
        this.c = njpVarA;
        this.d = mpz.a;
        this.f = kxa.a;
        this.g = nip.b;
        esa esaVar = esa.a;
        this.V = woy.dG(new hfr(esaVar, this, 19, null));
        this.p = woy.dG(new mzp(new nav(this, 20), esaVar, this, 3));
        this.q = woy.dG(new mzp(new njb(this, 1), esaVar, this, 4));
        this.W = woy.dG(new hfr(esaVar, this, 20, null));
        getLifecycle().c(new mzq(this, 3));
        this.r = new mzr(this, 3);
        this.X = woy.dG(new ngv(5));
        this.L = new ydx(20);
        this.O = new mmt(this, 9);
        this.P = new mmt(this, 10);
        this.aa = new mmt(this, 11);
    }

    public static final void d(View view, long j) {
        view.animate().setStartDelay(j).withStartAction(new mhr(view, 16)).setDuration(Q.toMillis()).alpha(1.0f).translationY(BitmapDescriptorFactory.HUE_RED).setInterpolator(R).start();
    }

    public static final void e(View view) {
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(20.0f);
    }

    public static final void l(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        b.l().u("Remove OnPreDrawListener");
        viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
    }

    public static final void m(RailHotseatItemView railHotseatItemView, nmj nmjVar) {
        b.l().M("%s changed to %s", railHotseatItemView, nmjVar);
        int i = 0;
        if (nmjVar.a.b == 8 && nmjVar.d == null) {
            i = 8;
        }
        railHotseatItemView.setVisibility(i);
        if (railHotseatItemView.getVisibility() == 0) {
            railHotseatItemView.a(nmjVar);
        }
    }

    private final void n(int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        CoolwalkButton coolwalkButton = this.v;
        if (coolwalkButton == null) {
            affa.d("assistantIcon");
            coolwalkButton = null;
        }
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (coolwalkButton.h != dimensionPixelSize) {
            coolwalkButton.i = -2.1474836E9f;
            coolwalkButton.h = dimensionPixelSize;
            coolwalkButton.n(true);
            coolwalkButton.p(true);
        }
    }

    private final void o() {
        njp njpVar = this.c;
        njpVar.f().fE(getViewLifecycleOwner(), new med(new niw(this, 14), 20));
        njpVar.e().fE(getViewLifecycleOwner(), this.O);
        njpVar.g().fE(getViewLifecycleOwner(), this.P);
        njpVar.i(a().q).fE(getViewLifecycleOwner(), this.aa);
    }

    private final boolean p() {
        return ((Boolean) this.X.a()).booleanValue();
    }

    private static final void q(nge ngeVar, yzy yzyVar, String str, Object... objArr) {
        yop yopVarL = b.l();
        int length = objArr.length;
        String strD = ngeVar.d();
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str2.getClass();
        yopVarL.R("Not showing tooltip for display %s/%s: %s", ngeVar.c(), strD, str2);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.RAIL, yzyVar).l());
    }

    public final njw a() {
        return (njw) this.V.a();
    }

    public final RailHotseatItemView b() {
        RailHotseatItemView railHotseatItemView = this.H;
        if (railHotseatItemView != null) {
            return railHotseatItemView;
        }
        affa.d("hotseatOne");
        return null;
    }

    public final oal c() {
        return (oal) this.W.a();
    }

    @Override // defpackage.nzh
    public final void f() {
        a().o(this.e);
    }

    public final void g(boolean z) throws Resources.NotFoundException {
        b.l().y("Setting assistant enabled %s", Boolean.valueOf(z));
        CoolwalkButton coolwalkButton = this.v;
        CoolwalkButton coolwalkButton2 = null;
        if (coolwalkButton == null) {
            affa.d("assistantIcon");
            coolwalkButton = null;
        }
        coolwalkButton.setEnabled(z);
        CoolwalkButton coolwalkButton3 = this.v;
        if (coolwalkButton3 == null) {
            affa.d("assistantIcon");
            coolwalkButton3 = null;
        }
        coolwalkButton3.setFocusable(z);
        TypedValue typedValue = new TypedValue();
        getResources().getValue(true != z ? R.dimen.coolwalk_assistant_mic_icon_unavailable_opacity : R.dimen.coolwalk_assistant_mic_icon_available_opacity, typedValue, true);
        CoolwalkButton coolwalkButton4 = this.v;
        if (coolwalkButton4 == null) {
            affa.d("assistantIcon");
        } else {
            coolwalkButton2 = coolwalkButton4;
        }
        coolwalkButton2.setAlpha(typedValue.getFloat());
    }

    public final void h() throws Resources.NotFoundException {
        CoolwalkButton coolwalkButton = null;
        if (!a().q()) {
            CoolwalkButton coolwalkButton2 = this.v;
            if (coolwalkButton2 == null) {
                affa.d("assistantIcon");
                coolwalkButton2 = null;
            }
            coolwalkButton2.j(R.drawable.gs_mic_fill1_vd_theme_24);
            CoolwalkButton coolwalkButton3 = this.v;
            if (coolwalkButton3 == null) {
                affa.d("assistantIcon");
            } else {
                coolwalkButton = coolwalkButton3;
            }
            coolwalkButton.s();
            n(R.dimen.coolwalk_rail_button_icon_size);
            return;
        }
        int iM = (int) acmd.m();
        if (iM == 1) {
            CoolwalkButton coolwalkButton4 = this.v;
            if (coolwalkButton4 == null) {
                affa.d("assistantIcon");
                coolwalkButton4 = null;
            }
            coolwalkButton4.j(R.drawable.gemini_branded_mic);
            CoolwalkButton coolwalkButton5 = this.v;
            if (coolwalkButton5 == null) {
                affa.d("assistantIcon");
                coolwalkButton5 = null;
            }
            coolwalkButton5.k(null);
            n(R.dimen.coolwalk_rail_button_icon_size);
            return;
        }
        if (iM == 2) {
            CoolwalkButton coolwalkButton6 = this.v;
            if (coolwalkButton6 == null) {
                affa.d("assistantIcon");
                coolwalkButton6 = null;
            }
            coolwalkButton6.j(R.drawable.cielo_gemini_spark);
            CoolwalkButton coolwalkButton7 = this.v;
            if (coolwalkButton7 == null) {
                affa.d("assistantIcon");
            } else {
                coolwalkButton = coolwalkButton7;
            }
            coolwalkButton.s();
            n(R.dimen.coolwalk_rail_button_sparkle_icon_size);
            return;
        }
        CoolwalkButton coolwalkButton8 = this.v;
        if (iM != 3) {
            if (coolwalkButton8 == null) {
                affa.d("assistantIcon");
                coolwalkButton8 = null;
            }
            coolwalkButton8.j(R.drawable.gs_mic_fill1_vd_theme_24);
            CoolwalkButton coolwalkButton9 = this.v;
            if (coolwalkButton9 == null) {
                affa.d("assistantIcon");
            } else {
                coolwalkButton = coolwalkButton9;
            }
            coolwalkButton.s();
            n(R.dimen.coolwalk_rail_button_icon_size);
            return;
        }
        if (coolwalkButton8 == null) {
            affa.d("assistantIcon");
            coolwalkButton8 = null;
        }
        coolwalkButton8.j(2131233031);
        CoolwalkButton coolwalkButton10 = this.v;
        if (coolwalkButton10 == null) {
            affa.d("assistantIcon");
            coolwalkButton10 = null;
        }
        coolwalkButton10.k(null);
        n(R.dimen.coolwalk_rail_button_sparkle_icon_size);
    }

    public final void i() {
        o();
        RailHotseatItemView railHotseatItemView = this.K;
        if (railHotseatItemView == null) {
            affa.d("hotseatFour");
            railHotseatItemView = null;
        }
        railHotseatItemView.setVisibility(8);
        this.c.i(a().q).k(this.aa);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[PHI: r3
  0x0074: PHI (r3v5 android.view.View) = (r3v2 android.view.View), (r3v6 android.view.View), (r3v8 android.view.View), (r3v10 android.view.View) binds: [B:31:0x006c, B:28:0x0062, B:25:0x0058, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, ocq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(defpackage.nge r12) {
        /*
            r11 = this;
            ocq r0 = r11.o
            r1 = 0
            if (r0 == 0) goto Lf
            yzy r11 = defpackage.yzy.eQ
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "another tooltip is already showing"
            q(r12, r11, r2, r0)
            return r1
        Lf:
            boolean r0 = r12 instanceof defpackage.nma
            r2 = 1
            if (r0 != 0) goto L2b
            yzy r11 = defpackage.yzy.eR
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r0.getClass()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "unrecognized display type %s"
            q(r12, r11, r0, r2)
            return r1
        L2b:
            r0 = r12
            nma r0 = (defpackage.nma) r0
            nlz r3 = r0.a()
            nip r4 = defpackage.nip.a
            int r3 = r3.ordinal()
            r4 = 0
            if (r3 == 0) goto L6a
            if (r3 == r2) goto L60
            r5 = 2
            if (r3 == r5) goto L56
            r5 = 3
            if (r3 == r5) goto L75
            r5 = 4
            if (r3 != r5) goto L50
            com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView r3 = r11.K
            if (r3 != 0) goto L74
            java.lang.String r3 = "hotseatFour"
            defpackage.affa.d(r3)
            goto L75
        L50:
            aezs r11 = new aezs
            r11.<init>()
            throw r11
        L56:
            com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton r3 = r11.v
            if (r3 != 0) goto L74
            java.lang.String r3 = "assistantIcon"
            defpackage.affa.d(r3)
            goto L75
        L60:
            android.support.v4.app.FragmentContainerView r3 = r11.C
            if (r3 != 0) goto L74
            java.lang.String r3 = "statusBarContainer"
            defpackage.affa.d(r3)
            goto L75
        L6a:
            com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton r3 = r11.s
            if (r3 != 0) goto L74
            java.lang.String r3 = "launcherAndDashboardIcon"
            defpackage.affa.d(r3)
            goto L75
        L74:
            r4 = r3
        L75:
            if (r4 == 0) goto La3
            int r3 = r4.getVisibility()
            if (r3 != 0) goto La3
            wci r5 = new wci
            yzz r7 = defpackage.yzz.RAIL
            yzy r8 = defpackage.yzy.eP
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r9 = "Error building tooltip"
            java.lang.String r6 = "GH.GhRailFrg"
            r5.<init>(r6, r7, r8, r9, r10)
            mts r12 = new mts
            r1 = 20
            r12.<init>(r11, r4, r1)
            java.lang.Object r12 = defpackage.khc.t(r5, r12)
            r12.getClass()
            oco r12 = (defpackage.oco) r12
            java.lang.Object r12 = r0.b(r12)
            r11.o = r12
            return r2
        La3:
            yzy r11 = defpackage.yzy.eS
            nlz r0 = r0.a()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "anchor view %s is null or not shown"
            q(r12, r11, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.niy.j(nge):boolean");
    }

    @Override // defpackage.nzh
    public final void k() {
        a().r(getContext());
    }

    @Override // android.support.v4.app.Fragment
    public final void onDetach() {
        b.l().u("onDetach");
        if (acxa.aD()) {
            l(this.l, this.U);
            l(this.m, this.U);
        }
        super.onDetach();
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.T) {
            ols.L(getContext(), "com.google.android.gms.car.STARTUP_LATENCY_MEASUREMENT_EVENT", rry.b, null);
            this.T = true;
        }
        a().i().fE(getViewLifecycleOwner(), new med(new nia(this, 9), 20));
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("OnFirstResumeEventPublishedKey", this.T);
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        view.getClass();
        this.n = nsr.c().b();
        int i = 1;
        int i2 = 0;
        if (bundle != null) {
            this.T = bundle.getBoolean("OnFirstResumeEventPublishedKey", false);
            this.h = true;
        }
        View viewFindViewById = view.findViewById(R.id.rail);
        viewFindViewById.getClass();
        this.u = viewFindViewById;
        ViewGroup viewGroup = null;
        if (viewFindViewById == null) {
            affa.d("railContainer");
            viewFindViewById = null;
        }
        Drawable background = viewFindViewById.getBackground();
        if (background != null) {
            background.setAlpha(0);
        }
        if (p()) {
            View viewFindViewById2 = view.findViewById(R.id.native_rail);
            viewFindViewById2.getClass();
            this.t = viewFindViewById2;
            if (viewFindViewById2 == null) {
                affa.d("nativeRailContainer");
                viewFindViewById2 = null;
            }
            Drawable background2 = viewFindViewById2.getBackground();
            if (background2 != null) {
                background2.setAlpha(0);
            }
        }
        View viewFindViewById3 = view.findViewById(R.id.dock_container);
        viewFindViewById3.getClass();
        this.A = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.etc_icon);
        viewFindViewById4.getClass();
        this.D = (ImageView) viewFindViewById4;
        ViewGroup viewGroup2 = this.A;
        if (viewGroup2 == null) {
            affa.d("dockContainer");
            viewGroup2 = null;
        }
        View viewFindViewById5 = viewGroup2.findViewById(R.id.rail_hotseat_container);
        viewFindViewById5.getClass();
        this.z = (ViewGroup) viewFindViewById5;
        ViewGroup viewGroup3 = this.A;
        if (viewGroup3 == null) {
            affa.d("dockContainer");
            viewGroup3 = null;
        }
        View viewFindViewById6 = viewGroup3.findViewById(R.id.hotseat_one);
        viewFindViewById6.getClass();
        this.H = (RailHotseatItemView) viewFindViewById6;
        ViewGroup viewGroup4 = this.A;
        if (viewGroup4 == null) {
            affa.d("dockContainer");
            viewGroup4 = null;
        }
        View viewFindViewById7 = viewGroup4.findViewById(R.id.hotseat_two);
        viewFindViewById7.getClass();
        this.I = (RailHotseatItemView) viewFindViewById7;
        ViewGroup viewGroup5 = this.A;
        if (viewGroup5 == null) {
            affa.d("dockContainer");
            viewGroup5 = null;
        }
        View viewFindViewById8 = viewGroup5.findViewById(R.id.hotseat_three);
        viewFindViewById8.getClass();
        this.J = (RailHotseatItemView) viewFindViewById8;
        ViewGroup viewGroup6 = this.A;
        if (viewGroup6 == null) {
            affa.d("dockContainer");
            viewGroup6 = null;
        }
        View viewFindViewById9 = viewGroup6.findViewById(R.id.hotseat_four);
        viewFindViewById9.getClass();
        this.K = (RailHotseatItemView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.assistant_icon);
        CoolwalkButton coolwalkButton = (CoolwalkButton) viewFindViewById10;
        coolwalkButton.getClass();
        coolwalkButton.setVisibility(0);
        coolwalkButton.h(false);
        viewFindViewById10.getClass();
        this.v = coolwalkButton;
        h();
        int i3 = 20;
        a().i().fE(getViewLifecycleOwner(), new med(new niw(this, i), 20));
        View viewFindViewById11 = view.findViewById(R.id.circle_overlay);
        viewFindViewById11.getClass();
        this.x = (CircleOverlayView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.live_fragment);
        viewFindViewById12.getClass();
        this.y = (FragmentContainerView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.assistant_icon_container);
        viewFindViewById13.getClass();
        this.w = viewFindViewById13;
        ViewGroup viewGroup7 = this.A;
        if (viewGroup7 == null) {
            affa.d("dockContainer");
            viewGroup7 = null;
        }
        View viewFindViewById14 = viewGroup7.findViewById(R.id.rail_ongoing_widget);
        viewFindViewById14.getClass();
        this.B = (RailWidgetView) viewFindViewById14;
        ViewGroup viewGroup8 = this.A;
        if (viewGroup8 == null) {
            affa.d("dockContainer");
            viewGroup8 = null;
        }
        this.l = viewGroup8.getViewTreeObserver();
        this.U = new nix(this, view);
        ViewGroup viewGroup9 = this.A;
        if (viewGroup9 == null) {
            affa.d("dockContainer");
            viewGroup9 = null;
        }
        viewGroup9.getViewTreeObserver().addOnPreDrawListener(this.U);
        View viewFindViewById15 = view.findViewById(R.id.launcher_and_dashboard_icon);
        CoolwalkButton coolwalkButton2 = (CoolwalkButton) viewFindViewById15;
        coolwalkButton2.h(false);
        viewFindViewById15.getClass();
        this.s = coolwalkButton2;
        View viewFindViewById16 = view.findViewById(R.id.status_bar);
        viewFindViewById16.getClass();
        this.C = (FragmentContainerView) viewFindViewById16;
        View viewFindViewById17 = view.findViewById(R.id.resize_button);
        viewFindViewById17.getClass();
        this.E = (ResizeButton) viewFindViewById17;
        View viewFindViewById18 = view.findViewById(R.id.resize_button_tap_target);
        viewFindViewById18.getClass();
        this.F = viewFindViewById18;
        View viewFindViewById19 = view.findViewById(R.id.resize_button_ghost);
        viewFindViewById19.getClass();
        this.G = viewFindViewById19;
        if (p()) {
            View viewFindViewById20 = view.findViewById(R.id.native_app_exit_icon);
            viewFindViewById20.getClass();
            this.Y = (CoolwalkButton) viewFindViewById20;
            View viewFindViewById21 = view.findViewById(R.id.native_app_back_icon);
            viewFindViewById21.getClass();
            this.Z = (CoolwalkButton) viewFindViewById21;
            CoolwalkButton coolwalkButton3 = this.Y;
            if (coolwalkButton3 == null) {
                affa.d("nativeAppCloseIcon");
                coolwalkButton3 = null;
            }
            coolwalkButton3.setOnClickListener(new mli(this, 19));
            CoolwalkButton coolwalkButton4 = this.Z;
            if (coolwalkButton4 == null) {
                affa.d("nativeAppBackIcon");
                coolwalkButton4 = null;
            }
            coolwalkButton4.setOnClickListener(new mli(this, i3));
        }
        View view2 = this.F;
        if (view2 == null) {
            affa.d("resizeButtonTapTarget");
            view2 = null;
        }
        view2.setVisibility(0);
        View view3 = this.F;
        if (view3 == null) {
            affa.d("resizeButtonTapTarget");
            view3 = null;
        }
        int i4 = 6;
        view3.getViewTreeObserver().addOnPreDrawListener(new fez(this, 6));
        view.findViewById(R.id.rail_invisible_scrim).setOnTouchListener(new qfv(1));
        a().i.fE(getViewLifecycleOwner(), new med(new niw(this, 3), 20));
        int i5 = 4;
        a().b().fE(getViewLifecycleOwner(), new med(new niw(this, i5), 20));
        a().a().fE(getViewLifecycleOwner(), new med(new niw(this, 5), 20));
        Object objE = a().f.e();
        objE.getClass();
        boolean zBooleanValue = ((Boolean) objE).booleanValue();
        nfy nfyVarA = nfy.a();
        nfyVarA.b(getViewLifecycleOwner(), new niu(this, 0));
        CoolwalkButton coolwalkButton5 = this.s;
        if (coolwalkButton5 == null) {
            affa.d("launcherAndDashboardIcon");
            coolwalkButton5 = null;
        }
        coolwalkButton5.setOnLongClickListener(new jzr(this, i5));
        if (!zBooleanValue) {
            ahnc.d(dty.f(getViewLifecycleOwner()), null, 0, new ksw(nfyVarA, this, (afck) null, 20), 3);
        }
        a().g.fE(getViewLifecycleOwner(), new med(new niw(nfyVarA, 2), 20));
        a().e().fE(getViewLifecycleOwner(), new med(new niw(this, 10), 20));
        a().c().fE(getViewLifecycleOwner(), new med(new niw(this, 11), 20));
        CoolwalkButton coolwalkButton6 = this.v;
        if (coolwalkButton6 == null) {
            affa.d("assistantIcon");
            coolwalkButton6 = null;
        }
        coolwalkButton6.setOnClickListener(new nmp(this, 1));
        a().l.fE(getViewLifecycleOwner(), new med(new niw(this, 12), 20));
        a().m.fE(getViewLifecycleOwner(), new med(new niw(this, 9), 20));
        nso nsoVar = this.n;
        if (nsoVar == null) {
            affa.d("displayLayout");
            nsoVar = null;
        }
        boolean zF = nsoVar.F();
        ViewGroup viewGroup10 = this.z;
        int i6 = 8;
        if (zF) {
            if (viewGroup10 == null) {
                affa.d("hotseatContainer");
            } else {
                viewGroup = viewGroup10;
            }
            viewGroup.setVisibility(0);
        } else {
            if (viewGroup10 == null) {
                affa.d("hotseatContainer");
            } else {
                viewGroup = viewGroup10;
            }
            viewGroup.setVisibility(8);
            requireView().postDelayed(new mhr(this, 15), S.toMillis());
        }
        if (isAdded()) {
            o();
        } else {
            ((ype) b.h()).u("Trying to set up hotseat and widget while not added");
        }
        a().d.fE(getViewLifecycleOwner(), new med(new niw(this, i4), 20));
        a().j().fE(getViewLifecycleOwner(), new med(new niw(this, 7), 20));
        jue jueVar = new jue(this, view, i6);
        a().e().fE(getViewLifecycleOwner(), jueVar);
        a().i().fE(getViewLifecycleOwner(), jueVar);
        ksa.a.a().e.fE(getViewLifecycleOwner(), new med(new niw(this, i6), 20));
        if (p()) {
            a().e.fE(getViewLifecycleOwner(), new med(new niw(this, i2), 20));
        }
    }

    public niy() {
        this(null);
    }
}
