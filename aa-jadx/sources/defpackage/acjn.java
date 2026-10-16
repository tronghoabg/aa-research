package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum acjn implements defpackage.abpb {
    UNKNOWN_SEARCH_FILTER(0),
    OUTDOOR(1);

    public final int c;

    acjn(int i) {
        this.c = i;
    }

    public static defpackage.acjn b(int i) {
        if (i == 0) {
            return UNKNOWN_SEARCH_FILTER;
        }
        if (i != 1) {
            return null;
        }
        return OUTDOOR;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.c);
    }
}
