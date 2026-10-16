package com.waze.car_lib.i.a;

import android.view.Surface;
import androidx.car.app.SurfaceCallback;
import androidx.car.app.SurfaceContainer;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends com.waze.bk.k {

    /* renamed from: a, reason: collision with root package name */
    private final p f19866a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19867b;

    /* renamed from: c, reason: collision with root package name */
    private SurfaceContainer f19868c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f19869d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f19870e;

    /* renamed from: f, reason: collision with root package name */
    private final SurfaceCallback f19871f;

    public h(p pVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(pVar, "scaleFactorGetter");
        h.g.b.x.f(eVar, "logger");
        this.f19866a = pVar;
        this.f19867b = eVar;
        this.f19869d = ck.b(new com.waze.map.main.aa(0, 0, 0, 0, 0, 0, 0));
        pVar.a();
        this.f19870e = new LinkedHashSet();
        this.f19871f = new g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(SurfaceContainer surfaceContainer) {
        return surfaceContainer.getDpi();
    }

    public final SurfaceCallback a() {
        return this.f19871f;
    }

    public final Integer c() {
        SurfaceContainer surfaceContainer = this.f19868c;
        if (surfaceContainer != null) {
            return Integer.valueOf(k(surfaceContainer));
        }
        return null;
    }

    public final Set d() {
        return this.f19870e;
    }

    public final kotlinx.coroutines.b.k e() {
        return this.f19869d;
    }

    @Override // com.waze.bk.k
    public final void h(com.waze.bk.j jVar) {
        h.g.b.x.f(jVar, "surfaceCallbacks");
        SurfaceContainer surfaceContainer = this.f19868c;
        Surface surface = surfaceContainer != null ? surfaceContainer.getSurface() : null;
        if (surfaceContainer != null && surface != null) {
            jVar.b(surface, surfaceContainer.getWidth(), surfaceContainer.getHeight(), k(surfaceContainer));
        }
        this.f19870e.add(jVar);
    }

    @Override // com.waze.bk.k
    public final void i(com.waze.bk.j jVar) {
        h.g.b.x.f(jVar, "surfaceCallbacks");
        this.f19870e.remove(jVar);
    }
}
