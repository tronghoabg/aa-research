package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aue implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    EDIT(1),
    WRONG(2),
    NEW(3),
    OBSOLETE(4),
    SPEED(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f53191i;

    aue(int i2) {
        this.f53191i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53191i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53191i);
    }
}
