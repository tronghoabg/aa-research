package com.waze.car_lib;

import android.content.Context;
import androidx.car.app.connection.CarConnection;
import androidx.lifecycle.LiveData;
import com.waze.cf;
import com.waze.cs;
import java.util.Objects;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bp implements com.waze.ao {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.crash.c f19204a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19205b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f19206c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f19207d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f19208e;

    /* renamed from: f, reason: collision with root package name */
    private CarConnection f19209f;

    public bp(com.waze.crash.c cVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(cVar, "crashManager");
        h.g.b.x.f(eVar, "logger");
        this.f19204a = cVar;
        this.f19205b = eVar;
        kotlinx.coroutines.b.bn bnVarB = ck.b(com.waze.an.f14320a);
        this.f19206c = bnVarB;
        this.f19207d = bnVarB;
        this.f19208e = ck.b(false);
    }

    @Override // com.waze.ao
    public final ch a() {
        return this.f19207d;
    }

    @Override // com.waze.ao
    public final void b() {
        this.f19205b.a("Cluster connected");
        this.f19208e.e(true);
        this.f19204a.n();
    }

    @Override // com.waze.ao
    public final void c(Context context) {
        h.g.b.x.f(context, "context");
        d();
        CarConnection carConnection = new CarConnection(context);
        carConnection.getType().observeForever(new bn(new bo(this, 0)));
        this.f19209f = carConnection;
    }

    @Override // com.waze.ao
    public final void d() {
        LiveData<Integer> type;
        CarConnection carConnection = this.f19209f;
        if (carConnection != null && (type = carConnection.getType()) != null) {
            type.removeObserver(new bn(new bo(this, 2)));
        }
        this.f19209f = null;
    }

    @Override // com.waze.ao
    public final boolean e() {
        return cs.g((cf) this.f19207d.d());
    }

    @Override // com.waze.ao
    public final void f(cf cfVar) {
        h.g.b.x.f(cfVar, "state");
        Objects.toString(cfVar);
        this.f19205b.a("CarConnection state changed - ".concat(cfVar.toString()));
        this.f19206c.e(cfVar);
        this.f19204a.d(cfVar instanceof com.waze.am);
    }
}
