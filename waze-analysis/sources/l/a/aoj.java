package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aoj implements com.google.v.eg {
    NEW_USER_TYPE_UNSPECIFIED(0),
    GUEST(1),
    REGISTERED_GOOGLE(2),
    REGISTERED_EMAIL(3),
    EXISTING_USER(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f52869h;

    aoj(int i2) {
        this.f52869h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52869h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52869h);
    }
}
