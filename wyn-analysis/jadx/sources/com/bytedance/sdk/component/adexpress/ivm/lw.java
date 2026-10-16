package com.bytedance.sdk.component.adexpress.ivm;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class lw extends FrameLayout {

    /* renamed from: oa, reason: collision with root package name */
    private AnimatorSet f24905oa;
    private ImageView uef;

    public lw(Context context) {
        super(context);
        yo();
        moa();
    }

    private void moa() {
        this.f24905oa = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.uef, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.uef, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f24905oa.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void yo() {
        ImageView imageView = new ImageView(getContext());
        this.uef = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.orq.moa(getContext(), "tt_white_hand"));
        int iUef = (int) com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iUef, iUef);
        layoutParams.gravity = 17;
        addView(this.uef, layoutParams);
    }

    public void oa() {
        AnimatorSet animatorSet = this.f24905oa;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void uef() {
        AnimatorSet animatorSet = this.f24905oa;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
