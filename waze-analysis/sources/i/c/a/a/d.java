package i.c.a.a;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum d implements eg {
    UNKNOWN(0),
    BEST(1),
    NATURAL(2),
    FREQUENT(3),
    CURRENT(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f49596g;

    d(int i2) {
        this.f49596g = i2;
    }

    public static ei a() {
        return b.f49574c;
    }

    public static d b(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return BEST;
        }
        if (i2 == 2) {
            return NATURAL;
        }
        if (i2 == 3) {
            return FREQUENT;
        }
        if (i2 != 4) {
            return null;
        }
        return CURRENT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49596g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49596g);
    }
}
