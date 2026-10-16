package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bit implements com.google.v.eg {
    TOLL_TYPE_UNSPECIFIED(0),
    TOLL_TYPE_FIXED(1),
    TOLL_TYPE_DYNAMIC(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54044f;

    bit(int i2) {
        this.f54044f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54044f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54044f);
    }
}
