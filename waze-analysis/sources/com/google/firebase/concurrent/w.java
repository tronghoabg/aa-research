package com.google.firebase.concurrent;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f9039a;

    w(y yVar, Runnable runnable) {
        this.f9039a = runnable;
        Objects.requireNonNull(yVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9039a.run();
    }

    public final String toString() {
        return this.f9039a.toString();
    }
}
