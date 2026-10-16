package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum yl implements com.google.v.eg {
    GENERIC_SETTING_ACTION_UNSPECIFIED(0),
    SETTING_ACTION_VIEW(1),
    SETTING_ACTION_BACK(2),
    SETTING_ACTION_CHANGE(3),
    SETTING_ACTION_CLICK(4),
    SETTING_ACTION_CLOSE(5),
    SETTING_ACTION_SAVE(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f55681j;

    yl(int i2) {
        this.f55681j = i2;
    }

    public static yl a(int i2) {
        switch (i2) {
            case 0:
                return GENERIC_SETTING_ACTION_UNSPECIFIED;
            case 1:
                return SETTING_ACTION_VIEW;
            case 2:
                return SETTING_ACTION_BACK;
            case 3:
                return SETTING_ACTION_CHANGE;
            case 4:
                return SETTING_ACTION_CLICK;
            case 5:
                return SETTING_ACTION_CLOSE;
            case 6:
                return SETTING_ACTION_SAVE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55681j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55681j);
    }
}
