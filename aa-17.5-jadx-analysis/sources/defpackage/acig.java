package defpackage;

/* loaded from: classes3.dex */
public enum acig implements abnz {
    OUTDOOR(0),
    INDOOR(1);

    private final int d;

    acig(int i) {
        this.d = i;
    }

    public static acig b(int i) {
        if (i == 0) {
            return OUTDOOR;
        }
        if (i != 1) {
            return null;
        }
        return INDOOR;
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
