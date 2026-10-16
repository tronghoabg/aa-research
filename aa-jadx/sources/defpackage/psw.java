package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public enum psw implements defpackage.vbq {
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
    BLOCKING_THREADPOOL("Blocking", 10, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, null),
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

    public static volatile defpackage.psu J;
    public static final java.lang.ThreadLocal K = new defpackage.pst();
    public final int L;
    public final java.lang.String M;
    public final defpackage.vlu N;
    private final int P;
    private final int Q;
    private final defpackage.psw R;

    psw(java.lang.String str, int i, int i2, int i3, defpackage.psw pswVar) {
        boolean z;
        this.L = i2;
        defpackage.lnt.A(str, null);
        this.M = str;
        this.N = new defpackage.vlu(str);
        this.P = i;
        this.Q = i3;
        this.R = pswVar;
        int i4 = i2 & 2;
        if (i4 == 0) {
            z = true;
        } else if (i3 == 1) {
            z = true;
            i3 = 1;
        } else {
            z = false;
        }
        defpackage.ysr.aX(z);
        defpackage.ysr.aX(pswVar == null || i3 != 0);
        defpackage.ysr.aX(pswVar == null || i4 == 0);
    }

    public static defpackage.psw c() {
        java.lang.Object objCurrentThread = java.lang.Thread.currentThread();
        if (objCurrentThread == android.os.Looper.getMainLooper().getThread()) {
            return UI_THREAD;
        }
        if (objCurrentThread instanceof defpackage.psv) {
            return ((defpackage.psv) objCurrentThread).a();
        }
        return null;
    }

    public static boolean e(defpackage.psw pswVar) {
        if (pswVar == CURRENT || pswVar == c()) {
            return true;
        }
        defpackage.psw pswVarD = pswVar.d();
        if (pswVarD == null || !e(pswVarD)) {
            return false;
        }
        java.util.Iterator it = ((java.util.List) K.get()).iterator();
        while (it.hasNext()) {
            if (pswVar == ((defpackage.psb) it.next()).e) {
                return true;
            }
        }
        return false;
    }

    static void g(defpackage.psb psbVar) {
        java.util.List list = (java.util.List) K.get();
        int size = list.size() - 1;
        defpackage.ysr.aX(psbVar == list.get(size));
        list.remove(size);
    }

    public final int a() {
        defpackage.psu psuVar = J;
        int i = this.Q;
        if (psuVar == null || i != 0) {
            return i;
        }
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return java.lang.Math.max(2, defpackage.pss.a - 2);
        }
        if (iOrdinal == 5) {
            return defpackage.pss.a <= 4 ? 1 : 3;
        }
        if (iOrdinal == 10) {
            return java.lang.Math.max(2, defpackage.pss.a - 2);
        }
        if (iOrdinal == 12) {
            return defpackage.pss.b;
        }
        if (iOrdinal == 30) {
            return java.lang.Math.min(defpackage.pss.a, true != ((defpackage.pss) psuVar).e ? 3 : 1);
        }
        throw new java.lang.IllegalArgumentException("CALCULATED not implemented for ".concat(toString()));
    }

    public final int b() {
        defpackage.psu psuVar = J;
        int i = this.P;
        if (psuVar == null || this != LOCATION_DISPATCHER) {
            return i;
        }
        int i2 = defpackage.pzg.a;
        return i;
    }

    public final defpackage.psw d() {
        defpackage.psu psuVar = J;
        defpackage.psw pswVar = this.R;
        if (psuVar != null) {
            if (this == GMM_STORAGE) {
                int i = defpackage.pzg.a;
            }
            if (this == NETWORK_THREADPOOL) {
                int i2 = defpackage.pzg.a;
            }
            if (this != PROTO_DATA_STORE) {
                return pswVar;
            }
            int i3 = defpackage.pzg.a;
        }
        return pswVar;
    }

    public final boolean f() {
        int i = this.Q;
        return i > 1 || i == 0;
    }

    public final void h() {
        if (e(this)) {
            return;
        }
        throw new java.lang.IllegalStateException("Should be running on " + toString() + ", but we're on " + java.lang.String.valueOf(c()) + " (Java Thread " + java.lang.String.valueOf(java.lang.Thread.currentThread()) + ")");
    }
}
