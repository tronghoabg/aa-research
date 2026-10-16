package defpackage;

/* loaded from: classes2.dex */
public final class pqx {
    public static final qbz a;
    public static final qbr b;
    public static final qbu c;
    public static final qbu d;
    public static final qbu e;
    public static final qbv f;
    public static final qbv g;
    public static final qbu h;
    public static final qbu i;
    public static final qbv j;
    public static final qbv k;
    public static final qbv l;
    public static final qbv m;
    public static final qbv n;
    public static final qbq o;
    public static final qbu p;
    public static final qbq q;

    static {
        qbt qbtVar = qbt.aM;
        int i2 = qbj.a;
        a = new qbz("ClientParametersFetchTime", qbtVar, null);
        b = new qbr("ServerResetSignalTriggeredCpRefetchCount", qbt.aM);
        c = new qbu("ClientParametersOobResponseStatusCount", qbt.aM);
        d = new qbu("ClientParametersInitialLoadCount", qbt.aM);
        e = new qbu("ClientParametersForegroundInitialLoadCount", qbt.aM);
        f = new qbv("ClientParametersLoadsFromDiskTimeMillis", qbt.aM, null);
        g = new qbv("UiThreadBlockedForClientParametersTimeMillis", qbt.aM, null);
        h = new qbu("ClientParametersLoadsFromDisk", qbt.aM);
        i = new qbu("ClientParametersForegroundLoadsFromDisk", qbt.aM);
        j = new qbv("ClientParametersCacheAgeMinutes", qbt.aM, null);
        k = new qbv("ClientParametersForegroundLoadAvailableDiskSpaceMb", qbt.aM, null);
        l = new qbv("ClientParametersForegroundLoadTotalDiskSpaceMb", qbt.aM, null);
        m = new qbv("ClientParametersForegroundLoadNoFileAvailableDiskSpaceMb", qbt.aM, null);
        n = new qbv("ClientParametersForegroundLoadNoFileTotalDiskSpaceMb", qbt.aM, null);
        new qbz("ClientParametersPrefetchTime", qbt.aM, null);
        new qbu("ClientParametersPrefetchStatus", qbt.aM);
        new qbu("ClientParametersPrefetchCacheStatus", qbt.aM);
        o = new qbq("PhenotypeHeterodyneGwsHeterodyneTokensPresent", qbt.aM);
        p = new qbu("GwsClientParametersUpdateReason", qbt.aM);
        q = new qbq("ServerResetSignalClientParametersIsOutdated", qbt.aM);
        new qbr("PhenotypeClientParametersPrefetchFallbackCount", qbt.aM);
    }
}
