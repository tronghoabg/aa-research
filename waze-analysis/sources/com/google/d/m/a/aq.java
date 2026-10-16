package com.google.d.m.a;

import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aq extends AtomicReference implements Executor, Runnable {

    /* renamed from: a, reason: collision with root package name */
    as f8002a;

    /* renamed from: b, reason: collision with root package name */
    Executor f8003b;

    /* renamed from: c, reason: collision with root package name */
    Runnable f8004c;

    /* renamed from: d, reason: collision with root package name */
    Thread f8005d;

    /* synthetic */ aq(Executor executor, as asVar) {
        super(ap.f7998a);
        this.f8003b = executor;
        this.f8002a = asVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == ap.f7999b) {
            this.f8003b = null;
            this.f8002a = null;
            return;
        }
        this.f8005d = Thread.currentThread();
        try {
            ar arVar = ((as) Objects.requireNonNull(this.f8002a)).f8010b;
            if (arVar.f8006a == this.f8005d) {
                this.f8002a = null;
                com.google.d.b.an.u(arVar.f8007b == null);
                arVar.f8007b = runnable;
                arVar.f8008c = (Executor) Objects.requireNonNull(this.f8003b);
                this.f8003b = null;
            } else {
                Executor executor = (Executor) Objects.requireNonNull(this.f8003b);
                this.f8003b = null;
                this.f8004c = runnable;
                executor.execute(this);
            }
        } finally {
            this.f8005d = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.f8005d) {
            Runnable runnable = (Runnable) Objects.requireNonNull(this.f8004c);
            this.f8004c = null;
            runnable.run();
            return;
        }
        ar arVar = new ar();
        arVar.f8006a = threadCurrentThread;
        ((as) Objects.requireNonNull(this.f8002a)).f8010b = arVar;
        this.f8002a = null;
        try {
            Runnable runnable2 = (Runnable) Objects.requireNonNull(this.f8004c);
            this.f8004c = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = arVar.f8007b;
                if (runnable3 == null || (executor = arVar.f8008c) == null) {
                    break;
                }
                arVar.f8007b = null;
                arVar.f8008c = null;
                executor.execute(runnable3);
            }
        } finally {
            arVar.f8006a = null;
        }
    }
}
