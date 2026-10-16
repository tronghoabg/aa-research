package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class typ implements defpackage.xzi {
    private final /* synthetic */ int a;

    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        boolean zIsRunningInTestHarness = true;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return java.lang.Boolean.FALSE;
            case 1:
                return java.lang.Boolean.FALSE;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return java.lang.Boolean.FALSE;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Boolean.FALSE;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return java.lang.Boolean.FALSE;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Boolean.valueOf(zxp.f().e);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.FALSE;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.FALSE;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Boolean.FALSE;
            case 9:
                return java.lang.Boolean.valueOf(zxp.f().i);
            case 10:
                return java.lang.Boolean.FALSE;
            case 11:
                java.lang.System.setProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS", "false");
                return null;
            case 12:
                return "";
            case 13:
                defpackage.xzi xziVar = com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter.a;
                if (!android.app.ActivityManager.isUserAMonkey()) {
                    zIsRunningInTestHarness = android.os.Build.VERSION.SDK_INT < 29 ? android.app.ActivityManager.isRunningInTestHarness() : ep$.ExternalSyntheticApiModelOutline0.m$1();
                }
                return java.lang.Boolean.valueOf(zIsRunningInTestHarness);
            case 14:
                return new ajgz();
            case 15:
                android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
                try {
                    android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    android.util.Log.i("PhenotypeProcessReaper", "Memory state is: " + runningAppProcessInfo.importance);
                    zIsRunningInTestHarness = runningAppProcessInfo.importance >= 400;
                } catch (java.lang.RuntimeException e) {
                    android.util.Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                return java.lang.Boolean.valueOf(zIsRunningInTestHarness);
            case 16:
                defpackage.yqm yqmVar = xbl.a;
                return ((android.bluetooth.BluetoothManager) defpackage.mkp.a.c.getSystemService(android.bluetooth.BluetoothManager.class)).getAdapter();
            case 17:
                return null;
            case 18:
                java.util.logging.Logger logger = defpackage.admm.a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                try {
                    arrayList.add(java.lang.Class.forName("adyi"));
                    break;
                } catch (java.lang.ClassNotFoundException e2) {
                    defpackage.admm.a.logp(java.util.logging.Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (java.lang.Throwable) e2);
                }
                try {
                    arrayList.add(java.lang.Class.forName("aeez"));
                    break;
                } catch (java.lang.ClassNotFoundException e3) {
                    defpackage.admm.a.logp(java.util.logging.Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (java.lang.Throwable) e3);
                }
                return j$.util.DesugarCollections.unmodifiableList(arrayList);
            case 19:
                java.util.logging.Logger logger2 = admt.a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                try {
                    arrayList2.add(java.lang.Class.forName("aebv"));
                    break;
                } catch (java.lang.ClassNotFoundException e4) {
                    admt.a.logp(java.util.logging.Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find OkHttpChannelProvider", (java.lang.Throwable) e4);
                }
                try {
                    arrayList2.add(java.lang.Class.forName("io.grpc.netty.NettyChannelProvider"));
                    break;
                } catch (java.lang.ClassNotFoundException e5) {
                    admt.a.logp(java.util.logging.Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find NettyChannelProvider", (java.lang.Throwable) e5);
                }
                try {
                    arrayList2.add(java.lang.Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
                    break;
                } catch (java.lang.ClassNotFoundException e6) {
                    admt.a.logp(java.util.logging.Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find UdsNettyChannelProvider", (java.lang.Throwable) e6);
                }
                return j$.util.DesugarCollections.unmodifiableList(arrayList2);
            default:
                java.util.logging.Logger logger3 = defpackage.adnu.a;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                try {
                    arrayList3.add(java.lang.Class.forName("aduo"));
                    break;
                } catch (java.lang.ClassNotFoundException e7) {
                    defpackage.adnu.a.logp(java.util.logging.Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (java.lang.Throwable) e7);
                }
                try {
                    arrayList3.add(java.lang.Class.forName("adqr"));
                    break;
                } catch (java.lang.ClassNotFoundException e8) {
                    defpackage.adnu.a.logp(java.util.logging.Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find IntentNameResolverProvider", (java.lang.Throwable) e8);
                }
                return j$.util.DesugarCollections.unmodifiableList(arrayList3);
        }
    }
}
