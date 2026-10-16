package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eh f46824a;

    dr(eh ehVar) {
        Objects.requireNonNull(ehVar);
        this.f46824a = ehVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh ehVar = this.f46824a;
        if (ehVar.w.a() == e.a.w.f47854d) {
            ehVar.f46874i.a(2, "CONNECTING as requested");
            eh.A(ehVar, e.a.w.f47851a);
            eh.E(ehVar);
        }
    }
}
