package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bar implements com.google.v.eg {
    REQUEST_QUEUE_UNSPECIFIED(0),
    GENERAL(1),
    ROUTING(2),
    BACKGROUND(3),
    REGISTER_USER(4),
    DRIVE_SUGGESTIONS(5),
    GEO_CONFIG(6),
    USERNAME(7),
    ROUTING_UPDATE(8),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    private final int f53638l;

    bar(int i2) {
        this.f53638l = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53638l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53638l);
    }
}
