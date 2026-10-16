package defpackage;

/* loaded from: classes3.dex */
public enum ujo implements abnz {
    DEFAULT(0),
    DRAW_OVER_LABELS(1),
    DRAW_OVER_LABELS_AND_CALLOUTS(2),
    DRAW_OVER_BUILDINGS(3),
    MAGIC_CARPET(5);

    public static final aboa f = new ujn(0);
    private final int h;

    ujo(int i) {
        this.h = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
