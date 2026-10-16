package com.carstream.tech.launcher;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class Slider extends View {
    private static final float NUM_DP = 22.0f;
    private static final float RANH_DP = 6.0f;
    private OnChange cb;
    private float d;
    private float min;
    private final Paint p;
    private final RectF r;
    private int ranhMau;
    private float ratio;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface OnChange {
        void onChange(float f);
    }

    public Slider(Context context) {
        super(context);
        this.p = new Paint(1);
        this.r = new RectF();
        this.ratio = 0.5f;
        this.min = 0.0f;
        this.ranhMau = -1447442;
        this.d = 3.0f;
        setClickable(true);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    public float getRatio() {
        return this.ratio;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f = this.d;
        float f2 = NUM_DP * f;
        float f3 = f * RANH_DP;
        float f4 = height / 2.0f;
        float f5 = f2 / 2.0f;
        float f6 = width - f5;
        this.p.setStyle(Paint.Style.FILL);
        this.p.setColor(this.ranhMau);
        float f7 = f3 / 2.0f;
        this.r.set(f5 - f7, f4 - f7, f6 + f7, f4 + f7);
        canvas.drawRoundRect(this.r, f7, f7, this.p);
        float f8 = ((f6 - f5) * this.ratio) + f5;
        Paint paint = this.p;
        float f9 = this.d;
        paint.setShadowLayer(RANH_DP * f9 * 0.5f, 0.0f, f9 * 2.0f * 0.5f, 1073741824);
        this.p.setColor(-1);
        canvas.drawCircle(f8, f4, f5, this.p);
        this.p.clearShadowLayer();
        this.p.setStyle(Paint.Style.STROKE);
        this.p.setStrokeWidth(Math.max(1.0f, this.d * 0.5f));
        this.p.setColor(335544320);
        canvas.drawCircle(f8, f4, f5, this.p);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked != 1 && actionMasked != 2) {
            return super.onTouchEvent(motionEvent);
        }
        float f = (this.d * NUM_DP) / 2.0f;
        float width = getWidth() - f;
        if (width > f) {
            setRatio((motionEvent.getX() - f) / (width - f));
            OnChange onChange = this.cb;
            if (onChange != null) {
                onChange.onChange(this.ratio);
            }
        }
        return true;
    }

    public void setDensity(float f) {
        this.d = f;
        invalidate();
    }

    public void setMin(float f) {
        this.min = f;
    }

    public void setOnChange(OnChange onChange) {
        this.cb = onChange;
    }

    public void setRanhMau(int i) {
        this.ranhMau = i;
        invalidate();
    }

    public void setRatio(float f) {
        this.ratio = Math.max(this.min, Math.min(1.0f, f));
        invalidate();
    }
}
