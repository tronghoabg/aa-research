package defpackage;

/* loaded from: classes3.dex */
public enum xgh implements abnz {
    METADATA_UNKNOWN(0),
    METADATA_COMPACT_UI(1),
    METADATA_PREFER_STATUS_BAR(2),
    UNRECOGNIZED(-1);

    private final int f;

    xgh(int i) {
        this.f = i;
    }

    public static xgh b(int i) {
        if (i == 0) {
            return METADATA_UNKNOWN;
        }
        if (i == 1) {
            return METADATA_COMPACT_UI;
        }
        if (i != 2) {
            return null;
        }
        return METADATA_PREFER_STATUS_BAR;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this == UNRECOGNIZED ? aboi.b() : this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
