package defpackage;

/* loaded from: classes3.dex */
public enum acik implements abnz {
    SPHERICAL(3),
    CUBIC(4);

    public final int c;

    acik(int i) {
        this.c = i;
    }

    public static acik b(int i) {
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
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
