package e.a.f;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f47748a;

    z(ac acVar) {
        Objects.requireNonNull(acVar);
        this.f47748a = acVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ac acVar = this.f47748a;
        synchronized (acVar.r) {
            acVar.L = Integer.MAX_VALUE;
            com.google.d.b.an.v(acVar.M.isEmpty(), "Pending streams detected during transport start. RPCs should not be started before transport is ready.");
        }
        ac acVar2 = this.f47748a;
        acVar2.v.execute(acVar2.A);
    }
}
