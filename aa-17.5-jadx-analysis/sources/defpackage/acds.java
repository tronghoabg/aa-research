package defpackage;

/* loaded from: classes3.dex */
public enum acds implements abnz {
    UNKNOWN_CAMERA_TYPE(0),
    CAMERA_3D(1),
    CAMERA_2D_NORTH_UP(2),
    CAMERA_2D_HEADING_UP(3);

    public final int e;

    acds(int i) {
        this.e = i;
    }

    public static acds b(int i) {
        if (i == 0) {
            return UNKNOWN_CAMERA_TYPE;
        }
        if (i == 1) {
            return CAMERA_3D;
        }
        if (i == 2) {
            return CAMERA_2D_NORTH_UP;
        }
        if (i != 3) {
            return null;
        }
        return CAMERA_2D_HEADING_UP;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
