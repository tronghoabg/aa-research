package com.bytedance.sdk.component.adexpress.ivm;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cp;

/* loaded from: classes.dex */
public class yo extends FrameLayout {
    private AnimatorSet ivm;
    private ab lw;
    private TextView moa;

    /* renamed from: oa, reason: collision with root package name */
    private ImageView f24918oa;
    private Context uef;
    private ImageView yo;

    public yo(Context context) {
        super(context);
        this.ivm = new AnimatorSet();
        this.uef = context;
        lw();
        ivm();
    }

    private void ivm() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.yo, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.yo, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.ivm.setDuration(800L);
        this.ivm.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void lw() {
        FrameLayout frameLayout = new FrameLayout(this.uef);
        this.lw = new ab(this.uef);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 95.0f), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.lw, layoutParams);
        this.f24918oa = new ImageView(this.uef);
        int iUef = cp.uef(this.uef, 60.0f);
        this.f24918oa.setImageDrawable(com.bytedance.sdk.component.adexpress.moa.bcc.uef(1, null, null, new int[]{iUef, iUef}, Integer.valueOf(cp.uef(this.uef, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 75.0f), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.f24918oa, layoutParams2);
        this.yo = new ImageView(this.uef);
        int iUef2 = cp.uef(this.uef, 50.0f);
        this.yo.setImageDrawable(com.bytedance.sdk.component.adexpress.moa.bcc.uef(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iUef2, iUef2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 63.0f), (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(this.uef, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.yo, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.uef);
        this.moa = textView;
        textView.setTextColor(-1);
        this.moa.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.moa, layoutParams4);
    }

    public void moa() {
        this.lw.oa();
        this.lw.yo();
    }

    public void oa() {
        this.ivm.cancel();
    }

    public void setGuideText(String str) {
        this.moa.setText(str);
    }

    public void uef() {
        this.ivm.start();
    }

    public void yo() {
        this.lw.uef();
    }
}
