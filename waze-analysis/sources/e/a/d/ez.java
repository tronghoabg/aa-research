package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ez implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fp f46912a;

    /* synthetic */ ez(fp fpVar) {
        Objects.requireNonNull(fpVar);
        this.f46912a = fpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fp fpVar = this.f46912a;
        if (fpVar.F == null) {
            return;
        }
        fp.P(fpVar);
    }
}
