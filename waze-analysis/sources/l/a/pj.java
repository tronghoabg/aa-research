package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum pj implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    SAVE_VOICE(1),
    RECORD_INSTRUCTION(2),
    PLAY_RECORDING(3),
    EDIT_VOICE_NAME(4),
    DELETE_RECORDING(5),
    SELECT_FALLBACK(6),
    DELETE_ALL_RECORDINGS(7),
    BACK(8),
    DELETE_VOICE(9),
    UNRECOGNIZED(-1);

    private final int m;

    pj(int i2) {
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
