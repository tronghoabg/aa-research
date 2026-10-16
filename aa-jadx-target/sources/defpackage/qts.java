package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qts {
    private int A;
    private int B;
    private int C;
    public int a;
    public int b;
    public int c;
    public int d;
    public android.graphics.Rect e;
    public int f;
    public int g;
    public com.google.android.gms.car.animation.ProjectionWindowAnimationParams h;
    public com.google.android.gms.car.animation.ProjectionWindowAnimationParams i;
    public com.google.android.gms.car.animation.ProjectionWindowAnimationParams j;
    public com.google.android.gms.car.animation.ProjectionWindowAnimationParams k;
    public boolean l;
    public int m;
    public int n;
    public android.graphics.Rect o;
    public final android.os.Bundle p;
    public com.google.android.gms.car.display.CarRegionId q;
    public java.util.List r;
    public int s;
    public com.google.android.gms.car.ProjectionWindowDecorationParams t;
    public int u;
    public com.google.android.gms.car.BlackHoleParams v;
    public float w;
    private final int x;
    private final int y;
    private final java.util.UUID z;

    public qts(com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams) {
        this.e = new android.graphics.Rect();
        this.f = 8388659;
        this.h = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(0, false, null, 0);
        this.i = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(0, false, null, 0);
        this.j = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(0, false, null, 0);
        this.k = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(0, false, null, 0);
        this.A = 0;
        this.B = -1;
        this.o = new android.graphics.Rect();
        android.os.Bundle bundle = new android.os.Bundle();
        this.p = bundle;
        int i = defpackage.ygw.d;
        this.r = defpackage.ymx.a;
        this.s = 1;
        this.t = com.google.android.gms.car.ProjectionWindowDecorationParams.a();
        this.u = 0;
        this.v = null;
        this.w = 1.0f;
        this.x = carWindowLayoutParams.b;
        this.y = carWindowLayoutParams.c;
        this.a = carWindowLayoutParams.d;
        this.b = carWindowLayoutParams.e;
        this.c = carWindowLayoutParams.f;
        this.d = carWindowLayoutParams.g;
        this.f = carWindowLayoutParams.h;
        this.g = carWindowLayoutParams.i;
        this.e = new android.graphics.Rect(carWindowLayoutParams.D);
        this.h = carWindowLayoutParams.j;
        this.i = carWindowLayoutParams.k;
        this.j = carWindowLayoutParams.v;
        this.k = carWindowLayoutParams.w;
        this.A = carWindowLayoutParams.l;
        this.l = carWindowLayoutParams.m;
        this.m = carWindowLayoutParams.n;
        this.n = carWindowLayoutParams.o;
        this.B = carWindowLayoutParams.p;
        this.o.set(carWindowLayoutParams.q);
        bundle.putAll(carWindowLayoutParams.r);
        this.q = carWindowLayoutParams.s;
        this.r = carWindowLayoutParams.t;
        this.s = carWindowLayoutParams.z;
        this.t = carWindowLayoutParams.u;
        this.z = java.util.UUID.fromString(carWindowLayoutParams.x);
        this.C = carWindowLayoutParams.y;
        this.u = carWindowLayoutParams.A;
        this.v = carWindowLayoutParams.B;
        this.w = carWindowLayoutParams.C;
    }

    public final com.google.android.gms.car.CarWindowLayoutParams a() {
        return new com.google.android.gms.car.CarWindowLayoutParams(1, this.x, this.y, this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.A, this.l, this.m, this.n, this.B, this.o, this.p, this.q, this.r, this.t, this.j, this.k, this.z.toString(), this.C, this.s, this.u, this.v, this.w, this.e);
    }

    public final void b(int i) {
        this.h = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(i, false, null, 0);
    }

    public final void c(int i) {
        this.i = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(i, false, null, 0);
    }

    public final void d() {
        this.A = 0;
    }

    public final void e() {
        this.C = 1;
    }

    public qts(int i, int i2, java.util.UUID uuid) {
        this.e = new android.graphics.Rect();
        this.f = 8388659;
        this.h = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(0, false, null, 0);
        this.i = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(0, false, null, 0);
        this.j = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(0, false, null, 0);
        this.k = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(0, false, null, 0);
        this.A = 0;
        this.B = -1;
        this.o = new android.graphics.Rect();
        this.p = new android.os.Bundle();
        int i3 = defpackage.ygw.d;
        this.r = defpackage.ymx.a;
        this.s = 1;
        this.t = com.google.android.gms.car.ProjectionWindowDecorationParams.a();
        this.u = 0;
        this.v = null;
        this.w = 1.0f;
        this.x = i;
        this.y = i2;
        this.z = uuid;
    }
}
