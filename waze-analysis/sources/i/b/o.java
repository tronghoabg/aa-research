package i.b;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum o implements eg {
    UNKNOWN_CLIENT_API(0),
    TRANSPORT(1),
    AUDIO(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49175e;

    o(int i2) {
        this.f49175e = i2;
    }

    public static ei a() {
        return k.f48523e;
    }

    public static o b(int i2) {
        if (i2 == 0) {
            return UNKNOWN_CLIENT_API;
        }
        if (i2 == 1) {
            return TRANSPORT;
        }
        if (i2 != 2) {
            return null;
        }
        return AUDIO;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49175e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49175e);
    }
}
