package kotlinx.coroutines.e;

import kotlinx.coroutines.ax;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae extends kotlinx.coroutines.ab implements kotlinx.coroutines.ao {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.ao f51861b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.ab f51862c;

    /* renamed from: d, reason: collision with root package name */
    private final String f51863d;

    /* JADX WARN: Multi-variable type inference failed */
    public ae(kotlinx.coroutines.ab abVar, String str) {
        kotlinx.coroutines.ao aoVar = abVar instanceof kotlinx.coroutines.ao ? (kotlinx.coroutines.ao) abVar : null;
        this.f51861b = aoVar == null ? kotlinx.coroutines.al.a() : aoVar;
        this.f51862c = abVar;
        this.f51863d = str;
    }

    @Override // kotlinx.coroutines.ao
    public final ax b(long j2, Runnable runnable, h.c.j jVar) {
        return this.f51861b.b(j2, runnable, jVar);
    }

    @Override // kotlinx.coroutines.ab
    public final void dispatch(h.c.j jVar, Runnable runnable) {
        this.f51862c.dispatch(jVar, runnable);
    }

    @Override // kotlinx.coroutines.ab
    public final void dispatchYield(h.c.j jVar, Runnable runnable) {
        this.f51862c.dispatchYield(jVar, runnable);
    }

    @Override // kotlinx.coroutines.ao
    public final void f(long j2, kotlinx.coroutines.k kVar) {
        this.f51861b.f(j2, kVar);
    }

    @Override // kotlinx.coroutines.ab
    public final boolean isDispatchNeeded(h.c.j jVar) {
        return this.f51862c.isDispatchNeeded(jVar);
    }

    @Override // kotlinx.coroutines.ab
    public final String toString() {
        return this.f51863d;
    }
}
