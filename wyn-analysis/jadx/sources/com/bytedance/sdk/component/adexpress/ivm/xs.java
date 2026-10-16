package com.bytedance.sdk.component.adexpress.ivm;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class xs extends tpx {

    /* renamed from: oa, reason: collision with root package name */
    private View f24917oa;
    private TextView uef;
    private AnimatorSet yo;

    public xs(Context context) {
        super(context);
        this.yo = new AnimatorSet();
        oa(context);
    }

    private void moa() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24917oa, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.moa.xs.uef(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f24917oa, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.yo.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.yo.setDuration(1000L);
        this.yo.start();
    }

    private void oa(Context context) {
        View viewUef = com.bytedance.sdk.component.adexpress.yo.uef.uef(context);
        this.f24917oa = viewUef;
        addView(viewUef);
        setClipChildren(false);
        this.uef = (TextView) findViewById(2097610748);
    }

    public void setButtonText(String str) {
        if (this.uef == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.uef.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.ivm.tpx
    public void uef(Context context) {
    }

    @Override // com.bytedance.sdk.component.adexpress.ivm.tpx
    public void uef() {
        moa();
    }

    @Override // com.bytedance.sdk.component.adexpress.ivm.tpx
    public void oa() {
        this.yo.cancel();
    }
}
