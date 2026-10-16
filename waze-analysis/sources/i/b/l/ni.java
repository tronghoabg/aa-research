package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ni implements com.google.v.eg {
    STATUS_UNSPECIFIED(0),
    OK(1),
    ERROR(2),
    TIMED_OUT(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48914f;

    ni(int i2) {
        this.f48914f = i2;
    }

    public static ni a(int i2) {
        if (i2 == 0) {
            return STATUS_UNSPECIFIED;
        }
        if (i2 == 1) {
            return OK;
        }
        if (i2 == 2) {
            return ERROR;
        }
        if (i2 != 3) {
            return null;
        }
        return TIMED_OUT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48914f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48914f);
    }
}
