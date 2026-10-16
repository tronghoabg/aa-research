package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bjz implements com.google.v.eg {
    TRIGGERING_PLATFORM_UNSPECIFIED(0),
    MOBILE_IOS(1),
    MOBILE_ANDROID(2),
    CARPLAY(3),
    AAP(4),
    AAOS(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f54116i;

    bjz(int i2) {
        this.f54116i = i2;
    }

    public static bjz a(int i2) {
        if (i2 == 0) {
            return TRIGGERING_PLATFORM_UNSPECIFIED;
        }
        if (i2 == 1) {
            return MOBILE_IOS;
        }
        if (i2 == 2) {
            return MOBILE_ANDROID;
        }
        if (i2 == 3) {
            return CARPLAY;
        }
        if (i2 == 4) {
            return AAP;
        }
        if (i2 != 5) {
            return null;
        }
        return AAOS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54116i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54116i);
    }
}
