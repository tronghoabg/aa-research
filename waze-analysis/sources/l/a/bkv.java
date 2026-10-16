package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bkv implements com.google.v.eg {
    INFORMATION_TYPE_UNSPECIFIED(0),
    EVENT(1),
    CLOSURE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54197f;

    bkv(int i2) {
        this.f54197f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54197f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54197f);
    }
}
