package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum gc implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    FORWARD(1),
    NEXT(2),
    RESUME(3),
    COLLAPSE(4),
    PLAY(5),
    REWIND(6),
    SHOW_LIST(7),
    SETTINGS(8),
    PAUSE(9),
    OPEN_PARTNER_APP(10),
    PREVIOUS(11),
    CHANGE_APP(12),
    SHUFFLE(13),
    THUMB_DOWN(14),
    FAVORITE(15),
    SAVE(16),
    REPEAT(17),
    THUMB_UP(18),
    UNRECOGNIZED(-1);

    private final int v;

    gc(int i2) {
        this.v = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
