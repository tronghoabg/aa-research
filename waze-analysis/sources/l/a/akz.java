package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum akz implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    REGISTERED(1),
    UNREGISTERED(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52653f;

    akz(int i2) {
        this.f52653f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52653f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52653f);
    }
}
