package defpackage;

@Deprecated
/* loaded from: classes3.dex */
public enum abln implements abnz {
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

    abln(int i) {
        this.l = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
