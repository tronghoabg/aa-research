package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* loaded from: classes2.dex */
public final class lfz extends Drawable {
    private final Resources a;
    private final Bitmap b;
    private dvr c = null;
    private int d = -1;
    private ColorFilter e = null;

    public lfz(Resources resources, Bitmap bitmap) {
        this.b = bitmap;
        this.a = resources;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        dvr dvrVar = this.c;
        if (dvrVar != null) {
            dvrVar.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        dvr dvrVar = this.c;
        if (dvrVar != null) {
            return dvrVar.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        dvr dvrVar = this.c;
        if (dvrVar == null) {
            super.getOutline(outline);
        } else {
            outline.setRoundRect(dvrVar.getBounds(), this.c.d);
            outline.setAlpha(1.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Bitmap bitmapCreateBitmap;
        super.onBoundsChange(rect);
        int i = rect.right - rect.left;
        int i2 = rect.bottom - rect.top;
        if (i == 0 || i2 == 0) {
            this.c = null;
            return;
        }
        Bitmap bitmap = this.b;
        Bitmap bitmapD = (bitmap.getWidth() == i && bitmap.getHeight() == i2) ? bitmap : kfl.d(bitmap, i, i2);
        if (bitmapD.getWidth() != bitmapD.getHeight()) {
            int iMin = Math.min(i, i2);
            if (bitmapD == null) {
                bitmapCreateBitmap = null;
            } else if (bitmapD.getHeight() < iMin || bitmapD.getWidth() < iMin) {
                if (Log.isLoggable("GH.BitmapUtils", 4)) {
                    Log.i("GH.BitmapUtils", String.format("Can't crop bitmap to larger dimensions (%d, %d) -> (%d, %d).", Integer.valueOf(bitmapD.getWidth()), Integer.valueOf(bitmapD.getHeight()), Integer.valueOf(iMin), Integer.valueOf(iMin)));
                }
                bitmapCreateBitmap = bitmapD;
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapD, (bitmapD.getWidth() - iMin) / 2, (bitmapD.getHeight() - iMin) / 2, iMin, iMin);
            }
            if (bitmapD != bitmap) {
                bitmapD.recycle();
            }
            bitmapD = bitmapCreateBitmap;
        }
        dvq dvqVar = new dvq(this.a, bitmapD);
        this.c = dvqVar;
        dvqVar.setBounds(rect);
        dvr dvrVar = this.c;
        dvrVar.b.setAntiAlias(true);
        dvrVar.invalidateSelf();
        dvr dvrVar2 = this.c;
        float fMin = Math.min(i, i2) / 2.0f;
        if (dvrVar2.d != fMin) {
            if (dvr.c(fMin)) {
                dvrVar2.b.setShader(dvrVar2.c);
            } else {
                dvrVar2.b.setShader(null);
            }
            dvrVar2.d = fMin;
            dvrVar2.invalidateSelf();
        }
        int i3 = this.d;
        if (i3 != -1) {
            this.c.setAlpha(i3);
        }
        ColorFilter colorFilter = this.e;
        if (colorFilter != null) {
            this.c.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i;
        dvr dvrVar = this.c;
        if (dvrVar != null) {
            dvrVar.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e = colorFilter;
        dvr dvrVar = this.c;
        if (dvrVar != null) {
            dvrVar.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }
}
