package com.waze.trip_overview.c.a;

import android.support.v4.app.ar;
import com.waze.config.ConfigValues;
import com.waze.modules.c.de;
import com.waze.modules.c.dm;
import com.waze.trip_overview.at;
import com.waze.trip_overview.dx;
import com.waze.trip_overview.eq;
import com.waze.trip_overview.fc;
import com.waze.trip_overview.fd;
import com.waze.trip_overview.fe;
import com.waze.trip_overview.ff;
import com.waze.web.SimpleWebActivity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f41211a;

    d(ab abVar, byte[] bArr) {
        this.f41211a = abVar;
    }

    public final void a(com.waze.trip_overview.views.trip_details_container.d dVar) {
        h.g.b.x.f(dVar, "it");
        boolean zN = h.g.b.x.n(dVar, com.waze.trip_overview.views.trip_details_container.b.f41556a);
        Object obj = this.f41211a;
        if (!zN) {
            if (!h.g.b.x.n(dVar, com.waze.trip_overview.views.trip_details_container.c.f41557a)) {
                throw new h.i();
            }
            ((ab) obj).h().l(dx.f41422a);
        } else {
            String strB = ConfigValues.CONFIG_VALUE_ECO_REGULATIONS_TRIP_OVERVIEW_ALTERNATIVE_TRANSPORT_FOOTER_LINK.b();
            com.waze.web.b bVarP = SimpleWebActivity.p(((ar) obj).requireActivity());
            bVarP.c();
            bVarP.b(strB);
            bVarP.a();
        }
    }

    public final void b(at atVar, com.waze.trip_overview.views.h hVar) {
        h.g.b.x.f(atVar, "route");
        h.g.b.x.f(hVar, "cardBadgeType");
        com.waze.trip_overview.views.h hVar2 = com.waze.trip_overview.views.h.f41513a;
        int iOrdinal = hVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new h.i();
            }
        } else {
            dm dmVarC = atVar.c();
            if (dmVarC != null) {
                ((ab) this.f41211a).h().l(new fc(dmVarC));
            }
        }
    }

    public final void c(long j2, Boolean bool) {
        com.waze.trip_overview.i iVar;
        if (h.g.b.x.n(bool, true)) {
            iVar = com.waze.trip_overview.i.f41475e;
        } else if (h.g.b.x.n(bool, false)) {
            iVar = com.waze.trip_overview.i.f41476f;
        } else {
            if (bool != null) {
                throw new h.i();
            }
            iVar = com.waze.trip_overview.i.f41474d;
        }
        ((ab) this.f41211a).h().l(new eq(j2, iVar));
    }

    public final void d(de deVar) {
        h.g.b.x.f(deVar, "vehicleType");
        ((ab) this.f41211a).h().l(new fd(deVar));
    }

    public final void e() {
        ((ab) this.f41211a).h().l(fe.f41460a);
    }

    public final void f() {
        ((ab) this.f41211a).h().l(ff.f41461a);
    }

    public /* synthetic */ d(Object obj) {
        this.f41211a = obj;
    }
}
