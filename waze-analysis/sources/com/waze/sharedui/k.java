package com.waze.sharedui;

import h.g.b.x;
import java.util.Calendar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f39058a;

    public k(com.waze.shared_infra.o.a aVar) {
        x.f(aVar, "stringProvider");
        this.f39058a = aVar;
    }

    @Override // com.waze.sharedui.j
    public final String a(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        String strT = com.waze.shared_infra.i.h.t(this.f39058a, calendar.get(7));
        x.e(strT, "getWeekdayName(...)");
        return strT;
    }
}
