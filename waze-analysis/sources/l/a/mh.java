package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum mh implements com.google.v.eg {
    ERROR_REASON_UNSPECIFIED(0),
    AGENT_ERROR(1),
    RECORDER_ERROR(2),
    AUDIO_SESSION_ERROR(3),
    SOUND_MUTED(4),
    UNKNOWN_ERROR(5),
    AUDIO_SESSION_START_ERROR(6),
    AUDIO_SESSION_RECOVER_ERROR(7),
    LOST_AUDIO_FOCUS(8),
    AUDIO_PLAYER_ERROR(9),
    UNRECOGNIZED(-1);

    private final int m;

    mh(int i2) {
        this.m = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
