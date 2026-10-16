package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class tul implements Runnable {
    private final boolean c;
    private final List b = new ArrayList();
    public final AtomicBoolean a = new AtomicBoolean(false);

    public tul(Executor executor, qau qauVar, boolean z) {
        Instant instant = Instant.EPOCH;
        new ncp(executor, qauVar);
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c && this.a.getAndSet(false)) {
            Instant instant = Instant.EPOCH;
            this.b.clear();
        }
    }
}
