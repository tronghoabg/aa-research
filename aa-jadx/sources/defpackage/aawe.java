package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum aawe implements defpackage.abpb {
    UNKNOWN_SDK_MAP_VARIANT(0),
    VARIANT_ROADMAP(1),
    VARIANT_ROADMAP_DARK(2),
    VARIANT_NAVIGATION(3),
    VARIANT_NAVIGATION_LOW_LIGHT(4),
    VARIANT_TERRAIN(5),
    VARIANT_TERRAIN_DARK(6),
    VARIANT_ROADMAP_SATELLITE(7),
    VARIANT_NAVIGATION_AMBIENT(8),
    VARIANT_NAVIGATION_AMBIENT_DARK(9),
    VARIANT_TERRAIN_VECTOR_CLIENT(10),
    VARIANT_TERRAIN_VECTOR_CLIENT_DARK(11),
    VARIANT_TRANSIT(12),
    VARIANT_TRANSIT_DARK(13),
    VARIANT_PHOTOREALISTIC3D(14),
    VARIANT_ABSTRACT3D(15),
    VARIANT_ABSTRACT3D_DARK(16);

    private final int s;

    aawe(int i) {
        this.s = i;
    }

    public static defpackage.aawe b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SDK_MAP_VARIANT;
            case 1:
                return VARIANT_ROADMAP;
            case 2:
                return VARIANT_ROADMAP_DARK;
            case 3:
                return VARIANT_NAVIGATION;
            case 4:
                return VARIANT_NAVIGATION_LOW_LIGHT;
            case 5:
                return VARIANT_TERRAIN;
            case 6:
                return VARIANT_TERRAIN_DARK;
            case 7:
                return VARIANT_ROADMAP_SATELLITE;
            case 8:
                return VARIANT_NAVIGATION_AMBIENT;
            case 9:
                return VARIANT_NAVIGATION_AMBIENT_DARK;
            case 10:
                return VARIANT_TERRAIN_VECTOR_CLIENT;
            case 11:
                return VARIANT_TERRAIN_VECTOR_CLIENT_DARK;
            case 12:
                return VARIANT_TRANSIT;
            case 13:
                return VARIANT_TRANSIT_DARK;
            case 14:
                return VARIANT_PHOTOREALISTIC3D;
            case 15:
                return VARIANT_ABSTRACT3D;
            case 16:
                return VARIANT_ABSTRACT3D_DARK;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.s;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.s);
    }
}
