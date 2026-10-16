package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class tmt {
    private static final String[] c = {"COLLECTION_BASIS_VERIFIER"};
    public static boolean a = false;
    public static final Object b = new Object();

    public static void a(tml tmlVar, vw vwVar) {
        final ExecutorService threadPoolExecutor;
        Context context = tmlVar.a;
        final suq suqVar = new suq(context);
        String strValueOf = String.valueOf(context.getPackageName());
        if (vwVar.a == null) {
            try {
                vwVar.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                vwVar.a = -1;
            }
        }
        final String strConcat = "com.google.android.libraries.consentverifier#".concat(strValueOf);
        svz svzVarI = suqVar.i(strConcat, ((Integer) vwVar.a).intValue(), c);
        if (tmo.i(tmlVar.a)) {
            spu spuVar = ssr.a;
            threadPoolExecutor = spu.aF(10);
        } else {
            RejectedExecutionHandler rejectedExecutionHandler = tmw.a;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
            zhe zheVar = new zhe();
            zheVar.d("ConsentVerifierLibraryThread-%d");
            threadPoolExecutor = new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, linkedBlockingQueue, zhe.b(zheVar), tmw.a);
        }
        try {
            svzVarI.l(threadPoolExecutor, new svv() { // from class: tms
                @Override // defpackage.svv
                public final void e(Object obj) {
                    boolean z = tmt.a;
                    suq suqVar2 = suqVar;
                    String str = strConcat;
                    suqVar2.f(str).k(threadPoolExecutor, new tgz(str, 5));
                }
            });
            svzVarI.k(threadPoolExecutor, new tgz(strConcat, 4));
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", strConcat, e));
        }
    }
}
