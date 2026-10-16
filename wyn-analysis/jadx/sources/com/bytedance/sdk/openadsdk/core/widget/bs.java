package com.bytedance.sdk.openadsdk.core.widget;

import A0.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class bs extends com.bytedance.sdk.openadsdk.core.ivm.moa {
    private BitmapShader ivm;
    private final RectF lw;
    private final Matrix moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f25758oa;
    private final Paint uef;
    private int yo;

    public bs(Context context) {
        this(context, null);
    }

    private Bitmap uef(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmapUef;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && j.x(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.ivm == null && (bitmapUef = uef(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.ivm = new BitmapShader(bitmapUef, tileMode, tileMode);
            float fMax = (bitmapUef.getWidth() == getWidth() && bitmapUef.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapUef.getWidth(), (getHeight() * 1.0f) / bitmapUef.getHeight());
            this.moa.setScale(fMax, fMax);
            this.ivm.setLocalMatrix(this.moa);
        }
        BitmapShader bitmapShader = this.ivm;
        if (bitmapShader == null) {
            super.onDraw(canvas);
        } else {
            this.uef.setShader(bitmapShader);
            canvas.drawRoundRect(this.lw, this.f25758oa, this.yo, this.uef);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.lw.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i5, i10);
    }

    public void setXRound(int i5) {
        this.f25758oa = i5;
        postInvalidate();
    }

    public void setYRound(int i5) {
        this.yo = i5;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.ivm = null;
    }

    public bs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bs(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f25758oa = 25;
        this.yo = 25;
        this.lw = new RectF();
        Paint paint = new Paint();
        this.uef = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.moa = new Matrix();
    }
}
