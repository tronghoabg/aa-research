package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum mu implements com.google.v.eg {
    RESPONSE_TYPE_UNSPECIFIED(0),
    AUDIO(1),
    FUNCTION_RESPONSE(2),
    FIRST_TIME_EXPERIENCE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f55117g;

    mu(int i2) {
        this.f55117g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55117g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55117g);
    }
}
