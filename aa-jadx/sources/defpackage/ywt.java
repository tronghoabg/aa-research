package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ywt implements defpackage.abpb {
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

    ywt(int i) {
        this.k = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.k);
    }
}
