package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cqw extends java.util.concurrent.CancellationException {
    public cqw(long j) {
        super(defpackage.a.bH(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(defpackage.crr.a);
        return this;
    }
}
