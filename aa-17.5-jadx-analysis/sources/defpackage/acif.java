package defpackage;

/* loaded from: classes3.dex */
public enum acif implements abnz {
    SPHERICAL(3),
    CUBIC(4);

    private final int d;

    acif(int i) {
        this.d = i;
    }

    public static acif b(int i) {
        if (i == 3) {
            return SPHERICAL;
        }
        if (i != 4) {
            return null;
        }
        return CUBIC;
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
