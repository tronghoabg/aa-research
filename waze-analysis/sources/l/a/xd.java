package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum xd implements com.google.v.eg {
    FORCE_UPGRADE_MESSAGE_TYPE_UNSPECIFIED(0),
    FORCE_UPGRADE_MESSAGE_TYPE_OS_NOT_SUPPORTED(1),
    FORCE_UPGRADE_MESSAGE_TYPE_VERSION_UPGRADE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55623f;

    xd(int i2) {
        this.f55623f = i2;
    }

    public static xd a(int i2) {
        if (i2 == 0) {
            return FORCE_UPGRADE_MESSAGE_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return FORCE_UPGRADE_MESSAGE_TYPE_OS_NOT_SUPPORTED;
        }
        if (i2 != 2) {
            return null;
        }
        return FORCE_UPGRADE_MESSAGE_TYPE_VERSION_UPGRADE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55623f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55623f);
    }
}
