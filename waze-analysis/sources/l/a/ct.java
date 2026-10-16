package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ct implements com.google.v.eg {
    TITLE_UNSPECIFIED(0),
    HIDDEN_CURRENT_DRIVE(1),
    THANKS_FOR_FEEDBACK(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54737f;

    ct(int i2) {
        this.f54737f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54737f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54737f);
    }
}
