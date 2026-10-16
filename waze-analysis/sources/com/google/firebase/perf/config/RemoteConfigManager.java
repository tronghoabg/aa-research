package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import com.waze.authentication.au;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    private final ConcurrentHashMap<String, com.google.firebase.remoteconfig.g> allRcConfigMap;
    private final x cache;
    private final Executor executor;
    private com.google.firebase.remoteconfig.b firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private com.google.firebase.g.c<com.google.firebase.remoteconfig.i> firebaseRemoteConfigProvider;
    private final long rcmInitTimestamp;
    private final long remoteConfigFetchDelayInMs;
    private static final com.google.firebase.perf.c.a logger = com.google.firebase.perf.c.a.a();
    private static final RemoteConfigManager instance = new RemoteConfigManager();

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = 43200000L;
    }

    private RemoteConfigManager() {
        this(x.a(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, new Random().nextInt(25000) + 5000);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private com.google.firebase.remoteconfig.g getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        com.google.firebase.remoteconfig.g gVar = this.allRcConfigMap.get(str);
        if (gVar.b() != 2) {
            return null;
        }
        logger.c("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", gVar.d(), str);
        return gVar;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasLastFetchBecomeStale(long j2) {
        return j2 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean hasRemoteConfigFetchDelayElapsed(long j2) {
        return j2 - this.rcmInitTimestamp >= this.remoteConfigFetchDelayInMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.j("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasRemoteConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        com.google.android.gms.o.t tVarA = this.firebaseRemoteConfig.a();
        tVarA.q(this.executor, new com.google.firebase.messaging.n(this, 2));
        tVarA.p(this.executor, new au(this, 1));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.c());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public com.google.firebase.perf.e.f<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.b("The key to get Remote Config boolean value is null.");
            return com.google.firebase.perf.e.f.a();
        }
        com.google.firebase.remoteconfig.g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return com.google.firebase.perf.e.f.c(Boolean.valueOf(remoteConfigValue.e()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.d().isEmpty()) {
                    logger.c("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                }
            }
        }
        return com.google.firebase.perf.e.f.a();
    }

    protected long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public com.google.firebase.perf.e.f<Double> getDouble(String str) {
        if (str == null) {
            logger.b("The key to get Remote Config double value is null.");
            return com.google.firebase.perf.e.f.a();
        }
        com.google.firebase.remoteconfig.g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return com.google.firebase.perf.e.f.c(Double.valueOf(remoteConfigValue.a()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.d().isEmpty()) {
                    logger.c("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                }
            }
        }
        return com.google.firebase.perf.e.f.a();
    }

    public com.google.firebase.perf.e.f<Long> getLong(String str) {
        if (str == null) {
            logger.b("The key to get Remote Config long value is null.");
            return com.google.firebase.perf.e.f.a();
        }
        com.google.firebase.remoteconfig.g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return com.google.firebase.perf.e.f.c(Long.valueOf(remoteConfigValue.c()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.d().isEmpty()) {
                    logger.c("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                }
            }
        }
        return com.google.firebase.perf.e.f.a();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        com.google.firebase.remoteconfig.g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(remoteConfigValue.e());
                }
                if (t instanceof Double) {
                    return (T) Double.valueOf(remoteConfigValue.a());
                }
                if (!(t instanceof Long) && !(t instanceof Integer)) {
                    if (t instanceof String) {
                        return (T) remoteConfigValue.d();
                    }
                    T t2 = (T) remoteConfigValue.d();
                    try {
                        logger.c("No matching type found for the defaultValue: '%s', using String.", t);
                        return t2;
                    } catch (IllegalArgumentException unused) {
                        t = t2;
                        if (!remoteConfigValue.d().isEmpty()) {
                            logger.c("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                        }
                        return t;
                    }
                }
                return (T) Long.valueOf(remoteConfigValue.c());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t;
    }

    public com.google.firebase.perf.e.f<String> getString(String str) {
        if (str == null) {
            logger.b("The key to get Remote Config String value is null.");
            return com.google.firebase.perf.e.f.a();
        }
        com.google.firebase.remoteconfig.g remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? com.google.firebase.perf.e.f.c(remoteConfigValue.d()) : com.google.firebase.perf.e.f.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        com.google.firebase.g.c<com.google.firebase.remoteconfig.i> cVar;
        com.google.firebase.remoteconfig.i iVar;
        if (this.firebaseRemoteConfig == null && (cVar = this.firebaseRemoteConfigProvider) != null && (iVar = (com.google.firebase.remoteconfig.i) cVar.a()) != null) {
            this.firebaseRemoteConfig = iVar.a(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        com.google.firebase.remoteconfig.b bVar = this.firebaseRemoteConfig;
        return bVar == null || bVar.g().a() == 1 || this.firebaseRemoteConfig.g().a() == 2;
    }

    public void setFirebaseRemoteConfigProvider(com.google.firebase.g.c<com.google.firebase.remoteconfig.i> cVar) {
        this.firebaseRemoteConfigProvider = cVar;
    }

    protected void syncConfigValues(Map<String, com.google.firebase.remoteconfig.g> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        d.a();
        com.google.firebase.remoteconfig.g gVar = this.allRcConfigMap.get("fpr_experiment_app_start_ttid");
        if (gVar == null) {
            logger.b("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.k("com.google.firebase.perf.ExperimentTTID", gVar.e());
        } catch (Exception unused) {
            logger.b("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    RemoteConfigManager(x xVar, Executor executor, com.google.firebase.remoteconfig.b bVar, long j2) {
        ConcurrentHashMap<String, com.google.firebase.remoteconfig.g> concurrentHashMap;
        this.rcmInitTimestamp = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = xVar;
        this.executor = executor;
        this.firebaseRemoteConfig = bVar;
        if (bVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>((Map<? extends String, ? extends com.google.firebase.remoteconfig.g>) bVar.c());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.remoteConfigFetchDelayInMs = j2;
    }
}
