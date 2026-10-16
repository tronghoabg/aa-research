package com.bytedance.sdk.component.adexpress.ivm;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class dj extends FrameLayout {
    private final RotateAnimation moa;

    /* renamed from: oa, reason: collision with root package name */
    private final ImageView f24901oa;
    private final TextView uef;
    private final wrv yo;

    public dj(Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.yo.uef.moa(context));
        this.uef = (TextView) findViewById(2097610742);
        this.f24901oa = (ImageView) findViewById(2097610745);
        this.yo = (wrv) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30.0f, 1, 0.65f, 1, 0.9f);
        this.moa = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ivm.dj.1
            @Override // java.lang.Runnable
            public void run() {
                dj.this.f24901oa.startAnimation(dj.this.moa);
                dj.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ivm.dj.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dj.this.yo.uef(4);
                    }
                }, 100L);
                dj.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ivm.dj.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        dj.this.yo.uef(4);
                    }
                }, 300L);
                dj djVar = dj.this;
                djVar.postDelayed(djVar.getHaloAnimation(), 1200L);
            }
        };
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.uef;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void oa() {
        this.moa.cancel();
    }

    public void uef() {
        postDelayed(getHaloAnimation(), 300L);
    }
}
