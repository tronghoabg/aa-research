package i.b.i;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum q implements eg {
    ACCOUNT(0),
    DEVICE(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f48494d;

    q(int i2) {
        this.f48494d = i2;
    }

    public static q a(int i2) {
        if (i2 == 0) {
            return ACCOUNT;
        }
        if (i2 != 1) {
            return null;
        }
        return DEVICE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48494d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48494d);
    }
}
