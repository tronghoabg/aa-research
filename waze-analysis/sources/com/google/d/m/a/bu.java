package com.google.d.m.a;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bu implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static final bl f8038a = new bl(bu.class);

    /* renamed from: b, reason: collision with root package name */
    private final Executor f8039b;

    /* renamed from: c, reason: collision with root package name */
    private final Deque f8040c = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private int f8043f = 1;

    /* renamed from: d, reason: collision with root package name */
    private long f8041d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final bt f8042e = new bt(this);

    bu(Executor executor) {
        com.google.d.b.an.B(executor);
        this.f8039b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        com.google.d.b.an.B(runnable);
        Deque deque = this.f8040c;
        synchronized (deque) {
            int i2 = this.f8043f;
            if (i2 != 4 && i2 != 3) {
                long j2 = this.f8041d;
                bs bsVar = new bs(this, runnable);
                deque.add(bsVar);
                this.f8043f = 2;
                try {
                    this.f8039b.execute(this.f8042e);
                    if (this.f8043f != 2) {
                        return;
                    }
                    synchronized (this.f8040c) {
                        if (this.f8041d == j2 && this.f8043f == 2) {
                            this.f8043f = 3;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    Deque deque2 = this.f8040c;
                    synchronized (deque2) {
                        int i3 = this.f8043f;
                        boolean z = false;
                        if ((i3 == 1 || i3 == 2) && deque2.removeLastOccurrence(bsVar)) {
                            z = true;
                        }
                        if (!(th instanceof RejectedExecutionException) || z) {
                            throw th;
                        }
                        return;
                    }
                }
            }
            deque.add(runnable);
        }
    }

    public final String toString() {
        Executor executor = this.f8039b;
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + String.valueOf(executor) + "}";
    }
}
