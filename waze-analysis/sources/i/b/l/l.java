package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum l implements com.google.v.eg {
    SHARED_DRIVE_STATUS_UNKNOWN(0),
    SHARED_DRIVE_STATUS_NOT_STARTED(1),
    SHARED_DRIVE_STATUS_DRIVING(2),
    SHARED_DRIVE_STATUS_ARRIVED(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48826f;

    l(int i2) {
        this.f48826f = i2;
    }

    public static l a(int i2) {
        if (i2 == 0) {
            return SHARED_DRIVE_STATUS_UNKNOWN;
        }
        if (i2 == 1) {
            return SHARED_DRIVE_STATUS_NOT_STARTED;
        }
        if (i2 == 2) {
            return SHARED_DRIVE_STATUS_DRIVING;
        }
        if (i2 != 3) {
            return null;
        }
        return SHARED_DRIVE_STATUS_ARRIVED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48826f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48826f);
    }
}
