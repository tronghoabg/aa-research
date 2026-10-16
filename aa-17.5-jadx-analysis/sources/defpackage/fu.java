package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class fu extends Drawable {
    private static final float a = (float) Math.toRadians(45.0d);
    private final Paint b;
    private final float c;
    private final float d;
    private final float e;
    private float f;
    private boolean g;
    private final Path h;
    private final int i;
    private float j;
    private float k;
    private final int l;

    public fu(Context context) {
        Paint paint = new Paint();
        this.b = paint;
        this.h = new Path();
        this.l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, fs.n, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        a(typedArrayObtainStyledAttributes.getColor(3, 0));
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, BitmapDescriptorFactory.HUE_RED);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.k = (float) ((dimension / 2.0f) * Math.cos(a));
            invalidateSelf();
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.g != z) {
            this.g = z;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, BitmapDescriptorFactory.HUE_RED));
        if (fRound != this.f) {
            this.f = fRound;
            invalidateSelf();
        }
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.d = Math.round(typedArrayObtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED));
        this.c = Math.round(typedArrayObtainStyledAttributes.getDimension(0, BitmapDescriptorFactory.HUE_RED));
        this.e = typedArrayObtainStyledAttributes.getDimension(1, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(int i) {
        Paint paint = this.b;
        if (i != paint.getColor()) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.l;
        boolean z = false;
        if (i != 0 && (i == 1 || getLayoutDirection() == 1)) {
            z = true;
        }
        float f = this.c;
        float f2 = f * f;
        float fSqrt = (float) Math.sqrt(f2 + f2);
        float f3 = this.d;
        float f4 = this.j;
        float f5 = (fSqrt - f3) * f4;
        float f6 = (this.e - f3) * f4;
        float fRound = Math.round(((this.k + BitmapDescriptorFactory.HUE_RED) * f4) + BitmapDescriptorFactory.HUE_RED);
        float f7 = a;
        float f8 = this.j;
        float f9 = (f7 + BitmapDescriptorFactory.HUE_RED) * f8;
        float f10 = true != z ? -180.0f : 0.0f;
        float f11 = f8 * 180.0f;
        double d = f9 + BitmapDescriptorFactory.HUE_RED;
        double d2 = f5 + f3;
        float fRound2 = Math.round(Math.cos(d) * d2);
        float fRound3 = Math.round(d2 * Math.sin(d));
        Path path = this.h;
        path.rewind();
        float f12 = this.f;
        Paint paint = this.b;
        float strokeWidth = f12 + paint.getStrokeWidth();
        float f13 = ((-this.k) - strokeWidth) * this.j;
        float f14 = f6 + f3;
        float f15 = (-f14) / 2.0f;
        path.moveTo(f15 + fRound, BitmapDescriptorFactory.HUE_RED);
        path.rLineTo(f14 - (fRound + fRound), BitmapDescriptorFactory.HUE_RED);
        float f16 = strokeWidth + f13;
        path.moveTo(f15, f16);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f15, -f16);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth2 = paint.getStrokeWidth();
        float f17 = this.f;
        int iHeight = ((int) ((bounds.height() - (3.0f * strokeWidth2)) - (f17 + f17))) / 4;
        canvas.translate(bounds.centerX(), iHeight + iHeight + (strokeWidth2 * 1.5f) + f17);
        if (this.g) {
            canvas.rotate((f10 + f11) * (true != z ? 1 : -1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.b;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f) {
        if (this.j != f) {
            this.j = f;
            invalidateSelf();
        }
    }
}
