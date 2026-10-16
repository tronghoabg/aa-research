package i.b.n.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum g implements eg {
    UNKNOWN_SESSION_BASED_GEOMETRY(0),
    CURRENT_COORDINATE(1),
    ALONG_ROUTE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49134e;

    g(int i2) {
        this.f49134e = i2;
    }

    public static g a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_SESSION_BASED_GEOMETRY;
        }
        if (i2 == 1) {
            return CURRENT_COORDINATE;
        }
        if (i2 != 2) {
            return null;
        }
        return ALONG_ROUTE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49134e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49134e);
    }
}
