package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ukj implements defpackage.abpb {
    DEFAULT(0),
    DRAW_OVER_LABELS(1),
    DRAW_OVER_LABELS_AND_CALLOUTS(2),
    DRAW_OVER_BUILDINGS(3),
    MAGIC_CARPET(5);

    public static final defpackage.abpc f = new defpackage.uki(0);
    private final int h;

    ukj(int i) {
        this.h = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
