package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiqe {
    public static final boolean a() {
        defpackage.ajmy ajmyVar = defpackage.ajmy.c;
        return android.os.Build.VERSION.SDK_INT >= 29;
    }

    public static final boolean isProcessCanceledException(java.lang.Throwable th) {
        th.getClass();
        java.lang.Class<?> superclass = th.getClass();
        while (!defpackage.afga.f(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final java.lang.RuntimeException rethrow(java.lang.Throwable th) throws java.lang.Throwable {
        th.getClass();
        throw th;
    }
}
