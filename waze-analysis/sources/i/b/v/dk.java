package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum dk implements com.google.v.eg {
    SECONDARY_OPEN_HOURS_UNSPECIFIED(0),
    DRIVE_THROUGH(1),
    DELIVERY(2),
    TAKEOUT(3),
    PICKUP(4),
    ACCESS(5),
    SENIOR_HOURS(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f49477i;

    dk(int i2) {
        this.f49477i = i2;
    }

    public static dk a(int i2) {
        switch (i2) {
            case 0:
                return SECONDARY_OPEN_HOURS_UNSPECIFIED;
            case 1:
                return DRIVE_THROUGH;
            case 2:
                return DELIVERY;
            case 3:
                return TAKEOUT;
            case 4:
                return PICKUP;
            case 5:
                return ACCESS;
            case 6:
                return SENIOR_HOURS;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49477i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49477i);
    }
}
