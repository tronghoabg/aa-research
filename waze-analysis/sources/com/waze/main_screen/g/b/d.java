package com.waze.main_screen.g.b;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.waze.R;
import com.waze.bv.h;
import com.waze.gw.Gateway;
import com.waze.sharedui.views.WazeTextView;
import com.waze.ui.z.as;
import com.waze.view.map.SpeedometerColoredView;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    final View f26362a;

    /* renamed from: b, reason: collision with root package name */
    final TextView f26363b;

    /* renamed from: c, reason: collision with root package name */
    final TextView f26364c;

    /* renamed from: d, reason: collision with root package name */
    final View f26365d;

    /* renamed from: e, reason: collision with root package name */
    final WazeTextView f26366e;

    /* renamed from: f, reason: collision with root package name */
    final WazeTextView f26367f;

    /* renamed from: g, reason: collision with root package name */
    final SpeedometerColoredView f26368g;

    /* renamed from: h, reason: collision with root package name */
    private final int f26369h;

    /* renamed from: i, reason: collision with root package name */
    private final int f26370i;

    /* renamed from: j, reason: collision with root package name */
    private final int f26371j;

    /* renamed from: k, reason: collision with root package name */
    private a f26372k;

    /* renamed from: l, reason: collision with root package name */
    private h f26373l;
    private final Runnable m;
    private final Runnable n;

    public d(Context context) {
        super(context);
        this.f26372k = new a(-1, 0.0f, true, 0.0f, 0.0f, true, false, 1, false, 0);
        this.f26373l = null;
        this.m = new c(this, 1, null);
        this.n = new c(this, 0);
        this.f26369h = as.h(context.getResources(), -30);
        this.f26370i = as.h(context.getResources(), 27);
        this.f26371j = as.h(context.getResources(), 65);
        LayoutInflater.from(context).inflate(R.layout.speedometer, this);
        View viewFindViewById = findViewById(R.id.Speedometer);
        this.f26362a = viewFindViewById;
        SpeedometerColoredView speedometerColoredView = (SpeedometerColoredView) findViewById(R.id.SpeedometerColoredView);
        this.f26368g = speedometerColoredView;
        View viewFindViewById2 = findViewById(R.id.speedLimitWarnLayout);
        this.f26365d = viewFindViewById2;
        this.f26366e = (WazeTextView) findViewById(R.id.speedLimitWarn);
        WazeTextView wazeTextView = (WazeTextView) findViewById(R.id.speedLimitWarnUsOverlay);
        this.f26367f = wazeTextView;
        viewFindViewById.setVisibility(8);
        viewFindViewById2.setVisibility(8);
        wazeTextView.setVisibility(8);
        this.f26363b = (TextView) findViewById(R.id.speedText);
        this.f26364c = (TextView) findViewById(R.id.speedUnits);
        speedometerColoredView.invalidate();
        Gateway.attachHud(this);
    }

    private final void h() throws Resources.NotFoundException {
        this.f26363b.setTextColor(getResources().getColor(R.color.White));
        View view = this.f26365d;
        view.setVisibility(8);
        view.clearAnimation();
        removeCallbacks(this.m);
        a aVarB = this.f26372k.b(true);
        this.f26372k = aVarB;
        this.f26372k = aVarB.f(false);
    }

    private final void i(boolean z) {
        View view = this.f26365d;
        int visibility = view.getVisibility();
        view.setVisibility(0);
        boolean zJ = j();
        WazeTextView wazeTextView = this.f26366e;
        if (zJ) {
            wazeTextView.setBackgroundResource(R.drawable.speedlimit_us_notext);
        } else {
            wazeTextView.setBackgroundResource(R.drawable.speedlimit_world);
        }
        if (z) {
            AnimationSet animationSet = new AnimationSet(true);
            if (visibility == 0) {
                animationSet.addAnimation(new ScaleAnimation(1.0f, 1.9f, 1.0f, 1.9f, 1, 0.5f, 1, 0.5f));
                animationSet.addAnimation(new TranslateAnimation(0.0f, this.f26369h, 0.0f, this.f26370i));
                animationSet.setInterpolator(new AccelerateInterpolator());
                if (j()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setFillAfter(true);
                    WazeTextView wazeTextView2 = this.f26367f;
                    wazeTextView2.setVisibility(0);
                    wazeTextView2.startAnimation(alphaAnimation);
                }
            } else {
                animationSet.addAnimation(new ScaleAnimation(0.0f, 1.9f, 0.0f, 1.9f, 1, 0.5f, 1, 0.5f));
                float f2 = this.f26369h;
                animationSet.addAnimation(new TranslateAnimation(f2, f2, this.f26371j, this.f26370i));
                animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                animationSet.setInterpolator(new OvershootInterpolator());
                if (j()) {
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 1.0f);
                    alphaAnimation2.setDuration(300L);
                    alphaAnimation2.setFillAfter(true);
                    WazeTextView wazeTextView3 = this.f26367f;
                    wazeTextView3.setVisibility(0);
                    wazeTextView3.startAnimation(alphaAnimation2);
                }
            }
            animationSet.setFillAfter(true);
            animationSet.setDuration(300L);
            findViewById(R.id.speedLimitWarnLayout).startAnimation(animationSet);
            postDelayed(this.m, 2300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        return this.f26373l.f17519c;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.waze.bv.h r42) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.g.b.d.f(com.waze.bv.h):void");
    }
}
