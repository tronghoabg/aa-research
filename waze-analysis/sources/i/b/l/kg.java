package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum kg implements com.google.v.eg {
    SUCCESS(0),
    INTERNAL_ERROR(1),
    INVALID_TOKEN(2),
    DISABLED(3),
    NOT_FOUND(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f48820g;

    kg(int i2) {
        this.f48820g = i2;
    }

    public static kg a(int i2) {
        if (i2 == 0) {
            return SUCCESS;
        }
        if (i2 == 1) {
            return INTERNAL_ERROR;
        }
        if (i2 == 2) {
            return INVALID_TOKEN;
        }
        if (i2 == 3) {
            return DISABLED;
        }
        if (i2 != 4) {
            return null;
        }
        return NOT_FOUND;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48820g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48820g);
    }
}
