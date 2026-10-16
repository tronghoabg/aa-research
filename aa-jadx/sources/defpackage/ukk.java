package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ukk implements defpackage.abpb {
    WINDING_DEFAULT(0),
    WINDING_NON_ZERO(1);

    public static final defpackage.abpc c = new defpackage.uki(2);
    private final int e;

    ukk(int i) {
        this.e = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
