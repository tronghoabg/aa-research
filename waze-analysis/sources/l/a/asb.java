package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum asb implements com.google.v.eg {
    PROMOTIONAL_CHIP_ACTION_UNSPECIFIED(0),
    CTA(1),
    CLOSE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53111f;

    asb(int i2) {
        this.f53111f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53111f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53111f);
    }
}
