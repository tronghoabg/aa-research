package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class ExceptionUtilsKt {
    public static final boolean isProcessCanceledException(@NotNull Throwable th) {
        AbstractC3340k.e(th, "<this>");
        Class<?> superclass = th.getClass();
        while (!AbstractC3340k.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final RuntimeException rethrow(@NotNull Throwable e7) throws Throwable {
        AbstractC3340k.e(e7, "e");
        throw e7;
    }
}
