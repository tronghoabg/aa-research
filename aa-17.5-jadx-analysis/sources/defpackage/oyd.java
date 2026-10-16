package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class oyd implements Executor {
    private final /* synthetic */ int a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            yph yphVar = WifiBluetoothReceiver.a;
            new Handler(Looper.getMainLooper()).post(runnable);
        } else if (i == 1) {
            runnable.run();
        } else if (i != 2) {
            runnable.run();
        } else {
            runnable.run();
        }
    }
}
