package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum acf implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CONFIRM(1),
    CANCEL(2),
    BACK(3),
    MORE_DETAILS(4),
    CLOSE(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f52191i;

    acf(int i2) {
        this.f52191i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52191i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52191i);
    }
}
