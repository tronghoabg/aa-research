package i.b.f.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum bo implements eg {
    EVER(0),
    YEARS(1),
    MONTHS(2),
    WEEKS(3),
    DAYS(4),
    HOURS(5),
    MINUTES(6),
    SECONDS(7),
    MILLISECONDS(8);


    /* renamed from: k, reason: collision with root package name */
    private final int f48443k;

    bo(int i2) {
        this.f48443k = i2;
    }

    public static bo a(int i2) {
        switch (i2) {
            case 0:
                return EVER;
            case 1:
                return YEARS;
            case 2:
                return MONTHS;
            case 3:
                return WEEKS;
            case 4:
                return DAYS;
            case 5:
                return HOURS;
            case 6:
                return MINUTES;
            case 7:
                return SECONDS;
            case 8:
                return MILLISECONDS;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48443k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48443k);
    }
}
