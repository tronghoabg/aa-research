package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum afz implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    FIREBASE(1),
    WAZE_UNIVERSAL_LINK(2),
    NON_WAZE_UNIVERSAL_LINK(3),
    EXPLICIT_INTENT(4),
    IMPLICIT_INTENT(5),
    DEEP_LINK(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f52424j;

    afz(int i2) {
        this.f52424j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52424j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52424j);
    }
}
