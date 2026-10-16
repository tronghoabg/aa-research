package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum abgw implements defpackage.abpb {
    MULTIZOOM_STYLE_TABLE(0),
    COMPACT_MULTIZOOM_STYLE_TABLE(1),
    COMPACT_MULTIZOOM_STYLE_TABLE_WITH_INLINING(2);

    public final int d;

    abgw(int i) {
        this.d = i;
    }

    public static defpackage.abgw b(int i) {
        if (i == 0) {
            return MULTIZOOM_STYLE_TABLE;
        }
        if (i == 1) {
            return COMPACT_MULTIZOOM_STYLE_TABLE;
        }
        if (i != 2) {
            return null;
        }
        return COMPACT_MULTIZOOM_STYLE_TABLE_WITH_INLINING;
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
