package defpackage;

/* loaded from: classes2.dex */
public final class pqw {
    public static final qbr a = new qbr("ClientParametersUpdateRequestCount", qbt.bX);
    public static final qbu b = new qbu("ClientParametersUpdateResult", qbt.bX);
    public static final qbr c = new qbr("ClientParametersPhenotypeFetchFailedFallbackToGws", qbt.bX);
    public static final qbv d;
    public static final qbv e;
    public static final qbv f;

    static {
        qbt qbtVar = qbt.bX;
        int i = qbj.a;
        d = new qbv("ClientParametersAgeBeforeUpdateMinutes", qbtVar, null);
        e = new qbv("ClientParametersUpdateSuccessTimeElapsedMs", qbt.bX, null);
        f = new qbv("ClientParametersUpdateFailureTimeElapsedMs", qbt.bX, null);
    }
}
