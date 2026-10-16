package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eh f46830a;

    dv(eh ehVar) {
        Objects.requireNonNull(ehVar);
        this.f46830a = ehVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh ehVar = this.f46830a;
        ehVar.f46874i.a(2, "Terminated");
        fp fpVar = ehVar.f46868c.f46853b.f46994j;
        fpVar.H.remove(ehVar);
        fpVar.U.h(ehVar);
        fp.Q(fpVar);
    }
}
