package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ee implements com.google.v.eg {
    FORMAT_UNSPECIFIED(0),
    USER_PROFILE(1),
    LOGIN_ENCOURAGEMENT(2),
    GET_MEETINGS(3),
    CONSENT(4),
    POINTS(6);


    /* renamed from: h, reason: collision with root package name */
    private final int f48689h;

    ee(int i2) {
        this.f48689h = i2;
    }

    public static ee a(int i2) {
        if (i2 == 0) {
            return FORMAT_UNSPECIFIED;
        }
        if (i2 == 1) {
            return USER_PROFILE;
        }
        if (i2 == 2) {
            return LOGIN_ENCOURAGEMENT;
        }
        if (i2 == 3) {
            return GET_MEETINGS;
        }
        if (i2 == 4) {
            return CONSENT;
        }
        if (i2 != 6) {
            return null;
        }
        return POINTS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48689h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48689h);
    }
}
