package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum qg implements com.google.v.eg {
    DESTINATION_CARD_SCREEN_CONTEXT_UNSPECIFIED(0),
    START_STATE_DESTINATION_CARD(1),
    SEARCH_MENU_DESTINATION_CARD(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55288f;

    qg(int i2) {
        this.f55288f = i2;
    }

    public static qg a(int i2) {
        if (i2 == 0) {
            return DESTINATION_CARD_SCREEN_CONTEXT_UNSPECIFIED;
        }
        if (i2 == 1) {
            return START_STATE_DESTINATION_CARD;
        }
        if (i2 != 2) {
            return null;
        }
        return SEARCH_MENU_DESTINATION_CARD;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55288f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55288f);
    }
}
