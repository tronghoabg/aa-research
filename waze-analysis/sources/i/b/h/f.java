package i.b.h;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum f implements eg {
    UNKNOWN(0),
    REGULAR(1),
    CONTROL_GROUP(2),
    INVISIBLE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48482f;

    f(int i2) {
        this.f48482f = i2;
    }

    public static f a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return REGULAR;
        }
        if (i2 == 2) {
            return CONTROL_GROUP;
        }
        if (i2 != 3) {
            return null;
        }
        return INVISIBLE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48482f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48482f);
    }
}
