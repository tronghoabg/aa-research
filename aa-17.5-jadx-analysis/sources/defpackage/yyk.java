package defpackage;

/* loaded from: classes.dex */
public enum yyk implements abnz {
    UNKNOWN_PROCESS_TYPE(0),
    PROJECTION(1),
    CAR(2),
    SHARED(3);

    public final int e;

    yyk(int i) {
        this.e = i;
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
