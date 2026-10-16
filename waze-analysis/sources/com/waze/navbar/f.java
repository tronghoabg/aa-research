package com.waze.navbar;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.waze.R;
import com.waze.car_lib.f.u;
import com.waze.gw.Gateway;
import com.waze.navigate.df;
import com.waze.navigate.ee;
import com.waze.resources.ResourcesNativeManager;
import com.waze.ui.navbar.LaneGuidanceView;
import com.waze.ui.z.as;
import com.waze.view.navbar.NavBarText;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f extends ConstraintLayout {
    private e A;

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f30874a;

    /* renamed from: b, reason: collision with root package name */
    private final NavBarText f30875b;

    /* renamed from: c, reason: collision with root package name */
    private final NavBarText f30876c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30877d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30878e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f30879f;

    /* renamed from: g, reason: collision with root package name */
    private final InstructionView f30880g;

    /* renamed from: h, reason: collision with root package name */
    private final View f30881h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f30882i;

    /* renamed from: j, reason: collision with root package name */
    private final ViewGroup f30883j;

    /* renamed from: k, reason: collision with root package name */
    private ConstraintLayout f30884k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f30885l;
    private LinearLayout m;
    private final ViewGroup n;
    private final ViewGroup o;
    private final ViewGroup p;
    private final TextView q;
    private final ViewGroup r;
    private final LaneGuidanceView s;
    private final ImageView t;
    private float u;
    private boolean v;
    private boolean w;
    private boolean x;
    private final String y;
    private com.waze.main_screen.p.b.a.b.l z;

    public f(Context context, String str) {
        super(context);
        this.z = com.waze.main_screen.p.b.a.b.l.f27121a;
        this.A = new b(this);
        this.y = str;
        LayoutInflater.from(context).inflate(R.layout.navbar, this);
        this.o = (ViewGroup) findViewById(R.id.navBarContentContainer);
        LaneGuidanceView laneGuidanceView = (LaneGuidanceView) findViewById(R.id.laneGuidanceView);
        this.s = laneGuidanceView;
        Gateway.applyNavLaneAppearance(laneGuidanceView);
        this.f30874a = (LinearLayout) findViewById(R.id.navBarTop);
        this.f30875b = (NavBarText) findViewById(R.id.navBarStreetLine);
        this.f30876c = (NavBarText) findViewById(R.id.navBarTowardStreetLine);
        this.f30879f = (TextView) findViewById(R.id.navBarThenText);
        this.f30880g = (InstructionView) findViewById(R.id.instructionView);
        this.f30881h = findViewById(R.id.navBarHovIndicator);
        this.f30882i = (TextView) findViewById(R.id.navBarThenDirection);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navBarThen);
        this.f30883j = viewGroup;
        Gateway.applyNavThenAppearance(viewGroup);
        this.n = (ViewGroup) findViewById(R.id.navBarBox2);
        this.t = (ImageView) findViewById(R.id.btnShowNavList);
        this.p = (ViewGroup) findViewById(R.id.navBarHovBar);
        this.q = (TextView) findViewById(R.id.navBarHovBarText);
        this.r = (ViewGroup) findViewById(R.id.navBarSubViewContainer);
    }

    public static SpannableStringBuilder a(Context context, ee eeVar, boolean z, int i2) {
        int i3 = q.f30914a;
        x.f(context, "context");
        return q.a(eeVar, z, i2, i2, null, new u(context, 8), 48);
    }

    public static /* synthetic */ void e(f fVar) {
        LaneGuidanceView laneGuidanceView = fVar.s;
        laneGuidanceView.setTranslationY(0.0f);
        fVar.o.setTranslationY(0.0f);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) laneGuidanceView.getLayoutParams();
        layoutParams.height = fVar.getResources().getDimensionPixelSize(R.dimen.lane_guidance_view_condenced_height);
        laneGuidanceView.setLayoutParams(layoutParams);
    }

    public static /* synthetic */ void h(f fVar) {
        fVar.r();
        fVar.n.getLayoutTransition().enableTransitionType(4);
    }

    public static /* synthetic */ void i(f fVar) {
        fVar.r();
        fVar.n.getLayoutTransition().enableTransitionType(4);
    }

    public static SpannableStringBuilder o(Context context, ee eeVar) {
        int i2 = q.f30914a;
        x.f(context, "context");
        return q.a(eeVar, true, -1, -1, null, new u(context, 9), 48);
    }

    private final int p(boolean z, boolean z2) {
        if (this.v) {
            return 24;
        }
        boolean z3 = false;
        if (this.w && this.x) {
            z3 = true;
        }
        return (z3 && z2) ? z ? 22 : 20 : (z3 || z2) ? z ? 24 : 22 : z ? 26 : 24;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q() {
        /*
            r7 = this;
            android.view.ViewGroup r0 = r7.f30883j
            r1 = 0
            r0.setBackgroundResource(r1)
            boolean r2 = r7.z()
            r3 = 8
            if (r2 == 0) goto L1e
            r2 = 2131232438(0x7f0806b6, float:1.8080985E38)
            r0.setBackgroundResource(r2)
            android.widget.ImageView r0 = r7.t
            com.waze.main_screen.p.b.a.b.l r2 = r7.z
            boolean r2 = r2.f27128h
            r0.setVisibility(r3)
            goto L31
        L1e:
            android.content.Context r2 = r7.getContext()
            r4 = 2131100829(0x7f06049d, float:1.781405E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r4)
            r0.setBackgroundColor(r2)
            android.widget.ImageView r0 = r7.t
            r0.setVisibility(r3)
        L31:
            boolean r0 = r7.z()
            if (r0 == 0) goto L3c
            com.waze.main_screen.p.b.a.b.l r0 = r7.z
            com.waze.main_screen.p.b.a.b.e r0 = r0.f27129i
            goto L3e
        L3c:
            com.waze.main_screen.p.b.a.b.e r0 = com.waze.main_screen.p.b.a.b.e.f27099b
        L3e:
            com.waze.main_screen.p.b.a.b.l r2 = r7.z
            boolean r2 = r2.f27131k
            com.waze.main_screen.p.b.a.b.k r3 = com.waze.main_screen.p.b.a.b.k.f27118a
            com.waze.main_screen.p.b.a.b.e r3 = com.waze.main_screen.p.b.a.b.e.f27098a
            int r0 = r0.ordinal()
            r3 = 2131232435(0x7f0806b3, float:1.808098E38)
            r4 = 2131100827(0x7f06049b, float:1.7814046E38)
            r5 = 1
            if (r0 == 0) goto L7b
            if (r0 == r5) goto L56
            goto L8f
        L56:
            com.waze.ui.navbar.LaneGuidanceView r0 = r7.s
            if (r2 == 0) goto L6c
            android.content.Context r2 = r7.getContext()
            r6 = 2131100824(0x7f060498, float:1.781404E38)
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r6)
            r0.setBackgroundColor(r2)
            com.waze.gw.Gateway.applyNavLaneAppearance(r0)
            goto L8f
        L6c:
            android.content.Context r2 = r7.getContext()
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r4)
            r0.setBackgroundColor(r2)
            com.waze.gw.Gateway.applyNavLaneAppearance(r0)
            goto L8f
        L7b:
            com.waze.ui.navbar.LaneGuidanceView r0 = r7.s
            if (r2 == 0) goto L89
            r2 = 2131232436(0x7f0806b4, float:1.8080981E38)
            r0.setBackgroundResource(r2)
            com.waze.gw.Gateway.applyNavLaneAppearance(r0)
            goto L8f
        L89:
            r0.setBackgroundResource(r3)
            com.waze.gw.Gateway.applyNavLaneAppearance(r0)
        L8f:
            boolean r0 = r7.z()
            if (r0 == 0) goto L9a
            com.waze.main_screen.p.b.a.b.l r0 = r7.z
            com.waze.main_screen.p.b.a.b.e r0 = r0.f27129i
            goto L9c
        L9a:
            com.waze.main_screen.p.b.a.b.e r0 = com.waze.main_screen.p.b.a.b.e.f27099b
        L9c:
            int r0 = r0.ordinal()
            if (r0 == 0) goto Lb3
            if (r0 == r5) goto La5
            return
        La5:
            android.widget.LinearLayout r0 = r7.f30874a
            android.content.Context r7 = r7.getContext()
            int r7 = androidx.core.content.ContextCompat.getColor(r7, r4)
            r0.setBackgroundColor(r7)
            return
        Lb3:
            com.waze.main_screen.p.b.a.b.l r0 = r7.z
            com.waze.main_screen.p.b.a.b.f r0 = r0.f27130j
            com.waze.main_screen.p.b.a.b.f r2 = com.waze.main_screen.p.b.a.b.f.f27102b
            if (r0 == r2) goto Lc7
            com.waze.main_screen.p.b.a.b.l r0 = r7.z
            com.waze.main_screen.p.b.a.b.k r2 = r0.f27122b
            com.waze.main_screen.p.b.a.b.k r6 = com.waze.main_screen.p.b.a.b.k.f27119b
            if (r2 == r6) goto Lc7
            com.waze.main_screen.p.b.a.b.j r0 = r0.f27127g
            if (r0 == 0) goto Lc8
        Lc7:
            r1 = r5
        Lc8:
            com.waze.main_screen.p.b.a.b.l r0 = r7.z
            java.util.List r0 = r0.f27125e
            if (r0 == 0) goto Le5
            android.widget.LinearLayout r0 = r7.f30874a
            if (r1 == 0) goto Lde
            android.content.Context r7 = r7.getContext()
            int r7 = androidx.core.content.ContextCompat.getColor(r7, r4)
            r0.setBackgroundColor(r7)
            return
        Lde:
            r7 = 2131232433(0x7f0806b1, float:1.8080975E38)
            r0.setBackgroundResource(r7)
            return
        Le5:
            android.widget.LinearLayout r7 = r7.f30874a
            if (r5 == r1) goto Lec
            r3 = 2131232434(0x7f0806b2, float:1.8080977E38)
        Lec:
            r7.setBackgroundResource(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navbar.f.q():void");
    }

    private final void r() {
        j(true);
        j(false);
    }

    private final void s() {
        ViewGroup viewGroup = this.f30883j;
        if (viewGroup.getVisibility() == 8) {
            return;
        }
        if (viewGroup.getAnimation() != null) {
            viewGroup.getAnimation().setAnimationListener(null);
            viewGroup.clearAnimation();
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setDuration(100L);
        translateAnimation.setAnimationListener(new c(this));
        viewGroup.startAnimation(translateAnimation);
    }

    private static void t(Context context, ee eeVar, LinearLayout linearLayout, boolean z) {
        if (eeVar == null || eeVar.c().isEmpty() || linearLayout == null || z) {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        linearLayout.removeAllViews();
        Iterator it = eeVar.c().iterator();
        while (it.hasNext()) {
            Bitmap encBitmap = ResourcesNativeManager.getInstance().getEncBitmap(((df) it.next()).a());
            if (encBitmap != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) ((encBitmap.getWidth() / encBitmap.getHeight()) * as.h(context.getResources(), 28)), as.h(context.getResources(), 28));
                layoutParams.leftMargin = as.h(context.getResources(), 5);
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap(encBitmap);
                imageView.setLayoutParams(layoutParams);
                linearLayout.addView(imageView, layoutParams);
            }
        }
        linearLayout.setVisibility(linearLayout.getChildCount() > 0 ? 0 : 8);
    }

    private final void u(boolean z) {
        ViewGroup viewGroup = this.f30883j;
        if (z) {
            if (viewGroup.getChildCount() == 2 && viewGroup.getChildAt(0) == this.f30882i && viewGroup.getChildAt(1) == this.f30879f) {
                return;
            }
            viewGroup.removeAllViews();
            viewGroup.addView(this.f30882i);
            viewGroup.addView(this.f30879f);
            return;
        }
        if (viewGroup.getChildCount() == 2 && viewGroup.getChildAt(0) == this.f30879f && viewGroup.getChildAt(1) == this.f30882i) {
            return;
        }
        viewGroup.removeAllViews();
        viewGroup.addView(this.f30879f);
        viewGroup.addView(this.f30882i);
    }

    private final void v(CharSequence charSequence, boolean z) {
        NavBarText navBarText = z ? this.f30875b : this.f30876c;
        navBarText.setText(charSequence);
        x(z, false);
        navBarText.getViewTreeObserver().addOnGlobalLayoutListener(new d(this, navBarText, z));
    }

    private final void w() {
        this.f30875b.setVisibility(true != this.w ? 8 : 0);
        this.f30876c.setVisibility(true == this.x ? 0 : 8);
    }

    private final void x(boolean z, boolean z2) {
        if (z) {
            this.f30877d = z2;
        } else {
            this.f30878e = z2;
        }
    }

    private final void y() {
        LaneGuidanceView laneGuidanceView = this.s;
        laneGuidanceView.animate().setListener(null);
        laneGuidanceView.animate().cancel();
        ViewGroup viewGroup = this.o;
        viewGroup.animate().setListener(null);
        viewGroup.animate().cancel();
    }

    private final boolean z() {
        return getContext().getResources().getConfiguration().orientation == 2;
    }

    public final void j(boolean z) {
        NavBarText navBarText = z ? this.f30875b : this.f30876c;
        if (navBarText.getVisibility() == 8) {
            return;
        }
        int i2 = 1;
        boolean z2 = (z && !this.f30877d) || !(z || this.f30878e);
        if (this.v) {
            navBarText.setTextSize(2, p(z, false));
            x(z, false);
        } else if (z2) {
            navBarText.setTextSize(2, p(z, navBarText.getLineCount() > 1));
            x(z, true);
        }
        if (!this.v && (!this.w || !this.x)) {
            i2 = 2;
        }
        navBarText.setMaxLines(i2);
        navBarText.setEllipsize(TextUtils.TruncateAt.END);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0309  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.waze.main_screen.p.b.a.b.l r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navbar.f.k(com.waze.main_screen.p.b.a.b.l):void");
    }

    public final void l(e eVar) {
        this.A = eVar;
        this.u = getResources().getDisplayMetrics().density;
        this.r.bringToFront();
        LinearLayout linearLayout = this.f30874a;
        linearLayout.bringToFront();
        this.t.bringToFront();
        linearLayout.setOnClickListener(new com.waze.main_screen.bottom_bars.a.a(this, 6));
        this.f30879f.setText(this.y);
        this.f30884k = (ConstraintLayout) findViewById(R.id.navBarDistanceBox);
        this.f30885l = (TextView) findViewById(R.id.navBarDistance);
        this.m = (LinearLayout) findViewById(R.id.navBarExitSignsLayout);
        setLayoutTransition(null);
        LayoutTransition layoutTransition = linearLayout.getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.enableTransitionType(4);
        }
    }

    public final void m(e eVar) {
        this.A = eVar;
    }
}
