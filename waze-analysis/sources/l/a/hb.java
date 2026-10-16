package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum hb implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    BANNER_CLICKED(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f54941e;

    hb(int i2) {
        this.f54941e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54941e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54941e);
    }
}
