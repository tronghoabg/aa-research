package defpackage;

import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class kov implements AutoCloseable {
    public final BluetoothProfile a;
    private final Context b;

    public kov(Context context) throws Throwable {
        Object objT;
        this.b = context;
        try {
            zhc zhcVar = new zhc();
            boolean z = true;
            ((BluetoothManager) context.getSystemService(BluetoothManager.class)).getAdapter().getProfileProxy(context, new kou(zhcVar), 1);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            boolean z2 = false;
            try {
                long jNanoTime = 5000000000L;
                long jNanoTime2 = System.nanoTime() + 5000000000L;
                while (true) {
                    try {
                        try {
                            objT = zhcVar.t(jNanoTime, TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            jNanoTime = jNanoTime2 - System.nanoTime();
                            z2 = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                this.a = (BluetoothProfile) objT;
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        } catch (ExecutionException | TimeoutException e) {
            throw new IllegalStateException("Failure injection could not execute injection setHfpConnectedState", e);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        yph yphVar = kow.a;
        ((BluetoothManager) this.b.getSystemService(BluetoothManager.class)).getAdapter().closeProfileProxy(1, this.a);
    }
}
