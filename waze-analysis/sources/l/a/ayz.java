package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ayz implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    VOICE_SEARCH(1),
    CATEGORY(2),
    BACK(3),
    DESTINATION_CARD(4),
    MAIN_MENU(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f53471i;

    ayz(int i2) {
        this.f53471i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53471i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53471i);
    }
}
