package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kpa implements java.lang.AutoCloseable {
    public final android.bluetooth.BluetoothProfile a;
    private final android.content.Context b;

    public kpa(android.content.Context context) {
        java.lang.Object objT;
        this.b = context;
        try {
            defpackage.zif zifVar = new defpackage.zif();
            boolean z = true;
            ((android.bluetooth.BluetoothManager) context.getSystemService(android.bluetooth.BluetoothManager.class)).getAdapter().getProfileProxy(context, new defpackage.koz(zifVar), 1);
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            boolean z2 = false;
            try {
                long jNanoTime = 5000000000L;
                long jNanoTime2 = java.lang.System.nanoTime() + 5000000000L;
                while (true) {
                    try {
                        try {
                            objT = zifVar.t(jNanoTime, java.util.concurrent.TimeUnit.NANOSECONDS);
                            break;
                        } catch (java.lang.InterruptedException unused) {
                            jNanoTime = jNanoTime2 - java.lang.System.nanoTime();
                            z2 = true;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (z) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z2) {
                    java.lang.Thread.currentThread().interrupt();
                }
                this.a = (android.bluetooth.BluetoothProfile) objT;
            } catch (java.lang.Throwable th2) {
                th = th2;
                z = z2;
            }
        } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            throw new java.lang.IllegalStateException("Failure injection could not execute injection setHfpConnectedState", e);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        defpackage.yqm yqmVar = defpackage.kpb.a;
        ((android.bluetooth.BluetoothManager) this.b.getSystemService(android.bluetooth.BluetoothManager.class)).getAdapter().closeProfileProxy(1, this.a);
    }
}
