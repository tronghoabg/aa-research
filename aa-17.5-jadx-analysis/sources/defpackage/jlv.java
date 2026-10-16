package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
final /* synthetic */ class jlv implements ter, afev {
    public static final jlv a = new jlv();

    @Override // defpackage.ter
    public final /* synthetic */ Object b(Context context) {
        Object systemService = context.getSystemService((Class<Object>) ep$$ExternalSyntheticApiModelOutline1.m304m$1());
        systemService.getClass();
        jmg jmgVar = new jmg(a$$ExternalSyntheticApiModelOutline0.m0m(systemService));
        aitx aitxVarC = ahni.c();
        rpz rpzVarA = rpz.a(context);
        rpzVarA.getClass();
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        executorServiceNewCachedThreadPool.getClass();
        return new jme(context, jmgVar, aitxVarC, rpzVarA, new jmm(context, executorServiceNewCachedThreadPool, new orf(), jml.a), new kny(context));
    }

    @Override // defpackage.afev
    public final aezn eV() {
        return new afeo(1, jme.class, "<init>", "<init>(Landroid/content/Context;Lcom/google/android/apps/auto/carservice/companion/CompanionDeviceManagerWrapper;Lkotlinx/coroutines/CoroutineScope;Lcom/google/android/gms/car/log/CarTelemetryLogger;Lcom/google/android/apps/auto/carservice/companion/wireless/WirelessSetupStarter;Lcom/google/android/apps/auto/components/connectivity/broadcaster/WirelessConnectivityTelemetryBroadcaster;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ter) && (obj instanceof afev)) {
            return affa.f(new afeo(1, jme.class, "<init>", "<init>(Landroid/content/Context;Lcom/google/android/apps/auto/carservice/companion/CompanionDeviceManagerWrapper;Lkotlinx/coroutines/CoroutineScope;Lcom/google/android/gms/car/log/CarTelemetryLogger;Lcom/google/android/apps/auto/carservice/companion/wireless/WirelessSetupStarter;Lcom/google/android/apps/auto/components/connectivity/broadcaster/WirelessConnectivityTelemetryBroadcaster;)V", 0), ((afev) obj).eV());
        }
        return false;
    }

    public final int hashCode() {
        return new afeo(1, jme.class, "<init>", "<init>(Landroid/content/Context;Lcom/google/android/apps/auto/carservice/companion/CompanionDeviceManagerWrapper;Lkotlinx/coroutines/CoroutineScope;Lcom/google/android/gms/car/log/CarTelemetryLogger;Lcom/google/android/apps/auto/carservice/companion/wireless/WirelessSetupStarter;Lcom/google/android/apps/auto/components/connectivity/broadcaster/WirelessConnectivityTelemetryBroadcaster;)V", 0).hashCode();
    }
}
