package com.google.android.gearhead.appdecor;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.auto.components.drawer.AlphaJumpFab;
import com.google.android.apps.auto.components.drawer.AlphaJumpKeyboard;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import com.google.android.projection.gearhead.R;
import defpackage.krj;
import defpackage.law;
import defpackage.lzc;
import defpackage.mar;
import defpackage.oln;
import defpackage.omz;
import defpackage.osq;
import defpackage.qfw;
import defpackage.qfx;
import defpackage.qfz;
import defpackage.qgr;
import defpackage.qgw;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public class DrawerContentLayout extends FrameLayout implements law {
    public static final yph a = yph.c("ADU.DrawerContentLayout");
    protected osq A;
    public final Context b;
    public qgw c;
    public PagedListView d;
    public ProgressBar e;
    public AlphaJumpFab f;
    public AlphaJumpKeyboard g;
    public TextView h;
    public View i;
    public ImageView j;
    public lzc k;
    mar l;
    public boolean m;
    public boolean n;
    public int o;
    public View p;
    public float q;
    public float r;
    public qgr s;
    public Runnable t;
    public View u;
    public View v;
    public View w;
    public View x;
    protected final oln y;
    protected final oln z;

    public DrawerContentLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.o = -1;
        this.y = new qfw(this);
        this.z = new qfx(this);
        this.A = new qfz(this);
        this.b = context;
        mar marVar = new mar(context);
        this.l = marVar;
        marVar.c(true);
        setVisibility(4);
    }

    @Override // defpackage.las
    public final AlphaJumpKeyboard a() {
        return this.g;
    }

    @Override // defpackage.las
    public final void b() throws Resources.NotFoundException {
        Context context = this.b;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.drawer_up_out);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.drawer_up_in);
        this.d.setVisibility(0);
        animationLoadAnimation.setAnimationListener(this.z);
        ((ype) a.l().ai((char) 7095)).u("showDrawerHeaderShadow");
        this.p.setVisibility(0);
        this.g.startAnimation(animationLoadAnimation);
        this.d.startAnimation(animationLoadAnimation2);
    }

    @Override // defpackage.las
    public final void c() throws Resources.NotFoundException {
        Context context = this.b;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.drawer_down_out);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.drawer_down_in);
        AlphaJumpKeyboard alphaJumpKeyboard = this.g;
        if (!alphaJumpKeyboard.c) {
            alphaJumpKeyboard.b.fullScroll(33);
        }
        this.g.setVisibility(0);
        animationLoadAnimation.setAnimationListener(this.y);
        ((ype) a.l().ai((char) 7092)).u("hideDrawerHeaderShadow");
        this.p.setVisibility(8);
        this.d.startAnimation(animationLoadAnimation);
        this.g.startAnimation(animationLoadAnimation2);
    }

    @Override // defpackage.las
    public final void d(int i) {
        this.d.l(i);
    }

    @Override // defpackage.law
    public final int e() {
        return this.d.h();
    }

    @Override // defpackage.law
    public final AlphaJumpFab f() {
        return this.f;
    }

    @Override // defpackage.law
    public final void g(Runnable runnable) {
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
        qgr qgrVar = this.s;
        if (qgrVar != null) {
            Log.v("GH.MenuItemHolder", "disable end bouncer");
            View view = qgrVar.x;
            view.setOnFocusChangeListener(null);
            view.setFocusable(false);
            view.setClickable(false);
            this.s = null;
        }
    }

    public final void j(int i) {
        ((ype) a.l().ai((char) 7094)).w("onMenuItemCountChanged %d", i);
        if (this.o == i) {
            return;
        }
        this.o = i;
        if (this.m) {
            return;
        }
        PagedListView pagedListView = this.d;
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
        this.w.setOnFocusChangeListener(new krj((Object) this, 8));
        this.x.setFocusable(true);
        this.x.setOnFocusChangeListener(new krj((Object) this, 9));
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int color = getContext().getColor(R.color.drawer_background);
        int color2 = getContext().getColor(R.color.gearhead_sdk_card_background);
        setBackgroundColor(color);
        View view = this.p;
        if (view != null) {
            view.setBackgroundColor(color2);
        }
        PagedListView pagedListView = this.d;
        if (pagedListView != null) {
            pagedListView.n(0);
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setTextAppearance(getContext(), R.style.GearheadSdkBody1);
        }
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setImageDrawable(omz.a(this.b));
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        setSystemUiVisibility((i & 1024) != 0 ? 4 : 0);
    }

    public DrawerContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public DrawerContentLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DrawerContentLayout(Context context) {
        this(context, null, 0, 0);
    }
}
