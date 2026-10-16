package i.b.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum o implements eg {
    ENABLED(1),
    DISABLED(2),
    TYPED(3),
    SELECTED_OPTION(4);


    /* renamed from: f, reason: collision with root package name */
    private final int f48354f;

    o(int i2) {
        this.f48354f = i2;
    }

    public static o a(int i2) {
        if (i2 == 1) {
            return ENABLED;
        }
        if (i2 == 2) {
            return DISABLED;
        }
        if (i2 == 3) {
            return TYPED;
        }
        if (i2 != 4) {
            return null;
        }
        return SELECTED_OPTION;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48354f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48354f);
    }
}
