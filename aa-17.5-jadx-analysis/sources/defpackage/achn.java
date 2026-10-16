package defpackage;

/* loaded from: classes3.dex */
public enum achn implements abnz {
    PNG(0),
    GIF(1),
    JPEG(2),
    CJPEG(3);

    public final int e;

    achn(int i) {
        this.e = i;
    }

    public static achn b(int i) {
        if (i == 0) {
            return PNG;
        }
        if (i == 1) {
            return GIF;
        }
        if (i == 2) {
            return JPEG;
        }
        if (i != 3) {
            return null;
        }
        return CJPEG;
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
