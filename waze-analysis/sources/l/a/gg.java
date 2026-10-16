package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum gg implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    EXISTING_ACCOUNT(1),
    NEW_ACCOUNT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54910f;

    gg(int i2) {
        this.f54910f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54910f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54910f);
    }
}
