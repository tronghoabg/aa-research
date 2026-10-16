package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum akm implements com.google.v.eg {
    MOTION_UNSPECIFIED(0),
    STATIONARY(1),
    WALKING(2),
    RUNNING(3),
    AUTOMOTIVE(4),
    CYCLING(5),
    UNKNOWN(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f52617j;

    akm(int i2) {
        this.f52617j = i2;
    }

    public static akm a(int i2) {
        switch (i2) {
            case 0:
                return MOTION_UNSPECIFIED;
            case 1:
                return STATIONARY;
            case 2:
                return WALKING;
            case 3:
                return RUNNING;
            case 4:
                return AUTOMOTIVE;
            case 5:
                return CYCLING;
            case 6:
                return UNKNOWN;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52617j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52617j);
    }
}
