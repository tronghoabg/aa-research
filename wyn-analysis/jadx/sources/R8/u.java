package R8;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class u implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Y9.c f10532a;

    /* renamed from: b, reason: collision with root package name */
    public final K3.r f10533b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f10534c;

    /* renamed from: d, reason: collision with root package name */
    public final O8.a f10535d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f10536e = new AtomicBoolean(false);

    public u(Y9.c cVar, K3.r rVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, O8.a aVar) {
        this.f10532a = cVar;
        this.f10533b = rVar;
        this.f10534c = uncaughtExceptionHandler;
        this.f10535d = aVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.f10535d.b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10534c;
        AtomicBoolean atomicBoolean = this.f10536e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    Y9.c cVar = this.f10532a;
                    ((m) cVar.f16739b).g(this.f10533b, thread, th, false);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
                if (uncaughtExceptionHandler != null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                    }
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e7) {
                O8.c cVar2 = O8.c.f8921a;
                if (cVar2.b(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e7);
                }
                if (uncaughtExceptionHandler != null) {
                    cVar2.c("Completed exception processing. Invoking default exception handler.");
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    cVar2.c("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
