package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aear {
    private static final defpackage.aear c = new defpackage.aear();
    public final java.util.IdentityHashMap a = new java.util.IdentityHashMap();
    public java.util.concurrent.ScheduledExecutorService b;

    public static java.lang.Object a(aeaq aeaqVar) {
        return c.b(aeaqVar);
    }

    public static void c(aeaq aeaqVar, java.lang.Object obj) throws java.lang.Throwable {
        c.d(aeaqVar, obj);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    final synchronized java.lang.Object b(aeaq aeaqVar) {
        aeap aeapVar;
        java.util.IdentityHashMap identityHashMap = this.a;
        aeapVar = (aeap) identityHashMap.get(aeaqVar);
        if (aeapVar == null) {
            aeapVar = new aeap(aeaqVar.a());
            identityHashMap.put(aeaqVar, aeapVar);
        }
        ?? r4 = aeapVar.c;
        if (r4 != 0) {
            r4.cancel(false);
            aeapVar.c = null;
        }
        aeapVar.b++;
        return aeapVar.a;
    }

    final synchronized void d(aeaq aeaqVar, java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Throwable th;
        try {
            try {
                aeap aeapVar = (aeap) this.a.get(aeaqVar);
                if (aeapVar == null) {
                    throw new java.lang.IllegalArgumentException("No cached instance found for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(aeaqVar))));
                }
                boolean z = true;
                defpackage.ysr.aY(obj == aeapVar.a, "Releasing the wrong instance");
                defpackage.ysr.bk(aeapVar.b > 0, "Refcount has already reached zero");
                int i = aeapVar.b - 1;
                aeapVar.b = i;
                if (i == 0) {
                    if (aeapVar.c != null) {
                        z = false;
                    }
                    defpackage.ysr.bk(z, "Destroy task already scheduled");
                    java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = this.b;
                    if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
                        try {
                            scheduledExecutorServiceNewSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(defpackage.adve.i("grpc-shared-destroyer-%d"));
                            this.b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                        }
                    }
                    aeapVar.c = scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new defpackage.adwb(new defpackage.adsh(this, aeapVar, aeaqVar, obj, 4)), 1L, java.util.concurrent.TimeUnit.SECONDS);
                    return;
                }
                return;
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
        throw th;
    }
}
