package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum abyw implements defpackage.abpb {
    COMPLETION_STYLE_UNKNOWN(0),
    COMPLETION_STYLE_CARD(1),
    COMPLETION_STYLE_TOAST(2),
    UNRECOGNIZED(-1);

    private final int f;

    abyw(int i) {
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
