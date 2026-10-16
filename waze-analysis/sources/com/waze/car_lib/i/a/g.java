package com.waze.car_lib.i.a;

import android.graphics.Rect;
import android.view.Surface;
import androidx.car.app.SurfaceCallback;
import androidx.car.app.SurfaceContainer;
import com.waze.gw.AaSpeedo;
import java.util.Iterator;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g implements SurfaceCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f19865a;

    g(h hVar) {
        this.f19865a = hVar;
    }

    @Override // androidx.car.app.SurfaceCallback
    public final /* synthetic */ void onClick(float f2, float f3) {
    }

    @Override // androidx.car.app.SurfaceCallback
    public final /* synthetic */ void onFling(float f2, float f3) {
    }

    @Override // androidx.car.app.SurfaceCallback
    public final /* synthetic */ void onScale(float f2, float f3, float f4) {
    }

    @Override // androidx.car.app.SurfaceCallback
    public final /* synthetic */ void onScroll(float f2, float f3) {
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onStableAreaChanged(Rect rect) {
        Object objD;
        com.waze.map.main.aa aaVarH;
        h.g.b.x.f(rect, "stableArea");
        AaSpeedo.onStableArea(rect);
        h hVar = this.f19865a;
        bn bnVar = hVar.f19869d;
        do {
            objD = bnVar.d();
            aaVarH = (com.waze.map.main.aa) objD;
            hVar.f19867b.a("Stable area changed: top = " + rect.top + " bottom = " + rect.bottom + " left = " + rect.left + " right = " + rect.right);
            if (rect.right == 0) {
                rect.right = aaVarH.g();
            }
            if (rect.bottom == 0) {
                rect.bottom = aaVarH.c();
            }
            com.waze.map.main.aa aaVar = (rect.right > aaVarH.g() || rect.bottom > aaVarH.c()) ? null : aaVarH;
            if (aaVar != null) {
                if (rect.right <= rect.left) {
                    aaVar = null;
                }
                if (aaVar != null) {
                    com.waze.map.main.aa aaVar2 = rect.bottom <= rect.top ? null : aaVar;
                    if (aaVar2 != null) {
                        aaVarH = com.waze.map.main.aa.h(aaVar2, 0, 0, rect.top, rect.left, aaVarH.g() - rect.right, aaVarH.c() - rect.bottom, 0, 67);
                    }
                }
            }
        } while (!bnVar.f(objD, aaVarH));
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onSurfaceAvailable(SurfaceContainer surfaceContainer) {
        Object objD;
        h.g.b.x.f(surfaceContainer, "surfaceContainer");
        AaSpeedo.onSurface(surfaceContainer.getWidth(), surfaceContainer.getHeight(), surfaceContainer.getDpi());
        h hVar = this.f19865a;
        synchronized (this) {
            hVar.f19868c = surfaceContainer;
            Surface surface = surfaceContainer.getSurface();
            if (surface != null) {
                int iK = h.k(surfaceContainer);
                int width = surfaceContainer.getWidth();
                int height = surfaceContainer.getHeight();
                com.waze.shared_infra.i.e eVar = hVar.f19867b;
                StringBuilder sb = new StringBuilder("On surface available: width = ");
                sb.append(width);
                sb.append(" height = ");
                sb.append(height);
                sb.append(" dpi = ");
                sb.append(iK);
                sb.append(" carIndicationToBottom = ");
                int i2 = (int) ((iK / 160.0f) * 55.0f);
                sb.append(i2);
                eVar.a(sb.toString());
                bn bnVar = hVar.f19869d;
                do {
                    objD = bnVar.d();
                } while (!bnVar.f(objD, com.waze.map.main.aa.h((com.waze.map.main.aa) objD, height, width, 0, 0, 0, 0, i2, 60)));
                Iterator it = hVar.d().iterator();
                while (it.hasNext()) {
                    ((com.waze.bk.j) it.next()).b(surface, width, height, iK);
                }
            }
        }
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onSurfaceDestroyed(SurfaceContainer surfaceContainer) {
        h.g.b.x.f(surfaceContainer, "surfaceContainer");
        AaSpeedo.onSurfaceDestroyed();
        h hVar = this.f19865a;
        synchronized (this) {
            hVar.f19868c = null;
            Iterator it = hVar.d().iterator();
            while (it.hasNext()) {
                ((com.waze.bk.j) it.next()).c();
            }
        }
    }

    @Override // androidx.car.app.SurfaceCallback
    public final /* synthetic */ void onVisibleAreaChanged(Rect rect) {
        AaSpeedo.onVisibleArea(rect);
    }
}
