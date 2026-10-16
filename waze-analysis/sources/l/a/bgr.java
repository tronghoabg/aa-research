package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bgr implements com.google.v.eg {
    DESTINATION_TYPE_UNSPECIFIED(0),
    HOME(1),
    WORK(2),
    FAVORITE(3),
    RECENT(4),
    NEW_DESTINATION(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f53949i;

    bgr(int i2) {
        this.f53949i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53949i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53949i);
    }
}
