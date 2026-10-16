package i.b.p;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum a implements eg {
    OK(0),
    EXPIRED(1),
    NEEDS_REFRESH(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49180e;

    a(int i2) {
        this.f49180e = i2;
    }

    public static ei a() {
        return b.f49187b;
    }

    public static a b(int i2) {
        if (i2 == 0) {
            return OK;
        }
        if (i2 == 1) {
            return EXPIRED;
        }
        if (i2 != 2) {
            return null;
        }
        return NEEDS_REFRESH;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49180e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49180e);
    }
}
