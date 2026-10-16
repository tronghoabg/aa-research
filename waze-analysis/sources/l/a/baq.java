package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum baq implements com.google.v.eg {
    QUALITY_OF_SERVICE_UNSPECIFIED(0),
    USER_AWAITED(1),
    USER_VISIBLE(2),
    DATA_FETCH(3),
    DATA_SEND(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f53626h;

    baq(int i2) {
        this.f53626h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53626h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53626h);
    }
}
