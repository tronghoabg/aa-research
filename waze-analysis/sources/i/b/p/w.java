package i.b.p;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum w implements eg {
    UNKNOWN(0),
    FACEBOOK(1),
    SHARE_LOCATION(2),
    CARPOOL_PICKUP(5),
    CARPOOL_DROPOFF(6),
    SHARE_DRIVE(3),
    CALENDAR(4),
    FUTURE_DRIVE(7),
    SHARE_DRIVE_EXPIRED(8);


    /* renamed from: k, reason: collision with root package name */
    private final int f49230k;

    w(int i2) {
        this.f49230k = i2;
    }

    public static w a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return FACEBOOK;
            case 2:
                return SHARE_LOCATION;
            case 3:
                return SHARE_DRIVE;
            case 4:
                return CALENDAR;
            case 5:
                return CARPOOL_PICKUP;
            case 6:
                return CARPOOL_DROPOFF;
            case 7:
                return FUTURE_DRIVE;
            case 8:
                return SHARE_DRIVE_EXPIRED;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49230k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49230k);
    }
}
