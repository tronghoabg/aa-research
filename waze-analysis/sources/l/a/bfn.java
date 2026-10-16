package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bfn implements com.google.v.eg {
    SOURCE_UNSPECIFIED(0),
    AUTOCOMPLETE_PERSONAL_PLACE(1),
    DEEP_LINK(2),
    FAVORITE(3),
    HISTORY(4),
    LEFT_MENU(5),
    PIN_ON_MAP(7),
    PLACE_PREVIEW(8),
    PLANNED_DRIVE(9),
    SEARCH_EMPTY_STATE(10),
    START_STATE(11),
    VOICE_ACTIVATION(12),
    SUGGESTION_CARD(13),
    SHARE_DRIVE(14),
    UNRECOGNIZED(-1);

    private final int q;

    bfn(int i2) {
        this.q = i2;
    }

    public static bfn a(int i2) {
        switch (i2) {
            case 0:
                return SOURCE_UNSPECIFIED;
            case 1:
                return AUTOCOMPLETE_PERSONAL_PLACE;
            case 2:
                return DEEP_LINK;
            case 3:
                return FAVORITE;
            case 4:
                return HISTORY;
            case 5:
                return LEFT_MENU;
            case 6:
            default:
                return null;
            case 7:
                return PIN_ON_MAP;
            case 8:
                return PLACE_PREVIEW;
            case 9:
                return PLANNED_DRIVE;
            case 10:
                return SEARCH_EMPTY_STATE;
            case 11:
                return START_STATE;
            case 12:
                return VOICE_ACTIVATION;
            case 13:
                return SUGGESTION_CARD;
            case 14:
                return SHARE_DRIVE;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
