package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public enum abmq implements defpackage.abpb {
    DRIVE(0),
    BICYCLE(1),
    WALK(2),
    TRANSIT(3),
    FLY(4),
    TWO_WHEELER(9),
    MIXED(6),
    TAXI(8),
    BIKESHARING(11),
    TAXICAB(10);

    private final int l;

    abmq(int i) {
        this.l = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.l);
    }
}
