package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aoy implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CLOSE(1),
    EDIT(2),
    PREVIEW(3),
    REMOVE(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f52911h;

    aoy(int i2) {
        this.f52911h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52911h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52911h);
    }
}
