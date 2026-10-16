package com.waze.sharedui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class WazeSwitchView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final LayoutInflater f39161a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f39162b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f39163c;

    /* renamed from: d, reason: collision with root package name */
    private float f39164d;

    /* renamed from: e, reason: collision with root package name */
    private w f39165e;

    /* renamed from: f, reason: collision with root package name */
    private int f39166f;

    public WazeSwitchView(Context context) {
        super(context);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f39161a = layoutInflaterFrom;
        layoutInflaterFrom.inflate(R.layout.waze_switch_view, this);
        g();
    }

    static /* bridge */ /* synthetic */ void e(WazeSwitchView wazeSwitchView, int i2) {
        int i3;
        float f2;
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new ScaleAnimation(1.15f, 0.95f, 0.9f, 1.0f, 1, i2 == 1 ? 1.0f : 0.0f, 1, 0.5f));
        if (i2 == 1) {
            f2 = wazeSwitchView.f39164d * 34.0f;
            i3 = 1;
        } else {
            i3 = 2;
            f2 = 0.0f;
        }
        animationSet.addAnimation(new TranslateAnimation(f2, f2, 0.0f, 0.0f));
        animationSet.setFillAfter(true);
        animationSet.setDuration(60L);
        animationSet.setInterpolator(new DecelerateInterpolator(0.5f));
        animationSet.setAnimationListener(new al(wazeSwitchView, i3));
        wazeSwitchView.f39163c.setAnimation(animationSet);
    }

    static /* bridge */ /* synthetic */ void f(WazeSwitchView wazeSwitchView, int i2) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new ScaleAnimation(0.95f, 1.0f, 1.0f, 1.0f, 1, i2 == 1 ? 1.0f : 0.0f, 1, 0.5f));
        float f2 = i2 == 1 ? wazeSwitchView.f39164d * 34.0f : 0.0f;
        animationSet.addAnimation(new TranslateAnimation(f2, f2, 0.0f, 0.0f));
        animationSet.setFillAfter(true);
        animationSet.setDuration(40L);
        animationSet.setInterpolator(new DecelerateInterpolator(0.5f));
        wazeSwitchView.f39163c.setAnimation(animationSet);
    }

    private final void g() {
        this.f39162b = (ImageView) findViewById(R.id.switch_bg_on);
        this.f39163c = (ImageView) findViewById(R.id.switch_handle);
        float f2 = getContext().getResources().getDisplayMetrics().density;
        this.f39164d = f2;
        int i2 = (int) (f2 * 10.0f);
        setPadding(i2, i2, i2, i2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void a(w wVar) {
        this.f39165e = wVar;
    }

    public final void b(boolean z) {
        TranslateAnimation translateAnimation;
        int i2 = z ? 1 : 2;
        this.f39166f = i2;
        if (i2 - 1 != 0) {
            translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            this.f39162b.setVisibility(4);
        } else {
            float f2 = this.f39164d * 34.0f;
            translateAnimation = new TranslateAnimation(f2, f2, 0.0f, 0.0f);
            this.f39162b.setVisibility(0);
        }
        translateAnimation.setDuration(0L);
        translateAnimation.setFillAfter(true);
        this.f39163c.startAnimation(translateAnimation);
        this.f39162b.clearAnimation();
        this.f39162b.setVisibility(true == z ? 0 : 4);
    }

    public final void c() {
        float f2;
        int i2 = 2;
        int i3 = true != d() ? 1 : 2;
        this.f39166f = i3;
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.15f, 1.0f, 0.9f, 1, i3 == 1 ? 1.0f : 0.0f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        animationSet.addAnimation(scaleAnimation);
        if (i3 == 1) {
            i2 = 1;
            f2 = 0.0f;
        } else {
            f2 = this.f39164d * 34.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f2, i2 == 1 ? this.f39164d * 34.0f : 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(100L);
        translateAnimation.setInterpolator(new AccelerateInterpolator(0.5f));
        animationSet.addAnimation(translateAnimation);
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(new ak(this, i2));
        this.f39163c.startAnimation(animationSet);
        AlphaAnimation alphaAnimation = i2 + (-1) != 0 ? new AlphaAnimation(1.0f, 0.0f) : new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(100L);
        alphaAnimation.setFillAfter(true);
        this.f39162b.setVisibility(0);
        this.f39162b.startAnimation(alphaAnimation);
        w wVar = this.f39165e;
        if (wVar != null) {
            wVar.a(d());
        }
    }

    public final boolean d() {
        return this.f39166f == 1;
    }

    public WazeSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f39161a = layoutInflaterFrom;
        layoutInflaterFrom.inflate(R.layout.waze_switch_view, this);
        g();
    }
}
