package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum to implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CONTACT_SUPPORT(1),
    PICK_ACCOUNT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55458f;

    to(int i2) {
        this.f55458f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55458f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55458f);
    }
}
