package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum rr implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    NAIVE_ROUTE(1),
    NAIVE_ROUTE_LABEL(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55376f;

    rr(int i2) {
        this.f55376f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55376f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55376f);
    }
}
