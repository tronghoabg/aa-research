package i.b.u;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum i implements eg {
    EMAIL_TYPE_UNKNOWN(0),
    MAIN(1),
    WORK(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49319e;

    i(int i2) {
        this.f49319e = i2;
    }

    public static i a(int i2) {
        if (i2 == 0) {
            return EMAIL_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return MAIN;
        }
        if (i2 != 2) {
            return null;
        }
        return WORK;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49319e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49319e);
    }
}
