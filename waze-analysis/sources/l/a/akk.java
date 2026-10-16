package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum akk implements com.google.v.eg {
    CONFIDENCE_UNSPECIFIED(0),
    HIGH(1),
    MEDIUM(2),
    LOW(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52601g;

    akk(int i2) {
        this.f52601g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52601g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52601g);
    }
}
