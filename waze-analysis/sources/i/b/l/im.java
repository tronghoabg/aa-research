package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum im implements com.google.v.eg {
    MALE(1),
    FEMALE(2),
    OTHER(3),
    UNDEFINED(4);


    /* renamed from: f, reason: collision with root package name */
    private final int f48786f;

    im(int i2) {
        this.f48786f = i2;
    }

    public static im a(int i2) {
        if (i2 == 1) {
            return MALE;
        }
        if (i2 == 2) {
            return FEMALE;
        }
        if (i2 == 3) {
            return OTHER;
        }
        if (i2 != 4) {
            return null;
        }
        return UNDEFINED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48786f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48786f);
    }
}
