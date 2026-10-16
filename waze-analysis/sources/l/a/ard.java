package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ard implements com.google.v.eg {
    RENDERER_TYPE_UNSPECIFIED(0),
    LEGACY_RENDERER(1),
    GODOT_RENDERER(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53060f;

    ard(int i2) {
        this.f53060f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53060f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53060f);
    }
}
