package i.b.b.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum j implements eg {
    MOTION_TYPE_UNSPECIFIED(0),
    AUTOMOTIVE(1),
    STATIONARY(2),
    WALKING(3),
    RUNNING(4),
    CYCLING(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f48387h;

    j(int i2) {
        this.f48387h = i2;
    }

    public static j a(int i2) {
        if (i2 == 0) {
            return MOTION_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return AUTOMOTIVE;
        }
        if (i2 == 2) {
            return STATIONARY;
        }
        if (i2 == 3) {
            return WALKING;
        }
        if (i2 == 4) {
            return RUNNING;
        }
        if (i2 != 5) {
            return null;
        }
        return CYCLING;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48387h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48387h);
    }
}
