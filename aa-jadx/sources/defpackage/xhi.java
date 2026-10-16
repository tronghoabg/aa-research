package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xhi implements defpackage.abpb {
    METADATA_UNKNOWN(0),
    METADATA_COMPACT_UI(1),
    METADATA_PREFER_STATUS_BAR(2),
    UNRECOGNIZED(-1);

    private final int f;

    xhi(int i) {
        this.f = i;
    }

    public static defpackage.xhi b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.abpk.b() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
