package defpackage;

/* loaded from: classes3.dex */
public enum ujp implements abnz {
    WINDING_DEFAULT(0),
    WINDING_NON_ZERO(1);

    public static final aboa c = new ujn(2);
    private final int e;

    ujp(int i) {
        this.e = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
