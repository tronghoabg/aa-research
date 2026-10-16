package e.a.e;

import androidx.core.app.NotificationCompat;
import e.a.cm;
import e.a.ee;
import e.a.ef;
import h.g.b.x;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.a.s;
import kotlinx.coroutines.a.t;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends com.waze.uid.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f47354a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.cf.d.c f47355b;

    b(o oVar, com.waze.cf.d.c cVar) {
        this.f47354a = oVar;
        this.f47355b = cVar;
    }

    @Override // com.waze.uid.f
    public final void a(ee eeVar, cm cmVar) {
        x.f(eeVar, NotificationCompat.CATEGORY_STATUS);
        x.f(cmVar, "trailersMetadata");
        this.f47354a.v(eeVar.l() ? null : new ef(eeVar, cmVar));
    }

    @Override // com.waze.uid.f
    public final void h(Object obj) throws Throwable {
        Object objI = this.f47354a.i(obj);
        if (objI instanceof s) {
            Throwable thD = t.d(objI);
            if (thD != null) {
                throw thD;
            }
            throw new AssertionError("onMessage should never be called until responses is ready");
        }
    }

    @Override // com.waze.uid.f
    public final void i() throws Throwable {
        this.f47355b.b();
    }
}
