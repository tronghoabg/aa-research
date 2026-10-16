package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum axl implements com.google.v.eg {
    FROM_LOCATION_UNSPECIFIED(0),
    CURRENT(1),
    CHANGED(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53399f;

    axl(int i2) {
        this.f53399f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53399f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53399f);
    }
}
