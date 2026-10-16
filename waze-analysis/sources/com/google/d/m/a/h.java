package com.google.d.m.a;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    static final h f8070a = new h();

    /* renamed from: b, reason: collision with root package name */
    final Runnable f8071b;

    /* renamed from: c, reason: collision with root package name */
    final Executor f8072c;
    h next;

    h() {
        this.f8071b = null;
        this.f8072c = null;
    }

    h(Runnable runnable, Executor executor) {
        this.f8071b = runnable;
        this.f8072c = executor;
    }
}
