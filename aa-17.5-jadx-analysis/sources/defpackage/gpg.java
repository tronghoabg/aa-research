package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public final class gpg {
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
    public final Paint q;
    public final Paint r;
    public final int s;
    public final int t;

    public gpg(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gpi.b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, gpi.a);
        int color = typedArrayObtainStyledAttributes2.getColor(11, -1);
        Paint paint = new Paint(193);
        this.q = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        String string = typedArrayObtainStyledAttributes2.getString(2);
        string.getClass();
        paint.setTypeface(Typeface.create(string, typedArrayObtainStyledAttributes2.getInt(1, -1)));
        paint.setColor(color);
        paint.setTextSize(typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1));
        Paint paint2 = new Paint(paint);
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
        this.d = Math.max(dimensionPixelSize2, dimensionPixelSize3) + dimensionPixelSize + typedArrayObtainStyledAttributes2.getDimensionPixelSize(16, -1);
        this.t = typedArrayObtainStyledAttributes2.getDimensionPixelSize(15, -1);
        typedArrayObtainStyledAttributes2.recycle();
        this.s = context.getResources().getDisplayMetrics().densityDpi;
    }
}
