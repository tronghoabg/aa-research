package defpackage;

import android.util.Log;
import com.google.android.apps.gmm.jni.util.NativeHelper;
import com.google.android.libraries.geo.mapcore.geoxp.jni.fetcher.NativeOfflineDiskCache;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class oyx implements Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ oyx(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.a) {
            case 0:
                yph yphVar = ozb.a;
                return;
            case 1:
                yph yphVar2 = ozb.a;
                return;
            case 2:
                NativeHelper.loadLibrary();
                return;
            case 3:
                yob yobVar = pyx.a;
                return;
            case 4:
                yob yobVar2 = pyx.a;
                vaq.d();
                psb.UI_THREAD.h();
                return;
            case 5:
                ypf ypfVar = qqv.a;
                System.loadLibrary("sslwrapper_jni");
                qqv.b.countDown();
                return;
            case 6:
            case 7:
            case 8:
            case 13:
            case 14:
            case 16:
            case 19:
                return;
            case 9:
                try {
                    Thread.sleep(Math.max(0L, 600000L));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    synchronized (syc.class) {
                        Thread thread = syc.b;
                        if (thread != null && thread.isAlive()) {
                            Log.e("AppDoctorRestartUtil", "Interrupted. Not restarting process", e);
                            return;
                        }
                    }
                }
                syc.b();
                return;
            case 10:
                throw null;
            case 11:
                ((ynz) ((ynz) NativeOfflineDiskCache.a.g()).ai((char) 9110)).u("Cannot handle tile fetch response from offline disk cache because the response handler is null");
                return;
            case 12:
                throw null;
            case 15:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
            case 17:
                ExecutorService executorService = zrz.a;
                return;
            case 18:
                int i = zrm.b;
                zrn.a = true;
                return;
            default:
                int i2 = aaev.k;
                return;
        }
    }
}
