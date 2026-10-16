package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum acga implements defpackage.abpb {
    UNKNOWN_RELEASE_LEVEL(0),
    DEV(100),
    FISHFOOD(200),
    DOGFOOD(300),
    PREVIEW(400),
    RELEASE(500);

    public final int g;

    acga(int i) {
        this.g = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
