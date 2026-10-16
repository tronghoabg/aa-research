package com.waze.trip_overview;

import android.content.Intent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.lm;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bt implements ac {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.af f41116a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f41117b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f41118c;

    /* renamed from: d, reason: collision with root package name */
    private final de f41119d;

    /* renamed from: e, reason: collision with root package name */
    private final MutableLiveData f41120e;

    /* renamed from: f, reason: collision with root package name */
    private com.waze.trip_overview.c.a.d f41121f;

    public bt(ch chVar, kotlinx.coroutines.af afVar, com.waze.shared_infra.i.e eVar, com.waze.shared_infra.q.e eVar2, de deVar) {
        h.g.b.x.f(chVar, "view");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(eVar2, "clock");
        h.g.b.x.f(deVar, "routesSubController");
        this.f41116a = afVar;
        this.f41117b = eVar;
        this.f41118c = eVar2;
        this.f41119d = deVar;
        this.f41120e = new MutableLiveData();
    }

    @Override // com.waze.trip_overview.ac
    public final /* synthetic */ LiveData a() {
        return this.f41120e;
    }

    @Override // com.waze.trip_overview.ac
    public final de b() {
        return this.f41119d;
    }

    @Override // com.waze.trip_overview.ac
    public final void c(cg cgVar) {
        h.g.b.x.f(cgVar, "finishReason");
        com.waze.trip_overview.c.a.d dVar = this.f41121f;
        if (dVar != null) {
            h.g.b.x.f(cgVar, "finishReason");
            boolean z = cgVar instanceof cd;
            Object obj = dVar.f41211a;
            if (z) {
                ((com.waze.shared_infra.coordinators.o) obj).D(by.f41143a);
            } else if (cgVar instanceof cc) {
                ((com.waze.shared_infra.coordinators.o) obj).D(bx.f41142a);
            } else if (cgVar instanceof cf) {
                ((com.waze.shared_infra.coordinators.o) obj).D(bz.f41144a);
            } else {
                if (!h.g.b.x.n(cgVar, ce.f41287a)) {
                    throw new h.i();
                }
                ((com.waze.shared_infra.coordinators.o) obj).D(bx.f41142a);
            }
        }
        this.f41120e.postValue(new ab(cgVar));
        this.f41121f = null;
    }

    @Override // com.waze.trip_overview.ac
    public final void d(boolean z, long j2, com.waze.modules.navigation.j jVar, com.waze.modules.navigation.ak akVar, com.waze.modules.navigation.ah ahVar, com.waze.modules.c.dk dkVar, com.waze.trip_overview.c.a.d dVar) throws IOException {
        h.g.b.x.f(jVar, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(akVar, "destination");
        h.g.b.x.f(ahVar, "caller");
        h.g.b.x.f(dkVar, "routes");
        h.g.b.x.f(dVar, "tripOverviewListener");
        this.f41121f = dVar;
        MutableLiveData mutableLiveData = this.f41120e;
        boolean z2 = mutableLiveData.getValue() instanceof aa;
        com.waze.shared_infra.i.e eVar = this.f41117b;
        if (z2) {
            eVar.a("TripOverview is already started");
            return;
        }
        eVar.a("TripOverview started: " + z + ", " + j2 + ", " + jVar + ", " + akVar);
        mutableLiveData.postValue(aa.f40990a);
        kotlinx.coroutines.aj.z(this.f41116a, null, null, new dd(this.f41119d.x(z, j2, jVar, akVar, ahVar, dkVar, this.f41118c.a()), this, (h.c.e) null, 1), 3);
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE != null) {
            eVarE.startActivityForResult(new Intent(eVarE, (Class<?>) TripOverviewActivity.class), 5000);
        }
    }
}
