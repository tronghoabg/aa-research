package com.google.android.material.k;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f6631a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f6632b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f6633c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f6634d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f6635e;

    /* renamed from: f, reason: collision with root package name */
    private final List f6636f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List f6637g = new ArrayList();

    public ab() {
        e();
    }

    private final void h(float f2) {
        float f3 = this.f6634d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 <= 180.0f) {
            float f5 = this.f6632b;
            float f6 = this.f6633c;
            x xVar = new x(f5, f6, f5, f6);
            xVar.f6731e = this.f6634d;
            xVar.f6732f = f4;
            this.f6637g.add(new aa((byte[]) null));
            this.f6634d = f2;
        }
    }

    private final void i(aa aaVar, float f2, float f3) {
        h(f2);
        this.f6637g.add(aaVar);
        this.f6634d = f3;
    }

    final aa a(Matrix matrix) {
        h(this.f6635e);
        new Matrix(matrix);
        new ArrayList(this.f6637g);
        return new aa(this);
    }

    public final void b(Matrix matrix, Path path) {
        List list = this.f6636f;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((z) list.get(i2)).a(matrix, path);
        }
    }

    public final void c(float f2, float f3) {
        y yVar = new y();
        yVar.f6733a = f2;
        yVar.f6734b = f3;
        this.f6636f.add(yVar);
        w wVar = new w(yVar, this.f6632b, this.f6633c);
        i(wVar, wVar.a() + 270.0f, wVar.a() + 270.0f);
        this.f6632b = f2;
        this.f6633c = f3;
    }

    public final void d(float f2, float f3) {
        x xVar = new x(0.0f, 0.0f, f2, f3);
        xVar.f6731e = 180.0f;
        xVar.f6732f = 90.0f;
        this.f6636f.add(xVar);
        i(new aa((byte[]) null), 180.0f, 270.0f);
        float f4 = f2 + 0.0f;
        this.f6632b = (f4 * 0.5f) + ((f4 / 2.0f) * ((float) Math.cos(Math.toRadians(270.0d))));
        float f5 = f3 + 0.0f;
        this.f6633c = (f5 * 0.5f) + ((f5 / 2.0f) * ((float) Math.sin(Math.toRadians(270.0d))));
    }

    public final void e() {
        f(0.0f, 270.0f, 0.0f);
    }

    public final void f(float f2, float f3, float f4) {
        this.f6631a = f2;
        this.f6632b = 0.0f;
        this.f6633c = f2;
        this.f6634d = f3;
        this.f6635e = (f3 + f4) % 360.0f;
        this.f6636f.clear();
        this.f6637g.clear();
    }

    public final void g(float f2, float f3, float f4) {
        if ((Math.abs(f2 - this.f6632b) < 0.001f && Math.abs(-this.f6633c) < 0.001f) || (Math.abs(f2 - f3) < 0.001f && Math.abs(-f4) < 0.001f)) {
            c(f3, f4);
            return;
        }
        y yVar = new y();
        yVar.f6733a = f2;
        yVar.f6734b = 0.0f;
        List list = this.f6636f;
        list.add(yVar);
        y yVar2 = new y();
        yVar2.f6733a = f3;
        yVar2.f6734b = f4;
        list.add(yVar2);
        v vVar = new v(yVar, yVar2, this.f6632b, this.f6633c);
        float fA = ((vVar.a() - vVar.b()) + 360.0f) % 360.0f;
        if (fA > 180.0f) {
            fA -= 360.0f;
        }
        if (fA > 0.0f) {
            c(f2, 0.0f);
            c(f3, f4);
        } else {
            i(vVar, vVar.b() + 270.0f, vVar.a() + 270.0f);
            this.f6632b = f3;
            this.f6633c = f4;
        }
    }
}
