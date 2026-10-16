package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final /* synthetic */ class jmc implements defpackage.tfn, defpackage.affv {
    public static final defpackage.jmc a = new defpackage.jmc();

    @Override // defpackage.tfn
    public final /* synthetic */ java.lang.Object b(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService((java.lang.Class<java.lang.Object>) ep$.ExternalSyntheticApiModelOutline1.m$1());
        systemService.getClass();
        defpackage.jmn jmnVar = new defpackage.jmn(a$.ExternalSyntheticApiModelOutline1.m(systemService));
        aiuw aiuwVarC = ahoi.c();
        defpackage.rqt rqtVarA = defpackage.rqt.a(context);
        rqtVarA.getClass();
        java.util.concurrent.ExecutorService executorServiceNewCachedThreadPool = java.util.concurrent.Executors.newCachedThreadPool();
        executorServiceNewCachedThreadPool.getClass();
        return new defpackage.jml(context, jmnVar, aiuwVarC, rqtVarA, new defpackage.jmt(context, executorServiceNewCachedThreadPool, new defpackage.osc(), defpackage.jms.a), new defpackage.kof(context));
    }

    @Override // defpackage.affv
    public final defpackage.afan ed() {
        return new defpackage.affo(1, defpackage.jml.class, "<init>", "<init>(Landroid/content/Context;Lcom/google/android/apps/auto/carservice/companion/CompanionDeviceManagerWrapper;Lkotlinx/coroutines/CoroutineScope;Lcom/google/android/gms/car/log/CarTelemetryLogger;Lcom/google/android/apps/auto/carservice/companion/wireless/WirelessSetupStarter;Lcom/google/android/apps/auto/components/connectivity/broadcaster/WirelessConnectivityTelemetryBroadcaster;)V", 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof defpackage.tfn) && (obj instanceof defpackage.affv)) {
            return defpackage.afga.f(new defpackage.affo(1, defpackage.jml.class, "<init>", "<init>(Landroid/content/Context;Lcom/google/android/apps/auto/carservice/companion/CompanionDeviceManagerWrapper;Lkotlinx/coroutines/CoroutineScope;Lcom/google/android/gms/car/log/CarTelemetryLogger;Lcom/google/android/apps/auto/carservice/companion/wireless/WirelessSetupStarter;Lcom/google/android/apps/auto/components/connectivity/broadcaster/WirelessConnectivityTelemetryBroadcaster;)V", 0), ((defpackage.affv) obj).ed());
        }
        return false;
    }

    public final int hashCode() {
        return new defpackage.affo(1, defpackage.jml.class, "<init>", "<init>(Landroid/content/Context;Lcom/google/android/apps/auto/carservice/companion/CompanionDeviceManagerWrapper;Lkotlinx/coroutines/CoroutineScope;Lcom/google/android/gms/car/log/CarTelemetryLogger;Lcom/google/android/apps/auto/carservice/companion/wireless/WirelessSetupStarter;Lcom/google/android/apps/auto/components/connectivity/broadcaster/WirelessConnectivityTelemetryBroadcaster;)V", 0).hashCode();
    }
}
