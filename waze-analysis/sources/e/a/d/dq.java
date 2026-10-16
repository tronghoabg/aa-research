package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eh f46823a;

    dq(eh ehVar) {
        Objects.requireNonNull(ehVar);
        this.f46823a = ehVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh ehVar = this.f46823a;
        ehVar.p = null;
        ehVar.f46874i.a(2, "CONNECTING after backoff");
        eh.A(ehVar, e.a.w.f47851a);
        eh.E(ehVar);
    }
}
