package com.bytedance.sdk.component.adexpress.ivm;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class gzw extends FrameLayout {
    private static final int cz = (com.bytedance.sdk.component.adexpress.dynamic.lw.dj.oa("", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true)[1] / 2) + 1;
    private static final int zjm = (com.bytedance.sdk.component.adexpress.dynamic.lw.dj.oa("", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true)[1] / 2) + 3;
    private float bcc;
    private Drawable ivm;
    private Drawable lw;
    private float moa;

    /* renamed from: oa, reason: collision with root package name */
    LinearLayout f24904oa;
    LinearLayout uef;
    private double xs;
    private float yo;

    public gzw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.uef = new LinearLayout(getContext());
        this.f24904oa = new LinearLayout(getContext());
        this.uef.setOrientation(0);
        this.uef.setGravity(8388611);
        this.f24904oa.setOrientation(0);
        this.f24904oa.setGravity(8388611);
        this.lw = com.bytedance.sdk.component.utils.orq.yo(context, "tt_star_thick");
        this.ivm = com.bytedance.sdk.component.utils.orq.yo(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.yo, (int) this.moa));
        imageView.setPadding(1, cz, 1, zjm);
        return imageView;
    }

    public Drawable getStarEmptyDrawable() {
        return this.lw;
    }

    public Drawable getStarFillDrawable() {
        return this.ivm;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        this.uef.measure(i5, i10);
        double d3 = this.xs;
        float f10 = this.yo;
        this.f24904oa.measure(View.MeasureSpec.makeMeasureSpec((int) (((d3 - ((int) d3)) * (f10 - 2.0f)) + (((int) d3) * f10) + 1.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(this.uef.getMeasuredHeight(), 1073741824));
        if (this.bcc > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.uef.setPadding(0, ((int) (r7.getMeasuredHeight() - this.bcc)) / 2, 0, 0);
            this.f24904oa.setPadding(0, ((int) (this.uef.getMeasuredHeight() - this.bcc)) / 2, 0, 0);
        }
    }

    public void uef(double d3, int i5, int i10, int i11) {
        float f10 = i10;
        this.yo = (int) com.bytedance.sdk.component.adexpress.moa.xs.yo(getContext(), f10);
        this.moa = (int) com.bytedance.sdk.component.adexpress.moa.xs.yo(getContext(), f10);
        this.xs = d3;
        this.bcc = i11;
        removeAllViews();
        for (int i12 = 0; i12 < 5; i12++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i5, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f24904oa.addView(starImageView);
        }
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.uef.addView(starImageView2);
        }
        addView(this.uef);
        addView(this.f24904oa);
        requestLayout();
    }
}
