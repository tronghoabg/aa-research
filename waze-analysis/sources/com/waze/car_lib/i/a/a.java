package com.waze.car_lib.i.a;

import androidx.car.app.AppManager;
import androidx.car.app.CarContext;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.waze.car_lib.f.gh;
import com.waze.map.dn;
import com.waze.map.dq;
import com.waze.map.ec;
import java.util.Objects;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private final h f19836a;

    /* renamed from: b, reason: collision with root package name */
    private final u f19837b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19838c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19839d;

    /* renamed from: e, reason: collision with root package name */
    private final AppManager f19840e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f19841f;

    /* renamed from: g, reason: collision with root package name */
    private final ec f19842g;

    /* renamed from: h, reason: collision with root package name */
    private bn f19843h;

    /* renamed from: i, reason: collision with root package name */
    private final f f19844i;

    /* renamed from: j, reason: collision with root package name */
    private final m f19845j;

    /* renamed from: k, reason: collision with root package name */
    private gh f19846k;

    public a(CarContext carContext, h hVar, u uVar, Lifecycle lifecycle, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(hVar, "surfaceInterface");
        h.g.b.x.f(uVar, "rendererPresenter");
        h.g.b.x.f(lifecycle, "lifecycle");
        h.g.b.x.f(eVar, "logger");
        this.f19836a = hVar;
        this.f19837b = uVar;
        this.f19838c = eVar;
        this.f19840e = (AppManager) carContext.getCarService(AppManager.class);
        this.f19845j = new m(this, 1);
        this.f19841f = hVar.e();
        this.f19842g = new ec();
        this.f19843h = ck.b(dn.f28759a);
        this.f19844i = new f();
        lifecycle.addObserver(this);
    }

    private final void g() {
        gh ghVar;
        if (this.f19839d && (ghVar = this.f19846k) != null) {
            this.f19837b.c(ghVar, this.f19843h, this.f19836a, this.f19842g, this.f19844i);
        }
    }

    private final void h() {
        this.f19837b.b(this.f19836a);
    }

    public final /* synthetic */ dq b() {
        return this.f19842g;
    }

    public final Integer c() {
        return this.f19836a.c();
    }

    public final kotlinx.coroutines.b.k d() {
        return this.f19841f;
    }

    public final ch e(gh ghVar) {
        h.g.b.x.f(ghVar, "newRenderer");
        Objects.toString(ghVar);
        this.f19838c.a("will set renderer ".concat(ghVar.toString()));
        gh ghVar2 = this.f19846k;
        if (ghVar == ghVar2) {
            return this.f19843h;
        }
        if (ghVar2 != null) {
            h();
            this.f19843h.e(dn.f28759a);
        }
        this.f19846k = ghVar;
        this.f19843h = ck.b(dn.f28759a);
        g();
        return this.f19843h;
    }

    public final void f(gh ghVar) {
        h.g.b.x.f(ghVar, "newRenderer");
        this.f19838c.a("will unset renderer " + ghVar + " (current renderer " + this.f19846k + ")");
        if (h.g.b.x.n(this.f19846k, ghVar)) {
            h();
            this.f19846k = null;
            this.f19843h.e(dn.f28759a);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        Object objA;
        h.g.b.x.f(lifecycleOwner, "owner");
        h.g.b.x.f(lifecycleOwner, "owner");
        h hVar = this.f19836a;
        f fVar = this.f19844i;
        fVar.a(hVar.a());
        fVar.a(this.f19845j);
        try {
            this.f19840e.setSurfaceCallback(fVar);
            objA = h.ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            this.f19838c.h("Couldn't set surface callback", thC);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
        h.g.b.x.f(lifecycleOwner, "owner");
        this.f19844i.b();
        this.f19840e.setSurfaceCallback(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
        h.g.b.x.f(lifecycleOwner, "owner");
        this.f19839d = false;
        h();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
        h.g.b.x.f(lifecycleOwner, "owner");
        this.f19839d = true;
        g();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }
}
