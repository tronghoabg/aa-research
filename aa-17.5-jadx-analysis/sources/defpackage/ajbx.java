package defpackage;

import java.util.Collection;
import java.util.Collections;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* loaded from: classes3.dex */
public final class ajbx {
    public static final Collection a;

    static {
        CoroutineExceptionHandler.class.getClassLoader();
        a = afrg.j(afrg.b(Collections.singletonList(AndroidExceptionPreHandler.class.getDeclaredConstructor(null).newInstance(null)).iterator()));
    }

    public static final void a(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        try {
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        } catch (Throwable unused) {
        }
    }
}
