package com.waze.uid.c;

import com.waze.uid.VehicleType;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ be f44341a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44342b;

    public /* synthetic */ c(be beVar, int i2) {
        this.f44342b = i2;
        this.f44341a = beVar;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f44342b;
        if (i2 == 0) {
            d dVar = (d) obj;
            h.g.b.x.f(dVar, "operation");
            d dVar2 = d.f44347a;
            int iOrdinal = dVar.ordinal();
            be beVar = this.f44341a;
            if (iOrdinal == 0) {
                beVar.j(new com.waze.uid.state_impl.email.d());
            } else if (iOrdinal == 1) {
                beVar.j(new com.waze.uid.state_impl.email.t());
                android.support.v4.app.av activity = beVar.getActivity();
                if (activity != null) {
                    com.waze.ui.v.f.k(activity, com.waze.shared_infra.o.b.a(), com.waze.uid.d.n.f44458a);
                }
            } else if (iOrdinal == 2) {
                android.support.v4.app.av activity2 = beVar.getActivity();
                if (activity2 != null) {
                    com.waze.ad.a.j.k(activity2, com.waze.feedback.f.f23861a, com.waze.feedback.g.f23865a, beVar.i());
                }
            } else {
                if (iOrdinal != 3) {
                    throw new h.i();
                }
                beVar.j(new com.waze.uid.state_impl.email.v());
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            String str = (String) obj;
            h.g.b.x.f(str, "pin");
            this.f44341a.j(new com.waze.uid.state_impl.email.b(str));
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            VehicleType vehicleType = (VehicleType) obj;
            h.g.b.x.f(vehicleType, "vehicleType");
            be beVar2 = this.f44341a;
            ((x) beVar2).a().b(vehicleType);
            beVar2.j(new com.waze.uid.state_impl.add_id.z(vehicleType));
            return h.ab.f48028a;
        }
        if (i2 != 3) {
            com.waze.shared_infra.q.i iVar = (com.waze.shared_infra.q.i) obj;
            h.g.b.x.f(iVar, "birthdate");
            this.f44341a.j(new com.waze.uid.state_impl.a.a(iVar));
            return h.ab.f48028a;
        }
        com.waze.shared_infra.q.i iVar2 = (com.waze.shared_infra.q.i) obj;
        h.g.b.x.f(iVar2, "birthdate");
        this.f44341a.j(new com.waze.uid.state_impl.a.a(iVar2));
        return h.ab.f48028a;
    }
}
