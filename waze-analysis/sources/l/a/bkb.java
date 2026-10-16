package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bkb implements com.google.v.eg {
    ACTION_SOURCE_UNSPECIFIED(0),
    CARD(1),
    MAP(2),
    SCREEN_HEADER(3),
    CONTEXTUAL_HEADER(4),
    CARPLAY_CARD(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f54147i;

    bkb(int i2) {
        this.f54147i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54147i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54147i);
    }
}
