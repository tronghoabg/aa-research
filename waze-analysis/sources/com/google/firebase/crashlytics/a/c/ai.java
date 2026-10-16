package com.google.firebase.crashlytics.a.c;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ai implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f9115a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.a f9116b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9117c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private final p f9118d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.h.f f9119e;

    public ai(p pVar, com.google.firebase.crashlytics.a.h.f fVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.a.a aVar) {
        this.f9118d = pVar;
        this.f9119e = fVar;
        this.f9115a = uncaughtExceptionHandler;
        this.f9116b = aVar;
    }

    final boolean a() {
        return this.f9117c.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.f9117c.set(true);
        try {
            try {
            } catch (Exception e2) {
                com.google.firebase.crashlytics.a.i.a().e("An error occurred in the uncaught exception handler", e2);
            }
            if (thread == null) {
                com.google.firebase.crashlytics.a.i.a().d("Crashlytics will not record uncaught exception; null thread");
            } else if (th == null) {
                com.google.firebase.crashlytics.a.i.a().d("Crashlytics will not record uncaught exception; null throwable");
            } else {
                if (!this.f9116b.hasCrashDataForCurrentSession()) {
                    p pVar = this.f9118d;
                    pVar.f9201a.y(this.f9119e, thread, th);
                    com.google.firebase.crashlytics.a.i.a().b("Completed exception processing. Invoking default exception handler.");
                    this.f9115a.uncaughtException(thread, th);
                    this.f9117c.set(false);
                }
                com.google.firebase.crashlytics.a.i.a().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            }
            com.google.firebase.crashlytics.a.i.a().b("Uncaught exception will not be recorded by Crashlytics.");
            com.google.firebase.crashlytics.a.i.a().b("Completed exception processing. Invoking default exception handler.");
            this.f9115a.uncaughtException(thread, th);
            this.f9117c.set(false);
        } catch (Throwable th2) {
            com.google.firebase.crashlytics.a.i.a().b("Completed exception processing. Invoking default exception handler.");
            this.f9115a.uncaughtException(thread, th);
            this.f9117c.set(false);
            throw th2;
        }
    }
}
