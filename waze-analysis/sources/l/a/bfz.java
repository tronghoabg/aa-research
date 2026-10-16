package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bfz implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    DESTINATION_CARD(1),
    SCROLL(2),
    SEARCH_FIELD(3),
    SUGGESTED_INFO(4),
    VOICE_SEARCH(5),
    DESTINATION_CHIP(6),
    CAROUSEL_SCROLL(7),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f53909k;

    bfz(int i2) {
        this.f53909k = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53909k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53909k);
    }
}
