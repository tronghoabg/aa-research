package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fk f46928a;

    fj(fk fkVar) {
        Objects.requireNonNull(fkVar);
        this.f46928a = fkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fk fkVar = this.f46928a;
        fp fpVar = fkVar.f46932d.f46934a;
        if (fpVar.I != null) {
            fpVar.I.remove(fkVar);
            if (fpVar.I.isEmpty()) {
                fpVar.f46952e.c(fpVar.J, false);
                fpVar.I = null;
                if (fpVar.M.get()) {
                    fo foVar = fpVar.L;
                    Object obj = foVar.f46940a;
                    e.a.ee eeVar = fp.f46945b;
                    synchronized (obj) {
                        if (foVar.f46942c != null) {
                            return;
                        }
                        foVar.f46942c = eeVar;
                        boolean zIsEmpty = foVar.f46941b.isEmpty();
                        if (zIsEmpty) {
                            foVar.f46943d.K.t(eeVar);
                        }
                    }
                }
            }
        }
    }
}
