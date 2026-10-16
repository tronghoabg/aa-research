package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kjj {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ICSEHandler");

    public static final com.google.android.gms.car.diagnostics.CriticalError a() {
        defpackage.zif zifVar = new defpackage.zif();
        java.util.concurrent.Executors.newSingleThreadExecutor().execute(new kji(zifVar));
        try {
            return (com.google.android.gms.car.diagnostics.CriticalError) zifVar.t(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.TimeoutException unused) {
            return null;
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause instanceof java.lang.IllegalStateException) {
                throw ((java.lang.IllegalStateException) cause);
            }
            return null;
        }
    }
}
