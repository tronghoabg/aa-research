package com.waze.shared_infra.q;

import h.g.b.x;
import j$.time.Instant;
import java.util.Calendar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements e {
    @Override // com.waze.shared_infra.q.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.waze.shared_infra.q.e
    public final Instant b() {
        Instant instantNow = Instant.now();
        x.e(instantNow, "now(...)");
        return instantNow;
    }

    @Override // com.waze.shared_infra.q.e
    public final Calendar c() {
        Calendar calendar = Calendar.getInstance();
        x.e(calendar, "getInstance(...)");
        return calendar;
    }
}
