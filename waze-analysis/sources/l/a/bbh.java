package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bbh implements com.google.v.eg {
    LOCATION_STATUS_UNSPECIFIED(0),
    TO_BE_SET(1),
    TO_BE_EDITED(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53654f;

    bbh(int i2) {
        this.f53654f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53654f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53654f);
    }
}
