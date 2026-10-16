package com.waze.gw;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* loaded from: classes10.dex */
public class Vignette extends View {
    private static final int DEFAULT_EDGE_ALPHA = 77;
    private static final float DEPTH = 0.16f;
    public static final int MODE_NONE = 0;
    public static final int MODE_STRONG = 2;
    public static final int MODE_WEAK = 1;
    private boolean active;
    private int edgeAlpha;
    private int mode;
    private final Paint paint;
    private ObjectAnimator pulse;

    public Vignette(Context context) {
        super(context);
        this.paint = new Paint();
        this.mode = 2;
        this.edgeAlpha = 77;
        setAlpha(0.0f);
        setClickable(false);
        setFocusable(false);
    }

    public void setActive(boolean z) {
        if (this.active == z) {
            return;
        }
        this.active = z;
        animate().cancel();
        if (this.pulse != null) {
            this.pulse.cancel();
        }
        if (z) {
            this.pulse = ObjectAnimator.ofFloat(this, "alpha", 0.28f, 1.0f);
            this.pulse.setDuration(680L);
            this.pulse.setRepeatMode(2);
            this.pulse.setRepeatCount(-1);
            this.pulse.start();
            return;
        }
        animate().alpha(0.0f).setDuration(500L).start();
    }

    public void setMode(int i2) {
        int i3 = 1;
        if (i2 != 1) {
            i3 = i2 == 0 ? 0 : 2;
        }
        if (this.mode == i3) {
            return;
        }
        this.mode = i3;
        invalidate();
    }

    public void setEdgeAlpha(int i2) {
        int iMax = Math.max(0, Math.min(255, i2));
        if (this.edgeAlpha == iMax) {
            return;
        }
        this.edgeAlpha = iMax;
        invalidate();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.active = false;
        animate().cancel();
        if (this.pulse != null) {
            this.pulse.cancel();
        }
        this.pulse = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float fMin = Math.min(width, height) * 0.16f;
        int i2 = (this.edgeAlpha << 24) | 16718362;
        this.paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, fMin, i2, 16718362, Shader.TileMode.CLAMP));
        if (this.mode == 0) {
            return;
        }
        float f2 = width;
        canvas.drawRect(0.0f, 0.0f, f2, fMin, this.paint);
        if (this.mode == 1) {
            return;
        }
        float f3 = height;
        float f4 = f3 - fMin;
        this.paint.setShader(new LinearGradient(0.0f, f3, 0.0f, f4, i2, 16718362, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, f4, f2, f3, this.paint);
        this.paint.setShader(new LinearGradient(0.0f, 0.0f, fMin, 0.0f, i2, 16718362, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, fMin, f3, this.paint);
        float f5 = f2 - fMin;
        this.paint.setShader(new LinearGradient(f2, 0.0f, f5, 0.0f, i2, 16718362, Shader.TileMode.CLAMP));
        canvas.drawRect(f5, 0.0f, f2, f3, this.paint);
    }
}
