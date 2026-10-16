package defpackage;

/* loaded from: classes3.dex */
public enum acib implements abnz {
    GOOGLE(1),
    IMMERSIVE(2);

    private final int d;

    acib(int i) {
        this.d = i;
    }

    public static acib b(int i) {
        if (i == 1) {
            return GOOGLE;
        }
        if (i != 2) {
            return null;
        }
        return IMMERSIVE;
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
