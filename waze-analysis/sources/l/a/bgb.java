package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bgb implements com.google.v.eg {
    CLICK_TYPE_UNSPECIFIED(0),
    CLICK(1),
    LONG_PRESS(2),
    OPTIONS_FROM_SWIPE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53916g;

    bgb(int i2) {
        this.f53916g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53916g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53916g);
    }
}
