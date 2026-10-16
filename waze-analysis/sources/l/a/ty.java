package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ty implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    BACK(1),
    OPEN_INBOX(2),
    HELP_CENTER(3),
    VERIFICTION_CODE_ENTERED(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f55472h;

    ty(int i2) {
        this.f55472h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55472h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55472h);
    }
}
