package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bcp implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CLOSE(1),
    DRIVE_THERE(2),
    EXIT_LIVE_DRIVE(3),
    RESUME_DRIVE(4),
    SHARE_DRIVE(5),
    SWIPE_DOWN(6),
    SWIPE_UP(7),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f53737k;

    bcp(int i2) {
        this.f53737k = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53737k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53737k);
    }
}
