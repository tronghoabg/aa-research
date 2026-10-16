package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum uzc implements defpackage.abpb {
    GMM_SERVER_ONLY(0),
    CLEARCUT_SERVICE_ONLY(1),
    DUAL_WRITE(2),
    NON_LOG204_CLEARCUT_ONLY_LOG204_GMM_SERVER_ONLY(3),
    NON_LOG204_CLEARCUT_ONLY_LOG204_DUAL_WRITE(4);

    public final int f;

    uzc(int i) {
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
