package defpackage;

import android.app.ActivityManager;
import android.bluetooth.BluetoothManager;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class txv implements xyc {
    private final /* synthetic */ int a;

    public /* synthetic */ txv(int i) {
        this.a = i;
    }

    @Override // defpackage.xyc
    public final Object gu() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return false;
            case 4:
                return Boolean.valueOf(zwm.f().e);
            case 5:
            case 6:
            case 7:
                return false;
            case 8:
                return Boolean.valueOf(zwm.f().i);
            case 9:
                return false;
            case 10:
                System.setProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS", "false");
                return null;
            case 11:
                return "";
            case 12:
                xyc xycVar = ClearcutMetricSnapshotTransmitter.a;
                return Boolean.valueOf(ActivityManager.isUserAMonkey() ? true : Build.VERSION.SDK_INT < 29 ? ActivityManager.isRunningInTestHarness() : ActivityManager.isRunningInUserTestHarness());
            case 13:
                return new ajga();
            case 14:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    Log.i("PhenotypeProcessReaper", "Memory state is: " + runningAppProcessInfo.importance);
                } catch (RuntimeException e) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                boolean z = runningAppProcessInfo.importance >= 400;
                return Boolean.valueOf(z);
            case 15:
                yph yphVar = xap.a;
                return ((BluetoothManager) mki.a.c.getSystemService(BluetoothManager.class)).getAdapter();
            case 16:
                return null;
            case 17:
                Logger logger = adll.a;
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("adxg"));
                } catch (ClassNotFoundException e2) {
                    adll.a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e2);
                }
                try {
                    arrayList.add(Class.forName("aedz"));
                } catch (ClassNotFoundException e3) {
                    adll.a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e3);
                }
                return DesugarCollections.unmodifiableList(arrayList);
            case 18:
                Logger logger2 = adls.a;
                ArrayList arrayList2 = new ArrayList();
                try {
                    arrayList2.add(Class.forName("aeav"));
                } catch (ClassNotFoundException e4) {
                    adls.a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find OkHttpChannelProvider", (Throwable) e4);
                }
                try {
                    arrayList2.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
                } catch (ClassNotFoundException e5) {
                    adls.a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find NettyChannelProvider", (Throwable) e5);
                }
                try {
                    arrayList2.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
                } catch (ClassNotFoundException e6) {
                    adls.a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find UdsNettyChannelProvider", (Throwable) e6);
                }
                return DesugarCollections.unmodifiableList(arrayList2);
            default:
                Logger logger3 = admt.a;
                ArrayList arrayList3 = new ArrayList();
                try {
                    arrayList3.add(Class.forName("adto"));
                } catch (ClassNotFoundException e7) {
                    admt.a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e7);
                }
                try {
                    arrayList3.add(Class.forName("adpr"));
                } catch (ClassNotFoundException e8) {
                    admt.a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find IntentNameResolverProvider", (Throwable) e8);
                }
                return DesugarCollections.unmodifiableList(arrayList3);
        }
    }
}
