package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum avw implements com.google.v.eg {
    STATUS_UNKNOWN(0),
    SUCCESS(1),
    FAILURE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53276f;

    avw(int i2) {
        this.f53276f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53276f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53276f);
    }
}
