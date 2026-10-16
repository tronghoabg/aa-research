package com.waze.gw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class GpsSignalView extends View {
    private static final int[] LEVEL_COLORS = {-9208952, -42652, -15801, -13117953, -12196175};
    private Bitmap fixIcon;
    private final Paint iconPaint;
    private int level;
    private Bitmap lossIcon;
    private final RectF target;

    public GpsSignalView(Context context) {
        super(context);
        this.iconPaint = new Paint(3);
        this.target = new RectF();
        loadIcon(context);
        setLevel(0);
    }

    private void loadIcon(Context context) {
        this.fixIcon = loadAsset(context, "wz_ui_icon/gps.png");
        this.lossIcon = loadAsset(context, "wz_ui_icon/gps_signal_loss.png");
    }

    private static Bitmap loadAsset(Context context, String str) {
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th) {
                    }
                }
                return bitmapDecodeStream;
            } catch (Throwable th2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th3) {
                    }
                }
                return null;
            }
        } catch (Throwable th4) {
            inputStreamOpen = null;
        }
    }

    public void setLevel(int i2) {
        String str;
        int iMax = Math.max(0, Math.min(4, i2));
        if (iMax != this.level || this.iconPaint.getColorFilter() == null) {
            this.level = iMax;
            this.iconPaint.setColorFilter(new PorterDuffColorFilter(LEVEL_COLORS[this.level], PorterDuff.Mode.SRC_IN));
            if (this.level == 0) {
                str = "Không có tín hiệu GPS";
            } else {
                str = "Chất lượng GPS " + this.level + " trên 4";
            }
            setContentDescription(str);
            invalidate();
        }
    }

    public int getLevel() {
        return this.level;
    }

    public static int colorForLevel(int i2) {
        return LEVEL_COLORS[Math.max(0, Math.min(4, i2))];
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        Bitmap bitmap = this.level == 0 ? this.lossIcon : this.fixIcon;
        if (bitmap == null) {
            bitmap = this.level == 0 ? this.fixIcon : this.lossIcon;
        }
        if (bitmap == null) {
            return;
        }
        float fMin = Math.min(width / bitmap.getWidth(), height / bitmap.getHeight());
        float width2 = bitmap.getWidth() * fMin;
        float height2 = bitmap.getHeight() * fMin;
        float f2 = (width - width2) * 0.5f;
        float f3 = (height - height2) * 0.5f;
        this.target.set(f2, f3, width2 + f2, height2 + f3);
        canvas.drawBitmap(bitmap, (Rect) null, this.target, this.iconPaint);
    }
}
