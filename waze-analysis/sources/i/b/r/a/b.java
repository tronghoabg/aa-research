package i.b.r.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum b implements eg {
    ALL_WEEK(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    ALL_WORK_DAYS(10);


    /* renamed from: k, reason: collision with root package name */
    private final int f49272k;

    b(int i2) {
        this.f49272k = i2;
    }

    public static b a(int i2) {
        if (i2 == 10) {
            return ALL_WORK_DAYS;
        }
        switch (i2) {
            case 0:
                return ALL_WEEK;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49272k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49272k);
    }
}
