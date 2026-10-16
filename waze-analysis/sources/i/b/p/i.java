package i.b.p;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum i implements eg {
    WAZE(1),
    CARPOOL(2),
    ADS(3),
    RIDER(4),
    WEB(5);


    /* renamed from: g, reason: collision with root package name */
    private final int f49211g;

    i(int i2) {
        this.f49211g = i2;
    }

    public static i a(int i2) {
        if (i2 == 1) {
            return WAZE;
        }
        if (i2 == 2) {
            return CARPOOL;
        }
        if (i2 == 3) {
            return ADS;
        }
        if (i2 == 4) {
            return RIDER;
        }
        if (i2 != 5) {
            return null;
        }
        return WEB;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49211g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49211g);
    }
}
