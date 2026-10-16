package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ozv implements java.lang.Runnable {
    private final /* synthetic */ int a;

    public /* synthetic */ ozv(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            defpackage.yqm yqmVar = defpackage.ozy.a;
            return;
        }
        if (i == 1) {
            defpackage.yqm yqmVar2 = defpackage.ozy.a;
            return;
        }
        if (i == 2) {
            com.google.android.apps.gmm.jni.util.NativeHelper.loadLibrary();
            return;
        }
        if (i == 4) {
            defpackage.ypg ypgVar = defpackage.pzs.a;
            return;
        }
        if (i == 5) {
            defpackage.ypg ypgVar2 = defpackage.pzs.a;
            defpackage.vbn.d();
            defpackage.psw.UI_THREAD.h();
            return;
        }
        if (i == 6) {
            defpackage.yqk yqkVar = defpackage.qrr.a;
            java.lang.System.loadLibrary("sslwrapper_jni");
            defpackage.qrr.b.countDown();
            return;
        }
        if (i == 16) {
            throw new java.lang.IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
        if (i == 18) {
            java.util.concurrent.ExecutorService executorService = defpackage.ztd.a;
            return;
        }
        if (i == 19) {
            int i2 = defpackage.zsq.b;
            defpackage.zsr.a = true;
            return;
        }
        switch (i) {
            case 10:
                try {
                    java.lang.Thread.sleep(600000L);
                    break;
                } catch (java.lang.InterruptedException e) {
                    java.lang.Thread.currentThread().interrupt();
                    synchronized (defpackage.sza.class) {
                        java.lang.Thread thread = defpackage.sza.b;
                        if (thread != null && thread.isAlive()) {
                            android.util.Log.e("AppDoctorRestartUtil", "Interrupted. Not restarting process", e);
                            return;
                        }
                    }
                }
                defpackage.sza.b();
                return;
            case 11:
                throw null;
            case 12:
                ((defpackage.ype) ((defpackage.ype) com.google.android.libraries.geo.mapcore.geoxp.jni.fetcher.NativeOfflineDiskCache.a.g()).ai((char) 9135)).u("Cannot handle tile fetch response from offline disk cache because the response handler is null");
                return;
            case 13:
                throw null;
            default:
                return;
        }
    }
}
