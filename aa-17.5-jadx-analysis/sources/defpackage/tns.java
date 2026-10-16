package defpackage;

/* loaded from: classes3.dex */
public enum tns {
    TRAFFIC(abgl.UNKNOWN),
    BICYCLING(abgl.GMM_VECTOR_BICYCLING_OVERLAY),
    TRANSIT(abgl.GMM_TRANSIT),
    SATELLITE(abgl.GMM_SATELLITE),
    TERRAIN(abgl.GMM_TERRAIN),
    STREETVIEW(abgl.GMM_STREET_VIEW),
    THREE_DIMENSIONAL(abgl.GMM_BUILDING_3D),
    COVID19(abgl.GMM_COVID19),
    AIR_QUALITY(abgl.GMM_AIR_QUALITY),
    AIR_QUALITY_HEATMAP(abgl.GMM_AIR_QUALITY_HEATMAP),
    WILDFIRES(abgl.GMM_CRISIS_WILDFIRES),
    UNKNOWN(abgl.UNKNOWN);

    private final abgl n;

    static {
        ygr.q(abgl.GMM_VECTOR_TRAFFIC_V2, abgl.GMM_TRAFFIC_CAR, abgl.GMM_TRAFFIC_CAR_JAPAN);
    }

    tns(abgl abglVar) {
        this.n = abglVar;
    }

    public final abgl a(boolean z) {
        return (z && this == TERRAIN) ? abgl.GMM_TERRAIN_DARK : this.n;
    }
}
