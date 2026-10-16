package defpackage;

/* loaded from: classes3.dex */
public enum acey implements abnz {
    UNKNOWN_RELEASE_LEVEL(0),
    DEV(100),
    FISHFOOD(200),
    DOGFOOD(300),
    PREVIEW(400),
    RELEASE(500);

    public final int g;

    acey(int i) {
        this.g = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
