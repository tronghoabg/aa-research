package com.waze.mywaze;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.av;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.card.MaterialCardView;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.favorites.AddHomeWorkActivity;
import com.waze.ifs.ui.ScrollViewTopShadowOnly;
import com.waze.ix;
import com.waze.mg;
import com.waze.mywaze.moods.MoodsActivity;
import com.waze.navigate.location_preview.ba;
import com.waze.profile.TempUserProfileActivity;
import com.waze.settings.tree.views.SettingsFreeText;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.sharedui.profile.UserProfile;
import com.waze.sharedui.views.OvalButton;
import com.waze.view.title.TitleBar;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l extends com.waze.app_nav.a.b implements org.a.a.b.a {
    private SettingsFreeText A;
    private WazeSettingsView B;
    private WazeSettingsView C;
    private WazeSettingsView D;
    private WazeSettingsView E;
    private WazeSettingsView F;
    private WazeSettingsView G;
    private TextView H;
    private TextView I;
    private TextView J;
    private TextView K;
    private TextView L;
    private TextView M;
    private TextView N;

    /* renamed from: a, reason: collision with root package name */
    public final ViewModelProvider.Factory f30592a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f30593b = org.a.b.b.d.a(this);

    /* renamed from: c, reason: collision with root package name */
    private final h.f f30594c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f30595d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f30596e;

    /* renamed from: f, reason: collision with root package name */
    private aa f30597f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f30598g;

    /* renamed from: h, reason: collision with root package name */
    private com.waze.view.popups.t f30599h;

    /* renamed from: i, reason: collision with root package name */
    private UserProfile f30600i;

    /* renamed from: j, reason: collision with root package name */
    private String f30601j;

    /* renamed from: k, reason: collision with root package name */
    private final NativeManager f30602k;

    /* renamed from: l, reason: collision with root package name */
    private ScrollViewTopShadowOnly f30603l;
    private ConstraintLayout m;
    private Space n;
    private MaterialCardView o;
    private LinearLayout p;
    private ImageView q;
    private ImageView r;
    private ImageView s;
    private ImageView t;
    private TitleBar u;
    private LinearLayout v;
    private ImageView w;
    private View x;
    private OvalButton y;
    private SettingsFreeText z;

    public l() {
        l lVar = this;
        h.h hVar = h.h.f48130a;
        this.f30594c = h.g.b(hVar, new j(lVar, 1));
        this.f30595d = h.g.b(hVar, new j(lVar, 0));
        this.f30596e = h.g.b(hVar, new j(lVar, 2));
        this.f30592a = new aj();
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("MyWazeActivity");
        h.g.b.x.e(eVarD, "create(...)");
        this.f30598g = eVarD;
        this.f30602k = NativeManager.getInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A(boolean r9) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.mywaze.l.A(boolean):void");
    }

    private static final void B(String str) {
        com.waze.bs.a.f(str, "MY_WAZE_ITEM_CLICKED", false);
    }

    static final h.ab f(l lVar, UserProfile userProfile) {
        h.g.b.x.c(userProfile);
        lVar.u(userProfile);
        return h.ab.f48028a;
    }

    static final h.ab g(l lVar, Integer num) {
        h.g.b.x.c(num);
        lVar.x(num.intValue());
        if (num.intValue() > 0) {
            WazeSettingsView wazeSettingsView = lVar.B;
            if (wazeSettingsView != null) {
                wazeSettingsView.P(num.intValue() == 1 ? lVar.t().c(R.string.MY_WAZE_CONTRIBUTION_FEED_ONE_BADGE, new Object[0]) : lVar.t().c(R.string.MY_WAZE_CONTRIBUTION_FEED_BADGES_PD, num));
            }
            View view = lVar.x;
            if (view != null) {
                view.setVisibility(0);
            }
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ void h(l lVar, boolean z) {
        MyWazeNativeManager myWazeNativeManager = MyWazeNativeManager.getInstance();
        h.g.b.x.e(myWazeNativeManager, "getInstance(...)");
        y.setInvisible$default(myWazeNativeManager, z, null, 2, null);
        ix.i(z, h.a.i.i(Integer.valueOf(R.string.MY_WAZE), Integer.valueOf(R.string.MY_WAZE_GO_INVISIBLE_SWITCH)));
        if (z) {
            ConstraintLayout constraintLayout = lVar.m;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            Space space = lVar.n;
            if (space != null) {
                space.setVisibility(8);
            }
            lVar.y();
            return;
        }
        if (!MyWazeNativeManager.getInstance().isGuestUser() && !MyWazeNativeManager.getInstance().isInvisible()) {
            ConstraintLayout constraintLayout2 = lVar.m;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
            Space space2 = lVar.n;
            if (space2 != null) {
                space2.setVisibility(0);
            }
        }
        lVar.A(true);
    }

    public static /* synthetic */ void i(l lVar) {
        com.waze.uid.d.s sVar = com.waze.uid.d.q.f44463a.a().f44466d;
        Context contextRequireContext = lVar.requireContext();
        h.g.b.x.e(contextRequireContext, "requireContext(...)");
        com.waze.uid.d.r rVar = new com.waze.uid.d.r(lVar.t().c(R.string.MY_WAZE_CONTRIBUTION_FEED_BROWSER_TITLE, new Object[0]), true);
        String strB = ConfigValues.CONFIG_VALUE_GAMIFICATION_CONTRIBUTION_FEED_URL.b();
        h.g.b.x.e(strB, "getValue(...)");
        lVar.startActivity(sVar.a(contextRequireContext, rVar, strB));
    }

    static final void j(l lVar, Runnable runnable) {
        String serverCookie = lVar.f30602k.getServerCookie();
        if (serverCookie != null && !h.n.o.G(serverCookie)) {
            runnable.run();
            return;
        }
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(lVar.t().c(R.string.SOMETHING_WENT_WRONG, new Object[0]));
        oVar.P(lVar.t().c(R.string.PLEASE_TRY_AGAIN_LATER, new Object[0]));
        oVar.y(true);
        oVar.M(lVar.t().c(R.string.OK, new Object[0]));
        com.waze.z.a.d.ai.q(oVar);
    }

    public static /* synthetic */ void k(l lVar) {
        lVar.s().c(ac.f30551e, ab.f30543a);
        AddHomeWorkActivity.p(0, 1);
    }

    public static /* synthetic */ void n(l lVar) {
        lVar.s().c(ac.f30555i, ab.f30543a);
        B("settings_main");
    }

    public static /* synthetic */ void o(l lVar) {
        lVar.s().c(ac.f30548b, ab.f30543a);
        B("settings_main.account.account_and_login");
    }

    public static /* synthetic */ void p(l lVar) {
        lVar.s().c(ac.f30553g, ab.f30543a);
        lVar.startActivityForResult(new Intent(lVar.requireContext(), (Class<?>) MoodsActivity.class), 1);
    }

    static final void q(final l lVar, int i2) {
        lVar.s().c(ac.f30550d, lVar.s().a(i2));
        final com.waze.ads.f fVar = new com.waze.ads.f(lVar, 4);
        if (ba.g(lVar.requireContext())) {
            String serverCookie = lVar.f30602k.getServerCookie();
            if (serverCookie == null || h.n.o.G(serverCookie)) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.waze.mywaze.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.j(this.f30582a, fVar);
                    }
                }, 2000L);
                return;
            } else {
                fVar.run();
                return;
            }
        }
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(lVar.t().c(R.string.NO_NETWORK_CONNECTION, new Object[0]));
        oVar.P(lVar.t().c(R.string.SORRY__YOU_HAVE_NO_NETWORK_CONNECTION_RIGHT_NOW__PLEASE_TRY_LATER, new Object[0]));
        oVar.y(true);
        oVar.M(lVar.t().c(R.string.OK, new Object[0]));
        com.waze.z.a.d.ai.q(oVar);
    }

    static final void r(l lVar) {
        lVar.s().c(ac.f30552f, ab.f30543a);
        if (MyWazeNativeManager.getInstance().isGuestUser()) {
            lVar.startActivityForResult(new Intent(lVar.requireContext(), (Class<?>) TempUserProfileActivity.class), 1);
        } else {
            B("settings_main.account.account_and_login");
        }
    }

    private final ah s() {
        return (ah) this.f30596e.getValue();
    }

    private final com.waze.shared_infra.o.a t() {
        return (com.waze.shared_infra.o.a) this.f30594c.getValue();
    }

    private final void u(UserProfile userProfile) {
        this.f30600i = userProfile;
        if (userProfile != null) {
            this.f30601j = userProfile.getSocialInfo().getImageUrl();
        }
        A(false);
    }

    private final void v(boolean z) {
        if (z) {
            y();
            return;
        }
        z(false);
        A(true);
        f fVar = new f(this, 0);
        LinearLayout linearLayout = this.p;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(fVar);
        }
        OvalButton ovalButton = this.y;
        if (ovalButton != null) {
            ovalButton.setOnClickListener(fVar);
        }
    }

    private final void w() {
        WazeSettingsView wazeSettingsView = this.B;
        aa aaVar = null;
        if (wazeSettingsView != null) {
            wazeSettingsView.P(null);
        }
        View view = this.x;
        if (view != null) {
            view.setVisibility(8);
        }
        aa aaVar2 = (aa) new ViewModelProvider(this, this.f30592a).get(aa.class);
        this.f30597f = aaVar2;
        if (aaVar2 == null) {
            h.g.b.x.j("viewModel");
        }
        if (!com.waze.z.a.b.n.c()) {
            WazeSettingsView wazeSettingsView2 = this.B;
            if (wazeSettingsView2 != null) {
                wazeSettingsView2.setVisibility(8);
                return;
            }
            return;
        }
        Lifecycle lifecycle = getLifecycle();
        aa aaVar3 = this.f30597f;
        if (aaVar3 == null) {
            h.g.b.x.j("viewModel");
            aaVar3 = null;
        }
        lifecycle.addObserver(aaVar3);
        WazeSettingsView wazeSettingsView3 = this.B;
        if (wazeSettingsView3 != null) {
            wazeSettingsView3.setVisibility(0);
            wazeSettingsView3.P(null);
            wazeSettingsView3.A(t().c(R.string.MY_WAZE_CONTRIBUTION_FEED_CELL_TITLE, new Object[0]));
        }
        x(0);
        aa aaVar4 = this.f30597f;
        if (aaVar4 == null) {
            h.g.b.x.j("viewModel");
        } else {
            aaVar = aaVar4;
        }
        aaVar.a().observe(getViewLifecycleOwner(), new m(new h(this, 0)));
    }

    private final void x(int i2) {
        WazeSettingsView wazeSettingsView = this.B;
        if (wazeSettingsView != null) {
            wazeSettingsView.setOnClickListener(new c(this, i2, 0));
        }
    }

    private final void y() {
        z(true);
        SettingsFreeText settingsFreeText = this.A;
        if (settingsFreeText != null) {
            settingsFreeText.setVisibility(8);
        }
        TextView textView = this.I;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.N;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        OvalButton ovalButton = this.y;
        if (ovalButton != null) {
            ovalButton.setVisibility(8);
        }
        ConstraintLayout constraintLayout = this.m;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        Space space = this.n;
        if (space != null) {
            space.setVisibility(8);
        }
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        TextView textView3 = this.K;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        TextView textView4 = this.H;
        if (textView4 != null) {
            textView4.setText(t().c(R.string.MY_WAZE_YOU_ARE_INVISIBLE, new Object[0]));
        }
        TextView textView5 = this.J;
        if (textView5 != null) {
            textView5.setVisibility(0);
        }
        TextView textView6 = this.J;
        if (textView6 != null) {
            textView6.setText(t().c(R.string.YOU_ARE_SHOWN_AS_OFFLINE, new Object[0]));
        }
        ImageView imageView = this.r;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.t3_moods_footprint_wazer_interface);
        }
        ImageView imageView2 = this.s;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
    }

    private final void z(boolean z) {
        WazeSettingsView wazeSettingsView = this.F;
        if (wazeSettingsView != null) {
            wazeSettingsView.D(z);
            wazeSettingsView.A(t().c(R.string.BECOME_INVISIBLE, new Object[0]));
            wazeSettingsView.s(new com.waze.sharedui.views.w() { // from class: com.waze.mywaze.d
                @Override // com.waze.sharedui.views.w
                public final void a(boolean z2) {
                    l.h(this.f30581a, z2);
                }
            });
        }
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f30593b.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // android.support.v4.app.ar
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 == -1) {
            com.waze.app_nav.w.f15441a.a().c();
        } else if (i3 != 4) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.g.b.x.f(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.mywaze, viewGroup, false);
        h.g.b.x.e(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // android.support.v4.app.ar
    public final void onDestroyView() {
        this.f30603l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        super.onDestroyView();
    }

    @Override // android.support.v4.app.ar
    public final void onPause() {
        com.waze.view.popups.t tVar = this.f30599h;
        if (tVar != null && tVar.g()) {
            tVar.d();
        }
        super.onPause();
    }

    @Override // android.support.v4.app.ar
    public final void onResume() {
        super.onResume();
        if (NativeManager.isAppStarted()) {
            w();
            v(MyWazeNativeManager.getInstance().isInvisible());
        }
    }

    @Override // com.waze.app_nav.a.b, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        super.onViewCreated(view, bundle);
        this.u = (TitleBar) view.findViewById(R.id.myWazeTitle);
        this.J = (TextView) view.findViewById(R.id.myWazeShownAsOffline);
        this.H = (TextView) view.findViewById(R.id.myWazeFullName);
        this.I = (TextView) view.findViewById(R.id.myWazeUsername);
        this.K = (TextView) view.findViewById(R.id.myWazePointsLabel);
        this.L = (TextView) view.findViewById(R.id.myWazeTotalPoints);
        this.M = (TextView) view.findViewById(R.id.youOnMapRegisterButtonText);
        this.N = (TextView) view.findViewById(R.id.youOnMapJoined);
        this.z = (SettingsFreeText) view.findViewById(R.id.myWazeSettingExplainText);
        this.A = (SettingsFreeText) view.findViewById(R.id.youOnMapShown);
        this.B = (WazeSettingsView) view.findViewById(R.id.myContributionFeed);
        this.C = (WazeSettingsView) view.findViewById(R.id.myWazeSettings);
        this.D = (WazeSettingsView) view.findViewById(R.id.myWazeMood);
        this.E = (WazeSettingsView) view.findViewById(R.id.myWazeHomeWork);
        this.F = (WazeSettingsView) view.findViewById(R.id.invisibleModeToggle);
        this.G = (WazeSettingsView) view.findViewById(R.id.settingsMainSettingsAccountAndLogin);
        this.o = (MaterialCardView) view.findViewById(R.id.youOnMapProfileCard);
        this.x = view.findViewById(R.id.badgeCount);
        this.p = (LinearLayout) view.findViewById(R.id.youOnMapProfileLayout);
        this.y = (OvalButton) view.findViewById(R.id.youOnMapRegisterButton);
        this.t = (ImageView) view.findViewById(R.id.myGuestAlertIcon);
        this.f30603l = (ScrollViewTopShadowOnly) view.findViewById(R.id.scrollView);
        this.m = (ConstraintLayout) view.findViewById(R.id.youOnMapFrame);
        this.n = (Space) view.findViewById(R.id.youOnMapBubbleTopSpace);
        this.r = (ImageView) view.findViewById(R.id.youOnMapMood);
        this.s = (ImageView) view.findViewById(R.id.youOnMapAddOn);
        this.w = (ImageView) view.findViewById(R.id.myWazeGamingIcon);
        this.v = (LinearLayout) view.findViewById(R.id.myWazePointsContainer);
        this.q = (ImageView) view.findViewById(R.id.youOnMapImage);
        TitleBar titleBar = this.u;
        if (titleBar != null) {
            titleBar.c(t().c(R.string.MY_WAZE, new Object[0]));
            titleBar.n(new com.waze.inbox.e(9));
            titleBar.m(new com.waze.inbox.e(10));
        }
        SettingsFreeText settingsFreeText = this.z;
        if (settingsFreeText != null) {
            settingsFreeText.d(t().c(R.string.GO_TO_SETTINGS_EXPLANATION_TXT, new Object[0]));
        }
        boolean zD = ((com.waze.b.s) com.waze.b.u.f16171a.a().a().d()).d();
        WazeSettingsView wazeSettingsView = this.F;
        if (zD) {
            if (wazeSettingsView != null) {
                wazeSettingsView.setVisibility(8);
            }
        } else if (wazeSettingsView != null) {
            wazeSettingsView.setVisibility(0);
        }
        v(MyWazeNativeManager.getInstance().isInvisible());
        boolean zIsGuestUser = MyWazeNativeManager.getInstance().isGuestUser();
        WazeSettingsView wazeSettingsView2 = this.G;
        if (zIsGuestUser) {
            av avVarRequireActivity = requireActivity();
            wazeSettingsView2.B(0);
            wazeSettingsView2.P(null);
            wazeSettingsView2.N(com.waze.shared_infra.o.b.a().c(R.string.ACCOUNT_AND_SETTINGS, new Object[0]));
            wazeSettingsView2.setOnClickListener(new com.waze.a.y(avVarRequireActivity, TempUserProfileActivity.class, 19, null));
            ImageView imageView = this.t;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            final com.waze.view.popups.t tVar = new com.waze.view.popups.t(requireContext());
            this.f30599h = tVar;
            ScrollViewTopShadowOnly scrollViewTopShadowOnly = this.f30603l;
            if (scrollViewTopShadowOnly != null) {
                scrollViewTopShadowOnly.a(new com.waze.sharedui.views.q() { // from class: com.waze.mywaze.g
                    @Override // com.waze.sharedui.views.q
                    public final void a() {
                        tVar.d();
                    }
                });
            }
            tVar.findViewById(R.id.sepCloseTooltip).setVisibility(8);
            tVar.findViewById(R.id.btnCloseTooltipTouchArea).setVisibility(8);
            tVar.j(t().c(R.string.MY_PROFILE_REGISTER_TOOLTIP, new Object[0]), 5000L);
            tVar.e();
            av avVarRequireActivity2 = requireActivity();
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            tVar.setLayoutParams(layoutParams);
            avVarRequireActivity2.addContentView(tVar, layoutParams);
            ImageView imageView2 = this.t;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new com.waze.view.popups.r(tVar, requireActivity(), imageView2));
            }
        } else if (wazeSettingsView2 != null) {
            wazeSettingsView2.A(t().c(R.string.ACCOUNT_AND_SETTINGS, new Object[0]));
            wazeSettingsView2.setOnClickListener(new com.waze.main_screen.bottom_bars.a.a(this, 3));
        }
        s().d(MyWazeNativeManager.getInstance().isGuestUser() ? af.f30565b : af.f30564a);
        w();
        WazeSettingsView wazeSettingsView3 = this.E;
        if (wazeSettingsView3 != null) {
            wazeSettingsView3.A(t().c(R.string.MY_WAZE_HOME_WORK, new Object[0]));
            wazeSettingsView3.setOnClickListener(new com.waze.main_screen.bottom_bars.a.a(this, 5));
        }
        WazeSettingsView wazeSettingsView4 = this.D;
        if (wazeSettingsView4 != null) {
            wazeSettingsView4.A(t().c(R.string.MY_MOOD, new Object[0]));
            wazeSettingsView4.setOnClickListener(new com.waze.main_screen.bottom_bars.a.a(this, 4));
        }
        WazeSettingsView wazeSettingsView5 = this.C;
        if (wazeSettingsView5 != null) {
            wazeSettingsView5.A(t().c(R.string.VIEW_SETTINGS, new Object[0]));
            wazeSettingsView5.setOnClickListener(new com.waze.main_screen.bottom_bars.a.a(this, 2));
        }
        int i2 = com.waze.utils.e.f44868b;
        com.google.android.material.k.af afVar = new com.google.android.material.k.af(Math.round((mg.a().getResources().getDisplayMetrics().density * 12.0f) + 0.5f));
        MaterialCardView materialCardView = this.o;
        if (materialCardView != null) {
            com.google.android.material.k.p pVar = new com.google.android.material.k.p(materialCardView.b());
            pVar.j(afVar);
            materialCardView.e(pVar.i());
        }
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        h.g.b.x.e(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new i());
        UserProfile userProfileB = com.waze.sharedui.profile.b.a().b();
        h.g.b.x.e(userProfileB, "getMyProfile(...)");
        u(userProfileB);
        ch chVarF = com.waze.sharedui.profile.b.a().f();
        h.g.b.x.e(chVarF, "getProfileStateFlow(...)");
        FlowLiveDataConversions.asLiveData$default(chVarF, (h.c.j) null, 0L, 3, (Object) null).observe(getViewLifecycleOwner(), new m(new h(this, 1)));
    }
}
