package defpackage;

/* loaded from: classes3.dex */
public enum acbp implements abnz {
    UNKNOWN_LOCATION_SHARING_STATE(0),
    NOT_SHARING(1),
    SHARING_BUT_NOT_REPORTING(2),
    SHARING_AND_REPORTING(3);

    public final int e;

    acbp(int i) {
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
