package defpackage;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class vve {
    private static final vvd k = new vvb();
    public final ackk a;
    public final Executor b;
    public final zgt c;
    public final ackk d;
    public final Random e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public volatile vvd g = k;
    public ScheduledFuture h;
    public ScheduledFuture i;
    public ScheduledFuture j;

    public vve(vqe vqeVar, zgt zgtVar, Executor executor, ackk ackkVar, ackk ackkVar2, ackk ackkVar3, Random random) {
        this.a = ackkVar;
        this.b = executor;
        this.c = zgtVar;
        this.d = ackkVar2;
        this.e = random;
        vqeVar.a(new vvc(this, ackkVar3, zgtVar));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.h = null;
        }
        ScheduledFuture scheduledFuture2 = this.i;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.i = null;
        }
    }
}
