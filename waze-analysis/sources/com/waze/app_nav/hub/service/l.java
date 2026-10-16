package com.waze.app_nav.hub.service;

import androidx.core.app.NotificationCompat;
import com.waze.app_nav.hub.ag;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l implements k {

    /* renamed from: b, reason: collision with root package name */
    private final Map f15396b = new LinkedHashMap();

    @Override // com.waze.app_nav.hub.service.k
    public final a a(long j2) {
        a aVar = (a) this.f15396b.get(new ag(j2));
        if (aVar != null) {
            return aVar;
        }
        throw new RuntimeException("service not found");
    }

    @Override // com.waze.app_nav.hub.service.k
    public final void b(a aVar) {
        x.f(aVar, NotificationCompat.CATEGORY_SERVICE);
        this.f15396b.put(aVar.b(), aVar);
    }

    @Override // com.waze.app_nav.hub.service.k
    public final void c(long j2) {
        this.f15396b.remove(new ag(j2));
    }
}
