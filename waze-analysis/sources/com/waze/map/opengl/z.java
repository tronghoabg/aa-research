package com.waze.map.opengl;

import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class z extends com.waze.bk.k {

    /* renamed from: b, reason: collision with root package name */
    private SurfaceHolder f29581b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f29582c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f29583d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f29584e;

    /* renamed from: a, reason: collision with root package name */
    private final List f29580a = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List f29585f = new ArrayList();

    z(aa aaVar) {
        aaVar.getHolder().addCallback(new y(this, aaVar));
    }

    public final List a() {
        return this.f29580a;
    }

    public final List b() {
        return this.f29585f;
    }

    public final void c(Integer num) {
        this.f29584e = num;
    }

    public final void d(Integer num) {
        this.f29583d = num;
    }

    public final void e(SurfaceHolder surfaceHolder) {
        this.f29581b = surfaceHolder;
    }

    public final void f(Integer num) {
        this.f29582c = num;
    }

    @Override // com.waze.bk.k
    public final void h(com.waze.bk.j jVar) {
        h.g.b.x.f(jVar, "surfaceCallbacks");
        this.f29580a.add(jVar);
        SurfaceHolder surfaceHolder = this.f29581b;
        if (surfaceHolder != null) {
            Surface surface = surfaceHolder.getSurface();
            h.g.b.x.e(surface, "getSurface(...)");
            Integer num = this.f29582c;
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = this.f29583d;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            Integer num3 = this.f29584e;
            jVar.b(surface, iIntValue, iIntValue2, num3 != null ? num3.intValue() : 0);
            List list = this.f29585f;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jVar.e((Runnable) it.next());
            }
            list.clear();
        }
    }

    @Override // com.waze.bk.k
    public final void i(com.waze.bk.j jVar) {
        h.g.b.x.f(jVar, "surfaceCallbacks");
        this.f29580a.remove(jVar);
    }
}
