package com.waze.calendar;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f18780a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CalendarNativeManager f18781b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f18782c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f18783d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f18784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(CalendarNativeManager calendarNativeManager, int i2, int i3, String str, h.c.e eVar) {
        super(2, eVar);
        this.f18781b = calendarNativeManager;
        this.f18782c = i2;
        this.f18783d = i3;
        this.f18784e = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f18781b, this.f18782c, this.f18783d, this.f18784e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f18780a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        CalendarNativeManager calendarNativeManager = this.f18781b;
        int i2 = this.f18782c;
        int i3 = this.f18783d;
        String str = this.f18784e;
        this.f18780a = 1;
        Object objD = calendarNativeManager.getCalendarManager().d(i2, i3, str, new j(calendarNativeManager, null), this);
        return objD == aVar ? aVar : objD;
    }
}
