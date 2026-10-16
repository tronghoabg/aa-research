package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum acjp implements defpackage.abpb {
    DEFAULT_THUMBNAIL(0),
    HQ_THUMBNAIL(1),
    HQ_THUMBNAIL_REPROJECTED(2);

    private final int e;

    acjp(int i) {
        this.e = i;
    }

    public static defpackage.acjp b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
