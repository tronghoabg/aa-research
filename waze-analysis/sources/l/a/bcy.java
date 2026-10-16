package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bcy implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    SHARE_DRIVE(1),
    CANCEL(2),
    VIEW_DRIVE(3),
    CLOSE(4),
    EDIT(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f53753i;

    bcy(int i2) {
        this.f53753i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53753i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53753i);
    }
}
