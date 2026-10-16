package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum iq implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    EXPAND_ETA_CLICKED(1),
    SEARCH_CLICKED(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54981f;

    iq(int i2) {
        this.f54981f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54981f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54981f);
    }
}
