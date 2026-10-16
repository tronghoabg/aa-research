package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum yo implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ADD_STOP(1),
    INFO(2),
    WHY_THIS_AD(3),
    NEW_DRIVE(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f55689h;

    yo(int i2) {
        this.f55689h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55689h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55689h);
    }
}
