package i.b.b.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum h implements eg {
    CONFIDENCE_LEVEL_UNDEFINED(0),
    LOW(1),
    MEDIUM(2),
    HIGH(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48376f;

    h(int i2) {
        this.f48376f = i2;
    }

    public static h a(int i2) {
        if (i2 == 0) {
            return CONFIDENCE_LEVEL_UNDEFINED;
        }
        if (i2 == 1) {
            return LOW;
        }
        if (i2 == 2) {
            return MEDIUM;
        }
        if (i2 != 3) {
            return null;
        }
        return HIGH;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48376f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48376f);
    }
}
