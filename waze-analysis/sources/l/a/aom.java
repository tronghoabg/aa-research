package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aom implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CANCEL(1),
    NEW_DRIVE(2),
    NEW_DRIVE_TIMEOUT(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52884g;

    aom(int i2) {
        this.f52884g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52884g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52884g);
    }
}
