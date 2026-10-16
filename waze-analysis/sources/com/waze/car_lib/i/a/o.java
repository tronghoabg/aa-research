package com.waze.car_lib.i.a;

import android.util.Size;
import androidx.car.app.SurfaceCallback;
import com.waze.map.ec;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private String f19893a;

    /* renamed from: b, reason: collision with root package name */
    private Size f19894b;

    /* renamed from: c, reason: collision with root package name */
    private j f19895c;

    /* renamed from: d, reason: collision with root package name */
    private ec f19896d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.bk.j f19897e;

    /* renamed from: f, reason: collision with root package name */
    private final SurfaceCallback f19898f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.car_lib.r.x f19899g;

    public o(com.waze.car_lib.r.x xVar) {
        h.g.b.x.f(xVar, "builder");
        this.f19899g = xVar;
        this.f19896d = new ec();
        this.f19897e = new n(this);
        this.f19898f = new m(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j j() {
        h.k kVar = new h.k(this.f19893a, this.f19894b);
        String str = (String) kVar.a();
        Size size = (Size) kVar.b();
        if (str == null || size == null) {
            return null;
        }
        return this.f19899g.b(size, str, this.f19896d);
    }

    public final SurfaceCallback a() {
        return this.f19898f;
    }

    public final com.waze.bk.j d() {
        return this.f19897e;
    }

    public final void g() {
        this.f19893a = null;
        this.f19895c = null;
    }

    public final void h(String str) {
        h.g.b.x.f(str, "canvasId");
        this.f19893a = str;
        this.f19895c = j();
    }

    public final void i(ec ecVar) {
        h.g.b.x.f(ecVar, "notifier");
        this.f19896d = ecVar;
        j jVar = this.f19895c;
        if (jVar != null) {
            jVar.f(ecVar);
        }
    }
}
