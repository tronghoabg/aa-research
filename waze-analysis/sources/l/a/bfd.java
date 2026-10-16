package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bfd implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ALERTS_ONLY(1),
    CLOSE(2),
    LISTENING_WITH(3),
    SOUNDS_OFF(4),
    SOUNDS_ON(5),
    VOICE_DIRECTIONS(6),
    LESS_CHATTY_INSTRUCTIONS(7),
    SMART_GUIDANCE_INSTRUCTIONS(8),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    private final int f53853l;

    bfd(int i2) {
        this.f53853l = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53853l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53853l);
    }
}
