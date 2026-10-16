package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bsf implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CANCEL(1),
    CONFIRM(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54625f;

    bsf(int i2) {
        this.f54625f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54625f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54625f);
    }
}
