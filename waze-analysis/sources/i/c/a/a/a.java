package i.c.a.a;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum a implements eg {
    UNKNOWN(0),
    SMALL(1),
    EXIT_ENTRY(2),
    REASSURANCE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f49571f;

    a(int i2) {
        this.f49571f = i2;
    }

    public static ei a() {
        return b.f49573b;
    }

    public static a b(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return SMALL;
        }
        if (i2 == 2) {
            return EXIT_ENTRY;
        }
        if (i2 != 3) {
            return null;
        }
        return REASSURANCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49571f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49571f);
    }
}
