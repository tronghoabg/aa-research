package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bq implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    BACK(1),
    CLOSE(2),
    DATE_PICKER(3),
    OK(4),
    LEARN_MORE_LINK(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f54513i;

    bq(int i2) {
        this.f54513i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54513i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54513i);
    }
}
