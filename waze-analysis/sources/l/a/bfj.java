package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bfj implements com.google.v.eg {
    SOUND_TYPE_UNSPECIFIED(0),
    GUIDANCE_ANNOUCEMENTS(1),
    NOTIFICATIONS(2),
    OTHER_SOUNDS(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53860g;

    bfj(int i2) {
        this.f53860g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53860g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53860g);
    }
}
