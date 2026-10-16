package i.b.n.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum aq implements eg {
    RESULT_TYPE_UNSPECIFIED(0),
    ADDRESS(1),
    POI(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49117e;

    aq(int i2) {
        this.f49117e = i2;
    }

    public static aq a(int i2) {
        if (i2 == 0) {
            return RESULT_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return ADDRESS;
        }
        if (i2 != 2) {
            return null;
        }
        return POI;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49117e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49117e);
    }
}
