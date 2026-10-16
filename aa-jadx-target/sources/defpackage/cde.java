package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class cde extends java.util.concurrent.CancellationException {
    public cde() {
        super("The coroutine was canceled because it left the composition");
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(defpackage.cdf.a);
        return this;
    }
}
