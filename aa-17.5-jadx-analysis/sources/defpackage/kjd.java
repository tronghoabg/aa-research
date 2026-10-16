package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.diagnostics.ConnectionState;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class kjd {
    public static final yph a = yph.c("GH.ICSEHandler");

    public static final CriticalError a() {
        final zhc zhcVar = new zhc();
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: kjc
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, rjb] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Collection] */
            @Override // java.lang.Runnable
            public final void run() {
                rjh rjhVar;
                ConnectionState connectionState;
                int i;
                zhc zhcVar2 = zhcVar;
                try {
                    mki.a.g();
                    boolean z = true;
                    try {
                        rjhVar = new rjh(Status.a, ols.m(kio.b().e()).a.a(), 1);
                    } catch (RemoteException e) {
                        rrd.b("CarDiagnosticsManager", e, "Error fetching connection state history");
                        Status status = Status.c;
                        int i2 = yfq.d;
                        rjhVar = new rjh(status, yls.a, 1);
                    }
                    Status status2 = rjhVar.a;
                    CriticalError criticalError = null;
                    if (status2.c()) {
                        if (status2.f != 0) {
                            z = false;
                        }
                        woy.Z(z);
                        Iterator<E> it = yfq.o(rjhVar.b).h().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                connectionState = null;
                                break;
                            }
                            connectionState = (ConnectionState) it.next();
                            if (connectionState.c != null && ((i = connectionState.b) == 4 || i == 3)) {
                                break;
                            }
                        }
                        if (connectionState == null) {
                            ((ype) ((ype) kjb.a.h()).ai((char) 3168)).u("Unable to find reason for last disconnect.");
                        } else {
                            criticalError = connectionState.c;
                        }
                    } else {
                        ((ype) ((ype) kjb.a.h()).ai((char) 3169)).u("Failed to fetch connection state history. Unable to log reason for last disconnect.");
                    }
                    zhcVar2.o(criticalError);
                } catch (Throwable th) {
                    zhcVar2.p(th);
                }
            }
        });
        try {
            return (CriticalError) zhcVar.t(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            return null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IllegalStateException) {
                throw ((IllegalStateException) cause);
            }
            return null;
        }
    }
}
