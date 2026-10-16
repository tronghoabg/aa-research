package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum toq {
    TRAFFIC(defpackage.abho.UNKNOWN),
    BICYCLING(defpackage.abho.GMM_VECTOR_BICYCLING_OVERLAY),
    TRANSIT(defpackage.abho.GMM_TRANSIT),
    SATELLITE(defpackage.abho.GMM_SATELLITE),
    TERRAIN(defpackage.abho.GMM_TERRAIN),
    STREETVIEW(defpackage.abho.GMM_STREET_VIEW),
    THREE_DIMENSIONAL(defpackage.abho.GMM_BUILDING_3D),
    COVID19(defpackage.abho.GMM_COVID19),
    AIR_QUALITY(defpackage.abho.GMM_AIR_QUALITY),
    AIR_QUALITY_HEATMAP(defpackage.abho.GMM_AIR_QUALITY_HEATMAP),
    WILDFIRES(defpackage.abho.GMM_CRISIS_WILDFIRES),
    UNKNOWN(defpackage.abho.UNKNOWN);

    private final defpackage.abho n;

    static {
        defpackage.yhx.q(defpackage.abho.GMM_VECTOR_TRAFFIC_V2, defpackage.abho.GMM_TRAFFIC_CAR, defpackage.abho.GMM_TRAFFIC_CAR_JAPAN);
    }

    toq(defpackage.abho abhoVar) {
        this.n = abhoVar;
    }

    public final defpackage.abho a(boolean z) {
        return (z && this == TERRAIN) ? defpackage.abho.GMM_TERRAIN_DARK : this.n;
    }
}
