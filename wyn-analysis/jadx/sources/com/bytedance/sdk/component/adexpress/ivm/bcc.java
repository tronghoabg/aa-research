package com.bytedance.sdk.component.adexpress.ivm;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class bcc extends tpx {
    private AnimatorSet ivm;
    private int lw;
    private ImageView moa;

    /* renamed from: oa, reason: collision with root package name */
    private ImageView f24896oa;
    private TextView uef;
    private ImageView yo;

    public bcc(Context context) {
        super(context);
        this.ivm = new AnimatorSet();
        oa(context);
    }

    private void moa() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    private void oa(Context context) {
        addView(com.bytedance.sdk.component.adexpress.yo.uef.oa(context));
        this.f24896oa = (ImageView) findViewById(2097610751);
        this.yo = (ImageView) findViewById(2097610750);
        this.moa = (ImageView) findViewById(2097610749);
        this.uef = (TextView) findViewById(2097610748);
    }

    public float getAlphaColor() {
        return this.lw;
    }

    public void setAlphaColor(int i5) {
        if (i5 < 0 || i5 > 60) {
            return;
        }
        int i10 = i5 + 195;
        ImageView imageView = this.moa;
        int iRgb = Color.rgb(i10, i10, i10);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i11 = ((i5 + 20) % 60) + 195;
        this.yo.setColorFilter(Color.rgb(i11, i11, i11), mode);
        int i12 = ((i5 + 40) % 60) + 195;
        this.f24896oa.setColorFilter(Color.rgb(i12, i12, i12), mode);
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
        this.ivm.cancel();
    }
}
