package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum azr implements com.google.v.eg {
    SORT_FIELD_UNSPECIFIED(0),
    PRICE(1),
    BRAND(2),
    DISTANCE(3),
    BEST_MATCH(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f53503h;

    azr(int i2) {
        this.f53503h = i2;
    }

    public static azr a(int i2) {
        if (i2 == 0) {
            return SORT_FIELD_UNSPECIFIED;
        }
        if (i2 == 1) {
            return PRICE;
        }
        if (i2 == 2) {
            return BRAND;
        }
        if (i2 == 3) {
            return DISTANCE;
        }
        if (i2 != 4) {
            return null;
        }
        return BEST_MATCH;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53503h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53503h);
    }
}
