package i.b.k;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum n implements eg {
    UNKNOWN(0),
    NONE(1),
    ALERT(2),
    ANSWER(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48553f;

    n(int i2) {
        this.f48553f = i2;
    }

    public static n a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return NONE;
        }
        if (i2 == 2) {
            return ALERT;
        }
        if (i2 != 3) {
            return null;
        }
        return ANSWER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48553f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48553f);
    }
}
