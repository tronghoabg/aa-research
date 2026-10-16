package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kjj {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ICSEHandler");

    public static final com.google.android.gms.car.diagnostics.CriticalError a() {
        final defpackage.zif zifVar = new defpackage.zif();
        java.util.concurrent.Executors.newSingleThreadExecutor().execute(new java.lang.Runnable() { // from class: kji
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, rjx] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Collection] */
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.rkd rkdVar;
                com.google.android.gms.car.diagnostics.ConnectionState connectionState;
                int i;
                defpackage.zif zifVar2 = zifVar;
                try {
                    defpackage.mkp.a.g();
                    boolean z = true;
                    try {
                        rkdVar = new defpackage.rkd(com.google.android.gms.common.api.Status.a, defpackage.oml.m(defpackage.kit.b().e()).a.a(), 1);
                    } catch (android.os.RemoteException e) {
                        defpackage.rrx.b("CarDiagnosticsManager", e, "Error fetching connection state history");
                        com.google.android.gms.common.api.Status status = com.google.android.gms.common.api.Status.c;
                        int i2 = defpackage.ygw.d;
                        rkdVar = new defpackage.rkd(status, defpackage.ymx.a, 1);
                    }
                    com.google.android.gms.common.api.Status status2 = rkdVar.a;
                    com.google.android.gms.car.diagnostics.CriticalError criticalError = null;
                    if (status2.c()) {
                        if (status2.f != 0) {
                            z = false;
                        }
                        defpackage.ysr.bj(z);
                        java.util.Iterator<E> it = defpackage.ygw.o(rkdVar.b).h().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                connectionState = null;
                                break;
                            }
                            connectionState = (com.google.android.gms.car.diagnostics.ConnectionState) it.next();
                            if (connectionState.c != null && ((i = connectionState.b) == 4 || i == 3)) {
                                break;
                                break;
                            }
                        }
                        if (connectionState == null) {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.kjh.a.h()).ai((char) 3172)).u("Unable to find reason for last disconnect.");
                        } else {
                            criticalError = connectionState.c;
                        }
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.kjh.a.h()).ai((char) 3173)).u("Failed to fetch connection state history. Unable to log reason for last disconnect.");
                    }
                    zifVar2.o(criticalError);
                } catch (java.lang.Throwable th) {
                    zifVar2.p(th);
                }
            }
        });
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
