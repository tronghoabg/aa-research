package com.google.firebase.concurrent;

import com.google.android.gms.common.api.internal.av;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class y implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f9042a = Logger.getLogger(y.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final Executor f9043b;

    /* renamed from: c, reason: collision with root package name */
    private final Deque f9044c = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private int f9047f = 1;

    /* renamed from: d, reason: collision with root package name */
    private long f9045d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final x f9046e = new x(this);

    y(Executor executor) {
        av.m(executor);
        this.f9043b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        av.m(runnable);
        Deque deque = this.f9044c;
        synchronized (deque) {
            int i2 = this.f9047f;
            if (i2 != 4 && i2 != 3) {
                long j2 = this.f9045d;
                w wVar = new w(this, runnable);
                deque.add(wVar);
                this.f9047f = 2;
                try {
                    this.f9043b.execute(this.f9046e);
                    if (this.f9047f != 2) {
                        return;
                    }
                    synchronized (this.f9044c) {
                        if (this.f9045d == j2 && this.f9047f == 2) {
                            this.f9047f = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e2) {
                    Deque deque2 = this.f9044c;
                    synchronized (deque2) {
                        int i3 = this.f9047f;
                        boolean z = false;
                        if ((i3 == 1 || i3 == 2) && deque2.removeLastOccurrence(wVar)) {
                            z = true;
                        }
                        if (!(e2 instanceof RejectedExecutionException) || z) {
                            throw e2;
                        }
                    }
                    return;
                }
            }
            deque.add(runnable);
        }
    }

    public final String toString() {
        Executor executor = this.f9043b;
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + String.valueOf(executor) + "}";
    }
}
