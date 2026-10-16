package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum beo implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    NAVIGATE(1),
    CHANGE_SOUND_MODE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53820f;

    beo(int i2) {
        this.f53820f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53820f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53820f);
    }
}
