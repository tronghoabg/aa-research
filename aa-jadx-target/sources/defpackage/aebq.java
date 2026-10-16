package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aebq implements aeaq {
    private final /* synthetic */ int a;

    public aebq(int i) {
        this.a = i;
    }

    public final /* synthetic */ java.lang.Object a() {
        if (this.a == 0) {
            return java.util.concurrent.Executors.newCachedThreadPool(defpackage.adve.i("grpc-okhttp-%d"));
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, defpackage.adve.i("grpc-timer-%d"));
        try {
            scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", java.lang.Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, java.lang.Boolean.TRUE);
        } catch (java.lang.NoSuchMethodException unused) {
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
        return java.util.concurrent.Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
        if (this.a != 0) {
            ((java.util.concurrent.ScheduledExecutorService) obj).shutdown();
        } else {
            ((java.util.concurrent.ExecutorService) obj).shutdown();
        }
    }
}
