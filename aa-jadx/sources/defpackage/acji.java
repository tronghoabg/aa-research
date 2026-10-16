package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum acji implements defpackage.abpb {
    OUTDOOR(0),
    INDOOR(1);

    private final int d;

    acji(int i) {
        this.d = i;
    }

    public static defpackage.acji b(int i) {
        if (i == 0) {
            return OUTDOOR;
        }
        if (i != 1) {
            return null;
        }
        return INDOOR;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
