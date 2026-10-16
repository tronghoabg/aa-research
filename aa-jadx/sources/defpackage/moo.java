package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class moo extends android.graphics.drawable.Drawable {
    private static final float a = 0.7853982f;
    private final android.graphics.Paint b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final boolean h;
    private final android.graphics.Path i;
    private final int j;
    private boolean k;
    private float l;
    private final float m;
    private final float n;

    public moo(android.content.Context context) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.b = paint;
        this.i = new android.graphics.Path();
        this.k = false;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, defpackage.qid.a, com.google.android.projection.gearhead.R.attr.carDrawerArrowStyle, com.google.android.projection.gearhead.R.style.GearheadSdkDrawerArrowDrawable);
        paint.setAntiAlias(true);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(1, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.j = dimensionPixelSize;
        this.e = java.lang.Math.round(typedArrayObtainStyledAttributes.getDimension(0, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
        this.d = java.lang.Math.round(typedArrayObtainStyledAttributes.getDimension(7, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
        float dimension = typedArrayObtainStyledAttributes.getDimension(6, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.c = dimension;
        float fRound = java.lang.Math.round(typedArrayObtainStyledAttributes.getDimension(3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
        this.g = fRound;
        this.h = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f = typedArrayObtainStyledAttributes.getDimension(4, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        int i = ((int) ((dimensionPixelSize - (3.0f * dimension)) - (fRound + fRound))) / 4;
        this.n = (float) (((double) (i + i)) + (((double) dimension) * 1.5d) + ((double) fRound));
        typedArrayObtainStyledAttributes.recycle();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeJoin(android.graphics.Paint.Join.MITER);
        paint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        paint.setStrokeWidth(dimension);
        this.m = (float) (((double) (dimension / 2.0f)) * java.lang.Math.cos(a));
    }

    public final void a(float f) {
        boolean z;
        if (f != 1.0f) {
            z = f != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            this.l = f;
            invalidateSelf();
        }
        this.k = z;
        this.l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        float f = this.d;
        float f2 = this.e;
        android.graphics.Rect bounds = getBounds();
        float f3 = this.l;
        float f4 = (f - f2) * f3;
        float f5 = (this.f - f2) * f3;
        float f6 = this.m;
        float fRound = java.lang.Math.round(((f6 + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) * f3) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        float f7 = a + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        float f8 = this.l;
        float f9 = f7 * f8;
        float f10 = f8 * 180.0f;
        double d = f9 + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        double d2 = f4 + f2;
        float fRound2 = java.lang.Math.round(java.lang.Math.cos(d) * d2);
        float fRound3 = java.lang.Math.round(d2 * java.lang.Math.sin(d));
        android.graphics.Path path = this.i;
        path.rewind();
        float f11 = this.g + this.c;
        float f12 = ((-f6) - f11) * this.l;
        float f13 = f2 + f5;
        float f14 = (-f13) / 2.0f;
        path.moveTo(f14 + fRound, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        path.rLineTo(f13 - (fRound + fRound), com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
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
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
