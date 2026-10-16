package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bes implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    NAVIGATE(1),
    CHANGE_SOUND_MODE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53837f;

    bes(int i2) {
        this.f53837f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53837f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53837f);
    }
}
