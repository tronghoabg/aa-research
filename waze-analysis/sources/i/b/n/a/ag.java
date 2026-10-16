package i.b.n.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ag implements eg {
    UNKNOWN_ORIGIN(0),
    CLIENT(1),
    WME(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49108e;

    ag(int i2) {
        this.f49108e = i2;
    }

    public static ag a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ORIGIN;
        }
        if (i2 == 1) {
            return CLIENT;
        }
        if (i2 != 2) {
            return null;
        }
        return WME;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49108e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49108e);
    }
}
