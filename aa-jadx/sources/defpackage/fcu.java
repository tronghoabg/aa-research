package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fcu {
    final android.graphics.RectF a = new android.graphics.RectF();
    final android.graphics.Paint b;
    final android.graphics.Paint c;
    final android.graphics.Paint d;
    float e;
    float f;
    public float g;
    float h;
    int[] i;
    float j;
    float k;
    float l;
    boolean m;
    android.graphics.Path n;
    float o;
    public float p;
    public int q;
    public int r;
    int s;
    int t;

    public fcu() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.b = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.c = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.d = paint3;
        this.e = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.g = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.h = 5.0f;
        this.o = 1.0f;
        this.s = 255;
        paint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    final int a() {
        return this.i[0];
    }

    final void b() {
        this.j = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.k = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.l = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.e = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.g = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
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
