package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum amv implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    AGREE(1),
    CANCEL(2),
    URL_CLICKED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52771g;

    amv(int i2) {
        this.f52771g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52771g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52771g);
    }
}
