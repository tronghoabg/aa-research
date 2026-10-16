package com.google.android.apps.auto.components.system.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class FadePaddingFrameLayout extends FrameLayout {
    private final Paint a;
    private final Paint b;
    private LinearGradient c;
    private Matrix d;

    public FadePaddingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Matrix();
        this.b = new Paint();
        Paint paint = new Paint();
        this.a = paint;
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, 0.33f, 0.67f, 1.0f};
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, new int[]{16777215, 1090519039, -1862270977, -1}, fArr, Shader.TileMode.CLAMP);
        this.c = linearGradient;
        paint.setShader(linearGradient);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(null, this.b);
        super.dispatchDraw(canvas);
        try {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                this.d.reset();
                float f = paddingTop;
                this.d.setScale(1.0f, f);
                this.c.setLocalMatrix(this.d);
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), f, this.a);
            }
            if (getPaddingBottom() != 0) {
                this.d.reset();
                this.d.setScale(1.0f, -r1);
                this.d.postTranslate(BitmapDescriptorFactory.HUE_RED, getHeight());
                this.c.setLocalMatrix(this.d);
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, getHeight() - r1, getWidth(), getHeight(), this.a);
            }
        } finally {
            canvas.restoreToCount(iSaveLayer);
        }
    }

    public FadePaddingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FadePaddingFrameLayout(Context context) {
        this(context, null);
    }
}
