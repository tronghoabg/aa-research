package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.utils.af;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class ab extends View {
    private float ivm;
    private Drawable lw;
    private Drawable moa;

    /* renamed from: oa, reason: collision with root package name */
    private final boolean f25755oa;
    private final Path uef;
    private int yo;

    public ab(Context context) {
        this(context, false);
    }

    private void oa() {
        int width = getWidth();
        int height = getHeight();
        if (this.ivm <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || width <= 0 || height <= 0) {
            return;
        }
        this.uef.reset();
        this.uef.addRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width * this.ivm, height), Path.Direction.CCW);
    }

    private void uef() {
        Context context = getContext();
        this.moa = orq.yo(context, this.f25755oa ? "tt_star_thick_dark" : "tt_star_thick");
        this.lw = orq.yo(context, "tt_star");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.yo <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i5 = 0; i5 < 5; i5++) {
            this.moa.draw(canvas);
            canvas.translate(this.yo, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.uef);
        for (int i10 = 0; i10 < 5; i10++) {
            this.lw.draw(canvas);
            canvas.translate(this.yo, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.yo * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.yo, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        oa();
    }

    public ab(Context context, boolean z2) {
        super(context);
        this.uef = new Path();
        this.f25755oa = z2;
        uef();
    }

    public void uef(double d3, int i5) {
        int iUef = (int) af.uef(getContext(), i5, false);
        this.yo = iUef;
        this.moa.setBounds(0, 0, iUef, iUef);
        Drawable drawable = this.lw;
        int i10 = this.yo;
        drawable.setBounds(0, 0, i10, i10);
        this.ivm = ((float) d3) / 5.0f;
        oa();
        requestLayout();
    }
}
