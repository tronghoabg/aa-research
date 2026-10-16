package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum yys implements defpackage.abpb {
    UNKNOWN_DELEGATE_TYPE(0),
    NONE(1),
    GMS_CAR_CONNECTIONLESS(2),
    ESCAPE_POD_Q(3),
    ESCAPE_POD_R(4);

    public final int f;

    yys(int i) {
        this.f = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
