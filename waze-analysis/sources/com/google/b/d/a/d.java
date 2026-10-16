package com.google.b.d.a;

import com.google.d.b.an;
import com.google.d.m.a.af;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private af f7052a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f7053b;

    d(af afVar, Executor executor) {
        this.f7052a = afVar;
        an.B(executor);
        this.f7053b = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7052a = null;
        this.f7053b = null;
    }
}
