package com.airbnb.lottie;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class aa extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    private ab f1931a;

    aa(ab abVar, Callable callable) {
        super(callable);
        this.f1931a = abVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        try {
            if (!isCancelled()) {
                try {
                    this.f1931a.k((y) get());
                } catch (InterruptedException | ExecutionException e2) {
                    this.f1931a.k(new y(e2));
                }
            }
        } finally {
            this.f1931a = null;
        }
    }
}
