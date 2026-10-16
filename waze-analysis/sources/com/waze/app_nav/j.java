package com.waze.app_nav;

import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final w f15417a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15418b;

    public j(w wVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(wVar, "flowController");
        h.g.b.x.f(eVar, "logger");
        this.f15417a = wVar;
        this.f15418b = eVar;
    }

    static final void a(j jVar, Bundle bundle) {
        com.waze.app_nav.b.a aVar;
        h.g.b.x.c(bundle);
        h.g.b.x.f(bundle, "<this>");
        long j2 = bundle.getLong("app_nav_fragment_destination_id");
        if (Build.VERSION.SDK_INT >= 33) {
            aVar = (com.waze.app_nav.b.a) bundle.getSerializable("app_nav_action", com.waze.app_nav.b.a.class);
        } else {
            Serializable serializable = bundle.getSerializable("app_nav_action");
            aVar = serializable instanceof com.waze.app_nav.b.a ? (com.waze.app_nav.b.a) serializable : null;
        }
        com.waze.app_nav.b.b bVar = aVar != null ? new com.waze.app_nav.b.b(j2, aVar, bundle.getBundle("app_nav_result")) : null;
        if (bVar == null) {
            com.waze.shared_infra.i.e eVar = jVar.f15418b;
            Objects.toString(bundle);
            eVar.g("failed to read result from bundle=".concat(String.valueOf(bundle)));
            return;
        }
        com.waze.shared_infra.i.e eVar2 = jVar.f15418b;
        Objects.toString(bVar);
        eVar2.a("handling feature request: ".concat(bVar.toString()));
        com.waze.app_nav.b.a aVarC = bVar.c();
        com.waze.app_nav.b.a aVar2 = com.waze.app_nav.b.a.f15188a;
        int iOrdinal = aVarC.ordinal();
        if (iOrdinal == 0) {
            eVar2.a("onFeatureBack destinationId=" + bVar.a());
            jVar.f15417a.c();
            return;
        }
        if (iOrdinal == 1) {
            eVar2.a("onFeatureClose destinationId=" + bVar.a());
            jVar.f15417a.d();
            return;
        }
        if (iOrdinal != 2) {
            throw new h.i();
        }
        long jA = bVar.a();
        eVar2.a("onFeatureFinish destinationId=" + jA + ", result=" + bVar.b());
        jVar.f15417a.e(jA);
    }
}
