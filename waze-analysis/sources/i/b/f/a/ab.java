package i.b.f.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum ab implements eg {
    UNKNOWN(0),
    ACTIVE(1),
    INACTIVE(2),
    DELETED(3),
    REPLACED(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f48414g;

    ab(int i2) {
        this.f48414g = i2;
    }

    public static ab a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return ACTIVE;
        }
        if (i2 == 2) {
            return INACTIVE;
        }
        if (i2 == 3) {
            return DELETED;
        }
        if (i2 != 4) {
            return null;
        }
        return REPLACED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48414g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48414g);
    }
}
