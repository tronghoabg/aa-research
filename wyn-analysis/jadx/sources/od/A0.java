package od;

import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
import md.EnumC3545m;
import yc.C4584g;

/* loaded from: classes5.dex */
public final class A0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41484b;

    public /* synthetic */ A0(Object obj, int i5) {
        this.f41483a = i5;
        this.f41484b = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.f41483a) {
            case 0:
                Logger logger = M0.f41645d0;
                Level level = Level.SEVERE;
                StringBuilder sb2 = new StringBuilder("[");
                M0 m02 = (M0) this.f41484b;
                sb2.append(m02.f41678a);
                sb2.append("] Uncaught exception in the SynchronizationContext. Panic!");
                logger.log(level, sb2.toString(), th);
                if (!m02.f41705z) {
                    m02.f41705z = true;
                    m02.r(true);
                    m02.w(false);
                    C3743z0 c3743z0 = new C3743z0(th);
                    m02.f41704y = c3743z0;
                    m02.f41657E.i(c3743z0);
                    m02.f41668Q.j(null);
                    m02.f41666O.g(4, "PANIC! Entering TRANSIENT_FAILURE");
                    m02.f41697r.d(EnumC3545m.f40694c);
                    break;
                }
                break;
            default:
                ((C4584g) this.f41484b).f48119h.w("Failed to process frames after camera was flipped.");
                break;
        }
    }
}
