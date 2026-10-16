package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum acip implements defpackage.abpb {
    PNG(0),
    GIF(1),
    JPEG(2),
    CJPEG(3);

    public final int e;

    acip(int i) {
        this.e = i;
    }

    public static defpackage.acip b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
