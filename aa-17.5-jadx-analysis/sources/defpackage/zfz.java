package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zfz {
    private final AtomicReference b = new AtomicReference(zgl.a);
    public zfy a = new zfy();

    public final zgp a(zfj zfjVar, Executor executor) {
        executor.getClass();
        final zfx zfxVar = new zfx(executor, this);
        zfv zfvVar = new zfv(zfxVar, zfjVar, 0);
        final zhc zhcVar = new zhc();
        final zgp zgpVar = (zgp) this.b.getAndSet(zhcVar);
        final zhk zhkVar = new zhk(zfvVar);
        zgpVar.c(zhkVar, zfxVar);
        final zgp zgpVarZ = wub.Z(zhkVar);
        Runnable runnable = new Runnable() { // from class: zfu
            @Override // java.lang.Runnable
            public final void run() {
                zhk zhkVar2 = zhkVar;
                if (zhkVar2.isDone()) {
                    zhcVar.r(zgpVar);
                } else if (zgpVarZ.isCancelled() && zfxVar.compareAndSet(zfw.a, zfw.b)) {
                    zhkVar2.cancel(false);
                }
            }
        };
        zfq zfqVar = zfq.a;
        zgpVarZ.c(runnable, zfqVar);
        zhkVar.c(runnable, zfqVar);
        return zgpVarZ;
    }
}
