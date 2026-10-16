package com.waze.calendar;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f18772a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CalendarNativeManager f18773b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f18774c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f18775d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f18776e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f18777f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(CalendarNativeManager calendarNativeManager, int i2, int i3, String str, int i4, h.c.e eVar) {
        super(2, eVar);
        this.f18773b = calendarNativeManager;
        this.f18774c = i2;
        this.f18775d = i3;
        this.f18776e = str;
        this.f18777f = i4;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new i(this.f18773b, this.f18774c, this.f18775d, this.f18776e, this.f18777f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f18772a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            CalendarNativeManager calendarNativeManager = this.f18773b;
            int i2 = this.f18774c;
            int i3 = this.f18775d;
            String str = this.f18776e;
            this.f18772a = 1;
            if (calendarNativeManager.getCalendarManager().d(i2, i3, str, new h(calendarNativeManager, null), this) == aVar) {
                return aVar;
            }
        }
        o.onCompleteFetchCalendarEvents$default(this.f18773b, this.f18777f, null, 2, null);
        return ab.f48028a;
    }
}
