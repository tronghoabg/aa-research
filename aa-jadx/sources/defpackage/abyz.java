package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum abyz implements defpackage.abpb {
    PROMPT_STYLE_UNKNOWN(0),
    PROMPT_STYLE_FIRST_CARD_NON_MODAL(1),
    PROMPT_STYLE_FIRST_CARD_MODAL(2),
    UNRECOGNIZED(-1);

    private final int f;

    abyz(int i) {
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
