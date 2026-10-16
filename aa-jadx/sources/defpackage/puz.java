package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class puz {
    public static final defpackage.qct a;
    public static final defpackage.qcs b;
    public static final defpackage.qcs c;
    public static final defpackage.qcs d;
    public static final defpackage.qcs e;
    public static final defpackage.qcs f;
    public static final defpackage.qcs g;
    public static final defpackage.qcs h;
    public static final defpackage.qcs i;

    static {
        defpackage.qcr qcrVar = defpackage.qcr.aF;
        int i2 = defpackage.qch.a;
        a = new defpackage.qct("TimeFromLastRequest", qcrVar, null);
        b = new defpackage.qcs("NetworkRequestFromSingleRequestCluster", defpackage.qcr.aF);
        c = new defpackage.qcs("PaintNetworkRequestFromSingleRequestCluster", defpackage.qcr.aF);
        d = new defpackage.qcs("PerformanceGetPlaceNetworkLatency", defpackage.qcr.aF);
        e = new defpackage.qcs("PerformanceGetPlaceNetworkSendDuration", defpackage.qcr.aF);
        f = new defpackage.qcs("PerformanceGetPlaceNetworkReceiveDuration", defpackage.qcr.aF);
        g = new defpackage.qcs("PerformanceGetPlacePreviewNetworkLatency", defpackage.qcr.aF);
        h = new defpackage.qcs("PerformanceGetPlacePreviewNetworkSendDuration", defpackage.qcr.aF);
        i = new defpackage.qcs("PerformanceGetPlacePreviewNetworkReceiveDuration", defpackage.qcr.aF);
    }
}
