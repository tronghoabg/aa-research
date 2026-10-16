package i.b.p;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum s implements eg {
    UNKNOWN(0),
    BLOCKED(1),
    RECOMMEND_UPDATE(2),
    VALID(3),
    ERROR(4),
    BLOCKED_LOW_RESOLUTION(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f49219h;

    s(int i2) {
        this.f49219h = i2;
    }

    public static ei a() {
        return b.f49190e;
    }

    public static s b(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return BLOCKED;
        }
        if (i2 == 2) {
            return RECOMMEND_UPDATE;
        }
        if (i2 == 3) {
            return VALID;
        }
        if (i2 == 4) {
            return ERROR;
        }
        if (i2 != 5) {
            return null;
        }
        return BLOCKED_LOW_RESOLUTION;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49219h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49219h);
    }
}
