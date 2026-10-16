package defpackage;

/* loaded from: classes3.dex */
public enum yvo implements abnz {
    UNKNOWN_SDK_MAP_VARIANT(0),
    VARIANT_ROADMAP(1),
    VARIANT_ROADMAP_DARK(2),
    VARIANT_NAVIGATION(3),
    VARIANT_NAVIGATION_LOW_LIGHT(4),
    VARIANT_TERRAIN(5),
    VARIANT_TERRAIN_DARK(6),
    VARIANT_HYBRID(7),
    VARIANT_TRANSIT(8),
    VARIANT_TRANSIT_DARK(9);

    public final int k;

    yvo(int i) {
        this.k = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
