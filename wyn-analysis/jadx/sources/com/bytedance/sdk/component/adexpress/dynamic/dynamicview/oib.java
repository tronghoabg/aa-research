package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class oib extends Drawable {
    private RectF moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f24828oa;
    private Paint uef;
    private int yo;

    public oib(int i5, int i10) {
        this.yo = i5;
        this.f24828oa = i10;
        Paint paint = new Paint();
        this.uef = paint;
        paint.setColor(0);
        this.uef.setAntiAlias(true);
        this.uef.setShadowLayer(i10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -16777216);
        this.uef.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.moa;
        int i5 = this.yo;
        canvas.drawRoundRect(rectF, i5, i5, this.uef);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.uef.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i5, int i10, int i11, int i12) {
        super.setBounds(i5, i10, i11, i12);
        int i13 = this.f24828oa;
        this.moa = new RectF(i5 + i13, i10 + i13, i11 - i13, i12 - i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.uef.setColorFilter(colorFilter);
    }
}
