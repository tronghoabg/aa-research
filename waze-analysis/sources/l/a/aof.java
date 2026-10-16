package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aof implements com.google.v.eg {
    ONBOARDING_COMPLETED_CONTEXT_UNSPECIFIED(0),
    GUEST(1),
    NEW_ACCOUNT(2),
    EXISTING_USER(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52853g;

    aof(int i2) {
        this.f52853g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52853g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52853g);
    }
}
