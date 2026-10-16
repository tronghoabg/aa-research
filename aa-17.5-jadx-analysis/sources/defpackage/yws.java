package defpackage;

/* loaded from: classes.dex */
public enum yws implements abnz {
    POOL_UNSPECIFIED(0),
    POOL_AUDIO(1),
    POOL_VIDEO(2);

    public final int d;

    yws(int i) {
        this.d = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
