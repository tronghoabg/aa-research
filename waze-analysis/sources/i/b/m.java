package i.b;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum m implements eg {
    UNKNOWN_APP_FLAVOR(0),
    RELEASE(1),
    FISHFOOD(2),
    DOGFOOD(3),
    PRE_BETA(4),
    ALPHA(5),
    DEV(6),
    ONEOFF(7),
    BETA(8);


    /* renamed from: k, reason: collision with root package name */
    private final int f49074k;

    m(int i2) {
        this.f49074k = i2;
    }

    public static ei a() {
        return k.f48521c;
    }

    public static m b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_APP_FLAVOR;
            case 1:
                return RELEASE;
            case 2:
                return FISHFOOD;
            case 3:
                return DOGFOOD;
            case 4:
                return PRE_BETA;
            case 5:
                return ALPHA;
            case 6:
                return DEV;
            case 7:
                return ONEOFF;
            case 8:
                return BETA;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49074k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49074k);
    }
}
