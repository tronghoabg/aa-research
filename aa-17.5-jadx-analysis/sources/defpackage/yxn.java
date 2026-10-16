package defpackage;

/* loaded from: classes.dex */
public enum yxn implements abnz {
    UNKNOWN_DELEGATE_TYPE(0),
    NONE(1),
    GMS_CAR_CONNECTIONLESS(2),
    ESCAPE_POD_Q(3),
    ESCAPE_POD_R(4);

    public final int f;

    yxn(int i) {
        this.f = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
