package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class eq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fp f46895a;

    eq(fp fpVar) {
        Objects.requireNonNull(fpVar);
        this.f46895a = fpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fp fpVar = this.f46895a;
        if (fpVar.M.get() || fpVar.F == null) {
            return;
        }
        fpVar.ak(false);
        fp.P(fpVar);
    }
}
