package defpackage;

import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class plo {
    public static final yob a = yob.c("com/google/android/apps/gmm/shared/legal/BasicClearcutControllerAsync");
    private final xyc b;

    public plo(ackk ackkVar, zgs zgsVar) {
        this.b = wub.L(new plm(zgsVar, ackkVar, 0));
    }

    public final void a(Consumer consumer, Executor executor) {
        wub.ah((zgp) this.b.gu(), new pln(consumer), executor);
    }
}
