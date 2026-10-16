package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class fcn {
    final RectF a = new RectF();
    final Paint b;
    final Paint c;
    final Paint d;
    float e;
    float f;
    public float g;
    float h;
    int[] i;
    float j;
    float k;
    float l;
    boolean m;
    Path n;
    float o;
    public float p;
    public int q;
    public int r;
    int s;
    int t;

    public fcn() {
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        Paint paint3 = new Paint();
        this.d = paint3;
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.h = 5.0f;
        this.o = 1.0f;
        this.s = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    final int a() {
        return this.i[0];
    }

    final void b() {
        this.j = BitmapDescriptorFactory.HUE_RED;
        this.k = BitmapDescriptorFactory.HUE_RED;
        this.l = BitmapDescriptorFactory.HUE_RED;
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.g = BitmapDescriptorFactory.HUE_RED;
    }

    public final void c(boolean z) {
        if (this.m != z) {
            this.m = z;
        }
    }

    public final void d(float f) {
        this.h = f;
        this.b.setStrokeWidth(f);
    }

    public final void e() {
        this.j = this.e;
        this.k = this.f;
        this.l = this.g;
    }

    public final void f() {
        int length = this.i.length;
    }

    public final void g() {
        this.t = this.i[0];
    }
}
