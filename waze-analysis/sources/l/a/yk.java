package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum yk implements com.google.v.eg {
    GENDER_UNSPECIFIED(0),
    GENDER_MALE(1),
    GENDER_FEMALE(2),
    GENDER_OTHER(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f55671g;

    yk(int i2) {
        this.f55671g = i2;
    }

    public static yk a(int i2) {
        if (i2 == 0) {
            return GENDER_UNSPECIFIED;
        }
        if (i2 == 1) {
            return GENDER_MALE;
        }
        if (i2 == 2) {
            return GENDER_FEMALE;
        }
        if (i2 != 3) {
            return null;
        }
        return GENDER_OTHER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55671g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55671g);
    }
}
