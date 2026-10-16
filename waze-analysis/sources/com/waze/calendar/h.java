package com.waze.calendar;

import com.waze.iv;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f18769a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f18770b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CalendarNativeManager f18771c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(CalendarNativeManager calendarNativeManager, h.c.e eVar) {
        super(2, eVar);
        this.f18771c = calendarNativeManager;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        h hVar = new h(this.f18771c, eVar);
        hVar.f18770b = obj;
        return hVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((a) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f18769a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            a aVar2 = (a) this.f18770b;
            CalendarNativeManager calendarNativeManager = this.f18771c;
            String strC = aVar2.c();
            long jB = aVar2.b();
            long jA = aVar2.a();
            boolean zG = aVar2.g();
            String strE = aVar2.e();
            String strD = aVar2.d();
            String strF = aVar2.f();
            h hVar = this;
            this.f18769a = 1;
            CompletableDeferred completableDeferredJ = bo.j();
            calendarNativeManager.addCalendarEvent(strC, jB, jA, false, zG, strE, strD, strF, new iv(completableDeferredJ, 9));
            if (completableDeferredJ.c(hVar) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
