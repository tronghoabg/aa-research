package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum biv implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CLOSED(1),
    URL_ACTION_CLICKED(2),
    HELP_URL_CLICKED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54051g;

    biv(int i2) {
        this.f54051g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54051g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54051g);
    }
}
