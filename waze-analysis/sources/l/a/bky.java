package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bky implements com.google.v.eg {
    SOURCE_UNSPECIFIED(0),
    AAOS_ADDRESS_PREVIEW(1),
    AAOS_SEARCH(2),
    ADD_HOME_WORK(3),
    ADS_0SPEED(4),
    ADS_PIN_POPUP(5),
    AUTOCOMPLETE_PERSONAL_PLACE(6),
    CAR_PLAY(7),
    DEEP_LINK(8),
    FAVORITES(9),
    HISTORY(10),
    LEFT_MENU(11),
    LEFT_MENU_OPTIONS_ROUTES(12),
    PIN_ON_MAP(13),
    PLACE_PREVIEW(14),
    PLANNED_DRIVE(15),
    SEARCH_EMPTY_STATE(16),
    SEARCH_ZERO_STATE(17),
    START_STATE(18),
    VOICE_ACTIVATION(19),
    TRANSPORT_SDK(20),
    ADS_ARROW(21),
    SUGGESTION_CARD(22),
    SHARE_DRIVE(23),
    UNRECOGNIZED(-1);

    private final int A;

    bky(int i2) {
        this.A = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.A;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.A);
    }
}
