package com.google.android.gearhead.appdecor;

/* JADX INFO: loaded from: classes2.dex */
public class DrawerContentLayout extends android.widget.FrameLayout implements defpackage.lbb {
    public static final defpackage.yqm a = defpackage.yqm.c("ADU.DrawerContentLayout");
    protected defpackage.otn A;
    public final android.content.Context b;
    public defpackage.qhr c;
    public com.google.android.apps.auto.sdk.ui.PagedListView d;
    public android.widget.ProgressBar e;
    public com.google.android.apps.auto.components.drawer.AlphaJumpFab f;
    public com.google.android.apps.auto.components.drawer.AlphaJumpKeyboard g;
    public android.widget.TextView h;
    public android.view.View i;
    public android.widget.ImageView j;
    public defpackage.lzi k;
    defpackage.may l;
    public boolean m;
    public boolean n;
    public int o;
    public android.view.View p;
    public float q;
    public float r;
    public defpackage.qhm s;
    public java.lang.Runnable t;
    public android.view.View u;
    public android.view.View v;
    public android.view.View w;
    public android.view.View x;
    protected final defpackage.omg y;
    protected final defpackage.omg z;

    public DrawerContentLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.o = -1;
        this.y = new defpackage.qgr(this);
        this.z = new defpackage.qgs(this);
        this.A = new defpackage.qgu(this);
        this.b = context;
        defpackage.may mayVar = new defpackage.may(context);
        this.l = mayVar;
        mayVar.c(true);
        setVisibility(4);
    }

    @Override // defpackage.lax
    public final com.google.android.apps.auto.components.drawer.AlphaJumpKeyboard a() {
        return this.g;
    }

    @Override // defpackage.lax
    public final void b() {
        android.content.Context context = this.b;
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.drawer_up_out);
        android.view.animation.Animation animationLoadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.drawer_up_in);
        this.d.setVisibility(0);
        animationLoadAnimation.setAnimationListener(this.z);
        ((defpackage.yqj) a.l().ai((char) 7120)).u("showDrawerHeaderShadow");
        this.p.setVisibility(0);
        this.g.startAnimation(animationLoadAnimation);
        this.d.startAnimation(animationLoadAnimation2);
    }

    @Override // defpackage.lax
    public final void c() {
        android.content.Context context = this.b;
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.drawer_down_out);
        android.view.animation.Animation animationLoadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.drawer_down_in);
        com.google.android.apps.auto.components.drawer.AlphaJumpKeyboard alphaJumpKeyboard = this.g;
        if (!alphaJumpKeyboard.c) {
            alphaJumpKeyboard.b.fullScroll(33);
        }
        this.g.setVisibility(0);
        animationLoadAnimation.setAnimationListener(this.y);
        ((defpackage.yqj) a.l().ai((char) 7117)).u("hideDrawerHeaderShadow");
        this.p.setVisibility(8);
        this.d.startAnimation(animationLoadAnimation);
        this.g.startAnimation(animationLoadAnimation2);
    }

    @Override // defpackage.lax
    public final void d(int i) {
        this.d.l(i);
    }

    @Override // defpackage.lbb
    public final int e() {
        return this.d.h();
    }

    @Override // defpackage.lbb
    public final com.google.android.apps.auto.components.drawer.AlphaJumpFab f() {
        return this.f;
    }

    @Override // defpackage.lbb
    public final void g(java.lang.Runnable runnable) {
        this.t = runnable;
    }

    public final void h() {
        this.d.setDescendantFocusability(131072);
        this.w.setFocusable(false);
        this.x.setFocusable(false);
        this.v.setVisibility(8);
        this.v.setFocusable(false);
    }

    final void i() {
        h();
        this.u.setVisibility(8);
        defpackage.qhm qhmVar = this.s;
        if (qhmVar != null) {
            android.util.Log.v("GH.MenuItemHolder", "disable end bouncer");
            android.view.View view = qhmVar.x;
            view.setOnFocusChangeListener(null);
            view.setFocusable(false);
            view.setClickable(false);
            this.s = null;
        }
    }

    public final void j(int i) {
        ((defpackage.yqj) a.l().ai((char) 7119)).w("onMenuItemCountChanged %d", i);
        if (this.o == i) {
            return;
        }
        this.o = i;
        if (this.m) {
            return;
        }
        com.google.android.apps.auto.sdk.ui.PagedListView pagedListView = this.d;
        if (i != 0) {
            pagedListView.setVisibility(0);
            this.h.setVisibility(8);
        } else {
            pagedListView.setVisibility(8);
            this.h.setVisibility(0);
        }
    }

    final void k() {
        this.u.setFocusable(false);
        this.v.setVisibility(0);
        this.d.setDescendantFocusability(393216);
        this.v.setFocusable(true);
        this.v.requestFocus();
        this.w.setFocusable(true);
        this.w.setOnFocusChangeListener(new defpackage.krq((java.lang.Object) this, 8));
        this.x.setFocusable(true);
        this.x.setOnFocusChangeListener(new defpackage.krq((java.lang.Object) this, 9));
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int color = getContext().getColor(com.google.android.projection.gearhead.R.color.drawer_background);
        int color2 = getContext().getColor(com.google.android.projection.gearhead.R.color.gearhead_sdk_card_background);
        setBackgroundColor(color);
        android.view.View view = this.p;
        if (view != null) {
            view.setBackgroundColor(color2);
        }
        com.google.android.apps.auto.sdk.ui.PagedListView pagedListView = this.d;
        if (pagedListView != null) {
            pagedListView.n(0);
        }
        android.widget.TextView textView = this.h;
        if (textView != null) {
            textView.setTextAppearance(getContext(), com.google.android.projection.gearhead.R.style.GearheadSdkBody1);
        }
        android.widget.ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setImageDrawable(defpackage.ons.a(this.b));
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        setSystemUiVisibility((i & 1024) != 0 ? 4 : 0);
    }

    public DrawerContentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public DrawerContentLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DrawerContentLayout(android.content.Context context) {
        this(context, null, 0, 0);
    }
}
