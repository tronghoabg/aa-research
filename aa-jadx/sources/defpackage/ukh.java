package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ukh implements defpackage.abpb {
    DEFAULT_LABEL_DRAW_ORDER(0),
    CLIENT_INJECTED_LABELS(1),
    CLIENT_INJECTED_LABELS_ABOVE_CALLOUTS(2);

    public static final defpackage.abpc d = new defpackage.uki(1);
    private final int f;

    ukh(int i) {
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
