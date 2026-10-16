package com.bytedance.adsdk.ugeno.cz.lw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.moa;
import com.bytedance.adsdk.ugeno.xs.bcc;

/* loaded from: classes.dex */
public class uef extends FrameLayout {
    private moa bcc;
    private LinearLayout ivm;
    private LinearLayout lw;
    private float moa;

    /* renamed from: oa, reason: collision with root package name */
    private float f24704oa;
    private float uef;
    private Context xs;
    private double yo;

    public uef(Context context) {
        super(context);
        this.xs = context;
        this.lw = new LinearLayout(context);
        this.ivm = new LinearLayout(context);
        this.lw.setOrientation(0);
        this.lw.setGravity(8388611);
        this.ivm.setOrientation(0);
        this.ivm.setGravity(8388611);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.uef, (int) this.f24704oa);
        float f10 = this.moa;
        layoutParams.leftMargin = (int) f10;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f10;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        moa moaVar = this.bcc;
        if (moaVar != null) {
            moaVar.xs();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        moa moaVar = this.bcc;
        if (moaVar != null) {
            moaVar.bcc();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        moa moaVar = this.bcc;
        if (moaVar != null) {
            moaVar.uef(i5, i10, i11, i12);
        }
        super.onLayout(z2, i5, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        moa moaVar = this.bcc;
        if (moaVar != null) {
            moaVar.uef(i5, i10);
        }
        super.onMeasure(i5, i10);
        this.lw.measure(i5, i10);
        double dFloor = Math.floor(this.yo);
        float f10 = this.moa;
        this.ivm.measure(View.MeasureSpec.makeMeasureSpec((int) (((this.yo - dFloor) * this.uef) + ((f10 + f10 + r2) * dFloor) + f10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.lw.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        moa moaVar = this.bcc;
        if (moaVar != null) {
            moaVar.oa(i5, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    public void uef(double d3, int i5, int i10, float f10, int i11) {
        removeAllViews();
        this.lw.removeAllViews();
        this.ivm.removeAllViews();
        this.uef = (int) bcc.uef(this.xs, f10);
        this.f24704oa = (int) bcc.uef(this.xs, f10);
        this.yo = d3;
        this.moa = i11;
        for (int i12 = 0; i12 < 5; i12++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            uef(starImageView, "tt_ugen_rating_star");
            starImageView.setColorFilter(i5, PorterDuff.Mode.SRC_IN);
            this.ivm.addView(starImageView);
        }
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            uef(starImageView2, "tt_ugen_rating_star");
            starImageView2.setColorFilter(i10);
            this.lw.addView(starImageView2);
        }
        addView(this.lw);
        addView(this.ivm);
        requestLayout();
    }

    public void uef(ImageView imageView, String str) {
        imageView.setImageResource(com.bytedance.adsdk.ugeno.xs.moa.oa(this.xs, str));
    }

    public void uef(moa moaVar) {
        this.bcc = moaVar;
    }
}
