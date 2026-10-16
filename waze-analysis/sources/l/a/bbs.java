package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bbs implements com.google.v.eg {
    SETTING_ACTION_UNSPECIFIED(0),
    SETTING_ACTION_SCREEN_SHOWN(1),
    SETTING_ACTION_BACK_BUTTON_CLICKED(2),
    SETTING_ACTION_SETTING_CHANGED(3),
    SETTING_ACTION_BUTTON_CLICKED(4),
    SETTING_ACTION_SCREEN_CLOSED(5),
    SETTING_ACTION_SETTINGS_SAVED(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f53683j;

    bbs(int i2) {
        this.f53683j = i2;
    }

    public static bbs a(int i2) {
        switch (i2) {
            case 0:
                return SETTING_ACTION_UNSPECIFIED;
            case 1:
                return SETTING_ACTION_SCREEN_SHOWN;
            case 2:
                return SETTING_ACTION_BACK_BUTTON_CLICKED;
            case 3:
                return SETTING_ACTION_SETTING_CHANGED;
            case 4:
                return SETTING_ACTION_BUTTON_CLICKED;
            case 5:
                return SETTING_ACTION_SCREEN_CLOSED;
            case 6:
                return SETTING_ACTION_SETTINGS_SAVED;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53683j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53683j);
    }
}
