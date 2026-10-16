package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class qap {
    public static final yob a = yob.c("com/google/android/apps/gmm/userevent3/reporter/PageLoggingContextFlusher");
    public final ackk b;
    public final ScheduledExecutorService c;
    public volatile ScheduledFuture d;
    public final ConcurrentLinkedQueue e = new ConcurrentLinkedQueue();

    public qap(zgt zgtVar, ackk ackkVar) {
        this.c = zgtVar;
        this.b = ackkVar;
    }
}
