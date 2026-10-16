package com.waze.c.e;

import android.graphics.Rect;
import androidx.car.app.SurfaceCallback;
import androidx.car.app.SurfaceContainer;
import androidx.car.app.notification.CarNotificationManager;
import com.waze.car_lib.f.Cdo;
import com.waze.car_lib.f.dm;
import com.waze.car_lib.f.dn;
import com.waze.car_lib.f.dr;
import com.waze.car_lib.f.dt;
import com.waze.car_lib.f.er;
import com.waze.car_lib.f.eu;
import com.waze.car_lib.f.ev;
import com.waze.car_lib.f.fb;
import com.waze.car_lib.f.fn;
import com.waze.car_lib.f.fo;
import com.waze.car_lib.f.fr;
import com.waze.car_lib.f.gs;
import com.waze.car_lib.f.hc;
import com.waze.car_lib.f.hi;
import com.waze.car_lib.f.jk;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class an implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18527a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18528b;

    public /* synthetic */ an(Object obj, int i2) {
        this.f18528b = i2;
        this.f18527a = obj;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f18528b) {
            case 0:
                break;
            case 1:
                dn dnVarF = ((dm) obj).f();
                com.waze.car_lib.f.bf bfVar = (com.waze.car_lib.f.bf) this.f18527a;
                com.waze.shared_infra.r.p pVarA = bfVar.a();
                boolean zB = bfVar.b();
                h.g.b.x.f(pVarA, "appType");
                dnVarF.H(new dr(pVarA, zB));
                break;
            case 2:
                dn dnVarF2 = ((dm) obj).f();
                com.waze.car_lib.f.ba baVar = (com.waze.car_lib.f.ba) this.f18527a;
                boolean zB2 = baVar.b();
                String strA = baVar.a();
                h.g.b.x.f(strA, "appDownloadUrl");
                dnVarF2.H(new Cdo(zB2, strA));
                break;
            case 3:
                com.waze.car_lib.j.d.c((com.waze.car_lib.f.a) obj, ((com.waze.car_lib.f.bu) this.f18527a).a());
                break;
            case 4:
                ((fo) obj).f().H(new fr(((com.waze.car_lib.f.bg) this.f18527a).a()));
                break;
            case 5:
                com.waze.car_lib.j.d.b((com.waze.car_lib.f.a) obj, ((fn) this.f18527a).a(), com.waze.modules.navigation.ah.x, com.waze.modules.navigation.at.f30321a);
                break;
            case 6:
                ((dt) obj).f().c((com.waze.car_lib.p.aj) this.f18527a);
                break;
            case 7:
                com.waze.shared_infra.r.q qVar = (com.waze.shared_infra.r.q) obj;
                ((com.waze.shared_infra.coordinators.s) this.f18527a).H(new com.waze.car_lib.f.bf(qVar.a(), qVar.b()));
                break;
            case 8:
                ((dt) obj).f().c((com.waze.car_lib.p.aj) this.f18527a);
                break;
            case 9:
                com.waze.car_lib.f.a aVar = (com.waze.car_lib.f.a) obj;
                h.g.b.x.f(aVar, "$this$startSubCoordinator");
                com.waze.car_lib.a.n nVar = (com.waze.car_lib.a.n) this.f18527a;
                com.waze.car_lib.j.d.b(aVar, nVar.p(), com.waze.modules.navigation.ah.f30289e, nVar.q());
                break;
            case 10:
                com.waze.car_lib.f.z zVarF = ((com.waze.car_lib.f.y) obj).f();
                er erVar = (er) this.f18527a;
                zVarF.e(erVar.g(), erVar.h(), com.waze.navigate.location_preview.bb.r);
                break;
            case 11:
                ((com.waze.car_lib.a.d) obj).f().c(((ev) this.f18527a).g());
                break;
            case 12:
                ((gs) obj).f().j(((eu) this.f18527a).g(), null);
                break;
            case 13:
                hi hiVar = (hi) this.f18527a;
                com.waze.car_lib.j.d.b((com.waze.car_lib.f.a) obj, hiVar.a(), com.waze.modules.navigation.ah.v, hiVar.b());
                break;
            case 14:
                ((jk) obj).f().a(((fb) this.f18527a).g());
                break;
            case 15:
                com.waze.car_lib.f.z zVarF2 = ((com.waze.car_lib.f.y) obj).f();
                hc hcVar = (hc) this.f18527a;
                zVarF2.e(hcVar.a(), hcVar.b(), com.waze.navigate.location_preview.bb.f31615g);
                break;
            case 16:
                SurfaceCallback surfaceCallback = (SurfaceCallback) obj;
                h.g.b.x.f(surfaceCallback, "$this$invokeAll");
                surfaceCallback.onSurfaceDestroyed((SurfaceContainer) this.f18527a);
                break;
            case 17:
                SurfaceCallback surfaceCallback2 = (SurfaceCallback) obj;
                h.g.b.x.f(surfaceCallback2, "$this$invokeAll");
                surfaceCallback2.onSurfaceAvailable((SurfaceContainer) this.f18527a);
                break;
            case 18:
                SurfaceCallback surfaceCallback3 = (SurfaceCallback) obj;
                h.g.b.x.f(surfaceCallback3, "$this$invokeAll");
                surfaceCallback3.onVisibleAreaChanged((Rect) this.f18527a);
                break;
            case 19:
                SurfaceCallback surfaceCallback4 = (SurfaceCallback) obj;
                h.g.b.x.f(surfaceCallback4, "$this$invokeAll");
                surfaceCallback4.onStableAreaChanged((Rect) this.f18527a);
                break;
            default:
                ((CarNotificationManager) this.f18527a).cancelAll();
                break;
        }
        return h.ab.f48028a;
    }
}
