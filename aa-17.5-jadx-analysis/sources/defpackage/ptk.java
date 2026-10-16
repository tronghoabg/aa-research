package defpackage;

import android.net.ConnectivityManager;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;

/* loaded from: classes2.dex */
public final class ptk {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/network/degradation/CellNetworkRequestingDegradationHandler");
    public final ConnectivityManager b;
    public final BooleanSupplier d;
    public long f;
    public final tmb g;
    public ConnectivityManager.NetworkCallback e = null;
    public final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor();

    public ptk(ConnectivityManager connectivityManager, BooleanSupplier booleanSupplier, tmb tmbVar) {
        this.b = connectivityManager;
        this.d = booleanSupplier;
        this.g = tmbVar;
    }

    public final void a() {
        long jA = this.f - this.g.a();
        this.c.schedule(new pru(this, 2), jA, TimeUnit.MILLISECONDS);
    }
}
