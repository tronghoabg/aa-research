package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum akl implements com.google.v.eg {
    CONTEXT_UNSPECIFIED(0),
    USER_LOGIN(1),
    APP_WAKE_UP_SYSTEM(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52607f;

    akl(int i2) {
        this.f52607f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52607f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52607f);
    }
}
