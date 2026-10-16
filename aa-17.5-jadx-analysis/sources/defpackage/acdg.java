package defpackage;

/* loaded from: classes3.dex */
public enum acdg implements abnz {
    GMM_SERVER_ONLY(1),
    CLEARCUT_SERVICE_ONLY(2),
    DUAL_WRITE(3),
    NON_LOG204_CLEARCUT_ONLY_LOG204_GMM_SERVER_ONLY(4),
    NON_LOG204_CLEARCUT_ONLY_LOG204_DUAL_WRITE(5);

    private final int g;

    acdg(int i) {
        this.g = i;
    }

    public static acdg b(int i) {
        if (i == 1) {
            return GMM_SERVER_ONLY;
        }
        if (i == 2) {
            return CLEARCUT_SERVICE_ONLY;
        }
        if (i == 3) {
            return DUAL_WRITE;
        }
        if (i == 4) {
            return NON_LOG204_CLEARCUT_ONLY_LOG204_GMM_SERVER_ONLY;
        }
        if (i != 5) {
            return null;
        }
        return NON_LOG204_CLEARCUT_ONLY_LOG204_DUAL_WRITE;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
