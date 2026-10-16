package i.b.p;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum h implements eg {
    UNKNOWN(0),
    PHONE(1),
    PIN(2),
    FRIENDS(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f49204f;

    h(int i2) {
        this.f49204f = i2;
    }

    public static h a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return PHONE;
        }
        if (i2 == 2) {
            return PIN;
        }
        if (i2 != 3) {
            return null;
        }
        return FRIENDS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49204f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49204f);
    }
}
