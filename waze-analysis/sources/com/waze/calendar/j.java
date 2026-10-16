package com.waze.calendar;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18778a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CalendarNativeManager f18779b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(CalendarNativeManager calendarNativeManager, h.c.e eVar) {
        super(2, eVar);
        this.f18779b = calendarNativeManager;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        j jVar = new j(this.f18779b, eVar);
        jVar.f18778a = obj;
        return jVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((a) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        a aVar2 = (a) this.f18778a;
        this.f18779b.addCalendarEventNTV(aVar2.c(), aVar2.b(), aVar2.a(), false, aVar2.g(), aVar2.e(), aVar2.d(), aVar2.f());
        return ab.f48028a;
    }
}
