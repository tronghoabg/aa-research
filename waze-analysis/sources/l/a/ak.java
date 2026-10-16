package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ak implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ADD_STOP(1),
    ADD_STOP_TIMEOUT(2),
    CANCEL(3),
    NEW_DRIVE(4),
    NEW_DRIVE_TIMEOUT(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f52587i;

    ak(int i2) {
        this.f52587i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52587i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52587i);
    }
}
