package i.b.q;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum q implements eg {
    UNKNOWN(0),
    PREDICTION(1),
    PLANNED_FUTURE_DRIVE(2),
    PLANNED_CARPOOL_DRIVE(3),
    PLANNED_CALENDAR_DRIVE(4),
    PLANNED_FACEBOOK_DRIVE(5),
    ETA_CHECK(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f49261i;

    q(int i2) {
        this.f49261i = i2;
    }

    public static q a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return PREDICTION;
            case 2:
                return PLANNED_FUTURE_DRIVE;
            case 3:
                return PLANNED_CARPOOL_DRIVE;
            case 4:
                return PLANNED_CALENDAR_DRIVE;
            case 5:
                return PLANNED_FACEBOOK_DRIVE;
            case 6:
                return ETA_CHECK;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49261i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49261i);
    }
}
