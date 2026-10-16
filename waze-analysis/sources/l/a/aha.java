package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aha implements com.google.v.eg {
    LOCATION_SOURCE_UNSPECIFIED(0),
    LOCATION_SOURCE_MOBILE(1),
    LOCATION_SOURCE_EXTERNAL(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52497f;

    aha(int i2) {
        this.f52497f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52497f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52497f);
    }
}
