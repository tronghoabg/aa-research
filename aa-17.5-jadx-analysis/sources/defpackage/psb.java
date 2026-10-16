package defpackage;

import android.os.Looper;
import androidx.car.app.model.Alert;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public enum psb implements vat {
    UI_THREAD("main", 0, 2, 1, null),
    LIGHTWEIGHT_THREADPOOL("Lite", 0, 0, 0, null),
    GMM_PICKER("Picker", 0, 0, 3, null),
    SCHEDULER("Scheduler", 0, 0, 1, null),
    LABELING_THREAD("Labeling", 1, 0, 1, null),
    TILE_PREP_THREADPOOL("TilePrep", 1, 0, 0, null),
    LOCATION_FRESHNESS_WAITING_THREADPOOL("LocFresh", 2, 0, 2, null),
    NETWORK_THREADPOOL("Network", 2, 0, 5, null),
    LOCATION_SENSORS("Sensors", 2, 2, 1, null),
    LOCATION_DISPATCHER("Location", 4, 0, 1, null),
    MID_PRIORITY_THREADPOOL("MidPri", 4, 0, 0, null),
    SUGGEST_CALLBACK_THREAD("SuggestCallback", 4, 0, 1, null),
    BACKGROUND_THREADPOOL("Background", 10, 0, 0, null),
    BLOCKING_THREADPOOL("Blocking", 10, 0, Alert.DURATION_SHOW_INDEFINITELY, null),
    DOWNLOADER_THREADPOOL("Download", 10, 0, 3, null),
    NAVIGATION_INTERNAL("NavInternal", 10, 0, 1, null),
    NAV_STATE_THREAD("NavState", 10, 0, 1, null),
    LOCATION_TILE_PREP("LocTilePrep", 4, 0, 1, MID_PRIORITY_THREADPOOL),
    NETWORK_TTS_SYNTHESIS("NetworkTTS", 10, 8, 1, null),
    OFFLINE_DYNAMIC_THREAD("OfflineDynamic", 10, 0, 1, null),
    OFFLINE_REGION_MANAGEMENT("OfflineManage", 10, 0, 1, null),
    OFFLINE_REGION_PROCESSING_THREADPOOL("OfflinePr", 10, 0, 2, null),
    PREWARM_GMM_ACTIVITY("PrewarmActivity", 10, 0, 1, null),
    ROAD_GRAPH_TILE_PREP_THREADPOOL("RoadGraph", 10, 0, 1, null),
    GMM_STORAGE("Storage", 10, 0, 1, null),
    PROTO_DATA_STORE("ProtoDataStore", 10, 0, 16, BACKGROUND_THREADPOOL),
    WEARABLE_DATA("WearableData", 10, 0, 1, BACKGROUND_THREADPOOL),
    MEMORY_MONITOR("MemoryMon", 13, 0, 1, BACKGROUND_THREADPOOL),
    NETWORK_MONITOR("NetworkMon", 16, 0, 1, BACKGROUND_THREADPOOL),
    BATTERY_MONITOR("BatteryMon", 16, 0, 1, BACKGROUND_THREADPOOL),
    LOW_PRIORITY_BACKGROUND_THREADPOOL("LowPri", 15, 0, 0, null),
    NATIVE_LIBRARY_LOADER("NativeLibLoader", 19, 0, 1, null),
    NATIVE_LIBRARY_LOADER_HIGH("NativeLoaderHi", 0, 0, 1, null),
    CURRENT("Current", -1, 0, 1, null),
    DANGEROUS_PUBLISHER_THREAD("Unspecified", -1, 0, 1, null);

    public static volatile prz J;
    public static final ThreadLocal K = new pry();
    public final int L;
    public final String M;
    public final vky N;
    private final int P;
    private final int Q;
    private final psb R;

    psb(String str, int i, int i2, int i3, psb psbVar) {
        boolean z;
        this.L = i2;
        lws.L(str, null);
        this.M = str;
        this.N = new vky(str);
        this.P = i;
        this.Q = i3;
        this.R = psbVar;
        int i4 = i2 & 2;
        if (i4 == 0) {
            z = true;
        } else if (i3 == 1) {
            z = true;
            i3 = 1;
        } else {
            z = false;
        }
        woy.N(z);
        woy.N(psbVar == null || i3 != 0);
        woy.N(psbVar == null || i4 == 0);
    }

    public static psb c() {
        Object objCurrentThread = Thread.currentThread();
        if (objCurrentThread == Looper.getMainLooper().getThread()) {
            return UI_THREAD;
        }
        if (objCurrentThread instanceof psa) {
            return ((psa) objCurrentThread).a();
        }
        return null;
    }

    public static boolean e(psb psbVar) {
        if (psbVar == CURRENT || psbVar == c()) {
            return true;
        }
        psb psbVarD = psbVar.d();
        if (psbVarD == null || !e(psbVarD)) {
            return false;
        }
        Iterator it = ((List) K.get()).iterator();
        while (it.hasNext()) {
            if (psbVar == ((prf) it.next()).e) {
                return true;
            }
        }
        return false;
    }

    static void g(prf prfVar) {
        List list = (List) K.get();
        int size = list.size() - 1;
        woy.N(prfVar == list.get(size));
        list.remove(size);
    }

    public final int a() {
        prz przVar = J;
        int i = this.Q;
        if (przVar == null || i != 0) {
            return i;
        }
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return Math.max(2, prx.a - 2);
        }
        if (iOrdinal == 5) {
            return prx.a <= 4 ? 1 : 3;
        }
        if (iOrdinal == 10) {
            return Math.max(2, prx.a - 2);
        }
        if (iOrdinal == 12) {
            return prx.b;
        }
        if (iOrdinal == 30) {
            return Math.min(prx.a, true != ((prx) przVar).e ? 3 : 1);
        }
        throw new IllegalArgumentException("CALCULATED not implemented for ".concat(toString()));
    }

    public final int b() {
        prz przVar = J;
        int i = this.P;
        if (przVar == null || this != LOCATION_DISPATCHER) {
            return i;
        }
        int i2 = pyl.a;
        return i;
    }

    public final psb d() {
        prz przVar = J;
        psb psbVar = this.R;
        if (przVar != null) {
            if (this == GMM_STORAGE) {
                int i = pyl.a;
            }
            if (this == NETWORK_THREADPOOL) {
                int i2 = pyl.a;
            }
            if (this != PROTO_DATA_STORE) {
                return psbVar;
            }
            int i3 = pyl.a;
        }
        return psbVar;
    }

    public final boolean f() {
        int i = this.Q;
        return i > 1 || i == 0;
    }

    public final void h() {
        if (e(this)) {
            return;
        }
        throw new IllegalStateException("Should be running on " + toString() + ", but we're on " + String.valueOf(c()) + " (Java Thread " + String.valueOf(Thread.currentThread()) + ")");
    }
}
