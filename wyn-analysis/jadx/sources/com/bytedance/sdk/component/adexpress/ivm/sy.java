package com.bytedance.sdk.component.adexpress.ivm;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sy extends LinearLayout {
    private LinearLayout bcc;
    private int cz;
    private int dj;
    private TextView ivm;
    private TextView lw;
    private com.bytedance.sdk.component.utils.gsd moa;

    /* renamed from: oa, reason: collision with root package name */
    private TextView f24910oa;
    private TextView uef;
    private JSONObject wrv;
    private uef xs;
    private ImageView yo;
    private int zjm;

    /* renamed from: com.bytedance.sdk.component.adexpress.ivm.sy$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (sy.this.yo != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new oa(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.ivm.sy.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        sy.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ivm.sy.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                sy.this.yo.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                sy.this.yo.startAnimation(rotateAnimation);
            }
        }
    }

    public static class oa implements Interpolator {
        private oa() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return f10 <= 0.25f ? (f10 * (-2.0f)) + 0.5f : f10 <= 0.5f ? (f10 * 4.0f) - 1.0f : f10 <= 0.75f ? (f10 * (-4.0f)) + 3.0f : (f10 * 2.0f) - 1.5f;
        }

        public /* synthetic */ oa(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public interface uef {
    }

    public sy(Context context, View view, int i5, int i10, int i11, JSONObject jSONObject) {
        super(context);
        this.cz = i5;
        this.zjm = i10;
        this.dj = i11;
        this.wrv = jSONObject;
        uef(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.bcc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.moa == null) {
                this.moa = new com.bytedance.sdk.component.utils.gsd(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.ivm.sy.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
    }

    public void setOnShakeViewListener(uef uefVar) {
        this.xs = uefVar;
    }

    public void setShakeText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.lw.setText(str);
        } else {
            this.lw.setVisibility(8);
            this.ivm.setVisibility(8);
        }
    }

    public void uef(Context context, View view) {
        addView(view);
        this.bcc = (LinearLayout) findViewById(2097610727);
        this.yo = (ImageView) findViewById(2097610725);
        this.uef = (TextView) findViewById(2097610724);
        this.f24910oa = (TextView) findViewById(2097610726);
        this.lw = (TextView) findViewById(2097610723);
        this.ivm = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.bcc.setBackground(gradientDrawable);
    }

    public void uef() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }
}
