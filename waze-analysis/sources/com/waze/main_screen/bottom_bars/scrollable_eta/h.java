package com.waze.main_screen.bottom_bars.scrollable_eta;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.waze.R;
import com.waze.navigate.bx;
import com.waze.nightmode.t;
import com.waze.settings.gu;
import com.waze.sound.bp;
import com.waze.ui.z.as;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class h extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private static h f25962a;

    /* renamed from: b, reason: collision with root package name */
    private final View f25963b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f25964c;

    /* renamed from: d, reason: collision with root package name */
    private final ViewGroup f25965d;

    /* renamed from: e, reason: collision with root package name */
    private final View f25966e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f25967f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f25968g;

    /* renamed from: h, reason: collision with root package name */
    private final ImageView f25969h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f25970i;

    /* renamed from: j, reason: collision with root package name */
    private final LottieAnimationView f25971j;

    /* renamed from: k, reason: collision with root package name */
    private final EtaMainBarNavView f25972k;

    /* renamed from: l, reason: collision with root package name */
    private final ProgressBar f25973l;
    private final ImageView m;
    private final ImageView n;
    private final ImageView o;
    private final View p;
    private s q;
    private boolean r;
    private boolean s;
    private final com.waze.ad.b.a t;
    private com.waze.ui.r.a.e.b.a u;
    private final com.waze.c.a.b v;
    private final q w;
    private final com.waze.main_screen.c.a x;
    private bp y;

    public h(Context context) {
        super(context, null, 0);
        this.t = new com.waze.ad.b.a();
        this.u = com.waze.ui.r.a.e.b.a.f43361c;
        this.v = (com.waze.c.a.b) com.waze.web.r.h(com.waze.c.a.b.class);
        this.w = com.waze.main_screen.a.b.h.d();
        this.x = (com.waze.main_screen.c.a) com.waze.web.r.h(com.waze.main_screen.c.a.class);
        this.y = null;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.eta_main_bar_layout, (ViewGroup) this, false);
        this.f25963b = viewInflate;
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.leftMenuButtonContainer);
        this.f25964c = viewGroup;
        this.f25967f = (ImageView) viewInflate.findViewById(R.id.leftMenuButtonImage);
        this.f25968g = (TextView) viewInflate.findViewById(R.id.leftMenuButtonText);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.rightMenuButtonContainer);
        this.f25965d = viewGroup2;
        this.f25966e = viewInflate.findViewById(R.id.rightMenuButtonStandardLayout);
        this.f25969h = (ImageView) viewInflate.findViewById(R.id.rightMenuButtonImage);
        this.f25970i = (TextView) viewInflate.findViewById(R.id.rightMenuButtonText);
        EtaMainBarNavView etaMainBarNavView = (EtaMainBarNavView) viewInflate.findViewById(R.id.etaMainBarNavView);
        this.f25972k = etaMainBarNavView;
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.mainBarProgressIndicator);
        this.f25973l = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(ContextCompat.getColor(getContext(), R.color.primary), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = (ImageView) etaMainBarNavView.findViewById(R.id.imgSoundButton);
        this.m = imageView;
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.imgSettingsButton);
        this.n = imageView2;
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.imgEndNavButton);
        this.o = imageView3;
        this.p = viewInflate.findViewById(R.id.bottomBarSeparator);
        this.f25971j = (LottieAnimationView) viewInflate.findViewById(R.id.altRoutesFTEAnimation);
        ComposeView composeView = (ComposeView) viewInflate.findViewById(R.id.dragHandle);
        x.f(composeView, "composeView");
        int i2 = com.waze.z.a.b.b.f45738a;
        composeView.setContent(com.waze.z.a.b.b.a());
        Drawable drawable = ContextCompat.getDrawable(getContext(), com.waze.design_components.b.d.f23310k.c(com.waze.design_components.b.e.f23312a));
        if (drawable != null) {
            imageView2.setImageDrawable(drawable);
        }
        if (getResources().getConfiguration().orientation == 1) {
            imageView.setPivotY(0.0f);
        }
        viewGroup.setOnClickListener(new com.waze.feedback.b(this, 6));
        viewGroup2.setContentDescription(com.waze.ui.r.a.d.c.aL.name());
        viewGroup2.setOnClickListener(new com.waze.feedback.b(this, 7));
        setOutlineProvider(new f(this));
        imageView.setOutlineProvider(new g(this));
        imageView.setOnClickListener(new com.waze.feedback.b(this, 8));
        imageView.setOnTouchListener(new e());
        imageView2.setOnClickListener(new com.waze.feedback.b(this, 9));
        imageView3.setOnClickListener(new com.waze.feedback.b(this, 10));
        addView(viewInflate);
        h hVar = f25962a;
        if (hVar != null) {
            this.r = hVar.r;
            this.s = hVar.s;
            d(true == hVar.r ? 1.0f : 0.0f);
        }
        if (isInEditMode()) {
            return;
        }
        q();
        c();
        f25962a = this;
    }

    public static /* synthetic */ void j(h hVar) {
        s sVar;
        if (hVar.n.getVisibility() == 8 && hVar.o.getVisibility() == 8 && (sVar = hVar.q) != null) {
            sVar.c();
        }
    }

    public static /* synthetic */ void k(h hVar) {
        hVar.w.c(l.w, false, null, null, null, hVar.u);
        s sVar = hVar.q;
        if (sVar != null) {
            sVar.h();
        }
    }

    public static /* synthetic */ void l(h hVar) {
        s sVar = hVar.q;
        if (sVar != null) {
            sVar.g();
        }
    }

    public static /* synthetic */ void m(h hVar) {
        s sVar = hVar.q;
        if (sVar != null) {
            sVar.e();
            LottieAnimationView lottieAnimationView = hVar.f25971j;
            lottieAnimationView.g();
            lottieAnimationView.setVisibility(8);
            hVar.v.f();
        }
    }

    public static /* synthetic */ void n(h hVar) {
        s sVar = hVar.q;
        if (sVar != null) {
            sVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int p(int i2) {
        return as.h(getResources(), i2);
    }

    private final void q() {
        ImageView imageView = this.f25967f;
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
        ImageView imageView2 = this.f25969h;
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) imageView2.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams2.height = -2;
        layoutParams2.width = -2;
        float fP = p(20);
        TextView textView = this.f25968g;
        textView.setTextSize(0, fP);
        float fP2 = p(20);
        TextView textView2 = this.f25970i;
        textView2.setTextSize(0, fP2);
        imageView.setLayoutParams(layoutParams);
        imageView2.setLayoutParams(layoutParams2);
        ViewGroup viewGroup = this.f25964c;
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams3.rightToLeft = -1;
        layoutParams3.width = getResources().getDimensionPixelSize(R.dimen.mainBottomBarButtonWidth);
        viewGroup.setPadding(0, 0, 0, 0);
        viewGroup.setLayoutParams(layoutParams3);
        ViewGroup viewGroup2 = this.f25965d;
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) viewGroup2.getLayoutParams();
        layoutParams4.leftToRight = -1;
        layoutParams4.width = getResources().getDimensionPixelSize(R.dimen.mainBottomBarButtonWidth);
        viewGroup2.setLayoutParams(layoutParams4);
        viewGroup2.setVisibility(0);
        textView.setVisibility(8);
        textView2.setVisibility(8);
        this.m.setVisibility(true != this.x.f() ? 0 : 8);
        this.n.setVisibility(true != this.r ? 8 : 0);
        this.o.setVisibility(this.u != com.waze.ui.r.a.e.b.a.f43359a ? 8 : 0);
    }

    public final void c() {
        LifecycleOwner lifecycleOwner;
        int color = ContextCompat.getColor(getContext(), R.color.background_default);
        View view = this.f25963b;
        view.setBackgroundColor(color);
        view.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.eta_main_bar_bg));
        int color2 = ContextCompat.getColor(getContext(), R.color.hairline);
        View view2 = this.p;
        view2.setBackgroundColor(color2);
        view2.setVisibility(8);
        this.f25968g.setTextColor(ContextCompat.getColor(getContext(), R.color.content_p3));
        this.f25970i.setTextColor(ContextCompat.getColor(getContext(), R.color.content_p3));
        com.waze.shared_infra.i.h.z(this.f25964c, ContextCompat.getDrawable(getContext(), R.drawable.eta_bar_left_bg), getResources().getColor(R.color.blue_bg));
        this.f25973l.getIndeterminateDrawable().setColorFilter(ContextCompat.getColor(getContext(), R.color.primary), PorterDuff.Mode.MULTIPLY);
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.circle_surface);
        ImageView imageView = this.n;
        imageView.setBackground(drawable);
        imageView.setColorFilter(ContextCompat.getColor(getContext(), R.color.content_p2));
        this.f25972k.a();
        Context context = getContext();
        com.waze.design_components.b.d dVar = com.waze.design_components.b.d.aj;
        com.waze.design_components.b.e eVar = com.waze.design_components.b.e.f23312a;
        Drawable drawable2 = ContextCompat.getDrawable(context, dVar.c(eVar));
        if (drawable2 != null) {
            this.f25967f.setImageDrawable(drawable2);
        }
        ImageView imageView2 = this.f25967f;
        imageView2.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.circle_surface));
        imageView2.setColorFilter(ContextCompat.getColor(getContext(), R.color.content_p2));
        this.f25965d.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.eta_bar_right_bg));
        ImageView imageView3 = this.f25969h;
        imageView3.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.circle_surface));
        imageView3.clearColorFilter();
        com.waze.c.a.b bVar = this.v;
        com.waze.design_components.b.d dVar2 = com.waze.design_components.b.d.bs;
        boolean zL = bVar.l();
        LottieAnimationView lottieAnimationView = this.f25971j;
        int i2 = 0;
        if (zL) {
            lottieAnimationView.setVisibility(0);
            if (t.f()) {
                lottieAnimationView.k(R.raw.alt_routes_entry_point_day);
            } else {
                lottieAnimationView.k(R.raw.alt_routes_entry_point_night);
            }
            long jA = bVar.a();
            x.f(lottieAnimationView, "animation");
            x.f(lottieAnimationView, "<this>");
            if (jA > 0 && (lifecycleOwner = ViewTreeLifecycleOwner.get(lottieAnimationView)) != null) {
                lottieAnimationView.o(-1);
                lottieAnimationView.h();
                com.google.android.material.internal.o oVar = new com.google.android.material.internal.o(lottieAnimationView, 15);
                lottieAnimationView.postDelayed(oVar, jA);
                lifecycleOwner.getLifecycle().addObserver(new com.waze.ad.a(lottieAnimationView, oVar, i2));
            }
        } else {
            lottieAnimationView.setVisibility(8);
        }
        Drawable drawable3 = ContextCompat.getDrawable(getContext(), dVar2.c(eVar));
        if (drawable3 != null) {
            imageView3.setImageDrawable(drawable3);
        }
        imageView3.setVisibility(0);
        imageView3.setColorFilter(ContextCompat.getColor(getContext(), R.color.content_p2));
        this.f25966e.setVisibility(0);
        e();
        d(true != this.r ? 0.0f : 1.0f);
    }

    public final void d(float f2) {
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.r = f2 > 0.0f;
        this.f25967f.setTranslationX((-this.f25964c.getMeasuredWidth()) * f2);
        this.f25969h.setTranslationX(0.0f);
        ImageView imageView = this.m;
        imageView.setTranslationX(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        float f3 = (getResources().getConfiguration().orientation != 1 ? 0.8f : 1.0f) * f2;
        ImageView imageView2 = this.n;
        imageView2.setScaleX(f3);
        imageView2.setScaleY(f3);
        imageView2.setElevation(0.0f);
        imageView2.setAlpha(f2);
        imageView2.setVisibility(true != this.r ? 8 : 0);
    }

    public final void e() {
        this.f25972k.setVisibility(true != this.s ? 0 : 8);
    }

    public final void f() {
        this.f25972k.c();
    }

    public final void g(s sVar) {
        this.q = sVar;
    }

    public final void h(com.waze.ui.r.a.e.b.a aVar) {
        this.u = aVar;
        q();
    }

    public final void i(com.waze.main_screen.p.a.b.b.b bVar, boolean z) {
        bx bxVar = bVar.f26947c;
        if (bxVar != null && !bVar.f26946b) {
            if (this.s) {
                this.f25973l.setVisibility(8);
                this.s = false;
            }
            bp bpVar = bVar.f26948d;
            if (bpVar != this.y && bpVar != null) {
                this.y = bpVar;
                Drawable drawable = ContextCompat.getDrawable(getContext(), gu.c(bpVar).b());
                if (drawable != null) {
                    this.m.setImageDrawable(drawable);
                }
            }
            this.f25972k.post(new com.google.android.libraries.phenotype.client.stable.x(this, bxVar, 19));
            if (this.r != z) {
                this.r = z;
                d(true != z ? 0.0f : 1.0f);
            }
        } else if (!this.s) {
            this.f25973l.setVisibility(0);
            this.s = true;
        }
        e();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f25972k.b();
        d(true != this.r ? 0.0f : 1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.t.a();
        super.onDetachedFromWindow();
    }
}
