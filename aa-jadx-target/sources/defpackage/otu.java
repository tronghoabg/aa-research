package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum otu implements defpackage.abpb {
    LIVE_INACTIVE(0),
    LIVE_ACTIVE(1),
    LIVE_UNAVAILABLE(2),
    LIVE_HOLD(3),
    UNRECOGNIZED(-1);

    private final int g;

    otu(int i) {
        this.g = i;
    }

    public static defpackage.otu b(int i) {
        if (i == 0) {
            return LIVE_INACTIVE;
        }
        if (i == 1) {
            return LIVE_ACTIVE;
        }
        if (i == 2) {
            return LIVE_UNAVAILABLE;
        }
        if (i != 3) {
            return null;
        }
        return LIVE_HOLD;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.abpk.b() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
