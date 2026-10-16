package defpackage;

/* loaded from: classes3.dex */
public enum abft implements abnz {
    MULTIZOOM_STYLE_TABLE(0),
    COMPACT_MULTIZOOM_STYLE_TABLE(1),
    COMPACT_MULTIZOOM_STYLE_TABLE_WITH_INLINING(2);

    public final int d;

    abft(int i) {
        this.d = i;
    }

    public static abft b(int i) {
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

    @Override // defpackage.abnz
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
