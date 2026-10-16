package defpackage;

/* loaded from: classes3.dex */
public enum acin implements abnz {
    DEFAULT_THUMBNAIL(0),
    HQ_THUMBNAIL(1),
    HQ_THUMBNAIL_REPROJECTED(2);

    private final int e;

    acin(int i) {
        this.e = i;
    }

    public static acin b(int i) {
        if (i == 0) {
            return DEFAULT_THUMBNAIL;
        }
        if (i == 1) {
            return HQ_THUMBNAIL;
        }
        if (i != 2) {
            return null;
        }
        return HQ_THUMBNAIL_REPROJECTED;
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
