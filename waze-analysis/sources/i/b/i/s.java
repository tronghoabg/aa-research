package i.b.i;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum s implements eg {
    USER_PREFERENCES(1),
    SERVER_CONFIG(2);


    /* renamed from: d, reason: collision with root package name */
    private final int f48501d;

    s(int i2) {
        this.f48501d = i2;
    }

    public static s a(int i2) {
        if (i2 == 1) {
            return USER_PREFERENCES;
        }
        if (i2 != 2) {
            return null;
        }
        return SERVER_CONFIG;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48501d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48501d);
    }
}
