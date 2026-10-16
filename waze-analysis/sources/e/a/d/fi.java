package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f46926a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fk f46927b;

    fi(fk fkVar, Runnable runnable) {
        this.f46926a = runnable;
        Objects.requireNonNull(fkVar);
        this.f46927b = fkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46926a.run();
        fk fkVar = this.f46927b;
        fkVar.f46932d.f46934a.f46951d.execute(new fj(fkVar));
    }
}
