package i.b.n;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum b implements eg {
    UNKNOWN(0),
    GOOGLE(1),
    VENUES(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49151e;

    b(int i2) {
        this.f49151e = i2;
    }

    public static b a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return GOOGLE;
        }
        if (i2 != 2) {
            return null;
        }
        return VENUES;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49151e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49151e);
    }
}
