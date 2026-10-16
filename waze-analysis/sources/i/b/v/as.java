package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum as implements com.google.v.eg {
    SOURCE_UNSPECIFIED(0),
    WME(1),
    GEO(2),
    ECO_MOVEMENT(3),
    SOURCE_OTHER(101);


    /* renamed from: g, reason: collision with root package name */
    private final int f49389g;

    as(int i2) {
        this.f49389g = i2;
    }

    public static as a(int i2) {
        if (i2 == 0) {
            return SOURCE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return WME;
        }
        if (i2 == 2) {
            return GEO;
        }
        if (i2 == 3) {
            return ECO_MOVEMENT;
        }
        if (i2 != 101) {
            return null;
        }
        return SOURCE_OTHER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49389g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49389g);
    }
}
