package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bsq implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    BACK(1),
    GET_STARTED(2),
    LOGIN(3),
    PRIVACY_POLICY(4),
    TERMS_OF_SERVICE(5),
    CLICK(6),
    SWIPE(7),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f54642k;

    bsq(int i2) {
        this.f54642k = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54642k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54642k);
    }
}
