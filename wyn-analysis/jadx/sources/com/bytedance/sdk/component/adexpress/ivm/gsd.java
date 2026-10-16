package com.bytedance.sdk.component.adexpress.ivm;

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
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class gsd extends ImageView {
    private Matrix moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f24903oa;
    private Paint uef;
    private int yo;

    public gsd(Context context) {
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
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && j.x(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap bitmapUef = uef(drawable);
        if (bitmapUef == null) {
            super.onDraw(canvas);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmapUef, tileMode, tileMode);
        float fMax = (bitmapUef.getWidth() == getWidth() && bitmapUef.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapUef.getWidth(), (getHeight() * 1.0f) / bitmapUef.getHeight());
        this.moa.setScale(fMax, fMax);
        bitmapShader.setLocalMatrix(this.moa);
        this.uef.setShader(bitmapShader);
        canvas.drawRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight()), this.f24903oa, this.yo, this.uef);
    }

    public void setXRound(int i5) {
        this.f24903oa = i5;
        postInvalidate();
    }

    public void setYRound(int i5) {
        this.yo = i5;
        postInvalidate();
    }

    public gsd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public gsd(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f24903oa = 25;
        this.yo = 25;
        Paint paint = new Paint();
        this.uef = paint;
        paint.setAntiAlias(true);
        this.uef.setFilterBitmap(true);
        this.moa = new Matrix();
    }
}
