package i.b.e;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum k implements eg {
    UNKNOWN(0),
    HOME(1),
    WORK(2),
    OTHER(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48406f;

    k(int i2) {
        this.f48406f = i2;
    }

    public static ei a() {
        return j.f48400a;
    }

    public static k b(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return HOME;
        }
        if (i2 == 2) {
            return WORK;
        }
        if (i2 != 3) {
            return null;
        }
        return OTHER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48406f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48406f);
    }
}
