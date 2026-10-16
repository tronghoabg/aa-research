package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum kwt {
    UNAVAILABLE_FEATURE_DISABLED(1),
    UNAVAILABLE_OS_VERSION_TOO_LOW(2),
    UNAVAILABLE_WORK_PROFILE_NOT_DETECTED(3),
    UNAVAILABLE_SYSTEM_SERVICE_MISSING(4),
    UNAVAILABLE_PERMISSION_MISSING(5),
    UNAVAILABLE_WORK_PROFILE_CONNECTION_UNAVAILABLE(6),
    UNAVAILABLE_SETTING_DISABLED(7),
    AVAILABLE(8);

    private final int j;

    kwt(int i2) {
        this.j = i2;
    }

    public final boolean a(defpackage.kwt kwtVar) {
        return this.j >= kwtVar.j;
    }
}
