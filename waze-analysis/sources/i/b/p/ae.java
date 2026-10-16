package i.b.p;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ae implements eg {
    UNKNOWN(0),
    TEXT(1),
    VOICE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49185e;

    ae(int i2) {
        this.f49185e = i2;
    }

    public static ae a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return TEXT;
        }
        if (i2 != 2) {
            return null;
        }
        return VOICE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49185e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49185e);
    }
}
