package defpackage;

/* loaded from: classes3.dex */
public enum uyg implements abnz {
    GMM_SERVER_ONLY(0),
    CLEARCUT_SERVICE_ONLY(1),
    DUAL_WRITE(2),
    NON_LOG204_CLEARCUT_ONLY_LOG204_GMM_SERVER_ONLY(3),
    NON_LOG204_CLEARCUT_ONLY_LOG204_DUAL_WRITE(4);

    public final int f;

    uyg(int i) {
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
