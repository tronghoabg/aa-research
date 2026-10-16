package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum tr implements com.google.v.eg {
    DRIVE_RESUMED(1),
    TIME_COMPLETED(2),
    USER_CLOSED(3),
    USER_CLICKED(4);


    /* renamed from: f, reason: collision with root package name */
    private final int f49056f;

    tr(int i2) {
        this.f49056f = i2;
    }

    public static tr a(int i2) {
        if (i2 == 1) {
            return DRIVE_RESUMED;
        }
        if (i2 == 2) {
            return TIME_COMPLETED;
        }
        if (i2 == 3) {
            return USER_CLOSED;
        }
        if (i2 != 4) {
            return null;
        }
        return USER_CLICKED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49056f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49056f);
    }
}
