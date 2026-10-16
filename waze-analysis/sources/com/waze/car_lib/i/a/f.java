package com.waze.car_lib.i.a;

import android.graphics.Rect;
import androidx.car.app.SurfaceCallback;
import androidx.car.app.SurfaceContainer;
import com.waze.c.e.an;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements SurfaceCallback {

    /* renamed from: a, reason: collision with root package name */
    private final List f19864a = new ArrayList();

    static final void c(f fVar, SurfaceCallback surfaceCallback) {
        fVar.f19864a.remove(surfaceCallback);
    }

    private final void d(h.g.a.l lVar) {
        Iterator it = h.a.i.ao(this.f19864a).iterator();
        while (it.hasNext()) {
            lVar.invoke(it.next());
        }
    }

    public final com.waze.shared_infra.s.d a(SurfaceCallback surfaceCallback) {
        h.g.b.x.f(surfaceCallback, "callback");
        this.f19864a.add(surfaceCallback);
        return new d(this, surfaceCallback, 0);
    }

    public final void b() {
        this.f19864a.clear();
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onClick(float f2, float f3) {
        d(new e(f2, f3, 0));
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onFling(float f2, float f3) {
        d(new e(f2, f3, 2));
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onScale(final float f2, final float f3, final float f4) {
        d(new h.g.a.l() { // from class: com.waze.car_lib.i.a.c
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                SurfaceCallback surfaceCallback = (SurfaceCallback) obj;
                h.g.b.x.f(surfaceCallback, "$this$invokeAll");
                surfaceCallback.onScale(f2, f3, f4);
                return h.ab.f48028a;
            }
        });
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onScroll(float f2, float f3) {
        d(new e(f2, f3, 1));
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onStableAreaChanged(Rect rect) {
        h.g.b.x.f(rect, "stableArea");
        d(new an(rect, 19));
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onSurfaceAvailable(SurfaceContainer surfaceContainer) {
        h.g.b.x.f(surfaceContainer, "surfaceContainer");
        d(new an(surfaceContainer, 17));
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onSurfaceDestroyed(SurfaceContainer surfaceContainer) {
        h.g.b.x.f(surfaceContainer, "surfaceContainer");
        d(new an(surfaceContainer, 16));
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onVisibleAreaChanged(Rect rect) {
        h.g.b.x.f(rect, "visibleArea");
        d(new an(rect, 18));
    }
}
