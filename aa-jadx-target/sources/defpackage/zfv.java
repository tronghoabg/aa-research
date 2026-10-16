package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum zfv implements defpackage.zfw {
    INSTANCE;

    @Override // defpackage.zfw
    public final j$.time.Instant a() {
        return j$.time.Instant.now();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "TimeSource.system()";
    }
}
