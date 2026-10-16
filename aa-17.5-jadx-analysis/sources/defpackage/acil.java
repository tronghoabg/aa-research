package defpackage;

/* loaded from: classes3.dex */
public enum acil implements abnz {
    UNKNOWN_SEARCH_FILTER(0),
    OUTDOOR(1);

    public final int c;

    acil(int i) {
        this.c = i;
    }

    public static acil b(int i) {
        if (i == 0) {
            return UNKNOWN_SEARCH_FILTER;
        }
        if (i != 1) {
            return null;
        }
        return OUTDOOR;
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
