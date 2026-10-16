package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import com.google.android.gms.car.BlackHoleParams;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.ProjectionWindowDecorationParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class qsw {
    private int A;
    private int B;
    private int C;
    public int a;
    public int b;
    public int c;
    public int d;
    public Rect e;
    public int f;
    public int g;
    public ProjectionWindowAnimationParams h;
    public ProjectionWindowAnimationParams i;
    public ProjectionWindowAnimationParams j;
    public ProjectionWindowAnimationParams k;
    public boolean l;
    public int m;
    public int n;
    public Rect o;
    public final Bundle p;
    public CarRegionId q;
    public List r;
    public int s;
    public ProjectionWindowDecorationParams t;
    public int u;
    public BlackHoleParams v;
    public float w;
    private final int x;
    private final int y;
    private final UUID z;

    public qsw(CarWindowLayoutParams carWindowLayoutParams) {
        this.e = new Rect();
        this.f = 8388659;
        this.h = new ProjectionWindowAnimationParams(0, false, null, 0);
        this.i = new ProjectionWindowAnimationParams(0, false, null, 0);
        this.j = new ProjectionWindowAnimationParams(0, false, null, 0);
        this.k = new ProjectionWindowAnimationParams(0, false, null, 0);
        this.A = 0;
        this.B = -1;
        this.o = new Rect();
        Bundle bundle = new Bundle();
        this.p = bundle;
        int i = yfq.d;
        this.r = yls.a;
        this.s = 1;
        this.t = ProjectionWindowDecorationParams.a();
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
        this.e = new Rect(carWindowLayoutParams.D);
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
        this.z = UUID.fromString(carWindowLayoutParams.x);
        this.C = carWindowLayoutParams.y;
        this.u = carWindowLayoutParams.A;
        this.v = carWindowLayoutParams.B;
        this.w = carWindowLayoutParams.C;
    }

    public final CarWindowLayoutParams a() {
        return new CarWindowLayoutParams(1, this.x, this.y, this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i, this.A, this.l, this.m, this.n, this.B, this.o, this.p, this.q, this.r, this.t, this.j, this.k, this.z.toString(), this.C, this.s, this.u, this.v, this.w, this.e);
    }

    public final void b(int i) {
        this.h = new ProjectionWindowAnimationParams(i, false, null, 0);
    }

    public final void c(int i) {
        this.i = new ProjectionWindowAnimationParams(i, false, null, 0);
    }

    public final void d() {
        this.A = 0;
    }

    public final void e() {
        this.C = 1;
    }

    public qsw(int i, int i2, UUID uuid) {
        this.e = new Rect();
        this.f = 8388659;
        this.h = new ProjectionWindowAnimationParams(0, false, null, 0);
        this.i = new ProjectionWindowAnimationParams(0, false, null, 0);
        this.j = new ProjectionWindowAnimationParams(0, false, null, 0);
        this.k = new ProjectionWindowAnimationParams(0, false, null, 0);
        this.A = 0;
        this.B = -1;
        this.o = new Rect();
        this.p = new Bundle();
        int i3 = yfq.d;
        this.r = yls.a;
        this.s = 1;
        this.t = ProjectionWindowDecorationParams.a();
        this.u = 0;
        this.v = null;
        this.w = 1.0f;
        this.x = i;
        this.y = i2;
        this.z = uuid;
    }
}
