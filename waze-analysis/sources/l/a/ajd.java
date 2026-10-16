package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ajd implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    BUTTON_EXPANDED(1),
    ZOOM_IN(2),
    ZOOM_OUT(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52566g;

    ajd(int i2) {
        this.f52566g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52566g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52566g);
    }
}
