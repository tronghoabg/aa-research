package e.a.d;

import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ht implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hv f47117a;

    /* synthetic */ ht(hv hvVar) {
        Objects.requireNonNull(hvVar);
        this.f47117a = hvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hv hvVar = this.f47117a;
        if (!hvVar.f47124f) {
            hvVar.f47125g = null;
            return;
        }
        long jK = hvVar.k();
        if (hvVar.f47123e - jK > 0) {
            hvVar.f47125g = hvVar.f47119a.schedule(new hu(hvVar), hvVar.f47123e - jK, TimeUnit.NANOSECONDS);
            return;
        }
        hvVar.f47124f = false;
        hvVar.f47125g = null;
        hvVar.f47121c.run();
    }
}
