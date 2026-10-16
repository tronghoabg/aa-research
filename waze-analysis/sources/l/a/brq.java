package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum brq implements com.google.v.eg {
    VALIDATION_ANSWER_UNSPECIFIED(0),
    VALIDATION_THUMBS_DOWN(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f54593e;

    brq(int i2) {
        this.f54593e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54593e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54593e);
    }
}
