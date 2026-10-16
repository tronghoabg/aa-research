package com.waze.uid.c;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.waze.R;
import com.waze.cz;
import com.waze.feedback.FeedbackScreenOrigin;
import com.waze.reports.cv;
import com.waze.uid.FlowContext;
import com.waze.uid.UidModel;
import com.waze.uid.state_impl.util.InstallParameters;
import java.lang.reflect.Field;
import java.util.List;
import l.a.aoh;
import l.a.brg;
import l.a.bri;
import l.a.bsq;
import l.a.bsr;
import l.a.bss;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bt extends be {

    /* renamed from: a, reason: collision with root package name */
    public static final String f44302a = "ARG_SHOW_TERMS_AND_SERVICE";

    /* renamed from: b, reason: collision with root package name */
    private static final List f44303b = com.google.d.d.bn.s(new bs(R.string.WELCOME_SCREEN_MESSAGE_FASTEST_ROUTE, R.drawable.welcome_screen_step_1), new bs(R.string.WELCOME_SCREEN_MESSAGE_HEADS_UP, R.drawable.welcome_screen_step_2), new bs(R.string.WELCOME_SCREEN_MESSAGE_DRIVE, R.drawable.welcome_screen_step_3));

    /* renamed from: d, reason: collision with root package name */
    private com.waze.uid.l f44304d;

    /* renamed from: e, reason: collision with root package name */
    private PagerAdapter f44305e;

    /* renamed from: f, reason: collision with root package name */
    private ViewPager f44306f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView[] f44307g;

    /* renamed from: h, reason: collision with root package name */
    private int f44308h;

    /* renamed from: i, reason: collision with root package name */
    private int f44309i;

    /* renamed from: j, reason: collision with root package name */
    private int f44310j;

    /* renamed from: k, reason: collision with root package name */
    private View f44311k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f44312l;
    private LinearLayout m;
    private com.waze.uid.activities.q n;
    private final Handler o;
    private com.waze.sharedui.g.n p;
    private final com.waze.shared_infra.o.a q;

    public bt() {
        super(R.layout.auth_welcome, FeedbackScreenOrigin.WELCOME_SCREEN_SHOWN, com.waze.uid.activities.e.f44087a, false, bd.f44257a);
        this.f44308h = 0;
        this.f44309i = -1;
        this.f44310j = -1;
        this.f44312l = false;
        this.o = new Handler(Looper.getMainLooper());
        this.q = com.waze.shared_infra.o.b.a();
        com.waze.uid.d.q.b().c().F(((UidModel) com.waze.uid.b.ab.y().b()).getFlowContext().getOnboardingContext());
    }

    private final void A() {
        this.o.removeCallbacksAndMessages(null);
    }

    private final void B() {
        com.waze.sharedui.g.n nVar = this.p;
        if (nVar != null) {
            nVar.dismiss();
            this.p = null;
        }
    }

    private final void C(int i2) {
        ImageView[] imageViewArr = this.f44307g;
        if (imageViewArr == null) {
            return;
        }
        if (imageViewArr.length < f44303b.size()) {
            return;
        }
        ImageView[] imageViewArr2 = this.f44307g;
        int i3 = 0;
        if (imageViewArr2[0] == null) {
            return;
        }
        if (i2 >= imageViewArr2.length) {
            i2 = 0;
        }
        while (true) {
            ImageView[] imageViewArr3 = this.f44307g;
            if (i3 >= imageViewArr3.length) {
                return;
            }
            if (i3 == i2) {
                imageViewArr3[i3].setImageResource(R.drawable.auth_page_indicator_active);
            } else {
                imageViewArr3[i3].setImageResource(R.drawable.auth_page_indicator_passive);
            }
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(InstallParameters.Result result, InstallParameters.Community community) {
        j(new com.waze.uid.state_impl.g.s(result, community));
    }

    private final void E() {
        if (this.f44312l) {
            return;
        }
        this.o.postDelayed(new com.waze.beacons.p(this, 18), 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        A();
        this.f44304d.a(false);
        ViewPager viewPager = this.f44306f;
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
    }

    private final void G(View view) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        int i2;
        int i3;
        this.f44306f = (ViewPager) view.findViewById(R.id.authWelcomePager);
        this.m = (LinearLayout) view.findViewById(R.id.authWelcomeIndicators);
        com.waze.uid.f.e(requireContext().getResources());
        this.m.removeAllViews();
        List list = f44303b;
        this.f44307g = new ImageView[list.size()];
        int i4 = 0;
        while (i4 < list.size()) {
            ImageView imageView = new ImageView(getContext());
            if (i4 == 0) {
                i3 = R.drawable.auth_page_indicator_active;
                i2 = 0;
            } else {
                i2 = i4;
                i3 = R.drawable.auth_page_indicator_passive;
            }
            imageView.setImageResource(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(com.waze.uid.f.d(R.dimen.authWelcomeIndicatorSize), com.waze.uid.f.d(R.dimen.authWelcomeIndicatorSize));
            marginLayoutParams.setMargins(com.waze.uid.f.d(R.dimen.authWelcomeIndicatorHorizontalMargin), 0, com.waze.uid.f.d(R.dimen.authWelcomeIndicatorHorizontalMargin), 0);
            this.m.addView(imageView, marginLayoutParams);
            this.f44307g[i2] = imageView;
            i4 = i2 + 1;
        }
        E();
        bq bqVar = new bq(this);
        this.f44305e = bqVar;
        this.f44306f.setAdapter(bqVar);
        this.f44306f.addOnPageChangeListener(new br(this));
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            com.waze.uid.l lVar = new com.waze.uid.l(getActivity(), new AccelerateDecelerateInterpolator());
            this.f44304d = lVar;
            lVar.b();
            declaredField.set(this.f44306f, this.f44304d);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
        }
        this.f44305e.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        A();
        this.f44312l = true;
    }

    private final void I(int i2, int i3, float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            return;
        }
        if (i2 == this.f44310j && i3 == this.f44309i) {
            com.waze.shared_infra.i.h.b("WazeWelcomeFragmentOld", "UIT inverting bad data");
            i2 = this.f44309i;
            i3 = this.f44310j;
            f2 = 1.0f - f2;
        }
        com.waze.shared_infra.i.h.b("WazeWelcomeFragmentOld", "UIT from " + i2 + " to " + i3 + " at " + f2);
        if (this.f44309i != i2) {
            com.waze.shared_infra.i.h.b("WazeWelcomeFragmentOld", "UIT new from: " + i2);
            this.f44309i = i2;
        }
        if (this.f44310j != i3) {
            com.waze.shared_infra.i.h.b("WazeWelcomeFragmentOld", "UIT new to: " + i3);
            this.f44310j = i3;
        }
        if (f2 > 0.5d) {
            C(i3);
        } else {
            C(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(int i2, Boolean bool) {
        bsr bsrVarNewBuilder = bss.newBuilder();
        int i3 = i2 - 1;
        if (i3 == 0) {
            bsrVarNewBuilder.b(bsq.BACK);
        } else if (i3 == 1) {
            bsrVarNewBuilder.b(bsq.GET_STARTED);
        } else if (i3 == 2) {
            bsrVarNewBuilder.b(bsq.LOGIN);
        } else if (i3 == 3) {
            bsrVarNewBuilder.b(bsq.PRIVACY_POLICY);
        } else if (i3 == 4) {
            bsrVarNewBuilder.b(bsq.TERMS_OF_SERVICE);
        } else if (i3 != 5) {
            bsrVarNewBuilder.b(bsq.SWIPE);
        } else {
            bsrVarNewBuilder.b(bsq.CLICK);
        }
        bsrVarNewBuilder.d(com.waze.ui.w.a.b.b());
        if (bool.booleanValue()) {
            bsrVarNewBuilder.c(aoh.PRIMARY);
        } else {
            FlowContext flowContext = ((UidModel) com.waze.uid.b.ab.y().b()).getFlowContext();
            com.waze.uid.state_impl.g.x xVar = com.waze.uid.state_impl.g.x.f44699a;
            FlowContext flowContext2 = FlowContext.OTHER;
            int iOrdinal = flowContext.ordinal();
            if (iOrdinal == 0) {
                bsrVarNewBuilder.c(aoh.CONTEXT_UNSPECIFIED);
            } else if (iOrdinal == 1) {
                bsrVarNewBuilder.c(aoh.SETTINGS);
            } else if (iOrdinal == 2) {
                bsrVarNewBuilder.c(aoh.WAZE_ONBOARDING);
            } else if (iOrdinal == 3) {
                bsrVarNewBuilder.c(aoh.LOGIN_CONTEXT);
            }
        }
        com.waze.stats.ax axVarA = com.waze.stats.ax.f40550a.a();
        brg brgVarNewBuilder = bri.newBuilder();
        brgVarNewBuilder.z(bsrVarNewBuilder.build());
        com.waze.sharedui.utils.o.f(axVarA, brgVarNewBuilder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(int i2) {
        J(i2, false);
    }

    public static /* synthetic */ void k(bt btVar, bb bbVar) {
        if (bbVar.e() instanceof com.waze.uid.state_impl.g.w) {
            com.waze.uid.state_impl.g.w wVar = (com.waze.uid.state_impl.g.w) bbVar.e();
            btVar.B();
            com.waze.uid.state_impl.g.x xVar = com.waze.uid.state_impl.g.x.f44699a;
            FlowContext flowContext = FlowContext.OTHER;
            if (wVar.a().ordinal() == 1) {
                btVar.H();
                com.waze.sharedui.g.k kVar = new com.waze.sharedui.g.k(btVar.getContext());
                com.waze.sharedui.h.k();
                com.waze.shared_infra.o.a aVar = btVar.q;
                kVar.f(aVar.c(R.string.SIGNUP_MENU_TITLE, new Object[0]));
                kVar.d(aVar.c(R.string.SIGNUP_MENU_SUBTITLE, new Object[0]));
                kVar.b(new com.waze.sharedui.g.l(aVar.c(R.string.SIGNUP_MENU_GOOGLE, new Object[0]), new com.waze.sharedui.web.ah(btVar, 2), R.color.primary_variant, R.color.surface_default, R.drawable.google, 2));
                kVar.b(new com.waze.sharedui.g.l(aVar.c(R.string.SIGNUP_MENU_EMAIL, new Object[0]), new com.waze.sharedui.web.ah(btVar, 3), R.color.primary_variant, R.color.surface_default, R.drawable.envelope, 2));
                kVar.b(new com.waze.sharedui.g.m(aVar.c(R.string.SIGNUP_MENU_OR, new Object[0]), null, R.color.content_p2, R.color.primary_variant, true));
                kVar.b(new com.waze.sharedui.g.l(aVar.c(R.string.SIGNUP_MENU_SKIP_ALT_COPY, new Object[0]), new com.waze.sharedui.web.ah(btVar, 4), R.color.on_primary, R.color.primary, 0, 1));
                kVar.c();
                kVar.e(new com.waze.design_components.c.f(btVar, 12));
                com.waze.sharedui.g.n nVarA = kVar.a();
                nVarA.show();
                btVar.p = nVarA;
            }
            btVar.f44311k.setVisibility(0);
        }
    }

    static /* bridge */ /* synthetic */ void l(bt btVar) {
        btVar.E();
        com.waze.uid.l lVar = btVar.f44304d;
        if (lVar != null) {
            lVar.a(true);
        }
        int currentItem = btVar.f44306f.getCurrentItem();
        btVar.f44308h = currentItem;
        btVar.I(currentItem, currentItem, 0.0f);
    }

    static /* bridge */ /* synthetic */ void n(bt btVar) {
        com.waze.shared_infra.i.h.b("WazeWelcomeFragmentOld", "UIT about to start transition");
        btVar.A();
    }

    static /* bridge */ /* synthetic */ void q(bt btVar, int i2, float f2) {
        int i3 = btVar.f44308h;
        if (i2 == i3) {
            btVar.I(i2, i2 + 1, f2);
        } else if (Math.abs(i2 - i3) < 2) {
            btVar.I(i2, btVar.f44308h, f2);
        }
    }

    public static /* synthetic */ void t(bt btVar) {
        K(3);
        btVar.j(new com.waze.uid.state_impl.g.u());
    }

    public static /* synthetic */ void v(bt btVar) {
        K(2);
        btVar.j(new com.waze.uid.state_impl.g.t());
    }

    @Override // com.waze.uid.c.be
    public final boolean d() {
        K(1);
        return false;
    }

    @Override // com.waze.uid.c.be, android.support.v4.app.ar
    public final void onAttach(Context context) {
        super.onAttach(context);
        com.waze.uid.activities.q qVar = (com.waze.uid.activities.q) new ViewModelProvider(requireActivity()).get(com.waze.uid.activities.q.class);
        this.n = qVar;
        qVar.c().observe(this, new cz(this, 11));
    }

    @Override // com.waze.uid.c.be, android.support.v4.app.ar
    public final void onPause() {
        B();
        super.onPause();
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        com.waze.shared_infra.g.e.c((ConstraintLayout) view.findViewById(R.id.authWelcomeLayout));
        if (getResources().getConfiguration().orientation == 1) {
            G(view);
        }
        View viewFindViewById = view.findViewById(R.id.authWelcomeSecondaryButton);
        this.f44311k = viewFindViewById;
        viewFindViewById.setOnClickListener(new cv(this, 10));
        TextView textView = (TextView) view.findViewById(R.id.authWelcomeSecondaryButtonText);
        com.waze.shared_infra.o.a aVar = this.q;
        textView.setText(aVar.c(R.string.WELCOME_SCREEN_LOGIN_BUTTON, new Object[0]));
        view.findViewById(R.id.authWelcomePrimaryButton).setOnClickListener(new cv(this, 11));
        ((TextView) view.findViewById(R.id.authWelcomePrimaryButtonText)).setText(aVar.c(R.string.WELCOME_SCREEN_GET_STARTED_BUTTON, new Object[0]));
        boolean z = requireArguments().getBoolean(f44302a, false);
        TextView textView2 = (TextView) view.findViewById(R.id.authWelcomeTermsOfServiceFooter);
        byte[] bArr = null;
        int i2 = 8;
        if (z) {
            textView2.setLinkTextColor(ResourcesCompat.getColor(getResources(), R.color.primary, null));
            com.waze.sharedui.views.ap.c(textView2, com.waze.uid.r.c(requireContext(), aVar, new com.waze.stats.ay(this, i2), new com.waze.stats.ay(this, 9)));
        } else {
            textView2.setVisibility(8);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) requireView().findViewById(R.id.authWelcomeLayout);
        View viewInflate = View.inflate(requireContext(), R.layout.auth_welcome_automation, null);
        ((Button) viewInflate.findViewById(R.id.login)).setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m(this, viewInflate, 13, bArr));
        viewInflate.setVisibility(8);
        constraintLayout.addView(viewInflate);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.connect(viewInflate.getId(), 3, constraintLayout.getId(), 3);
        constraintSet.connect(viewInflate.getId(), 6, constraintLayout.getId(), 6);
        constraintSet.applyTo(constraintLayout);
    }
}
