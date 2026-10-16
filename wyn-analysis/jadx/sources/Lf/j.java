package Lf;

import A7.AbstractC0279p0;
import Ef.H;

/* loaded from: classes5.dex */
public final class j extends i {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f7127c;

    public j(Runnable runnable, long j8, boolean z2) {
        super(j8, z2);
        this.f7127c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7127c.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f7127c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(H.t(runnable));
        sb2.append(", ");
        sb2.append(this.f7125a);
        sb2.append(", ");
        return AbstractC0279p0.n(sb2, this.f7126b ? "Blocking" : "Non-blocking", ']');
    }
}
