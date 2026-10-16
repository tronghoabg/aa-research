package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class prs {
    public static final defpackage.qcp a = new defpackage.qcp("ClientParametersUpdateRequestCount", defpackage.qcr.bX);
    public static final defpackage.qcs b = new defpackage.qcs("ClientParametersUpdateResult", defpackage.qcr.bX);
    public static final defpackage.qcp c = new defpackage.qcp("ClientParametersPhenotypeFetchFailedFallbackToGws", defpackage.qcr.bX);
    public static final defpackage.qct d;
    public static final defpackage.qct e;
    public static final defpackage.qct f;

    static {
        defpackage.qcr qcrVar = defpackage.qcr.bX;
        int i = defpackage.qch.a;
        d = new defpackage.qct("ClientParametersAgeBeforeUpdateMinutes", qcrVar, null);
        e = new defpackage.qct("ClientParametersUpdateSuccessTimeElapsedMs", defpackage.qcr.bX, null);
        f = new defpackage.qct("ClientParametersUpdateFailureTimeElapsedMs", defpackage.qcr.bX, null);
    }
}
