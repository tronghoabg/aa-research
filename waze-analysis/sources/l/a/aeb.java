package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aeb implements com.google.v.eg {
    CLICK_LOCATION_UNSPECIFIED(0),
    BEFORE_INSIGHT_LOCATION(1),
    AFTER_INSIGHT_LOCATION(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52333f;

    aeb(int i2) {
        this.f52333f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52333f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52333f);
    }
}
