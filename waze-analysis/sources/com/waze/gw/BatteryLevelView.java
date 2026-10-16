package com.waze.gw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes10.dex */
public final class BatteryLevelView extends View {
    private final RectF fill;
    private final Paint fillPaint;
    private Bitmap outline;
    private final Paint outlinePaint;
    private int percent;
    private final Rect source;
    private final RectF target;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056 A[EXC_TOP_SPLITTER, PHI: r6
  0x0056: PHI (r6v5 java.io.InputStream) = (r6v3 java.io.InputStream), (r6v8 java.io.InputStream) binds: [B:15:0x0062, B:5:0x0054] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BatteryLevelView(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>(r6)
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r5.fillPaint = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 3
            r0.<init>(r1)
            r5.outlinePaint = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = 472(0x1d8, float:6.61E-43)
            r2 = 382(0x17e, float:5.35E-43)
            r3 = 40
            r4 = 130(0x82, float:1.82E-43)
            r0.<init>(r3, r4, r1, r2)
            r5.source = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.target = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.fill = r0
            r0 = -1
            r5.percent = r0
            android.graphics.Paint r1 = r5.outlinePaint
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r3 = -1578515(0xffffffffffe7e9ed, float:NaN)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r4)
            r1.setColorFilter(r2)
            r1 = 0
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "wz_ui_icon/batterry_placeholder.png"
            java.io.InputStream r6 = r6.open(r2)     // Catch: java.lang.Throwable -> L5e
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch: java.lang.Throwable -> L5c
            r5.outline = r2     // Catch: java.lang.Throwable -> L5c
            if (r6 == 0) goto L65
        L56:
            r6.close()     // Catch: java.lang.Throwable -> L5a
            goto L65
        L5a:
            r6 = move-exception
            goto L65
        L5c:
            r2 = move-exception
            goto L60
        L5e:
            r6 = move-exception
            r6 = r1
        L60:
            r5.outline = r1     // Catch: java.lang.Throwable -> L69
            if (r6 == 0) goto L65
            goto L56
        L65:
            r5.setPercent(r0)
            return
        L69:
            r0 = move-exception
            if (r6 == 0) goto L71
            r6.close()     // Catch: java.lang.Throwable -> L70
            goto L71
        L70:
            r6 = move-exception
        L71:
            goto L73
        L72:
            throw r0
        L73:
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.gw.BatteryLevelView.<init>(android.content.Context):void");
    }

    public void setPercent(int i2) {
        String str;
        if (i2 < 0 || i2 > 100) {
            i2 = -1;
        }
        if (i2 == this.percent) {
            return;
        }
        this.percent = i2;
        if (this.percent >= 0) {
            str = "Pin điện thoại " + this.percent + "%";
        } else {
            str = "Chưa đọc được pin";
        }
        setContentDescription(str);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        if (this.percent > 0) {
            float f2 = 0.093f * width;
            this.fill.set(f2, 0.183f * height, ((((0.76f * width) - f2) * this.percent) / 100.0f) + f2, 0.813f * height);
            Paint paint = this.fillPaint;
            if (this.percent <= 15) {
                i2 = -42652;
            } else {
                i2 = this.percent <= 35 ? -15801 : -12196175;
            }
            paint.setColor(i2);
            float f3 = 0.1f * height;
            canvas.drawRoundRect(this.fill, f3, f3, this.fillPaint);
        }
        if (this.outline != null) {
            this.target.set(0.0f, 0.0f, width, height);
            canvas.drawBitmap(this.outline, this.source, this.target, this.outlinePaint);
        }
    }
}
