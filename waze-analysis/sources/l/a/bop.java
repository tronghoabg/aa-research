package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bop implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CONFIRM(1),
    EDIT_BIRTHDATE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54436f;

    bop(int i2) {
        this.f54436f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54436f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54436f);
    }
}
