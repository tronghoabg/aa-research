package i.b.p;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum c implements eg {
    UNDEF(0),
    AS_IS(1),
    CODE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49198e;

    c(int i2) {
        this.f49198e = i2;
    }

    public static ei a() {
        return b.f49186a;
    }

    public static c b(int i2) {
        if (i2 == 0) {
            return UNDEF;
        }
        if (i2 == 1) {
            return AS_IS;
        }
        if (i2 != 2) {
            return null;
        }
        return CODE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49198e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49198e);
    }
}
