package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajct {
    public static final java.lang.reflect.Method a;

    static {
        java.lang.reflect.Method method;
        try {
            method = java.util.concurrent.ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", java.lang.Boolean.TYPE);
        } catch (java.lang.Throwable unused) {
            method = null;
        }
        a = method;
    }
}
