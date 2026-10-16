package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ou implements com.google.v.eg {
    NO_NAV_TYPE(0),
    TRIP(1),
    CALENDAR(2),
    FACEBOOK_MEETING(3),
    PICKUP(4),
    CARPOOL(5),
    FUTURE_DRIVE(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f48946i;

    ou(int i2) {
        this.f48946i = i2;
    }

    public static ou a(int i2) {
        switch (i2) {
            case 0:
                return NO_NAV_TYPE;
            case 1:
                return TRIP;
            case 2:
                return CALENDAR;
            case 3:
                return FACEBOOK_MEETING;
            case 4:
                return PICKUP;
            case 5:
                return CARPOOL;
            case 6:
                return FUTURE_DRIVE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48946i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48946i);
    }
}
