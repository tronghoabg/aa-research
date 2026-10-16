package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum aceu implements defpackage.abpb {
    UNKNOWN_CAMERA_TYPE(0),
    CAMERA_3D(1),
    CAMERA_2D_NORTH_UP(2),
    CAMERA_2D_HEADING_UP(3);

    public final int e;

    aceu(int i) {
        this.e = i;
    }

    public static defpackage.aceu b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
