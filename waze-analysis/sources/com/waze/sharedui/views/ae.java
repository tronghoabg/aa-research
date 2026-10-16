package com.waze.sharedui.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final LayoutInflater f39199a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f39200b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f39201c;

    /* renamed from: d, reason: collision with root package name */
    private w f39202d;

    /* renamed from: e, reason: collision with root package name */
    private int f39203e;

    public ae(Context context) {
        super(context);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f39199a = layoutInflaterFrom;
        layoutInflaterFrom.inflate(R.layout.waze_radio, this);
        this.f39200b = (ImageView) findViewById(R.id.radio_bg_on);
        this.f39201c = (ImageView) findViewById(R.id.radio_bg_off);
        int i2 = (int) (getContext().getResources().getDisplayMetrics().density * 3.0f);
        setPadding(i2, i2, i2, i2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    private final void e(int i2) {
        AnimationSet animationSet = new AnimationSet(true);
        ImageView imageView = this.f39201c;
        imageView.setVisibility(0);
        int i3 = i2 - 1;
        if (i3 != 0) {
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        } else {
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        }
        animationSet.setDuration(100L);
        animationSet.setFillAfter(true);
        imageView.startAnimation(animationSet);
        AnimationSet animationSet2 = new AnimationSet(true);
        ImageView imageView2 = this.f39200b;
        imageView2.setVisibility(0);
        if (i3 != 0) {
            animationSet2.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet2.addAnimation(new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f));
        } else {
            animationSet2.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet2.addAnimation(new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f));
        }
        animationSet2.setDuration(200L);
        animationSet2.setInterpolator(new OvershootInterpolator(0.95f));
        animationSet2.setFillAfter(true);
        imageView2.startAnimation(animationSet2);
    }

    public final void a(w wVar) {
        this.f39202d = wVar;
    }

    public final void b(boolean z) {
        this.f39203e = z ? 1 : 2;
        ImageView imageView = this.f39201c;
        imageView.setVisibility(true != z ? 0 : 4);
        imageView.clearAnimation();
        ImageView imageView2 = this.f39200b;
        imageView2.setVisibility(true != z ? 4 : 0);
        imageView2.clearAnimation();
    }

    public final void c(boolean z) {
        int i2 = true != z ? 2 : 1;
        this.f39203e = i2;
        e(i2);
    }

    public final void d() {
        int i2 = true == isSelected() ? 2 : 1;
        this.f39203e = i2;
        e(i2);
        w wVar = this.f39202d;
        if (wVar != null) {
            wVar.a(isSelected());
        }
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.f39203e == 1;
    }
}
