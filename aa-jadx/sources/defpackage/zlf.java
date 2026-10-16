package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum zlf implements defpackage.abpb {
    UNKNOWN_CAMERA_SURFACE(0),
    LEGACY_CAMERA_SURFACE(1),
    SHARED_CAMERA_SURFACE(2),
    IGMM_CARPLAY_SURFACE(3),
    AGMM_PROJECTED_SURFACE(4),
    EGMM_SURFACE(5);

    private final int h;

    zlf(int i) {
        this.h = i;
    }

    public static defpackage.zlf b(int i) {
        if (i == 0) {
            return UNKNOWN_CAMERA_SURFACE;
        }
        if (i == 1) {
            return LEGACY_CAMERA_SURFACE;
        }
        if (i == 2) {
            return SHARED_CAMERA_SURFACE;
        }
        if (i == 3) {
            return IGMM_CARPLAY_SURFACE;
        }
        if (i == 4) {
            return AGMM_PROJECTED_SURFACE;
        }
        if (i != 5) {
            return null;
        }
        return EGMM_SURFACE;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
