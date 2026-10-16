package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum og implements com.google.v.eg {
    FAILURE_REASON_UNSPECIFIED(0),
    CLIENT_ERROR(1),
    BACKEND_ERROR(2),
    BACKEND_CANCELLED_PER_USER_MESSAGE(3),
    USER_SELECTED_REPORT_MANUALLY(4),
    USER_EXPANDED_MENU(5),
    USER_DISMISSED(6),
    NO_RESPONSE_FROM_SERVER(7),
    SPEECH_TO_TEXT_FAILURE(8),
    TEXT_TO_SPEECH_FAILURE(9),
    NO_SPEECH_RECOGNIZED(10),
    SOUND_MUTED(11),
    PERMISSION_DENIED(12),
    RECORDING_INPUT_BUSY(13),
    MAX_LIMIT_MESSAGES(14),
    EMPTY_TEXT_FAILURE(15),
    UNRECOGNIZED(-1);

    private final int s;

    og(int i2) {
        this.s = i2;
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
