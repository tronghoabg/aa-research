package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gpq {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final android.graphics.Paint q;
    public final android.graphics.Paint r;
    public final int s;
    public final int t;

    public gpq(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.gps.b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, defpackage.gps.a);
        int color = typedArrayObtainStyledAttributes2.getColor(11, -1);
        android.graphics.Paint paint = new android.graphics.Paint(193);
        this.q = paint;
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        java.lang.String string = typedArrayObtainStyledAttributes2.getString(2);
        int i3 = typedArrayObtainStyledAttributes2.getInt(1, -1);
        paint.setTypeface(string != null ? android.graphics.Typeface.create(string, i3) : android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, i3));
        paint.setColor(color);
        paint.setTextSize(typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1));
        android.graphics.Paint paint2 = new android.graphics.Paint(paint);
        this.r = paint2;
        paint2.setColor(typedArrayObtainStyledAttributes2.getColor(7, -1));
        this.a = typedArrayObtainStyledAttributes2.getInt(9, -1);
        this.b = typedArrayObtainStyledAttributes2.getInt(10, -1);
        this.c = typedArrayObtainStyledAttributes2.getInt(8, -1);
        this.e = typedArrayObtainStyledAttributes2.getDimensionPixelSize(18, -1);
        this.f = typedArrayObtainStyledAttributes2.getDimensionPixelSize(17, -1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(19, -1);
        this.g = dimensionPixelSize;
        this.h = typedArrayObtainStyledAttributes2.getDimensionPixelSize(6, -1);
        this.i = typedArrayObtainStyledAttributes2.getInt(4, -1);
        this.j = typedArrayObtainStyledAttributes2.getInt(3, -1);
        this.k = typedArrayObtainStyledAttributes2.getInt(5, -1);
        this.n = typedArrayObtainStyledAttributes2.getDimensionPixelSize(20, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(12, -1);
        this.m = dimensionPixelSize2;
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(14, -1);
        this.o = dimensionPixelSize3;
        this.p = typedArrayObtainStyledAttributes2.getDimensionPixelSize(13, -1);
        this.l = color;
        this.d = java.lang.Math.max(dimensionPixelSize2, dimensionPixelSize3) + dimensionPixelSize + typedArrayObtainStyledAttributes2.getDimensionPixelSize(16, -1);
        this.t = typedArrayObtainStyledAttributes2.getDimensionPixelSize(15, -1);
        typedArrayObtainStyledAttributes2.recycle();
        this.s = context.getResources().getDisplayMetrics().densityDpi;
    }
}
