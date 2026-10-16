package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum qof implements defpackage.abpb {
    UNKNOWN(0),
    STARTUP(1),
    TELEDOCTOR(2),
    UNRECOGNIZED(-1);

    private final int f;

    qof(int i) {
        this.f = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.abpk.b() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
