package defpackage;

/* loaded from: classes3.dex */
public enum ujm implements abnz {
    DEFAULT_LABEL_DRAW_ORDER(0),
    CLIENT_INJECTED_LABELS(1),
    CLIENT_INJECTED_LABELS_ABOVE_CALLOUTS(2);

    public static final aboa d = new ujn(1);
    private final int f;

    ujm(int i) {
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
