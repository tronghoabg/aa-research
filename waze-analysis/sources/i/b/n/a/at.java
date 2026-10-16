package i.b.n.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum at implements eg {
    VENUE_SOURCE_UNSPECIFIED(0),
    WAZE(1),
    GOOGLE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49122e;

    at(int i2) {
        this.f49122e = i2;
    }

    public static at a(int i2) {
        if (i2 == 0) {
            return VENUE_SOURCE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return WAZE;
        }
        if (i2 != 2) {
            return null;
        }
        return GOOGLE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49122e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49122e);
    }
}
