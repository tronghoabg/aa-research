package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ack implements com.google.v.eg {
    IN_CAR_BUTTON_UNSPECIFIED(0),
    IN_CAR_BUTTON_HOME(1),
    IN_CAR_BUTTON_WORK(2),
    IN_CAR_BUTTON_FAVORITES(3),
    IN_CAR_BUTTON_SEARCH(4),
    IN_CAR_BUTTON_VOICE_ASSISTANT(5),
    IN_CAR_BUTTON_SETTINGS(6),
    IN_CAR_BUTTON_RECENTER(7),
    IN_CAR_BUTTON_ALTERNATE_ROUTES(8),
    IN_CAR_BUTTON_SOUNDS(9),
    IN_CAR_BUTTON_REPORT(10),
    IN_CAR_BUTTON_STOP_NAVIGATION(11),
    IN_CAR_BUTTON_PAN(12),
    IN_CAR_BUTTON_ZOOM_IN(13),
    IN_CAR_BUTTON_ZOOM_OUT(14),
    IN_CAR_BUTTON_COMPASS(15),
    UNRECOGNIZED(-1);

    private final int s;

    ack(int i2) {
        this.s = i2;
    }

    public static ack a(int i2) {
        switch (i2) {
            case 0:
                return IN_CAR_BUTTON_UNSPECIFIED;
            case 1:
                return IN_CAR_BUTTON_HOME;
            case 2:
                return IN_CAR_BUTTON_WORK;
            case 3:
                return IN_CAR_BUTTON_FAVORITES;
            case 4:
                return IN_CAR_BUTTON_SEARCH;
            case 5:
                return IN_CAR_BUTTON_VOICE_ASSISTANT;
            case 6:
                return IN_CAR_BUTTON_SETTINGS;
            case 7:
                return IN_CAR_BUTTON_RECENTER;
            case 8:
                return IN_CAR_BUTTON_ALTERNATE_ROUTES;
            case 9:
                return IN_CAR_BUTTON_SOUNDS;
            case 10:
                return IN_CAR_BUTTON_REPORT;
            case 11:
                return IN_CAR_BUTTON_STOP_NAVIGATION;
            case 12:
                return IN_CAR_BUTTON_PAN;
            case 13:
                return IN_CAR_BUTTON_ZOOM_IN;
            case 14:
                return IN_CAR_BUTTON_ZOOM_OUT;
            case 15:
                return IN_CAR_BUTTON_COMPASS;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.s;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }
}
