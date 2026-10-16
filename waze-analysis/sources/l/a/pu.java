package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum pu implements com.google.v.eg {
    CARD_SOURCE_UNSPECIFIED(0),
    SERVER(1),
    CLIENT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55241f;

    pu(int i2) {
        this.f55241f = i2;
    }

    public static pu a(int i2) {
        if (i2 == 0) {
            return CARD_SOURCE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return SERVER;
        }
        if (i2 != 2) {
            return null;
        }
        return CLIENT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55241f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55241f);
    }
}
