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
public final class moi extends Drawable {
    private static final float a = (float) Math.toRadians(45.0d);
    private final Paint b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final boolean h;
    private final Path i;
    private final int j;
    private boolean k;
    private float l;
    private final float m;
    private final float n;

    public moi(Context context) {
        Paint paint = new Paint();
        this.b = paint;
        this.i = new Path();
        this.k = false;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, qhi.a, R.attr.carDrawerArrowStyle, R.style.GearheadSdkDrawerArrowDrawable);
        paint.setAntiAlias(true);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(1, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.j = dimensionPixelSize;
        this.e = Math.round(typedArrayObtainStyledAttributes.getDimension(0, BitmapDescriptorFactory.HUE_RED));
        this.d = Math.round(typedArrayObtainStyledAttributes.getDimension(7, BitmapDescriptorFactory.HUE_RED));
        float dimension = typedArrayObtainStyledAttributes.getDimension(6, BitmapDescriptorFactory.HUE_RED);
        this.c = dimension;
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED));
        this.g = fRound;
        this.h = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f = typedArrayObtainStyledAttributes.getDimension(4, BitmapDescriptorFactory.HUE_RED);
        int i = ((int) ((dimensionPixelSize - (3.0f * dimension)) - (fRound + fRound))) / 4;
        this.n = (float) (i + i + (dimension * 1.5d) + fRound);
        typedArrayObtainStyledAttributes.recycle();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStrokeWidth(dimension);
        this.m = (float) ((dimension / 2.0f) * Math.cos(a));
    }

    public final void a(float f) {
        boolean z;
        if (f != 1.0f) {
            z = f != BitmapDescriptorFactory.HUE_RED;
            this.l = f;
            invalidateSelf();
        }
        this.k = z;
        this.l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.d;
        float f2 = this.e;
        Rect bounds = getBounds();
        float f3 = this.l;
        float f4 = (f - f2) * f3;
        float f5 = (this.f - f2) * f3;
        float f6 = this.m;
        float fRound = Math.round(((f6 + BitmapDescriptorFactory.HUE_RED) * f3) + BitmapDescriptorFactory.HUE_RED);
        float f7 = a + BitmapDescriptorFactory.HUE_RED;
        float f8 = this.l;
        float f9 = f7 * f8;
        float f10 = f8 * 180.0f;
        double d = f9 + BitmapDescriptorFactory.HUE_RED;
        double d2 = f4 + f2;
        float fRound2 = Math.round(Math.cos(d) * d2);
        float fRound3 = Math.round(d2 * Math.sin(d));
        Path path = this.i;
        path.rewind();
        float f11 = this.g + this.c;
        float f12 = ((-f6) - f11) * this.l;
        float f13 = f2 + f5;
        float f14 = (-f13) / 2.0f;
        path.moveTo(f14 + fRound, BitmapDescriptorFactory.HUE_RED);
        path.rLineTo(f13 - (fRound + fRound), BitmapDescriptorFactory.HUE_RED);
        float f15 = f11 + f12;
        path.moveTo(f14, f15);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f14, -f15);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        canvas.translate(bounds.centerX(), this.n);
        if (this.h) {
            canvas.rotate((f10 - 180.0f) * (true == this.k ? -1 : 1));
        }
        canvas.drawPath(path, this.b);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
